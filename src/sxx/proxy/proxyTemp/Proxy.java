package sxx.proxy.proxyTemp;



import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;
/*
 * 对接口（infce）里面的方法做什么样的处理，所以得传一个InvocationHandler
 * 
 */
public class Proxy {
	public static Object newProxyInstance(Class infce, InvocationHandler h) throws Exception { //JDK6 Complier API, CGLib, ASM
		String methodStr = "";
		String rt = "\r\n";
		
		Method[] methods = infce.getMethods();
		/*
		for(Method m : methods) {
			methodStr += "@Override" + rt + 
						 "public void " + m.getName() + "() {" + rt +
						 	"   long start = System.currentTimeMillis();" + rt +
							"   System.out.println(\"starttime:\" + start);" + rt +
							"   t." + m.getName() + "();" + rt +
							"   long end = System.currentTimeMillis();" + rt +
							"   System.out.println(\"time:\" + (end-start));" + rt +
						 "}";
		}
		*/
		for(Method m : methods) {
			methodStr += "@Override" + rt + 
						 "public void " + m.getName() + "() {" + rt +
						 "    try {" + rt +
						 "    Method md = " + infce.getName() + ".class.getMethod(\"" + m.getName() + "\");" + rt +
						 "    h.invoke(this, md);" + rt +
						 "    }catch(Exception e) {e.printStackTrace();}" + rt +
						
						 "}";
		}
		
		String src = 
			"package sxx.proxy.proxyTemp;" +  rt +
			"import java.lang.reflect.Method;" + rt +
			"public class $Proxy1 implements " + infce.getName() + "{" + rt +
			"    public $Proxy1(InvocationHandler h) {" + rt +
			"        this.h = h;" + rt +
			"    }" + rt +
			
			
			"    sxx.proxy.proxyTemp.InvocationHandler h;" + rt +
							
			methodStr +
			"}";
		String fileName = System.getProperty("user.dir")+
			"/src/sxx/proxy/proxyTemp/$Proxy1.java";
		System.out.print(fileName);
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		
		//compile
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(fileName);
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		t.call();
		fileMgr.close();
		
		//load into memory and create an instance
		URL[] urls = new URL[] {new URL("file:/" + System.getProperty("user.dir")+"/src")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("sxx.proxy.proxyTemp.$Proxy1");
		System.out.println(c);
		
		Constructor ctr = c.getConstructor(InvocationHandler.class);
		Object m = ctr.newInstance(h);
		//m.move();

		return m;
	}
}
