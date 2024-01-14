package CodePractice.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
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
	/*
	This method is used to write content into the file
	* */
	public void writeIntoFile(File file){
		if(file.exists() && file.isFile()){
			try {
				FileWriter fileWriter=new FileWriter(file);
				fileWriter.write("Data is available and we are writing...... ");
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error occurred while writing a file make sure the file is present");
			}
		}
		else {
			System.out.println("File is not present in the directory");
		}
	}
}
