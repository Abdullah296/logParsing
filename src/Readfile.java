import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Readfile {

	public ArrayList<String> readfile(String Filename)
	{
		ArrayList<String> data = new ArrayList<String>();
		try 
		{
		      File myObj = new File(Filename);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) 
		      {
		    	  	data.add(myReader.nextLine());
		      }
		      myReader.close();
		 }
		 catch (FileNotFoundException e) 
		 {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		 }
		return data;
		
	}
}
