import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Date;

public class TestaPesquisa {
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random(new Date().getTime());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList IBOPE = new ArrayList();
		
		System.out.println("Quantas pessoas vão participar da pesquisa: ");
		int qtdPessoas = Integer.parseInt(scan.nextLine());
		
		System.out.println("Tipo pesquisa: \n\n1- Digitada\n2- Simulada");
		int tipoPesquisa = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < qtdPessoas; i++) {
			if(tipoPesquisa == 1) {
				IBOPE.add(getPesquisaManual());
			}
			else {
				IBOPE.add(getPesquisaSimulada());
			}				
		}
		
		System.out.println("Qtde. Homens SIM...: "+QHRS(IBOPE));
		System.out.println("Qtde. Mulheres NAO.: "+QMRN(IBOPE));
		System.out.println("% Homens SIM.......: "+PHRS(IBOPE));
		System.out.println("% Mulheres NAO.....: "+PMRN(IBOPE));
	}
	
	public static Pesquisa getPesquisaManual() {
		Pesquisa p = new Pesquisa();
		System.out.println("Pesquisa " +p.getNumPesquisa());
		System.out.println("Sexo (M/F) ");
		char sexo = scan.nextLine().charAt(0);
		System.out.println("Respota (S/N) ");
		char resposta = scan.nextLine().charAt(0);
		p.setSexo(sexo);
		p.setResposta(resposta);
		return p;
	}
	
	public static Pesquisa getPesquisaSimulada() {
		char sexo = rand.nextBoolean()? 'M':'F';
		char resposta = rand.nextBoolean()? 'S':'N';
		
		return new Pesquisa(sexo, resposta);
	}
	
	public static int QHRS(ArrayList a) {
		int qhrs = 0;
		for(int i = 0; i < a.size(); i++) {
			Pesquisa p = (Pesquisa)a.get(i);
			if(p.getSexo()== 'M' && p.getResposta() == 'S') {
				qhrs++;
			}
			
		}
		return qhrs;
	}
	
	public static int QMRN(ArrayList a) {
		int qmrn = 0;
		for(int i = 0; i < a.size(); i++) {
			Pesquisa p = (Pesquisa)a.get(i);
			if(p.getSexo()== 'F' && p.getResposta() == 'N') {
				qmrn++;
			}
			
		}
		return qmrn;
}
	public static double PHRS(ArrayList a) {
		double qhrs = 0;
		double qh = 0;
		
		for(int i=0; i<a.size();i++) {
			Pesquisa p = (Pesquisa) a.get(i);
			if(p.getSexo()=='M') {
				qh++;
				if (p.getResposta()=='S') {
					qhrs++;
				}
			}
		}
		return qhrs/qh*100.0;
	}

	public static double PMRN(ArrayList a) {
		double qmrn = 0;
		double qm = 0;
		
		for(int i=0; i<a.size();i++) {
			Pesquisa p = (Pesquisa) a.get(i);
			if(p.getSexo()=='F') {
				qm++;
				if (p.getResposta()=='N') {
					qmrn++;
				}
			}
		}
		return qmrn/qm*100.0;
	}
}
