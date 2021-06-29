package unq.tp8.ElementosSimilares;

import java.util.*;

public class Wikipedia implements WikipediaPage{
	private String title;
	private ArrayList<WikipediaPage> links; 
	private Map<String, WikipediaPage> infobox;
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public List<WikipediaPage> getLinks() {
		// TODO Auto-generated method stub
		return links;
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		// TODO Auto-generated method stub
		return infobox;
	}

	public Wikipedia(String title) {
		super();
		this.title = title;
		this.links = new ArrayList<WikipediaPage>();
		this.infobox = new HashMap<String, WikipediaPage>();
	}
	
	

}
