package vo;

import enums.Products;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class ProductVO extends Base{
	private Products type;

}
