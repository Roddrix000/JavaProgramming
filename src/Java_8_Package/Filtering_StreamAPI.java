package Java_8_Package;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering_StreamAPI {


    static List<Product> freshList = new ArrayList<Product>();

    public static void main(String[] args) {
        for (Product p : add_ProductDetails()) {
            if (p.getProduct_Price() >= 1000) {
                freshList.add(p);
            }

        }

        System.out.println(freshList);
        //Printing the value

        for (Product p1 : freshList) {
            System.out.println(p1);
        }


        System.out.println("Now using Stream API");

        add_ProductDetails().stream().filter((product) -> product.getProduct_Price() > 1000).forEach(System.out::println);

    }

    public static List<Product> add_ProductDetails() {
        List<Product> listOfProducts = new ArrayList<Product>();
        listOfProducts.add(new Product(1, "Pen", 50));
        listOfProducts.add(new Product(2, "Apple", 1002));
        listOfProducts.add(new Product(3, "Mobile Phone", 15000));
        return listOfProducts;
    }
}


class Product {
    private int product_ID;
    private String product_Name;
    private int product_Price;

    public Product(int id, String name, int price) {
        product_ID = id;
        product_Name = name;
        product_Price = price;
    }

    public int getProduct_ID() {
        return product_ID;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public int getProduct_Price() {
        return product_Price;
    }

    @Override
    public String toString() {
        return "[" +
                "product_ID=" + product_ID +
                ", product_Name='" + product_Name + '\'' +
                ", product_Price=" + product_Price +
                ']';
    }
}