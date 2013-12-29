import java.io.*;
import java.util.*;

class Exercise6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		boolean ok = false;
		while (!ok)
		{
			System.out.println("Enter your password: ");
			s = scan.nextLine();
			if (s.length() < 7)
			{
				System.out.println("That password is not acceptable. \n");
				continue;
			}
			else if (s.equals(s.toLowerCase()) || s.equals(s.toUpperCase()))
			{
				System.out.println("That password is not acceptable. \n");
				continue;
			}
			for (int i = 0; i < 10; i++)
			{
				if(s.indexOf(i + "") != -1)
				{
					System.out.println("Acceptable password.");
					ok = true;
					break;
				}
				if (i == 9)
				{
					System.out.println("The password is not acceptable. \n");	
				}
			}
		}
	}
}
