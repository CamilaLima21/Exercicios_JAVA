
public class P4EX04 {
	public static void main(String[] args) {
		System.out.println("Antes de chamar o método A()");
		metodoA();
		System.out.println("Depois de chamar o método A()");
	}
	
	public static void metodoA() {
		try {
			System.out.println("Antes de chamar o método B()");
			metodoB();
			System.out.println("Depois de chamar o método B()");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void metodoB() {
		System.out.println("Antes de chamar o método C()");
		metodoC();
		System.out.println("Depois de chamar o método C()");
	}
	
	public static void metodoC() {
		System.out.println("Antes de chamar o método D()");
		metodoD();
		System.out.println("Depois de chamar o método D()");
	}
	
	public static void metodoD() {
		System.out.println("Antes da divisão do método D()");
		int n = 10 / 0;
		System.out.println("Depois de chamar o método D()");
	}
}
