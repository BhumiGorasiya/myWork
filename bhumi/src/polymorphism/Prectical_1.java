package polymorphism;

class test{
	
		void add(int a, int b)
		{
			System.out.println("addition (int) :"+(a+b));
		}
		void add(float a, float b)
		{
			System.out.println("addition (float) :"+(a+b));
		}
		void add(int a, float b)
		{
			System.out.println("addition (int-float) :"+(a+b));
		}
		void add(int a, int b, int c)
		{
			System.out.println("addition (int) :"+(a+b+c));
		}
		
}

public class Prectical_1 {
	public static void main(String[] args) {
		
		test t1 = new test();
		t1.add(34,45);
		t1.add(23.5f, 38.5f);
		t1.add(23, 48.5f);
		t1.add(23, 78, 12);
		
		
		String str = "T/o/p/s";
		
		String array[] = str.split("/",2);
		for(String s : array)
		{
			System.out.println(s);
		}
		
	}
	

}
