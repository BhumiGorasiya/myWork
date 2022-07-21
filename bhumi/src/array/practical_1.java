package array;

public class practical_1 {

	public static void main(String[] args) {
		
		int nums[] = new int[5];
		nums[0] = 34;
		nums[1] = 12;
		nums[2] = 56;
		nums[3] = 67;
		nums[4] = 90;
		
		String languages[] = {"Java", "Dart", "Pythom", "Kotlin"};
		
		System.out.println("length of nums : "+nums.length);
		System.out.println("length of languages :"+languages.length);
		
		for(int i = 0; i<nums.length; i++)
		{
			System.out.println("value of index "+i+" : "+nums[i]);
		}
		System.out.println("***********************************************");
		
		for(int i = 0; i<languages.length; i++)
		{
			System.out.println("element at index "+i+" : "+languages[i]);
		}
	}
}
