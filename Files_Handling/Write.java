import java.io.FileWriter;
import java.io.IOException;
class Write{
	public static void main(String[] args){
		try{
			FileWriter objwrite = new FileWriter("my_first_text.txt");
			objwrite.write("The Creator,The Maintainer and The Destroyer.");
			objwrite.close();
			System.out.println("Writing in the file is done!");
		}
		catch(IOException e){
			System.out.println("An error occured while writing!");
			e.printStackTrace();
		}
		
		
	}
}