public class Main {
	public void reverse_array(int[] arr, int n)
	{
		//int temp, k;
//		for(int i=0; i<n/2; i++)
//		{
//			temp=arr[i];
//			arr[i]=arr[n-i-1];
//			arr[n-i-1]=temp;
//		}
//		
//		for(k=0; k<n; k++)
//		{
//			System.out.print(arr[k]+" ");
//		}		
	

// ––—-–––--–------ Method No. 2 ----------------	
	
	int newarr[]=new int[n];
	int i, j, temp;
	for(i=0; i<n; i++)
	{
		temp=arr[i];
		newarr[n-i-1]=temp;
	}
	
	for(j=0; j<n; j++)
	{
		System.out.print(newarr[j]+" ");
	}
	}
	
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50,60};
		Main obj=new Main();
		obj.reverse_array(arr, arr.length);
	}
}