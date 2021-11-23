package com.genrics;
import java.util.Scanner;
public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxString obj =new MaxString();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first value :");
		
		String first = sc.next();
		
		System.out.println("Enter second value :");
		
		String second = sc.next();
		
		System.out.println("Enter third value :");
		
		String third = sc.next();
		
		obj.MaxString(first, second, third);
		
		sc.close();
		
	}

}
