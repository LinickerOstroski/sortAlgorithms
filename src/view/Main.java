package view;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Random;

import model.BubbleSort;
import model.Pessoa;

public class Main {
	
	 public static Pessoa[] geraArrayPessoas() {
	        return new Pessoa[]{
	            new Pessoa("Carlos", LocalDate.of(1990, 5, 20)),
	            new Pessoa("Ana", LocalDate.of(1985, 3, 15)),
	            new Pessoa("Ana", LocalDate.of(1983, 3, 15)),
	            new Pessoa("Rafael", LocalDate.of(2000, 1, 25)),
	            new Pessoa("Bruno", LocalDate.of(1992, 7, 10))
	        };
	    }

	public static void populationVector(int[] vet) {
		Random r = new Random();
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = r.nextInt(100);
		}
	}
	
	public static void printVector(int[] vet) {
		for (int integer : vet) {
			System.out.print(integer + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] vet = new int[10];
		
		Pessoa[] vetorDePessoas = geraArrayPessoas();
		
		populationVector(vet);
		
		//printVector(vet);
		
		
		Comparator<Pessoa> comparaNome = (p1, p2) -> 
			p1.getNome().compareTo(p2.getNome());
		
		//InsertionSort isertion = new InsertionSort();
		BubbleSort bubble = new BubbleSort();
		//SelectionSort selection = new SelectionSort();
		
		//isertion.isort(vet);
		//selection.ssort(vet);
		
		for (Pessoa pessoa : vetorDePessoas) {
			System.out.println(pessoa.toString());
		}
		
		
		System.out.println("Vetor ordenado:");
		bubble.bsort(vetorDePessoas, comparaNome);
		
		//System.out.println();
		//System.out.println("Vetor ordenado: ");
		//printVector(vet);
		
		for (Pessoa pessoa : vetorDePessoas) {
			System.out.println(pessoa.toString());
		}
		
		
	}

}
