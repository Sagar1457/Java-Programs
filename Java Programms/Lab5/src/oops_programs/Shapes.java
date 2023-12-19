/*
3.Create class Shapes and overload method area:
i.area(int a) with parameter int a and calculate circle area(formula:3.14*a*a).
ii.area(double b,double h) with parameter double b and double h and calculate
Triangle area(formula: 0.5*b*h).
iii.area(int l, int b) with parameter int l and int b and calculate Rectangle
area(formula: l*b).
 */
package oops_programs;
//BVIDHYASAGAR..AF0320724
import java.util.Scanner;
public class Shapes 
{
	static Scanner s=new Scanner(System.in);
	void Area(int a) 
	{
		System.out.println("Area of a Circle: "+3.14*a*a);
	}
	void Area(double b,double h) 
	{
		System.out.println("Area of a Triangle: "+0.5*b*h);
	}
	void Area(int l, int b) 
	{
		System.out.println("Area of a Rectangle: "+l*b);
	}
	public static void main(String[] args) 
	{
		System.out.println("-------------------------------------");
		Shapes obj=new Shapes();
		System.out.println("To find the Area of a Circle: ");
		System.out.print("Enter Radius of a circle: ");
		int a=s.nextInt();
		obj.Area(a);
		System.out.println("-------------------------------------");
		System.out.println("To find the Area of a Triangle: ");
		System.out.print("Enter hight of the Triangle: ");
		double b=s.nextDouble();
		System.out.print("Enter base  of the Triangle: ");
		double h=s.nextDouble();
		obj.Area(b, h);
		System.out.println("-------------------------------------");
		System.out.println("To find the Area of a Rectangle: ");
		System.out.print("Enter Length of a Rectangle: ");
		int l=s.nextInt();
		System.out.print("Enter Width  of a Rectangle: ");
		int w=s.nextInt();
		obj.Area(l, w);
		System.out.println("-------------------------------------");
	}
}
