package unq.tp9.Encriptación;

public class EncriptadorNaive{
	
	private EstrategiaEncriptador estrategia; 

	public String encriptar(String texto) {
		return estrategia.encriptar(texto) ;
	}

	public String desencriptar(String texto) {
		return estrategia.desencriptar(texto);
	}

	public EstrategiaEncriptador getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(EstrategiaEncriptador estrategia) {
		this.estrategia = estrategia;
	}

	public EncriptadorNaive(EstrategiaEncriptador estrategia) {
		super();
		this.estrategia = estrategia;
	}
	

}
