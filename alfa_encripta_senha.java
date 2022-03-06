import java.util.Locale;
import java.util.Scanner;

public class alfa_encripta_senha {
    private static Scanner input;

    public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
        input = new Scanner(System.in);

        System.out.printf("Entre com a frase a ser criptografada: ");
        // Declaracao de variáveis
        String sEntrada = input.nextLine();
        sEntrada = sEntrada.toLowerCase();
        //System.out.println(sEntrada);
        
        char[] cEntrada = sEntrada.toCharArray();
        //System.out.println(cEntrada);
        
        int[] senha = {10,8,4,11,2};
        int trocaSenha = 0;
        String eSenha="";
		String ssenha="";
        String[] cSenha = {};
        
	    for (int i : senha) 
	    	ssenha+=i+",";
        System.out.printf("A senha atual é: %s\n",ssenha);
        System.out.println("Deseja trocar esta senha? ");
        System.out.println("Digite 1 para SIM");
        System.out.println("Digite 2 para NÃO");
        trocaSenha = input.nextInt();
        do {
            if (trocaSenha==1) {
	        	System.out.println("Informe uma nova senha, com 5 números separados por espaço: ");
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
        
        String sAlfabeto = " abcdefghijklmnopqrstuvwxyz";
        char[] cAlfabeto = sAlfabeto.toCharArray();
        
        int iEntrada[] = new int[cEntrada.length];
        
        for(int i=0 ; i<cEntrada.length ; i++)
        	for(int j=0 ; j<cAlfabeto.length ; j++) {
        		//System.out.printf("1) i:%d j:%d cEntrada:%s cAlfabeto:%s \n",i,j,cEntrada[i],cAlfabeto[j]);
        		if(cEntrada[i]==cAlfabeto[j]) {
            		//System.out.printf("2--) i:%d j:%d cEntrada:%s cAlfabeto:%s iEntrada:%d \n",i,j,cEntrada[i],cAlfabeto[j],iEntrada[i]);
        			iEntrada[i] = j;
        			j=26;
        		}
        	}
		//System.out.println("--------- RESULTADO: ---------");
		String saida="";
	    for (int i : iEntrada) 
	    	saida+=i+",";

	    System.out.println(saida);

		//System.out.println("--------- SOMANDO A SENHA: ---------");
		//int[] senha = {10,8,4,11,2};
		for(int i=0 ; i<iEntrada.length ; i++)
        	for(int j=0 ; j<senha.length ; j++)
        		iEntrada[i]+=senha[j];
        
		System.out.println("--------- RESULTADO COM SENHA: ---------");
		saida="";
	    for (int x : iEntrada) 
	    	saida+=x+",";

	    System.out.println(saida);
		
    }
}