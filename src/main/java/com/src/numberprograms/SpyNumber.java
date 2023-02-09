package com.src.numberprograms;

//A positive integer is called a spy number if the sum and product of its digits are equal. In other words, a number whose sum and product of all digits are equal is called a spy number.


public class SpyNumber {

	public static void main(String[] args) {
		
		spynumber(1224);
	}
	
	public static void spynumber(int num)
	{
		int sum =0;
		int prod = 1;
		
		while(num!=0)
		{
			int remainder = num%10;
			num = num/10;
			
			sum = sum+remainder;
			prod = prod*remainder;
		}
		
		if(sum==prod)
			System.out.println("spy no");
		else
			System.out.println("Not a spy no");
	}

}
