package week3.day2.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesUsingSet {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] str= text.split(" ");
		//System.out.println("String without Duplicates"+str);
		
		//Set <String> str1= new HashSet<String>();
		 List<String> repeatedWords = new ArrayList<String>();
	      /* Declare HashSet of String that will 
	      contain unique words */
	      Set<String> uniqueWords = new LinkedHashSet<String>();
	      for(String str1 : str)
	      {
	          if (uniqueWords.add(str1))
	            repeatedWords.add(str1);
	      }
	      System.out.println(uniqueWords);
	    }
		


	}


