
public class TestaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa [] povo = new Pessoa [5];
		povo[0] = new Pessoa(1, "Camila", 1.65);
		povo[1] = new Pessoa(2, "Ana", 1.80);
		povo[2] = new Pessoa(3, "João", 1.95);
		povo[3] = new Pessoa(4, "Pedro", 2.05);
		povo[4] = new Pessoa(5, "José", 1.45);
		
		double media = Pessoa.mediaAltura(povo);
		
		System.out.println(media);

	}

}
