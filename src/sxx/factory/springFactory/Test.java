package sxx.factory.springFactory;

import java.io.IOException;
import java.util.Properties;

public class Test {
	public static void main(String[] args) throws IOException, Exception {
		/*
		 * 1.把对象放在配置文件里面，就不用在代码里面写死
		 * 2.因为把spring.properties放在了sourcePath（src）下，编译后会到bin目录下（也就是项目的classPath下）
		 * 3.javac（编译器）即认识java文件也认识class文件，java（虚拟机）只认识class文件
		 * 4.站在虚拟机的角度，拿到当前类的class对象，再拿到装载它的那个装载器。用流在类路径（src）下读取配置文件
		 * 5.把流封装成Properties对象。最后根据键值对取出相应的值
		 * 6.因为取出的值是一个字符串所以得利用反射构建成一个对象
		 * 7.最后向上转型成接口，然后调用其方法
		 * 
		 */
		Properties pro = new Properties();
		pro.load(Test.class.getClassLoader()
				.getResourceAsStream("sxx/factory/springFactory/spring.properties"));
		String beanName = pro.getProperty("beanName");
		System.out.print(beanName+"\n");
		Class<Moveable> car = (Class<Moveable>) Class.forName(beanName);
		Moveable m = car.newInstance();
		m.run();
	}
}
