package gr.aueb.cf.ch20.Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    private static final List<Product> products = Arrays.asList(
            new Product(1, "Eggs", 4, 200),
            new Product(2, "Apples", 2, 50),
            new Product(3, "Milk", 1.5, 15),
            new Product(4, "Potato", 1, 5)
    );

    public static void main(String[] args) {
        List <Product> filteredProductsByPrice = getFilteredProducts(products, product -> product.getPrice() <=2);
        List <Product> filteredProductsByTitle = getFilteredProducts(products, product -> product.getTitle() == "Eggs");
        List <Product> filteredProductsByQuantity = getFilteredProducts(products, product -> product.getQuantity() >=15);
        printFilteredProducts(filteredProductsByPrice, product -> System.out.println(product));
//        printFilteredProducts(filteredProductsByTitle, product -> System.out.println(product));
//        printFilteredProducts(filteredProductsByQuantity, product -> System.out.println(product));
    }

    public static List<Product> getFilteredProducts(List<Product> prod, Predicate<Product> filter) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (filter.test(product)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public static void printFilteredProducts(List<Product> products, Consumer<Product> consumer) {
        for (Product product :products) {
            consumer.accept(product);
        }
    }
}
