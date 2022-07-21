
package inheritance;

class A{
	
	int a = 10;
	
	void showA() {
		
		System.out.println("class A method called");
	}
	
}

class B extends A{
	
	int a = 30;
	
	void showB() {
		
		System.out.println("class B method called");
	}
}

public class single_Inheritance {
	public static void main(String[] args) {
		
		A objA = new A();
		objA.showA();
		
		System.out.println("--------------------------------------------------");
		
		B objB = new B();
		objB.showB();
		objB.showA();  // parent class method called
		
	}

}