
public class Pessoa {
	
	protected String rg;
	protected String nome;
	
	public Pessoa() {}
	public Pessoa(String rg, String nome) {
		this.rg = rg;
		this.nome = nome;
		
	}
	public String getRg() {
		return rg;
	}
	public String getNome() {
		return nome;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	//metod
	public void imprime() {
		System.out.println("-----------------------");
		System.out.println("Rg: "+ this.rg);
		System.out.println("Nome: "+ this.nome);
	}
	
	public String fraseBoa() {
		return "Exemplo de frase";
	}
}
