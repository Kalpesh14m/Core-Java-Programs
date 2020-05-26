package com.java.kalpesh.java_eight.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class CollectorsExample {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		// Fetching data as a List
		List<Float> productPriceList = productsList.stream().map(x -> x.price) // fetching price
				.collect(Collectors.toList()); // collecting as list

		System.out.println(productPriceList);

		// Converting Data as a Set
		Set<Float> listToSet = productsList.stream().map(x -> x.price) // fetching price
				.collect(Collectors.toSet()); // collecting as list
		System.out.println(listToSet);

		// Convert List into Map
		Map<Integer, String> listToMap = productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println(listToMap);

		// using sum method
		Double sumPrices = productsList.stream().collect(Collectors.summingDouble(x -> x.price)); // collecting as list
		System.out.println("Sum of prices: " + sumPrices);

		// Getting Product Average Price
		Double average = productsList.stream().collect(Collectors.averagingDouble(p -> p.price));
		System.out.println("Average price is: " + average);

		// Counting Elements
		Long noOfElements = productsList.stream().collect(Collectors.counting());
		System.out.println("Total elements : " + noOfElements);
	}
}
