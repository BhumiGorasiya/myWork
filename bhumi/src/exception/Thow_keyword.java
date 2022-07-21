package exception;

class MyException extends Exception{
	
	public MyException(String message) {
		super(massage);
	}
}

public class Thow_keyword {
	
	void validate(int age) {
		
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}else
		{
			try {
					throw new MyException("Not Eligible");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		validate(14);
		System.out.println("All code executed");
		
		
	}

}
