public class ProductValidator {

    static {
        System.out.println("Static");
    }

    static {
        System.out.println("Static 2");
    }

    public ProductValidator() {
        System.out.println("Constructor");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void something() {
        System.out.println("Something");
    }

    public static class InnerClass {
        public static void innerMethod() {
            System.out.println("Inner method");
        }
    }
}
