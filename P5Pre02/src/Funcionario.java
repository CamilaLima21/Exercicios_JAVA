
public class Funcionario extends Pessoa {
	//atributos
	protected int idFunc;
	protected String cargo;
	
	// construtores
	public Funcionario() {}
	
	public Funcionario(int id, String nome, int idFunc, String cargo) {
		super(id, nome);
		this.idFunc = idFunc;
		this.cargo = cargo;
	}
	
	// getters e setters
	public int getIdFunc() {
		return idFunc;
	}

	public String getCargo() {
		return cargo;
	}

	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	// métodos
	public void imprime() {
		System.out.println("Funcionário...: "+nome);

	}

	
}
