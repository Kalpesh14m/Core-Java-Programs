package com.java.kalpesh.java_eight.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product2 {
	int id;
	String name;
	float price;

	public Product2(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}
}

public class StreamIterating {

	public static void main(String[] args) {
		// Iterating Example
		// Print digit form 1 to 10
		Stream.iterate(1, i->i+3).limit(200).forEach(i->System.out.println(i));
		Stream.iterate(1, i -> i + 1).limit(10).forEach(System.out::print);
		System.out.println("\n\n");

		// Print even number in 1 to 10
		Stream.iterate(1, i -> i + 1).filter(i -> i % 2 == 0).limit(10).forEach(i -> System.out.println("Even " + i));

		System.out.println("\n\n");
		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
				.forEach(System.out::println);

		// Filtering and Iterating Collection
		// Find cost of 30000 lappy
		List<Product2> productsList = new ArrayList<Product2>();
		productsList.add(new Product2(1, "HP Laptop", 25000f));
		productsList.add(new Product2(2, "Dell Laptop", 30000f));
		productsList.add(new Product2(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product2(4, "Sony Laptop", 28000f));
		productsList.add(new Product2(5, "Apple Laptop", 90000f));

		productsList.stream().filter(product -> product.price == 30000)
				.forEach(product -> System.out.println(product.name));

		// reduce() Method in Collection
		Float totalPrice = productsList.stream().map(product -> product.price).reduce(0.0f,
				(sum, price) -> sum + price);
		System.out.println("Total Price : " + totalPrice);

		// reduce() Method in Collection
		float totalPrice1 = productsList.stream().map(p -> p.price).reduce(0.0f, Float::sum);
		System.out.println("Total Price 1" + totalPrice1);

		// Sum by using Collectors Methods
		double totalPrice3 = productsList.stream().collect(Collectors.summingDouble(p -> p.price));
		System.out.println("Total Price 3 : " + totalPrice3);

		// Find Max Product Price
		Product2 productA = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();

		System.out.println("Product : \nName : " + productA.name + "\nPrice : " + productA.price);

		// Find Min Product Price
		Product2 productB = productsList.stream().min((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();

		System.out.println("Product : \nName : " + productB.name + "\nPrice : " + productB.price);

		// count() Method in Collection
		System.out.println(productsList.stream().filter(prod -> prod.price > 20000).count());

		// Convert List into Set
		Set<Float> listToSet = productsList.stream().filter(p -> p.price < 30000).map(p -> p.price)
				.collect(Collectors.toSet());

		System.out.println(listToSet);

		// Convert List into Map
		Map<Integer, String> listToMap = productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println(listToMap);

		// Method Reference in stream
		List<Float> productPriceList = productsList.stream().filter(p -> p.price < 30000).map(Product2::getPrice)
				.collect(Collectors.toList());

		System.out.println(productPriceList);
	}
}
