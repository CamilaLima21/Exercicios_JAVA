public class TestaInterface {
	public static void main(String[] args) {
		Aluno roberto = new Aluno(12,"Roberto");
		Funcionario minerva = new Funcionario(32,"Minerva");
		
		ServicosGerais ajudante = new ServicosGerais();
		
		ajudante.darParabens(roberto);
		ajudante.darFelizNatal(minerva);
		
		ajudante.mostrarDados(roberto);
		ajudante.mostrarDados(minerva);
	}
}