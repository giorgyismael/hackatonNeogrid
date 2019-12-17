package enums;

public enum Products {
	FOODS("Alimento"),
	REFRIGERATES("Refrigerado"),
	ELECTRONIC("Eletronico");
	
	private String description;

	private Products(String description) {
		this.description = description;
	}
}
