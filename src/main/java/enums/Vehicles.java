package enums;

public enum Vehicles {
	GENERAL("Geral"),
    ELECTRONIC("Eletronicos"),
    FOODS("Alimentos"),
    REFRIGERATES("Refrigerados"),
    TOUR("Passeio");
	
	private Vehicles(String description) {
		this.description = description;
	}

	private String description;
}
