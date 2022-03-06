import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class alfa_lista_encripta {
    private static Scanner input;

    public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
        input = new Scanner(System.in);

        // Declaracao de variáveis
        String sEntrada = input.nextLine();
        sEntrada = sEntrada.toLowerCase();
        //System.out.println(sEntrada);
        
        char[] cEntrada = sEntrada.toCharArray();
        //System.out.println(cEntrada);
        
        int[] senha = {10,8,4,11,2};
        
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
        
		System.out.println("--------- TEXTO CRIPTOGRAFADO: ---------");
		saida="";
	    for (int x : iEntrada) 
	    	saida+=x+",";

	    System.out.println(saida);
		
    }
}