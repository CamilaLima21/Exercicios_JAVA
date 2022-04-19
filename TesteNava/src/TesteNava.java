import java.util.Scanner;
public class TesteNava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		// definindo o tamanho do array
		int n;
		do {
			System.out.println("Quantos elementos você irá informar: ");
			n = Integer.parseInt(scan.nextLine());
		} while(n <= 0 || n > 9);

		// carga do array
		int a[] = new int[n];
		 
		for (int i = 0; i < a.length; i ++) {
			System.out.println("Entre com um inteiro");
			a[i] = Integer.parseInt(scan.nextLine());
			
		}
		
		// impressão dos negativos
		for(int i = 0; i < a.length; i++) {
			if(a[i] < 0) {
				System.out.println(a[i]);
			}
		}
	}

}
