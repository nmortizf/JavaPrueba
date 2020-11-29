package Logic;

import java.util.*;
import java.io.*;

public class FileManager {
	
	private File file;
	private Scanner in;
	private List<String> list;
	
	public List<String> readFile(){
		file = new File("C:\\Users\\ortiz\\Documents\\NelsonOrtizArchivos\\in01.txt");		
		try {
			in = new Scanner(file);
			list = new ArrayList<>();
			while(in.hasNextLine()) {
				list.add(in.nextLine());
			}
			in.close();	
			return list;
		}
		catch(IOException e) {
			System.out.println("No existe un archivo cargado!");
			return null;
		}
	}
	
}
