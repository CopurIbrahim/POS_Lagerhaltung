package Lagerhaltung_Code;

import java.util.Scanner;

public class ConsoleInput {
	
	private Scanner scanner;
	
	
	public ConsoleInput() {
		this.scanner = new Scanner(System.in);
	}
	
	
	public String getInputString() {
		String in = this.scanner.nextLine();
		return in;
	}
	

}
