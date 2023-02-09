package com.src.arrays;

public class PrintARrayELementsAtOddPosition {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5,6,4,2,3,1,1,1};
		
		for(int i=0;i<a.length;i+=2) {
			System.out.println(a[i]);
		}
	}

}
