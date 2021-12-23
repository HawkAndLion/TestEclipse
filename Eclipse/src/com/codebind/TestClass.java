package com.codebind;

//import java.math.BigDecimal;
import java.util.Scanner;

public class TestClass {
	
	public static void main(String[] args) {
		for(int count=1; count<=10; count++) {
			System.out.print("Значение счетчика равно ");
			System.out.print(count);
			System.out.println(".");
		}
		System.out.println("Достаточно!");
	}
	
//	public static void main(String[] args) {
//		int i, b;
//		for(i=1, b=5; i<=5 || b>=5; i++, b--) {
//			System.out.println(i+" "+b);
//		}
//	}
	
	
	/**
	 * text displays first simple programme on Java
	 * 
	 * @author nadyalee
	 * @see Just test 
	 *
	 

	public static void main(String[] args) {
		//System.out.println("Hello Everyone!");
		BigDecimal bd = new BigDecimal("1.8");
		System.out.println(bd);

	}
	*/
	
	/*
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String problem = scan.nextLine();
        int indexToStart = 0;

        String num1 = "";
        String sign = "";
        for(int i = 0; i<problem.length(); i++){
            if(String.valueOf(problem.charAt(i)).equals("+") || String.valueOf(problem.charAt(i)).equals("-")
                    || String.valueOf(problem.charAt(i)).equals("*") || String.valueOf(problem.charAt(i)).equals("/")){
                sign = String.valueOf(problem.charAt(i));
                indexToStart = i + 1;
                break;
            }
            else{
                num1+=String.valueOf(problem.charAt(i));
            }
        }

        String num2 = "";
        String sign2 = "";
        for (int i = indexToStart; i<problem.length(); i++){
            if(String.valueOf(problem.charAt(i)).equals("+") || String.valueOf(problem.charAt(i)).equals("-")
                    || String.valueOf(problem.charAt(i)).equals("*") || String.valueOf(problem.charAt(i)).equals("/")){
                sign2 = String.valueOf(problem.charAt(i));
                indexToStart = i + 1;
                break;
            }
            else{
                num2+=String.valueOf(problem.charAt(i));
            }
        }

        String num3 = "";
        for (int k = indexToStart; k<problem.length(); k++){
            num3+=String.valueOf(problem.charAt(k));
        }

        int num1New = Integer.parseInt(num1);
        int num2New = Integer.parseInt(num2);
        int num3New = Integer.parseInt(num3);

        switch (sign) {
                case "*":
                    switch (sign2) {
                        case "+":
                            System.out.println(num1New * num2New + num3New);
                            break;
                        case "-":
                            System.out.println(num1New * num2New - num3New);
                            break;
                        case "*":
                            System.out.println(num1New * num2New * num3New);
                            break;
                        case "/":
                            System.out.println(num1New * num2New / num3New);
                            break;
                    }
                break;
                case "+":
                    switch (sign2) {
                        case "+":
                            System.out.println(num1New + num2New + num3New);
                            break;
                        case "-":
                            System.out.println(num1New + num2New - num3New);
                            break;
                        case "*":
                            System.out.println(num1New + num2New * num3New);
                            break;
                        case "/":
                            System.out.println(num1New + num2New / num3New);
                            break;
                    }
                break;
                case "-":
                    switch (sign2) {
                        case "+":
                            System.out.println(num1New - num2New + num3New);
                            break;
                        case "-":
                            System.out.println(num1New - num2New - num3New);
                            break;
                        case "*":
                            System.out.println(num1New - num2New * num3New);
                            break;
                        case "/":
                            System.out.println(num1New - num2New / num3New);
                            break;
                    }
                break;
                case "/":
                    switch (sign2) {
                        case "+":
                            System.out.println(num1New / num2New + num3New);
                            break;
                        case "-":
                            System.out.println(num1New / num2New - num3New);
                            break;
                        case "*":
                            System.out.println(num1New / num2New * num3New);
                            break;
                        case "/":
                            System.out.println(num1New / num2New / num3New);
                            break;
                    }
                break;
        }
        scan.close();
    }
    */
	
//	public static void main(String args[]) {
//		int n = 27;
//		
//		
//		++n;
//		System.out.println(n);
//		System.out.println(++n);
//		System.out.println(n);
//	}

}


