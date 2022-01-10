package com.example.lab_5_1;

import java.util.HashMap;

public class ProductListTest {

    public static void main(String[] args) {
        HashMap<String, Product> products = new HashMap<String, Product>();
        products.put("Barbie", new Product("Barbie"));
        products.put("Ken", new Product("Ken"));
        products.put("Dolly", new Product("Dolly"));
        ProductList productList = new ProductList(products);
        productList.printEntries();
        productList.printKeys();
        productList.printValues();
    }


}
