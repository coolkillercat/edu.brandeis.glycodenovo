package edu.brandeis.glycodenovo.core;

import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ArffLoader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataVectors {
        public static final String tempaddress = "C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\template.arff";
        HashMap<Character,ArrayList<ArrayList<Double>>> ionmap;
        ArrayList<Double> massFeatures;
        DataVectors () {
            ionmap = new HashMap<>();
        }
        void setDataVectors (Character iontype, int num, int numFeatures) {
            if (ionmap == null) {
                ionmap = new HashMap<>();
            }
            ArrayList<ArrayList<Double>> alist = new ArrayList<>(num);
            for (int i = 0; i < num; i++) {
                alist.add(createzero(numFeatures * 2 + 3));
            }
            ionmap.put(iontype, alist);
        }
        ArrayList<Double> getVector (char iontype, int k) {
            return ionmap.get(iontype).get(k);
        }
        ArrayList<ArrayList<Double>> getMap (char iontype) {
            return ionmap.get(iontype);
        }
        void setMassFeatures (ArrayList<Double> massFeatures) {
            this.massFeatures = massFeatures;
        }
        Instance toInstance (char iontype, int k) throws Exception{
            ArrayList<Double> vector = getVector(iontype, k);
            Instance instance = new DenseInstance(vector.size());
            ArffLoader loader = new ArffLoader();
            loader.setFile(new File(tempaddress));
            Instances dataset = loader.getStructure();
            dataset.setClassIndex(dataset.numAttributes()-1);
            for (int i = 0; i < vector.size(); i++) {
                instance.setValue(i, vector.get(i));
                //System.out.println("set " + i + " as" + vector.get(i));
            }
            instance.setDataset(dataset);
            //System.out.println("toInstance done");
            return instance;
        }
        ArrayList<Double> createzero (int size) {
        	ArrayList<Double> ans = new ArrayList<>();
        	for (int i = 0; i < size; i++) {
        		ans.add(.0);
        	}
        	return ans;
        }
        int getSize (char iontype, int k) {
        	return getVector(iontype, k).size();
        }
        void output (String root) throws IOException {
        	for (char iontype : "BC".toCharArray()) {
        		File filer = new File(root + "\\save");
        		if (! filer.exists()) {
        			filer.mkdir();
        		}
        		for (int i = 0; i < ionmap.get(iontype).size(); i++) {
        			File file = new File(root + "\\save\\" + iontype + i + ".txt");
        			if (!file.exists()) {
        				file.createNewFile();
        			}
        			FileWriter filewriter = new FileWriter(file);
        			for (double value : getVector(iontype, i)) {
        				filewriter.write(value + "\n");
        			}
        			filewriter.close();
        		}
        	}
        	
        }
        
        public static void testSameVectors(int b, int c) {
        	
        	Scanner scj = null, scm = null;
    		/*File specFile = new File(specFilename);
    		try {
    			sc = new Scanner(specFile);
    		} catch (FileNotFoundException e) {
    			throw new IllegalArgumentException("No such file");
    		}*/
        	for (int i = 0; i < b; i++) {
        		String fileNameJ = "C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\save\\B" + i + ".txt";
        		String fileNameM = "C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\save\\matlab_B" + (i+1) + ".txt";
        		File fileJ = new File(fileNameJ);
        		File fileM = new File(fileNameM);
        		try {
        			scj = new Scanner(fileJ);
        			scm = new Scanner(fileM);
        		} catch (FileNotFoundException e) {
        			throw new IllegalArgumentException("No such file");
        		}
        		int m = 0;
        		while(scj.hasNextDouble() && scm.hasNextDouble()) {
        			double dJ = scj.nextDouble();
        			double dM = scm.nextDouble();
        			if (Math.abs(dJ - dM) > 0.000000000001) {
        				System.out.println("wrong attributeB i: " + i + " m: " + m + " java: " + dJ + " matlab: " + dM);
        			}
        			m++;
        		}
        	}
        	for (int i = 0; i < c; i++) {
        		String fileNameJ = "C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\save\\C" + i + ".txt";
        		String fileNameM = "C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\save\\matlab_C" + (i+1) + ".txt";
        		File fileJ = new File(fileNameJ);
        		File fileM = new File(fileNameM);
        		try {
        			scj = new Scanner(fileJ);
        			scm = new Scanner(fileM);
        		} catch (FileNotFoundException e) {
        			throw new IllegalArgumentException("No such file");
        		}
        		int m = 0;
        		while(scj.hasNextDouble() && scm.hasNextDouble()) {
        			double dJ = scj.nextDouble();
        			double dM = scm.nextDouble();
        			if (Math.abs(dJ - dM) > 0.000000000001) {
        				System.out.println("wrong attributeC i: " + i + " m: " + m + " java: " + dJ + " matlab: " + dM);
        			}
        			m++;
        		}
        	}
        }
        
        public static void main(String[] args) {
        	testSameVectors(5, 5);
        	System.out.println("testSameVector complete");
        }
}
