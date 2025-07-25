package com.shreya.practice.java8Features.streamApi;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

        StreamDemo streamDemo = new StreamDemo();
        List<Product> products = streamDemo.generateListData();

        //-----------------------------------------------------------
        // without streams
        List<Float> productPriceList = new ArrayList<Float>();
        for (Product product : products) {
            // filtering data of list
            if (product.price() > 30000) {
                productPriceList.add(product.price());    // adding price to a productPriceList
            }
        }
        System.out.println("Without streams: " + productPriceList);   // displaying data
        //-----------------------------------------------------------

        // using streams
        List<Float> productPriceList2 = products.stream()
                .parallel() // parallel processing
                .filter(product -> product.price() > 30000 && product.price() < 100000)// filtering data
                .map(Product::price)// fetching price
                .toList(); // collecting as list
        //.collect(Collectors.toList()); // collecting as list

        System.out.println("With streams: " + productPriceList2);

        //-----------------------------------------------------------
        Map<Integer, Product> productMap = streamDemo.generateMapData();

        System.out.println("---------------------------------");
        System.out.println("Entry processing without stream:");
        // iterating over map using iterator
        Iterator<Entry<Integer, Product>> iterator = productMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Product> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("---------------------------------");
        System.out.println("Entry processing with stream:");
        // parallel stream
        productMap.entrySet().parallelStream().forEach(entry -> {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        });

        System.out.println("Map processed with streams: " + productMap);
        System.out.println("---------------------------------");

        // set demonstration
        Set<Product> newFilteredProductSet = productMap.entrySet().stream()
                .filter(entry -> entry.getKey() < 5)
                .map(Map.Entry::getValue)
                //.map(entry -> entry.getValue())
                .limit(3) // limit demonstration
                .collect(Collectors.toSet());
        System.out.println("Set with streams: " + newFilteredProductSet);

        Optional<Product> optional = newFilteredProductSet.stream().parallel().findFirst();
        optional.ifPresent(System.out::println);
        Object[] prices = newFilteredProductSet.stream().parallel()
                .filter(product -> product.price() > 4000)
                .map(product -> product.price())
                .toArray();

        System.out.println(prices);
    }

    // externalised data generation
    private List<Product> generateListData() {
//        List<Product> products = new ArrayList<>();
//        //Adding Products
//        products.add(new Product(1, "HP Laptop", 25000f));
//        products.add(new Product(2, "Dell Laptop", 30000f));
//        products.add(new Product(3, "Lenevo Laptop", 28000f));
//        products.add(new Product(4, "Sony Laptop", 28000f));
//        products.add(new Product(5, "Apple Laptop", 90000f));
//        return products;

        return List.of(
                new Product(1, "HP Laptop", 25000f),
                new Product(2, "Dell Laptop", 30000f),
                new Product(3, "Lenevo Laptop", 28000f),
                new Product(4, "Sony Laptop", 28000f),
                new Product(5, "Apple Laptop", 90000f)
        );
    }

    // externalised data generation
    private Map<Integer, Product> generateMapData() {
        // collect() & Collectors.toMap() demonstration
        // Function.identity() usage
        return generateListData().stream()
                //.collect(Collectors.toMap(product -> product.id(), product -> product));
                //.collect(Collectors.toMap(Product::id, product -> product));
                .collect(Collectors.toMap(Product::id, Function.identity()));
    }
}