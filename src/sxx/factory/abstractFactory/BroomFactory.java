package sxx.factory.abstractFactory;

public class BroomFactory extends VehicleFactory{

	@Override
	Moveable create() {
		return new Broom();
	}

}
