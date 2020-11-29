package Logic;

public class Test {

	public static void main(String [] args) {
		String commands = "AAAAIA";
		char [] letter = commands.toCharArray();
		Point p1 = new Point(0,0,'N');
		Movements m1 = new Movements();
		System.out.println("El punto inicial es " +  p1);
		System.out.println();
		for(char a : letter){
			System.out.println(a);
			if (a != 'A'){
			m1.changeDirection(p1, a);
			}
			else {			
			m1.makeMovement(p1, a);
			}
			System.out.println("El punto ahora es " +  p1);
		}
		System.out.println();
		System.out.println("El punto final es " +  p1);
	}		
}
