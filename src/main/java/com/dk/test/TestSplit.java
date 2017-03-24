package com.dk.test;

public class TestSplit {
	public static void main(String[] args) {
		String str = "2626889998489494988262699900";
		String[] msg = str.split("2626");
		System.out.println(msg.length);
		for(int i=1;i<msg.length;i++){
			System.out.println(msg[i]);
		}
	}

}
