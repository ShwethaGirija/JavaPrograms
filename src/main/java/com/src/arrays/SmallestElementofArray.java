package com.src.arrays;

public class SmallestElementofArray {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5,6,4,2,3,1,1,1};

		int smallest = a[0];
		int index =0;

		for(int i=0;i<a.length;i++)
		{
			if(smallest>a[i])
			{
				smallest=a[i];
				index=i;
			}
		}

		System.out.println("LArgest element is "+smallest+" fund at index "+index );

	}
}


