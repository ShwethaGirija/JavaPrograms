package com.src.numberprograms;

public class TechNumber {
//A number is called a tech number if the given number has an even number of digits and the number can be divided exactly into two parts from the middle. After equally dividing the number, sum up the numbers and find the square of the sum. If we get the number itself as square, the given number is a tech number, else, not a tech number. For example, 3025 is a tech number.
	
	
	
	public static void main(String[] args) {
		int num = 4025;
		int nofodigits = noofdigits(num);

		if(nofodigits%2!=0)
			System.out.println("Not a tech number");

		else
		{

			int divcount = nofodigits/2;
			System.out.println("No of digits by 2");
			int pow = (int) Math.pow(10, divcount);
			
			System.out.println("Power "+pow);

			int last_half = num%pow;
			int first_half = num/pow;

			System.out.println("First half "+first_half);
			System.out.println("Last half "+last_half);
			
			int sum = first_half+last_half;
			int finalval = sum*sum;
			
			if(finalval==num)
			{
				System.out.println("Its a tech no");
			}
			else
			{
				System.out.println("Not a tech no");
			}
		}

	}

	public static int noofdigits(int num)
	{
		int count =0;

		System.out.println("The digits in a no are ");
		while(num!=0)
		{
			int remainder = num%10;
			System.out.println(remainder);
			num =num/10;
			count++;

		}


		return count;
	}

}
