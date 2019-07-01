package sxx.fifter;


/*
 * author:sxx
 * ¥¶¿Ì√Ù∏–¥ 
 */
public class ProcessMsg {
	String msg;
	Filter[] filter = {new HtmlFilter(),new SensitiveWordsFilter()};
	
	public String Process(String msg) {
		
		for(Filter f : filter){
			String str = f.doFilter(msg);
			msg=str;
		}
		return msg;
	}
}
