package tyuukyuu.work1;

public class RobotFactory {
	
	public static Robot create(String name) {
		Robot rb = new Robot();
		
		rb.setName(name);
		
		return rb;
	}
}
