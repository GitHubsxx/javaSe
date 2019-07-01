package sxx.factory.dom4jFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class CreateBean extends BeanFactory{
	private Map<String,Object> map = new HashMap();
	/*
	 * 1.读取xml 构造dom树
	 * 2.得到根节点
	 * 3.遍历根节点，得到子节点
	 * 4.获得子节点属性的值
	 * 5.根据字符串，反射构建对象
	 */
	void readXml() throws Exception{
		SAXReader read = new SAXReader();
		try {
			Document doc = read.read(CreateBean.class.getClassLoader()
					.getResourceAsStream("sxx/factory/dom4jFactory/spring.xml"));
			Element ele = doc.getRootElement();
			Iterator<Element> it = ele.elementIterator();
			while(it.hasNext()){
				Element e = it.next();
				String className = e.attribute("class").getValue();
				Object o = Class.forName(className).newInstance();
				map.put(e.attributeValue("id"), o);
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	@Override
	Object getBean(String id) {
		try {
			readXml();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(map !=null){
			return map.get(id);
		}
		return null;
	}

}
