package Exam;
//BVIDHYASAGAR..AF0320724
import java.util.*;
public class ClassString1 
{
	static void frequencyOfStringCharacters() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String data: ");
		String s1=s.nextLine();
		int ac=0;
		int sc=0;
		int dc=0;
		int wc=0;
		for(int i=0;i<s1.length();i++) 
		{
			if(Character.isLetter(s1.charAt(i))) 
			{
				ac++;
			}
		}
		for(int i=0;i<s1.length();i++) 
		{	
			if(Character.isDigit(s1.charAt(i)))
			{
				dc++;
			}
		}
		for(int i=0;i<s1.length();i++) 
		{
			if(Character.isWhitespace(s1.charAt(i))) 
			{
				wc++;
			}
		}
		int x=0;
		for(int i=0;i<s1.length();i++) 
		{
			if(Character.isWhitespace(s1.charAt(i))||Character.isDigit(s1.charAt(i)) || Character.isLetter(s1.charAt(i))) 
			{
				x++;
				sc=s1.length()-x;
			}
		}
		System.out.println();
		System.out.println("The above Statement Contains th Follows: ");
		System.out.println("-----------------------------------------");
		System.out.println("Alphabets: "+ac);
		System.out.println("Digits: "+dc);
		System.out.println("Special characters: "+sc);
		System.out.println("Spaces: "+wc);
	}
	public static void main(String[] args) 
	{
		frequencyOfStringCharacters();
	}
}
/*
Output:-
Enter the String data: 
Anudip foundations_7324.

Alphabets: 17
Digits: 4
Special characters: 2
Spaces: 1

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        frequencyOfStringCharacters(input);
    }

    public static void frequencyOfStringCharacters(String input) 
    {
        int alphabets = 0;
        int digits = 0;
        int specialCharacters = 0;
        int spaces = 0;

        for (char ch : input.toCharArray())
        {
            if (Character.isLetter(ch)) 
            {
                alphabets++;
            }
            else if (Character.isDigit(ch)) 
            {
                digits++;
            } 
            else if (Character.isWhitespace(ch)) 
            {
                spaces++;
            } 
            else 
            {
                specialCharacters++;
            }
        }

        System.out.println("alphabets: " + alphabets);
        System.out.println("digits: " + digits);
        System.out.println("special characters: " + specialCharacters);
        System.out.println("spaces: " + spaces);
    }
}



============================================
OUTPUT 1:-
Enter a string: Anudip foundations_7324.
alphabets: 17
digits: 4
special characters: 2
spaces: 2

*/

