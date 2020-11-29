package Logic;

public class Point {

	private int position_x;
	private int position_y;
	private char direction;
	
	public Point(int position_x, int position_y, char direction) {		
		this.position_x = position_x;
		this.position_y = position_y;
		this.direction = direction;
	}

	public int getPosition_x() {
		return position_x;
	}

	public void setPosition_x(int position_x) {
		this.position_x = position_x;
	}

	public int getPosition_y() {
		return position_y;
	}

	public void setPosition_y(int position_y) {
		this.position_y = position_y;
	}

	public char getDirection() {
		return direction;
	}

	public void setDirection(char direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "Point [position_x=" + position_x + ", position_y=" + position_y + ", direction=" + direction + "]";
	}
	
}
