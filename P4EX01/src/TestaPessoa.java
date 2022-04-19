import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno("Camila", "1234", "05/04/1990", "0001");
		Professor p1 = new Professor("João", "321", "23/02/1980", 3500.0, "Português");
		Funcionario f1 = new Funcionario("Maria", "4567", "09/08/1975", 1500.0, "02/09/2000", "Merendeira");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escolha uma opção de acordo com as opções abaixo:\n\n"
				+ "1- Aluno\n"
				+ "2- Professor\n"
				+ "3- Funcionário\n\n"
				+ "A operação escolhida foi: ");
		int opc = 0;
		opc = scan.nextInt();
								
		switch(opc){
		case 1:
			System.out.println("Informe a quantidade de cópias que você deseja: ");
			a1.tirarCopias(scan.nextInt());
			break;
		case 2:
			System.out.println("Informe a quantidade de cópias que você deseja: ");
			p1.tirarCopias(scan.nextInt());
			break;
		case 3:
			System.out.println("Informe a quantidade de cópias que você deseja: ");
			f1.tirarCopias(scan.nextInt());
			break;
		default:
			System.out.println("\nInforme a operação com os números de 1 a 3.");
		}
		
		
		
		
		
		
		
		
		
		
				
		
		
		
	
	}

}
