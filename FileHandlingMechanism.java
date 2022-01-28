package FileMechanism.program;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingMechanism {

	public static void main(String[] args) {
			      try {
			         String data = " File is Created ";
			         File f1 = new File("C://Users//USER//Desktop//File Handling");
			         if(!f1.exists()) {
			            f1.createNewFile();
			         }

			         FileWriter fileWritter = new FileWriter(f1.getName(),true);
			         BufferedWriter bw = new BufferedWriter(fileWritter);
			         bw.write(data);
			         bw.close();
			         System.out.println("Rj");
			      } catch(IOException e){
			         e.printStackTrace();
			      }
			   }
}
