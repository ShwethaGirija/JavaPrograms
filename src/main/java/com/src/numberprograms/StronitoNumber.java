package com.src.numberprograms;


//Strontio numbers are those four digits numbers when multiplied by 2 give the same digit at the hundreds and tens place. Remember that the input number must be a four-digit number.


public class StronitoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stronitono(1386);
	}

	public static void stronitono(int num)
	{
		num=num*2;
		
		 num =num/10;
		int tens_digit = num%10;
		
		num =num/10;
		int hunderds_digit = num%10;
		
		System.out.println("Tens digit is "+tens_digit);
		System.out.println("Hundreds digit is "+hunderds_digit);
		
		if(tens_digit==hunderds_digit)
			System.out.println("Stronito number");
		else
			System.out.println("Not a stronito num");
	}
	
}
