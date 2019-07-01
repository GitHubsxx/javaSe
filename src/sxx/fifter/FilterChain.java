package sxx.fifter;

import java.util.ArrayList;
import java.util.List;

/*
 * ���˹���������װ��һ�ѵ�filter��
 * ������
 */
public class FilterChain implements Filter{
	List<Filter> list = new ArrayList<>();
	
	//����this ����ʵ������ʽ���
	public FilterChain addFilter(Filter f){
		this.list.add(f);
		return this;
	}
	
	public String doFilter(String msg) {
		String result = null;
		for(Filter f : list){
			String str = f.doFilter(msg);
			result=str;
		}
		return result;
	}
}
