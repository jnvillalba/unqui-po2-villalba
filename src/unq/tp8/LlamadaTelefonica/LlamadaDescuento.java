package unq.tp8.LlamadaTelefonica;

public class LlamadaDescuento extends LlamadaTelefonica{
	
	public LlamadaDescuento(int tiempo, int horaDelDia) {
		super(tiempo, horaDelDia);
		}
		// hook
		@Override
		public boolean esHoraPico() {
		return false;
		}
		// Operaciones concretas.
		@Override
		public float costoNeto(){
		return this.getTiempo()*0.95f;
		}


}
