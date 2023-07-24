package beans;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
	public enum Status{
		Processing, Approved, Retrieved, Returned, Rejected, Canceled
	}
	
	private String id;
	private List<Vehicle> vehicles;
	private Shop shop;
	private LocalDateTime dateTime;
	private int rentDuration;
	private int price;
	private Customer customer;
	private Status status;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(List<Vehicle> vehicles, Shop shop, LocalDateTime dateTime, int rentDuration, int price,
			Customer customer, Status status) {
		super();
		this.vehicles = vehicles;
		this.shop = shop;
		this.dateTime = dateTime;
		this.rentDuration = rentDuration;
		this.price = price;
		this.customer = customer;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public int getRentDuration() {
		return rentDuration;
	}

	public void setRentDuration(int rentDuration) {
		this.rentDuration = rentDuration;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
