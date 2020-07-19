package MyfirstProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createTextfile {

	public static void main(String[] args) throws IOException {
		 try {
		  //    File myObj = new File("filename.txt");
			 File myObj = new File("C:\\Users\\SAMINAKalyani\\Documents\\SampleFolder\\filename.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 
	}

	
}
