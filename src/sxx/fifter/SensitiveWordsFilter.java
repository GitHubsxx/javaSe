package sxx.fifter;


/*
 * author:sxx
 * 敏感字过滤
 */
public class SensitiveWordsFilter implements Filter{
	String msg;

	@Override
	public String doFilter(String str) {
		this.msg=str;
		msg.replace("大傻逼","好人");
		return msg;
	}
	
}
