package edu.brandeis.glycodenovo.core;

public class CPeakType {
	static final int Unknown = 0;
	static final int B = 0b1;
	static final int C = 0b10;
	static final int A = 0b100;
	static final int Y = 0b1000;
	static final int Z = 0b10000;
	static final int X = 0b100000;
	static final int T = 0b1000000;
	static final int Minus2H = 0b10000000;
	
	static final int B_H = 11;
	static final int B_2H = 12;
	static final int C_H = 21;
	static final int C_2H = 22;
	static final int T_H = 31;
	static final int T_2H = 32;
	
	static int isA (int intype) {
		return intype&CPeakType.A;
	}
	
	static int isB (int intype) {
		return intype&CPeakType.B;
	}
	
	static int isC (int intype) {
		return intype&CPeakType.C;
	}
	
	static int isX (int intype) {
		return intype&CPeakType.X;
	}
	
	static int isY (int intype) {
		return intype&CPeakType.Y;
	}
	
	static int isZ (int intype) {
		return intype&CPeakType.Z;
	}
	
	static int isMinus2H (int intype) {
		return intype&CPeakType.Minus2H;
	}
	
	static int combineType (int intype, int addtype) {
		return intype|addtype;
	}
	
	static String checkType(int intype) {
		String result = "";
		if (CPeakType.isA(intype) != 0) result = result + "A";
		else if (CPeakType.isB(intype) != 0) result = result + "B";
		else if (CPeakType.isC(intype) != 0) result = result + "C";
		else if (CPeakType.isX(intype) != 0) result = result + "X";
		else if (CPeakType.isY(intype) != 0) result = result + "Y";
		else if (CPeakType.isZ(intype) != 0) result = result + "Z";
		if (CPeakType.isMinus2H(intype) != 0) result = result + "-2H";
		return result;
	}
}
