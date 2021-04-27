package unq.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> numerosAContar = new ArrayList<Integer>();
	
	public Counter() {
	}
	
	public ArrayList<Integer> numerosPares() { 
		ArrayList<Integer> pares = new ArrayList<Integer>();
		for (Integer numero:numerosAContar ) {
			if (numero%2==0) 
		    	pares.add(numero);
		}
		return pares;
	}
	
	public ArrayList<Integer> numerosImpares() { 
		ArrayList<Integer> impares = new ArrayList<Integer>();
		for (Integer numero:numerosAContar ) {
			if (numero%2!=0) 
		    	impares.add(numero);
		}
		return impares;
	}
	

	public void addNumber(int i) {
		numerosAContar.add(i);
	}

	public int getEvenOcurrences() {
		// TODO Auto-generated method stub
		return this.numerosPares().size();
	}
	
	public int getOddOcurrences() {
		// TODO Auto-generated method stub
		return this.numerosImpares().size();
	}
	
}
