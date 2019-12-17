package vo;

import enums.Vehicles;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class VehicleVO{
	private Double amount;
	private String destiny;
	private Vehicles type;
	
	@Override
	public String toString() {
		return "VehicleVO [amount=" + amount + ", destiny=" + destiny + ", type=" + type + "]";
	}
	
	
}
