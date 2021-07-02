package unq.tp9.MP3;

public class EstadoSeleccionDeCanciones extends EstadoReproductor {

	@Override
	public void play() {
		// reproduce la cancion
		
	}

	@Override
	public void pause() {
		throw new RuntimeException("No se puede pausar en modo de seleccion");
		
	}

	@Override
	public void stop() {
		//throw new RuntimeException("No se puede parar en modo de seleccion");
		
	}

}
