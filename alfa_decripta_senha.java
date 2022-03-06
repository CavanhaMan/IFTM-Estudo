/*
╔════════════════════╗
║ Rodrigo CavanhaMan ║
║        IFTM        ║
╚════════════════════╝*/
//O algoritmos faz:
//Recebe os números que são o texto criptografados com a senha
//Subtrai a senha
//Devolve o texto original reconvertido em Alfabeto
import java.util.Locale;
import java.util.Scanner;

public class alfa_decripta_senha {
    private static Scanner input;

    public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
        input = new Scanner(System.in);

        System.out.printf("Entre com a frase a ser decriptografada: ");
        //--------- DECRIPTANDO: ---------"
        String sDecripta = input.nextLine();
        //System.out.println(sDecripta);
        String[] cDecripta = sDecripta.split(",");
        //System.out.println(cDecripta);
        
		//--------- SUBTRAINDO A SENHA: ---------
        int[] senha = {10,8,4,11,2};
        int trocaSenha = 0;
        String eSenha="";
		String ssenha="";
        String[] cSenha = {};

	    for (int i : senha) 
	    	ssenha+=i+",";
	    System.out.printf("A senha atual é: %s\n",ssenha);
        System.out.println("Desej trocar esta senha? ");
        System.out.println("Digite 1 para SIM");
        System.out.println("Digite 2 para NÃO");
        trocaSenha = input.nextInt();
        do {
            if (trocaSenha==1) {
	        	System.out.println("Informe senha que foi utilizada, com 5 números separados por espaço: ");
	        	eSenha=input.next();
	        }
	        else if (trocaSenha==2) {
	        	System.out.printf("A senha atual foi mantida %s\n",ssenha);
	        }
	        else {
	        	System.out.printf("\nOpção inválida. Digite 1 para SIM ou 2 para NÃO: ");
	        	trocaSenha = input.nextInt();
	        }
        } while  (trocaSenha!=1 && trocaSenha!=2);
        
        cSenha = eSenha.split(" ");
		for(int i=0 ; i<cSenha.length ; i++)
			senha[i] = Integer.parseInt(cSenha[i]); 
        
        int iEntrada[] = new int[cDecripta.length];
        
	    for(int x=0 ; x<cDecripta.length ; x++)
	    	iEntrada[x]= Integer.parseInt(cDecripta[x]);
        
		for(int i=0 ; i<iEntrada.length ; i++)
        	for(int j=0 ; j<senha.length ; j++)
        		iEntrada[i]-=senha[j];
		
		//--------- RETORNANDO AO ALFABETO: ---------
		System.out.println("--------- TEXTO DECRIPTOGRAFADO: ---------");
        String sAlfabeto = " abcdefghijklmnopqrstuvwxyz";
        char[] cAlfabeto = sAlfabeto.toCharArray();

		String sSaida = "";
		
		for(int i=0 ; i<iEntrada.length ; i++)
        	for(int j=0 ; j<cAlfabeto.length ; j++) {
        		if(iEntrada[i]==j) {
        			sSaida+=cAlfabeto[j];
        			j=26;
        		}
        	}

	    System.out.println(sSaida);
    }
}