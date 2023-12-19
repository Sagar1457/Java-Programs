package programms;
import java.util.*;
public class While_loop 
{
	Scanner s=new Scanner(System.in);
	void meth1() 
	{
		int p=1;
		while(p<=10)
		{
			System.out.print(p);
			p=p+1;
		}
	}
	void meth2() 
	{
		int x=1;
		while(x<=9)
		{
			int y=1;
			while(y<=9) 
			{
				System.out.print(x+""+y+" ");
				y=y+1;
			}
			x=x+1;	
			System.out.println();	
		}
	}
	void meth3()
	{
		System.out.println("enter n");
		int n=s.nextInt();
		int c=0;
		while(n>0) 
		{
			n=n/10;
			c=c+1;
				
		}System.out.println(c);
		
	}
	void meth4() 
	{
		System.out.println("enter n");
		int x=s.nextInt();
		int sum=0;
		int R=0;
		while(x>0) 
		{
			R=x%10;
			sum=sum+R;
			x=x/10;
		}System.out.println(sum);
	}
	void meth5() 
	{
		System.out.println("enter n");
		int x=s.nextInt();
		int f=1;
		for(int j=x;j>=1;j--) 
		{
			f=f*j;
			
		}
		System.out.println(f);
	}	
	public static void main(String[] args) 
	{	
		While_loop v=new While_loop();
		//v.meth1();	
		//v.meth2();
		//v.meth3();
		//v.meth4();
		v.meth5();
	}
}
