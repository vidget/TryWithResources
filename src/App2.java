import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class App2 {

	public static void main(String[] args) {
		File file = new File("text.txt");
		
		
		//We can change the code below 
		//FileReader fr = new FileReader(file);
		//BufferedReader br = new BufferedReader(fr);
		
		//passing the FileReader method directly
		//BufferedReader br = new BufferedReader(new FileReader(file));
		
		//We can add to it using the Java 7 feature of Trying with resources 
		//The advantage of the using the TRY with RESOURCES is that 
		//it automatically closes the file too.
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			//reads in the file and displays using 
			//much short syntax available in Java 7
			//using a Trying with resources implemented in Java 7
				String line;
				while((line = br.readLine()) != null ){
				System.out.println(line);
			}
							
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't find file: " + file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't read the file: "+file.toString());
		}

	}

}
