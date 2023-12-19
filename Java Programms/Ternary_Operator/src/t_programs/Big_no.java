package t_programs;
import java.util.*;
public class Big_no 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("To find the big number");
		System.out.println("======================");
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		String max=(a>b)?"a is big no":"b is big no";
		//int max=(a>b)? a:b;
		System.out.println(max);
	}
}
