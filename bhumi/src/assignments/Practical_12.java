package assignments;

// WAP to sum values of an array. 

public class Practical_12 {

	public static void main(String[] args) {
		
		int value[] = {1, 2, 3, 4, 5, 6};
		int sum = 0;
		
		for(int i = 0; i<value.length; i++) {
		sum = sum+value[i];
		}
		System.out.println("Sum of all Elements :"+sum);
	}
}
