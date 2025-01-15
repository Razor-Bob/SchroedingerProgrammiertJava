package de.galileocomputing.schroedinger.java.kapitel03;

public class SchachtelungFuenfRunden50LiegestuetzeGedankenzaehlen {

	public static void main(String[] args) {
		// Geschachtelte for-Schleife von 5 Runden mit je 50 Liegestütze mit Gedankenzählen bis 10
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			System.out.println(". Runde - auf geht's:");
			for(int j=1; j<=50; j++) {
				System.out.println(j);
				System.out.println(". Liegestütz");
				for(int k=1; k<=10; k++) {
					System.out.println(k);
				}
			}
		}

	}

}
