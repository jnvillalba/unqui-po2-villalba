class Empleado{
	
	var property nombre
	var property direccion
	var property estadoCivil
	var property fechaDeNacimiento
	var property sueldoBasico
	
	method edad(){
		return 2021- self.fechaDeNacimiento().year()
	}
	
	method sueldoBruto(){
		return self.sueldoBasico()
	}
	
	method retenciones(){
		return self.obraSocial() + self.aportesJubilatoria()
	}
	
	method obraSocial()
	method aportesJubilatoria()
	
	method sueldoNeto(){
		return self.sueldoBruto() - self.retenciones()
	}
	
	
}

class EmpleadoPermanente inherits Empleado{
	var property cantHijos
	var property antiguedad
	var property esCasade = true
	
	override method sueldoBruto(){
		return super() + self.salarioFamiliar()
	}
	
	method salarioFamiliar() {
		return self.asignacionPorHijos() + self.asignacionPorConyuge() + (self.antiguedad()*50)
	}
	
	method asignacionPorHijos() {
		return self.cantHijos() * 150
	}
	
	method asignacionPorConyuge() {
		return if (self.esCasade()){100}
				else{0}
	}
	
	//Retenciones
	//Obra Social: 10% de su sueldo bruto + $20 por cada hijo. 
	//Aportes Jubilatorios: 15% de su sueldo bruto
	
	override method obraSocial() {
		return 0.1*self.sueldoBruto() + 20*self.cantHijos()
	}
	
	override method aportesJubilatoria() {
		return 0.15*self.sueldoBruto()
	}

}

class EmpleadoTemporal inherits Empleado{
	var property fechaFinDesignacion
	var property cantHorasExtras
	
	override method sueldoBruto(){
		return super() + self.bonoHorasExtras(40)
	}
	
	method bonoHorasExtras(pesos) {
		return self.cantHorasExtras() * pesos
	}
	
	//Retenciones
	//Obra Social: 10% de su sueldo bruto + $25 si supera los 50 años
	 //Aportes Jubilatorios: 10% de su sueldo bruto + $5 por cada hora extra.
	
	override method obraSocial() {
		return 0.1*self.sueldoBruto() + self.bonoEdad()
	}
	
	method bonoEdad() {
		return if (self.edad() > 50){25}
				else {0} 
	}
	
	override method aportesJubilatoria() {
		return 0.10*self.sueldoBruto() + self.bonoHorasExtras(5)
	}
	

}