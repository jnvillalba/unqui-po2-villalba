package unq.tp7.composite;

import java.util.ArrayList;

public class Mixto extends Cultivos {
	

	private ArrayList<Cultivos> cultivosMixtos = new ArrayList<Cultivos>();

	public Mixto(ArrayList<Cultivos> cultivosMixtos) {
		super(0);
		this.cultivosMixtos = cultivosMixtos;
	}
	
	@Override
	public int getGananciaAnualCultivo() {
		int gananciasTotal = 0;
		for(Cultivos cultivo : cultivosMixtos) {
			gananciasTotal = gananciasTotal + cultivo.getGananciaAnualCultivo();
		}
		return gananciasTotal;
	}

	@Override
	public void agregarCultivo(Cultivos cultivo) {
		cultivosMixtos.add(cultivo);
		
	}

	@Override
	public void borrarCultivo(Cultivos cultivo) {
		cultivosMixtos.remove(cultivo);
		
	}
	
}
