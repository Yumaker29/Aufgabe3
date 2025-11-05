package p1;

public class P1_Main {

	public static void main(String[] args) {
		int wuerfel = 1;
		
		if (wuerfel == 1 || wuerfel == 4) {
			System.out.println("Gewonnen!");
		}
		else if (wuerfel ==2 ) {
			System.out.println("Verloren!");
		}
		else if (wuerfel == 5) {
			System.out.println("Unentschieden!");
		}
		else {
			System.out.println("Unklar");
		}
		

	}

}
