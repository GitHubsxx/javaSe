package sxx.proxy.proxyTemp.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import sxx.proxy.proxyTemp.InvocationHandler;

/*
 * author:sxx
 * ģ��AOP �������
 */
public class TransactionHandler implements InvocationHandler{
	private Object target;//������Ķ���
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
