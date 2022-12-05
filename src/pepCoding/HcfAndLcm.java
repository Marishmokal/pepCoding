package pepCoding;

import java.util.Scanner;

public class HcfAndLcm {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter any number");
	int n1=s.nextInt();
	int n2=s.nextInt();
	
	int on1=n1;
	int on2=n2;
	while(n1 % n2 != 0)
	{
		int rem=n1 % n2;
		n1=n2;
		n2=rem;
	}
	int hcf=n2;
	int lcm=(on1*on2)/hcf;
	
	
	System.out.println(hcf);
	System.out.println(lcm);
}
}
