import java.util.Scanner;


public class Questions {
	
	//randomize, functions, taille variable test
	
	Scanner sc = new Scanner(System.in);
	
	String question1;
	String question1reponse1;
	String question1reponse2;
	
	String question2;
	String question2reponse1;
	String question2reponse2;
	
	char reponseUser; 
	
	public Questions() {
		
		// Creation Question 1
		System.out.println("Entrez la premiere question" + "\n");
		question1 = sc.nextLine();
		System.out.println("Entrez la premiere reponse possible de la question 1" + "\n");
		question1reponse1 = sc.nextLine();
		System.out.println("Entrez la deuxieme reponse possible de la question 1" + "\n");
		question1reponse2 = sc.nextLine();
		
		// Creation Question 2
		System.out.println("Entrez la deuxieme question" + "\n");
		question2 = sc.nextLine();
		System.out.println("Entrez la premiere reponse possible de la question 2" + "\n");
		question2reponse1 = sc.nextLine();
		System.out.println("Entrez la deuxieme reponse possible de la question 2" + "\n");
		question2reponse2 = sc.nextLine();
		
		String [][] questionReponses = {{question1, question2},{question1reponse1, question1reponse2}, {question2reponse1, question2reponse2}};
		
		// Test		
		System.out.println("Entrez le numero de la reponse apres chaque question:" + "\n");
		
		// Question 1
		System.out.println("question 0");
		System.out.println(questionReponses[0][0]);
		System.out.println("0: " + questionReponses[1][0] + ", " + "1: " + questionReponses[1][1] + "\n");
		
		System.out.println("tape 0 or 1 for answer");
		reponseUser = sc.next().charAt(0);
		System.out.println("Vous avez repondu " + reponseUser +"\n");
		
		if(reponseUser == '0') {
			System.out.println("bonne reponse" + "\n");
		} else {
			System.out.println("mauvaise reponse" + "\n");
		}
		
		// Question 2
		System.out.println("question 1");
		System.out.println(questionReponses[0][1]);
		System.out.println("0: " + questionReponses[2][0] + ", " + "1: " + questionReponses[2][1] + "\n");
		
		System.out.println("tape 0 or 1 for answer");
		reponseUser = sc.next().charAt(0);
		System.out.println("Vous avez repondu " + reponseUser +"\n");
		
		if(reponseUser == '0') {
			System.out.println("bonne reponse" + "\n");
		} else {
			System.out.println("mauvaise reponse" + "\n");
		}
		
		
	}
}
