package fileReaderWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//import java.io.FileWriter;
//import java.io.IOException;

public class Main {
	public static void main(String[] args) {
//		try {
//			FileWriter writer = new FileWriter("poem.txt");
//			writer.write("sex sex sex \n suck suck suck");
//			writer.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			FileReader reader = new FileReader("art.txt");
			int data = reader.read();
			while(data != 0) {
				System.out.println((char)data);
				data = reader.read();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
