import java.io.*;
import java.util.*;

public class Exercise2 {
	 public static void main(String[] args) throws IOException {
		 Scanner scan = new Scanner(System.in);
	     String inChars;
	     System.out.println("Enter a sentence: ");
	     inChars = scan.nextLine();
	     StringBuffer buff = new StringBuffer(inChars);
	     int place = 0;
	     while (place < buff.length())
	     {
	    	 int p = inChars.indexOf(" ", place);
	    	 if (p == -1 && place == 0)
	    	 {
	    		 buff.reverse();
	    		 place = buff.length();
	    		 continue;
	    	 }
	    	 else if (p == -1)
	    	 {
	    		 p = inChars.indexOf(".");
	    	 }
	    	 buff.delete(place,p);
	    	 StringBuffer temp = new StringBuffer(inChars.substring(place,p));
	    	 char t = temp.charAt(temp.length()-1);
	    	 if (!(Character.isLetter(t)))
	    	 {
	    		 temp.deleteCharAt(temp.length()-1);
	    		 temp.reverse();
	    		 temp.append(t);
	    		 buff.insert(place, temp);
	    		 place = p+1;
	    		 continue;
	    	 }
	    	 buff.insert(place, temp.reverse());
	    	 place = p+1;
	     }
	     System.out.println(buff.toString());
	 }
}
