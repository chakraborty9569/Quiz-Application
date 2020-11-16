import java.util.*;
public class Questions {
	String questions, option1, option2, option3, option4;
	int correctAnswer, userAnswer;
	Scanner sc = new Scanner(System.in);
	public boolean getQuestions() {
		System.out.println(questions);
		System.out.println("1. "+option1);
		System.out.println("2. "+option2);
		System.out.println("3. "+option3);
		System.out.println("4. "+option4);
		userAnswer=sc.nextInt();
		
		if(userAnswer==correctAnswer)
			return true;
		return false;
	}
}
