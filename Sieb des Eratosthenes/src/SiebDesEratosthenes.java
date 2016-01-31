import java.util.ArrayList;

public class SiebDesEratosthenes {

	public static void main(String[] args) {

		int N = 3;
		N++;
		ArrayList<Boolean> loesungListe = aussieben(N);

		System.out.println("Primzahlen sind: ");
		for (int i = 0; i <= N - 1; i++) {
			if (loesungListe.get(i) == true && i > 1) {
				System.out.print(i + " ");
			}
		}
	}

	public static ArrayList<Boolean> aussieben(double N) {

		// Legt eine neue Liste an
		ArrayList<Boolean> zahlenListe = new ArrayList<Boolean>();

		// Füllt die neue Liste mit lauter true-Elementen
		for (int i = 0; i <= N; i++) {
			zahlenListe.add(i, true);
		}

		for (int i = 2; i <= N; i++) {

			if (zahlenListe.get(i) == true) {
				int j = i;
				do {
					j = j + i;
					if (j <= N) {
						// Ist die Zahl ein Vielfaches einer
						// Primzahl, dann wird sie mit false
						// markiert
						zahlenListe.set(j, false);
					}
				} while (j <= N);
			}
		}
		return zahlenListe;
	}
}