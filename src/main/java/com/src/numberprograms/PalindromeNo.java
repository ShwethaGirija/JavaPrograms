package com.src.numberprograms;

public class PalindromeNo {

	public static void main(String[] args) {
		
		
		int num =1221;
		int finalnum=num;
		int rev=0;
		
		while(num!=0)
		{
			int remainder = num%10;
			rev=(rev*10)+remainder;
			num =num/10;
		}
		
		System.out.println("num is "+finalnum);
		System.out.println("reverse is "+rev);
		
		if(finalnum==rev)
			System.out.println("Its a palindrome no");
		else
			System.out.println("Not a plaindrome no");
		
	}

}
