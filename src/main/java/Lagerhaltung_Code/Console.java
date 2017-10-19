package Lagerhaltung_Code;

import java.util.Scanner;

public class Console {

	private ConsoleInput input;
	private ConsoleOutput output;
	private Storehouse store;
	private Scanner scanString;
	private Scanner scanInteger;
	private Scanner sc;
	
	public Console() {
		this.input = new ConsoleInput();
		this.output = new ConsoleOutput();
		this.scanString = new Scanner(System.in);
		this.scanInteger = new Scanner(System.in);
		this.store = new Storehouse(4,4);
		this.sc = new Scanner(System.in);
	}
	
	
	private void clearScreen() {
	    for (int i=0; i<1000; ++i) {
	      System.out.println();
	    }
	  }
	
	
	public void displayMenue() {
		this.output.startMenue();
		this.output.startEingabe();
		this.displayCommand();
	}
	
	
	public void displayCommand() {
		String eingabe = scanString.nextLine();
		if (eingabe.equals("hilfe")) {
			this.chooseCommand(eingabe);
		}
		else if (eingabe.equals("konfigurieren")) {
			this.chooseCommand(eingabe);
		}
		else if (eingabe.equals("position")) {
			this.chooseCommand(eingabe);
		}
		else if (eingabe.equals("inhalt")) {
			this.chooseCommand(eingabe);
		}
		else if (eingabe.equals("inventar")) {
			this.chooseCommand(eingabe);
		}
		else if (eingabe.equals("einlagern")) {
			this.chooseCommand(eingabe);
		}
		else if (eingabe.equals("auslagern")) {
			this.chooseCommand(eingabe);
		}
		else {
			this.output.startEingabe();
			this.displayCommand();
		}
	}

		
	public void chooseCommand(String command) {
		String[] commands = command.split("\\s+");
	    switch (commands[0]) {
	         case "hilfe": {
	        	 this.output.startBefehle();
	        	 this.output.startEingabe();
	        	 this.displayCommand();
	         }
	             break;
	         case "konfigurieren": {
	        	 this.CommandConfig();
	        	 this.output.startEingabe();
	        	 this.displayCommand();
	         }
	        	 break;
	         case "position":
	        	 break;
	         case "inhalt":
	        	 break;
	         case "inventar":
	        	 this.store.showStorehouse();
	        	 this.output.startEingabe();
	        	 this.displayCommand();
	        	 break;
	         case "einlagern":
	        	 //this.store.addProduct(product);
	        	 break;
	         case "auslagern":
	         default:
	             throw new IllegalArgumentException();
	     }
	}
	
	public void CommandConfig() {
		System.out.print("Lagerhaus: Anzahl der Zeilen: ");
		int r = this.scanInteger.nextInt();
		
		System.out.print("Lagerhaus: Anzahl der Spalten ");
		int c = this.scanInteger.nextInt();
		this.store.configureNewStorehouse(r, c);
		this.store.showStorehouse();
	}
	
	/*
	public void checkUserInput(Scanner v) {
		for (;;) {
			v = this.sc;
	        if (!sc.hasNextInt()) {
	            System.out.println("Bitte nur Zahlen (Integer) eintippen!: ");
	            this.CommandConfig();
	        }
	        else continue;
	    }
	}
	*/
}
