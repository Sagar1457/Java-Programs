package Programmes;

import java.util.Scanner;

public class ClassJump 
{
	Scanner Z=new Scanner(System.in);
	void methodBreak()
	{
		System.out.println("To test Break & Continue Functions from first 10 numbers");
		System.out.println("Break Function: ");
		System.out.print("Enter the Break point: ");
		int n=Z.nextInt();
		for(int i=1;i<=10;i++)	
		{
			if(i==n)
			{
				break;
			 }
			System.out.print(i+" ");
		 }
	}
	void methodContinue()
	{
		System.out.println("=================================");
		System.out.println("Continue Function: ");
		System.out.print("Enter the Continue point: ");
		int n=Z.nextInt();
		{
			for(int i=1;i<=10;i++)	
			{
				if(i==n)
				{
					continue;
				}
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String args[])
	{
		ClassJump obj=new  ClassJump();
		obj.methodBreak();
		obj.methodContinue();
	}

}
