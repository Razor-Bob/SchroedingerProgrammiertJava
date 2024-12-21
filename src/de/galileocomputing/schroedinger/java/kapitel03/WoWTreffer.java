package de.galileocomputing.schroedinger.java.kapitel03;

public class WoWTreffer {

	public static void main(String[] args) {
		int treffer = Integer.parseInt(args[0]);
		switch(treffer) {
		case 0:
			System.out.println("Kein Treffer");
			break;
		case 1:
		case 2:
		case 3:
			System.out.println("Schwacher Treffer");
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			System.out.println("Normaler Treffer");
			break;
		case 8:
		case 9:
		case 10:
			System.out.println("Kritischer Treffer");
			break;
		}

	}

}
