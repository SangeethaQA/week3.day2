package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	/*Declare a String as PayPal India

	1.Convert it into a character array

	2.Declare a Set as charSet for Character

	3.Declare a Set as dupCharSet for duplicate Character

	4.Iterate character array and add it into charSet

	5.If the character is already in the charSet then, add it to the dupCharSet

	6.Check the dupCharSet elements and remove those in the charSet

	7.Iterate using charSet

	8.Check the iterator variable isn't equals to an empty space

	9.print it*/
	
public static void main (String[]args)
{
	String s ="PayPal India";
	char[] ch = s.toCharArray() ;
	
	Set <Character> charSet = new LinkedHashSet<Character>();
	Set <Character> dupCharSet = new LinkedHashSet<Character>();
	
	for (int i=0;i<ch.length;i++)
	{
		if(!charSet.add(ch[i]))
		{
			dupCharSet.add(ch[i]);
			
			
		}
	}
	System.out.println("Duplicate elements :" +dupCharSet);
	System.out.println("Character Set" +charSet);

	for (Character characters : charSet) {
		if (characters != ' ') {
			System.out.println(characters);
		}
		
	
	}
	
}

}


