package com.src.numberprograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num =5;
		int count = num/2;
		boolean flag = true;
		
		if(num==0||num==1||num==2)
			System.out.println("Its a prime no");
		
		else
		{
			for(int i=2;i<=count;i++)
			{
				if(num%i==0)
				{
					flag=false;
					break;
				}
			}
			
			if(flag)
				System.out.println("its a prime no");
			else
				System.out.println("Its not a prime no");
			
			
		}
		
		
	}

}
