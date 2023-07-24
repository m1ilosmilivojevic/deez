package beans;

import java.time.LocalTime;
import java.util.List;

public class Shop {
	private int id;
	private String name;
	private List<Vehicle> vehicles;
	private LocalTime bussinesHours;
	private boolean status;
	private Location location;
	private double rating;	
	
	public Shop() {
		// TODO Auto-generated constructor stub
	}

	public Shop(String name, LocalTime bussinesHours, boolean status, Location location, double rating) {
		super();
		this.name = name;
		this.bussinesHours = bussinesHours;
		this.status = status;
		this.location = location;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public LocalTime getBussinesHours() {
		return bussinesHours;
	}

	public void setBussinesHours(LocalTime bussinesHours) {
		this.bussinesHours = bussinesHours;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}
