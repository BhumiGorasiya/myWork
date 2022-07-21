package function;

public class practical_2 {

	public static void main(String[] args) {
		
		String str = "The quick brown fox jumps over the lazy dog//1236";
		
		int alpha = 0, digit = 0, space =0, symbols = 0;
		
		for(int i = 0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(Character.isAlphabetic(ch))
			{
				alpha++;
			}else if(Character.isDigit(ch))
			{
				digit++;
			}else if(Character.isSpace(ch)) 
			{
				space++;
			}else {
				symbols++;
			}

		}
			System.out.println("Total alphabet : "+alpha);
			System.out.println("Total digit : "+digit);
			System.out.println("Total space : "+space);
			System.out.println("Total symbol : "+symbols);
		}
}
