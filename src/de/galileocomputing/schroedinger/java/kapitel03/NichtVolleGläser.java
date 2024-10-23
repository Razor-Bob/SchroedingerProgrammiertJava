package de.galileocomputing.schroedinger.java.kapitel03;

public class NichtVolleGläser {

	public static void main(String[] args) {
		int fuellhoeheInML = 185;
		if (fuellhoeheInML == 250) {
			System.out.println("Das Glas ist voll.");
		} 	else if (fuellhoeheInML ==125) {
			System.out.print("Das Glas ist halb voll.");
		}	else if (fuellhoeheInML < 250)	{
			System.out.println("Das Glas ist nicht mehr voll.");
		}

	}

}
