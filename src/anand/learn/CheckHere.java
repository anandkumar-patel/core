package anand.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CheckHere {
	public static void main(String[] args) {
		List<String> allowedLocation = Arrays.asList("mumbai", "bangalore");
		ApplicationAuthState obj = new ApplicationAuthState(allowedLocation);
		
		User user1 = new User(1, "anand@gmail.com", "anand", "mumbai");
		User user2 = new User(1, "anand@gmail.com", "anand", "mumbai");
		User user3 = new User(1, "anand@gmail.com", "anand", "mumbai");
		User user4 = new User(1, "anand@gmail.com", "anand", "mumbai");
		User user5 = new User(1, "anand@gmail.com", "anand", "mumbai");
		
		String result1 = obj.register(user1);
		String result2 = obj.register(user4);
		
		System.out.println(result1);
		System.out.println(result2);

		
	}
}
	
class ApplicationAuthState {
	private List<User> registeredUsers;
	private List<User> loggedinUsers;
	private List<String> allowedLocation;
	public ApplicationAuthState(List<String> allowedLocation) {
		super();
		this.allowedLocation = allowedLocation;
		this.registeredUsers = new ArrayList<User>();
		this.loggedinUsers = new ArrayList<User>();
	}
	
	public String register(User user) {
		// check if user is duplicate then don't register
		// user can register from any location
		boolean exists = registeredUsers.stream().anyMatch(u -> u.getEmail().equalsIgnoreCase(user.getEmail()));
		if (exists) {
			return user.getEmail() + " is already registered!";
		} else {
			registeredUsers.add(user);
			return user.getEmail() + " registered successfully!";
		}
	}
	
	public String login(User user) {
		// user can login only from from allowedlocation
		//
		return null;
	}
	
	public String logout(User user) {
		boolean loggedin = loggedinUsers.stream().anyMatch(u -> u.getEmail().equalsIgnoreCase(user.getEmail()));
		if(loggedin) {
			loggedinUsers.remove(user);
			return "";
		} else {
			return "";
		}
	}
	
}

class User {
	private int id;
	private String email;
	private String password;
	private String location;
	private int incorrectAttempt;
	
	public User(int id, String email, String password, String location) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.location = location;
		this.incorrectAttempt =0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getIncorrectAttempt() {
		return incorrectAttempt;
	}

	public void setIncorrectAttempt(int incorrectAttempt) {
		this.incorrectAttempt = incorrectAttempt;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, location, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(location, other.location)
				&& Objects.equals(password, other.password);
	}
	
	
}