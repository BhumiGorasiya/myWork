package collaction;

import java.util.ArrayList;
import java.util.Scanner;

public class task_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		ArrayList<String> list = new ArrayList<String>();
			int choice=0;
			
			while(choice!=5) {
			
			System.out.println("1. add item\n2. remove item\n3. update item\n4. show item\n5. Exit item/n ");
			System.out.print("Enter choice= ");
			choice = scanner.nextInt();
			String value;
			

			switch(choice)
			{
			case 1:
				
				System.out.print("Enter item name : ");
				value = scanner.next();
				list.add(value);
				System.out.print("Item added successfully");
				System.out.print(list);
				
				break;
				
			case 2:
				
				System.out.print("Enter Item name: ");
				value = scanner.next();
				if(list.contains(value))
				{
					list.remove(value);
					System.out.print("Contains this value");
				}else {
					System.out.print("does not Contains");
				}
				
				System.out.print("Item has been successfully Remove: ");
				System.out.print(list);
			

				
				break;
				
			case 3:
				 Scanner sc = new Scanner(System.in);
				 System.out.print("Enter Item Name : ");
				 String name = sc.nextLine();
				 
				 int i = list.indexOf(name);
				 System.out.print(list.indexOf(i));
				 
				 list.set(i,"python");
				 System.out.print(list);
				 
				break;
				
			case 4:
				System.out.println(list);
				
				
				break;
			
			case 5:
				System.out.println("Program has Ended");
				System.exit(0);
				
				
				break;
				
			
			
				
			default:
					System.out.println("Invalid Input");
					
			
			}
		}
	}
	
}
