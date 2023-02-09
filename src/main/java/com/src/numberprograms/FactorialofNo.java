package com.src.numberprograms;

public class FactorialofNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =50;
		
		int i=1;
		long res=1;
		
		while(i<=num) {
			res=res*i;
			i++;
		}
		
		System.out.println("Result "+res);
		
		long fact = factorial(50);
		
		System.out.println("Factorial of a no is "+fact);
	}
	
	
	
	public static long factorial(int num)
	{
		if(num==1 || num ==0)
			return 1;
		else
			return num*factorial(num-1);
	}
	
	

}
