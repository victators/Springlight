import java.util.*;

class PantryTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inChars;
		Jam goose = new Jam("Gooseberry", "7/4/86", 12);
		Jam apple = new Jam("Crab Apple", "9/30/99", 8);
		Jam rhub = new Jam("Rhubarb", "10/31/99", 3);
		Pantry hubbard = new Pantry(goose, apple, rhub);
		System.out.println("Welcome to Mother Hubbard's Pantry!");
		boolean ok = false;
		int s = 0;
		int amt = 0;
		while (!ok) {
			System.out.println();
			System.out.println("The jams are:");
			hubbard.print();
			System.out.println("Enter your selection (1, 2, or 3): ");
			s = scan.nextInt();
			hubbard.select(s);
			if (s == -1) {
				System.out.println("Good-by");
				ok = true;
				continue;
			}
			System.out.println("Enter amount to spread: ");
			amt = scan.nextInt();
			hubbard.spread(amt);
		}
	}
}
