package Programmes;

import java.util.Scanner;

public class ClassFT 
{
	static Scanner sc = new Scanner(System.in);
	static int nthFibonacciTerm()
    {
        System.out.print("Enter the nth Fibonacci term: ");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print(n+"th term in Fibonacci Series is: ");
        for (int i = 1; i < n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return(a);
    }
    public static void main(String[] args) 
    {
    	System.out.print(nthFibonacciTerm());
    }  
}
