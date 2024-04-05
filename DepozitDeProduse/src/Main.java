
public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Product a = new Product("0000", "Samsung Galaxy S22", 3500, 1);
        Product b = new CompensatedProduct("0001", "iPhone 14", 3800, 2, 0.9);
        Product c = new CompensatedProduct("0001", "iPhone 14", 3800, 5, 0.9);
        warehouse.addProduct(a);
        warehouse.addProduct(b);
        warehouse.addProduct(c);
        warehouse.printInventory();
    }
}
