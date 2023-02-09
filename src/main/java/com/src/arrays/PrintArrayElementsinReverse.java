package com.src.arrays;

public class PrintArrayElementsinReverse {

	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,3,4,5,6,4,2,3,1,1,1};
		
		
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]+" ");
		
		
	}

}
