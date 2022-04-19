import java.util.Scanner;

public class Lampada {
	private int potencia;
	private boolean status;

	//M�todos construtores
	public Lampada() {}
	public Lampada(int potencia, boolean status){
		this.potencia = potencia;
		this.status = status;
	}

	//M�todos getters
	public int getPotencia(){
		return this.potencia;
	}
	public boolean getStatus(){
		return this.status;
	}

	//M�todos setters
	public void setPotencia(int potencia){
		this.potencia = potencia;
	}
	public void setStatus(boolean status){
		this.status = status;
	}

	//M�todo toString
	public String toString(){
		String retorno="";

		retorno += "Objeto l�mpada:\n";
		retorno += "\tPot�ncia: "+this.potencia+"\n";
		if(this.status==true)	retorno += "\tStatus: ligado\n";
		else retorno+= "\tStatus: desligado\n";

		return retorno;
	}

	// M�todo acender
	public void Acender(){
		setStatus(true);
	}

	// M�todo apagar
	public void Apagar(){
		setStatus(false);
	}
        
}