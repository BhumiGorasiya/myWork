package array;

// WAP to find out min and max from given array elements.
public class practical_4 {

	public static void main(String[] args) {
		
		int nums[] = {12,45,11,89,23,9,78,34,2,78};
		
		int min = nums[0];
		
		for(int i = 0; i<nums.length; i++)
		{
			
				if(min>nums[i])
				{
					min = nums[i];
				}
			
		}
	
		System.out.println("min value from given elements : "+min);
		
		int max = nums[0];
		
		for(int i = 0; i<nums.length; i++)
		{
			
				if(max<nums[i])
				{
					max = nums[i];
				}
		}
		
		System.out.println("max value from given elements : "+max);
	}
}
