import Recibo.*

class Empresa {
	
	var property nombre
	var property cuit
	const property empleados = #{}
	const property recibos = #{}
	
	method montoTotal(){
		return empleados.sum({ empleado => empleado.sueldoNeto() })
	}
	
	method montoTotalBrutos(){
		return empleados.sum({ empleado => empleado.sueldoBruto() })
	}
	
	method montoTotalRetenciones(){
		return empleados.sum({ empleado => empleado.retenciones() })
	}
	
	method liquidacionSueldos(){
		return empleados.forEach({empleado => self.guardarRecibo(self.generarRecibo(empleado)) })
	}
	
	method generarRecibo(empleado) {
		return new Recibo(nombre = empleado.nombre(), direccion = empleado.direccion(), fechaEmision = null , sueldoNeto = empleado.sueldoNeto(), desgloceDeConceptos = null)
	}
	
	// fechaDeEmision deberia ser la fecha actual pero desconozco si existe la herramienta para obtenerla
	// tambien podria ser fechaDeEmision = new Date(day = 14, month = 4, year = 2021)
	// desgloceDeConceptos no se como hacerlo, un nuevo obj?
	
	method guardarRecibo(recibo){
		recibos.add(recibo)
	}
	
}
