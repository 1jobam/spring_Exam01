package com.java.general;

public class GeneralMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		TripleSumation triSum = new TripleSumation();
		
		cal.setSumation(triSum);
		
		cal.sum(3, 2);
		cal.sum(3, 2, 6);
	}
	
}
