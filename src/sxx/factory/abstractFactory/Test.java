package sxx.factory.abstractFactory;

public class Test {
	public static void main(String[] args) {
		VehicleFactory v = new BroomFactory();
		Moveable m = v.create();
		m.run();
	}

}
