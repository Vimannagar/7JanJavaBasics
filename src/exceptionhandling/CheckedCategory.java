package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedCategory {
	
	public static void main(String[] args) {
		
		String s = "F:\\Desktop\\VimanNagar\\7th Jan\\Java Basics.docx";
		
		try {
		
		FileInputStream fis = new FileInputStream(s);
		
		System.out.println("After the validation of file");
		
		
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("file not found exception arrived ");
			
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
