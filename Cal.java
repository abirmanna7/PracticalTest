package com.anudip.assignment;
import java.util.Scanner;   // import package for taking user input
public class Cal {        //Creating a class
 
	 static void access() {
		    System.out.println("Enter your choice");
			System.out.println("Enter 1 for addition");
			System.out.println("Enter 2 for subtraction");
			System.out.println("Enter 3 for multiply");
			System.out.println("Enter 4 for divide");
			System.out.println("Enter your choice:");
	 		}
	 		public static void main(String args[])
	 		{
	 			Scanner s=new Scanner(System.in);
	 			System.out.println("Enter any two number");
	 			int p=s.nextInt();
	 			int q=s.nextInt();
	 			access();
			int x=s.nextInt();
			while(true)
			{
				switch(x)
				{
			case 1:
				System.out.println("The sum of two number is"+(p+q));
			break;
			case 2:
				System.out.println("The sum of two number is"+(p-q));
			break;
			case 3:
				System.out.println("The sum of two number is"+(p*q));
			break;
			case 4:
				System.out.println("The sum of two number is"+(p/q));
			break;
			default:
				System.out.println("Wrong option");
		}
				access();
				x=s.nextInt();
		}

	}
}	 		


