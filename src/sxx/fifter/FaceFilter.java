package sxx.fifter;


/*
 * ¹ıÂË±íÇé
 */
public class FaceFilter implements Filter{
	String msg;
	@Override
	public String doFilter(String str) {
		msg = str.replace(":)", "¹ş¹ş");
		
		return msg;
	}

}
