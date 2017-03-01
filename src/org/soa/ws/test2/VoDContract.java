package org.soa.ws.test2;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
public interface VoDContract {
		
	@WebMethod
	public boolean updateItemsRealisator(@WebParam(name="title")String title, @WebParam(name="name")String name, @WebParam(name="nationality")String nationality);
	
	@WebMethod
	public ArrayList<Item> getAllTVShows();

}
