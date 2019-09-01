package edu.brandeis.glycodenovo.core;

import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ArffLoader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

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
}
