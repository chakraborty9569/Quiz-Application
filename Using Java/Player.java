import java.util.*;
public class Player {
	String name;
	int score;
	Scanner sc = new Scanner(System.in);
	public void getName() {
		System.out.println("Enter your name: ");
		name=sc.next();
	}
}
