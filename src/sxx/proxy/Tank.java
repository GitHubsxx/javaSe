package sxx.proxy;

import java.util.Random;

public class Tank implements Moveable{

	@Override
	public void move() {
		System.out.print("Tank is Running---------");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
