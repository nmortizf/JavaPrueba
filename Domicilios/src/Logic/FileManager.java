package Logic;

import java.util.*;
import java.io.*;

public class FileManager {
	
	private File file;
	private Scanner in;
	private List<String> list;
	private FileWriter fileSave;
	
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
	
	public void writeFile(List<String> list) {
		try {
			fileSave = new FileWriter("C:\\Users\\ortiz\\Documents\\NelsonOrtizArchivos\\out01.txt");
			for (String linea : list) {
				fileSave.write(linea + "\n");
			}
			fileSave.close();
		} catch(Exception ex) {
			System.out.println("No se pudo guardar el archivo en el destino");
		}
	}
	
}
