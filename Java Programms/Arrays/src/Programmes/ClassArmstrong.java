package Programmes;

import java.util.Scanner;

public class ClassArmstrong 
{
	static Scanner sc=new Scanner(System.in);
	static void armstrongNumbers(int f,int s)
	{
		System.out.println("Armstrong numbers between "+f+"and "+s+" are:");
		for(int i=f;i<=s;i++) 
		{	
			int sum=0;
			int n = 0;
			int x = i;
			while(x>0) 
			{	
				x = x/10;
				n++;
			}
			int b = i;
			while(b>0) 
			{	
				int rem = b%10;
				sum = sum+(int)Math.pow(rem,n);
				b = b/10;
			}
			if(i==sum) 
			{
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.println("To print Armstrong Numbers between two given numbers");
		System.out.println("====================================================");
		System.out.print("Enter a 1st number: ");
		int f=sc.nextInt();
		System.out.print("Enter a 2nd number: ");
		int s=sc.nextInt();
		System.out.println();
		armstrongNumbers(f,s);
	}

}
