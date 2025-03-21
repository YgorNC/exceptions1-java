package entities;

public class Product {

	private String name;
	private Double price;
	private String priceTag;
	
	public Product() {
	}
	
	public Product(String name, Double price, String priceTag) {
		this.name = name;
		this.price = price;
		this.priceTag = priceTag;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getPriceTag() {
		return priceTag;
	}
	
	public void setPriceTag(String priceTag) {
		this.priceTag = priceTag;
	}
}
