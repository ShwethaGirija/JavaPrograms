package com.src.arrays;

public class RemoveDuplicateElementsofArray {

	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,3,4,5,6,4,7,2,3,1,1,1};
		
		int[] temp = new int[a.length] ;
		
		for(int i=0;i<temp.length;i++)
		{
			temp[i]=-1;
		}
		
		for(int i:temp)
		{
			System.out.println(i);
		}
		
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && a[i]!=-1)
				{
					a[j]=-1;
					count++;
				}
			}
		}
		
		System.out.println("count = "+count);
		System.out.println("Printing array elements");
		for(int i:a)
		{
			System.out.println(i);
		}
		
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			{
				temp[j++]=a[i];
			}
		}
		
		
	}

}
