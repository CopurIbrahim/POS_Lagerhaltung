package Lagerhaltung_Code;

import java.util.Scanner;

public class Console {
	
	private ConsoleInput input;
	private ConsoleOutput output;
	private Storehouse store;
	private Scanner scanner;
	
	public Console() {
		this.input = new ConsoleInput();
		this.output = new ConsoleOutput();
		this.store = new Storehouse(4,4);
	}
	
	
	public void displayMenue() {
		this.output.startMenue();
		this.input.getInputString();
		this.displayCommandMenue();
	}
	
	
	public void displayCommandMenue() {
	}

	/*	
	public void chooseCommand(String command) {
	   
	     switch (command) {
	         case "Monday":
	        	 System.out.println("Well DONE IT WORKS");
	             break;
	         case "Tuesday":
	        	 break;
	         case "Wednesday":
	        	 break;
	         case "Thursday":
	        	 break;
	         
	         default:
	             throw new IllegalArgumentException();
	     }
	}
	*/
	
	

}
