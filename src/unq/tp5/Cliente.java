package unq.tp5;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String dir;
	private int edad;
	private float sueldo;
	
	public Cliente(String nombre, String apellido, String dir, int edad, float sueldo) {
		super();
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDir(dir);
		this.setEdad(edad);
		this.setSueldo(sueldo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public float sueldoNetoAnual() {
		return sueldo*12;
	}
	
	public void solicitarCreditoPersonal(Banco banco, float monto, float plazoEnMeses) {
		Solicitud nuevaSolicitud = new SolicitudCreditoPersonal(this, monto, plazoEnMeses);
		SistemaInformaticoBancario.agregarNuevaSolicitudAlBanco(nuevaSolicitud, banco);
	}
	
	public void solicitarCreditoHipotecario(Banco banco, float monto, float plazoEnMeses, Inmueble inmueble) {
		Solicitud nuevaSolicitud = new SolicitudCreditoHipotecario(this, monto, plazoEnMeses, inmueble);
		SistemaInformaticoBancario.agregarNuevaSolicitudAlBanco(nuevaSolicitud, banco);
	}
	
	public float recibirCredito(float monto) {
		return monto;
	}
	
	
}
