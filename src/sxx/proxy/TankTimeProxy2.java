package sxx.proxy;
/*
 * 不修改源码，统计tank方法运行的时间(代理类)
 * 2.聚合(更加灵活，只需要实现这个接口，传入这个接口的实现类即可)
 */
public class TankTimeProxy2 implements Moveable{
	private Moveable t;
	
	TankTimeProxy2(Moveable t){
		super();
		this.t=t;
	}
	@Override
	public void move() {
		long start = System.currentTimeMillis();
		t.move();
		long end = System.currentTimeMillis();
		System.out.print("Tank running Time :"+(end-start));
		
	}

}
