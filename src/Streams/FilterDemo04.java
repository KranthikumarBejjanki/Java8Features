package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    double price;

    Product(int id, String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}


public class FilterDemo04 {
    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell", 30000));
        productsList.add(new Product(3, "Lenovo", 28000));
        productsList.add(new Product(4, "Sony", 23000));
        productsList.add(new Product(5, "Apple", 90000));

        productsList.stream().filter(obj ->obj.price>25000).forEach(obj->System.out.println(obj.price));

        List<Product> result = productsList.stream().filter(obj-> obj.price>50000).collect(Collectors.toList());
        System.out.println(result);
    }
}
