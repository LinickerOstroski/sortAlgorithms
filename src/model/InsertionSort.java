package model;

public class InsertionSort {
	
	public void isort(int[] vet) {
		for(int i = 1; i < vet.length; i++) {
			int currentValue = vet[i];
			int j = i - 1;
			while(j >= 0 && vet[j] > currentValue) {
				vet[j + 1] = vet[j];
				j--;
			}
			
			vet[j + 1] = currentValue;
		}
	}
	
	public void isort(int[] vet, boolean desordenado) {
		if(desordenado) {
			for(int i = 1; i < vet.length; i++) {
				int currentValue = vet[i];
				int j = i - 1;
				while(j >= 0 && vet[j] < currentValue) {
					vet[j + 1] = vet[j];
					j--;
				}
				
				vet[j + 1] = currentValue;
			}
		}else {
			isort(vet);
		}
	}
}
