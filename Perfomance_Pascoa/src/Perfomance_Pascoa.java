
public class Perfomance_Pascoa {

	public static void main(String[] args) {
		int ano = 2022;
		int a = ano % 19;
		int b = ano / 100;
		int c = ano % 100;
		int d = b / 4;
		int e = b % 4;
		int f = (b + 8) / 25;
		int g = (b - f + 1) / 3;
		int h = (19 * a + b - d - g + 15) % 30;
		int i = c / 4;
		int j = c % 4;
		int k = (32 + 2 * e + 2 * i - h - j) % 7;
		int L = (a + 11 * h + 22 * k) / 451;
		int mes = (h + k - 7 * L + 114) / 31;
		int dia = ((h + k - 7 * L + 114) % 31) + 1;
		
		
		System.out.println(dia + "/"+ mes +"/"+ ano);
		
}

}