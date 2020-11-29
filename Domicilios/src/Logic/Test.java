package Logic;

import java.util.*;

public class Test {

	public static void main(String [] args) {
		FileManager fileManager = new FileManager();
		List<String> list = fileManager.readFile();
		char [] letter;		
		Point p1 = new Point(0,0,'N');
		Movements m1 = new Movements();
		System.out.println("El punto inicial es " + p1.toString());
		for(int i = 0; i < list.size(); i++) {
			letter = list.get(i).toCharArray();
			System.out.println();
			for(char a : letter) {
				if(a != 'A') {
					m1.changeDirection(p1, a);
				}
				else {
					m1.makeMovement(p1, a);
				}
				System.out.println("El punto " +  i + "  ahora es " + p1);
			}
		}		
		System.out.println();
		System.out.println("El punto final es " + p1);		
		}		
}
