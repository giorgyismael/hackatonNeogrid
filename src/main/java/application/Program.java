package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String path  ="c:\\temp\\produtos.csv";
		List<Product> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String itemCsv = br.readLine();
			
			
			while (itemCsv != null ) {
				
				String[] teste = itemCsv.split(",");
				String name = teste[0];
				double price =Double.valueOf(teste[1]);
				int quantity = Integer.valueOf(teste[2]);
					
				list.add(new Product(name, (price), quantity));
				
				itemCsv = br.readLine();
			}
			
			path = "c:\\temp";
			String strPath = path + "\\out";
			boolean sucess = new File(strPath).mkdir();
			System.out.println(sucess);
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(strPath + "\\summary.csv"))){
				for (Product line : list ) {
					bw.write(line.toString());
					bw.newLine();
				}
			}
			catch(IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
			
		}
		catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		
		

	}

}