package unq.tp8.AyudandoAlSoberano;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
	private String titular;
	private int saldo;
	private List<String> movimientos;
	
	public CuentaBancaria(String titular){
		this.titular=titular;
		this.saldo=0;
		this.movimientos=new ArrayList<String>();
	}
	
	public String getTitular(){
		return this.titular;
	}
	
	public int getSaldo(){
		return this.saldo;
	}
	
	protected void setSaldo(int monto){
		this.saldo=monto;
	}
		 
	public void agregarMovimientos(String movimiento){
		this.movimientos.add(movimiento);
	}
	
	public void extraer(int monto) {
		if(this.cumpleConLaCondicionDelTipoDeCuenta(monto)){
			 this.setSaldo(this.getSaldo()-monto);
			 this.agregarMovimientos("Extraccion");
		 }
	}

	protected abstract boolean cumpleConLaCondicionDelTipoDeCuenta(int monto);
	
	
	//1. Se cambia el metodo abstracto extraer por uno que realice la operacion si se cumple la condicion,
	//   la cual dependera de cada sublcase.
	

	//2. La clase Abstracta seria la cuenta Bacaria y sus herencias las concretas. 
	//	 El metodo extraer(int monto) es el Template method y el hook seria cumpleConLaCondicionDelTipoDeCuenta(int monto)
}
