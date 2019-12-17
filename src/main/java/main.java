import java.io.File;
import java.util.ArrayList;

import application.FileLoader;
import vo.ProductVO;
import vo.VehicleVO;

public class main {

	public static void main(String[] args) {
		System.out.println("hello");
		
		ArrayList<ProductVO> listProduct = new ArrayList<ProductVO>();
		ArrayList<VehicleVO> listVehicle = new ArrayList<VehicleVO>();
		
		FileLoader p = new FileLoader();
		File file = new File("C:\\Users\\User-000\\Desktop\\Dados Hackaton 2019\\teste1");
		p.buildFile(file,listProduct,listVehicle);
		
	}

}
