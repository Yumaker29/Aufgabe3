package h1;

public class H1_main {

	public static void main(String[] args) {
		double guthaben = -130.32;
		double monEingang = -546.50;
		int rating = 0;
		boolean warnhinweis;
		boolean negativ;
		negativ = guthaben < 0;
		
		if (guthaben > 0) {
			rating += 3;
		}
		else if (guthaben == 0) {
			rating += 2;
		}
		else {
			if (negativ && monEingang >= guthaben) {
				rating += 1;
			}
			else {
				rating -= 1;
			}
		}
		if (negativ && monEingang < guthaben && rating < 0) {
			warnhinweis = true;
		}
		else {
			warnhinweis = false;
		}
		
		System.out.println("Ihr Kontostand beträgt momentan: " + guthaben);
		System.out.println("Ihr zu erwartendes Einkommen für diesen Monat beträgt: " + monEingang);
		System.out.println("Sie erhalten folgendes rating: " + rating );
		System.out.println("Ist eine Warnung zu erwarten? : " + warnhinweis);
		
	}

}
 