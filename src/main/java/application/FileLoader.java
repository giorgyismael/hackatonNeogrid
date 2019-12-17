package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import vo.ProductVO;
import vo.VehicleVO;

public class FileLoader{

	public String buildFile(File file, ArrayList<ProductVO> listProduct, ArrayList<VehicleVO> listVehicle) {

		File[] listFiles = file.listFiles();

		entityFilter(listFiles, listProduct, listVehicle);

		return String.valueOf(file);
	}

	private void entityFilter(File[] listFiles, ArrayList<ProductVO> listProduct, ArrayList<VehicleVO> listVehicle) {
		ProductVO product;
		VehicleVO vehicle;
		for (File path : listFiles) {
			try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				String line = br.readLine();

				String type = line;
				Double weight = Double.valueOf(br.readLine());
				String destiny = br.readLine();

				if (path.toString().contains("caminhao") && weight > 0) {
					vehicle = VehicleVO.builder().type(type).destiny(destiny).amount(weight).build();
					listVehicle.add(vehicle);

					moveFile(path);

				} else if (weight > 0) {
					product = ProductVO.builder().type(type).destiny(destiny).amount(weight).build();
					listProduct.add(product);

					moveFile(path);
				}
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}

			System.out.println(listVehicle.toString());
			System.out.println(listProduct.toString());
		}
	}

	private void moveFile(File path) {
		if (path.renameTo(new File("C:\\Users\\User-000\\Desktop\\Dados Hackaton 2019\\teste1\\" + path.getName()))) {
			System.out.println("File is moved successful!");
			path.delete();
		} else {
			System.out.println("File is failed to move!");
		}
	}
}
