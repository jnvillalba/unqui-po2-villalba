package unq.tp8.ElementosSimilares;



public class MismaLetraInicial extends Filtro{
	public MismaLetraInicial(String filtro) {
		super(filtro);
		// TODO Auto-generated constructor stub
	}

	/*
	 * retorna como páginas similares aquellas que poseen la misma primera letra en el comienzo del título,
	 *  por ejemplo “La Plata” es similar con “Lucas Art” y “Lobo”.
	*/
	@Override
	protected boolean condicionDeFiltro(WikipediaPage page, WikipediaPage pagina) {
		return ( page.getTitle().charAt(0) ) == (pagina.getTitle().charAt(0));
	}

}
