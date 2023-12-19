package programs;
import java.util.*;
public class Day 
{
	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter your day");
		String ch=S.nextLine();
		switch(ch)
		{
		 	case ("monday"):
		 		System.out.println("yes today is "+ch);
		 		break;
		 	case ("tuesday"):
		 		System.out.println("yes today is "+ch);
		 		break;
		 	case ("wednessday"):
		 		System.out.println("yes today is "+ch);
		 		break;
		 	case ("thursday"):
		 		System.out.println("yes today is "+ch);
		 		break;
		 	case ("friday"):
		 		System.out.println("yes today is "+ch);
		 		break;
		 	case ("saturday"):
		 		System.out.println("yes today is "+ch);
		 	case ("sunday"):
		 		System.out.println("yes today is "+ch);
		 		break;
		 	default:
		 		System.out.println("undefined");
		 		break;
		}
	}
}
