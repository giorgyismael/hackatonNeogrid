package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import enums.Products;
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


				if (path.toString().contains("caminhao")) {
					String line = br.readLine();
					Vehicles tipo = compareEnumVehicles(line);
					String peso = br.readLine();
					String destino = br.readLine();
					vehicle = VehicleVO.builder().type(tipo).destiny(destino).amount(Double.valueOf(peso)).build();
					listVehicle.add(vehicle);
				} else {
					String line = br.readLine();
					Products tipo = compareEnumProducts(line);
					String peso = br.readLine();
					String destino = br.readLine();
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

	public Products compareEnumProducts(String line) {
		for (int contador = 0; contador <= Products.values().length; contador++) {
			Products c = Products.values()[contador];
			c.getDescription();
			if (c.getDescription().equals(line)) {
				return c;
			}

		}
		return Products.ERROR;
	}
	
	public Vehicles compareEnumVehicles(String line) {
		for (int contador = 0; contador <= Vehicles.values().length; contador++) {
			Vehicles c = Vehicles.values()[contador];
			c.getDescription();
			if (c.getDescription().equals(line)) {
				return c;
			}

		}
		return Vehicles.ERROR;
	}

}
