package sxx.factory.dom4jFactory;

public class Test {
public static void main(String[] args) throws Exception{
	BeanFactory bean = new CreateBean();
	Moveable mo = (Moveable) bean.getBean("sxx");
	mo.run();
}
}
