package DsawithJava;

import java.util.Scanner;

public class IsAPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isprime=true;
		for(int div=2;div*div<=n;div=div+1)
		{
			int rem=n%div;
			if(rem==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime==true)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}

	}

}
