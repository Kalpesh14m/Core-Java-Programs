package com.java.kalpesh.java_eight.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class De {
	int id;
	String name;
	float price;

	public De(int id, String name, float p) {
		this.id = id;
		this.name = name;
		this.price = p;
	}

}

public class demo {
	public static void main(String[] args) {
//		Stream.iterate(1, i -> i + 3).limit(10)./* filter(i -> i % 2 == 0). */forEach(i -> System.out.println(i));

		List<De> d = new ArrayList<De>();

		d.add(new De(1, "A", 10.2f));
		d.add(new De(2, "B", 33.2f));
		d.add(new De(3, "C", 55.2f));
		d.add(new De(4, "D", 166.2f));
		d.add(new De(5, "E", 18.2f));

		d.forEach(k -> System.out.println(k.id));

		Map<Integer, String> m = d.stream().collect(Collectors.toMap(i -> i.id, v -> v.name));
		System.out.println(m);
	}
}
