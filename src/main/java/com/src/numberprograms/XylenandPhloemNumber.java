package com.src.numberprograms;

public class XylenandPhloemNumber {

	public static void main(String[] args) {
		xylemandphloem(34326,noofdigits(34326));
		
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
	public static void xylemandphloem(int num,int count)
	{
		int finalnum = num;
		int sumofextremes = 0;
		int middlesum =0;
		int i=0;
		
		while(num!=0)
		{
			i++;
			int remainder = num%10;
			num = num/10;
			
			if(i==1 || i==count)
			{
				sumofextremes=sumofextremes+remainder;
			}
			
			else
			{
				middlesum = middlesum + remainder;
			}
			
		}
		
		System.out.println("Sum of extreme digits is "+sumofextremes);
		System.out.println("Sum of mean digits is "+middlesum);
		
		if(sumofextremes==middlesum)
			System.out.println("Xylem no");
		else
			System.out.println("Phloem no");
		
		
	}

}
