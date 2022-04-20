public class Fattoriale {

	public Fattoriale() {
	}

	public float fattoriale(int n) {
		int fatt, i;

		fatt = 1;
		for (i = 1; i <= n; i++) {
			fatt = fatt * i;
		}
		return fatt;
	}

	public static void main(String[] args) {
		Fattoriale f = new Fattoriale();
		System.out.println(f.fattoriale(4));
	}

}