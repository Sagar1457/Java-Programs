package Conditions;
import java.util.*;
public class Upper_Lower_case 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a single character");
		char c=s.next().charAt(0);
		if(Character.isUpperCase(c))
		{
			System.out.println(Character.toLowerCase(c));
		}
		else if(Character.isLowerCase(c))
		{
			System.out.println(Character.toUpperCase(c));
		}
	}
}
