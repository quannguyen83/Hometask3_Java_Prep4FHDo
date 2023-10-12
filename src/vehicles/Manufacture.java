package vehicles;

public class Manufacture {
	private String brand;
	private String model;
	private int yearOfManufacture;
	private int price;
	
	public Manufacture (String brand, String model, int yearOfManufacture, int price) {
		this.setBrand(brand);
		this.setModel(model);
		this.setPrice(price);
		this.setYearOfManufacture(yearOfManufacture);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void printManufactureAttributes() {
		System.out.println("\tManufacture: " + "\n\t\tBrand: " + this.brand
				+ "\n\t\tModel: " + this.model 
				+ "\n\t\tManufacture year: " + this.yearOfManufacture
				+ "\n\t\tPrice: " + this.price + " euros");
	}
}
