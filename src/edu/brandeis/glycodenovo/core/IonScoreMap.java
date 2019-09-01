package edu.brandeis.glycodenovo.core;

import java.util.HashMap;

public class IonScoreMap {
    String comment;
    HashMap<Integer, Double> B, C;
    IonScoreMap() {
        comment = "key = uint32(glycanID * 10000 + peakID)";
        B = new HashMap<>();
        C = new HashMap<>();
    }
    HashMap<Integer, Double> getMap(char iontype) {
        if (iontype == 'B') {
            return B;
        }
        return C;
    }
    Double getScore(char iontype, int k) {
        return getMap(iontype).get(k);
    }
    void setScore(char iontype, int k, double score) {
        getMap(iontype).put(k, score);
    }
}
