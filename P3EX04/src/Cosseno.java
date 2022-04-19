
public class Cosseno {
	// atributos
	
	private double x;
	private double parcelas[];
	private double cosseno;
	 
	 
	public Cosseno() {
		parcelas = new double[10];
	}


	public Cosseno(double x) {
		this.x = x;
		parcelas = new double[10];
	}


	// getters e setters
		public void setX(double x) {
			this.x = x;
		}
		public double getX() {return this.x;}
		public double getCosseno() {return this.cosseno;}
		
		// métodos próprios da classe
		private double fatorial(int n) {
			if(n<2) return 1;
			return n * fatorial(n-1);
		}
		
		public void calculaParcelas() {
			double sinal = 1.0;
			for (int i=0; i<10; i++) {
				parcelas[i]= sinal * 1.0 / fatorial(i*2) * Math.pow(x,2*i);
				sinal = sinal * -1;
			}
		}
		
		public void somaParcelas() {
			for(double p:parcelas) {
				cosseno = cosseno + p;			
			} 
		}
	}