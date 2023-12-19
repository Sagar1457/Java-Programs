package Exam;
//BVIDHYASAGAR..AF0320724
import java.util.Scanner;
public class ClassFrequency 
{
	static Scanner s=new Scanner(System.in);
	static void frequencyOfElements()
	{
		System.out.print("Enter the size of the array: ");
		int n= s.nextInt();
		int[] arr=new int[n];
		System.out.println();
		System.out.println("Enter "+n+" elements into array");
		for(int i=0;i<n;i++)
		{
			  arr[i]=s.nextInt();
		}
		System.out.println();
		System.out.println("Printing elements of array");
		for(int i=0;i<n;i++)
		{
			  System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		System.out.println("To print the Frequency of the Elements:");
		System.out.println("=======================================");
		int count=1;
		int f=0;
		for(int i=0;i<n;i++) 
		{  
			count=1;
			for (int j=i+1;j<n;j++) 
			{
				if(arr[i]==arr[j])
				{
					count=count+1;
					arr[j]=-1;
				}	
			}
			if(arr[i]!=-1)
			System.out.println(arr[i]+"-"+count);
			//System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		frequencyOfElements();
	}
}

/*
Output:-
Enter the size of the array: 10

Enter 10 elements into array
4 6 2 1 1 2 6 4 9 2

Printing elements of array
4 6 2 1 1 2 6 4 9 2 

To print the Frequency of the Elements:
=======================================
4-2
6-2
2-3
1-2
----------------------------------------
Enter 5 elements into array
1 3 2 1 2

Printing elements of array
1 3 2 1 2 

To print the Frequency of the Elements:
=======================================
1-2
3-1
2-2
*/
