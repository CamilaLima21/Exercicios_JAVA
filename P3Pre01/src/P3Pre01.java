
import java.util.Scanner;

public class P3Pre01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lerTecl = new Scanner(System.in);
		
		int qtdPessoas;
		double somaAltura = 0.0;
		
		 for(qtdPessoas = 0; qtdPessoas < 10; qtdPessoas ++) {
			 System.out.print("Entre com sua altura: ");
			 double altura = Double.parseDouble(lerTecl.nextLine());
			 somaAltura += altura;			 
		 }
		 double mediaAltura = somaAltura / qtdPessoas;
		 System.out.println("Altura média = " +mediaAltura);
	}

}
