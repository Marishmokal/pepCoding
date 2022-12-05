package pepCoding;

import java.util.Scanner;

public class PrintDigits {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter any number");
	int num=s.nextInt();
	int nod=0;
	int temp=num;
	while(temp !=0)
	{
		temp=temp/10;
		nod++;
	}
	int div=(int)Math.pow(10,nod-1);
	while(div!=0)
	{
		int q=num/div;
		System.out.println(q);
		
		num=num%10;
		div=div/10;
	}
	
}

}
