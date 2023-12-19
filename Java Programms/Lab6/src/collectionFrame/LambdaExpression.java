package collectionFrame;
import java.util.Scanner;
public class LambdaExpression 
{
	public static void main(String[] args)
	{
		System.out.println("The Multiplication of three Float numbers: ");
		In_LambdaExpression a=(float x,float y,float z)->
		{
			float m=x*y*z;
			return(m);
		};
		Scanner s=new Scanner(System.in);
		System.out.print("Enter The Float numbers one: ");
		float m=s.nextFloat();
		System.out.print("Enter The Float numbers two: ");
		float n=s.nextFloat();
		System.out.print("Enter The Float numbers Three: ");
		float o=s.nextFloat();
		float mu=a.Multi(m,n,o);
		System.out.println("The Multiplication of three Float numbers: "+mu);
	}
}
/*
output:-
=========
The Multiplication of three Float numbers: 
Enter The Float numbers one: 3.2
Enter The Float numbers two: 5.4
Enter The Float numbers Three: -2.5
The Multiplication of three Float numbers: -43.2
-----------------------------------------------
*/