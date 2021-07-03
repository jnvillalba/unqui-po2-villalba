package unq.tp9.MP3;

public abstract class EstadoCancion {

	public abstract void play(Song song);

	public abstract void pause(Song song);

	public abstract void stop(Song song);

	public boolean estaEnSeleccion() {
		return false;
	}

	protected boolean estaReproduciendo() {
		return false;
	}
	
	protected boolean estaPausada() {
		return false;
	}

	protected boolean estaParada() {
		return false;
	}

}
