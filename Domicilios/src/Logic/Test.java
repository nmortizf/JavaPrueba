package Logic;

import java.util.*;

public class Test {

	public static void main(String [] args) {
		FileManager fileManager = new FileManager();
		List<String> inlist = fileManager.readFile();
		List<String> outList = null;
		char [] letter = null;		
		Point p1 = new Point(0,0,'N');
		Movements m1 = new Movements();			
		outList = m1.chooseAction(p1, letter, inlist);		
		fileManager.writeFile(outList);
		}		
}
