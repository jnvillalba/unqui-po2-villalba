package unq.tp6;

import static org.junit.Assert.assertTrue;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartaTestCase {
	
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
	
	

}
