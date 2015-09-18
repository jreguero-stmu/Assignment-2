import java.util.Scanner;
public class TestEssay {
	
public static void main(String[] args) {
		
		double scoreGrammar;
		double scoreSpelling;
		double scoreContent;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Essay Score" + "\n" + "\n" + "Enter score for Grammar (score must be <= 25)");
		scoreGrammar = scan.nextDouble();
		if(scoreGrammar > 25 || scoreGrammar < 0){
			System.out.println("WARNING: Grammar score must be between 0 and 25. Grammar Score set to 0.");
			scoreGrammar = 0;
		}
		
		System.out.println("Enter score for Spelling (score must be <= 35)");
		scoreSpelling = scan.nextDouble();
		if(scoreSpelling > 35 || scoreSpelling < 0){
			System.out.println("WARNING: Spelling score must be between 0 and 35. Spelling Score set to 0.");
			scoreSpelling = 0;
		}
		
		System.out.println("Enter score for Content (score must be <= 40)");
		scoreContent = scan.nextDouble();
		if(scoreContent > 40 || scoreContent < 0){
			System.out.println("WARNING: Content score must be between 0 and 40. Content Score set to 0.");
			scoreContent = 0;
		}
		
		System.out.println("\n" + "\n");
		scan.close();
		
		Essay essay = new Essay();
		essay.setPtsGrammar(scoreGrammar);
		essay.setPtsSpelling(scoreSpelling);
		essay.setPtsContent(scoreContent);
		
		System.out.println("Grammar score: " + essay.getPtsGrammar() + "\n" + "Spelling score: " + essay.getPtsSpelling() + "\n" +
							"Content Score: " + essay.getPtsContent());
		essay.setScore(essay.getPtsGrammar() + essay.getPtsSpelling() + essay.getPtsContent());
		System.out.println("Total score: " + essay.getScore() + "\n" + "Essay grade: " + essay.getGrade());


	}

}
