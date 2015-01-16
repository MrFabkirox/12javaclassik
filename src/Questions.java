import java.util.Arrays;
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
	
	String [][] questionReponses = new String[2][4];
	
	public Questions() {
		
		String[] questionTab = new String[2];
		String[] reponseTab = new String[4];
		
		// Creation Question 1
		System.out.println("Entrez la premiere question" + "\n");
		question1 = sc.nextLine();
		System.out.println("Entrez la premiere reponse possible de la question 1" + "\n");
		question1reponse1 = sc.nextLine();
		System.out.println("Entrez la deuxieme reponse possible de la question 1" + "\n");
		question1reponse2 = sc.nextLine();
		
		questionTab[0] = question1;
		reponseTab[0] = question1reponse1;
		reponseTab[1] = question1reponse2;
		
		// Creation Question 2
		System.out.println("Entrez la deuxieme question" + "\n");
		question2 = sc.nextLine();
		System.out.println("Entrez la premiere reponse possible de la question 2" + "\n");
		question2reponse1 = sc.nextLine();
		System.out.println("Entrez la deuxieme reponse possible de la question 2" + "\n");
		question2reponse2 = sc.nextLine();
		
		questionTab[1] = question2;
		reponseTab[2] = question2reponse1;
		reponseTab[3] = question2reponse2;
		
		
		int i = 0;
		int j = 0;
		
		for(i=0;i<questionReponses.length;i++){
			for(j=0;j<questionReponses[i].length;j++){
				
				if (i == 1) {
					questionReponses[i][j] = reponseTab[j];
				} else {
					questionReponses[i][j] = questionTab[i];
				}
				
			}
		}
		
		displayTest(questionReponses);
		
		for(int z=0;z<questionReponses.length;z++) {
			Arrays.fill(questionReponses[z], z);
		}
		
		displayTest(questionReponses);
		
		String[][] tabTest = {{"a", "b", "c"},{"1", "2", "3"}};
		displayTest(tabTest);
		
	}

	private void displayTest(String[][] tab) {
		
		for(int i=0;i<tab.length;i++) {
			System.out.println(Arrays.toString(tab[i]));
			
			for(int j=0;j<tab[i].length;j++) {
				System.out.println(tab[i][j]);

			}
		}
	}
}
