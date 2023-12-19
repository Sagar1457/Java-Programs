package Operaters;
import java.util.Scanner;
public class Addition 
{
	static Scanner SC=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter A value");
		int a=SC.nextInt();
		System.out.println("Enter B value");
		int b=SC.nextInt();
		System.out.println("addtion of A & B numbers is = "+(a+b));
	}
}
