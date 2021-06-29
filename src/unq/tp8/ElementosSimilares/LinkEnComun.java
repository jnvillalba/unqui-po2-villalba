package unq.tp8.ElementosSimilares;

import java.util.stream.Collectors;

public class LinkEnComun extends Filtro {
	/*
	 * retorna como p�ginas similares aquellas que posean al menos un link a una p�gina en com�n,
	 *  por ejemplo si la p�gina de �Gimnasia y Esgrima La Plata� tiene un link a la p�gina �La Plata�
	 *   y la p�gina �Buenos Aires� tiene un link a �La Plata� esas p�ginas serian similares.
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
