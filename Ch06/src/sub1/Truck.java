package sub1;

public class Truck extends Car {

	public Truck(String name, String color, int speed) {
		super(name, color, speed);
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed;
	}

	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
	}

}
