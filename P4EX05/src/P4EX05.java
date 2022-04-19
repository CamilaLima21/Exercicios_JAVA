import java.util.Scanner;

public class P4EX05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		   boolean erro = true;
		   int num=0;
		   do {
			   try {
				   System.out.print("Digite um número inteiro: ");
				   num = scan.nextInt();
				   erro = false;
			   }
			   catch(Exception e) {
				   System.out.println("Este não é um número inteiro numérico, tente novamente!");
				   erro = true;
				   scan.nextLine();
			   }
		   } while (erro);
		   
		   System.out.print("Você digitou: "+num);
	   }

}
