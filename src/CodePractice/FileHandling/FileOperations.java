package CodePractice.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileOperations {
	File file;
	public FileOperations(File f){
		this.file=f;
	}
	public FileOperations(){
	}

	/*
	This method is used to create the new file
	* */
	public void creatFile(File file){
		if (!file.exists()){
			try {
				file.createNewFile();
				System.out.println("file has been created in "+ file.getAbsolutePath());
			} catch (IOException e) {
				throw new Error("Error occurred while creating the file");
			}
		}
	}
}
