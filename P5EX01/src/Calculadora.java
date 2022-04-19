import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Contas c1 = new Contas();
		
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println("         CALCULADORA			");
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
				
		
		System.out.println("Escolha de acordo com as op��es abaixo:\n\n"
				+ "1- Soma\n"
				+ "2- Subtra��o\n"
				+ "3- Multiplica��o\n"
				+ "4- Divis�o\n"
				+ "5- Resto da Divis�o\n\n"
				+ "A opera��o escolhida foi: ");
		int opc = 0;
		opc = scan.nextInt();
								
		switch(opc){
		case 1:
			System.out.println("A soma de 5 + 10 � igual a  = ");
			c1.mostrarCalculo(new Soma(), 5, 10);
			break;
		case 2:
			System.out.println("A subtra��o de 10 - 5 � igual a  = ");
			c1.mostrarCalculo(new Subtracao(), 10, 5);
			break;
		case 3:
			System.out.println("A multiplica��o de 5 X 10 � igual a  = ");
			c1.mostrarCalculo(new Multiplicacao(), 5, 10);
			break;
		case 4:
			System.out.println("A divis�o de 50 / 2 � igual a  = ");
			c1.mostrarCalculo(new Divisao(), 50, 2);
			break;
		case 5:
			System.out.println("O resto da divis�o de 5 / 3 � igual a  = ");
			c1.mostrarCalculo(new Resto(), 3, 2);
			break;
		default:
			System.out.println("\nInforme a op��o escolhida com os n�meros de 1 a 5.");
		}
		
	}

}
