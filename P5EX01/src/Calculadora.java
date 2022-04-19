import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Contas c1 = new Contas();
		
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println("         CALCULADORA			");
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
				
		
		System.out.println("Escolha de acordo com as opções abaixo:\n\n"
				+ "1- Soma\n"
				+ "2- Subtração\n"
				+ "3- Multiplicação\n"
				+ "4- Divisão\n"
				+ "5- Resto da Divisão\n\n"
				+ "A operação escolhida foi: ");
		int opc = 0;
		opc = scan.nextInt();
								
		switch(opc){
		case 1:
			System.out.println("A soma de 5 + 10 é igual a  = ");
			c1.mostrarCalculo(new Soma(), 5, 10);
			break;
		case 2:
			System.out.println("A subtração de 10 - 5 é igual a  = ");
			c1.mostrarCalculo(new Subtracao(), 10, 5);
			break;
		case 3:
			System.out.println("A multiplicação de 5 X 10 é igual a  = ");
			c1.mostrarCalculo(new Multiplicacao(), 5, 10);
			break;
		case 4:
			System.out.println("A divisão de 50 / 2 é igual a  = ");
			c1.mostrarCalculo(new Divisao(), 50, 2);
			break;
		case 5:
			System.out.println("O resto da divisão de 5 / 3 é igual a  = ");
			c1.mostrarCalculo(new Resto(), 3, 2);
			break;
		default:
			System.out.println("\nInforme a opção escolhida com os números de 1 a 5.");
		}
		
	}

}
