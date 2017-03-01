package org.soa.ws.test2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ClasseItem")
@XmlType(propOrder={"title", "category", "runningTime", "realisator"})
public class Item {
	
	private String title;
	private String category;
	private Realisator realisator;
	private double runningTime;
	
	public Item() {
		
	}
	
	public Item (String title, String category, Realisator realisator, double runningTime) {
		this.title = title;
		this.category = category;
		this.realisator = realisator;
		this.runningTime = runningTime;
	}
	
	@XmlElement(name="LaCatégorieItem")
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Realisator getRealisator() {
		return realisator;
	}
	
	public void setRealisator(Realisator realisator) {
		this.realisator = realisator;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(double runningTime) {
		this.runningTime = runningTime;
	}

}
