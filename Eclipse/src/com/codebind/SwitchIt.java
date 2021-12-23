package com.codebind;

import java.util.Scanner;

public class SwitchIt {
	public static void main (String []args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter number");
		int number = keyboard.nextInt();
		switch (number) {
		case 1:
			System.out.println("It's Monday!");
			break;
		case 2: 
			System.out.println("It's Tuesday!");
			break;
		case 3: 
			System.out.println("It's Wednesday!");
			break;
		default:
			System.out.println("Try again!");
			break;
		}
		
		System.out.println("Horrey!");
	}
}





//public class SwitchIt {
//	public static void main (String []args) {
//		Scanner keyboard = new Scanner(System.in);
//		System.out.print("Please enter number");
//		int number = keyboard.nextInt();
//		
//		if(number == 1) {
//			System.out.println("It's Monday!");
//		}
//		if(number == 2) {
//			System.out.println("It's Tuesday!");
//		}
//		if(number == 3) {
//			System.out.println("It's Wednesday!");
//		}
//		System.out.println("Horrey!");
//	}
//}
