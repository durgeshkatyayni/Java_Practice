import java.util.Scanner;

public class Main {
	public void find(int[] arr)
	{
		int max=0;
		for(int i=0; i<arr.length; i++)
		{
			//System.out.println(arr[i]);
			if(arr[i]>max)
			
			{
				max=arr[i];
			}
		}
		System.out.println("\n---------------------------\nThe First Largest number is "+max);
	}
	
	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++)
		{
		System.out.print("Enter "+(i+1)+" Element : ");
		arr[i]=sc.nextInt();
		}
		
		Main call=new Main();
		call.find(arr);
	}
} 