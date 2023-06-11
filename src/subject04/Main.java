package subject04;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Sonata();
		Vehicle vehicle2 = new Morning();
		// vehicle1.run();
		
		Driver driver = new Driver();
		driver.method(vehicle1);
		driver.method(vehicle2);
	}

}
