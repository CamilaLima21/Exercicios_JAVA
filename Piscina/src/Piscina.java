
public class Piscina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pp = 1.2;
		double pg = 3.0;
		double dg = 40.0;
		double dp = 12.0;
		double pm = (pp + pg) / 2;
		double qtdLitros = dg * dp * pm * 785.0;
		System.out.println("Serão necessários " + qtdLitros + 
							" litros para encher a piscina.");
	}
}
