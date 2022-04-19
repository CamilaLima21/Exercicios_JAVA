import java.util.Scanner;
import java.lang.Math;

public class P1EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Informe o valor da massa: ");
		Scanner in = new Scanner(System.in);		
		double massa = in.nextDouble();
		System.out.println("Informe a altura: ");
		double altura = in.nextDouble();
		System.out.println("Informe o tempo: ");
		double tempo = in.nextDouble();
		
		double cavalos = massa * altura / tempo / 745.6999;
		
		String frase = ("Para levantar " + massa +"kg a uma altura de " + altura + "m em " + tempo + "s serão necessários " + Math.round((cavalos * 100.0)/100.01) +" cavalos.");
		
		System.out.println(frase);
		
	}
	

}
