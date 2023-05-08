package Javalearning;

import java.util.Scanner;

public class KeybRead {

	public static void main(String args[])
	{
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("May I know your name");
		name=sc.nextLine();
		System.out.println("welcome Mr./Mrs.  "+name);
		
	}
}
