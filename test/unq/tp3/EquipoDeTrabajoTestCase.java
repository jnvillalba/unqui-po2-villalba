package unq.tp3;


import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {

	private Persona persona1, persona2, p3, p4, p5;
	
	private EquipoDeTrabajo team1;
	
	/**Crea un escenario de test
	*/
	
	@BeforeEach
	public void setUp() throws Exception {
	persona1 = new Persona("j", "v", new Date(1998/10/25) );
	persona2 = new Persona("n", "v", new Date(2002/4/26) );
	p3 = new Persona("j", "n", new Date(1998/10/25) );
	p4 = new Persona("jn", "v", new Date(1998/10/25) );
	p5 = new Persona("j", "nv", new Date(1998/10/25) );
	
	team1 = new EquipoDeTrabajo("e1");
	team1.getIntegrantes().add(persona1);
	team1.getIntegrantes().add(persona2);
	team1.getIntegrantes().add(p3);
	team1.getIntegrantes().add(p4);
	team1.getIntegrantes().add(p5);
	}
	
	@Test
	public void promedioEquipoDe5() {
		
		System.out.println (team1.edadTotalIntegrantes() );
	}
	
}
