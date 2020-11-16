
public class GamePlatform {
	Questions questions[] = new Questions[5];
	String questionStore[][] = {
			{"Who won the FIFA World Cup 2014?", "Spain", "Argentina", "Brazil", "Germany"},
			{"Who won the UEFA champions League 2005?", "Barcelona", "AC Milan", "Liverpool", "Real Madrid"},
			{"Which year Manchester United won treble?", "1995", "1999", "1996", "2000"},
			{"Which team won most La Liga titles?", "Barcelona", "Atletico Madrid", "Real Madrid", "Sevilla F.C."},
			{"Which is the only English club to have won English Treble?", "Manchester City", "Chelsea", "Liverpool", "Manchester United"}
	};
	int correctAnswersSet[]= {4, 3, 2, 3, 1};
	
	Player player = new Player();
	
	public void init() {
		for(int i=0; i<questionStore.length; i++)
		{
			questions[i]=new Questions();
			
			questions[i].questions=questionStore[i][0];
			questions[i].option1=questionStore[i][1];
			questions[i].option2=questionStore[i][2];
			questions[i].option3=questionStore[i][3];
			questions[i].option4=questionStore[i][4];
			questions[i].correctAnswer=correctAnswersSet[i];
		}
	}
	
	public void play() {
		player.getName();
		
		for(int i=0; i<questionStore.length; i++)
		{
			if(questions[i].getQuestions())
			{
				System.out.println("Correct Answer!!!");
				player.score += 3;
				System.out.println();
			}
			else
			{
				System.out.println("Wrong Answer!!!");
				System.out.println("Correct answer is Option "+questions[i].correctAnswer+". "+questionStore[i][questions[i].correctAnswer]);
				player.score--;
				System.out.println();
			}
		}
		System.out.println("Result:");
		System.out.println("Player "+player.name+" scored "+player.score);
	}
}
