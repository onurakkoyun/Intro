public class ProductManager {
    public void add(Product product) {
        // static method
        if (ProductValidator.isValid(product)) {
            System.out.println("Product added!");
        } else {
            System.out.println("Product could not be added!");
        }
        System.out.println("Product added!");

        // non-static method
        ProductValidator productValidator = new ProductValidator();
        productValidator.something();
    }
}
