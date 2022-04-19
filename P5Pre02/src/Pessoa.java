
public abstract class Pessoa {
	//atributos
	protected int id;
	protected String nome;
	
	// construtores
	public Pessoa() {}
	
	public Pessoa(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	//getters e setters
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// metodos
	public abstract void imprime();	
	
}
