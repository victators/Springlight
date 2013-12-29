import java.util.*;

class CarTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int f;
		int s;
		Double g;
		System.out.println("New car odometer reading: ");
		f = scan.nextInt();
		System.out.println();
		Car car = new Car(f);
		boolean done = false;
		while (!done) {
			System.out.println("Filling Station Visit");
			System.out.println("odometer reading");
			s = scan.nextInt();
			System.out.println("gallons to fill tank");
			g = scan.nextDouble();
			if (g == 0)
			{
				done = true;
				System.out.println("Broke!");
				continue;
			}
			car.fillUp(s, g);
			System.out.println("Miles per gallon is " + car.calculateMPG());
			if (car.gasHog()) {
				System.out.println("Gas Hog!");
			}
			if (car.economyCar()) {
				System.out.println("Economy Car!");
			}
			System.out.println();
		}

	}
}
