package unq.tp9.MP3;

public class EstadoPausado extends EstadoCancion {

	@Override
	public void play(Song song) {
		song.setEstado(new EstadoReproduciendo());

	}

	@Override
	public void pause(Song song) {
		song.setEstado(new EstadoReproduciendo());

	}

	@Override
	public void stop(Song song) {
		song.setEstado(new EstadoParado());

	}
	
	@Override
	protected boolean estaPausada() {
		return true;
	}

}
