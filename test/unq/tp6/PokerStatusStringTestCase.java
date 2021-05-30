package unq.tp6;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusStringTestCase {
	
	private PokerStatusString poker;
	private String P2;
	private String C2;
	private String D2;
	private String T2;
	private String P10;
	private String C10;
	private String P4;
	private String P5;
	private String P6;
	
	@BeforeEach
	public void setUp(){
		
		//Set Up
		poker = mock(PokerStatusString.class);
		P2 = "2P";
		C2 = "2C";
		D2 = "2D";
		T2 = "2T";
		P10 = "10P";
		C10 = "10C";
		P4 = "4P";
		P5 = "5P";
		P6 = "6P";
		
	}
	
	//Un jugador obtiene póquer si de las cinco cartas recibidas,
	//cuatro cartas iguales en su valor (ejemplo 4 ases, 4 reyes).
	//P = picas, C = corazones, D = diamantes, T = tréboles
	
	
	@Test
	void testConPokerString() {
		
		//Exercise
		poker.verificar(P2, C2, D2, T2, C10);
		
		//Verify
		assertTrue(poker.verificar(P2, C2, D2, T2, C10) == "Poker");
	}
	
	@Test
	void testSinNada() {
		//Test Double Configuration
		when(poker.verificar(P2, C2, P6, P10, C10)).thenReturn(null);
		
		//Verify
		assertTrue(poker.verificar(P2, C2, P6, P10, C10) == null);
	}
	
	// Color = las cinco cartas son del mismo color y palo
	
	@Test
	void testColor() {
		
		//Test Double Configuration
		when(poker.verificar(P10, P4, P5, P6, P2)).thenReturn("Color");
		
		//Verify
		//el poker.verificar = Exercise
		assertTrue(poker.verificar(P10, P4, P5, P6, P2) == "Color");
	}
	
	// Trio = tres cartas poseen el mismo valor
	
	@Test
	void testTrio() {
		
		//Test Double Configuration
		when(poker.verificar(P2, C2, D2, P4, C10)).thenReturn("Trio");
		
		//Verify
		//el poker.verificar = Exercise
		assertTrue(poker.verificar(P2, C2, D2, P4, C10) == "Trio");
	}

}
