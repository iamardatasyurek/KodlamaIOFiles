package ClassesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        System.out.println("Code: " + product.getCode());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        Product product2 = new Product(2, "Phone", "Iphone 14 Pro Max Plus", 54999.99, 1, "pink");
        System.out.println("Code2: " + product2.getCode());

    }
}
