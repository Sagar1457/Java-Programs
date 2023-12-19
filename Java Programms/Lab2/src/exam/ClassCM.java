package exam;
//BVIDHYASAGAR..AF0320724
import java.util.*;
public class ClassCM 
{
	Scanner s=new Scanner(System.in);
	void characterMethods() 
	{
		System.out.println("Enter your Character");
		char ch=s.nextLine().charAt(0);
		if(Character.isUpperCase(ch))
		{
			if(Character.isLetter(ch)) 
			{
				System.out.println("yes it is a Letter");
				System.out.println("its Lowercase is: "+(Character.toLowerCase(ch)));
			}
		}
		else if(Character.isLowerCase(ch))
		{
			if(Character.isLetter(ch)) 
			{
				System.out.println("yes it is a Letter");
				System.out.println("its Uppercase is: "+(Character.toUpperCase(ch)));
			}
		}
		else if(Character.isDigit(ch))
		{
			System.out.println("yes it is a Digit");
		}
		else if(Character.isWhitespace(ch)) 
		{
			System.out.println("yes it is a Whitespace");
		}
	}
	public static void main(String[] args) 
	{
		ClassCM e=new ClassCM();
		e.characterMethods();	
	}
}
