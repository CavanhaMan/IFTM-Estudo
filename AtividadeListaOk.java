import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadeListaOk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha = 1;
		
		ArrayList<String> frutas = new ArrayList<String>();
		Collections.addAll(frutas,"Laranja","Banana","Maçâ","Melancia","Uva","Lichia","Pitanga","Graviola","Manga","Pêra");
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("Lista das frutas já pré-inseridas no sistema:");
		System.out.println(frutas);
		do {	
			
			int tamanho = frutas.size();
			
			System.out.println("\n------------------------------------------------------------------");
			System.out.printf("Em que posiçao você deseja inserir uma nova fruta? ");
			int posicao = sc.nextInt();
			if(posicao>tamanho)
				do {
					System.out.println("\n------------------------------------------------------------------");
					System.out.println("Erro! Posição inexistente nesta lista!");
					System.out.printf("A lista só tem %d posições!\n",tamanho);
					System.out.printf("Em que posiçao você deseja inserir uma nova fruta? ");
					posicao = sc.nextInt();
				} while (posicao>frutas.size());
			
			System.out.println("\n------------------------------------------------------------------");
			System.out.printf("Informe uma fruta para ser inserida na %dª posição: ",posicao);
			frutas.add(posicao,sc.next());
		    
			System.out.println("\n------------------------------------------------------------------");
			System.out.println("Segue a lista das frutas com a nova adição: ");
			System.out.println(frutas);
			
			if (posicao==0)
				System.out.printf("\nO novo elemento adicionado é '%s', foi inserido na posição %d e a lista agora tem %d itens.\n",frutas.get(posicao),posicao,frutas.size());
			else
				System.out.printf("\nO novo elemento adicionado é '%s', foi inserido na %dª posição e a lista agora tem %d itens.\n",frutas.get(posicao),posicao,frutas.size());
	
			
			System.out.println("\n------------------------------------------------------------------");
			System.out.println("Quer inserir outra fruta?");
			System.out.printf("Tecle 1 para sim e 2 para não: ");
			escolha = sc.nextInt();
		
		}while (escolha!=2);
		
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("Segue a lista das frutas em ordem alfabética: ");
		Collections.sort(frutas);
		System.out.println(frutas);
	
		
		System.out.println("\n\n\n----------------------- PROGRAMA ENCERRADO -----------------------");
		
		sc.close();
	}
}