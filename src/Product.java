public class Product {
    private int productId;
    private String name;
    private String brand;
    private boolean inStock;

    public Product() {
        this.productId = productId;
        this.name = "Kjento";
        this.brand = "Mini";
        this.inStock = true;
    }
    public Product(int productId, String name, String brand, boolean inStock) {
        this.productId = productId;
        this.name = name;
        this.brand = brand;
        this.inStock = inStock;
    }
    public static void main(String[] args) {
        Product myProduct = new Product(0, "Mini", "Kjento", true);
    }
}