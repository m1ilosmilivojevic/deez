package beans;

import java.util.Date;

public class Administrator extends User {
	
	public Administrator() {
		super();
	}
	
	public Administrator(int id, String username, String password, String name, String surname, Gender gender, Role role,
			Date dateOfBirth) {
		super(username, password, name, surname, gender, role, dateOfBirth);
	}
}
