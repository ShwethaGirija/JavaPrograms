package com.src.arrays;

public class leftrotateArrayElements {

	public static void main(String[] args) {

		int[] a = new int[] {1,2,3,4,5,6};

		int n=3;

		for(int k=0;k<n;k++)
		{
		
			int first = a[0];

			for(int i=1;i<a.length;i++)
				a[i-1]=a[i];

			a[a.length-1]=first;

			for(int i:a)
			{
				System.out.print(i+" ");
			}

System.out.println( );

		}




	}

}
