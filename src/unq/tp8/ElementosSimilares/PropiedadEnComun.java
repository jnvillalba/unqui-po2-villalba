package unq.tp8.ElementosSimilares;

import java.util.stream.Collectors;

public class PropiedadEnComun extends Filtro {
	/*
	 * retorna aquellas p�ginas que poseen alguna propiedad del infobox en com�n,
	 *  por ejemplo si la p�gina de una persona tiene la propiedad �birth_place� 
	 *  y otra p�gina posee tambi�n la propiedad �birth_place� serian similares mutuamente. 
	 *  En este caso, no importa que el valor de la propiedad sea diferente.
	*/

	public PropiedadEnComun(String filtro) {
		super(filtro);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean condicionDeFiltro(WikipediaPage page, WikipediaPage pagina) {
		return page.getInfobox()
				.keySet().
				stream().
				filter(clave -> pagina.getInfobox().containsKey(clave)).collect(Collectors.toList()).size() > 0;
	}

}
