package model;

public class Product implements Comparable {
	private String code;
	private String description;
	private double price;
	static final int CONSTANT_VAR = 7;
	
	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}

	public Product() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		Product p = (Product)arg0;
		int c = this.code.compareTo(p.getCode()); 
		System.out.println("comparing "+this.code+" to "+p.getCode()+"... "+c);
		return c;
	}
	
	

}
