package edu.brandeis.glycodenovo.core;

import java.util.ArrayList;
import java.util.HashMap;

class DataSignals {
        private class DataUnit {
            double mass, intensity, glycanMass;
            int peakID, spectrumID;
            CPeak complementPeakID;
            ArrayList<ArrayList<Double>> context;
            boolean REM;
            CSpectrum spectrum;
            DataUnit (double mass) {
                this.mass = mass;
            }

            void setparameters(int peakID, CPeak complementPeakID,
                               double intensity, ArrayList<ArrayList<Double>> context, int spectrumID, double glycanMass,
                               boolean REM, CSpectrum spectrum) {
                this.peakID = peakID;
                this.complementPeakID = complementPeakID;
                this.intensity = intensity;
                this.context = context;
                this.spectrumID = spectrumID;
                this.glycanMass = glycanMass;
                this.REM = REM;
                this.spectrum = spectrum;
            }

        }

        HashMap<Character,ArrayList<DataUnit>> ionmap;

        DataSignals () {
            ionmap = new HashMap<Character,ArrayList<DataUnit>>();
            ionmap.put('B', new ArrayList<DataUnit>());
            ionmap.put('C', new ArrayList<DataUnit>());
            ionmap.put('Y', new ArrayList<DataUnit>());
            ionmap.put('Z', new ArrayList<DataUnit>());
            ionmap.put('O', new ArrayList<DataUnit>());
        }

        ArrayList<DataUnit> get (Character iontype) {
            return ionmap.get(iontype);
        }

        void addlast (Character iontype, double mass, int peakID, CPeak complementPeakID,
                      double intensity, ArrayList<ArrayList<Double>> context, int spectrumID, double glycanMass,
                      boolean REM, CSpectrum spectrum) {
            ArrayList<DataUnit> alist = ionmap.get(iontype);
            alist.add(new DataUnit(mass));
            alist.get(alist.size() - 1).setparameters(peakID, complementPeakID, intensity,
                    context, spectrumID, glycanMass, REM, spectrum);
        }

        boolean getREM (char iontype, int k) {
            return ionmap.get(iontype).get(k).REM;
        }

        double getGlycanMass (char iontype, int k) {
            return ionmap.get(iontype).get(k).glycanMass;
        }

        double getMass (char iontype, int k) {
            return ionmap.get(iontype).get(k).mass;
        }

        Double getPeakIntensity (char iontype, int k, int m) {
            return ionmap.get(iontype).get(k).context.get(1).get(m);
        }

        ArrayList<ArrayList<Double>> getContext (char iontype, int k) {
            return ionmap.get(iontype).get(k).context;
        }

        int getSpectrumID (char iontype, int k) {
            return ionmap.get(iontype).get(k).spectrumID;
        }

        int getPeakID (char iontype, int k) {
            return ionmap.get(iontype).get(k).peakID;
        }
}
