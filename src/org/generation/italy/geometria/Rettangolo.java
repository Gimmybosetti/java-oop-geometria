package org.generation.italy.geometria;

public class Rettangolo {
	
	int base;
	int altezza;
	
	Rettangolo () {
		this.base = 2;
		this.altezza = 1;
	}
	
	Rettangolo (int base, int altezza){
		this.base = base;
		this.altezza = altezza;
	}
	
	int calcolaArea (int base, int altezza) {
		return base*altezza;
	}
	
	int calcolaPerimetro (int base, int altezza) {
		return (base*2) + (altezza*2);
	}
}