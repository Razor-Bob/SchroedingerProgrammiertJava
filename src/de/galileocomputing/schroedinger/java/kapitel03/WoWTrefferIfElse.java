package de.galileocomputing.schroedinger.java.kapitel03;

public class WoWTrefferIfElse {

	public static void main(String[] args) {
		int treffer = Integer.parseInt(args[0]);
		if(treffer >= 30) {
			System.out.println("Kritischer Treffer");
		} else if(treffer >=16) {
			System.out.println("Normaler Treffer");
		} else if(treffer > 0) {
			System.out.println("Schwacher Treffer");
		} else {
			System.out.println("Kein Treffer");
		}

	}

}
