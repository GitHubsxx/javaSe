package sxx.proxy;
/*
 * 不修改源码，统计tank方法运行的时间(代理类)
 * 1.继承
 */
public class TankTimeProxy extends Tank{

	@Override
	public void move() {
		long start = System.currentTimeMillis();
		super.move();
		long end = System.currentTimeMillis();
		System.out.print("Tank running Time :"+(end-start));
	}

}
