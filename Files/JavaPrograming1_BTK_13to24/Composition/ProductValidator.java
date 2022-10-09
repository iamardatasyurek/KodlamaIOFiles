package Composition;

public class ProductValidator {

    static {
        System.out.println("Static constracter worked.");
    }

    public ProductValidator() {
        System.out.println("Constracter worked.");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty())
            return true;
        else
            return false;
    }

    public void someThing(){

    }
}
