package Lagerhaltung_Code;

public class ConsoleOutput {
	
	
	public ConsoleOutput() {
	}
	
	
	public void startMenue() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Lagerverwaltungsprogramm ~MYCOP~ mittels CLI");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	
	public void startEingabe() {
		System.out.println();
		System.out.println("Bitte w�hlen Sie ein Befehl aus!");
		System.out.print("Tippen Sie den Befehl \"hilfe\" ein, um eine �bersicht �ber alle verf�gbaren Benutzer - Befehle zu erhalten."
				+ "\n| Command: ");
	}
	
	
	
	public void startBefehle() {
		System.out.println("Eine Liste der verf�gbaren Benutzer - Befehle:");
		System.out.println("hilfe");
		System.out.println("konfigurieren");
		System.out.println("inventar");
		System.out.println("einlagern");
		System.out.println("auslagern");
		System.out.println("position");
		System.out.println("inhalt");
		
	}
	
	
	
	
	
	
	

}
