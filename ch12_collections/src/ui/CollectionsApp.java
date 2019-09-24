package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Product;
import util.Console;

public class CollectionsApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		List<Product> products = new ArrayList<>();
		Map<String, Product> productsMap = new HashMap<>();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// prompt the user to enter a product
			String code = Console.getString("Enter pdt code:  ");
			String desc = Console.getString("Enter pdt desc:  ");
			double price = Console.getDouble("Enter pdt price:  ");
			Product p = new Product(code, desc, price);
			// add that product into our list and map
			products.add(p);
			productsMap.put(code, p);
			
			choice = Console.getString("Continue?");
		}
		
		// print contents of list
		System.out.println("List of products:");
		for (Product p: products) {
			System.out.println(p);
		}
		
		String c = Console.getString("Enter code to retrieve:  ");
		Product p1 = productsMap.get(c);
		System.out.println(p1);
		
		System.out.println("Bye");

	}

}
