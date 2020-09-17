import java.io.File;
import java.io.IOException;
class Creating_File{
		public static void main(String[] args){
			File myFile = new File("my_first_text.txt");
			try{
				if(myFile.createNewFile()){
					System.out.println("File created : "+myFile.getName());
											}
				else{
					System.out.println("File already exists!");
											}
				}
			catch(IOException e){
					System.out.println("N error occured!");
					e.printStackTrace();
				}	
												}
	}	