package pepCoding;

import java.util.Scanner;

public class Prime1 {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter any number");
	int t=s.nextInt();
	for(int i=1;i<t;i++)
	{
		int n=s.nextInt();
		int count=0;
		for(int div=1;div<=n;div++ )
		{
			if(n%div==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
			System.out.println("not prime number");
	}
}
}
