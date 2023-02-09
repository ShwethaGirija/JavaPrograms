package com.src.arrays;

public class copy1arraytoanother {

	public static void main(String[] args) {
		
		int[] a = new int[]{1,2,3,4,5};
		
		int[] b = new int[a.length];
		int index=0;
		for(int i:a)
		{
			b[index]=i;
			index++;
		}
		
		System.out.println("Copied array is ");
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
		
		
		
		
		
		
	}

}
