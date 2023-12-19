package collectionFrame;
//BVIDHYASAGAR..AF0320724
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class CollectionFramework3 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		System.out.print("Enter the Size of the arraylist: ");
		int n=s.nextInt();
		System.out.print("----------------------------------------");
		System.out.println("\nEnter the elements into arraylist");
		for(int i=0;i<n;i++) 
		{
			a.add(s.nextInt());
		}
		System.out.println("The Elements are: ");
		Iterator i=a.iterator();
		while(i.hasNext()) 
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("----------------------------------------");
		System.out.println("Sum of the Elements in the Arraylist are");
		int sum=0;
		for(int j=0;j<n;j++) 
		{
			sum=sum+a.get(j);
		}
		System.out.println(sum);
	}
}
/*
output:-
-------------
Enter the Size of the arraylist: 5
----------------------------------------
Enter the elements into arraylist
2
5
10
-15
3
The Elements are: 
2 5 10 -15 3 ----------------------------------------
Sum of the Elements in the Arraylist are
5
--------------------------------
*/
