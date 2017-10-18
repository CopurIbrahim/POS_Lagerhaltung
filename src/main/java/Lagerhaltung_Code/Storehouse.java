package Lagerhaltung_Code;


public class Storehouse {
	
	private int row;
	private int col;
	private Product[][] productList;
	
	public Storehouse() {
		
	}
	
	public Storehouse(int row, int col) {
		this.row = row;
		this.col = col;
		this.productList = new Product[row][col];
	}
	
	
	public void initializeProductList() {

        for (int r = 0; r < this.row; r++) {
            for(int c = 0; c < this.col; c++) {
                this.productList[r][c] = null;
            }
        }
    }
	
	
	public void configureNewStorehouse(int row, int column) {
        this.row = row;
        this.col = column;
        this.productList = new Product[this.row][this.col];
        this.initializeProductList();
    }
	
	
	
	public void showStorehouse() {
        for(int r = 0; r < this.row ; r++) {
            
        	for (int c = 0; c < this.col; c++) {
                
        		System.out.print("||");               
                if(this.productList[r][c] != null) {
                    System.out.print("  "+this.productList[r][c].getTitle()+"  ");
                } else {
                    System.out.print("  "+"Leer"+"  ");
                }
            }
            System.out.println("||" + "\n");

        }
        System.out.println("\n");
    }
	
	
	public void addProduct(Product product) {
        int a = 0;
        int b = 0;
        int nummer = 000;

        for(int r = 0; r < this.row; r++) {
            
        	for (int c = 0; c < this.col; c++) {
                if(this.productList[r][c] == null){
                    product.setPosition(b);
                    product.setId(nummer);
                    this.productList[r][c] = product;
                    return;
                }
                b++;
                a = b;
                nummer++;
            }
            a++;
        }
    }



	/*
	public boolean addProduct(Product product) {
		
		if (!this.checkIdExisting(product.getId())) {
			this.productList.add(product);
			return true;
		}
		return false;
	}
	*/
	
	
	public void getProductPosition(int pos) {
        for(int r = 0; r < this.row ; r++) {
            for (int c = 0; c < this.col; c++) {
                if(this.productList[r][c] != null && pos == this.productList[r][c].getPosition()){
                    System.out.println(this.productList[r][c].toString());
                    return;
                }
            }
        }
    }
	
	
	/*
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
