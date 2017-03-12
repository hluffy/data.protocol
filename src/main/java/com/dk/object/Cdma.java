package com.dk.object;

public class Cdma {
	private int mcc;
	private int mnc;
	private int lac;
	private int cellid;
	private int signal;
	public Cdma(){
		
	}
	public Cdma(int mcc,int mnc,int lac,int cellid,int signal){
		this.mcc = mcc;
		this.mnc = mnc;
		this.lac = lac;
		this.cellid = cellid;
		this.signal = signal;
	}
	public int getMcc() {
		return mcc;
	}
	public void setMcc(int mcc) {
		this.mcc = mcc;
	}
	public int getMnc() {
		return mnc;
	}
	public void setMnc(int mnc) {
		this.mnc = mnc;
	}
	public int getLac() {
		return lac;
	}
	public void setLac(int lac) {
		this.lac = lac;
	}
	public int getCellid() {
		return cellid;
	}
	public void setCellid(int cellid) {
		this.cellid = cellid;
	}
	public int getSignal() {
		return signal;
	}
	public void setSignal(int signal) {
		this.signal = signal;
	}
	public String toString(){
		return mcc+","+mnc+","+lac+","+cellid+","+signal;
	}

}
