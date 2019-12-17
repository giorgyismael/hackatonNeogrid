package entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
	
	private String type;
	private Double weight;
	private Integer destiny;
	
	public Product() {
		
		}
	
	public Product(String name, Double price, Integer quantity) {
		
		this.type = name;
		this.weight = price;
		this.destiny = quantity;
	}
	
	public String toString(){
		return type 
				+ ", " 
				+ String.format("%.2f", totalAmount());
	}
	
	public double totalAmount() {
		return destiny * weight;
	}
	
}