package Conditions;
import java.util.*;
public class Vowels 
{
	Scanner sc=new Scanner(System.in);
	void Sagar()
	{
		System.out.println("Enter a single character");
		char ch =sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
				ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') 
		{
			System.out.println("Vowels");
		}
		else 
		{
			System.out.println("Consonent");
		}
	}	
	public static void main(String[] args) 
	{
		Vowels sai=new Vowels();
		sai.Sagar();
		
	}
}
