import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EstudoListaInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = 10;
		System.out.println(w);
		
		System.out.printf("\n");
	    System.out.println("------------------------------ LISTA DE NUMEROS: ------------------------------");
	    System.out.println();

	    //CRIA UMA LISTA COM NÚMEROS
		List<Integer> numeros = new ArrayList<Integer>();
	    System.out.println(numeros);
		numeros.add(10);
		numeros.add(15);
		numeros.add(20);
		numeros.add(25);
		System.out.println(numeros);
		
		/* CÓDIGO PARA COMPARAR A LISTA ACIMA COM UM ARRAY (VETOR) */
		int[] numeroVetor = new int[4];
		System.out.println("Digite 4 números para inserir no array:");
		for(int j=0 ; j<4 ; j++)
			numeroVetor[j]=sc.nextInt();
		for(int j=0 ; j<4 ; j++)
			System.out.printf("%d, ",numeroVetor[j]);	
		
		System.out.println();
		
		int[] numVetor = {100,105,200,205};
		for(int j=0 ; j<numVetor.length ; j++)
			System.out.printf("%d, ",numVetor[j]);
		
		System.out.println();
		
		System.out.println(numeroVetor); //ASSIM NAO FUNCIONA
		System.out.println(numVetor); //ASSIM NAO FUNCIONA
		
		System.out.println(numeros);
		
		System.out.println("------------------ IMPRIME A LISTA DE NUMEROS: ");
	    for (int i : numeros) 
	      System.out.println(i);
	    
	    for (int i : numeros) 
		      System.out.printf("%d, ",i);
	    
	    System.out.println();
	    
	    System.out.println("------------------ INSIRA 10 NUMEROS PARA A LISTA DE NUMEROS: ");
	    for(int x=0 ; x<10 ; x++)
	    	numeros.add(sc.nextInt());
	    
	    System.out.println("------------------ IMPRIME A LISTA EM FORMATO DE LISTA: ");
	    System.out.println(numeros);
	    
		Collections.sort(numeros);	//ORDENA A LISTA
		System.out.println("------------------ IMPRIME A LISTA ORDENADA: ");
		ArrayList<Integer> numOrdenados = new ArrayList<Integer>(numeros); //criei uma cópia da lista para não alterar a lista original
		System.out.println(numOrdenados);
		
		Collections.reverse(numOrdenados); //INVERTE A LISTA (a cópia)
		System.out.println("------------------ IMPRIME A LISTA INVERTIDA: ");
		System.out.println(numOrdenados);
		
		System.out.println("------------------ INFORME QUAL ELEMENTO VOCE QUER REMOVER (A PRIMEIRA OCORRENCIA): ");
		System.out.println(numeros); //imprime a lista original, sem ordenaçao
		Integer itemaremover = 10;//sc.nextInt();
		numeros.remove(itemaremover);	//remove o 1o item ESCOLHIDO da lista

		System.out.println("------------------ LISTA COM O ELEMENTO ESCOLHIDO REMOVIDO: ");
		System.out.println(numeros);
		System.out.println();
		
		System.out.println("------------------ INFORME QUAL ELEMENTO VOCE QUER REMOVER (TODOS DA LISTA): ");
		//itemaremover = sc.nextInt();
		numeros.removeAll(Arrays.asList(itemaremover));//remove TODOS item ESCOLHIDOS da lista
		System.out.println("------------------ LISTA COM TODAS OCORRENCIAS DO ELEMENTO ESCOLHIDO REMOVIDO: ");
		System.out.println(numeros);
		System.out.println("");
	    
		
		sc.close();
	}
}