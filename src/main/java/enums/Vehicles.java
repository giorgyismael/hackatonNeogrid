package enums;

public enum Vehicles {
	GENERAL(""),
	ELECTRONIC(""),
	FOODS(""),
	REFRIGERATES(""),
	TOUR("");
	
	private Vehicles(String description) {
		this.description = description;
	}

	private String description;
}
