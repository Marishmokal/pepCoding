package pepCoding;

import java.util.Scanner;

public class Pattern4 {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter any number");
//	int num=sc.nextInt();
	int sp=0;
	int st=5;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=st;j++)
		{
			System.out.print("*");
		}
	sp++;
	st--;
	System.out.println();
	}
}
}
