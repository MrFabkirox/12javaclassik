import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Question2siimpleArray {

	Scanner sc = new Scanner(System.in);
	int score = 0;

	String question1;
	String question1reponse1;
	String question1reponse2;

	String question2;
	String question2reponse1;
	String question2reponse2;

	public Question2siimpleArray() {

		String[] question = new String[2];
		String[] proposal = new String[4];
		String[] reponse = new String[2];
		
		String[] proposalShuffled = new String[4];

		// Creation Question 1
		System.out.println();
		System.out.println("Entrez la premiere question");
		question1 = sc.nextLine();
		System.out.print("Entrez la reponse correcte de la question 1" + "\n");
		question1reponse1 = sc.nextLine();
		System.out.print("Entrez la deuxieme reponse possible de la question 1" + "\n");
		question1reponse2 = sc.nextLine();

		question[0] = question1;
		proposal[0] = question1reponse1;
		proposal[1] = question1reponse2;

		// Creation Question 2
		System.out.println();
		System.out.println("Entrez la deuxieme question");
		question2 = sc.nextLine();
		System.out.print("Entrez la reponse correcte de la question 2" + "\n");
		question2reponse1 = sc.nextLine();
		System.out.print("Entrez la deuxieme reponse possible de la question 2" + "\n");
		question2reponse2 = sc.nextLine();

		question[1] = question2;
		proposal[2] = question2reponse1;
		proposal[3] = question2reponse2;
		
		copyArrayS(proposal, proposalShuffled);
		
		Collections.shuffle(Arrays.asList(proposalShuffled));

		System.out.println();
		System.out.println("liste des questions :");
		displayArrayS(question);
		
		System.out.println("liste des propositions :");
		displayArrayS(proposal);
		
		System.out.println("liste des propositions melangées :");
		displayArrayS(proposalShuffled);
		
		//-------------------------------------------------------------------//
		System.out.println();
		
		System.out.println("Beginning of the test");

		System.out.println();
		System.out.println(question[0]);
		reponse[0] = sc.nextLine();
		
		System.out.println();
		System.out.println(question[1]);
		reponse[1] = sc.nextLine();
		
		//q1
		for (int i=0;i<proposal.length;i++) {
			if(reponse[0] == proposal[0]) {
				System.out.println("Bonne reponse");
				score += 1;
			} else {
				System.out.println("Mauvaise reponse");
			}
		}
		
		//q2
		for (int i=0;i<proposal.length;i++) {
			if(reponse[1] == proposal[2]) {
				System.out.println("Bonne reponse");
				score += 1;
			} else {
				System.out.println("Mauvaise reponse");
			}
		}
		
		System.out.println("Score: " + score);
		

	}
	public void copyArrayS(String[] original, String[] copy) {
		for(int i=0; i<original.length;i++) {
			copy[i] = original[i]; 
		}
	}

	public void displayArrayS(String[] array) {
		for(int i=0; i<array.length;i++) {
			System.out.println(i + " " + array[i] + " "); 
		}
		System.out.println(); 		
	}
}
