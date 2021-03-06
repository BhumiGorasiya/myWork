package collaction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Person implements Comparable<Person>
{
	private int age;
	private String name;
	private String email;
	
	public Person(int age, String name, String email) {
		
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

	
	@Override
	public int compareTo(Person o) {
		
		return name.compareTo(o.name);
	}
	
	/*
	@Override
	public int compareTo(Person obj) {
		
		if(age>obj.age) {
			return 1;
		}else if(age<obj.age) {
			return -1;
		}
		return 0;
	}
	*/
}

public class Practical_4 {
	public static void main(String[] args) {
		
			
			ArrayList<Person> personList = new ArrayList<Person>();
			personList.add(new Person(18, "Rahul", "rahul@gmail.com"));
			personList.add(new Person(16, "Vinay", "vinay@gmail.com"));
			personList.add(new Person(24, "Beena","rima@gmail.com"));
			Collections.sort(personList);
			
			for(Person p : personList)
			{
				System.out.println("name : "+p.getName()+"\t"+"age : "+p.getAge());
			}
			
	}
}
