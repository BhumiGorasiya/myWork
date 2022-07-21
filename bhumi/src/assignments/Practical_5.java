package assignments;

import java.util.Scanner;

//• W.A.J.P to check given number is Armstrong or not? 

public class Practical_5 {
	public static void main(String[] args) {
		
		int num, temp, A=0, B;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter of number : ");
		num = scanner.nextInt();
		
		temp=num;
		while(temp!=0)
		{
			B = temp%10;
			A = A+(B* B* B);
			temp = temp/10;
		}
		
		if(num==A)
		{
			System.out.println("Elements is a Armstrog number");
		}else {
			System.out.println("Elements not a Armstrog number");
		}
		
		
	}
	

}
