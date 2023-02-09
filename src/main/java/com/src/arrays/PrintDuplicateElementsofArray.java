package com.src.arrays;

public class PrintDuplicateElementsofArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,3,4,5,6,4,2,3,1,1,1};
		
		System.out.println("Duplicate elements in an array are");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j]) && a[j]!=-1)
				{
					System.out.println(a[j]);
					a[j]=-1;
				}
			}
		}
	}

}
