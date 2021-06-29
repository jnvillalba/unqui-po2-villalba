package unq.tp8.ElementosSimilares;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	
	private String filtro;
	
	
	
	public Filtro(String filtro) {
		super();
		this.filtro = filtro;
	}

	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia){
		
		ArrayList<WikipediaPage> paginasSimilares = new ArrayList<WikipediaPage>();
		for(WikipediaPage pagina : wikipedia) {
			if(this.condicionDeFiltro(page, pagina)) {
			paginasSimilares.add(pagina);
			}
		}
		return paginasSimilares;
	}

	protected abstract boolean condicionDeFiltro(WikipediaPage page, WikipediaPage pagina);
	
	
}