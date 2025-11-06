package h3;

public class H3_main {

	public static void main(String[] args) {
		int max = 100;
		int fix = 67;
		int wartend = 420;
		boolean istVoll;
		
		if ((max - fix) > 0 ) {
			if (wartend > 0) {
				int freiePlaetze = max - fix;
				int fixiert = freiePlaetze - wartend;
				if (fixiert <= 0) {
					wartend -= freiePlaetze;
					fix = fix + freiePlaetze;
					freiePlaetze = 0;
					istVoll = true;
				}
				else {
					freiePlaetze -= wartend;
					fix = fix + freiePlaetze;
					wartend = 0;
					istVoll = false;
				}
				
			}
			else {
				istVoll = false;
			}			
		}
		else {
			istVoll = true;
		}
		
		System.out.println("So viele maximale Fixplätze gibt es: " + max);
		System.out.println("So viele Fixplätze gibt es bereits: " + fix);
		System.out.println("So viele StudentInnen warten noch: " + wartend);
		System.out.println("Gibt es keine weiteren Fixplätze mehr? : " + istVoll);
		
	}

}
