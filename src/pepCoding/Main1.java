package pepCoding;

import java.util.Scanner;

public class Main1 {
	  public static void main(String[] args) {
		    // input - don't change this code
		    Scanner scn = new Scanner(System.in);
		    int marks = scn.nextInt();
		    if(marks>90)
		    {
		        System.out.println("excellent");
		    }
		    else if(marks>80 && marks<=90)
		    {
		        System.out.println("good");
		    }
		    else if(marks>70 && marks <=80)
		    {
		        System.out.println("fair");
		    }
		    else if(marks>60 && marks<=70)
		    {
		        System.out.println("meet expectations");
		    }
		    else
		    {
		        System.out.println("below par");
		    }
		  }
		}
