package edu.brandeis.glycodenovo.core;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
	Scanner lineSc = new Scanner("552.302886	1	0.045908	com	A	Hex	Hex	4	 Neu5Ac-6 1,5A*Hex-4");
	lineSc.useDelimiter("\t"); 
	double rawMZ;
	String r = "";
	if (lineSc.hasNext()) {
		r = lineSc.next();
	}
	rawMZ = Double.valueOf(r);
	int rawZ;
	if (lineSc.hasNext()) {
		r = lineSc.next();
	}
	rawZ = Integer.valueOf(r);
	r = lineSc.next();
	double intensity;
	if (r.indexOf("Inf") >= 0) {
		intensity = 0;
	} else {
		intensity = Double.valueOf(r);
	}
	String peakType = "", ionType = "", RE = "", NRE = "", linkage = "", ionformula = "";
	if (lineSc.hasNext()) {
		peakType = lineSc.next();
	}
	if (lineSc.hasNext()) {
		ionType = lineSc.next();
	}
	if (lineSc.hasNext()) {
		RE = lineSc.next();
	}
	if (lineSc.hasNext()) {
		NRE = lineSc.next();
	}
	if (lineSc.hasNext()) {
		linkage = lineSc.next();
	}
	if (lineSc.hasNext()) {
		ionformula = lineSc.next();
	}
	lineSc.close();
	System.out.println("rawMZ= " + rawMZ + " rawZ=" + rawZ + " intensity=" + intensity + " peaktype=" + peakType + " iontype=" + ionType + " RE=" + RE + " NRE=" + NRE + " linkage=" + linkage + " ionformula=" + ionformula);
	}
}
