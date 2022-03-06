import java.util.Locale;
import java.util.Scanner;

public class telefonica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int i;
		int MENU=0;
		double excedente;
		System.out.printf("Quantos clientes serão analizados: ");
		int N = sc.nextInt();
		String[] n1 = new String[N];
		String[] n2 = new String[N];
		String[] nome = new String[N];
		String[] fone = new String[N];
		int[] tipo = new int[N];
		int[] pulsos = new int[N];
		double[] conta = new double[N];
		double[][] preco = new double[N][2];
		
		//ENTRADA DE TADOS
		for(i=0 ; i<N ; i++){
			System.out.printf("Insira o nome e sobrenome do %dº cliente: ",i+1);
			n1[i]=sc.next();
			n2[i]=sc.next();
			nome[i] = n1[i] + " " + n2[i];
			System.out.printf("Insira o telefone de %s: ",nome[i]);
			fone[i]=sc.next();
			System.out.printf("Insira o tipo (num.) de assinatura de %s: ",nome[i]);
			tipo[i]=sc.nextInt();
			System.out.printf("Insira a quantidade de pulsos gastos por %s: ",nome[i]);
			pulsos[i]=sc.nextInt();
			System.out.printf("\n");
		}
		
		//s3 = String.format("%═80s", s3);
		//ENTRADA DAS TARIFAS
		for(i=0 ; i<3 ; i++){
			System.out.printf("Forneça o valor do preço básico da %dª assinatura: ",i+1);
			preco[i][0]=sc.nextDouble();
			System.out.printf("Forneça o valor dos pulsos excedentes da %dª assinatura: ",i+1);
			preco[i][1]=sc.nextDouble();
			System.out.printf("\n");
			}

		//CALCULA EXCEDENTE
		for(i=0 ; i<N ; i++){
			if(pulsos[i]<=90)
				conta[i]=preco[i][0];
			else{
				excedente = pulsos[i]-90;
				conta[i] = preco[i][0] + (excedente * preco[i][1]);
			}
		}
		for(i=0;i<50;i++)System.out.printf("\n"); //"limpa a tela"
		System.out.format("╔══════════════════╦══════════╦═════╦═══════╦═══════════════╗%n");
		System.out.printf("║%18s","Nome");
		System.out.printf("║%10s","Telefone");
		System.out.printf("║%5s","Tipo");
		System.out.printf("║%7s","Pulsos");
		System.out.printf("║%15s"," Valor da Conta║");
		System.out.printf("\n");
		System.out.format("╠══════════════════╬══════════╬═════╬═══════╬═══════════════╣%n");
		for(i=0 ; i<N ; i++){
			System.out.printf("║%18s",nome[i]);
			System.out.printf("║%10s",fone[i]);
			System.out.printf("║%5d",tipo[i]);
			System.out.printf("║%7d",pulsos[i]);
			System.out.printf("║%15.2f║",conta[i]);
			System.out.printf("\n");
		}
		System.out.format("╚══════════════════╩══════════╩═════╩═══════╩═══════════════╝%n");
		
		System.out.printf("\n\n");
		
		
		//************* MENU *******************************************
		while(MENU!=7){
			System.out.format("╔═══════════════════════════════════════════════════════════════════════╗%n");
			System.out.printf("║ESCOLHA UMA DAS OPÇÕES DO MENU: %41s","║\n");
			System.out.format("╠═══════════════════════════════════════════════════════════════════════╣%n");
			System.out.printf("║0) Ver a tabela original %48s","║\n");
			System.out.printf("║1) A receita total da empresa telefônica %32s","║\n");
			System.out.printf("║2) Nome e telefone do cliente do qual a conta foi mais barata %11s","║\n");
			System.out.printf("║3) Média de pulsos consumidos por clientes de conta tipo 1 %14s","║\n");
			System.out.printf("║4) Nomes e telefones dos clientes que não consumiram pulsos excedentes %2s","║\n");
			System.out.printf("║5) A quantidade de clientes que consumiu acima de 120 pulsos %12s","║\n");
			System.out.printf("║6) A porcentagem de clientes que possuem conta tipo 2 %19s","║\n");
			System.out.printf("║7) Sair %65s","║\n");
			System.out.format("╚═══════════════════════════════════════════════════════════════════════╝%n");
			MENU=sc.nextInt();
			
			if(MENU==0){
				for(i=0;i<50;i++)System.out.printf("\n"); //"limpa a tela"
				System.out.format("╔══════════════════╦══════════╦═════╦═══════╦═══════════════╗%n");
				System.out.printf("║%18s","Nome");
				System.out.printf("║%10s","Telefone");
				System.out.printf("║%5s","Tipo");
				System.out.printf("║%7s","Pulsos");
				System.out.printf("║%15s"," Valor da Conta║");
				System.out.printf("\n");
				System.out.format("╠══════════════════╬══════════╬═════╬═══════╬═══════════════╣%n");
				for(i=0 ; i<N ; i++){
					System.out.printf("║%18s",nome[i]);
					System.out.printf("║%10s",fone[i]);
					System.out.printf("║%5d",tipo[i]);
					System.out.printf("║%7d",pulsos[i]);
					System.out.printf("║%15.2f║",conta[i]);
					System.out.printf("\n");
				}
				System.out.format("╚══════════════════╩══════════╩═════╩═══════╩═══════════════╝%n%n");
			}
			if(MENU==1){
				for(i=0;i<50;i++)System.out.printf("\n"); //"limpa a tela"
				double receita=0;
				for(i=0 ; i<N ; i++)
					receita+=conta[i];
				System.out.printf("A receita total da empresa telefônica é: R$ %.2f\n\n",receita);
			}
			if(MENU==2){
				for(i=0;i<50;i++)System.out.printf("\n"); //"limpa a tela"
				double MENOR=conta[0], MAIOR=conta[0];
				int posicaoMenor=0, posicaoMaior=0;
				for(i=0 ; i<N ; i++){
					if(conta[i]<MENOR){
						MENOR=conta[i];
						posicaoMenor=i;
					}
					if(conta[i]>MAIOR){
						MAIOR=conta[i];
						posicaoMaior=i;
					}
				}
				System.out.printf("A conta mais barata é a do(a) cliente: %s, fone: %s\n",nome[posicaoMenor],fone[posicaoMenor]);
				System.out.printf("A conta mais cara é a do(a) cliente:   %s, fone: %s\n\n",nome[posicaoMaior],fone[posicaoMaior]);
			}
			if(MENU==3){
				for(i=0;i<50;i++)System.out.printf("\n"); //"limpa a tela"
				int SOMA=0,MEDIA=0;
				System.out.printf("Clientes tipo 1:\n\n");
				System.out.format("╔══════════════════╦══════════╗%n");
				System.out.printf("║%18s","Nome");
				System.out.printf("║%11s"," Telefone ║\n");
				System.out.format("╠══════════════════╬══════════╣%n");
				for(i=0 ; i<N ; i++)
					if(tipo[i]==1){
						SOMA++;
						MEDIA+=pulsos[i];
						System.out.printf("║%18s",nome[i]);
						System.out.printf("║%10s║\n",fone[i]);
					}
				System.out.format("╚══════════════════╩══════════╝%n");
				System.out.printf("\n");
				MEDIA=MEDIA/SOMA;
				System.out.printf("A média de pulsos consumido por clientes tipo 1 é: %d\n\n",MEDIA);
			}
			if(MENU==4){
				for(i=0;i<50;i++)System.out.printf("\n"); //"limpa a tela"
				int naoexcedentes=0;
				System.out.printf("Clientes que não consumiram pulsos excedentes:\n\n");
				System.out.format("╔══════════════════╦══════════╗%n");
				System.out.printf("║%18s","Nome");
				System.out.printf("║%11s"," Telefone ║\n");
				System.out.format("╠══════════════════╬══════════╣%n");
				for(i=0 ; i<N ; i++)
					if(pulsos[i]<=90){
						naoexcedentes++;
						System.out.printf("║%18s",nome[i]);
						System.out.printf("║%10s║\n",fone[i]);
					}
				System.out.format("╚══════════════════╩══════════╝%n");
				System.out.printf("\n");
				System.out.printf("Total de clientes que não consumiram pulsos excedentes: %d\n\n",naoexcedentes);
			}
			if(MENU==5){
				for(i=0;i<50;i++)System.out.printf("\n"); //"limpa a tela"
				int excedentes=0;
				System.out.printf("Clientes com pulsos excedentes acima de 120:\n\n");
				System.out.format("╔══════════════════╦══════════╗%n");
				System.out.printf("║%18s","Nome");
				System.out.printf("║%11s"," Telefone ║\n");
				System.out.format("╠══════════════════╬══════════╣%n");
				for(i=0 ; i<N ; i++)
					if(pulsos[i]>120){
						excedentes++;
						System.out.printf("║%18s",nome[i]);
						System.out.printf("║%10s║\n",fone[i]);
					}
				System.out.format("╚══════════════════╩══════════╝%n");
				System.out.printf("\n");
				System.out.printf("Total de clientes com pulsos excedentes acima de 120: %d\n\n",excedentes);
			}
			if(MENU==6){
				for(i=0;i<50;i++)System.out.printf("\n"); //"limpa a tela"
				System.out.printf("Clientes tipo 2:\n\n");
				System.out.format("╔══════════════════╦══════════╗%n");
				System.out.printf("║%18s","Nome");
				System.out.printf("║%11s"," Telefone ║\n");
				System.out.format("╠══════════════════╬══════════╣%n");
				int conta2=0;
				double x=0.0;
				for(i=0 ; i<N ; i++)
					if(tipo[i]==2){
						conta2++;
						System.out.printf("║%18s",nome[i]);
						System.out.printf("║%10s║\n",fone[i]);
					}
				System.out.format("╚══════════════════╩══════════╝%n");
				System.out.printf("\n");
				x=(conta2*100)/N;
				System.out.printf("A porcentagem de clientes que possuem conta tipo 2 é: %.2f%%\n\n",x);
			}
			if(MENU==7){
				for(i=0;i<50;i++)System.out.printf("\n"); //"limpa a tela"
				System.out.format("╔════════════════════════════════════════════════════════════╗%n");
				System.out.format("║                                                            ║%n");
				System.out.format("║                                                            ║%n");
				System.out.printf("║ Obrigado por escolher a nossa companhia. Tenha um bom dia! ║%n");
				System.out.format("║                                                            ║%n");
				System.out.format("║                                                            ║%n");
				System.out.format("║                            F I M                           ║%n");
				System.out.format("║                                                            ║%n");
				System.out.format("║                                                            ║%n");
				System.out.format("╚════════════════════════════════════════════════════════════╝%n");
				sc.close();
			}
			if(MENU>7){
				for(i=0;i<50;i++)System.out.printf("\n"); //"limpa a tela"
				System.out.println("Opção inválida\n\n");
			}
		}

		
		sc.close();
	}
}