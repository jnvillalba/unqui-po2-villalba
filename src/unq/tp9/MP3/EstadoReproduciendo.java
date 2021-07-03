package unq.tp9.MP3;

public class EstadoReproduciendo extends EstadoCancion{

	@Override
	public void play(Song song) {
		throw new RuntimeException("Ya se esta Reproduciendo");
		
	}

	@Override
	public void pause(Song song) {
		song.setEstado(new EstadoPausado());
		
	}

	@Override
	public void stop(Song song) {
		song.setEstado(new EstadoParado());
		
	}
	
	@Override
	protected boolean estaReproduciendo() {
		return true;
	}

}
