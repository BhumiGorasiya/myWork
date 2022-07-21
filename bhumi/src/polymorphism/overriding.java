package polymorphism;

class Base{
	
		int a = 12;
		
		void result(int num1, int num2)						//overridden method
		{
			System.out.println("Parent :"+(num1+num2));
		}
}

//super keyword is a reference variable which refers parent.

class Child extends Base{
	
		int a = 30;
		
		void result(int n1, int n2)							//overriding method
		{
			System.out.println("Child :"+(n1*n2));
			super.result(n1, n2);                          //parent class method
		}
		
		void show()
		{
			System.out.println(a);                        //child class method
			System.out.println(super.a);                  //parent class method
		}
}

public class overriding {
	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.result(25, 38);
	
		c1.show();                                        //will call child class method
		
	}

}
