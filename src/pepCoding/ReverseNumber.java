package pepCoding;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	
	int rem=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter any number");
	int num=s.nextInt();
	while(num>0)
	{
		int reverse=num%10;
		num=num/10;
		
		
		System.out.println(reverse);
	}
	
}
}
