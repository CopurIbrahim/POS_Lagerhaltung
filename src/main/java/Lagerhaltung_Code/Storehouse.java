package Lagerhaltung_Code;


public class Storehouse {
	
	private int row;
	private int col;
	

	
	
	public Storehouse(int row, int col) {
		this.row = row;
		this.col = col;		
	}
	
	/*
	public void lagerArray() {
	
		Product [][] dimo = new Product [this.row][this.col];
		
		for (int row = 0; row < dimo.length; row++) {
			for (int col = 0; col < dimo[0].length; col++) {
				dimo[row][col] = new Product( row, col);
			}
		}
		
		for ( int row = 0; row < dimo.length; row++) {
			for (int col = 0; col < dimo[0].length; col++) {
				System.out.println( dimo [row][col] );
			}
		}
	
	}
	*/
	

	/*
	public boolean addProduct(Product product) {
		
		if (!this.checkIdExisting(product.getId())) {
			this.productList.add(product);
			return true;
		}
		return false;
	}
	
	public boolean checkIdExisting(int id) {
		
		for(int i = 0; i < productList.size(); i++) {
			if (this.productList.get(i).getId() == id) {
				return true;
			}
		}
			return false;	
	}
	*/
	
	
	
	

}
