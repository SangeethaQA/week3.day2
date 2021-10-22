package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		int [] i = {3,2,11,4,6,7};
		int [] j= {1,2,8,4,9,7};
		Set <Integer> arr1= new LinkedHashSet <Integer>();
		for (Integer arr2:i)
		{
		arr1.add(arr2);
		}
	
		
		for (int z=0;z<j.length;z++)
		{
			if (arr1.contains(j[z]))
				System.out.println("Match Items"+j[z] );
		}
		

	}

}
