package com.example.lab_5_1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductList {
    private HashMap<String, Product> products;

    ProductList(HashMap<String, Product> products){
        this.products = products;
    }

    public void printEntries(){
        Set<Map.Entry<String, Product>> entries = products.entrySet();
        entries.forEach(entry-> System.out.println(entry));

        /** OR
        products.forEach((name, product)-> {
            System.out.println("Name:" + name);
            System.out.println("Product:" + product);
        });
         */
    }

    public void printKeys(){
        Set<String> keys = products.keySet();
        keys.forEach(key-> System.out.println(key));

        /** OR
        products.forEach((name, product)-> {
            System.out.println("Key:" + name);
        });
         */
    }

    public void printValues(){
        Collection<Product> values = products.values();
        values.forEach(key-> System.out.println(values));

        /** OR
        products.forEach((name, product)-> {
            System.out.println("Value:" + product);
        });
         */
    }

    public void setProducts(HashMap<String, Product> products) {
        this.products = products;
    }

    public HashMap<String, Product> getProducts() {
        return products;
    }
}
