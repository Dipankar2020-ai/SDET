
package DsawithJava;

import java.util.Scanner;

public class PrintallPrimes {
	
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower and upper ranges: ");
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a;i<=b;i++) {
			boolean isPrime=false;
			
			int m=i;
			for(int div=2;div*div<=m;div++)
			{
				if(i%div==0)
				{
					isPrime=true;
					break;
				}
			}
			if(isPrime==false)
			{
				System.out.println(i);
			}
			else
			{
				continue;
			}
			
		}	
		
	}
}


