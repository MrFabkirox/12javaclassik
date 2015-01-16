import java.util.Arrays;


public class Test1 {

	String[][] arrayX = new String[2][3];
	String[][] arrayX2 = new String[2][3];
	
	String[] arrayS = {"1 ", "2 ", "3 "};
	String[] arrayS2 = {"41 ", "52 ", "63 "};
	
	
	public Test1() {
		
		arrayX[0][0] = "1";
		arrayX[0][1] = "2";
		arrayX[0][2] = "3";
		arrayX[1][0] = "a";
		arrayX[1][1] = "b";
		arrayX[1][2] = "c";
		
		//displayArrayX(arrayT);
		
		copyArr(arrayX, arrayX2);
		
		displayArrayX(arrayX2);
		displayArrayX(arrayX);
		
		
	}

	private void displayArrayX(String[][] tab) {
		
		for(int i=0;i<tab.length;i++) {
			System.out.print(".");
			for(int j=0;j<tab[i].length;j++) {
				System.out.print(tab[i][j]);
			}
		}
	}
	
	private void displayArray(String[] tab) {
		for(int i=0;i<tab.length;i++) {
			System.out.print(tab[i]);
		}
	}
	
	private void copyArr(String[][] source, String[][] destination) {
		
		for(int i=0;i<source.length;i++) {
			System.arraycopy(source[i], 0, destination[i], 0, source[i].length);
		}
		
	}
}
