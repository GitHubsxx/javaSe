package sxx.fifter;


/*
 * ������
 */
public class Main {
	public static void main(String[] args) {
		String msg = "<script>��:)����ɵ�ƣ�����";
		//String str = new ProcessMsg().Process(msg);
		FilterChain ch = new FilterChain();
		ch.addFilter(new HtmlFilter())
					.addFilter(new SensitiveWordsFilter());
		FilterChain ch1 = new FilterChain();
		ch1.addFilter(new FaceFilter());
		
		ch.addFilter(ch1);
		
		String str = ch.doFilter(msg);
		System.out.println(str);
	}
}
