import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeListaAmanda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    //PERGUNTAR "ONDE" QUER INSERIR

		//1) criar uma lista de String
		ArrayList<String> disciplinas = new ArrayList<String>();
		
		//2) adicionar 10 itens � esta lista
		disciplinas.add("Matem�tica");
		disciplinas.add("Portugu�s");
		disciplinas.add("F�sica");
		disciplinas.add("Geografia");
		disciplinas.add("Hist�ria");
		disciplinas.add("Qu�mica");
		disciplinas.add("Biologia");
		disciplinas.add("Sociologia");
		disciplinas.add("Filosofia");
		disciplinas.add("Artes");
		
		System.out.println(disciplinas);
		
		//3) perguntar ao usuario em que posi��o ele quer inserir mais um elemento
		//mostrar o tamanho da lista pro usu�rio
		System.out.printf("*Tamanho da lista 'disciplinas': "); //dica: pode usar o printf para n�o saltar uma linha....
		System.out.println(disciplinas.size());
		//ser� um int que vai ler a posi��o usando sc.nextInt()
		System.out.println("Selecione a posi��o que gostaria de adicionar uma nova disciplina");
		int pos=sc.nextInt();
		
		//para n�o dar erro, ser� necess�rio fazer um teste:
		//SE 'posicao' FOR > que o TAMANHO DA LISTA*
		while(pos>disciplinas.size()) {
				System.out.println("Posi��o n�o encontrada, por favor digite uma posi��o v�lida: ");
				System.out.printf("*Tamanho da lista 'disciplinas': %d",disciplinas.size());//...ou usar printf e %d para fazer tudo numa linha
				pos=sc.nextInt();
		}
		/*Depois que ele informar a posi��o onde quer inserir
		fazer a entrada do novo elemento, adicionando ele na lista na posi��o desejada
		por exemplo:
		frutas.add(posicao,sc.next());
		o que adicionaria na posicao previamente informada pelo usuario a fruta que ele digitaria neste momento*/
		System.out.println("Digite a disciplina que deseja incluir na lista: ");
		disciplinas.add(pos,sc.next());
		System.out.println(disciplinas);
		
		sc.close();
	}
}