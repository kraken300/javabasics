import java.io.File;
class FileInfo{
		public static void main(String[] args){
			File myFile = new File("my_first_text.txt");
		
				if(myFile.exists()){
					System.out.println("File name : "+myFile.getName());
					System.out.println("Absolute path : "+myFile.getAbsolutePath());
					System.out.println("Writable : "+myFile.canWrite());
					System.out.println("Readable : "+myFile.canRead());
					System.out.println("Siize in bytes : "+myFile.length());				
											}
				else{
					System.out.println("File does not exist!");
											}										
	}	
}