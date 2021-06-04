package unq.tp7.composite;

public class SpecialProduct extends Product {

	public SpecialProduct(float price, String name) {
		super(price, name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public float getPrice() {
		return getPrice()*10;
		
		/**10 para q sea distinto y tenga sentido el override*/
	} 

}
