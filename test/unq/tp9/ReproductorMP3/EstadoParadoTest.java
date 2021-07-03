package unq.tp9.ReproductorMP3;

import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unq.tp9.MP3.*;

public class EstadoParadoTest {
	
	private EstadoParado pause;
	private Song song;
		
	@BeforeEach
	void setUp() throws Exception {
		pause = new EstadoParado();
		song = new Song(pause);
	}
	
	@Test
	void ReproducirTest() {
		song.play();
		assertTrue(song.estaReproduciendo());	
	}
	
	@Test
	void PausarTest() {
		assertThrows(RuntimeException.class, ()->{pause.pause(song);;});
	}
	
	@Test
	void PararTest() {
		song.stop();
		assertTrue(song.estaEnSeleccion());
	}
	

}
