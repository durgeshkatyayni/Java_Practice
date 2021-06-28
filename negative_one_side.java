public class Main {
	public void negative(int arr[], int n)
	{
		int i=0 ,j=0, temp;
		
		for(i=0; i<n; i++)
		{
			if(arr[i]<0)
			{
				if(j!=i)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
		
// Printing the final array		
		
		for(i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[]={1,2,-1,-2,3,4,-9,-5,8,9,-2};
		Main obj=new Main();
		obj.negative(arr, arr.length);	
	}
}