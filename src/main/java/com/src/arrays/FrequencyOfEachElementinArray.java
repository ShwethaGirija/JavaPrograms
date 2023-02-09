package com.src.arrays;

public class FrequencyOfEachElementinArray {

	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,3,4,5,6,4,2,3,1,1,1};
		
		int[] freq = new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			int count =1;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					freq[j]=-1;
				}
			}
			
			if(freq[i]!=-1)
				freq[i]=count;
		}
		
		
		System.out.println("Printing element and its frequencies ---");
		for(int i=0;i<a.length;i++)
		{
			if(freq[i]!=-1)
			{
				System.out.println(a[i]+"======"+freq[i]);
			}
		}
		
		
		
		
		
		
		
	}

}
