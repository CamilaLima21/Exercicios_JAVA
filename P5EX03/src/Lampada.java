import java.util.Scanner;

public class Lampada {
	private int potencia;
	private boolean status;

	//Métodos construtores
	public Lampada() {}
	public Lampada(int potencia, boolean status){
		this.potencia = potencia;
		this.status = status;
	}

	//Métodos getters
	public int getPotencia(){
		return this.potencia;
	}
	public boolean getStatus(){
		return this.status;
	}

	//Métodos setters
	public void setPotencia(int potencia){
		this.potencia = potencia;
	}
	public void setStatus(boolean status){
		this.status = status;
	}

	//Método toString
	public String toString(){
		String retorno="";

		retorno += "Objeto lâmpada:\n";
		retorno += "\tPotência: "+this.potencia+"\n";
		if(this.status==true)	retorno += "\tStatus: ligado\n";
		else retorno+= "\tStatus: desligado\n";

		return retorno;
	}

	// Método acender
	public void Acender(){
		setStatus(true);
	}

	// Método apagar
	public void Apagar(){
		setStatus(false);
	}
        
}