package basicFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileUsingReader {

	public static void main(String[] args) throws Throwable {
		File file = new File("data/abc.txt");
		FileReader reader  = new FileReader(file);
		BufferedReader bReader = new BufferedReader(reader);
		String line =null;
		while((line = bReader.readLine()) != null) {
			System.out.println(line);
		}
		
		bReader.close();
		reader.close();
	}

}
