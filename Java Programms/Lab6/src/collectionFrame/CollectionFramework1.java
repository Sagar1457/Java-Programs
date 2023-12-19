package collectionFrame;
//BVIDHYASAGAR..AF0320724
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class CollectionFramework1 
{
  public static void main(String[] args) 
   {
	  Scanner s=new Scanner(System.in);
	  HashSet<Object> hs=new HashSet<Object>();
	  System.out.print("Enter Size of set one: ");
	  	int n=s.nextInt();	
	  System.out.println("Enter Elements of set one");
		 for(int l=0;l<n;l++) 
		 {
			 hs.add(s.nextInt());
		 }
		 System.out.println("Elements of set one: ");
		 Iterator<Object> i=hs.iterator();
		 while(i.hasNext())
		 {
			System.out.print(i.next( )+" ");
			 
		 }
	  HashSet<Object> h=new HashSet<Object>();
	  System.out.println("\n===========================");
		 System.out.print("Enter Size of set two: ");
		 int c=s.nextInt();
		 System.out.println("Enter Elements of set two");
		 
		 for(int l=0;l<c;l++) 
		 {
			 h.add(s.nextInt());
		 }
		 System.out.println("Elements of set two: ");
		 Iterator<Object> j=h.iterator();
		 while(j.hasNext())
		 {
			System.out.print(j.next( )+" ");
			 
		 }
			 hs.retainAll(h);
			 System.out.println("\n===========================");
			 System.out.println("Common Elements are: ");
			 Iterator<Object> k=hs.iterator();
			 while(k.hasNext())
			 {
				 System.out.print(k.next( )+" ");
			 }
   }
}
/*
output:-
-----------------------------
Enter Size of set one: 6
Enter Elements of set one
1
2
3
4
5
6
Elements of set one: 
1 2 3 4 5 6 
===========================
Enter Size of set two: 5
Enter Elements of set two
2
5
4
9
10
Elements of set two: 
2 4 5 9 10 
===========================
Common Elements are: 
2 4 5 
---------------------------------------
Enter Size of set one: 5
Enter Elements of set one
20
5
-45
100
30
Elements of set one: 
20 100 5 -45 30 
===========================
Enter Size of set two: 5
Enter Elements of set two
98
-45
20
5
35
Elements of set two: 
98 35 20 5 -45 
===========================
Common Elements are: 
20 5 -45 
---------------------------------
*/

