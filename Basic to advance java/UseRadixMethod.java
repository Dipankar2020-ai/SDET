package Javalearning;

import java.util.Scanner;

public class UseRadixMethod {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		sc.useRadix(2);
		int x=sc.nextInt();
		System.out.println(x);
		
	}

}
