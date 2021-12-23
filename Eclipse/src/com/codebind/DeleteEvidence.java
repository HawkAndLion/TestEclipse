package com.codebind;

import java.io.File;
import java.util.Scanner;

public class DeleteEvidence {
	public static void main(String[] args) {
		File evidence = new File("cookedBooks.txt");
		Scanner keyboard = new Scanner(System.in);
		char reply;
		do {
			System.out.print("Удалить файл? (y/n) ");
			reply = keyboard.findWithinHorizon(".",0).charAt(0);
			
		}while(reply != 'y' && reply != 'n');
		
		if(reply == 'y') {
			System.out.println("Ладно, удаляю.");
			evidence.delete();
			System.out.println("Файл удален.");
		}else {
			System.out.println("Ладно, не удаляю.");
		}
	}
}
