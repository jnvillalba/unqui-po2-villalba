package unq.tp9.ReproductorMP3;

import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unq.tp9.MP3.*;

public class EstadoPausadoTest {
	
	private EstadoPausado pausa;
	private Song song;
		
	@BeforeEach
	void setUp() throws Exception {
		pausa = new EstadoPausado();
		song = new Song(pausa);
	}
	
	@Test
	void ReproducirTest() {
		song.play();
		assertTrue(song.estaReproduciendo());
	}
	
	@Test
	void PausarTest() {
		song.pause();
		assertTrue(song.estaReproduciendo());
	}
	
	@Test
	void PararTest() {
		song.stop();
		assertTrue(song.estaParada());
	}
	

}
