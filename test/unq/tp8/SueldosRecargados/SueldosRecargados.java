package unq.tp8.SueldosRecargados;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SueldosRecargados {
	
	EmpleadoTemporario temporal;
	EmpleadoPasante pasante;
	EmpleadoPlanta planta;
	
	@BeforeEach
	void setUp() throws Exception {
		temporal = new EmpleadoTemporario("Casade", 1000, 0, 8);
		pasante = new EmpleadoPasante("Soltere", 0, 0, 8);
		planta = new EmpleadoPlanta("Casade", 3000, 2);
	}
	
	

	@Test
	void ExtraHorasDeTrabajoTest() {
		//$5*8hrs
		assertEquals(40, temporal.extraHorasDeTrabajo());
		//$40*8
		assertEquals(320, pasante.extraHorasDeTrabajo());
		//0
		assertEquals(0, planta.extraHorasDeTrabajo());
		
	}
	
	@Test
	void ExtraFamiliarTest() {
		
		//$100 si esta casado
		assertEquals(100, temporal.extraFamiliar());
		//nada
		assertEquals(0, pasante.extraFamiliar());
		//150 x 2 hijos
		assertEquals(300, planta.extraFamiliar());	
	}
	
	@Test
	void SueldoBrutoTest() {
		//40+1000+100
		assertEquals(1140, temporal.sueldoBruto());
		//320+0
		assertEquals(320, pasante.sueldoBruto());
		//3000+0+300
		assertEquals(3300, planta.sueldoBruto());
	}
	
	@Test
	void RetencionesTest(){
		//13% de 1140 == 148.2
		assertEquals(148, temporal.retenciones());
		//13% de 320 == 41.6
		assertEquals(41, pasante.retenciones());
		//13% de 3300
		assertEquals(429, planta.retenciones());
	}
	
	
	@Test
	void SueldoTest() {
		//1140-148
		assertEquals(1140-148, temporal.sueldo());
		//320-41
		assertEquals(320-41, pasante.sueldo());
		//3300-429
		assertEquals(3300-429, planta.sueldo());
	}
	
	

}
