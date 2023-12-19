package Conditions;
import java.util.*;
public class Leapyear 
{
	Scanner sc=new Scanner(System.in);
	void Year()
	{
		System.out.println("Enter year");
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("not a Leap year");
		}
	}
	public static void main(String[] args)
	{
		Leapyear s=new Leapyear();
		s.Year();
	}

}
