package org.fwgreen;

public class Main {

	public static void main(String[] args) {

		var roundtrip = Person.repo.all();
		
		roundtrip.forEach(System.out::println);
	}
}


