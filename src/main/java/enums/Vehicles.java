package enums;

import lombok.Getter;

@Getter
public enum Vehicles {

	GENERAL("Geral"),
	ELECTRONIC("Eletronicos"),
	FOODS("Alimentos"),
	REFRIGERATES("Refrigerados"),
	TOUR("Passeio"),
	ERROR("Formato inválido");

	private String description;
	
	private Vehicles(String description) {
		this.description = description;
	}
}