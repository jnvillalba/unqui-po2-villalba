package unq.tp8.ElementosSimilares;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.jupiter.api.*;

class ElementosSimilares {
	private Wikipedia laPlata;
	private Wikipedia lucasArt;
	private Wikipedia lobo;
	private Wikipedia gimnasia;
	private Wikipedia bsAs;
	private List<WikipediaPage> wikipedias;
	private MismaLetraInicial filtroLetra;
	private LinkEnComun filtroLink;
	private PropiedadEnComun filtroPropiedad;
	
	@BeforeEach
	void setUp() throws Exception {
		laPlata = new Wikipedia("La Plata");
		lucasArt = new Wikipedia("LucasArt");
		lobo = new Wikipedia("Lobo");
		gimnasia = new Wikipedia("Gimnasia y Esgrima La Plata");
		bsAs =  new Wikipedia("Buenos Aires");
		wikipedias = Arrays.asList(laPlata, lucasArt, lobo, gimnasia, bsAs);
		filtroLetra = new MismaLetraInicial("letra");
		filtroLink = new LinkEnComun("link");
		filtroPropiedad = new PropiedadEnComun("propiedad");
		
		gimnasia.getLinks().add(laPlata);
		bsAs.getLinks().add(laPlata);
		gimnasia.getInfobox().put("birth_place", laPlata);
		lobo.getInfobox().put("birth_place", laPlata);
	}
	

	@Test
	void MismaLetraInicialTest() {
		
		assertTrue(filtroLetra.getSimilarPages(laPlata, wikipedias).contains(lucasArt));
		
	}
	
	@Test
	void PropiedadEnComunTest() {
		
		assertTrue(filtroPropiedad.getSimilarPages(gimnasia, wikipedias).contains(lobo));
		
	}
	
	@Test
	void LinkEnComunTest() {
		
		assertTrue(filtroLink.getSimilarPages(gimnasia, wikipedias).contains(bsAs));
		
	}

}
