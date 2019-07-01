package sxx.fifter;

import java.util.ArrayList;
import java.util.List;

/*
 * 过滤规则链（封装了一堆的filter）
 * 责任链
 */
public class FilterChain implements Filter{
	List<Filter> list = new ArrayList<>();
	
	//返回this 可以实现链条式添加
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
