package inheritance;

class A{
	
	int a = 10;
	
	void showA()
	{
		System.out.println("class A method called");
	}
}

class B extends A{
	
	int b = 20;
	
	void showB()
	{
		System.out.println("class B method called");
	}
}

class C extends A{
	
	int c = 30;
	
	void showC()
	{
		System.out.println("class C method called");
		
	
	}
}
public class hirarchaical_inheritance {

	public static void main(String[] args) {
		
		A objA = new A();
		objA.showA();
		
		System.out.println("-------------------");
		
		B objB = new B();
		objB.showA();
		objB.showB();
		
		
		System.out.println("---------------------");
		
		C objC = new C();
		objC.showA();
		objC.showC();
	}
}
