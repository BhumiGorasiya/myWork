package array;

//WAP to sort the given array.

public class task_3 {
	
	public static void main(String[] args) {
		
		int array[] = {5,33,9,17,48,67,21};
		
		for(int i = 0; i<array.length; i++)
		{
			for(int j =0; j<array.length; j++)
			{
				
				if(array[i] < array[j])
				{
					int k = array[i];
					array[i] = array[j];
					array[j] = k;
				}
			}
		}
		
		for(int num : array)
		{
			System.out.println(num);
		}
		
	}
			
		
}
