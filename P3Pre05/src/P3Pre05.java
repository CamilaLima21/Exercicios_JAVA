
public class P3Pre05 {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(a); 			// endereço da memória do array
		int soma  = 0;
		char c[] = {'a', 'b', 'c', 'd', 'e'};
		String nome[] = {"Camila", "Marques", "de", "Lima"};
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " - ");
			soma = soma + a[i];
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " - ");
			soma = soma + c[i];
		}
		System.out.println("\nA soma dos valores do Array é igual a : " + soma);
		
		for(int i = 0; i < nome.length; i++) {
			System.out.print(nome[i] + " ");
			//soma = soma + nome[i];
		}
	}

}
