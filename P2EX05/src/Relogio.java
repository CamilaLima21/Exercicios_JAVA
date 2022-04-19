public class Relogio {
	// atributos
	private int hora;
	private int minuto;
	private int segundo;
	
	// construtores
	public Relogio() {}
	public Relogio(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	// getters
	public int getHora() {return this.hora;}
	public int getMinuto() {return this.minuto;}
	public int getSegundo() {return this.segundo;}
	
	// setters
	public void setHora(int hora) {
		this.hora = hora;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	// métodos próprios da classe
	public void adiantar(int seg) {
		int totseg = hora    * 3600 + 
				     minuto  *   60 + 
				     segundo        + seg;
		totseg  = totseg % 86400;
		hora    = totseg /  3600;
		totseg  = totseg %  3600;
		minuto  = totseg /    60;
		totseg  = totseg %    60;
		segundo = totseg;
	}
	
	public void atrasar(int seg) {
		int totseg = hora    * 3600 + 
			         minuto  *   60 + 
			         segundo        - seg;
		
		totseg  = totseg % 86400;
		totseg  = totseg + 86400;
		totseg  = totseg % 86400;
		hora    = totseg /  3600;
		totseg  = totseg %  3600;
		minuto  = totseg /    60;
		totseg  = totseg %    60;
		segundo = totseg;		
	}
	
	public void exibeHorario() {
		System.out.println(hora+":"+minuto+":"+segundo);
	}
}