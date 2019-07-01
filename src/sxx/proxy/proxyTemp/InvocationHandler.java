package sxx.proxy.proxyTemp;


/*
 * 方法调用处理器
 * 传一个方法进来，对你进行相应的处理
 * 写一个方法，把目标方法包装起来，可以在目标方法调用之前和之后做处理
 * 非静态方法，只有当前对象才能调用其方法，所以得传个Object
 */
import java.lang.reflect.Method;

public interface InvocationHandler {
	public void invoke(Object o, Method m);
}
