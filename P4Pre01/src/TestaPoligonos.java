
public class TestaPoligonos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retangulo  r = new Retangulo();
		Triangulo t = new Triangulo();
		
		r.setValores(10, 20);
		t.setValores(10, 20);
		
		System.out.println("Área do Retângulo: "+r.area());
		System.out.println("Área do Triângulo: "+t.area());
		

	}

}
