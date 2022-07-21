package exception;

public class Throws_keywords {
	
	static void validate(int age) {
		
		if(age>=18)
		{
			System.out.println("eligible to vote");
		}else
		{
			try {
					throw new MyException("Not eligible");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
	}

}
