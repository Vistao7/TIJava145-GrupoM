package clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CsvParser {
	public static void Parser(String filePath) {
		
		String line = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			
			while((line = br.readLine()) != null) {
				String[] valores = line.split(";");
				System.out.println(Arrays.toString(valores));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();			
		}
	}

}
