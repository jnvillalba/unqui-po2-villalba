package unq.tp9.ReproductorMP3;

import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unq.tp9.MP3.*;

public class EstadoSeleccionDeCancionesTest {
	
	private EstadoSeleccionDeCanciones seleccion;
	private Song song;
		
	@BeforeEach
	void setUp() throws Exception {
		seleccion = new EstadoSeleccionDeCanciones();
		song = new Song(seleccion);
	}
	
	@Test
	void ReproducirTest() {
		song.play();
		assertTrue(song.estaReproduciendo());	
	}
	
	@Test
	void PausarTest() {
		assertThrows(RuntimeException.class, ()->{seleccion.pause(song);;});
	}
	
	@Test
	void PararTest() {
		assertThrows(RuntimeException.class, ()->{seleccion.stop(song);;});
	}
	

}
