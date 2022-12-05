package pepCoding;

import java.util.Scanner;

public class CountDigits {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter any number");
	int num=s.nextInt();
	int dig=0;
	while(num!=0)
	{
		num=num/10;
		dig++;
	}
	System.out.println(dig);
}
}
