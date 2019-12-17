package vo;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class ProductVO{
	private Double amount;
	private String destiny;
	private String type;
	@Override
	public String toString() {
		return "ProductVO [amount=" + amount + ", destiny=" + destiny + ", type=" + type + "]";
	}
	
	

}
