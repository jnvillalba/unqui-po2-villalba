package unq.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaInformaticoBancarioTestCase {
	
	
	private Banco bancoRio;
	private Cliente clientePersonalA;
	private Cliente clientePersonalB;
	private Cliente clienteHipotecarioA;
	private Inmueble casa;
	
	@BeforeEach
	public void setUp() throws Exception {
	//creo el escenario
	
	bancoRio = new Banco();
	clientePersonalA = new Cliente("J", "V", "calle5", 22, 60000);
	clientePersonalB = new Cliente("N", "V", "c153", 15, 1000);
	clienteHipotecarioA = new Cliente("C", "V", "Calle23", 54, 160000);
	casa = new Inmueble("una casa", "Calle23", 1000000);
	}
	
	@Test
	public void testAgregarCliente() {
	
	SistemaInformaticoBancario.agregarNuevoClienteAlBanco(clienteHipotecarioA, bancoRio);
	SistemaInformaticoBancario.agregarNuevoClienteAlBanco(clientePersonalA, bancoRio);
	SistemaInformaticoBancario.agregarNuevoClienteAlBanco(clientePersonalB, bancoRio);
	// I check the amount is the expected one
	assert(bancoRio.getClientes().contains(clienteHipotecarioA) );
	assert(bancoRio.getClientes().contains(clientePersonalA) );
	assert(bancoRio.getClientes().contains(clientePersonalB) );
	}
	
	@Test
	public void testAgregarNuevaSolicitudPersonalBanco() {
	
	clientePersonalA.solicitarCreditoPersonal(bancoRio, 66000, 6000);
	
	// I check the amount is the expected one
	
	assertEquals(bancoRio.getSolicitudes().size(), 1);
	}
	
	@Test
	public void testAgregarNuevaSolicitudHipotecariaAlBanco() {
	
	clienteHipotecarioA.solicitarCreditoHipotecario(bancoRio, 50000, 5000, casa);
	
	// I check the amount is the expected one
	
	assertEquals(bancoRio.getSolicitudes().size(), 1);
	assertEquals(bancoRio.getSolicitudes().get(0).getCliente(), clienteHipotecarioA);
	}
	
	@Test
	public void testAgregarNuevaSolicitudesAlBanco() {
	
	clientePersonalA.solicitarCreditoPersonal(bancoRio, 66000, 6000);
	clientePersonalB.solicitarCreditoPersonal(bancoRio, 66000, 6000);
	clienteHipotecarioA.solicitarCreditoHipotecario(bancoRio, 50000, 5000, casa);
	
	// I check the amount is the expected one
	
	assertEquals(bancoRio.getSolicitudes().size(), 3);
	}
	
	@Test
	public void testMontoTotalADesembolsar(){
		
		clientePersonalA.solicitarCreditoPersonal(bancoRio, 66000, 6000);
		clientePersonalB.solicitarCreditoPersonal(bancoRio, 66000, 6000);
		clienteHipotecarioA.solicitarCreditoHipotecario(bancoRio, 50000, 5000, casa);
		
		assertEquals(SistemaInformaticoBancario.montoTotalADesembolsar(bancoRio), 116000);
	}
	

}
