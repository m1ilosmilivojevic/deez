package beans;

import java.util.List;

public class Cart {
	
	private List<Vehicle> vehicles;
	private Customer customer;
	private int price;
	
	public Cart() {
		super();
	}
	
	public Cart(List<Vehicle> vehicles, Customer customer, int price) {
		super();
		this.vehicles = vehicles;
		this.customer = customer;
		this.price = price;
	}
	public List<Vehicle> getVehicle() {
		return vehicles;
	}
	public void setVehicle(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
