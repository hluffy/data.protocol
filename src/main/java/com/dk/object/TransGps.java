package com.dk.object;

public class TransGps {
	private double wgLat;
	private double wgLon;
	
	public TransGps(){
		
	}
	public TransGps(double wgLat,double wgLon){
		this.wgLat = wgLat;
		this.wgLon = wgLon;
	}
	public double getWgLat() {
		return wgLat;
	}
	public void setWgLat(double wgLat) {
		this.wgLat = wgLat;
	}
	public double getWgLon() {
		return wgLon;
	}
	public void setWgLon(double wgLon) {
		this.wgLon = wgLon;
	}
	
	public String toString(){
		return wgLat+","+wgLon;
	}

}
