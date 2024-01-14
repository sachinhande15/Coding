package CodePractice.FileHandling;

import java.io.*;

public class FilePrograms {
		public static void main(String[] args){
			FileOperations fileOperations=new FileOperations();
//			fileOperations.creatFile(new File("demo.txt"));
//			fileOperations.writeIntoFile(new File("demo.txt"));
			fileOperations.readFile(new File("demo.txt"));
		}

}
