import java.util.*;

class PhoneBookTester {
	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		Scanner scan = new Scanner(System.in);
		boolean ok = false;
		String s1;
		String s2;
		String p;
		while (!ok) {
			System.out.println("Search (S), Add (A), Delete (D) or Quit (Q): ");
			String act = scan.nextLine();
			switch (act.charAt(0)) {
			case 'S':
				System.out.print("Last Name?");
				s1 = scan.nextLine().trim();
				System.out.print("First Name?");
				s2 = scan.nextLine().trim();
				if (s2.equals("")) {
					pb.search(s1);
					System.out.println();
				} else {
					PhoneEntry entry = pb.search(s2, s1);
					if (entry != null)
						System.out.println("The number is" + ": " + entry.phone
								+ "\n");
					else
						System.out.println("Name not found.\n");
				}
			case 'A':
				System.out.print("Last Name?");
				s1 = scan.nextLine().trim();
				System.out.print("First Name?");
				s2 = scan.nextLine().trim();
				System.out.print("Phone number?");
				p = scan.nextLine().trim();
				for (int i = 0; i < pb.getLength(); i++)
				{
					
				}
			case 'D':
				System.out.print("Last Name?");
				s1 = scan.nextLine().trim();
				System.out.print("First Name?");
				s2 = scan.nextLine().trim();
				System.out.print("Phone number?");
				p = scan.nextLine().trim();
			case 'Q':
				System.out.println("Good-bye");
				ok = true;
				continue;
			default:
				System.out
						.println("Enter S, A, D or Q how hard can that be...");
			}
		}
	}
}
