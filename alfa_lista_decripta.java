import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class alfa_lista_decripta {
    private static Scanner input;

    public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
        input = new Scanner(System.in);

		//System.out.println("--------- DECRIPTANDO: ---------");
        String sDecripta = input.nextLine();
        //System.out.println(sDecripta);
        String[] cDecripta = sDecripta.split(",");
        //System.out.println(cDecripta);
        
		//System.out.println("--------- SUBTRAINDO A SENHA: ---------");
		List<Integer> senha = new ArrayList<Integer>();
		senha.addAll (Arrays.asList (10,8,4,11,2));
		
		List<Integer> iEntrada = new ArrayList<Integer>();

        //int iEntrada[] = new int[cDecripta.length];
        
	    for(int x=0 ; x<cDecripta.length ; x++)
	    	iEntrada.add (Integer.parseInt(cDecripta[x]));
        
		for(int i=0 ; i<iEntrada.size() ; i++)
        	for(int j=0 ; j<senha.size() ; j++)
        		//iEntrada.get(i)-=senha.get(j);
		
		System.out.println("--------- TEXTO DECRIPTOGRAFADO: ---------");
        String sAlfabeto = " abcdefghijklmnopqrstuvwxyz";
        char[] cAlfabeto = sAlfabeto.toCharArray();

		String sSaida = "";
		//	        System.out.println(carros.get(j));

		for(int i=0 ; i<iEntrada.size() ; i++)
        	for(int j=0 ; j<cAlfabeto.length ; j++) {
        		if(iEntrada.get(i)==j) {
        			sSaida+=cAlfabeto[j];
        			j=26;
        		}
        	}

	    System.out.println(sSaida);
    }
}