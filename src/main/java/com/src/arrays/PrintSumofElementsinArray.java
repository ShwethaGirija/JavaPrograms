package com.src.arrays;

public class PrintSumofElementsinArray {

	public static void main(String[] args) {
		
		int sum=0;
		int[] a = new int[] {1,2,3,4,5,6,4,2,3,1,1,1};

		for(int i:a)
		{
			sum=sum+i;
		}
		
		System.out.println("SUm of array elements is "+sum);
	}

}
