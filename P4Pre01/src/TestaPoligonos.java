
public class TestaPoligonos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retangulo  r = new Retangulo();
		Triangulo t = new Triangulo();
		
		r.setValores(10, 20);
		t.setValores(10, 20);
		
		System.out.println("�rea do Ret�ngulo: "+r.area());
		System.out.println("�rea do Tri�ngulo: "+t.area());
		

	}

}
