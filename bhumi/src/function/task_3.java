package function;

// Write a Java method to find wether the given number is prime or not
// with return type and with parameter

public class task_3 {
	
	public static void main(String[] args) {
		
		int num = 25;
		if (Prime(num)) 
		{
			System.out.println(num + " is a prime number");
		}else 
		{
			System.out.println(num + " is not a prime  number");
		}
}

    static boolean Prime(int num)
    {
        for(int i=1; i<num; i++)
        {
           if(num%i == 0)
           {
        	   return false;
           }
        }
        return true;
    }


}
