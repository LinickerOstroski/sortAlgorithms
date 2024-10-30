package model;

import java.util.Comparator;

public class BubbleSort<T> {

	public void troca(T[] vet, int j) {
		T temp = vet[j];
		vet[j] = vet[j+1];
		vet[j+1] = temp;
		
	}
	
	public void bsort(T[] vet, Comparator<T> comparador) {
		for(int fase = 0; fase < vet.length - 1; fase++) {
			boolean trocou = false;
			for(int j = 0; j < vet.length - fase - 1; j++) {
				if(comparador.compare(vet[j], vet[j + 1]) > 0) {
					troca(vet,j);
					trocou = true;
				}
			}
			if(!trocou) {
				break;
			}
		}
	}
}

