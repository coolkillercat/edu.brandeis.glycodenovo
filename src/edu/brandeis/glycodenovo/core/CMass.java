package edu.brandeis.glycodenovo.core;

import java.security.InvalidParameterException;

/**
 * Copyright [2018] [Pengyu Hong at Brandeis University] Licensed under the
 * Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

// Mass of Different Atom
public class CMass {
	static final double Electron = 0.0005489;
	static final double H = 1.0078250321;
	static final double H2 = 2.0156500642;
	static final double H2O = 18.0105646863;
	static final double C = 12;
	static final double N = 14.0030740052;
	static final double O = 15.9949146221;
	static final double CH2 = 14.0156500642;
	static final double Proton = 1.007276432;
	static final double Lithium = 7.0154553836;
	static final double Sodium = 22.989769;
	static final double Cesium = 132.90545;
	static final double O18 = 2.00425;
	static final double DEUTERIUM = 17.03758;
	static final double AMINOPYRIDINE = 78.05803471;
	static final double PRAGS = 120.0687;
	public static final double PermethylationMassLoss = 14.0156500642 * 2;
	static final String cReducingEndModification_O18 = "O18";
	static final String cReducingEndModification_Deuterium = "Deuterium";
	static final String cReducingEndModification_Reduced = "Reduced";
	static final String cReducingEndModification_Aminopyridine = "Aminopyridine";
	static final String cReducingEndModification_PRAGS = "PRAGS";
	static final String cReducingEndModification_M3_Bion = "REM_M3_Bion";
	static final double cMassCompensation_O18 = 2.00425;
	static final double cMassCompensation_Deuterium = 17.03758;
	static final double cMassCompensation_Aminopyridine = 78.05803471;
	static final double cMassCompensation_PRAGS = 120.0687;
	static final char[] cAtomNames = { 'C', 'H', 'N', 'O' };
    static final double[][] cAtomMasses = {{12,13.0033548378}, {1.0078250321,2.0141017780}, {14.0030740052, 15.0001088984}, {15.9949146221,16.99913150,17.9991604}};
    static final double[][] cAtomProbs = {{0.9893,0.0107}, {0.99985,0.00015}, {0.99632, 0.00368}, {0.99757,0.00038,0.00205}};
	public static double getAtomMass(String atom) {
		switch (atom) {
		case "H":
			return CMass.H;
		case "Proton":
			return CMass.Proton;
		case "Na":
			return CMass.Sodium;
		case "Li":
			return CMass.Lithium;
		case "Cs":
		case "Cesium":
			return CMass.Cesium;
		case "O":
			return CMass.O;
		case "N":
			return CMass.N;
		case "C":
			return CMass.C;
		default:
			throw new InvalidParameterException("atom not found!");
		}
	}

	//
	public static double reducingEndMassCompensation(String reducingEndMod, boolean permethylated) {
		switch (reducingEndMod) {
		case "O18":
			return CMass.O18;
		case "Deuterium":
			return CMass.DEUTERIUM;
		case "PRAGS":
			return CMass.PRAGS;
		case "Aminopyridine":
			return CMass.AMINOPYRIDINE;
		case "Reduced":
			if ( permethylated )
				return CMass.H2 + CMass.CH2;
			else
				return CMass.H2;
		default:
			throw new InvalidParameterException(reducingEndMod);
		}
	}
	
	public static double get_mass_compensation(String modification, boolean permethylated) {
		double mass = 0;
		switch (modification) {
		case CMass.cReducingEndModification_O18: mass = CMass.cMassCompensation_O18;break;
		case CMass.cReducingEndModification_Deuterium: mass = CMass.cMassCompensation_Deuterium;break;
		case CMass.cReducingEndModification_Reduced: mass = (permethylated)? (CMass.H2 + CMass.CH2) : CMass.H2;break;
		case CMass.cReducingEndModification_Aminopyridine: mass = CMass.cMassCompensation_Aminopyridine;break;
		case CMass.cReducingEndModification_PRAGS: mass = CMass.cMassCompensation_PRAGS;break;
		case CMass.cReducingEndModification_M3_Bion: mass = (permethylated)? (-CMass.H2O - CMass.CH2) : -CMass.H2O; break;
		default:
			if (modification.indexOf("CMass.cReducingEndModification_M3_Bion") == 0) {
				String temp = modification.replace("CMass.cReducingEndModification_M3_Bion" + "_", "");
				mass = CMass.chem_formula_2_mass( temp );
			}
		}
		return mass;
	}
	
	private static double chem_formula_2_mass (String formula) {
		if (formula == "") return 0;
		formula = formula.trim();
		if (formula == "") return 0;
		int sign = 1;
		if (formula.charAt(0) == '-') {
			sign = -1;
			formula = formula.substring(1);
		} else if (formula.charAt(0) == '+') formula = formula.substring(1);
		int atomIdx = -1, num = 0;
		double monoMass = 0;
		for (int k = 0; k < formula.length(); k++) {
			if (formula.charAt(k) <= '9' && formula.charAt(k) >= '0') {
				num = num * 10 + formula.charAt(k) - '0';
			}
			else {
				if (atomIdx != -1) {
					if (num == 0) num = 1;
					monoMass = monoMass + num * CMass.cAtomMasses[atomIdx][0];
				}
				switch (formula.charAt(k)) {
				case 'C': atomIdx = 0; break;
				case 'H': atomIdx = 1; break;
				case 'N': atomIdx = 2; break;
				case 'O': atomIdx = 3; break;
				default : atomIdx = -1;
				}
				num = 0;
			}
		}
		if (atomIdx != -1) {
			if (num == 0) num = 1;
			monoMass = monoMass + num * CMass.cAtomMasses[atomIdx][0];
		}
		return monoMass * sign;
	}
}
