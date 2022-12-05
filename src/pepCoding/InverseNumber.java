package pepCoding;

import java.util.Scanner;

public class InverseNumber {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter any number");
	int num=s.nextInt();
	int inv=0;
	int op=1;
	while(num!=0)
	{
		int od=num%10;
		int id=op;
		int ip=od;
		
		inv=inv+id*(int)Math.pow(10,ip-1);
		num=num/10;
		op++;
	}
	System.out.println(inv);
}
}
