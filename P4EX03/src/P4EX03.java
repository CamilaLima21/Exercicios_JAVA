import java.util.Scanner;

public class P4EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Veiculo v1 = new Veiculo();

		boolean erro = true;
		
		int velocidade = 0;
		
		do {
			try {
				System.out.print("Qual � a velocidade? ");
				velocidade = scan.nextInt();
				erro = false;
			} catch (Exception e) {
				System.out.println("Este n�o � um n�mero inteiro num�rico, tente novamente!");
				erro = true;
				scan.nextLine();
			}
		} while (erro);

		System.out.print("Voc� digitou: " + velocidade);

	}

}
