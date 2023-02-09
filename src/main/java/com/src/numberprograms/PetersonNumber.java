package com.src.numberprograms;


//A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.


public class PetersonNumber {

	public static void main(String[] args) {
		
		
		int num =123;
		int originalnum = num;
		int fact = factorialnum(num);
		int sumoffact = 0;
		
		while(num!=0)
		{
			int remainder = num%10;
			int factofdigit = factorialnum(remainder);
			sumoffact=sumoffact+factofdigit;
			num=num/10;
		}
		
		System.out.println("Sum of fact of digit is "+sumoffact);
		
		if(originalnum==sumoffact)
			System.out.println("PetersonNumber");
		else
			System.out.println("Not a peterson number");

	}
	
	public static int factorialnum(int num)
	{
		int result=1;
		int i=1;
		
		while(i<=num)
		{
			result=result*i;
			i++;
		}
		
		System.out.println("Factorial of a number "+num+" is "+result);
		return result;
	}

}
