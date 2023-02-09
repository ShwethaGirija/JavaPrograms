package com.src.arrays;

public class LargestElementofARray {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5,6,4,2,3,1,1,1};
		
		int largest = a[0];
		int index =0;
		
		for(int i=0;i<a.length;i++)
		{
			if(largest<a[i])
			{
				largest=a[i];
				index=i;
			}
		}
		
		System.out.println("LArgest element is "+largest+" fund at index "+index );
		
	}

}
