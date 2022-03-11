import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeListaAmanda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    //PERGUNTAR "ONDE" QUER INSERIR

		//1) criar uma lista de String
		ArrayList<String> disciplinas = new ArrayList<String>();
		
		//2) adicionar 10 itens à esta lista
		disciplinas.add("Matemática");
		disciplinas.add("Português");
		disciplinas.add("Física");
		disciplinas.add("Geografia");
		disciplinas.add("História");
		disciplinas.add("Química");
		disciplinas.add("Biologia");
		disciplinas.add("Sociologia");
		disciplinas.add("Filosofia");
		disciplinas.add("Artes");
		
		System.out.println(disciplinas);
		
		//3) perguntar ao usuario em que posição ele quer inserir mais um elemento
		//mostrar o tamanho da lista pro usuário
		System.out.printf("*Tamanho da lista 'disciplinas': "); //dica: pode usar o printf para não saltar uma linha....
		System.out.println(disciplinas.size());
		//será um int que vai ler a posição usando sc.nextInt()
		System.out.println("Selecione a posição que gostaria de adicionar uma nova disciplina");
		int pos=sc.nextInt();
		
		//para não dar erro, será necessário fazer um teste:
		//SE 'posicao' FOR > que o TAMANHO DA LISTA*
		while(pos>disciplinas.size()) {
				System.out.println("Posição não encontrada, por favor digite uma posição válida: ");
				System.out.printf("*Tamanho da lista 'disciplinas': %d",disciplinas.size());//...ou usar printf e %d para fazer tudo numa linha
				pos=sc.nextInt();
		}
		/*Depois que ele informar a posição onde quer inserir
		fazer a entrada do novo elemento, adicionando ele na lista na posição desejada
		por exemplo:
		frutas.add(posicao,sc.next());
		o que adicionaria na posicao previamente informada pelo usuario a fruta que ele digitaria neste momento*/
		System.out.println("Digite a disciplina que deseja incluir na lista: ");
		disciplinas.add(pos,sc.next());
		System.out.println(disciplinas);
		
		sc.close();
	}
}