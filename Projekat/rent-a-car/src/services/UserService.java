package services;

import java.util.List;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.catalina.filters.ExpiresFilter.XHttpServletResponse;

import beans.User;
import dao.UserDao;

@Path("/users")
public class UserService {

	@Context ServletContext ctx;
	
	@POST
	@Path("/signin")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response signin(User user) {
		UserDao userDao = getUsers();
		
		if(userDao.getOne(user.getUsername()) != null) {
			return Response.status(Response.Status.BAD_REQUEST).entity("That username is already taken. You need to enter different one!").build();
		}
		
		userDao.create(user);
		
		return Response.status(Response.Status.ACCEPTED).entity("/login").build();
		
	}
	
	private UserDao getUsers() {
		UserDao users = (UserDao) ctx.getAttribute("users");
		
		if(users == null) {
			users = new UserDao();
			users.getAll();
			ctx.setAttribute("users", users);
		}
		
		return users;
	}
}
