package com.src.arrays;

public class SortArrayElementsinAscendingOrder {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5,6,4,7,2,3,1,1,1};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}

	}

}
