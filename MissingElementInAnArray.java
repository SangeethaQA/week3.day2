package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,7,6,8};
		List <Integer> arrList =new ArrayList<Integer> ();
		for (int i=0;i<arr.length;i++)
		{
			arrList.add(arr[i]);
		}
		Collections.sort(arrList);
		System.out.println(arrList);
		for (int j=0;j<arr.length;j++)
		{
			if(j+1!=arrList.get(j))
			{
				System.out.println("Missing Element in an array"+(j+1));
				break;
				
			
			}
			
		}
		
		

	}

}
