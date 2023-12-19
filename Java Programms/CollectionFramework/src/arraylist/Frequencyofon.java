package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Frequencyofon 
{
	static void Frequnecy() 
	{
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		for(int i=0;i<n;i++) 
		{
			a.add(s.nextInt());
		}
		System.out.println(a);
		System.out.println(Collections.frequency(a,4));
		for(int i=0;i<n;i++) 
		{  
			int count=1;
			for (int j=i+1;j<n;j++) 
			{
				if(a.get(i)==a.get(j))
				{
					count=count+1;
					a.set(j,-1);
				}	
			}
			if(a.get(i)!=(-1))
			System.out.println(a.get(i)+"-"+count);
		}
		
	}
	public static void main(String[] args) 
	{
		Frequnecy();
	}
}
