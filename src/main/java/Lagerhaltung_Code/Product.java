package Lagerhaltung_Code;

public class Product {
	
	private int id;
	private String title;
	private int packaging;
	private double price;
	private String supplier;
	
	public Product() {
		
	}
	
	
	public Product(int id, String title, int packaging, double price, String supplier) {
		super();
		this.id = id;
		this.title = title;
		this.packaging = packaging;
		this.price = price;
		this.supplier = supplier;
	}
	
	public Product(String id, String packaging)
	{
		this.title = id;
		this.supplier = packaging;
	}
	

	

	
	public String toString() {
		return this.getTitle() + this.getSupplier();
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	public int getPackaging() {
		return packaging;
	}

	public void setPackaging(int packaging) {
		this.packaging = packaging;
	}


	
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getSupplier() {
		return supplier;
	}


	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	
	
	
	
	
}


