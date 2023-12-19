package programms;
import java.util.*;
public class Programs 
{
	static Scanner sc=new Scanner(System.in);
	void prime(int n) 
	{
		//System.out.println("Print prime numbers");
		int c=0;
		for(int i=1;i<=n;i++) 
		{
			if(n%i==0) 
			{
				c=c+1;
			}
		}
		if(c==2) 
		{
			System.out.println(n+" is a prime no ");	
		}
		else
		{
			System.out.println(n+" not a is a prime no ");	
		}
	}
	void star(int n) 
	{
		System.out.println("Triangle star Pattern");
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
			  System.out.print("*");	
			}
			System.out.println();
		}
	}
	void Rstar(int n) 
	{
		System.out.println("Reverse Triangle star Pattern");
		for(int i=n;i>=1;i--) 
		{
			for(int j=1;j<=i;j++) 
			{
			  System.out.print("*");	
			}
			System.out.println();
		}
	}
	void Rno(int n) 
	{
		System.out.println("Reverse of a number");
		int c=0;
		int r=0;
		while(n>0) 
		{
			r=n%10;
			c=c*10+r;
			n=n/10;
		}
		System.out.println("Reverse Triangle star Pattern: "+c);
	}
	void Palindrom(int n) 
	{
		
		
	}
	void fibonaic(int n) 
	{
		int f=0;
		int s=1;
		System.out.println("print first n febonacci series");
		for(int i=1;i<=n;i++) 
		{
			int t=f+s;
			f=s;
			s=t;
			if(n>=3) 
			{
				
			}
		}
		
	}
	public static void main(String[] args) 
	{	
		System.out.println("enter n");
		int n=sc.nextInt();
		Programs v=new Programs();
		//v.prime(n);
		//v.star(n);
		v.Rstar(n);
		//v.Rno(n);
		//v.Palindrom(n);
	}
}


