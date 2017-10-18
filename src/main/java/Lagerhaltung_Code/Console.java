package Lagerhaltung_Code;

public class Console {
	
	private ConsoleInput input;
	private ConsoleOutput output;
	private Storehouse store;
	
	public Console() {
		this.input = new ConsoleInput();
		this.output = new ConsoleOutput();
		this.store = new Storehouse(2,2);
	}
	
	
	public void displayMenue() {
		this.output.startMenue();
		this.store.store();
		//this.chooseCommand("Monday");			
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
