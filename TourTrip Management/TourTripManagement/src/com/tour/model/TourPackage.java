package com.tour.model;

public class TourPackage {
	private String packageId;
	private String source;
	private String destination;
	private int totalDays;
	private String packageType;
	private double perPersonCost;
	public TourPackage(String packageId, String source, String destination, int totalDays, String packageType,
			double perPersonCost) {
		super();
		this.packageId = packageId;
		this.source = source;
		this.destination = destination;
		this.totalDays = totalDays;
		this.packageType = packageType;
		this.perPersonCost = perPersonCost;
	}

	public TourPackage(){
		
	}

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public double getPerPersonCost() {
		return perPersonCost;
	}

	public void setPerPersonCost(double perPersonCost) {
		this.perPersonCost = perPersonCost;
	}	
}
