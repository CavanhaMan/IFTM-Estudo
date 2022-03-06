/*
╔════════════════════╗
║ Rodrigo CavanhaMan ║
║        IFTM        ║
╚════════════════════╝*/
//O algoritmos faz: cada letra = letra+3;
//consideramos 26 letras e espaços não contam
//Usa maiusculas e minusculas, conforme tabela ASCII:
//	a=97    z=122
//	A=65    z=90

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Cifra1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
        //Entra uma string:
        String sEntrada = sc.nextLine();
        //Passa tudo pra minusculo:
        sEntrada = sEntrada.toLowerCase();
        //Converte a string para um vetor de char:
        char[] cEntrada = sEntrada.toCharArray();
        //Senha a ser usada:
        int[] senha = {10,8,4,11,2};
        //Entro o alfabeto (incluindo o espaço) como uma string (pra facilitar!)
        String sAlfabeto = " abcdefghijklmnopqrstuvwxyzç";
        //Converto o alfabeto para um vetor de char (para poder usar a posição de cada letra)
        char[] cAlfabeto = sAlfabeto.toCharArray();
        //Crio um vetor de int para guardar os números após a conversão
        int iEntrada[] = new int[cEntrada.length];
        
        //CONVERTE O TEXTO PARA NÚMEROS
        for(int i=0 ; i< cEntrada.length ; i++)
        	for(int j=0 ; j<cAlfabeto.length ; j++)
        		if(Character.compare(cEntrada[i], cAlfabeto[j])==0) {
        			iEntrada[i] = j;
        			i++; //se a comparação for ok, passa pra próxima letra e...
        			j=0; //...e zera o alfabeto pra começar a comparar novamente.
        		}
        System.out.println(Arrays.toString(iEntrada));
       	System.out.println(Arrays.toString(cEntrada));
       	
       	//ADICIONA A SENHA:
        for(int i=0 ; i< cEntrada.length ; i++)
        	for(int j=0 ; j<senha.length ; j++) {
        		iEntrada[i]+=senha[j];
        		if(j==senha.length) j=0; //verificação de segurança para não estourar o vetor na ultima volta
        		i++;
        		if(i==cEntrada.length) i=0; //volta a senha pro início
        	}
        System.out.println(Arrays.toString(iEntrada));
        		
        //RECONVERTE OS NÚMEROS PARA LETRA:
        String saida = "";
        for(int i=0 ; i< iEntrada.length ; i++)
        	if(iEntrada[i]>cAlfabeto.length)
        		saida+=iEntrada[i];
        	else
        		saida+=cAlfabeto[iEntrada[i]];
        System.out.println(saida);
        
        
       	sc.close();
	}
}