import java.io.*;
import java.util.*;

class notepad {
	public static void main(String[] args) {
		String lineIn;

		char mander;
		Scanner scan = new Scanner(System.in);
		int consonantCount = 0;
		int vowelCount = 0;
		int punctuationCount = 0;
		int whitespaceCount = 0;
		String consonant = "bcdfghjklmnpqrstvwyzBCDFGHJKLMNPQRSTVWYZ";
		String vowel = "aeiouAEIOU";
		String punctuation = ".,:;!?";

		System.out.print("Yo yo yo lemme know wsup: ");
		lineIn = scan.nextLine();

		for (int i = 0; i < lineIn.length(); i++) {
			mander = lineIn.charAt(i); // get the next character
			if (consonant.indexOf(mander) != -1)
			{
				mander = 'C';
			}
			else if (vowel.indexOf(mander) != -1)
			{
				mander = 'V';
			}
			else if (punctuation.indexOf(mander) != -1)
			{
				mander = 'P';
			}

			switch (mander) {
			case 'C':
				consonantCount++;
				break;

			case 'V':
				vowelCount++;
				break;

			case 'P':
				punctuationCount++;
				break;

			case ' ':
				whitespaceCount++;
				break;

			default:
				System.out.println("English plz");

			}
		}

		System.out.println("Number of consonants: " + consonantCount);
		System.out.println("Number of vowels: " + vowelCount);
		System.out.println("Number of punctuations " + punctuationCount);
		System.out.println("Number of whitespaces: " + whitespaceCount);
	}
}
