
public class P4EX04 {
	public static void main(String[] args) {
		System.out.println("Antes de chamar o m�todo A()");
		metodoA();
		System.out.println("Depois de chamar o m�todo A()");
	}
	
	public static void metodoA() {
		try {
			System.out.println("Antes de chamar o m�todo B()");
			metodoB();
			System.out.println("Depois de chamar o m�todo B()");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void metodoB() {
		System.out.println("Antes de chamar o m�todo C()");
		metodoC();
		System.out.println("Depois de chamar o m�todo C()");
	}
	
	public static void metodoC() {
		System.out.println("Antes de chamar o m�todo D()");
		metodoD();
		System.out.println("Depois de chamar o m�todo D()");
	}
	
	public static void metodoD() {
		System.out.println("Antes da divis�o do m�todo D()");
		int n = 10 / 0;
		System.out.println("Depois de chamar o m�todo D()");
	}
}
