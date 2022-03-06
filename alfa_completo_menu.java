/*
┌════════════════════════════════════════════════════════════┐
║                                                            ║
║                    Rodrigo C. Baltazar                     ║
║                        CRIPTOGRAFIA                        ║
║                            IFTM                            ║
║                                                            ║
└════════════════════════════════════════════════════════════┘
*/
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class alfa_completo_menu {
    private static Scanner sc;

    public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
        sc = new Scanner(System.in);

        //************* VARIAVEIS GLOBAIS ******************************
        String sEntrada = "";
        sEntrada = "";//sEntrada.toLowerCase();
        char[] cEntrada = {};//sEntrada.toCharArray();
        String sSenha = "";
        String[] cSenha = {};
        int[] nSenha = {10,8,4,11,2};
        String sAlfabeto = " abcdefghijklmnopqrstuvwxyz";
        char[] cAlfabeto = sAlfabeto.toCharArray();
        
        int iEntrada[] = new int[cEntrada.length];

        //************* MENU *******************************************
		int MENU=0;
		while(MENU!=3){
			System.out.format("╔═══════════════════════════════════════════════════════════════════════╗\n");
			System.out.printf("║ SISTEMA DE CRIPTOGRAFIA DO CAVANHA!                                   ║\n");
			System.out.format("╠═══════════════════════════════════════════════════════════════════════╣\n");
			System.out.printf("║ 0) Fornecer uma chave para a criptografia                             ║\n");
			System.out.printf("║ 1) Inserir texto a ser criptografado                                  ║\n");
			System.out.printf("║ 2) Inserir texto encriptado para ser decodificado                     ║\n");
			System.out.printf("║ 3) Sair                                                               ║\n");
			System.out.format("╚═══════════════════════════════════════════════════════════════════════╝\n");
			MENU=sc.nextInt();
			
			if(MENU==0){
				int menuSenha=0;
				while(menuSenha!=3){
					System.out.format("╔═══════════════════════════════════════════════════════════════════════╗\n");
					System.out.printf("║ INSIRA A SENHA PARA A CRIPTOGRAFIA:                                   ║\n");
					System.out.format("╠═══════════════════════════════════════════════════════════════════════╣\n");
					System.out.printf("║ 0) Mostrar a senha atual                                              ║\n");
					System.out.printf("║ 1) Inserir uma senha de texto (a-z)                                   ║\n");
					System.out.printf("║ 2) Inserir uma senha numérica (0-9)                                   ║\n");
					System.out.printf("║ 3) Manter a senha atual e voltar para o menu principal                ║\n");
					System.out.format("╚═══════════════════════════════════════════════════════════════════════╝\n");
					menuSenha=sc.nextInt();
					if(menuSenha==0){
						String pass = Arrays.toString(nSenha);
						for(int i=0;i<50;i++)System.out.printf("\n"); //"limpa a tela"
						System.out.format("╔═══════════════════════════════════════════════════════════════════════╗\n");
						System.out.format("║ A senha atual é: %52s ║\n",pass);
						System.out.format("╚═══════════════════════════════════════════════════════════════════════╝\n");
						//System.out.format("║ A senha atual é: %4s                                    ║\n",pass);
					}
					if(menuSenha==1){
						System.out.println("Digite a palavra a ser usada como senha:");
						sSenha = sc.nextLine();
						sSenha = sc.nextLine();
						cSenha = sSenha.split("");
						for(int i=0 ; i<cSenha.length ; i++)
							nSenha[i] = Integer.parseInt(cSenha[i]); 
						
				        for(int i=0 ; i<cEntrada.length ; i++)
				        	for(int j=0 ; j<cAlfabeto.length ; j++) {
				        		//System.out.printf("1) i:%d j:%d cEntrada:%s cAlfabeto:%s \n",i,j,cEntrada[i],cAlfabeto[j]);
				        		if(cEntrada[i]==cAlfabeto[j]) {
				            		//System.out.printf("2--) i:%d j:%d cEntrada:%s cAlfabeto:%s iEntrada:%d \n",i,j,cEntrada[i],cAlfabeto[j],iEntrada[i]);
				        			iEntrada[i] = j;
				        			j=26;
				        		}
				        	}

					}
					if(menuSenha==2){
						System.out.println("Digite os números (0 a 99) separados por um espaço.");
						sSenha = sc.nextLine();
						sSenha = sc.nextLine();
						cSenha = sSenha.split(" ");
						for(int i=0 ; i<cSenha.length ; i++)
							nSenha[i] = Integer.parseInt(cSenha[i]); 
					}
					if(menuSenha==3){
						
					}				
				}
				
				if(MENU==1){
				}
				
				if(MENU==2){
				}
				
				if(MENU==3){
					for(int i=0;i<50;i++)System.out.printf("\n"); //"limpa a tela"
					System.out.format("╔═══════════════════════════════════════════════════════════════════════╗%n");
					System.out.format("║                                                                       ║%n");
					System.out.format("║                                                                       ║%n");
					System.out.printf("║         Obrigado por utilizar o nosso sistema de criptografia!        ║%n"); 
					System.out.format("║                                                                       ║%n");
					System.out.format("║                                                                       ║%n");
					System.out.format("║                                  F I M                                ║%n");
					System.out.format("║                                                                       ║%n");
					System.out.format("║                                                                       ║%n");
					System.out.format("╚═══════════════════════════════════════════════════════════════════════╝%n");
				}
				if(MENU>3){
					for(int i=0;i<50;i++) System.out.printf("\n"); //"limpa a tela"
					System.out.println("Opção inválida\n\n");
				}
			}
        
		}
        
        //Entrada de variáveis
        sEntrada = sc.nextLine();
        sEntrada = sEntrada.toLowerCase();
        cEntrada = sEntrada.toCharArray();
        //int iEntrada[] = new int[cEntrada.length];
        
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
        	for(int j=0 ; j<nSenha.length ; j++)
        		iEntrada[i]+=nSenha[j];
        
		System.out.println("--------- TEXTO CRIPTOGRAFADO: ---------");
		saida="";
	    for (int x : iEntrada) 
	    	saida+=x+",";

	    System.out.println(saida);
		
    }
}