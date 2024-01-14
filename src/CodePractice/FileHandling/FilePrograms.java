package CodePractice.FileHandling;

import java.io.*;

public class FilePrograms {
		public static void main(String[] args){
			FileOperations fileOperations=new FileOperations();
//			fileOperations.creatFile();
			fileOperations.writeIntoFile(new File("userList.txt"));
		}

}
