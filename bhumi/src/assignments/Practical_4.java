package assignments;

import java.util.Scanner;

//W.A.J.P to check given number is Prime or not? 

public class Practical_4 {
	 public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter number : ");
		 int num= scanner.nextInt();
		 
		 
		 if(prime(num))
		 {
			 System.out.println(num +" is a prime number");
		 }else {
			 System.out.println(num +" is not a prime number");
		 }
		
	}
	 
	 static boolean prime(int num)
	 {
		 for(int i = 2; i<num/2; i++)
		 {
			 if(num%i==0)
			 {
				 return false;
			 }
		 }
		 return true;
	 }

}

