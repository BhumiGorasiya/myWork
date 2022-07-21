package array;

//WAP find the occurrence of an integer in the array.

public class task_4 {
	public static void main(String[] args) {
		
		int values[] = {2,35,4,13,21,2,9,4,35};
		
		for(int i= 0; i<9; i++)
		{
			int k = 0;
			for(int j= 0; j<9; j++)
			{
				if(values[i]==values[j])
				k++;
			
			}
			System.out.println(values[i]+"="+k);
			
		}
		
		
		
	
		
		
		
	}

}
