package sxx.factory.abstractFactory;

public class CarFactory extends VehicleFactory{

	@Override
	Moveable create() {
		return new Car();
	}

}
