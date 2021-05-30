package unq.tp6;

public class Carta {
	private int valor;
	private String palo;
	
	public Carta(int valor, String palo) {
		super();
		this.valor = valor;
		this.palo = palo;
		
	}

	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}

	public boolean esSuperiorA(Carta cartaAComparar) {
		return this.getValor() > cartaAComparar.getValor();
	}
	
	public boolean poseeMismoPalo(Carta cartaAComparar) {
		return this.palo == cartaAComparar.getPalo();
	}


}
