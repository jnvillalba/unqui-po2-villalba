package unq.tp9.VideoJuego;

public class MaquinaArcade {
	/*Una máquina de video juegos funciona ingresando fichas.
	 *  Además de los controles para jugar, la maquina posee un único
	botón de inicio y una ranura para ingresar fichas. 
	
	EstadoInicial
	*Cuando la maquina se enciende al presionar el botón de inicio 
	*genera un cartel en la pantalla que indica que ingresen fichas,
	
	EstadoUnJugador
	*si se introduce una ficha y se presiona el botón de inicio se comienza el juego para un único jugador;
	
	EstadoDosJugadores
	*si en cambio antes de presionar el inicio se ingresaron dos fichas, pueden jugar dos jugadores. 
	
	*Cuando termina el juego, vuelve al momento inicial.*/
	
	private EstadoMaquina estado = new EstadoInicial();
	private int fichas;
	
	public void setEstado(EstadoMaquina estado) {
		this.estado = estado;
	}
	
	public void iniciar(int fichas) {
		this.ingresarfichas(fichas);
		this.calcularFichas(fichas);
		estado.iniciarJuego();
	}


	private void calcularFichas(int fichasIngresadas) {
		if(fichasIngresadas == 1) {
			this.setEstado( new EstadoUnJugador() );	
		} else {
			this.setEstado( new EstadoDosJugadores() );
		}
		
	}

	private void ingresarfichas(int fichas) {
		this.fichas  += fichas;
	}
}
