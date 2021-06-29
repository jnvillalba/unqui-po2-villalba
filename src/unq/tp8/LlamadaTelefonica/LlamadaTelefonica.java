package unq.tp8.LlamadaTelefonica;

/*A partir de las siguientes líneas de código identifique estos conceptos, si es posible:
● Template Method.
● Operaciones primitivas.
● Operaciones concretas.
● Hook Method.
*/

public abstract class LlamadaTelefonica {
	private int tiempo;
	private int horaDelDia;
	
	public LlamadaTelefonica(int tiempo, int horaDelDia){
		this.tiempo=tiempo;
		this.horaDelDia=horaDelDia;
	}
	// Operaciones primitivas
	public int getTiempo(){
		return this.tiempo;
	}
	
	public int getHoraDelDia(){
		return this.horaDelDia;
	}
	
	// Template Method
	public float costoFinal(){
		if(this.esHoraPico()){
			return this.costoNeto()*1.2f*this.getTiempo();
		}else{
			return this.costoNeto()*this.getTiempo();
			}
	}
	
	// Operaciones concretas.
	public float costoNeto(){
		return this.getTiempo()*1;
	}
	
	// Hook Method
		public abstract boolean esHoraPico();

	

}
