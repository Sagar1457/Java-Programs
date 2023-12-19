package test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class p1 
{
	static void Frequnecy() 
	{
		Scanner s=new Scanner(System.in);
		List<Integer> a=new LinkedList<Integer>();
		LinkedList<Object> aa=new LinkedList<Object>();
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		for(int i=0;i<n;i++) 
		{
			aa.offer((Object)s.next());
		}
		System.out.println("+++++");
		//System.out.println(a1.poll()+" ...");
		System.out.println("+++++");
		Iterator i=aa.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next()+" ");
		}
		System.out.println("+++++");
		System.out.println(aa.get(0));
		//aa.add(0,-1);
		System.out.println(aa);
		System.out.println(aa.size());
		System.out.println("+++++");
		for(int k=0;k<aa.size();k++) 
		{  
			int count=1;
			for (int j=k+1;j<aa.size();j++) 
			{
				if(aa.get(k)==(aa.get(j)))
				{
					count=count+1;
					aa.add(j,-1);
				}	
			}
			if(aa.get(k)!=(Object)(-1))
			System.out.println(a.get(k)+"-"+count);
		}
		
	}
	public static void main(String[] args) 
	{
		Frequnecy();
	}

}
