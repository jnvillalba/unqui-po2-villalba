package unq.tp3;

public class Punto {
 
	private int x;
	private int y;

	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Punto() {
		super();
		this.x = 0;
		this.y = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
 
	public Punto sumarCon_(Punto puntoASumar) {
		Punto puntoSumado = new Punto(x = this.getX() + puntoASumar.getX(),
									  y = this.getY() + puntoASumar.getY());
		return puntoSumado;
	}

}
