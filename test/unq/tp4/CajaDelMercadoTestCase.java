package unq.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.tp4.Cliente;
import unq.tp4.Producto;

class CajaDelMercadoTestCase {
	
	private Caja caja;
	private Cliente cliente;
	private Producto pan;
	private Producto huevo;
	private Producto queso;
	
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el cliente y los productos
	caja = new Caja();
	cliente = new Cliente();
	pan = new Producto(15, 5);
	huevo = new Producto(12, 6);
	queso = new Producto(50, 1);
	
	//Se agregan los prouctos al cliente
	cliente.registrar(pan);
	cliente.registrar(huevo);
	cliente.registrar(queso);
	}
	
	@Test
	public void testCliente() {
	// Getting the even occurrences
	float amount = caja.montoTotal(cliente);
	// I check the amount is the expected one
	assertEquals(amount, 15+12+50);
	}
	
	@Test
	public void testStock() {
	// Getting the even occurrences
	int stockPan = pan.getStock();
	int stockHuevo = huevo.getStock();
	int stockQueso = queso.getStock();
	// I check the amount is the expected one
	assertEquals(stockPan, 4);
	assertEquals(stockHuevo, 5);
	assertEquals(stockQueso, 0);
	}

}
