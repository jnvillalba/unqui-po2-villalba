package unq.tp6;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartaTestCase {
	
	private PokerStatusCarta poker;
	private Carta P2;
	private Carta C2;
	private Carta D2;
	private Carta T2;
	private Carta P10;
	private Carta C10;
	private Carta P4;
	private Carta P5;
	private Carta P6;
	
	@BeforeEach
	public void setUp() throws Exception{
		
		//Set Up
		poker = mock(PokerStatusCarta.class);
		P2 = new Carta(2, "P");
		C2 = new Carta(2, "C");
		D2 = new Carta(2, "D");
		T2 = new Carta(2, "T");
		P10 = new Carta(10, "P");
		C10 = new Carta(10, "C");
		P4 = new Carta(4, "P");
		P5 = new Carta(5, "P");
		P6 = new Carta(6, "P");
		
	}
	
	@Test
	public void testSuperiorA() {
		
		//Verify
		assertTrue(C10.esSuperiorA(C2));
		
		//Exercise
		//C10.esSuperiorA(C2)
		
	}
	
	@Test
	public void testMismoPalo() {
		
		//Verify
		//el poker.verificar = Exercise
		assertTrue(C10.poseeMismoPalo(C2));
		
		//Exercise
		//C10.poseeMismoPalo(C2)
		
	}
	
	//Un jugador obtiene póquer si de las cinco cartas recibidas,
	//cuatro cartas iguales en su valor (ejemplo 4 ases, 4 reyes).
	//P = picas, C = corazones, D = diamantes, T = tréboles
	
	
	@Test
	void testConPoker() {
		
		//Exercise
		//poker.verificar(P2, C2, D2, T2, C10);
		
		//Verify
		assertTrue(poker.verificar(P2, C2, D2, T2, C10) == "Poker");
	}
	
	@Test
	void testSinNada() {
		//Test Double Configuration
		when(poker.verificar(P2, C2, P6, P10, C10)).thenReturn("Nada");
		
		//Verify
		assertTrue(poker.verificar(P2, C2, P6, P10, C10) == "Nada");
		verify(poker, times(1)).verificar(P2, C2, P6, P10, C10);
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
	
	@Test
	void testManoGanadora() {
		String manoConPoker = poker.verificar(P2, C2, D2, T2, C10);
		
		//Test Double Configuration
		when(manoConPoker).thenReturn("Poker");
	}
	

}
