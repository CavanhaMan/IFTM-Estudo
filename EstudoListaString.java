import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EstudoListaString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("------------------------------ LISTA DE CARROS: ------------------------------");
		System.out.println();
	    
	    //CRIA UMA LISTA DE CARROS
		ArrayList<String> carros = new ArrayList<String>();
		//ADICIONA CARROS À LISTA
		carros.add("Volvo");
	    carros.add("BMW");
	    carros.add("Ford");
	    carros.add("Mazda");
	    
	    System.out.println("------------------ IMPRIME A LISTA EM FORMATO DE LISTA: ");
	    System.out.println(carros);
	    
	    System.out.println();

	    System.out.println("------------------ IMPRIME O ELEMENTO NA POSIÇÃO 0: ");
	    System.out.println(carros.get(0));
	    System.out.println("------------------ IMPRIME O ELEMENTO NA POSIÇÃO 3: ");
	    System.out.println(carros.get(3));
	    
	    carros.set(0, "OPEL");	//"ALTERA O ELEMENTO 0 PELA STRING "OPEL"
	    //carros.set(4, "OPEL");//NAO FUNCIONA PORQUE AINDA NÃO EXISTE O ELEMENTO 4
	    carros.add(4, "0Volkswagen");// INSERE NA 4ª POSICAO O TEXTO
	    System.out.println(carros);
		carros.add(5, "1Volkswagen"); //INSERE NA 5ª POSICAO O TEXTO
		System.out.println(carros);
		carros.add("2Volkswagen");//INSERE O TEXTO NA ÚLTIMA POSICAO LIVRE
	    System.out.println(carros);
	    carros.add(4, "Tesla");//INSERE NA 4ª POSICAO O TEXTO E MUDA OS OUTROS ELEMENTOS DE LUGAR
	    System.out.println(carros);
	    carros.set(4, "ABOBRINHA");//ALTERA O ELEMENTO DA 4ª POSICAO PARA O TEXTO 'ABOBRINHA'
	    System.out.println(carros);
		   
	    System.out.println("------------------ IMPRIME O ELEMENTO NA POSIÇÃO 0 APOS ALTERAR O PRIMEIRO ELEMENTO: ");
	    System.out.println(carros.get(0));
	    System.out.println(carros);
	    
	    carros.remove(4);		//REMOVE O ELEMENTO DA POSIÇÃO 0
	    System.out.println("------------------ IMPRIME O NOVO ELEMENTO NA POSIÇÃO 0 APOS REMOÇÃO: ");
	    System.out.println(carros.get(0));
	    System.out.println(carros);
	    System.out.println("------------------ IMPRIME TODA A LISTA: ");
	    System.out.println(carros);
	    
	    carros.clear();			//LIMPA A LISTA
	    System.out.println("------------------IMPRIME A LISTA VAZIA: ");
	    System.out.println(carros);
	    
	    System.out.println("------------------ENTRA COM DOIS CARROS NA LISTA VAZIA: ");
	    System.out.println("Digite 2 carros:");
	    carros.add(sc.next());
	    carros.add(sc.next());
	    System.out.println(carros);
	    
	    System.out.println("------------------QUANTOS CARROS QUER INSERIR: ");
	    int num = sc.nextInt();
	    System.out.printf("------------------ENTRA COM %d CARROS NA LISTA: ",num);
	    for(int i=0 ; i<num ; i++)
	    	carros.add(sc.next());
	    
	    //READICIONA ELEMENTOS À LISTA:
	    carros.add("Opel");
	    carros.add("Volvo");
	    carros.add("BMW");
	    carros.add("Ford");
	    carros.add("Mazda");
	    System.out.println("------------------ IMPRIME A LISTA NOVAMENTE PREENCHIDA: ");
	    System.out.println(carros);
	    
	    System.out.println();
	    //TAREFA: PERGUNTAR "ONDE" QUER INSERIR
	    //(será um int que vai informar a posição)
	    //para não dar erro, será necessario fazer um teste:
	    //SE 'posicao' FOR > que o TAMANHO DA LISTA*
	    //avisar o erro e informar o tamanho da lista
	    //será algo assim:
	    //se (posicao > carros.size()) entao.....
	    System.out.println("*Tamanho da lista 'carros':");
	    System.out.println(carros.size());

	    System.out.println();
	    
	    System.out.println("------------------ IMPRIME A LISTA USANDO 'FOR': ");
	    for (int j = 0; j < carros.size(); j++)
	        System.out.println(carros.get(j));
	    
	    System.out.println();
	    
	    System.out.println("------------------ IMPRIME A LISTA USANDO 'FOR' MAIS SIMPLES: ");
	    for (String x : carros)
	        System.out.println(x);
	    
	    System.out.println();
	    
	    System.out.println("------------------ IMPRIME A LISTA USANDO 'FOR/EACH': ");
	    carros.forEach(x->System.out.println(x));	        

		
		Collections.sort(carros);	//ORDENA A LISTA
		System.out.println("------------------ IMPRIME A LISTA ORDENADA: ");
		System.out.println(carros);
		
		Collections.reverse(carros); //INVERTE A LISTA
		System.out.println("------------------ IMPRIME A LISTA INVERTIDA: ");
		System.out.println(carros);
		
		sc.close();
	}
}