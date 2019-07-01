package sxx.proxy;
/*
 * ���޸�Դ�룬ͳ��tank�������е�ʱ��(������)
 * 2.�ۺ�(������ֻ��Ҫʵ������ӿڣ���������ӿڵ�ʵ���༴��)
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
