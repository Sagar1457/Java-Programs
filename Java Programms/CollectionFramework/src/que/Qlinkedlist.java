package que;

import java.util.LinkedList;
import java.util.List;

public class Qlinkedlist 
{
	static void A1()
	{
		List  ql=new LinkedList();
		ql.add(10);
		ql.add('A');
		ql.add(24.56);
		ql.add("Sagar");
		System.out.println(ql);
		System.out.println("================");
		
		LinkedList<Object> ql1=new LinkedList<Object>();
		ql1.offer(12);
		ql1.offer(50);
		ql1.add("sagar");
		System.out.println(ql1);
		System.out.println(ql1.size());
		System.out.println(ql1.get(0));
		ql1.add(1, 100);
		System.out.println(ql1);
		ql1.remove(0);
		ql1.remove((Object)100);
		System.out.println("====");
		System.out.println(ql1.contains(50));
		System.out.println("========");
		System.out.println(ql1);
		System.out.println("+++++");
		System.out.println(ql1.indexOf(50));
		System.out.println("+++++");
		
		for(int i=0;i<ql1.size();i++) 
		{
			System.out.println(ql1.get(i)+" ");
		}
		System.out.println("+++++");
		for(int i=ql1.size()-1;i<=0;i--) 
		{
			System.out.println(ql1.get(i)+" ");
		}
		System.out.println("+++++");
		for(Object i:ql1) 
		{
			System.out.print(i);
		}
	}
	public static void main(String[] args)
	{
		A1();
	}
}
