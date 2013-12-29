import java.io.*;
import java.util.*;

class Exercise1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inChars;
		Jam goose = new Jam("Gooseberry", "7/4/86", 12);
		Jam apple = new Jam("Crab Apple", "9/30/99", 8);
		Jam rhub = new Jam("Rhubarb", "10/31/99", 16);
		System.out.println("Welcome to Mother Hubbard's Pantry!");
		int s = 0;
		int amt = 0;
		while (s != -1) {
			System.out.println();
			System.out.println("The jams are:");
			Pantry hubbard = new Pantry(goose, apple, rhub);
			hubbard.print();
			System.out.println("Enter your selection (1, 2, or 3): ");
			s = scan.nextInt();
			switch (s) {
			case -1:
				System.out.println("Good-by");
				break;
			case 1:
				System.out.println("Enter amount to spread: ");
				amt = scan.nextInt();
				goose.spread(amt);
				break;
			case 2:
				System.out.println("Enter amount to spread: ");
				amt = scan.nextInt();
				apple.spread(amt);
				break;
			case 3:
				System.out.println("Enter amount to spread: ");
				amt = scan.nextInt();
				rhub.spread(amt);
				break;
			default:
				System.out
						.println("Goddamnit enter 1, 2, 3 or -1 how hard can that be numbnuts");
			}
		}
	}
}
