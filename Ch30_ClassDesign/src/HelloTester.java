import java.util.Scanner;

class HelloTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String g;
		System.out.println("Enter Greeting: ");
		g = scan.nextLine();
		HelloObject potato = new HelloObject(g);
		HelloObject p = new HelloObject(potato);
		p.speak();
	}
}
