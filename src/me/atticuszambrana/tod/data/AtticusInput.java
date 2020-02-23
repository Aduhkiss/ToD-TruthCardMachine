package me.atticuszambrana.tod.data;

import java.util.Scanner;

public class AtticusInput {
	Scanner scanner;
	
	public AtticusInput() {
		scanner = new Scanner(System.in);
	}
	
	public String get() {
		return scanner.nextLine();
	}
	
	public int getNumber() {
		return scanner.nextInt();
	}
}
