
public abstract class OperacaoMatematica {
	double x;
	double y;
		
	public OperacaoMatematica() {}

	public OperacaoMatematica(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public abstract double calcular(double x, double y);
	
}
