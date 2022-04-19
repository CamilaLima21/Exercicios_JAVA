
public class P1EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double C = 36;
		double F = (C * 1.8) + 32;
		double K = C + 273.15;
		double Ra = C * 1.8 + 32 + 459.67;
		double Re = C * 0.8;
		
		System.out.println("A temperatura de "+C+"°c convertida em Fahrenheit (F), é igual a "+F+"°F.");
		System.out.println("A temperatura de "+C+"°c convertida em Kelvin (K), é igual a "+K+"°K.");
		System.out.println("A temperatura de "+C+"°c convertida em Rankine (Ra), é igual a "+Ra+"°Ra.");
		System.out.println("A temperatura de "+C+"°c convertida em Réaumur (Re), é igual a "+Re+"°Re.");
		

	}

}
