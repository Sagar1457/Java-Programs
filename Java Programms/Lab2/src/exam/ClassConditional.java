package exam;
//BVIDHYASAGAR..AF0320724
import java.util.*;
public class ClassConditional
{
	Scanner s=new Scanner(System.in);
	void methodConditional() 
	{
		String s1="B vidhya sagar";
		int Age=25;
		System.out.println("Enter your name");
		String s2=s.nextLine();
		if(s1.equals(s2)) 
		{
			System.out.println("Enter your age");
			int x=s.nextInt();
			if(Age==x) 
			{
				System.out.println("Authentication Success");
			}
			else 
			{
				System.out.println("worng age");
			}
		}
		else 
		{
			System.out.println("worng name");
		}
	}
	public static void main(String[] args) 
	{
		ClassConditional e=new ClassConditional();
		e.methodConditional();		
	}
}
