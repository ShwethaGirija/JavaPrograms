
public class PrintDuplicateElementsofArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,3,4,5,6,4,2,3,1,1,1};
		
		System.out.println("Duplicate elements in an array are");
		int freq[] = new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			int count = 1;
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j]))
				{
					count++;
					freq[j]=-1;
				}
			}
			
			if(freq[i]!=-1)
				freq[i]=count;
		}
		
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>1)
			{
				System.out.println(a[i]+"   "+freq[i]);
			}
		}
		
		
		
	}

}
