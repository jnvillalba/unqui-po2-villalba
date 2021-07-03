package unq.tp9.MP3;

public class EstadoSeleccionDeCanciones extends EstadoCancion{

	@Override
	public void play(Song song) {
		song.setEstado(new EstadoReproduciendo());
		
	}

	@Override
	public void pause(Song song) {
		throw new RuntimeException("No se puede pausar en el modo seleccion");
		
	}

	@Override
	public void stop(Song song) {
		throw new RuntimeException("No se puede parar en el modo seleccion");
	}
	
	@Override
	protected boolean estaEnSeleccion() {
		return true;
	}

}
