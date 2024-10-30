package model;

public class SelectionSort {
	
	public void troca(int[] vet, int a, int b) {
		int temp = vet[a];
		vet[a] = vet[b];
		vet[b] = temp;
	}
	
	
	public void ssort(int[] vet) {
		for(int i = 0; i < vet.length - 1; i++) {
			int menor = vet[i];
			int indexMenor = i;
			for(int j = i + 1; j < vet.length; j++) {
				if(vet[j] < menor) {
					menor = vet[j];
					indexMenor = j;
				}
			}
			troca(vet, i, indexMenor);
		}
	}

}
