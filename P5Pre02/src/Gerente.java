
public class Gerente extends Funcionario {
	private int qtdFunc;

	public Gerente() {}

	public Gerente(int id, String nome, int idFunc, String cargo, int qtdFunc) {
		super(id, nome, idFunc, cargo);
		this.qtdFunc = qtdFunc;
	}

	public int getQtdFunc() {
		return qtdFunc;
	}

	public void setQtdFunc(int qtdFunc) {
		this.qtdFunc = qtdFunc;
	}

	public void imprime() {
		System.out.println("Gerente...: "+nome);
	}	
	
}
