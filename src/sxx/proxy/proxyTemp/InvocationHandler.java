package sxx.proxy.proxyTemp;


/*
 * �������ô�����
 * ��һ���������������������Ӧ�Ĵ���
 * дһ����������Ŀ�귽����װ������������Ŀ�귽������֮ǰ��֮��������
 * �Ǿ�̬������ֻ�е�ǰ������ܵ����䷽�������Եô���Object
 */
import java.lang.reflect.Method;

public interface InvocationHandler {
	public void invoke(Object o, Method m);
}
