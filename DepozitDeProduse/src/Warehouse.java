import java.util.ArrayList;
import java.util.List;

class Warehouse {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        boolean productExists = false;
        for(Product p : products) {
            if (p.getCode().equals(product.getCode())) {
                p.changeQuantity(product.getQuantity());
                productExists = true;
                break;
            }
        }
        if (!productExists) {
            products.add(product);
        }
    }
    public void printInventory() {
    	System.out.println("Total Warehouse products: "+products.size());
        for (Product p : products) {
            System.out.println(p);
        }
    }
}