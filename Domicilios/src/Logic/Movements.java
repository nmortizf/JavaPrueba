package Logic;

import java.util.*;

public class Movements {
	
	private Point point;
	private char localDirection;
	private int position_x;
	private int position_y;
	private List<String> list;
	private char [] letters;
	
	public Point changeDirection(Point p, char command) {
		this.point = p;
		localDirection = p.getDirection();
		switch(command) {
		case 'D':
			switch(localDirection) {
			case 'N':
				point.setDirection('E');
				break;
			case 'S':
				point.setDirection('O');
				break;
			case 'E':
				point.setDirection('S');
				break;
			case 'O':
				point.setDirection('N');
				break;
			default:
				break;
			}
			break;
		case 'I':
			switch(localDirection) {
			case 'N':
				point.setDirection('O');
				break;
			case 'S':
				point.setDirection('E');
				break;
			case 'E':
				point.setDirection('N');
				break;
			case 'O':
				point.setDirection('S');
				break;
			default:
				break;
			}
			break;	
		}
		return point;
	}
	
	public Point makeMovement(Point p,char command) {
		this.point = p;
		localDirection = p.getDirection();
		position_x = p.getPosition_x();
		position_y = p.getPosition_y();
		switch(command){
		case 'A':
			switch(localDirection) {
			case 'N':
				point.setPosition_y(position_y + 1);
				break;
			case 'S':
				point.setPosition_y(position_y - 1);
				break;
			case 'E':
				point.setPosition_x(position_x + 1);
				break;
			case 'O':
				point.setPosition_x(position_x - 1);
				break;
			default:
				break;
			}
			break;
		default:
			break;		
		}		
		return point;
	}
	
	public void chooseAction(Point p, char [] letter, List<String> list) {
		this.point = p;
		this.letters = letter;
		this.list = list;
		for(int i = 0; i < list.size(); i++) {
			letters = list.get(i).toCharArray();
			System.out.println();
			for(char a : letters) {
				if(a != 'A') {
					changeDirection(point, a);
				}
				else {
					makeMovement(point, a);
				}
				System.out.println("El punto " +  i + "  ahora es " + point);
			}		
		}
		System.out.println();
	}
	
}
