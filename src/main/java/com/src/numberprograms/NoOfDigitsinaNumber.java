package com.src.numberprograms;

public class NoOfDigitsinaNumber {

	public static void main(String[] args) {
		
		int num = 2341;
		int count = noofdigits(num);
		System.out.println("No of digits is "+noofdigits(num));
		
		printchars(num,count);
		
		
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
	
	public static void printchars(int num,int count)
	{
		int[] a = new int[4];
		int i=count-1;
		
		while(num!=0)
		{
			int remainder = num%10;
			num =num/10;
			
			a[i]=remainder;
			i--;
		}
			
		for(int j:a)
		{
		System.out.println(j);
		}
	}
		
		
		
		
}
	
