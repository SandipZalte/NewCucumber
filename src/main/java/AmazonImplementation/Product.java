package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String prodcutName;
	private int Price;
	
	public Product(String prodcutName, int price) {
		
		this.prodcutName = prodcutName;
		Price = price;
	}

	public String getProdcutName() {
		return prodcutName;
	}

	public void setProdcutName(String prodcutName) {
		this.prodcutName = prodcutName;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public List<String>getProductList(){
		
		List <String >productList= new ArrayList();
		productList.add("AppaleMacBook");
		productList.add("LenovoG50");
		productList.add("Appale Mac Air");
		productList.add("Appale IPhone 12");
		return productList;
	}
}
