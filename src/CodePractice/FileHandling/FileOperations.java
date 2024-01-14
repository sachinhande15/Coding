package CodePractice.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

	/*
	This method is used to read a content from the file
	* */
	public void readFile(File file){
		if(file.exists() && file.isFile()){
			try {
				Scanner sc =new Scanner(file);
				while (sc.hasNextLine()){
					String lines=sc.nextLine();
					System.out.println("Reading a file "+file.getName());
					System.out.println("\n"+lines);
				}
				sc.close();
			} catch (FileNotFoundException e) {
				System.out.println("Error occured while reading the file "+e.getStackTrace());
			}
		}
		else {
			System.out.println("File is not avilable "+file.getName());
		}
	}
	public void deleteFile(File file){
		if(file.exists() && file.delete()){
			System.out.println(file.getName()+" file has been deleted from "+file.getAbsolutePath());
		}else {
			System.out.println("File is not present");
		}
	}
}
