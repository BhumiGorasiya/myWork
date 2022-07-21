package file_handling;

import java.io.File;
import java.io.IOException;

//file class and its method
public class fileDemo {
	
	public static void main(String[] args) {
		
			 String root = "F:\\Desktop files";
			 String fileName = "WhatsApp Documents";
			 
			 File path = new File("F:\\Desktop files");
			 File file = new File("F:\\Desktop files\\BIO-data");      //String
			 
			 File file1 = new File(root, fileName);				//String, String
			 
			 File file2 = new File(path, fileName);			//file, String
			 
			 try {
				 	file.createNewFile();
				 	file1.createNewFile();
				 	file2.createNewFile();
				 	
			 }catch(IOException e) {
				 e.printStackTrace();
			 }
	}                              
                                              
} 
  