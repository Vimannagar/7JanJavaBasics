package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsForChecked {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		
		String path = "F:\\Desktop\\jdshfkjd\\7th Jan\\Java Basics.docx";
		
		FileInputStream fis = new FileInputStream(path);
		
		System.out.println("After FIS object");
		
	}

}
