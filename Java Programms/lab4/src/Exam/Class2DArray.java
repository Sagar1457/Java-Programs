package Exam;
//BVIDHYASAGAR..AF0320724
import java.util.*;
public class Class2DArray
{
	void  sumOfDiagonals()
	{	
		System.out.println("Use square matrix only(always rows=columns)");
		System.out.println("===========================================");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row size: ");
		int r=sc.nextInt();
		System.out.print("Enter column size: ");
		int c=sc.nextInt();
		int[][] arr=new int[r][r];
		System.out.println("====================");
		System.out.println("Enter "+r*c+" elements into array");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The elements of array are :");
		System.out.println("===========================");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("The Sum of the diagonal elements: ");
		int sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				
				if(i==j || i+j==r-1) 
				{
					sum=sum+arr[i][j];
				}
			}
		}System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Class2DArray d=new Class2DArray();
		d.sumOfDiagonals();
	}
}
/*
output:-
Use square matrix only(always rows=columns)
===========================================
Enter row size: 3
Enter column size: 3
====================
Enter 9 elements into array
1 2 3 4 5 6 7 8 9 
The elements of array are :
===========================
1 2 3 
4 5 6 
7 8 9 

The Sum of the diagonal elements: 25
--------------------------------------------
Use square matrix only(always rows=columns)
===========================================
Enter row size: 2
Enter column size: 2
====================
Enter 4 elements into array
1 2 3 4 
The elements of array are :
===========================
1 2 
3 4 

The Sum of the diagonal elements: 10
*/