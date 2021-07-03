package unq.tp9.ReproductorMP3;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unq.tp9.MP3.*;

public class EstadoReproductorTest {
	
	private EstadoCancion estado;
		
	@BeforeEach
	void setUp() throws Exception {
		estado = mock(EstadoCancion.class);
	}
	
	@Test
	void estaEnSeleccionTest() {
		assertFalse(estado.estaEnSeleccion());
	}
	
	@Test
	void estaReproduciendoTest() {
		assertFalse(estado.estaEnSeleccion());
	}
	
	@Test
	void estaPausadaTest() {
		assertFalse(estado.estaEnSeleccion());
	}
	
	@Test
	void estaParadaTest() {
		assertFalse(estado.estaEnSeleccion());
	}
}