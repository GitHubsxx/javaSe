package sxx.proxy;
/*
 * ���޸�Դ�룬ͳ��tank�������е�ʱ��(������)
 * 1.�̳�
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
