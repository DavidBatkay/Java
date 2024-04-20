
public class testShoppingCart {

	public static void main(String[] args) {
		ShoppingCart shopping_cart = new ShoppingCart();
		Product p1 = new Product("iPhone15",4199.99);
		Product p2 = new Product("Milka Chocolate",11.99);
		Product p3 = new Product("Nike Nemesis - Size 42",299.99);
		shopping_cart.addProduct(p1);
		shopping_cart.addProduct(p2);
		shopping_cart.addProduct(p3);
		System.out.println(shopping_cart);
	}

}
