package Exam;
//BVIDHYASAGAR..AF0320724
import java.util.*;
public class ClassReverseString 
{
	Scanner s=new Scanner(System.in);
	void reverseWordsInString() 
	{
		System.out.println("Enter the string: ");
		System.out.println("------------------");
		String s1=s.nextLine();
		String[] Arr=s1.split(" ");
		StringBuilder s=new StringBuilder();
		
		for(String word: Arr)
		{
			StringBuilder sb=new StringBuilder(word);
			sb.reverse();
			s.append(sb).append(" ");
		}
		System.out.println("-----------------------------");
		System.out.println("Reverse Words In the string: ");
		System.out.println("-----------------------------");
		System.out.println(s.toString().trim());
	}
	public static void main(String[] args) 
	{
		ClassReverseString r=new ClassReverseString();
		r.reverseWordsInString();
	}
}
/*
Enter the string: 
------------------
Java is an Object oriented programming languuuage
-----------------------------
Reverse Words In the string: 
-----------------------------
avaJ si na tcejbO detneiro gnimmargorp egauuugnal
====================================================
Enter the string: 
------------------
hello world
-----------------------------
Reverse Words In the string: 
-----------------------------
olleh dlrow

*/