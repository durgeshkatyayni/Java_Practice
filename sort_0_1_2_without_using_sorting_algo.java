public class Main
{
	static void own_algo_for_sort(int arr[], int n)
	{
		int c0=0, c1=0, c2=0, i;
		
		for(i=0; i<n; i++)
		{
			switch(arr[i])
			{
				case 0:
				{
					c0++;
					break;
				}
				case 1:
				{
					c1++;
					break;
				}
				case 2:
				{
					c2++;
					break;		
				}
			}
		}
		
		// while loop is starting from here
		
		int m=0, k;
		
		while(c0>0)
		{
			arr[m]=0;
			m++;
			c0--;
		}
		
		while(c1>0)
		{
			arr[m]=1;
			m++;
			c1--;
		}
		
		while(c2>0)
		{
			arr[m]=2;
			m++;
			c2--;
		}
		
		System.out.println("\nSorted array\n");		
		for(k=0; k<n; k++)
		{
			System.out.print(arr[k]+" ");
		}	
	}
	
	public static void main(String[] args)
	{
	   int arr[]={0,0,0,1,0,2,1,0,1,0,2};
	   System.out.println("unsorted array");
	   
	   for(int i=0; i<arr.length; i++)
	   {
	   	System.out.print(arr[i]+" ");
	   }
	   System.out.println();
	   
	   own_algo_for_sort(arr, arr.length);
    }
}