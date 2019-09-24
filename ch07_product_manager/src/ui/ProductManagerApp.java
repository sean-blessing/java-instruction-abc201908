package ui;

import java.util.Arrays;

import model.LineItem;
import model.Product;

public class ProductManagerApp {

	public static void main(String[] args) {

		// create an instance of Product
		Product net = new Product(".Net", "Murach's .Net Programming", 59.50);
		
		// create an instance of LineItem
		LineItem li = new LineItem(net, 8);
		
		// print contents to the console.
		System.out.println(net);
		System.out.println(li);
		
		// create an array of Products
		Product java = new Product("Java", "Murach's Java Programming", 57.50);
		Product html = new Product("HTML", "Murach's HTML and CSS", 55.50);
		Product mysql = new Product("MySQL", "Murach's MySQL", 49.50);
		
		Product[] products = {net, java, html, mysql};
		
		System.out.println("List of products - unsorted");
		for (Product p: products) {
			System.out.println(p);
		}
		System.out.println("List of products - sorted");
		Arrays.sort(products);
		for (Product p: products) {
			System.out.println(p);
		}
		
		
	}

}
