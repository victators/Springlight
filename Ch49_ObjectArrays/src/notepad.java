import java.io.*;
import java.util.*;

class notepad {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		System.out.println("Oh na na what's your name: ");
		s = scan.nextLine().trim();
		int i = s.indexOf(" ");
		System.out.println(s.substring(0,i).concat(s.substring(i).toUpperCase()));
	}
}