package assignments;
// WAP to find the maximum and minimum value of an array.

public class Practical_15 {
public static void main(String[] args) {
		
		int nums[] = {36,47,89,37,12,3,77,42,92,31};
		
		int min = nums[0];
		
		for(int i = 0; i<nums.length; i++)
		{
			
				if(min>nums[i])
				{
					min = nums[i];
				}
		}
		
		System.out.println("min value from given elements :"+min);
		
		int max = nums[0];
		
		for(int i = 0; i<nums.length; i++)
		{
			
				if(max<nums[i])
				{
					max = nums[i];	
				}
		}
		
		System.out.println("max value from given elements :"+max);
	}


}
