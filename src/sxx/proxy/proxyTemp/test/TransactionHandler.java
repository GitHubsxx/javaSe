package sxx.proxy.proxyTemp.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import sxx.proxy.proxyTemp.InvocationHandler;

/*
 * author:sxx
 * 模拟AOP 事务控制
 */
public class TransactionHandler implements InvocationHandler{
	private Object target;//被代理的对象
	public TransactionHandler(Object target) {
		this.target=target;
	}
	@Override
	public void invoke(Object o, Method m) {
		System.out.print("Transaction is beginning.....");
		try {
			m.invoke(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print("Transaction is committing....");
	}

}
