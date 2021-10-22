package week3.day2.assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set <Integer> arrList= new LinkedHashSet<Integer>();
		for (int i=0;i<arr.length;i++)
		{
		
			if(!arrList.add(arr[i]))
			{
				System.out.println(arr[i]);
			}
				
		}
		
		

	}

}
