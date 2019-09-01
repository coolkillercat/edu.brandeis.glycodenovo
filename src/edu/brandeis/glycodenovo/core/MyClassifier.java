package edu.brandeis.glycodenovo.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import weka.classifiers.Classifier;

public class MyClassifier {
	ArrayList<Double> trainedWeights;
	ArrayList<ClassificationTree> cForest;
	private class ClassificationTree {
		int numNodes;
		ArrayList<CNode> cTree;
		ClassificationTree (int num) {
			numNodes = num;
			cTree = new ArrayList<>();
			for (int i = 0; i < num; i++) {
				cTree.add(new CNode());
			}
		}
	}
	private class CNode {
		CNode left, right;
		double lprob, rprob, cutpoint;
		int cutvar;
		CNode () {
			lprob = rprob = 0;
			cutpoint = -1;
			cutvar = -1;
		}
	}
	MyClassifier (String rootpath) {
		if (rootpath.charAt(rootpath.length() - 1) != '\\') {
			rootpath = rootpath + '\\';
		}
		Scanner sc = null;
		char[] posSet = {'B', 'B', 'B', 'B', 'C', 'C', 'C', 'C'}; 
		char[] negSet = {'C', 'Y', 'Z', 'O', 'B', 'Y', 'Z', 'O'};
		for (int i = 0; i < 8; i++) {
			String path = rootpath + "ionclassifier_" + posSet[i] + "_v_" + negSet[i] + ".txt";
			File specFile = new File(path);
			try {
				sc = new Scanner(specFile);
			} catch (FileNotFoundException e) {
				throw new IllegalArgumentException("ionclassifier_" + posSet[i] + "_v_" + negSet[i] + ".txt doesn't exist");
			}
			String currentLine = sc.nextLine().trim();
			
		}
	}
}
