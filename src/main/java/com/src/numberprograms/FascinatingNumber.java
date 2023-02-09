package com.src.numberprograms;

import java.util.Arrays;

//Multiplying a number by two and three separately, the number obtained by writing the results obtained with the given number will be called a fascinating number. If the result obtained after concatenation contains all digits from 1 to 9, exactly once.

//In other words, we can also say that a number (n) may be a fascinating number if it satisfies the following two conditions:

//If the given number is a 3 or more than three-digit
//If the value getting after concatenation contains all digits from 1 to 9, exactly once.
public class FascinatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fascinatingno(192);
	}
	
	public static void fascinatingno(int num)
	{
		String sum = (num)+(num);
		System.out.println("SUm of elements is "+sum);
		int count_sum = noofdigits(sum);
		int[] a = new int[count_sum];
		int i=0;
		
		while(sum!=0)
		{
			int remainder = sum%10;
			sum=sum/10;
			a[i]=remainder;
			i++;
			
		}
		
		Arrays.sort(a);
		
		System.out.println("Sorted elements of array is ");
		for(int j:a)
			System.out.println(j);
		
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
