import java.io.File;
import java.io.IOException;
class DeleteFolder{
		public static void main(String[] args){
			File myFile = new File("my_first_text.txt");
			
				if(myFile.delete()){
					System.out.println("File deleted : "+myFile.getName());
											}
				else{
					System.out.println("An error occured! File cannot be deleted!!");
											}
				
			
												}
	}	