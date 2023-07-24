package beans;

public class Vehicle {
	public enum Type {
		Car, Van, MobileHome;
	}
	public enum Kind{
		Manual, Automatic;
	}
	public enum FuelType{
		Dizel, Gasoline, Hybrid, Electric
	}
	
	private int id;
	private String brand;
	private String model;
	private int price;
	private Type type;
	private Shop shop;
	private Kind kind;
	private FuelType fuelType;	
	private double consumption;
	private int numberOfDoors;
	private int personCapacity;
	private String description;
	private String imageString;
	private boolean status;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String brand, String model, int price, Type type, Kind kind, FuelType fuelType, double consumption,
			int numberOfDoors, int personCapacity, String description, String imageString, boolean status) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.type = type;
		this.kind = kind;
		this.fuelType = fuelType;
		this.consumption = consumption;
		this.numberOfDoors = numberOfDoors;
		this.personCapacity = personCapacity;
		this.description = description;
		this.imageString = imageString;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getPersonCapacity() {
		return personCapacity;
	}

	public void setPersonCapacity(int personCapacity) {
		this.personCapacity = personCapacity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageString() {
		return imageString;
	}

	public void setImageString(String imageString) {
		this.imageString = imageString;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
