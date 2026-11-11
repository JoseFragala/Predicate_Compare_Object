package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class App {
    public static void main(String[] args) {


        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        Double min = 100.00;

        list.removeIf(p -> p.getPrice() >= min);

        for (Product p : list){
            System.out.println(p);
        }
    }
}
