import java.util.*;
public class Main 
{
	public void MinMax(int arr[], int n)
	{
		while(true)
		{
		System.out.print("\n1. Minimum Element \n2. Maximum Element \n3. Exit \n\nEnter your choice : ");
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();
		int min, max, i;
		if(choice==1)
		{
			//System.out.println("you chose 1 here ");
			min=arr[0];
			for(i=0; i<n; i++)
			{
				if(arr[i]<min)
				{
					min=arr[i];
				}
			} 
			System.out.print("\n----------------------------------\nMinimum Element from  array is : "+min+"\n");
		}
		else if(choice==2)
		{
			//System.out.println("you chose 2 here ");
			max=arr[0];
			for(i=0; i<n; i++)
			{
				if(arr[i]>max)
				{
					max=arr[i];
				}
			}
			System.out.print("\n-----------------------------------------\nMaximum element from array is : "+max+"\n");
		}
		else if(choice==3)
		{
			System.out.println("\nSuccessfully Exit");
			break;
		}
		else
		{
			System.out.println("\nPlease chose correct Option\n");
		}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();	
		}
		
		Main obj=new Main();
		obj.MinMax(arr, arr.length);	        
	}
}