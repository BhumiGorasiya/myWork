package Encapsulation;

class person{
	
	private String name;
	private String gender;
	private int age;
	
	public person()
	{}
	
	public person(String name, String gender, int age)
	{
		this.name = name;
		this.gender = gender; 
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

	

public class Practical_2 {
	public static void main(String[] args) {
		
		person p1 = new person();
		p1.setName("Bhumi");
		p1.setGender("Female");
		p1.setAge(25);
		
		System.out.println("Name :"+p1.getName());
		System.out.println("Gender :"+p1.getGender());
		System.out.println("Age :"+p1.getAge());
		
	System.out.println("************************************");	
	
		person p2 = new person("Nisha", "Female", 23);
		System.out.println("Name :"+p2.getName());
		System.out.println("Gender :"+p2.getGender());
		System.out.println("Age :"+p2.getAge());
		
		
		
	}

}
