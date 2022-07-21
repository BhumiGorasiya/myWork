package looping;

// Left triangle

public class pattern_1 {

		public static void main(String[] args) {
			
			for(int i = 1; i<=5; i++)					//i = 1      j=1
			{
					for(int j = 1; j<=i; j++)
					{
							System.out.print("*");
					}
					
					System.out.println();
			}
		}
}
