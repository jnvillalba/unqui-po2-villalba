package unq.tp9.MP3;

public class EstadoParado extends EstadoCancion{

	@Override
	public void play(Song song) {
		song.setEstado(new EstadoReproduciendo());
		
	}

	@Override
	public void pause(Song song) {
		throw new RuntimeException("No se puede pausar cuando la cancion esta parada");
		
	}

	@Override
	public void stop(Song song) {
		song.setEstado(new EstadoSeleccionDeCanciones());
		
	}
	
	@Override
	protected boolean estaParada() {
		return true;
	}

}
