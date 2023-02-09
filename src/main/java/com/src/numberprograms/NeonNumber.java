package com.src.numberprograms;

public class NeonNumber {

	public static void main(String[] args) {
		
		neonnumber(90);
		
	}

	public static void neonnumber(int num)
	{
		int res = num*num;
		int sum=0;
		
		while(res!=0)
		{
			int remainder = res%10;
			res = res/10;
			sum=sum+remainder;
			
		}
		
		if(sum==num)
			System.out.println("Its a neon number");
		else
			System.out.println("Not a neon number");
	}
	
}
