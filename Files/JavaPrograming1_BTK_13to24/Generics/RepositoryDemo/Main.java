package Generics.RepositoryDemo;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator();
        validator.validate(new Customer());
        validator.validate(new Product());
    }
}
