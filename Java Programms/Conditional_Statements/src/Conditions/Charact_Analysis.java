package Conditions;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Charact_Analysis
{
	
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter a single character");
		char ch=SC.nextLine().charAt(0);
		if(Character.isUpperCase(ch)) 
		{
			System.out.println(Character.toLowerCase(ch));
			if(Character.isLetter(ch)) 
			{
				System.out.println("and it is a letter");
			}
			/*else 
			{
				System.out.println("no it is a not letter");
			}*/
		}
		else if(Character.isLowerCase(ch)) 
		{
			System.out.println(Character.toUpperCase(ch));
			if(Character.isLetter(ch)) 
			{
				System.out.println("and it is a letter");
			}
			/*else 
			{
				System.out.println("no it is a not latter");
			}*/
		}
		else if(Character.isDigit(ch)) 
		{
			System.out.println("yes it is a digit");
		}	
		else if(Character.isWhitespace(ch))		
		{
			System.out.println("yes it is a whitespace");
		}
		/*else if(Character.isSpaceChar(ch))		
		{
			System.out.println("yes it is a space");
		}*/
		
	}
}
