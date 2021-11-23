package org.generation.italy.geometria;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int base, altezza, perimetro, area;
		Rettangolo rett;
		
		System.out.println("Inserisci di seguito la base e l'altezza del tuo rettangolo ");
		System.out.print("Base: ");
		base = scan.nextInt();
		while (base <= 0) {
			System.out.print("\nPer favore inserisci un valore maggiore di zero: ");
			base = scan.nextInt();
		}
		System.out.print("Altezza: ");
		altezza = scan.nextInt();
		while (altezza == base  || altezza <= 0) {
			System.out.println("\nPer favore inserisci un valore maggiore di zero e diverso dalla base: ");
			altezza = scan.nextInt();
		}
		rett = new Rettangolo(base, altezza);
		
		area = rett.calcolaArea(base, altezza);
		perimetro = rett.calcolaPerimetro(base, altezza);
		
		System.out.println("Il perimetro del rettangolo è: " + perimetro);
		System.out.println("L'area del rettangolo è: " + area);
				
		scan.close();
	}

}
