package Exam;
//BVIDHYASAGAR..AF0320724
import java.util.*;
public class ClassStringHandling 
{
	Scanner s=new Scanner(System.in);
	void stringMethods() 
	{
		System.out.println("Enter the string: ");
		String s1=s.nextLine();
		int n=s1.length();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n;i++) 
		{
			char ch=s1.charAt(i);
			sb.append(ch);
		}
		System.out.println(sb);
		System.out.println("=======================================");
		System.out.println("Reverse the string");
		StringBuffer rs=new StringBuffer(s1);
		rs.reverse();
		System.out.println(rs);
		System.out.println("=======================================");
		System.out.println("Set Character in a string");
		System.out.print("Enter the place where the Letter add: ");
		int x=s.nextInt();
		System.out.print("Enter the letter: ");
		char g=s.next().charAt(0);
		sb.setCharAt(x,g);
		System.out.println(sb);
		System.out.println("=======================================");
		System.out.print("delete Character in a string by position: ");
		int y=s.nextInt();
		sb.deleteCharAt(y);
		System.out.println(sb);
		System.out.println("=======================================");
		System.out.println("Replace a string");
		System.out.print("Enter the Starting position where to string replace: ");
		int z=s.nextInt();
		System.out.print("Enter the End position where to string replace: ");
		int h=s.nextInt();
		System.out.println("Enter the Text");
		String s2=s.next();
		sb.replace(z, h, s2);
		System.out.println(sb);
		System.out.println("=======================================");
		System.out.println("Concat two  strings:");
		System.out.print("Enter First String: ");
		String s4=s.next();
		System.out.print("Enter Second String: ");
		String s5=s.next();
		String s6=s4.concat(s5);
		System.out.println(s6);
		System.out.println("=======================================");
		System.out.println("Case change in StringBuffer: ");
		StringBuffer sb1=new StringBuffer();
		for(int i=0;i<s6.length();i++) 
		{
			char ch=s6.charAt(i);
			sb1.append(ch);
		}
		System.out.println(sb1.toString().toUpperCase());
		System.out.println(sb1.toString().toLowerCase());
		System.out.println("=======================================");
		System.out.println("Case change in the string: ");
		String s9=s.next();
		System.out.println(s9.toLowerCase());
		System.out.println(s9.toUpperCase());
		System.out.println("=======================================");
		System.out.print("Enter the no of times the string repeat:  ");
		int u=s.nextInt();
		System.out.println("Enter the string that need to repeat: ");
		String s7=s.next();
		String s8=s7.repeat(u);
		System.out.println(s8);
		System.out.println("=======================================");
		System.out.println("Split the  string");
		System.out.println(s1);
		String[] arr=s1.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println("=======================================");
		String sr3 = "Sagar";
		System.out.println("String one: "+sr3);
		System.out.println("String Two: "+s1);
        System.out.println("equals() with String Class: " + s1.equals(sr3));
        System.out.println("Stringbuffer one: "+sb);
        System.out.println("Stringbuffer Two: "+sb1);
        System.out.println("equals() with String Buffer Class: " + sb.toString().equals(sb1.toString()));
}
	public static void main(String[] args) 
	{
		ClassStringHandling r=new ClassStringHandling();
		r.stringMethods();
	}
}
/*
output:-
Enter the string: 
Vidhya Sagar b
Vidhya Sagar b
=======================================
Reverse the string
b ragaS ayhdiV
=======================================
Set Character in a string
Enter the place where the Letter add: 13
Enter the letter: B
Vidhya Sagar B
=======================================
delete Character in a string by position: 6
VidhyaSagar B
=======================================
Replace a string
Enter the Starting position where to string replace: 6
Enter the End position where to string replace: 6
Enter the Text
_
Vidhya_Sagar B
=======================================
Concat two  strings:
Enter First String: vidhya
Enter Second String: sagar
vidhyasagar
===========================
Case change in StringBuffer: 
VIDHYASAGAR
vidhyasagar
=======================================
Case change in the string: 
Sagar
sagar
SAGAR
=======================================
Enter the no of times tha string repeat:  2
Enter the string that need to repeat: 
sagar
sagarsagar
=======================================
Split the  string
Vidhya Sagar b
[Vidhya, Sagar, b]
=======================================
String one: Sagar
String Two: Vidhya Sagar b
equals() with String Class: false
Stringbuffer one: Vidhya_Sagar B
Stringbuffer Two: vidhyasagar
equals() with String Buffer Class: false
*/