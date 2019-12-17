import java.util.ArrayList;

import enums.Product;
import vo.ProductVO;

public class main {

	public static void main(String[] args) {
		System.out.println("hello");
		
		ArrayList<ProductVO> listProduct = new ArrayList<ProductVO>();
		
		ProductVO product;
		
		
		product = ProductVO.builder().type(Product.ELECTRONIC).destiny("joinville").amount(2.34).build();
		listProduct.add(product);
		product = ProductVO.builder().type(Product.FOODS).destiny("curitiba").amount(2.34).build();
		listProduct.add(product);
		
		System.out.println(listProduct.toString());
	}

}
