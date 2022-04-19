
public class Testa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa("1234", "Camila");
		
		p1.setRg("5678");
		p1.setNome("Maria");
		
		p1.imprime();
		p2.imprime();
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario("001", "Joana", 500, "DevFullStack", 15000.0);
		
		f1.setRg("9012");
		f1.setNome("Pedro");
		f1.setIdFunc(545);
		f1.setCargoFunc("DBA Oracle");
		f1.setSalarioFunc(12000.0);
		
		f1.imprime();
		f2.imprime();
		
		System.out.println(p1.fraseBoa());
		System.out.println(f1.fraseBoa());
		
		System.out.println(f1.toString());
		System.out.println(p1.toString());
		
		System.out.println(f1.hashCode());
		System.out.println(p1.hashCode());
	}

}
