package de.galileocomputing.schroedinger.java.kapitel03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WoWTextadventure2IfElseSchleife {

	public static void main(String[] args) throws IOException {
		System.out.println(
				"Hallo " + args[0] + ", willkommen in der World of Warcraft. Du befindest dich im Dorf Buxelknuxel.");
		System.out.println(
				"Verwende die Tasten 'N', 'O', 'S' und 'W', um dich zu bewegen, und 'I', um einen Blick in dein Inventar zu werfen.");
		System.out.println("Mit 'Q' verlässt du das Spiel.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String befehl;
		int nordenZähler = 0;
		boolean kroneGefunden = false;		
		while ((befehl = br.readLine()) != null) {
			switch (befehl.toLowerCase()) {
			case "n":
				System.out.println("Du gehst nach Norden.");
				nordenZähler++;
				if(!kroneGefunden && nordenZähler == 4) {
					System.out.println("Du findest einen Schatz.");
					final int breite = 25; // nur ungerade Zahlen sind erlaubt
					final int haelfteBreite = (breite-1)/2;
					final int hoehe = haelfteBreite;
					final int letzteReihe = hoehe-1;
					for (int i = 0; i < hoehe; i++) {
						for (int j = 0; j < breite; j++) {
							switch(i) {
							case 0:
								if(j==0 || (j==haelfteBreite) || j==breite-1) {
									System.out.print("*");
								} else {
									System.out.print(" ");
								}
								break;
							case letzteReihe:
								System.out.print(8);
								break;
							default:
								if(j<i || (j>haelfteBreite-i && j<haelfteBreite+i) || j>=breite-i) {
									System.out.print(0);
								} else {
									System.out.print(" ");
								}
							}
						}
						System.out.println();
					}
					kroneGefunden = true;
				}
				break;
			case "o":
				System.out.println("Du gehst nach Osten.");
				break;
			case "s":
				System.out.println("Du gehst nach Süden.");
				break;
			case "w":
				System.out.println("Du gehst nach Westen.");
				break;
			case "q":
				System.out.println("Willst du wirklich schon aufgeben? Y/N");
				String bestaetigung = br.readLine();
				switch (bestaetigung.toLowerCase()) {
				case "y":
					System.out.println("Und Tschüss.");
					System.exit(0);
					break;
				case "n":
					System.out.println("Finde ich prima.");
					break;
				}
				break;
			case "":
				System.out.println("Du willst gar nichts machen? Das glaube ich nicht.");
				break;
			case "i":
				System.out.println(
						"Da Du noch nicht die Weisheit des Array-Kundigen erlangt hast, befindet sich in deinem Inventar nur ein einziger Gegenstand: ein Holzschwert.");
				break;
			default:
				System.err.println("Das verstehe ich nicht.");
			}
		}
	}
}