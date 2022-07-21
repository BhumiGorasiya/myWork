package bhumi;

// else if ladder statement

public class Practice_2 {
	
	public static void main(String[] args) {
		
		int totalsub = 7;
		int totalMarks = 700;
		int obtainMarks = 210;
		float avg = 0.0f;
		
		avg = obtainMarks/(float)totalsub;                      // type casting
		
		System.out.println("Average Marks- "+avg);
		
		if (avg>70)
		{
				System.out.println("A Grade");
		}else if(avg>50 && avg<70)
		{
				System.out.println("B Grade");
		}else if (avg>35 && avg<50)
		{
				System.out.println("C Grade");
		}else {
			
				System.out.println("Failed");
				
		}
				
		
	}

}
