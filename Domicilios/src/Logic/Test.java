package Logic;

import java.util.*;

public class Test {

	public static void main(String [] args) {
		FileManager fileManager = new FileManager();
		List<String> list = fileManager.readFile();
		char [] letter = null;		
		Point p1 = new Point(0,0,'N');
		Movements m1 = new Movements();
		System.out.println("El punto inicial es " + p1.toString());		
		m1.chooseAction(p1, letter, list);		
		System.out.println("El punto final es " + p1);		
		}		
}
