package enums;

import lombok.Getter;

@Getter
public enum Products {

	FOODS("Alimento"),
	REFRIGERATES("Refrigerado"),
	ELECTRONIC("Eletronico"),
	ERROR("Formato inv�lido");

	private String description;
	
	private Products(String description) {
		this.description = description;
	}
}