package exceptionHandling;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		/*System.out.println("Enter number to reverse for x and y");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("values before reverse=:	 "+x+" "+y );
		x= x+y;
		y = x-y;
		x= x-y;
		System.out.println("values after reverse=:	 "+x+" "+y  );
		*/
		
		
		System.out.println("Enter values of a and b without comma");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Values before reverse= " + a+" "+b);
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("Values after reverse= " + a+" "+b);
		
		
		
	}
}
