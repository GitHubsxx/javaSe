package sxx.fifter;


/*
 * author:sxx
 * �����ֹ���
 */
public class SensitiveWordsFilter implements Filter{
	String msg;

	@Override
	public String doFilter(String str) {
		this.msg=str;
		msg.replace("��ɵ��","����");
		return msg;
	}
	
}
