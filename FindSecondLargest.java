package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {3,2,11,4,6,7};
		List <Integer> arrList= new ArrayList<Integer>();
		for(int i=0;i<data.length;i++)
		{
			arrList.add(data[i]);
		}
		System.out.println("Before Sorting " +arrList);
		Collections.sort(arrList);
		System.out.println("After Sorting"+arrList);
		System.out.println(arrList.size());
		System.out.println("Second Largest "+ (arrList.get(4)));

	}

}
