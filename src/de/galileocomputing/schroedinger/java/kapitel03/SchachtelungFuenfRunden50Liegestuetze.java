package de.galileocomputing.schroedinger.java.kapitel03;

public class SchachtelungFuenfRunden50Liegestuetze {

	public static void main(String[] args) {
		// Geschachtelte for-Schleife von 5 Runden mit je 50 Liegestütze
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			System.out.println(". Runde - auf geht's:");
			for(int j=1; j<=50; j++) {
				System.out.println(j);
				System.out.println(". Liegestütz");
			}
		}

	}

}
