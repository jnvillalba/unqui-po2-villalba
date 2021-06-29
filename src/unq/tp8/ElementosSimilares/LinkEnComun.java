package unq.tp8.ElementosSimilares;

import java.util.stream.Collectors;

public class LinkEnComun extends Filtro {
	/*
	 * retorna como páginas similares aquellas que posean al menos un link a una página en común,
	 *  por ejemplo si la página de “Gimnasia y Esgrima La Plata” tiene un link a la página “La Plata”
	 *   y la página “Buenos Aires” tiene un link a “La Plata” esas páginas serian similares.
	*/
	
	public LinkEnComun(String filtro) {
		super(filtro);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean condicionDeFiltro(WikipediaPage page, WikipediaPage pagina) {
		return pagina.getLinks()
					 .stream()
					 .filter(link -> page.getLinks().contains(link)).collect(Collectors.toList()).size() > 0;
	}

}
