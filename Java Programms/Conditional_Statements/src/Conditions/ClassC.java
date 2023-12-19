package Conditions;
import java.util.*;
public class ClassC
{
	Scanner SC=new Scanner(System.in);
	void Else_if_ladder() 
	{
		System.out.println("To find the greatest number among three numbers.");
		System.out.println("================================================");
		System.out.println("Enter value of N");
		int n=SC.nextInt();
		System.out.println("Enter value of X");
		int x=SC.nextInt();
		System.out.println("Enter value of Y");
		int y=SC.nextInt();
		if(n>x && n>y) 
		{
			System.out.println(n+" is greatest Number and it is N value");
		}
		else if(x>n && x>y)
		{
			System.out.println(x+" is greatest Number and it is X value");
		}
		else if(y>n && y>x)
		{
			System.out.println(y+" is greatest Number and it is  Y value");
		}
	}
	public static void main(String[] args) 
	{
		ClassC I=new ClassC();
		I.Else_if_ladder();
	} 
}
