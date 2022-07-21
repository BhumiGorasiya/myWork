package inheritance;

class Person{					//Parent or Base or Super class
	
	int id;
	String name;
	String email;
	String address;
	
	String getName() 
	{
		return name;
		
	}
	
	
	
}

class Student extends Person{
	
	String course;
	
	void show() 
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("Address : "+address);
		System.out.println("Course : "+course);
		
	}
}

class Faculty extends Person{
	
	double salary;
	String department;
	
	void show() 
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("Address : "+address);
		System.out.println("Salary : "+salary);
		System.out.println("Department : "+department);
	}
}

public class Practical_1 {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.id = 12;
		s1.name = "Bhumi";
		s1.email = "bhumi@gmail.com";
		s1.address = "Surat";
		s1.course = "Java";
		
		s1.show();
		
		System.out.println("---------------------------------");
		
		Faculty f1 = new Faculty();
		f1.id = 23;
		f1.name = "Ronak";
		f1.email = "ronak2gmail.com";
		f1.address = "Surat";
		f1.salary = 3000.00;
		f1.department = "Technical";
		
		f1.show();
		
		System.out.println(s1.getName());
		System.out.println(f1.getName());
		
	}

}
