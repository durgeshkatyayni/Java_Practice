public class Main {
	public void sort(int arr[], int n, int k)
	{
		int i, j, temp;
		for(i=0; i<n; i++)
		{
			for(j=0; j<n-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;		
				}
			}			
		}
		
		// printing the sorted array
		System.out.print("\n\nSorted array is : ");
		for(i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		// finding the kth largest number
		System.out.println("\n\nYour "+k+"th element is "+arr[n-k]);
	}
	
	public static void main(String[] args) {
		int arr[]={10,50,40,20,30,80,70,90,120,150,110,130};
		int k=5;
		System.out.print("Unsorted array is : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		Main obj=new Main();
		obj.sort(arr, arr.length, k);	
	}
}