package sxx.factory.springFactory;

import java.io.IOException;
import java.util.Properties;

public class Test {
	public static void main(String[] args) throws IOException, Exception {
		/*
		 * 1.�Ѷ�����������ļ����棬�Ͳ����ڴ�������д��
		 * 2.��Ϊ��spring.properties������sourcePath��src���£������ᵽbinĿ¼�£�Ҳ������Ŀ��classPath�£�
		 * 3.javac��������������ʶjava�ļ�Ҳ��ʶclass�ļ���java���������ֻ��ʶclass�ļ�
		 * 4.վ��������ĽǶȣ��õ���ǰ���class�������õ�װ�������Ǹ�װ��������������·����src���¶�ȡ�����ļ�
		 * 5.������װ��Properties���������ݼ�ֵ��ȡ����Ӧ��ֵ
		 * 6.��Ϊȡ����ֵ��һ���ַ������Ե����÷��乹����һ������
		 * 7.�������ת�ͳɽӿڣ�Ȼ������䷽��
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
