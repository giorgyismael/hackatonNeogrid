package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import vo.ProductVO;
import vo.VehicleVO;

public class FileLoader {

	public String buildFile(File file, ArrayList<ProductVO> listProduct, ArrayList<VehicleVO> listVehicle) {

		File[] listFiles = file.listFiles();

		entityFilter(listFiles, listProduct, listVehicle);

		System.out.println(listVehicle.toString());
		System.out.println(listProduct.toString());
		return String.valueOf(file);
	}

	private void entityFilter(File[] listFiles, ArrayList<ProductVO> listProduct, ArrayList<VehicleVO> listVehicle) {
		ProductVO product;
		VehicleVO vehicle;
		for (File path : listFiles) {
			try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				String line = br.readLine();

				String type = line;
				String weight = br.readLine();
				String destiny = br.readLine();

				if (path.toString().contains("caminhao")) {
					vehicle = VehicleVO.builder().type(type).destiny(destiny).amount(Double.valueOf(weight)).build();
					listVehicle.add(vehicle);
				} else {
					product = ProductVO.builder().type(type).destiny(destiny).amount(Double.valueOf(weight)).build();
					listProduct.add(product);
				}
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}
