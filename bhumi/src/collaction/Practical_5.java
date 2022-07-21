package collaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User{
	
	private int age;
	private String name;
	private String email;
	
	public User(int age, String name, String email) {
		
		this.age = age;
		this.name = name;
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	class AgeComparator implements Comparator<User>{
		
		
		
		
	}
	class NameComparator implements Comparator<User>{
		
	}
	
}

public class Practical_5 {
	public static void main(String[] args) {
		
	ArrayList<User> userList = new ArrayList<User>(); 
	userList.add(new User(16,"Rahul", "rahul@gmail.com"));
	userList.add(new User(18, "Mehul","mehul@gmail.com"));
	userList.add(new User(0, "Sita", "sita@gmail.com"));
	
	Collections.sort(userList, new Comparator());
		
		
	}

}
