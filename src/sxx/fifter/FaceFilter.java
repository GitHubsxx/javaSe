package sxx.fifter;


/*
 * ���˱���
 */
public class FaceFilter implements Filter{
	String msg;
	@Override
	public String doFilter(String str) {
		msg = str.replace(":)", "����");
		
		return msg;
	}

}
