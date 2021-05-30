package unq.tp6;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PoquerTestCase {

	//Un jugador obtiene póquer si de las cinco cartas recibidas,
	//cuatro cartas iguales en su valor (ejemplo 4 ases, 4 reyes).
	//P = picas, C = corazones, D = diamantes, T = tréboles
	
	private PokerStatus poker;
	private String P2;
	private String C2;
	private String D2;
	private String T2;
	private String P10;
	private String C10;
	
	
	@BeforeEach
	public void setUp() throws Exception{
		
		//Set Up
		poker = mock(PokerStatus.class);
		P2 = "2P";
		C2 = "2C";
		D2 = "2D";
		T2 = "2T";
		P10 = "10P";
		C10 = "10C";
	}
	
	@Test
	void testPokerStatusManoSinPoker() {
		
		//Verify
		assertFalse(poker.verificar(P2, C2, D2, P10, C10));
		
	}
	
	@Test
	void testConPoker() {
		//Test Double Configuration
		when(poker.verificar(P2, C2, D2, T2, C10)).thenReturn(true);
		
		
		
		//Verify
		assertTrue(poker.verificar(P2, C2, D2, T2, C10));
		//Exercise = poker.verificar(P2, C2, D2, T2, C10);
		
		verify(poker, times(1)).verificar(P2, C2, D2, T2, C10);
	}
	

}
