package enums;

public enum Product {
	FOODS("Alimento"),
	REFRIGERATES("Refrigerado"),
	ELECTRONIC("Eletronico");
	
	private String description;

	private Product(String description) {
		this.description = description;
	}
	
}
