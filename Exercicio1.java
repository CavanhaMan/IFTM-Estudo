
/*-----------------*
|Rodrigo CavanhaMan|
|Exercicios em Java|
*------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Exercicio1 {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		/** RENDAS *********/
		System.out.printf("Renda anual com sal�rio:");
		float rSalario = sc.nextFloat();
		System.out.printf("Renda anual com presta��o de servi�o:");
		float rServico = sc.nextFloat();
		System.out.printf("Renda anual com ganho de capital:");
		float rCapital = sc.nextFloat();
		float rTotal = rSalario + rServico + rCapital;
		
		/** GASTOS *********/
		System.out.printf("Gastos m�dicos:");
		float gMedicos = sc.nextFloat();
		System.out.printf("Gastos educacionais:");
		float gEducacao = sc.nextFloat();
		float gTotal = gMedicos + gEducacao;
		
		System.out.println("\n\nRELAT�RIO DE IMPOSTO DE RENDA");
		System.out.println("\nCONSOLIDADO DE RENDA:");
		
		/** IMPOSTO SOBRE SALARIO *********/
		float iSalario=0;
		float salMes=rSalario/12;
		if (salMes <= 3000) iSalario = 0;
		else if(salMes > 3000 && salMes < 5000) iSalario = rSalario*10/100;
		else if(salMes >= 5000) iSalario = rSalario*20/100;
		if (iSalario == 0) 
			System.out.println("Imposto sobre sal�rio: Isento");
		else
			System.out.printf("Imposto sobre sal�rio: %.2f\n",iSalario);
		
		/** IMPOSTO SOBRE SERVI�OS *********/
		float iServico=0;
		if (rServico > 0)
			iServico = rServico*15/100;
		
		System.out.printf("Imposto sobre servi�os: %.2f\n", iServico);
		
		/** IMPOSTO SOBRE GANHOS DE CAPITAL *********/
		float iCapital=0;
		if (rCapital > 0)
			iCapital = rCapital*20/100;
		
		System.out.printf("Imposto sobre ganho de capital: %.2f\n", iCapital);
		
		float iTotal = iSalario+iServico+iCapital;

		/** DEDU��ES *********/
		System.out.println("\nDEDU��ES:");
		float maxDedutivel = iTotal*30/100;
		System.out.printf("M�ximo dedut�vel: %.2f\n", maxDedutivel);
		System.out.printf("Gastos dedut�veis: %.2f\n", gTotal);
		
		/** RESUMO *********/
		System.out.println("\nRESUMO:");
		System.out.printf("Imposto bruto total: %.2f\n", iTotal);
		if(gTotal > maxDedutivel) gTotal = maxDedutivel;
		System.out.printf("Abatimento: %.2f\n", gTotal);
		System.out.printf("Imposto devido: %.2f\n", iTotal-gTotal);
		

		sc.close();
	}
}
/*
_________________________________________
Valores de teste 1:
-----------------------------------------
48000.00
0.00
800.00
400.00
5400.00
-----------------------------------------
Resultados 1:
-----------------------------------------
RELAT�RIO DE IMPOSTO DE RENDA
CONSOLIDADO DE RENDA:
Imposto sobre sal�rio: 4800.00
Imposto sobre servi�os: 0.00
Imposto sobre ganho de capital: 160.00
DEDU��ES:
M�ximo dedut�vel: 1488.00
Gastos dedut�veis: 5800.00
RESUMO:
Imposto bruto total: 4960.00
Abatimento: 1488.00
Imposto devido: 3472.00


_________________________________________
Valores de teste 2:
-----------------------------------------
189000.00
55184.93
20000.00
600.00
7500.00
-----------------------------------------
Resultados 2:
-----------------------------------------
RELAT�RIO DE IMPOSTO DE RENDA
CONSOLIDADO DE RENDA:
Imposto sobre sal�rio: 37800.00
Imposto sobre servi�os: 8277.74
Imposto sobre ganho de capital: 4000.00
DEDU��ES:
M�ximo dedut�vel: 15023.32
Gastos dedut�veis: 8100.00
RESUMO:
Imposto bruto total: 50077.74
Abatimento: 8100.00
Imposto devido: 41977.74 

*/