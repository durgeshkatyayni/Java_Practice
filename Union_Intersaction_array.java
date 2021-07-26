public class Main {

// Code for union
				
	static void union(int arr1[], int arr2[], int m, int n)
	{		
		int i=0, j=0;
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
			{
				System.out.print(arr1[i]+" ");
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				System.out.print(arr2[j]+" ");
				j++;
			}
			else
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}		
		}
		
		while(i<m)
		{
			System.out.print(arr1[i]+" ");
			i++;
		}
		while(j<n)
		{
			System.out.println(arr2[j]+" ");
			j++;
		}
	}
	
	// code for intersection 
	
	static void intersect(int arr1[], int arr2[], int m, int n)
	{		
		int i=0, j=0;
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				j++;
			}
			else
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}		
		}
		
	}
	
	
	// Main Function
	
	public static void main(String[] args) {
	int arr1[]={1,2,3,4,5,6};
	int arr2[]={1,2,5,6};
	System.out.print("Union : ");
	union(arr1, arr2, arr1.length, arr2.length);	System.out.print("\n\nIntersection : ");
	intersect(arr1, arr2, arr1.length, arr2.length);
	System.out.println();
	}
}