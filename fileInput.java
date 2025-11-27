import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class fileInput {
	
	private static Laptop[] laptopArray = new Laptop[40];
	
	public static void main(String[] args) {
		
		fillLaptop();
		
	}
	
	private static void fillLaptop() {
		
		try {
			
			Scanner inputFile = new Scanner(new File("Laptops.csv"));
			
			inputFile.useDelimiter(",|\r\n");
			
			for (int index = 0; index < laptopArray.length; index++) {
				String brand = inputFile.next();
				String model = inputFile.next();
				String type = inputFile.next();
				double price = inputFile.nextDouble();
				int qualityRating = inputFile.nextInt();
				String cpuBrand = inputFile.next();
				String cpuType = inputFile.next();
				String cpuModel = inputFile.next();
				int cpuCores = inputFile.nextInt();
				double cpuSpeed = inputFile.nextDouble();
				int speedRating = inputFile.nextInt();
				int memory = inputFile.nextInt();
				int storage = inputFile.nextInt();
				int memoryRating = inputFile.nextInt();
				String gpuBrand = inputFile.next();
				String gpuModel = inputFile.next();
				String connectivity = inputFile.next();
				String operatingSystem = inputFile.next();
				double displaySize = inputFile.nextDouble();
				String resolution = inputFile.next();
				boolean touchscreen = inputFile.nextBoolean();
				double weight = inputFile.nextDouble();
				int portabilityRating = inputFile.nextInt();
				String hyperlink = inputFile.next();
				int score = 0;
				
				laptopArray[index] = new Laptop(brand, model, type, price, qualityRating, cpuBrand, cpuType, cpuModel, cpuCores,
						cpuSpeed, speedRating, memory, storage, memoryRating, gpuBrand, gpuModel, connectivity, operatingSystem,
						displaySize, resolution, touchscreen, weight, portabilityRating, hyperlink, score);
			}
			
			inputFile.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File Error");
			
		}
	}

}
