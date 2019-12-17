package vo;

import enums.Products;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class ProductVO{
	
	private Double amount;
	private String destiny;
	private Products type;
	
	@Override
	public String toString() {
		return "ProductVO [amount=" + amount + ", destiny=" + destiny + ", type=" + type + "]";
	}
	
}
