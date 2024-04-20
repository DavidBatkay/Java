import java.util.LinkedList;

public class ShoppingCart {
	private LinkedList<Product> products = new LinkedList<Product>();
	
	public ShoppingCart(LinkedList<Product> products) {
		this.products = products;
	}
	
	public ShoppingCart() {
		this.products = new LinkedList<Product>();
	}

	public void addProduct(Product added_product) {
		this.products.add(added_product);
	}
	
	public double calculateTotal() {
		double totalPrice=0.0;
		for(Product product : products) {
			totalPrice+=product.getPrice();
		}
		return totalPrice;
	}
	
	@Override
	public String toString() {
		String shopping_cart="Products in your shopping cart:"+System.lineSeparator();
		Integer index=1;
		for(Product product : products) {
			shopping_cart+="["+Integer.toString(index)+"] "+product+System.lineSeparator();
			index++;
		}
		shopping_cart+="Total price: "+String.format("%.02f",calculateTotal())+" RON";
		return shopping_cart;
	}
}
