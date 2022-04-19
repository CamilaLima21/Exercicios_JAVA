import java.util.Scanner;

public class P3MenorAltura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double menorAltura = 99.0;
		int contador = 0;
		String menorNome = "";
		
		do {
			System.out.print("Informe o nome: ");
			String nome= scan.nextLine();
			System.out.print("Informe a altura: ");
			double altura = Double.parseDouble(scan.nextLine());
			
			if (altura < menorAltura) {
				menorAltura = altura;
				menorNome = nome;
			}			
			contador ++;			
		} while (contador < 10); 
			System.out.println("Menor Altura: "+ menorAltura);
			System.out.println("menor Nome: " +menorNome);
	}
		
}
