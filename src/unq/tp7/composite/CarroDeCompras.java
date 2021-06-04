package unq.tp7.composite;

import java.util.List;

public class CarroDeCompras {
	
	private List<Product> products;
	
	public CarroDeCompras(List<Product> products) {
		this.setElements(products);
	}

	public List<Product> getElements() {
		return products;
	}

	private void setElements(List<Product> products) {
		this.products = products;
	}
	
	public int totalRounded() {
		return Math.round(this.total());
	}
	
	public float total() { 
		float total = 0;
		for(Product p : products) {
		    total += p.getPrice();
		 }
		return total;
	}
	
	
	
}
