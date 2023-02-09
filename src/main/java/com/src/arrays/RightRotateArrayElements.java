package com.src.arrays;

public class RightRotateArrayElements {

	public static void main(String[] args) {

		int[] a = new int[] {1,2,3,4,5,6,4,2,3,1,1,1};
int n=4;
		
		for(int k=0;k<n;k++)
		{

			int last = a[a.length-1];

			for(int i=a.length-2;i>=0;i--) {
				a[i+1]=a[i];
			}

			a[0]=last;

			for(int i:a)
			{
				System.out.print(i+" ");
			}
			
			System.out.println(" ");
		}
	}

}
