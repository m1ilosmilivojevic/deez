package dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import beans.Customer;
import beans.User;
import beans.User.Role;

public class UserDao {

	private String filePath = "../files/users.json";
	File file = new File(filePath);
	private List<User> users;
	
	public UserDao() {
		this.users = new ArrayList<User>();
	}
	
	public void getAll(){
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			users = objectMapper.readValue(file, new TypeReference<List<User>>() {});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void save() {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			objectMapper.writeValue(file, users);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void create(User user) {
		user.setId(users.size() + 1);
		user.setRole(Role.Customer);
		Customer customer = (Customer) user;
		users.add(customer);
		save();
	}
	
	public User getOne(String username) {
		for (User user : users) {
			if(user.getUsername() == username) {
				return user;
			}
		}
		
		return null;
	}
}
