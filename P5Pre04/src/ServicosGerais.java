public class ServicosGerais {
	// polimorfismo de interface
	public void darParabens(Impressora ref) {
		ref.parabens();
	}
	public void darFelizNatal(Impressora ref) {
		ref.felizNatal();
	}
	public void mostrarDados(Impressora ref) {
		ref.dadosPessoais();
	}
}