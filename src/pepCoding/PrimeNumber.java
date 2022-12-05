package pepCoding;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
	 int count=0;
     Scanner s = new Scanner(System.in);
   System.out.println("enter any number");
   int num=s.nextInt();
   for(int i=0;i<=num;i++)
   {
       if(num%i==0)
       {
           count++;
       }
   }
   if(count==2)
   {
       System.out.println("Prime number");
   }
   else
   {
       System.out.println("Not prime number");
   }
 
  }
 }

