
class CompensatedProduct extends Product {
    private double coefficient;

    public CompensatedProduct(String code, String name, double basePrice, int quantity, double coefficient) {
        super(code, name, basePrice, quantity);
        this.coefficient = coefficient;
    }

    @Override
    public double getFinalPrice() {
        return this.getBasePrice() * coefficient;
    }
    
    @Override
    public String toString() {
        return "//ProductType: Compensated Product// "+"Code: " + this.getCode()+" , Name: " + this.getName()+" , Base Price: " + this.getBasePrice()+" RON, Final Price: "+this.getFinalPrice()+" Quantity: " + this.getQuantity();
    }
}