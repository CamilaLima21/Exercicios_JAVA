import java.util.Scanner;

public class CD extends Midia {
	private int nMusicas;

	public CD() {
		this(0, 0.0, "Nenhum", 0); 
	}

	public CD(int codigo, double preco, String name, int nMusicas) {
		super(codigo, preco, name);
		setMusica(nMusicas);
	}
	
	public String getTipo() {
		return "CD: ";
	}

	public String getDetalhes() {
		return super.getDetalhes() + "\n" + "Número de músicas: " + nMusicas + "\n";
	}

	public void setMusica(int nmus) {
		nMusicas = (nmus > 0) ? nmus : 0;
	}

	public void inserirDados() { 
		super.inserirDados();

		Scanner in = new Scanner(System.in);
		System.out.printf("\nEntre com o número de músicas: ");
		int nmus = in.nextInt();
		setMusica(nmus);
	}
}
