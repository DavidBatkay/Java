
class Product {
    private String code;
    private String name;
    private double basePrice;
    private int quantity;

    public Product(String code, String name, double basePrice, int quantity) {
        this.code = code;
        this.name = name;
        this.basePrice = basePrice;
        this.quantity = quantity;
    }

    public double getFinalPrice() {
        return basePrice;
    }

    public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void changeQuantity(int quantity) {
		setQuantity(quantity);
	}
	
	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void addQuantity(int newQuantity) {
        quantity += newQuantity;
    }

    public String toString() {
        return "//ProductType: Product// "+"Code: " + code+" , Name: " + name+" , Base Price: " + basePrice+" RON, Quantity: " + quantity;
    }
}