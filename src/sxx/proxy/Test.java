package sxx.proxy;

public class Test {
	public static void main(String[] args) {
		//Moveable t = new Tank();
		//Moveable t = new TankTimeProxy();
		Moveable t = new TankTimeProxy2(new Tank());
		//t.move();
		System.out.print(System.getProperty("user.dir", null));
	}
}
