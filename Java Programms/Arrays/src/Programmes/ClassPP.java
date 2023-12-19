package Programmes;

import java.util.Scanner;

public class ClassPP 
{
	public void starPattern(int n) 
	{
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= n; j++)
			{
				if (i == n / 2 + 1 || j == n / 2 + 1 || i + j == n + 1 || i == j) 
				{
					System.out.print(" * ");
				}
	            else 
	            {
	            	System.out.print("   ");
	            }
			}
	            System.out.println();
	     }
	}
	
	void pyramidPattern(int n)	  
	{
		for(int i=1;i<=n;++i)
		  {	
			  
			  for(int j=1;j<=n-i;++j)
				 
			  {
				  System.out.print("   ");
			  }
			  for(int k=1;k<=2*i-1;k++)
			  {
				  System.out.print(" * ");
			  }
			 System.out.println();
		  }
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
        ClassPP obj=new ClassPP();
        System.out.println("To print Star Pattern:");
        System.out.println("======================");
        System.out.print("Enter any odd value: ");
        int n = s.nextInt();
        System.out.println();
        obj.starPattern(n);
        System.out.println("\n ");
        System.out.println("To print Pyramid Pattern:");
        System.out.println("=========================");
        System.out.print("Enter n value: ");
        int m = s.nextInt();
        System.out.println();
		obj.pyramidPattern(m);
	}

}
