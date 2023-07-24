package beans;

import java.util.Date;
import java.util.List;

public class Customer extends User {
	
	private List<Order> orders;
	private Cart cart;
	private int points;
	private CustomerType type;
	
	public Customer() {

	}
	
	public Customer(String username, String password, String name, String surname, Gender gender, Role role,
			Date dateOfBirth, List<Order> orders, Cart cart, int points, CustomerType type) {
		super(username, password, name, surname, gender, role, dateOfBirth);
		this.orders = orders;
		this.cart = cart;
		this.points = points;
		this.type = type;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public CustomerType getType() {
		return type;
	}
	public void setType(CustomerType type) {
		this.type = type;
	}
}
