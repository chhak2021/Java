package sub07;


interface IRunnable {
    public void run();
}

interface IFlyable {
    public void fly();
}

class FlyingCar implements IRunnable, IFlyable {
	@Override
	public void fly() {
		System.out.println("Car fly!");
	}

	@Override
	public void run() {
		System.out.println("Car run!");		
	}
}
public class Test08 {
	public static void main(String[] args) {
		FlyingCar car = new FlyingCar();
        car.run();
        car.fly();       
	}
}
