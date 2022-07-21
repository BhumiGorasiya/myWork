package exception;

public class try_catch {
	
public static void main(String[] args) {
	
	try {
		
		System.out.println("Program start");
		int num[] = {23,36,16,78,32,96};
		System.out.println("Value at index-7 : "+num[2]);
		
		String str = "123Rs";
		System.out.println(Integer.parseInt(str)+10);
		
		String name = null;
		System.out.println("length : "+name.length());
		
		int nums = 20;
		System.out.println("result "+(20/0));
		
	}catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		
	}finally {
		System.out.println("Finally block called");
	}
	
	System.out.println("All code executed");
}

}
