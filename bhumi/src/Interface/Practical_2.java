package Interface;

interface Bank{
	
		float getInterestRate();
}

class SBI implements Bank{
	
	@Override
	public float getInterestRate() {
		// TODO Auto-generated method stub
		return 7.5f;
	}
}

class ICICI implements Bank{
	@Override
	public float getInterestRate() {
		// TODO Auto-generated method stub
		return 8.5f;
	}
}

public class Practical_2 {
	public static void main(String[] args) {
		
		ICICI b1 = new ICICI();
		SBI b2 = new SBI();
		
		System.out.println("interest rate of SBI :"+b2.getInterestRate());
		System.out.println("interest rate of ICICI :"+b1.getInterestRate());
	}

}
