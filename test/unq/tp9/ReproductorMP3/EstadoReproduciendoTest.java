package unq.tp9.ReproductorMP3;

import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unq.tp9.MP3.*;

public class EstadoReproduciendoTest {
	
	private EstadoReproduciendo play;
	private Song song;
		
	@BeforeEach
	void setUp() throws Exception {
		play = new EstadoReproduciendo();
		song = new Song(play);
	}
	
	@Test
	void ReproducirTest() {
		assertThrows(RuntimeException.class, ()->{play.play(song);;});
	}
	
	@Test
	void PausarTest() {
		song.pause();
		assertTrue(song.estaPausada());
		
	}
	
	@Test
	void PararTest() {
		song.stop();
		assertTrue(song.estaParada());
	}
	

}
