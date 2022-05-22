package week1.day2;

import week1.day1.cCar;

public class Amstrongnumber {

	public static void main(String[] args) {
		int input = 153;
		int sum=0;
		
		while (input > 0) {
			int cube = input%10;
			sum = sum+(cube*cube*cube);
			input = input/10;
			
			}
		System.out.println(sum);
					

}
}
