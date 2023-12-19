package exam;
//BVIDHYASAGAR..AF0320724
import java.util.Scanner;
public class ClassTernary 
{
	static Scanner s=new Scanner(System.in);
	void TernaryOperator(int a,int b) 
	{
		int G=(a>b)?a:b;
		System.out.println("the Greatest of two numbers is "+G);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter First number");
		int c=s.nextInt();
		System.out.println("Enter Second number");
		int d=s.nextInt();
		ClassTernary e=new ClassTernary();
		e.TernaryOperator(c,d);			
	}
}