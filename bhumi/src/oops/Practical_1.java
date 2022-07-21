package oops;

class Student{
	
	//states / attributes / data member
	int rollNo;
	String name;
	String course;
	String email;
	
	
	//member function or behavior / properties
	
		void setData(int r, String n, String c, String e)
		{
			 r = rollNo;
			 n = name;
			 c = course;
			 e = email;
		
		}
		
		String getName()
		{
			return name;
		}
	
	
	void showDetails()
	{
		System.out.println("Roll No :"+rollNo);
		System.out.println("Name :"+name);
		System.out.println("Course :"+course);
		System.out.println("Email :"+email);
	}
		
	
}


public class Practical_1 {
	
	public static void main(String[] args) {
		
		//initialization of an object by reference
		Student s1 = new Student();
		s1.rollNo = 1;
		s1.name = "Bhumi";
		s1.course = "Android";
		s1.email = "bhumi@gmail.com";
		
		s1.showDetails();
		 
		System.out.println("-------------------------------------------");
		//initialization of an object using by method
		 
		Student s2 = new Student();
		s2.setData(2,"Nisha", "Java", "nisha@gmail.com");
		
		s2.showDetails();
		
		System.out.println("User name :"+s1.getName());
		
		
	}

}
