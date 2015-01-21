import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Main {


	static int note = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char  continuer = 'o';

		String question1;
		String question1reponse1;
		String question1reponse2;
		String question1reponse3;

		String question2;
		String question2reponse1;
		String question2reponse2;
		String question2reponse3;

		String question3;
		String question3reponse1;
		String question3reponse2;
		String question3reponse3;

		String question4;
		String question4reponse1;
		String question4reponse2;
		String question4reponse3;

		String question5;
		String question5reponse1;
		String question5reponse2;
		String question5reponse3;

		String[] question = new String[5];

		String[] reponsePossible1 = new String[3];
		String[] reponsePossible2 = new String[3];
		String[] reponsePossible3 = new String[3];
		String[] reponsePossible4 = new String[3];
		String[] reponsePossible5 = new String[3];

		String[] reponseUser = new String[5];

		String[] proposalShuffled1 = new String[3];
		String[] proposalShuffled2 = new String[3];
		String[] proposalShuffled3 = new String[3];
		String[] proposalShuffled4 = new String[3];
		String[] proposalShuffled5 = new String[3];

		while(continuer == 'o') {

			// Creation Question 1
			System.out.println();
			System.out.println("Creation du questionnaire, Entrez la premiere question qui va etre posee lors du test:");
			question1 = sc.nextLine();
			System.out.print("Entrez la reponse correcte a la question 1" + "\n");
			question1reponse1 = sc.nextLine();
			System.out.print("Entrez une deuxieme reponse incorrect possible de la question 1" + "\n");
			question1reponse2 = sc.nextLine();
			System.out.print("Entrez une troisieme reponse incorrect possible de la question 1" + "\n");
			question1reponse3 = sc.nextLine();

			question[0] = question1;
			reponsePossible1[0] = question1reponse1;
			reponsePossible1[1] = question1reponse2;
			reponsePossible1[2] = question1reponse3;

			// Creation Question 2
			System.out.println();
			System.out.println("Creation du questionnaire, Entrez la deuxieme question qui va etre posee lors du test:");
			question2 = sc.nextLine();
			System.out.print("Entrez la reponse correcte de la question 2" + "\n");
			question2reponse1 = sc.nextLine();
			System.out.print("Entrez la deuxieme reponse incorrect possible de la question 2" + "\n");
			question2reponse2 = sc.nextLine();
			System.out.print("Entrez la troisieme reponse incorrect possible de la question 2" + "\n");
			question2reponse3 = sc.nextLine();

			question[1] = question2;
			reponsePossible2[0] = question2reponse1;
			reponsePossible2[1] = question2reponse2;
			reponsePossible2[2] = question2reponse3;

			// Creation Question 3
			System.out.println();
			System.out.println("Creation du questionnaire, Entrez la troisieme question qui va etre posee lors du test:");
			question3 = sc.nextLine();
			System.out.print("Entrez la reponse correcte a la question 1" + "\n");
			question3reponse1 = sc.nextLine();
			System.out.print("Entrez une deuxieme reponse incorrect possible de la question 3" + "\n");
			question3reponse2 = sc.nextLine();
			System.out.print("Entrez une troisieme reponse incorrect possible de la question 3" + "\n");
			question3reponse3 = sc.nextLine();

			question[2] = question3;
			reponsePossible3[0] = question3reponse1;
			reponsePossible3[1] = question3reponse2;
			reponsePossible3[2] = question3reponse3;

			// Creation Question 4
			System.out.println();
			System.out.println("Creation du questionnaire, Entrez la quatrieme question qui va etre posee lors du test:");
			question4 = sc.nextLine();
			System.out.print("Entrez la reponse correcte a la question 4" + "\n");
			question4reponse1 = sc.nextLine();
			System.out.print("Entrez une deuxieme reponse incorrect possible de la question 4" + "\n");
			question4reponse2 = sc.nextLine();
			System.out.print("Entrez une troisieme reponse incorrect possible de la question 4" + "\n");
			question4reponse3 = sc.nextLine();

			question[3] = question4;
			reponsePossible4[0] = question4reponse1;
			reponsePossible4[1] = question4reponse2;
			reponsePossible4[2] = question4reponse3;

			// Creation Question 5
			System.out.println();
			System.out.println("Creation du questionnaire, Entrez la cinquieme question qui va etre posee lors du test:");
			question5 = sc.nextLine();
			System.out.print("Entrez la reponse correcte a la question 5" + "\n");
			question5reponse1 = sc.nextLine();
			System.out.print("Entrez une deuxieme reponse incorrect possible de la question 5" + "\n");
			question5reponse2 = sc.nextLine();
			System.out.print("Entrez une troisieme reponse incorrect possible de la question 5" + "\n");
			question5reponse3 = sc.nextLine();

			question[4] = question5;
			reponsePossible5[0] = question5reponse1;
			reponsePossible5[1] = question5reponse2;
			reponsePossible5[2] = question5reponse3;


			copyArrayS(reponsePossible1, proposalShuffled1);
			copyArrayS(reponsePossible2, proposalShuffled2);
			copyArrayS(reponsePossible3, proposalShuffled3);
			copyArrayS(reponsePossible4, proposalShuffled4);
			copyArrayS(reponsePossible5, proposalShuffled5);

			Collections.shuffle(Arrays.asList(proposalShuffled1));
			Collections.shuffle(Arrays.asList(proposalShuffled2));
			Collections.shuffle(Arrays.asList(proposalShuffled3));
			Collections.shuffle(Arrays.asList(proposalShuffled4));
			Collections.shuffle(Arrays.asList(proposalShuffled5));

			System.out.println();
			System.out.println("Voici la liste des questions que vous avez prepare: ");
			displayArrayS(question);

			System.out.println("Voici liste des propositions que vous avez prepare: ");
			displayArrayS(reponsePossible1);
			displayArrayS(reponsePossible2);
			displayArrayS(reponsePossible3);
			displayArrayS(reponsePossible4);
			displayArrayS(reponsePossible5);

			System.out.println("liste des propositions melangees :");
			displayArrayS(proposalShuffled1);
			displayArrayS(proposalShuffled2);
			displayArrayS(proposalShuffled3);
			displayArrayS(proposalShuffled4);
			displayArrayS(proposalShuffled5);

			//-------------------------------- Debut du Test -----------------------------------//
			note = 0;

			for(int i=2;i>0;i--) {
				//System.out.print(".");

				for(int j=2;j>0;j--) {
					System.out.println(".");
				}
			}

			System.out.println("Debut du Test ! A chaque question repondez par \"p\", si vous souhetez passez à la question suivante pour ne pas faire baisser votre note en cas de reponse fausse");

			System.out.println();
			System.out.println(question[0]);
			System.out.println("Reponses possibles: " + proposalShuffled1[0] + ", " + proposalShuffled1[1] + ", " + proposalShuffled1[2]);

			reponseUser[0] = sc.nextLine();

			while((!reponseUser[0].equalsIgnoreCase(proposalShuffled1[0])) & (!reponseUser[0].equalsIgnoreCase(proposalShuffled1[1])) & (!reponseUser[0].equalsIgnoreCase(proposalShuffled1[2])) & (!reponseUser[0].equalsIgnoreCase("p"))) {
				System.out.println("Votre reponse ne correspond a aucun des choix proposé, ecrivez \""
						+ proposalShuffled1[0] + "\", \""
						+ proposalShuffled1[1] + "\" ou bien \""
						+ proposalShuffled1[2] + "\"");

				reponseUser[0] = sc.nextLine();
			}

			System.out.println();
			System.out.println(question[1]);
			System.out.println("Reponses possibles: " + proposalShuffled2[0] + ", " + proposalShuffled2[1] + ", " + proposalShuffled2[2]);

			reponseUser[1] = sc.nextLine();

			while((!reponseUser[1].equalsIgnoreCase(proposalShuffled2[0])) & (!reponseUser[1].equalsIgnoreCase(proposalShuffled2[1])) & (!reponseUser[1].equalsIgnoreCase(proposalShuffled2[2])) & (!reponseUser[1].equalsIgnoreCase("p"))) {
				System.out.println("Votre reponse ne correspond a aucun des choix proposé, ecrivez \""
						+ proposalShuffled2[0] + "\", \""
						+ proposalShuffled2[1] + "\" ou bien \""
						+ proposalShuffled2[2] + "\"");

				reponseUser[1] = sc.nextLine();
			}

			System.out.println();
			System.out.println(question[2]);
			System.out.println("Reponses possibles: " + proposalShuffled3[0] + ", " + proposalShuffled3[1] + ", " + proposalShuffled3[2]);

			reponseUser[2] = sc.nextLine();

			while((!reponseUser[2].equalsIgnoreCase(proposalShuffled3[0])) & (!reponseUser[2].equalsIgnoreCase(proposalShuffled3[1])) & (!reponseUser[2].equalsIgnoreCase(proposalShuffled3[2])) & (!reponseUser[2].equalsIgnoreCase("p"))) {
				System.out.println("Votre reponse ne correspond a aucun des choix proposé, ecrivez \""
						+ proposalShuffled3[0] + "\", \""
						+ proposalShuffled3[1] + "\" ou bien \""
						+ proposalShuffled3[2] + "\"");

				reponseUser[2] = sc.nextLine();
			}

			System.out.println();
			System.out.println(question[3]);
			System.out.println("Reponses possibles: " + proposalShuffled4[0] + ", " + proposalShuffled4[1] + ", " + proposalShuffled4[2]);

			reponseUser[2] = sc.nextLine();

			while((!reponseUser[3].equalsIgnoreCase(proposalShuffled4[0])) & (!reponseUser[3].equalsIgnoreCase(proposalShuffled4[1])) & (!reponseUser[3].equalsIgnoreCase(proposalShuffled4[2])) & (!reponseUser[3].equalsIgnoreCase("p"))) {
				System.out.println("Votre reponse ne correspond a aucun des choix proposé, ecrivez \""
						+ proposalShuffled4[0] + "\", \""
						+ proposalShuffled4[1] + "\" ou bien \""
						+ proposalShuffled4[2] + "\"");

				reponseUser[3] = sc.nextLine();
			}

			System.out.println();
			System.out.println(question[4]);
			System.out.println("Reponses possibles: " + proposalShuffled5[0] + ", " + proposalShuffled5[1] + ", " + proposalShuffled5[2]);

			reponseUser[4] = sc.nextLine();

			while((!reponseUser[4].equalsIgnoreCase(proposalShuffled5[0])) & (!reponseUser[4].equalsIgnoreCase(proposalShuffled5[1])) & (!reponseUser[4].equalsIgnoreCase(proposalShuffled5[2])) & (!reponseUser[4].equalsIgnoreCase("p"))) {
				System.out.println("Votre reponse ne correspond a aucun des choix proposé, ecrivez \""
						+ proposalShuffled5[0] + "\", \""
						+ proposalShuffled5[1] + "\" ou bien \""
						+ proposalShuffled5[2] + "\"");

				reponseUser[4] = sc.nextLine();
			}


			System.out.println();
			System.out.println("Correction du test");

			//q1
			if(reponseUser[0].equalsIgnoreCase("p")) {
				System.out.println("vous avez passé la permiere question qui etait: ");
				System.out.println(question[0] + ", La bonne reponse etait: " + reponsePossible1[0]);
			}else {
				if(reponseUser[0].equalsIgnoreCase(reponsePossible1[0])) {

					System.out.println();
					System.out.println("la premiere question etait: " + question[0]);
					System.out.println("Vous avez repondu correctement, " + "vous avez repondu:  " +reponseUser[0] + ", la bonne reponse etait: " + reponsePossible1[0]);
					note += 1;
					System.out.println(" +1 point");

				} else {

					System.out.println();
					System.out.println("la premiere question etait: " + question[0]);
					System.out.println("Vous n'avez pas repondu correctement, " + "vous avez repondu:  " +reponseUser[0] + ", la bonne reponse etait: " + reponsePossible1[0]);
					note -= 1;
					System.out.println(" -1 point");

				}
			}
			//q2
			if(reponseUser[1].equalsIgnoreCase("p")) {
				System.out.println("vous avez passé la deuxieme question qui etait: ");
				System.out.println(question[1] + ", La bonne reponse etait: " + reponsePossible2[0]);
			}else {
				if(reponseUser[1].equalsIgnoreCase(reponsePossible2[0])) {

					System.out.println();
					System.out.println("la deuxieme question etait: " + question[1]);
					System.out.println("Vous avez repondu correctement, " + "vous avez repondu:  " + reponseUser[1] + ", la bonne reponse etait: " + reponsePossible2[0]);
					note += 1;
					System.out.println(" +1 point");

				} else {

					System.out.println();
					System.out.println("la deuxieme question etait: " + question[1]);
					System.out.println("Vous n'avez pas repondu correctement, " + "vous avez repondu:  " +  reponseUser[1] + ", la bonne reponse etait: " + reponsePossible2[0]);
					note -= 1;
					System.out.println(" -1 point");

				}
			}
			//q3
			if(reponseUser[2].equalsIgnoreCase("p")) {
				System.out.println("vous avez passé la troisieme question qui etait: ");
				System.out.println(question[2] + ", La bonne reponse etait: " + reponsePossible2[0]);
			}else {
				if(reponseUser[2].equalsIgnoreCase(reponsePossible3[0])) {

					System.out.println();
					System.out.println("la troisieme question etait: " + question[2]);
					System.out.println("Vous avez repondu correctement, " + "vous avez repondu:  " + reponseUser[2] + ", la bonne reponse etait: " + reponsePossible3[0]);
					note += 1;
					System.out.println(" +1 point");

				} else {

					System.out.println();
					System.out.println("la troisieme question etait: " + question[2]);
					System.out.println("Vous n'avez pas repondu correctement, " + "vous avez repondu:  " +  reponseUser[2] + ", la bonne reponse etait: " + reponsePossible3[0]);
					note -= 1;
					System.out.println(" -1 point");

				}
			}
			//q4
			if(reponseUser[3].equalsIgnoreCase("p")) {
				System.out.println("vous avez passé la troisieme question qui etait: ");
				System.out.println(question[3] + ", La bonne reponse etait: " + reponsePossible3[0]);
			}else {
				if(reponseUser[3].equalsIgnoreCase(reponsePossible4[0])) {

					System.out.println();
					System.out.println("la quatrieme question etait: " + question[3]);
					System.out.println("Vous avez repondu correctement, " + "vous avez repondu:  " + reponseUser[3] + ", la bonne reponse etait: " + reponsePossible4[0]);
					note += 1;
					System.out.println(" +1 point");

				} else {

					System.out.println();
					System.out.println("la quatrieme question etait: " + question[3]);
					System.out.println("Vous n'avez pas repondu correctement, " + "vous avez repondu:  " +  reponseUser[3] + ", la bonne reponse etait: " + reponsePossible4[0]);
					note -= 1;
					System.out.println(" -1 point");

				}
			}
			//q5
			if(reponseUser[4].equalsIgnoreCase("p")) {
				System.out.println("vous avez passé la cinquieme question qui etait: ");
				System.out.println(question[4] + ", La bonne reponse etait: " + reponsePossible5[0]);
			}else {
				if(reponseUser[4].equalsIgnoreCase(reponsePossible3[0])) {

					System.out.println();
					System.out.println("la cinqieme question etait: " + question[4]);
					System.out.println("Vous avez repondu correctement, " + "vous avez repondu:  " + reponseUser[4] + ", la bonne reponse etait: " + reponsePossible5[0]);
					note += 1;
					System.out.println(" +1 point");

				} else {

					System.out.println();
					System.out.println("la cinqieme question etait: " + question[4]);
					System.out.println("Vous n'avez pas repondu correctement, " + "vous avez repondu:  " +  reponseUser[4] + ", la bonne reponse etait: " + reponsePossible5[0]);
					note -= 1;
					System.out.println(" -1 point");

				}
			}

			montrerScore("Note sur 5: ");


			System.out.println("Voulez vous recommencer ? o: oui, je veux recommencer, n: non, je veux quitter");
			continuer = sc.nextLine().charAt(0);

			while(continuer != 'o' && continuer != 'n') {
				System.out.println("S'il vous plait, appuyez su la touche \"o\" si vous voulez recommencer, ou sur la touche \"n\"si vous ne voulez pas continuer.");
				continuer = sc.nextLine().charAt(0);
			}

		}

		System.out.println("\n" + "Fin du test.");
	}

	public static void copyArrayS(String[] original, String[] copy) {
		for(int i=0; i<original.length;i++) {
			copy[i] = original[i];
		}
	}

	public static void displayArrayS(String[] array) {
		for(int i=0; i<array.length;i++) {
			System.out.println(i+1 + " " + array[i] + " ");
		}
		System.out.println();    
	}

	public static void montrerScore(String s) {
		if(note<0) {
			note = 0;
		}
		System.out.println(s + note);
	}

}



