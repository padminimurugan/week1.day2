package week1.day2;

import java.util.Arrays;

public class Arrays1FindSecondlargest {
	


	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};
		
       //Sort array
		Arrays.sort(data);
		
		//Find second largest number
		int length = data.length;
		System.out.println(data[data.length-2]);
	}	
		
}
	
