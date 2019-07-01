package sxx.fifter;


/*
 * author:sxx
 * HTML±êÇ©¹ıÂË
 */
public class HtmlFilter implements Filter{
	String msg;

	@Override
	public String doFilter(String str) {
		this.msg=str;
		msg.replace("<", "[").replace(">", "]");
		return msg;
	}

}
