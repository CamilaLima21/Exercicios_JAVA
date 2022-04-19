import  java.util.ArrayList;
import java.util.Scanner;
public class P3Prf07_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList dados = new ArrayList();
		dados.add("Camila");
		dados.add(31);
		dados.add("05/04/1990");
		System.out.println(dados);

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		String nome = scan.nextLine();
		dados.add(nome);
		System.out.println(dados);
		dados.set(1, "Maria");
		System.out.println(dados.size());
		System.out.println(dados.get(3));
		System.out.println(dados.indexOf(3));
		System.out.println(dados.lastIndexOf(31));
		System.out.println(dados.contains("Camila")); 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
