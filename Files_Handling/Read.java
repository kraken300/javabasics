import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

class Read{
	public static void main(String[] args){
		try{
			File objread = new File("my_first_text.txt");
			Scanner objreader = new Scanner(objread);
			while(objreader.hasNextLine()){
				String line = objreader.nextLine();
				System.out.println(line);
			}
			objreader.close();
		}
		catch(IOException e){
			System.out.println("An error occured!");
			e.printStackTrace();
		}
	}
}