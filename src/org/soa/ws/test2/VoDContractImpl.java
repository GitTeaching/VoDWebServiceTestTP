package org.soa.ws.test2;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="org.soa.ws.test2.VoDContract", serviceName="VoDService")
public class VoDContractImpl implements VoDContract{
	
	private ArrayList<Item> catalog;
	
	public VoDContractImpl() {
		
		catalog = new ArrayList<Item>();
		catalog.add(new Item("Game of Thrones", "TV Show", new Realisator("George R. R. Martin", "American"), 58));
		catalog.add(new Item("House of Cards", "TV Show", new Realisator("George R. R. Martin", "American"), 58));
		catalog.add(new Item("Black Sails", "TV Show", new Realisator("George R. R. Martin", "American"), 58));
		
		catalog.add(new Item("Night Call", "Movie", new Realisator("Dan Gilroy", "American"), 117));
		catalog.add(new Item("Night Call Bis", "Movie", new Realisator("Dan Gilroy", "American"), 117));
		catalog.add(new Item("Night Call Tris", "Movie", new Realisator("Dan Gilroy", "American"), 117));
		catalog.add(new Item("Night Call Quatro", "Movie", new Realisator("Dan", "Spanish"), 117));
		
	}
	
	@Override
	@WebMethod
	public boolean updateItemsRealisator(String title, String name, String nationality) {
		
		for(int i=0; i<catalog.size(); i++) 
			if(title.equals(catalog.get(i).getTitle())){
			    catalog.get(i).getRealisator().setName(name);
			    catalog.get(i).getRealisator().setNationality(nationality);
			    return true;
			}
		return false;
	}

	@Override
	@WebMethod
	public ArrayList<Item> getAllTVShows() {
		
        ArrayList<Item> showsToReturn = new ArrayList<Item>();
		
		for(int i=0; i<catalog.size(); i++) {
			if("TV Show".equals(catalog.get(i).getCategory()))
				showsToReturn.add(catalog.get(i));
		}
		return showsToReturn;		
	}

}
