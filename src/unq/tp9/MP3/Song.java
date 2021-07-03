package unq.tp9.MP3;

public class Song {
	
	private EstadoCancion estado;

	public EstadoCancion getEstado() {
		return estado;
	}

	public void setEstado(EstadoCancion estado) {
		this.estado = estado;
	}
	
	public void play() {
		estado.play(this);
	}
	public void pause() {
		estado.pause(this);
	}
	public void stop() {
		estado.stop(this);
	}

	public Song(EstadoCancion estado) {
		super();
		this.estado = estado;
	}
	
	public boolean estaEnSeleccion() {
		return estado.estaEnSeleccion();
	}
	
	public boolean estaReproduciendo() {
		return estado.estaReproduciendo();
	}
	
	public boolean estaPausada() {
		return estado.estaPausada();
	}
	
	public boolean estaParada() {
		return estado.estaParada();
	}
	
	
	
	
	
	
	

}
