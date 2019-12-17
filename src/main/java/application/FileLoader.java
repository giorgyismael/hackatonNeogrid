package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import enums.Product;
import enums.Vehicles;
import vo.ProductVO;
import vo.VehicleVO;

public class FileLoader {

	public String buildFile() {
		File file = new File("C:\\Users\\User-000\\Desktop\\Dados Hackaton 2019\\teste1");
		File[] listFiles = file.listFiles();
		int fileAmount = listFiles.length;
		ArrayList<ProductVO> listProduct = new ArrayList<ProductVO>();
		ProductVO product;
		ArrayList<VehicleVO> listVehicle = new ArrayList<VehicleVO>();
		VehicleVO vehicle;

		for (File path : listFiles) {
			try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				String line = br.readLine();

				String tipo = line;
				String peso = br.readLine();
				String destino = br.readLine();

				if (path.toString().contains("caminhao")) {
					vehicle = VehicleVO.builder().type(tipo).destiny(destino).amount(Double.valueOf(peso)).build();
					listVehicle.add(vehicle);
				} else {
					product = ProductVO.builder().type(tipo).destiny(destino).amount(Double.valueOf(peso)).build();
					listProduct.add(product);
				}
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		System.out.println(listVehicle.toString());
		System.out.println(listProduct.toString());
		return String.valueOf(file);
	}
}
