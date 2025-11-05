package p2;

public class P2_main {

	public static void main(String[] args) {
		int a = 1;
		int b = 10;
		int c = 80;
		int d = 2;
		
		boolean E1;
		E1 = (a == b);
		boolean E2;
		E2 = (a == b) || (a == c);
		boolean E3;
		E3 = (a + b >= c);
		boolean E4;
		E4 = (a + b + c >= 100);
		
		if (E1 || E2 || E3 || E4) {
			d = 1;
		}
		if (E1 && E2 || E1 && E3 || E1 && E4 || E2 && E3 || E2 && E4 || E3 && E4) {
			d = 2;
		}
		if (E1 && E2 && E3|| E1 && E2 && E4 || E2 && E3 && E4 || E1 && E3 && E4) {
			d = 3;
		}
		if (E1 && E2 && E3 && E4) {
			d = 4;
		}
		if (!E1 && !E2 && !E3 && !E4) {
			d = 0;
		}
		
		System.out.println("d Beträgt:" + d);
		
	}

}
