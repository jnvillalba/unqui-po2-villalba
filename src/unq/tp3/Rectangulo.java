package unq.tp3;

public class Rectangulo{
	
	private Punto x1;
	private Punto x2;
	private Punto y1;
	private Punto y2;
	
	
	
	public Rectangulo(Punto x1, Punto x2, Punto y1, Punto y2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	public Punto getX1() {
		return x1;
	}

	public void setX1(Punto x1) {
		this.x1 = x1;
	}

	public Punto getX2() {
		return x2;
	}

	public void setX2(Punto x2) {
		this.x2 = x2;
	}

	public Punto getY1() {
		return y1;
	}

	public void setY1(Punto y1) {
		this.y1 = y1;
	}

	public Punto getY2() {
		return y2;
	}

	public void setY2(Punto y2) {
		this.y2 = y2;
	}
	
	public int area() {

		return this.base()*this.altura();
	}
	
	public int altura() {
		
		return y1.getY() - x1.getY();
	}

	public int base() {
		return x2.getX() - x1.getX();
	}
	
	public int perimetro() {
		return 2*( this.base() + this.altura() );
	}
	
	public boolean esHorizontal() {
		return this.base() > this.altura();	
	}
	
	public boolean esVertical() {
		return this.base() < this.altura();	
	}
	
	public String tipoDeFigura() {
		if ( esHorizontal() ) 
			return "Horizontal";
		else 
			return "Vertical" ;
	}
	
	
	
	

}
