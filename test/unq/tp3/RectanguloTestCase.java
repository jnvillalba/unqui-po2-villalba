package unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	
	private Rectangulo rectangulo;
	/**
	* Crea un escenario de test
	*/
	
	@BeforeEach
	public void setUp() throws Exception {
	rectangulo = new Rectangulo(new Punto(1,1), new Punto(4,1),
								new Punto(1,3), new Punto(4,3));
	}
	
	@Test
	public void base() {
		
		int base = rectangulo.base();
		assertEquals(base, 3);
	}
	
	@Test
	public void altura() {
		
		int altura = rectangulo.altura();
		assertEquals(altura, 2);
	}
	
	@Test
	public void area() {
		
		int area = rectangulo.area();
		assertEquals(area, 6);
	}
	
	@Test
	public void perimetro() {
		
		int perimetro = rectangulo.perimetro();
		assertEquals(perimetro, 10);
	}
	
	@Test
	public void tipo() {
		
		assertEquals(rectangulo.tipoDeFigura(), "Horizontal");
	}
	
}
