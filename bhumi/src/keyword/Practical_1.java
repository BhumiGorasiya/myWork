package keyword;

class Test{
	 	
		String name = "Tops";
		
		final void display()
		{
			System.out.println(name);
		}
}
class Derived extends Test{
	
}

public class Practical_1 {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.display();
		
		t1.name = "Tops Technologies";
		t1.display();
		 
		// Q practice
		
		int Integer = 24;
		char String = 'i';
		
		System.out.println(Integer);
		System.out.println(String);
		
		byte x = 127;
		
		x++;
		x++;
		x++;
		System.out.println(x);
	}
}
