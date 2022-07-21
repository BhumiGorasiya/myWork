package assignments;

//  WAP to calculate the average value of array elements. 

public class Practical_13 {
public static void main(String[] args) {
	
	int value[] = {1, 2, 3, 4, 5, 6, 7, 8};
	int length = value.length;
	int sum = 0;
	
	for(int i = 0; i<value.length; i++)
	{
		sum = value[i];
	}
	
	double average = sum/length;
	System.out.println("Average of value :"+average);
		
			
}
	
	
}
