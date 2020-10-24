package edu.brandeis.glycodenovo.core;

import java.io.File;
import java.io.FileWriter;

public class DefaultClassifier {
	public static void generateDefaultClassifier(String workpath) throws Exception {
		File file = new File(workpath + "\\ionclassifier_B_v_C.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter filewriter = new FileWriter(file);
		filewriter.write("Model 1\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.500000000000000 0.500000000000000\r\n" + 
				"		0.880217785843920 0.119782214156080\r\n" + 
				"		0.053304904051173 0.946695095948827\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 2\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.398396006576846 0.601603993423154\r\n" + 
				"		0.130742430228799 0.869257569771201\r\n" + 
				"		0.914856014138684 0.085143985861316\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6215 0 0 \r\n" + 
				"\r\n" + 
				"Model 3\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.550297645597462 0.449702354402538\r\n" + 
				"		0.819568666386695 0.180431333613306\r\n" + 
				"		0.044675043808536 0.955324956191464\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"Model 4\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.366745456256716 0.633254543743284\r\n" + 
				"		0.114944221468727 0.885055778531273\r\n" + 
				"		0.916649084551364 0.083350915448636\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5358 0 0 \r\n" + 
				"\r\n" + 
				"Model 5\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.536206812963578 0.463793187036422\r\n" + 
				"		0.822110715410427 0.177889284589573\r\n" + 
				"		0.101691118731974 0.898308881268026\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6278 0 0 \r\n" + 
				"\r\n" + 
				"Model 6\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.427536567518063 0.572463432481937\r\n" + 
				"		0.210968273814336 0.789031726185664\r\n" + 
				"		0.909672264699937 0.090327735300063\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3533 0 0 \r\n" + 
				"\r\n" + 
				"Model 7\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.589939529008449 0.410060470991551\r\n" + 
				"		0.792930648410591 0.207069351589409\r\n" + 
				"		0.119215665692770 0.880784334307230\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5482 0 0 \r\n" + 
				"\r\n" + 
				"Model 8\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.437510200706985 0.562489799293015\r\n" + 
				"		0.250695372804860 0.749304627195140\r\n" + 
				"		0.926094876405240 0.073905123594760\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3883 0 0 \r\n" + 
				"\r\n" + 
				"Model 9\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.609807647939615 0.390192352060385\r\n" + 
				"		0.935275131856394 0.064724868143606\r\n" + 
				"		0.260095325246914 0.739904674753086\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 10\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.682486952795818 0.317513047204182\r\n" + 
				"		0.809765239315040 0.190234760684960\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.106515278446977 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18785 0 0 \r\n" + 
				"\r\n" + 
				"Model 11\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.406403733424103 0.593596266575897\r\n" + 
				"		0.265830634760720 0.734169365239280\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000138200004428 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 12\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.621946228593595 0.378053771406405\r\n" + 
				"		0.762590987002871 0.237409012997129\r\n" + 
				"		0.005417273999076 0.994582726000924\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.038904179750432 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24315 0 0 \r\n" + 
				"\r\n" + 
				"Model 13\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.387939092917988 0.612060907082012\r\n" + 
				"		0.255472510807129 0.744527489192871\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.041426849511168 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12923 0 0 \r\n" + 
				"\r\n" + 
				"Model 14\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.612610482004528 0.387389517995472\r\n" + 
				"		0.736306749573622 0.263693250426378\r\n" + 
				"		0.008907464432576 0.991092535567424\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.521800304330140 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 15\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.395348915840976 0.604651084159024\r\n" + 
				"		0.553984683436582 0.446015316563418\r\n" + 
				"		0.000262407227904 0.999737592772096\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7271 0 0 \r\n" + 
				"\r\n" + 
				"Model 16\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.290040710311059 0.709959289688942\r\n" + 
				"		0.209429348465704 0.790570651534296\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 17\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.562792746928618 0.437207253071382\r\n" + 
				"		0.779822828015021 0.220177171984979\r\n" + 
				"		0.082766974561817 0.917233025438183\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9166 0 0 \r\n" + 
				"\r\n" + 
				"Model 18\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.399049799769708 0.600950200230292\r\n" + 
				"		0.563592354042457 0.436407645957543\r\n" + 
				"		0.033665439647937 0.966334560352063\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6100 0 0 \r\n" + 
				"\r\n" + 
				"Model 19\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.298932733506673 0.701067266493327\r\n" + 
				"		0.999027523691278 0.000972476308722\r\n" + 
				"		0.224994296945359 0.775005703054641\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.633485758201880 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		22103 0 0 \r\n" + 
				"\r\n" + 
				"Model 20\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.559685282973676 0.440314717026324\r\n" + 
				"		0.724822614191259 0.275177385808741\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 21\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.355348219545736 0.644651780454264\r\n" + 
				"		0.254038886975343 0.745961113024657\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 22\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.587006433350222 0.412993566649778\r\n" + 
				"		0.702801760562104 0.297198239437896\r\n" + 
				"		0.000691032405306 0.999308967594694\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7271 0 0 \r\n" + 
				"\r\n" + 
				"Model 23\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.390604683790107 0.609395316209893\r\n" + 
				"		0.288151977421499 0.711848022578501\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000138200004428 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 24\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.595527077828416 0.404472922171584\r\n" + 
				"		0.749030138876113 0.250969861123886\r\n" + 
				"		0.096873257428177 0.903126742571823\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4485 0 0 \r\n" + 
				"\r\n" + 
				"Model 25\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.417755105615088 0.582244894384912\r\n" + 
				"		0.722650178538909 0.277349821461091\r\n" + 
				"		0.172773814986300 0.827226185013700\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 26\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.424570625122419 0.575429374877581\r\n" + 
				"		0.193024097084362 0.806975902915638\r\n" + 
				"		0.794727254998266 0.205272745001734\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7021 0 0 \r\n" + 
				"\r\n" + 
				"Model 27\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.490860726456358 0.509139273543642\r\n" + 
				"		0.652427073758288 0.347572926241712\r\n" + 
				"		0.029271378779069 0.970728621220931\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"Model 28\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.343093702052046 0.656906297947954\r\n" + 
				"		0.244498012872665 0.755501987127335\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.010176941697072 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17918 0 0 \r\n" + 
				"\r\n" + 
				"Model 29\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.582868882031893 0.417131117968107\r\n" + 
				"		0.710644929440595 0.289355070559405\r\n" + 
				"		0.010661139518387 0.989338860481613\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.004710824788599 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21851 0 0 \r\n" + 
				"\r\n" + 
				"Model 30\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.385504319739210 0.614495680260791\r\n" + 
				"		0.884848067519087 0.115151932480913\r\n" + 
				"		0.275311944635018 0.724688055364982\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		213.123381431999830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 31\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.563876994763507 0.436123005236493\r\n" + 
				"		0.700424052656755 0.299575947343245\r\n" + 
				"		0.040048956443411 0.959951043556589\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.521800304330140 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 32\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.385227125431966 0.614772874568034\r\n" + 
				"		0.270244541683835 0.729755458316165\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 33\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.602004283987850 0.397995716012150\r\n" + 
				"		0.730705777204858 0.269294222795142\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.106515278446977 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18785 0 0 \r\n" + 
				"\r\n" + 
				"Model 34\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.386823892374419 0.613176107625581\r\n" + 
				"		0.528925516497495 0.471074483502505\r\n" + 
				"		0.002049465189640 0.997950534810360\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.038904179750432 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24315 0 0 \r\n" + 
				"\r\n" + 
				"Model 35\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.295474626412859 0.704525373587141\r\n" + 
				"		0.228508711510643 0.771491288489357\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 36\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.554845040047681 0.445154959952319\r\n" + 
				"		0.749988654017350 0.250011345982650\r\n" + 
				"		0.105093733338031 0.894906266661969\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 37\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.406566368770454 0.593433631229546\r\n" + 
				"		0.291708674277319 0.708291325722681\r\n" + 
				"		0.956176212572090 0.043823787427910\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 38\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.594800583310082 0.405199416689918\r\n" + 
				"		0.743859716822211 0.256140283177789\r\n" + 
				"		0.046421954358434 0.953578045641566\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4734 0 0 \r\n" + 
				"\r\n" + 
				"Model 39\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.394270670647649 0.605729329352351\r\n" + 
				"		0.620962431701593 0.379037568298406\r\n" + 
				"		0.055312620211782 0.944687379788218\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6278 0 0 \r\n" + 
				"\r\n" + 
				"Model 40\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.292296719231517 0.707703280768483\r\n" + 
				"		0.174053895269869 0.825946104730131\r\n" + 
				"		0.910116395593711 0.089883604406289\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3533 0 0 \r\n" + 
				"\r\n" + 
				"Model 41\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.542108419813662 0.457891580186338\r\n" + 
				"		0.944104388340013 0.055895611659987\r\n" + 
				"		0.365331955982169 0.634668044017831\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		213.123381431999830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 42\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.666209777407060 0.333790222592940\r\n" + 
				"		0.753068473494057 0.246931526505943\r\n" + 
				"		0.035786705146832 0.964213294853168\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.038904179750432 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24315 0 0 \r\n" + 
				"\r\n" + 
				"Model 43\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.434810740957272 0.565189259042728\r\n" + 
				"		0.260264980716197 0.739735019283803\r\n" + 
				"		0.856166307728732 0.143833692271268\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8792 0 0 \r\n" + 
				"\r\n" + 
				"Model 44\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.568893883894426 0.431106116105574\r\n" + 
				"		0.349910642892805 0.650089357107195\r\n" + 
				"		0.961009770666473 0.038990229333527\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 45\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.696820316101468 0.303179683898532\r\n" + 
				"		0.811669132696275 0.188330867303725\r\n" + 
				"		0.163596300194323 0.836403699805677\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6100 0 0 \r\n" + 
				"\r\n" + 
				"Model 46\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.487987015759190 0.512012984240810\r\n" + 
				"		0.768014594700642 0.231985405299358\r\n" + 
				"		0.120168395604020 0.879831604395980\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9166 0 0 \r\n" + 
				"\r\n" + 
				"Model 47\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.408484343220685 0.591515656779315\r\n" + 
				"		0.267622737253591 0.732377262746409\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 48\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.622685882929767 0.377314117070233\r\n" + 
				"		0.769061824137782 0.230938175862218\r\n" + 
				"		0.132901711142742 0.867098288857258\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4485 0 0 \r\n" + 
				"\r\n" + 
				"Model 49\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.447358847660883 0.552641152339117\r\n" + 
				"		0.273955720734998 0.726044279265002\r\n" + 
				"		0.835574624848564 0.164425375151436\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8033 0 0 \r\n" + 
				"\r\n" + 
				"Model 50\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.564055441756111 0.435944558243889\r\n" + 
				"		0.812564392144040 0.187435607855960\r\n" + 
				"		0.257484250849925 0.742515749150075\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 51\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.550667259736348 0.449332740263652\r\n" + 
				"		0.695775445425454 0.304224554574546\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 52\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.362651702910636 0.637348297089364\r\n" + 
				"		0.249183572656232 0.750816427343768\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000138200004428 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 53\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.595834617769572 0.404165382230428\r\n" + 
				"		0.729803883288716 0.270196116711284\r\n" + 
				"		0.085009736626083 0.914990263373917\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.521800304330140 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 54\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.414388665715866 0.585611334284134\r\n" + 
				"		0.292073734055855 0.707926265944145\r\n" + 
				"		0.992106185920161 0.007893814079839\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3532 0 0 \r\n" + 
				"\r\n" + 
				"Model 55\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.611564365491615 0.388435634508385\r\n" + 
				"		0.722524504891164 0.277475495108836\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.413528738963091 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		14124 0 0 \r\n" + 
				"\r\n" + 
				"Model 56\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.399643594620641 0.600356405379359\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"		0.311261888917017 0.688738111082983\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.307479690930841 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24193 0 0 \r\n" + 
				"\r\n" + 
				"Model 57\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.588052382340710 0.411947617659290\r\n" + 
				"		0.702704052767097 0.297295947232903\r\n" + 
				"		0.000017198906794 0.999982801093206\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7271 0 0 \r\n" + 
				"\r\n" + 
				"Model 58\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.391407960580376 0.608592039419624\r\n" + 
				"		0.291364026551491 0.708635973448509\r\n" + 
				"		0.999764513006332 0.000235486993668\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3411 0 0 \r\n" + 
				"\r\n" + 
				"Model 59\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.594092759708385 0.405907240291615\r\n" + 
				"		0.426010246365816 0.573989753634184\r\n" + 
				"		0.972633866515867 0.027366133484133\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 60\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.700812453269899 0.299187546730101\r\n" + 
				"		0.845617594692136 0.154382405307864\r\n" + 
				"		0.298129483709944 0.701870516290056\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 61\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.589983306585512 0.410016693414488\r\n" + 
				"		0.755073542331325 0.244926457668675\r\n" + 
				"		0.108008735561166 0.891991264438834\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4734 0 0 \r\n" + 
				"\r\n" + 
				"Model 62\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.421577108267381 0.578422891732619\r\n" + 
				"		0.282823533921250 0.717176466078750\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 63\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.625322768411517 0.374677231588483\r\n" + 
				"		0.781263690678073 0.218736309321927\r\n" + 
				"		0.109559668278055 0.890440331721945\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6278 0 0 \r\n" + 
				"\r\n" + 
				"Model 64\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.437618429908836 0.562381570091164\r\n" + 
				"		0.310115582111528 0.689884417888472\r\n" + 
				"		0.906282748667864 0.093717251332136\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5358 0 0 \r\n" + 
				"\r\n" + 
				"Model 65\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.593661861255824 0.406338138744176\r\n" + 
				"		0.703977148481967 0.296022851518033\r\n" + 
				"		0.001142324503504 0.998857675496496\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.038904179750432 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24315 0 0 \r\n" + 
				"\r\n" + 
				"Model 66\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.395876425243010 0.604123574756990\r\n" + 
				"		0.605578814075804 0.394421185924196\r\n" + 
				"		0.071916877318066 0.928083122681934\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6100 0 0 \r\n" + 
				"\r\n" + 
				"Model 67\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.303782893667051 0.696217106332949\r\n" + 
				"		0.228566604567271 0.771433395432729\r\n" + 
				"		0.995387803994081 0.004612196005919\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12141 0 0 \r\n" + 
				"\r\n" + 
				"Model 68\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.560435204348666 0.439564795651334\r\n" + 
				"		0.674061224252088 0.325938775747912\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 69\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.384383917432264 0.615616082567736\r\n" + 
				"		0.678084204722375 0.321915795277625\r\n" + 
				"		0.151324410066564 0.848675589933436\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 70\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.380012215203310 0.619987784796690\r\n" + 
				"		0.244017915202629 0.755982084797371\r\n" + 
				"		0.883694784565839 0.116305215434161\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.013958714754303 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20718 0 0 \r\n" + 
				"\r\n" + 
				"Model 71\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.562940806389340 0.437059193610660\r\n" + 
				"		0.723701073692935 0.276298926307065\r\n" + 
				"		0.144313224117863 0.855686775882136\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000428602397294 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 72\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.427399489118945 0.572600510881055\r\n" + 
				"		0.999999966615065 0.000000033384935\r\n" + 
				"		0.309533762412259 0.690466237587741\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.040628371680213 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20081 0 0 \r\n" + 
				"\r\n" + 
				"Model 73\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.614828045639831 0.385171954360169\r\n" + 
				"		0.731541977216173 0.268458022783827\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 74\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.396984358235364 0.603015641764636\r\n" + 
				"		0.281728044569662 0.718271955430338\r\n" + 
				"		0.999979182337561 0.000020817662439\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8032 0 0 \r\n" + 
				"\r\n" + 
				"Model 75\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.605081013396024 0.394918986603976\r\n" + 
				"		0.740413298866623 0.259586701133377\r\n" + 
				"		0.094980474998281 0.905019525001719\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7205 0 0 \r\n" + 
				"\r\n" + 
				"Model 76\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.421803425935614 0.578196574064386\r\n" + 
				"		0.271541647072896 0.728458352927104\r\n" + 
				"		0.979642638922588 0.020357361077412\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 77\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.623061652086126 0.376938347913874\r\n" + 
				"		0.729530947354551 0.270469052645449\r\n" + 
				"		0.001154987258354 0.998845012741646\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.038904179750432 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24315 0 0 \r\n" + 
				"\r\n" + 
				"Model 78\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.405421073153352 0.594578926846648\r\n" + 
				"		0.240304965485664 0.759695034514336\r\n" + 
				"		0.838547875150295 0.161452124849705\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8792 0 0 \r\n" + 
				"\r\n" + 
				"Model 79\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.546131435999002 0.453868564000998\r\n" + 
				"		0.726619052171946 0.273380947828054\r\n" + 
				"		0.127648198534352 0.872351801465648\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6278 0 0 \r\n" + 
				"\r\n" + 
				"Model 80\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.413238052231296 0.586761947768704\r\n" + 
				"		0.307936381212149 0.692063618787851\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000138200004428 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 81\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.602958687939000 0.397041312061000\r\n" + 
				"		0.762037439592254 0.237962560407746\r\n" + 
				"		0.151969142621841 0.848030857378159\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6100 0 0 \r\n" + 
				"\r\n" + 
				"Model 82\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.450981580658618 0.549018419341382\r\n" + 
				"		0.326129382712704 0.673870617287296\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 83\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.626159314649219 0.373840685350781\r\n" + 
				"		0.732081928343440 0.267918071656560\r\n" + 
				"		0.004254906775872 0.995745093224128\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.038904179750432 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24315 0 0 \r\n" + 
				"\r\n" + 
				"Model 84\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.407304558812819 0.592695441187181\r\n" + 
				"		0.245111494736593 0.754888505263407\r\n" + 
				"		0.810478116610057 0.189521883389943\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 85\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.532189883785383 0.467810116214617\r\n" + 
				"		0.741708130886370 0.258291869113630\r\n" + 
				"		0.076616471810779 0.923383528189222\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 86\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.377976581498342 0.622023418501659\r\n" + 
				"		0.552328164946875 0.447671835053125\r\n" + 
				"		0.000000086654075 0.999999913345925\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7271 0 0 \r\n" + 
				"\r\n" + 
				"Model 87\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.272457511185296 0.727542488814704\r\n" + 
				"		0.207397312876692 0.792602687123308\r\n" + 
				"		0.999981802148985 0.000018197851015\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8103 0 0 \r\n" + 
				"\r\n" + 
				"Model 88\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.550689038102740 0.449310961897260\r\n" + 
				"		0.668479282545330 0.331520717454670\r\n" + 
				"		0.029285162151246 0.970714837848754\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"Model 89\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.386274860948435 0.613725139051565\r\n" + 
				"		0.694947441350040 0.305052558649960\r\n" + 
				"		0.133033367799133 0.866966632200867\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 90\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.371900495227679 0.628099504772321\r\n" + 
				"		0.210416963865277 0.789583036134723\r\n" + 
				"		0.767985411426265 0.232014588573735\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8792 0 0 \r\n" + 
				"\r\n" + 
				"Model 91\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.486909700432287 0.513090299567713\r\n" + 
				"		0.651972164538837 0.348027835461163\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.413528738963091 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		14124 0 0 \r\n" + 
				"\r\n" + 
				"Model 92\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.328955789898786 0.671044210101215\r\n" + 
				"		0.232395101825268 0.767604898174732\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 93\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.578933624122951 0.421066375877049\r\n" + 
				"		0.736488725541148 0.263511274458852\r\n" + 
				"		0.092149316979359 0.907850683020641\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4485 0 0 \r\n" + 
				"\r\n" + 
				"Model 94\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.408243225592286 0.591756774407714\r\n" + 
				"		0.268927791811002 0.731072208188998\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000138200004428 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 95\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.621793626459032 0.378206373540967\r\n" + 
				"		0.751642831469172 0.248357168530828\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.542360332800000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21221 0 0 \r\n" + 
				"\r\n" + 
				"Model 96\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.391287891747709 0.608712108252291\r\n" + 
				"		0.293958793032880 0.706041206967119\r\n" + 
				"		0.944773999746893 0.055226000253107\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 97\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.579252177521161 0.420747822478839\r\n" + 
				"		0.701529431023003 0.298470568976997\r\n" + 
				"		0.000000585487832 0.999999414512168\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7271 0 0 \r\n" + 
				"\r\n" + 
				"Model 98\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.384347435841658 0.615652564158342\r\n" + 
				"		0.593920139047321 0.406079860952679\r\n" + 
				"		0.066630231661344 0.933369768338656\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 99\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.294335529786276 0.705664470213724\r\n" + 
				"		0.214866671901908 0.785133328098092\r\n" + 
				"		0.999825016791100 0.000174983208899\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3411 0 0 \r\n" + 
				"\r\n" + 
				"Model 100\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.562679261832299 0.437320738167701\r\n" + 
				"		0.705248272561108 0.294751727438892\r\n" + 
				"		0.112823638914803 0.887176361085196\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4734 0 0 \r\n" + 
				"\r\n" + 
				"TrainedWeights\r\n" + 
				"1.161624616148493 1.019455780297137 0.936232264028554 1.071318227308508 0.876578410578748 0.780250121885093 0.756147469414492 0.687555425349535 0.833208967164534 0.827873250634095 0.647726005391436 0.711100951385151 0.662406182770504 0.631766748121910 0.380770785531206 0.731284668593088 0.767051489921686 0.396893740500173 0.681987786331256 0.655010457700251 0.634181100302826 0.553858089488426 0.558199851252607 0.648415057782661 0.634686542881826 0.700247406480422 0.509950998966297 0.654691362410458 0.580510318130816 0.559065567377657 0.560264855469879 0.610774543683367 0.627422452838146 0.321484660326864 0.666468348982772 0.674115801420998 0.552350513827646 0.658498166219318 0.551173364555669 0.827135375953769 0.495233758579347 0.628870234206787 0.615058259290593 0.580475807591138 0.744914121877361 0.745895090746918 0.644123765808689 0.667357013461534 0.575962677462961 0.636347296378049 0.574213049092756 0.657877631054750 0.599312724429713 0.569729556204896 0.590526837396828 0.493969176559489 0.552534280956747 0.548641385009604 0.415508009886541 0.717238503648315 0.662481792409965 0.609520969161679 0.714065168707401 0.513067084982968 0.550002111092130 0.503179104423836 0.672773709200784 0.494788822493945 0.613232217241310 0.642010919385409 0.577224431964471 0.531609069343554 0.616585630177752 0.585918625277092 0.618173178808269 0.637978062831846 0.601048276612937 0.637093231099281 0.605660596798464 0.520176220733048 0.645926633412399 0.508261157322195 0.605436936097910 0.606519209149056 0.689840640023656 0.408603705845425 0.723789750840383 0.482633331780299 0.660781458405513 0.642583146562619 0.523202069475371 0.683326905873763 0.628155688241458 0.639618706641194 0.676278930270980 0.527525319381919 0.558826410082773 0.494360571363246 0.714895104468411 0.546722515653240 ");
		filewriter.close();
		file = new File(workpath + "\\ionclassifier_B_v_O.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		filewriter = new FileWriter(file);
		filewriter.write("Model 1\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.500000000000002 0.499999999999998\r\n" + 
				"		0.882972541043151 0.117027458956849\r\n" + 
				"		0.183629380700912 0.816370619299087\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 2\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.563489940586827 0.436510059413173\r\n" + 
				"		0.743123416891060 0.256876583108940\r\n" + 
				"		0.106866085793342 0.893133914206658\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.735810139785576 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 3\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.409809129469197 0.590190870530803\r\n" + 
				"		0.794694221926602 0.205305778073398\r\n" + 
				"		0.213513600660847 0.786486399339153\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 4\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.505518843184710 0.494481156815289\r\n" + 
				"		0.393025181360342 0.606974818639658\r\n" + 
				"		0.898781507497690 0.101218492502310\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6215 0 0 \r\n" + 
				"\r\n" + 
				"Model 5\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.614464078896010 0.385535921103990\r\n" + 
				"		0.703490493910859 0.296509506089141\r\n" + 
				"		0.311164044345964 0.688835955654036\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.536653427389192 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21851 0 0 \r\n" + 
				"\r\n" + 
				"Model 6\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.506122878879925 0.493877121120075\r\n" + 
				"		0.426508652895316 0.573491347104684\r\n" + 
				"		0.945199514427141 0.054800485572859\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9537 0 0 \r\n" + 
				"\r\n" + 
				"Model 7\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.603659314347553 0.396340685652447\r\n" + 
				"		0.953584236987119 0.046415763012881\r\n" + 
				"		0.527294741499470 0.472705258500531\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.002991931588815 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16805 0 0 \r\n" + 
				"\r\n" + 
				"Model 8\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.499999999999999 0.500000000000001\r\n" + 
				"		0.930980728431930 0.069019271568070\r\n" + 
				"		0.422761284417936 0.577238715582064\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.002991931588815 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16805 0 0 \r\n" + 
				"\r\n" + 
				"Model 9\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.597901942526057 0.402098057473943\r\n" + 
				"		0.508733859527789 0.491266140472211\r\n" + 
				"		0.923445615707347 0.076554384292654\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5358 0 0 \r\n" + 
				"\r\n" + 
				"Model 10\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.499999999999999 0.500000000000001\r\n" + 
				"		0.410525893434439 0.589474106565562\r\n" + 
				"		0.890258056731616 0.109741943268384\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5358 0 0 \r\n" + 
				"\r\n" + 
				"Model 11\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.599724990224622 0.400275009775378\r\n" + 
				"		0.049861649649073 0.950138350350927\r\n" + 
				"		0.645191186250576 0.354808813749424\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.407966700464122 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18963 0 0 \r\n" + 
				"\r\n" + 
				"Model 12\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.451468325576125 0.548531674423875\r\n" + 
				"		0.394792355984850 0.605207644015150\r\n" + 
				"		0.949666962201089 0.050333037798911\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.004557783547317 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18290 0 0 \r\n" + 
				"\r\n" + 
				"Model 13\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.568587372950318 0.431412627049682\r\n" + 
				"		0.620429907662811 0.379570092337189\r\n" + 
				"		0.054250541186579 0.945749458813421\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.829386352359296 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		15009 0 0 \r\n" + 
				"\r\n" + 
				"Model 14\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.440509244108693 0.559490755891308\r\n" + 
				"		0.888779369640231 0.111220630359769\r\n" + 
				"		0.386897429071711 0.613102570928289\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.258044411590942 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20452 0 0 \r\n" + 
				"\r\n" + 
				"Model 15\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.557259241738398 0.442740758261602\r\n" + 
				"		0.629900674416679 0.370099325583321\r\n" + 
				"		0.178762890018552 0.821237109981448\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		967 0 0 \r\n" + 
				"\r\n" + 
				"Model 16\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.442348179414566 0.557651820585435\r\n" + 
				"		0.197400287599889 0.802599712400112\r\n" + 
				"		0.562137590382443 0.437862409617557\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1746.889994667350000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25372 0 0 \r\n" + 
				"\r\n" + 
				"Model 17\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.384746143657137 0.615253856342863\r\n" + 
				"		0.471538559276009 0.528461440723991\r\n" + 
				"		0.083613592456292 0.916386407543708\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.534773668415058 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		22597 0 0 \r\n" + 
				"\r\n" + 
				"Model 18\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.499999999999999 0.500000000000001\r\n" + 
				"		0.587946374349743 0.412053625650257\r\n" + 
				"		0.127329391241644 0.872670608758356\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.534773668415058 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		22597 0 0 \r\n" + 
				"\r\n" + 
				"Model 19\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.404279327153437 0.595720672846563\r\n" + 
				"		0.359835732792306 0.640164267207694\r\n" + 
				"		0.957073432031177 0.042926567968823\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3652 0 0 \r\n" + 
				"\r\n" + 
				"Model 20\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.548900613296058 0.451099386703942\r\n" + 
				"		0.653971066027391 0.346028933972609\r\n" + 
				"		0.311840976694652 0.688159023305348\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.830522150883902 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 21\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.483684801342959 0.516315198657041\r\n" + 
				"		0.181256077003239 0.818743922996761\r\n" + 
				"		0.580509446617670 0.419490553382330\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		394.201711381999980 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 22\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.405222537041755 0.594777462958245\r\n" + 
				"		0.938702018754262 0.061297981245738\r\n" + 
				"		0.354425693543923 0.645574306456078\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.123240265043137 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		22784 0 0 \r\n" + 
				"\r\n" + 
				"Model 23\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.552706706090221 0.447293293909779\r\n" + 
				"		0.619037078515552 0.380962921484448\r\n" + 
				"		0.054300053400032 0.945699946599968\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2239.117751331999900 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 24\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.424827434882257 0.575172565117743\r\n" + 
				"		0.582385491242316 0.417614508757684\r\n" + 
				"		0.263620285913555 0.736379714086445\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4985 0 0 \r\n" + 
				"\r\n" + 
				"Model 25\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.414412221420380 0.585587778579620\r\n" + 
				"		0.362065460406440 0.637934539593560\r\n" + 
				"		0.917811531253936 0.082188468746064\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3535 0 0 \r\n" + 
				"\r\n" + 
				"Model 26\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.553538858771871 0.446461141228129\r\n" + 
				"		0.671810903042330 0.328189096957670\r\n" + 
				"		0.333145049409525 0.666854950590475\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.111433670719420 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 27\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.502547420284960 0.497452579715040\r\n" + 
				"		0.243160902449592 0.756839097550408\r\n" + 
				"		0.623010867507848 0.376989132492152\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1746.889994667350000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25372 0 0 \r\n" + 
				"\r\n" + 
				"Model 28\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.434908943531113 0.565091056468887\r\n" + 
				"		0.365562962748576 0.634437037251424\r\n" + 
				"		0.850984728346783 0.149015271653217\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5358 0 0 \r\n" + 
				"\r\n" + 
				"Model 29\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.559545957622960 0.440454042377040\r\n" + 
				"		0.499582521505128 0.500417478494872\r\n" + 
				"		0.993843329108268 0.006156670891732\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3649 0 0 \r\n" + 
				"\r\n" + 
				"Model 30\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.606750973900751 0.393249026099249\r\n" + 
				"		0.673570098366310 0.326429901633690\r\n" + 
				"		0.231939475257444 0.768060524742555\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		967 0 0 \r\n" + 
				"\r\n" + 
				"Model 31\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.471744131245284 0.528255868754716\r\n" + 
				"		0.657586340327962 0.342413659672038\r\n" + 
				"		0.297886575012699 0.702113424987301\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4485 0 0 \r\n" + 
				"\r\n" + 
				"Model 32\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.474424801123819 0.525575198876181\r\n" + 
				"		0.411708078509154 0.588291921490846\r\n" + 
				"		0.861614433046818 0.138385566953182\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1085 0 0 \r\n" + 
				"\r\n" + 
				"Model 33\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.570056155486804 0.429943844513196\r\n" + 
				"		0.225238228374262 0.774761771625738\r\n" + 
				"		0.637575338430356 0.362424661569644\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.403482490366289 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18963 0 0 \r\n" + 
				"\r\n" + 
				"Model 34\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.458140424969652 0.541859575030348\r\n" + 
				"		0.539218731004954 0.460781268995046\r\n" + 
				"		0.180409088119793 0.819590911880207\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7205 0 0 \r\n" + 
				"\r\n" + 
				"Model 35\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.397614323361661 0.602385676638339\r\n" + 
				"		0.358844717854468 0.641155282145532\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.089000677366778 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17542 0 0 \r\n" + 
				"\r\n" + 
				"Model 36\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.545612120115275 0.454387879884725\r\n" + 
				"		0.601415528464746 0.398584471535254\r\n" + 
				"		0.096038815834017 0.903961184165983\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		10162 0 0 \r\n" + 
				"\r\n" + 
				"Model 37\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.435903345113705 0.564096654886295\r\n" + 
				"		0.617227229743629 0.382772770256372\r\n" + 
				"		0.323723810676349 0.676276189323652\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9166 0 0 \r\n" + 
				"\r\n" + 
				"Model 38\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.469203750905146 0.530796249094854\r\n" + 
				"		0.350597960912299 0.649402039087701\r\n" + 
				"		0.690143655151802 0.309856344848198\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8033 0 0 \r\n" + 
				"\r\n" + 
				"Model 39\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.520742005319809 0.479257994680191\r\n" + 
				"		0.601169166692745 0.398830833307255\r\n" + 
				"		0.220612035767426 0.779387964232574\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.051344680003682 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24315 0 0 \r\n" + 
				"\r\n" + 
				"Model 40\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.435627403958760 0.564372596041240\r\n" + 
				"		0.191261828135461 0.808738171864539\r\n" + 
				"		0.522120061658655 0.477879938341345\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.369235219560318 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20847 0 0 \r\n" + 
				"\r\n" + 
				"Model 41\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.384987174997690 0.615012825002310\r\n" + 
				"		0.493168730930993 0.506831269069007\r\n" + 
				"		0.217149134151969 0.782850865848031\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.280468484239211 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 42\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.500000000000000 0.500000000000000\r\n" + 
				"		0.545993351086573 0.454006648913427\r\n" + 
				"		0.043790193762153 0.956209806237847\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.829386352359296 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		15009 0 0 \r\n" + 
				"\r\n" + 
				"Model 43\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.429782300262458 0.570217699737542\r\n" + 
				"		0.535893035038551 0.464106964961449\r\n" + 
				"		0.253988790674152 0.746011209325848\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.280468484239211 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 44\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.395852336514310 0.604147663485690\r\n" + 
				"		0.332650811965816 0.667349188034184\r\n" + 
				"		0.752649127514060 0.247350872485940\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3169 0 0 \r\n" + 
				"\r\n" + 
				"Model 45\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.525063767849355 0.474936232150645\r\n" + 
				"		0.668253829523487 0.331746170476513\r\n" + 
				"		0.362958587035198 0.637041412964802\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4985 0 0 \r\n" + 
				"\r\n" + 
				"Model 46\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.517166657149220 0.482833342850780\r\n" + 
				"		0.864958786647202 0.135041213352798\r\n" + 
				"		0.452730066849119 0.547269933150881\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.026806125630949 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20452 0 0 \r\n" + 
				"\r\n" + 
				"Model 47\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.587064972987259 0.412935027012741\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.623408690420968 0.376591309579032\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.445416608564977 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		23404 0 0 \r\n" + 
				"\r\n" + 
				"Model 48\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.454832900909410 0.545167099090590\r\n" + 
				"		0.414312976179733 0.585687023820267\r\n" + 
				"		0.966436991316072 0.033563008683929\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.059046600585953 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18290 0 0 \r\n" + 
				"\r\n" + 
				"Model 49\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.554604601138934 0.445395398861066\r\n" + 
				"		0.078323415350196 0.921676584649804\r\n" + 
				"		0.600996913200441 0.399003086799559\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.759385361782062 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25313 0 0 \r\n" + 
				"\r\n" + 
				"Model 50\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.444398457430029 0.555601542569971\r\n" + 
				"		0.910552458800598 0.089447541199402\r\n" + 
				"		0.400466169727693 0.599533830272307\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.054987354674541 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17795 0 0 \r\n" + 
				"\r\n" + 
				"Model 51\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.552298191232638 0.447701808767362\r\n" + 
				"		0.600546843893834 0.399453156106166\r\n" + 
				"		0.107849790138372 0.892150209861628\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2239.117751331999900 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 52\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.444800644721994 0.555199355278006\r\n" + 
				"		0.940437687967926 0.059562312032074\r\n" + 
				"		0.406448205132889 0.593551794867111\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.310485243746063 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		13152 0 0 \r\n" + 
				"\r\n" + 
				"Model 53\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.549000319326537 0.450999680673463\r\n" + 
				"		0.120049258453385 0.879950741546615\r\n" + 
				"		0.599078405574954 0.400921594425046\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.962838150685581 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16215 0 0 \r\n" + 
				"\r\n" + 
				"Model 54\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.443698719048871 0.556301280951129\r\n" + 
				"		0.541887605960186 0.458112394039813\r\n" + 
				"		0.243769054797079 0.756230945202921\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.830522150883902 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 55\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.400262785782927 0.599737214217072\r\n" + 
				"		0.174174231303871 0.825825768696129\r\n" + 
				"		0.499660189746482 0.500339810253518\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		394.201711381999980 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 56\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.500000000000000 0.500000000000000\r\n" + 
				"		0.240131737065097 0.759868262934903\r\n" + 
				"		0.599410880789703 0.400589119210298\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		394.201711381999980 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 57\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.429981515265066 0.570018484734934\r\n" + 
				"		0.890116279483716 0.109883720516284\r\n" + 
				"		0.383075525843842 0.616924474156158\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.203278920959923 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		22481 0 0 \r\n" + 
				"\r\n" + 
				"Model 58\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.549906047389505 0.450093952610495\r\n" + 
				"		0.589595569493601 0.410404430506399\r\n" + 
				"		0.065169765168197 0.934830234831803\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.829386352359296 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		15009 0 0 \r\n" + 
				"\r\n" + 
				"Model 59\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.448964994293800 0.551035005706200\r\n" + 
				"		0.600866997419071 0.399133002580929\r\n" + 
				"		0.330854178759294 0.669145821240706\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 60\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.463568379292570 0.536431620707430\r\n" + 
				"		0.864272660784477 0.135727339215523\r\n" + 
				"		0.403374853831897 0.596625146168103\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.026806125630949 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20452 0 0 \r\n" + 
				"\r\n" + 
				"Model 61\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.565301952377057 0.434698047622943\r\n" + 
				"		0.653099181369197 0.346900818630803\r\n" + 
				"		0.247283921827348 0.752716078172653\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7205 0 0 \r\n" + 
				"\r\n" + 
				"Model 62\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.461527516094539 0.538472483905461\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"		0.422428792878829 0.577571207121171\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.255140517198732 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17856 0 0 \r\n" + 
				"\r\n" + 
				"Model 63\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.555838579152151 0.444161420847849\r\n" + 
				"		0.001583641502705 0.998416358497294\r\n" + 
				"		0.600056903918011 0.399943096081989\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.157479701140764 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21484 0 0 \r\n" + 
				"\r\n" + 
				"Model 64\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.441564252004993 0.558435747995007\r\n" + 
				"		0.404377966798170 0.595622033201830\r\n" + 
				"		0.969797253261832 0.030202746738168\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11153 0 0 \r\n" + 
				"\r\n" + 
				"Model 65\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.548802152914405 0.451197847085595\r\n" + 
				"		0.600291470979809 0.399708529020191\r\n" + 
				"		0.211273636663855 0.788726363336145\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9167 0 0 \r\n" + 
				"\r\n" + 
				"Model 66\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.453824000567300 0.546175999432700\r\n" + 
				"		0.419082735878905 0.580917264121095\r\n" + 
				"		0.984784070105745 0.015215929894255\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3649 0 0 \r\n" + 
				"\r\n" + 
				"Model 67\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.548737642271903 0.451262357728097\r\n" + 
				"		0.622950823621029 0.377049176378971\r\n" + 
				"		0.330541562936174 0.669458437063826\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6275 0 0 \r\n" + 
				"\r\n" + 
				"Model 68\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.481004571404527 0.518995428595473\r\n" + 
				"		0.435573868447141 0.564426131552859\r\n" + 
				"		0.890115121108224 0.109884878891776\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3880 0 0 \r\n" + 
				"\r\n" + 
				"Model 69\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.560887706283123 0.439112293716877\r\n" + 
				"		0.592680742891535 0.407319257108466\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.477556289745575 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16628 0 0 \r\n" + 
				"\r\n" + 
				"Model 70\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.456354670911609 0.543645329088391\r\n" + 
				"		0.226343186346196 0.773656813653804\r\n" + 
				"		0.528687023772713 0.471312976227287\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		376.198881331999810 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 71\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.408025839098847 0.591974160901153\r\n" + 
				"		0.991684630798811 0.008315369201189\r\n" + 
				"		0.378981853334310 0.621018146665691\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.778238208907371 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		22222 0 0 \r\n" + 
				"\r\n" + 
				"Model 72\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.536261520010753 0.463738479989247\r\n" + 
				"		0.266673804342424 0.733326195657576\r\n" + 
				"		0.610473405128686 0.389526594871315\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.426045302385952 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20847 0 0 \r\n" + 
				"\r\n" + 
				"Model 73\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.455035707515920 0.544964292484080\r\n" + 
				"		0.552361978133854 0.447638021866146\r\n" + 
				"		0.272844628002897 0.727155371997103\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.830522150883902 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 74\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.416371172969962 0.583628827030038\r\n" + 
				"		0.379758590607143 0.620241409392857\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.692639386771661 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18290 0 0 \r\n" + 
				"\r\n" + 
				"Model 75\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.545926084779779 0.454073915220221\r\n" + 
				"		0.659521815085410 0.340478184914590\r\n" + 
				"		0.354257991755267 0.645742008244733\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.142925433514890 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21851 0 0 \r\n" + 
				"\r\n" + 
				"Model 76\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.507117930136872 0.492882069863128\r\n" + 
				"		0.560913595715299 0.439086404284701\r\n" + 
				"		0.079678337204600 0.920321662795400\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2239.117751331999900 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 77\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.425586663638018 0.574413336361982\r\n" + 
				"		0.386475806809314 0.613524193190686\r\n" + 
				"		0.892064233144016 0.107935766855984\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5858 0 0 \r\n" + 
				"\r\n" + 
				"Model 78\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.542890484441593 0.457109515558407\r\n" + 
				"		0.574247458196707 0.425752541803293\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1419 0 0 \r\n" + 
				"\r\n" + 
				"Model 79\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.454304840698404 0.545695159301596\r\n" + 
				"		0.611954605124642 0.388045394875358\r\n" + 
				"		0.342855889410432 0.657144110589568\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 80\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.476250895188019 0.523749104811981\r\n" + 
				"		0.433217821228407 0.566782178771593\r\n" + 
				"		0.991993986962061 0.008006013037939\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3649 0 0 \r\n" + 
				"\r\n" + 
				"Model 81\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.562943967510134 0.437056032489866\r\n" + 
				"		0.060318377471574 0.939681622528426\r\n" + 
				"		0.609546139897420 0.390453860102580\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.407966700464122 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18963 0 0 \r\n" + 
				"\r\n" + 
				"Model 82\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.444531053653940 0.555468946346060\r\n" + 
				"		0.935027595791555 0.064972404208445\r\n" + 
				"		0.398470377704855 0.601529622295145\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.310485243746063 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		13152 0 0 \r\n" + 
				"\r\n" + 
				"Model 83\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.556147708606877 0.443852291393123\r\n" + 
				"		0.473877053214353 0.526122946785647\r\n" + 
				"		0.786867161973896 0.213132838026104\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5605 0 0 \r\n" + 
				"\r\n" + 
				"Model 84\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.604800809083982 0.395199190916018\r\n" + 
				"		0.633573411834549 0.366426588165451\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.477556289745575 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16628 0 0 \r\n" + 
				"\r\n" + 
				"Model 85\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.465078259481681 0.534921740518319\r\n" + 
				"		0.408328366068089 0.591671633931911\r\n" + 
				"		0.782515877163118 0.217484122836882\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5358 0 0 \r\n" + 
				"\r\n" + 
				"Model 86\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.552142479698657 0.447857520301343\r\n" + 
				"		0.591508435418691 0.408491564581309\r\n" + 
				"		0.089496923629429 0.910503076370571\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		2027 0 0 \r\n" + 
				"\r\n" + 
				"Model 87\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.451246413535266 0.548753586464734\r\n" + 
				"		0.404179417667590 0.595820582332410\r\n" + 
				"		0.845506939624709 0.154493060375292\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5110 0 0 \r\n" + 
				"\r\n" + 
				"Model 88\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.550613143238134 0.449386856761866\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.579802190135378 0.420197809864622\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.445416608564977 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		23404 0 0 \r\n" + 
				"\r\n" + 
				"Model 89\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.458114162189429 0.541885837810571\r\n" + 
				"		0.423639265427459 0.576360734572541\r\n" + 
				"		0.949766551006540 0.050233448993460\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11153 0 0 \r\n" + 
				"\r\n" + 
				"Model 90\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.547667292722354 0.452332707277646\r\n" + 
				"		0.650605518203411 0.349394481796589\r\n" + 
				"		0.386781405752594 0.613218594247406\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000428602397294 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 91\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.519213481706283 0.480786518293717\r\n" + 
				"		0.867049217892547 0.132950782107453\r\n" + 
				"		0.468828527394783 0.531171472605217\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.258044411590942 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20452 0 0 \r\n" + 
				"\r\n" + 
				"Model 92\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.575887496604307 0.424112503395693\r\n" + 
				"		0.603397682934643 0.396602317065357\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1419 0 0 \r\n" + 
				"\r\n" + 
				"Model 93\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.463319689683528 0.536680310316472\r\n" + 
				"		0.428998801331524 0.571001198668476\r\n" + 
				"		0.978018006990420 0.021981993009579\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3649 0 0 \r\n" + 
				"\r\n" + 
				"Model 94\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.549550202740697 0.450449797259303\r\n" + 
				"		0.004131092164734 0.995868907835266\r\n" + 
				"		0.578285095947269 0.421714904052731\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.157479701140764 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21484 0 0 \r\n" + 
				"\r\n" + 
				"Model 95\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.458667510209940 0.541332489790060\r\n" + 
				"		0.420634648577337 0.579365351422664\r\n" + 
				"		0.904729336536285 0.095270663463715\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.004557783547317 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18290 0 0 \r\n" + 
				"\r\n" + 
				"Model 96\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.549277969014167 0.450722030985833\r\n" + 
				"		0.622842031562487 0.377157968437513\r\n" + 
				"		0.285039964807146 0.714960035192854\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.646705766044668 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17300 0 0 \r\n" + 
				"\r\n" + 
				"Model 97\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.465824163822492 0.534175836177508\r\n" + 
				"		0.419758124527020 0.580241875472980\r\n" + 
				"		0.919503604633060 0.080496395366940\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		10718 0 0 \r\n" + 
				"\r\n" + 
				"Model 98\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.559752433904384 0.440247566095616\r\n" + 
				"		0.169180219814979 0.830819780185021\r\n" + 
				"		0.598977617697046 0.401022382302954\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.762495263762138 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		22478 0 0 \r\n" + 
				"\r\n" + 
				"Model 99\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.459188143518171 0.540811856481829\r\n" + 
				"		0.429322217230983 0.570677782769017\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.692639386771661 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18290 0 0 \r\n" + 
				"\r\n" + 
				"Model 100\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.544115725989397 0.455884274010603\r\n" + 
				"		0.592131173622002 0.407868826377998\r\n" + 
				"		0.207410247715429 0.792589752284571\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		967 0 0 \r\n" + 
				"\r\n" + 
				"TrainedWeights\r\n" + 
				"0.853705449543450 0.648933048542888 0.660231166710695 0.358351061996355 0.424042081089708 0.267277994494287 0.210367915504001 0.268254814786639 0.198365390928646 0.299817635700992 0.350660188226122 0.288531640060091 0.309998743033079 0.293226309313614 0.333228434029939 0.290096324184773 0.234725603747213 0.292700551191426 0.340018919932138 0.341640116520466 0.283963513971717 0.356488784149810 0.325875181149209 0.328311025808518 0.341250523714324 0.354273768443806 0.343843941526434 0.343664369116699 0.121148473989698 0.395082103341368 0.378246104195172 0.258386643781335 0.331734628752985 0.208098652149497 0.338019413729820 0.276480833875764 0.317687372696779 0.339764087973386 0.285153539789726 0.196589006709039 0.234216549606376 0.168707109709658 0.234153545929008 0.377311423841170 0.317482776641833 0.196342186936486 0.299359882655666 0.231298232900076 0.264951152205296 0.258232905503092 0.264185019270323 0.241521112072436 0.262767288019613 0.228883117603959 0.202185143556507 0.295966838366357 0.292456841121996 0.235717979544538 0.286117741114029 0.269500661520161 0.364648705828281 0.215615441867407 0.265014288915689 0.245263664740165 0.255908209785680 0.214677898516852 0.276334095653231 0.196445070562060 0.233198194237719 0.176393556298762 0.284622342284694 0.281166456975826 0.230442271047675 0.293460557028402 0.319205176076226 0.205005696515256 0.277017521674179 0.197520897989383 0.284275130889076 0.201751600567623 0.282390945193026 0.266448864041510 0.191632974212270 0.309990043444448 0.246080519846403 0.237407695221731 0.249978661157687 0.204725550276800 0.204459066541149 0.279061187105994 0.148417190193163 0.247916618217819 0.195337285604541 0.201033263671401 0.213019761664331 0.293992802118074 0.226841795362866 0.245063911948538 0.188493063529036 0.238733552085192 ");
		filewriter.close();
		file = new File(workpath + "\\ionclassifier_B_v_Y.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		filewriter = new FileWriter(file);
		filewriter.write("Model 1\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.500000000000000 0.500000000000000\r\n" + 
				"		0.132653061224490 0.867346938775511\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.033284165264189 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17918 0 0 \r\n" + 
				"\r\n" + 
				"Model 2\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.729299363057325 0.270700636942675\r\n" + 
				"		0.911290322580645 0.088709677419355\r\n" + 
				"		0.045454545454545 0.954545454545454\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"Model 3\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.451003460207612 0.548996539792387\r\n" + 
				"		0.126979827138129 0.873020172861871\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 4\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.701680647960660 0.298319352039340\r\n" + 
				"		0.930849350516230 0.069150649483770\r\n" + 
				"		0.140021478417185 0.859978521582815\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 5\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.589325996573439 0.410674003426561\r\n" + 
				"		0.882874110239269 0.117125889760731\r\n" + 
				"		0.075646773675793 0.924353226324207\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4985 0 0 \r\n" + 
				"\r\n" + 
				"Model 6\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.447622588928061 0.552377411071939\r\n" + 
				"		0.142662996253061 0.857337003746939\r\n" + 
				"		0.955642693722060 0.044357306277940\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 7\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.621797509284562 0.378202490715438\r\n" + 
				"		0.916609081370739 0.083390918629261\r\n" + 
				"		0.193003597068576 0.806996402931424\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 8\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.618508894697811 0.381491105302189\r\n" + 
				"		0.239982280900611 0.760017719099389\r\n" + 
				"		0.978640626716048 0.021359373283952\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.001258396655727 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20718 0 0 \r\n" + 
				"\r\n" + 
				"Model 9\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.744770200489597 0.255229799510403\r\n" + 
				"		0.865113686775953 0.134886313224047\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000428602397294 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 10\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.421308574568212 0.578691425431789\r\n" + 
				"		0.197034773161387 0.802965226838613\r\n" + 
				"		0.985820861321291 0.014179138678709\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3411 0 0 \r\n" + 
				"\r\n" + 
				"Model 11\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.650026744746582 0.349973255253418\r\n" + 
				"		0.839569744818166 0.160430255181834\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 12\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.371109299885914 0.628890700114086\r\n" + 
				"		0.189792725047924 0.810207274952076\r\n" + 
				"		0.999660578597671 0.000339421402329\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11680 0 0 \r\n" + 
				"\r\n" + 
				"Model 13\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.630989053959942 0.369010946040058\r\n" + 
				"		0.311515748332548 0.688484251667452\r\n" + 
				"		0.916848832362384 0.083151167637616\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 14\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.684173767183031 0.315826232816969\r\n" + 
				"		0.842092943589015 0.157907056410985\r\n" + 
				"		0.021191770326040 0.978808229673960\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.026755426487549 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20847 0 0 \r\n" + 
				"\r\n" + 
				"Model 15\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.407071832374289 0.592928167625711\r\n" + 
				"		0.235679006074795 0.764320993925205\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 16\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.637206403875909 0.362793596124091\r\n" + 
				"		0.382138389817214 0.617861610182787\r\n" + 
				"		0.998090183431026 0.001909816568974\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7454 0 0 \r\n" + 
				"\r\n" + 
				"Model 17\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.764785015433016 0.235214984566984\r\n" + 
				"		0.001353798369527 0.998646201630473\r\n" + 
				"		0.844688142680352 0.155311857319648\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.086134262244673 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		15377 0 0 \r\n" + 
				"\r\n" + 
				"Model 18\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.445398632381901 0.554601367618100\r\n" + 
				"		0.274509829635744 0.725490170364256\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.002975696656792 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 19\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.649053470008598 0.350946529991402\r\n" + 
				"		0.779989683957894 0.220010316042106\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 20\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.397255165455811 0.602744834544189\r\n" + 
				"		0.690681292175996 0.309318707824004\r\n" + 
				"		0.045678606039969 0.954321393960031\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9166 0 0 \r\n" + 
				"\r\n" + 
				"Model 21\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.287078002724768 0.712921997275232\r\n" + 
				"		0.121332909382045 0.878667090617955\r\n" + 
				"		0.892218408424223 0.107781591575777\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11393 0 0 \r\n" + 
				"\r\n" + 
				"Model 22\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.510954285934481 0.489045714065519\r\n" + 
				"		0.261035552541029 0.738964447458972\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 23\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.704413731048201 0.295586268951799\r\n" + 
				"		0.386967242347465 0.613032757652535\r\n" + 
				"		0.946222572035991 0.053777427964009\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4362 0 0 \r\n" + 
				"\r\n" + 
				"Model 24\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.757636642777580 0.242363357222420\r\n" + 
				"		0.873571434856331 0.126428565143669\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.387104901883022 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17170 0 0 \r\n" + 
				"\r\n" + 
				"Model 25\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.425471136981206 0.574528863018794\r\n" + 
				"		0.241632599946168 0.758367400053832\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.033284165264189 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17918 0 0 \r\n" + 
				"\r\n" + 
				"Model 26\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.648366365410075 0.351633634589925\r\n" + 
				"		0.814837875390631 0.185162124609369\r\n" + 
				"		0.077705204155314 0.922294795844686\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6772 0 0 \r\n" + 
				"\r\n" + 
				"Model 27\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.430421716519694 0.569578283480306\r\n" + 
				"		0.261135859536015 0.738864140463985\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 28\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.643431758710805 0.356568241289195\r\n" + 
				"		0.897120117568595 0.102879882431405\r\n" + 
				"		0.342970204956491 0.657029795043509\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 29\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.677882771697148 0.322117228302852\r\n" + 
				"		0.353763442487218 0.646236557512782\r\n" + 
				"		0.926523502893978 0.073476497106022\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 30\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.719188668214373 0.280811331785627\r\n" + 
				"		0.859106365841440 0.140893634158560\r\n" + 
				"		0.002336264815796 0.997663735184204\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"Model 31\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.409223019143743 0.590776980856257\r\n" + 
				"		0.161531940483790 0.838468059516210\r\n" + 
				"		0.912545394733990 0.087454605266010\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		2566 0 0 \r\n" + 
				"\r\n" + 
				"Model 32\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.569201754532038 0.430798245467962\r\n" + 
				"		0.384428805813069 0.615571194186932\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 33\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.705321554930029 0.294678445069971\r\n" + 
				"		0.822017742484155 0.177982257515845\r\n" + 
				"		0.095729044614380 0.904270955385620\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9166 0 0 \r\n" + 
				"\r\n" + 
				"Model 34\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.459698213325991 0.540301786674009\r\n" + 
				"		0.234622646585827 0.765377353414173\r\n" + 
				"		0.989730904281625 0.010269095718375\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7454 0 0 \r\n" + 
				"\r\n" + 
				"Model 35\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.668112623164951 0.331887376835049\r\n" + 
				"		0.000078590124175 0.999921409875825\r\n" + 
				"		0.798974800367761 0.201025199632239\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.086134262244673 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		15377 0 0 \r\n" + 
				"\r\n" + 
				"Model 36\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.401593340788360 0.598406659211640\r\n" + 
				"		0.167349754456891 0.832650245543109\r\n" + 
				"		0.906488023664884 0.093511976335116\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 37\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.564856904165279 0.435143095834721\r\n" + 
				"		0.280333920627628 0.719666079372372\r\n" + 
				"		0.977154903806497 0.022845096193503\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.001258396655727 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20718 0 0 \r\n" + 
				"\r\n" + 
				"Model 38\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.715247088895019 0.284752911104981\r\n" + 
				"		0.861255663094752 0.138744336905248\r\n" + 
				"		0.001428695152803 0.998571304847197\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"Model 39\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.405203049602219 0.594796950397781\r\n" + 
				"		0.836819038065478 0.163180961934522\r\n" + 
				"		0.117343159703484 0.882656840296516\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 40\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.453092500650625 0.546907499349375\r\n" + 
				"		0.152945132940323 0.847054867059677\r\n" + 
				"		0.764456438248038 0.235543561751962\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7021 0 0 \r\n" + 
				"\r\n" + 
				"Model 41\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.433858688729843 0.566141311270157\r\n" + 
				"		0.692157650813864 0.307842349186136\r\n" + 
				"		0.068231550703156 0.931768449296845\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4615 0 0 \r\n" + 
				"\r\n" + 
				"Model 42\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.323968506069211 0.676031493930790\r\n" + 
				"		0.180529732990645 0.819470267009355\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.033284165264189 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17918 0 0 \r\n" + 
				"\r\n" + 
				"Model 43\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.602834332218320 0.397165667781680\r\n" + 
				"		0.787780029600759 0.212219970399241\r\n" + 
				"		0.172162210853198 0.827837789146802\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 44\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.473709244307483 0.526290755692517\r\n" + 
				"		0.287587573579116 0.712412426420884\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.384008259367308 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18411 0 0 \r\n" + 
				"\r\n" + 
				"Model 45\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.665866768963600 0.334133231036400\r\n" + 
				"		0.835475971684566 0.164524028315434\r\n" + 
				"		0.172770806177683 0.827229193822317\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4985 0 0 \r\n" + 
				"\r\n" + 
				"Model 46\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.505654492936457 0.494345507063543\r\n" + 
				"		0.246434328859929 0.753565671140071\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 47\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.705163007410779 0.294836992589221\r\n" + 
				"		0.846518342631226 0.153481657368775\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 48\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.404268259431020 0.595731740568980\r\n" + 
				"		0.160110514518576 0.839889485481424\r\n" + 
				"		0.858719761906838 0.141280238093163\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 49\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.516470714006994 0.483529285993006\r\n" + 
				"		0.853869693439964 0.146130306560037\r\n" + 
				"		0.185023147513201 0.814976852486800\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 50\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.535155723645633 0.464844276354367\r\n" + 
				"		0.709427921017251 0.290572078982749\r\n" + 
				"		0.007688207769056 0.992311792230944\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"Model 51\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.346297889182033 0.653702110817967\r\n" + 
				"		0.197041790423000 0.802958209577000\r\n" + 
				"		0.968572394743565 0.031427605256435\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3411 0 0 \r\n" + 
				"\r\n" + 
				"Model 52\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.593777492008223 0.406222507991777\r\n" + 
				"		0.761322784480725 0.238677215519275\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000428602397294 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 53\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.364795954829424 0.635204045170576\r\n" + 
				"		0.201226371610494 0.798773628389507\r\n" + 
				"		0.999999989544304 0.000000010455696\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11680 0 0 \r\n" + 
				"\r\n" + 
				"Model 54\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.621893317648120 0.378106682351880\r\n" + 
				"		0.360776848969078 0.639223151030922\r\n" + 
				"		0.958153396117239 0.041846603882761\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.001258396655727 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20718 0 0 \r\n" + 
				"\r\n" + 
				"Model 55\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.727629219699582 0.272370780300418\r\n" + 
				"		0.844157343455258 0.155842656544742\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1320 0 0 \r\n" + 
				"\r\n" + 
				"Model 56\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.420269406510610 0.579730593489390\r\n" + 
				"		0.192074360563676 0.807925639436324\r\n" + 
				"		0.817078446110621 0.182921553889379\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 57\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.506928439579773 0.493071560420227\r\n" + 
				"		0.295463201094110 0.704536798905890\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 58\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.689196000006588 0.310803999993412\r\n" + 
				"		0.816639019399324 0.183360980600676\r\n" + 
				"		0.004573148042822 0.995426851957178\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"Model 59\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.409840181641060 0.590159818358940\r\n" + 
				"		0.227567346515206 0.772432653484794\r\n" + 
				"		0.940013148513317 0.059986851486684\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.062200451008240 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18411 0 0 \r\n" + 
				"\r\n" + 
				"Model 60\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.605939282238201 0.394060717761799\r\n" + 
				"		0.831589130666754 0.168410869333246\r\n" + 
				"		0.132108286696166 0.867891713303834\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 61\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.469983243985468 0.530016756014532\r\n" + 
				"		0.714678649990966 0.285321350009034\r\n" + 
				"		0.057397747704910 0.942602252295090\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4985 0 0 \r\n" + 
				"\r\n" + 
				"Model 62\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.333844550007735 0.666155449992265\r\n" + 
				"		0.201792854348509 0.798207145651491\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 63\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.599469214431379 0.400530785568621\r\n" + 
				"		0.343448356486497 0.656551643513503\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.033284165264189 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17918 0 0 \r\n" + 
				"\r\n" + 
				"Model 64\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.746652976188724 0.253347023811276\r\n" + 
				"		0.838422945127926 0.161577054872074\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.387104901883022 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17170 0 0 \r\n" + 
				"\r\n" + 
				"Model 65\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.436073834124837 0.563926165875163\r\n" + 
				"		0.819670324135802 0.180329675864198\r\n" + 
				"		0.180413310625543 0.819586689374457\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 66\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.500067880252716 0.499932119747284\r\n" + 
				"		0.285806737164531 0.714193262835469\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.033284165264189 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17918 0 0 \r\n" + 
				"\r\n" + 
				"Model 67\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.687517641499827 0.312482358500173\r\n" + 
				"		0.790405374207569 0.209594625792431\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 68\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.420403158275626 0.579596841724374\r\n" + 
				"		0.252125830894735 0.747874169105265\r\n" + 
				"		0.974340014026540 0.025659985973460\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.001258396655727 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20718 0 0 \r\n" + 
				"\r\n" + 
				"Model 69\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.626780699024849 0.373219300975151\r\n" + 
				"		0.344776897926277 0.655223102073723\r\n" + 
				"		0.990690780902317 0.009309219097683\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4362 0 0 \r\n" + 
				"\r\n" + 
				"Model 70\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.759516345975963 0.240483654024037\r\n" + 
				"		0.874278842853883 0.125721157146117\r\n" + 
				"		0.147654480147966 0.852345519852034\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6772 0 0 \r\n" + 
				"\r\n" + 
				"Model 71\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.512964897403696 0.487035102596304\r\n" + 
				"		0.310517598942052 0.689482401057948\r\n" + 
				"		0.955482137150961 0.044517862849039\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7454 0 0 \r\n" + 
				"\r\n" + 
				"Model 72\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.663224377192493 0.336775622807507\r\n" + 
				"		0.376492101580648 0.623507898419352\r\n" + 
				"		0.932237362465006 0.067762637534994\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 73\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.726739717644680 0.273260282355320\r\n" + 
				"		0.839294455470525 0.160705544529475\r\n" + 
				"		0.000000020916586 0.999999979083414\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.013958714754303 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21851 0 0 \r\n" + 
				"\r\n" + 
				"Model 74\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.422107818962370 0.577892181037630\r\n" + 
				"		0.252215464036195 0.747784535963805\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 75\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.641099296319051 0.358900703680949\r\n" + 
				"		0.311439854498472 0.688560145501528\r\n" + 
				"		0.886168356660943 0.113831643339057\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		2566 0 0 \r\n" + 
				"\r\n" + 
				"Model 76\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.652128175876832 0.347871824123168\r\n" + 
				"		0.808758971916589 0.191241028083411\r\n" + 
				"		0.007169771336064 0.992830228663936\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"Model 77\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.389681640129482 0.610318359870518\r\n" + 
				"		0.229199534785071 0.770800465214929\r\n" + 
				"		0.937190586934998 0.062809413065002\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7454 0 0 \r\n" + 
				"\r\n" + 
				"Model 78\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.594197558945295 0.405802441054705\r\n" + 
				"		0.296048767758462 0.703951232241537\r\n" + 
				"		0.942868613377244 0.057131386622756\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 79\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.696112516595751 0.303887483404249\r\n" + 
				"		0.000000187754305 0.999999812245695\r\n" + 
				"		0.807408448469471 0.192591551530530\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.086134262244673 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		15377 0 0 \r\n" + 
				"\r\n" + 
				"Model 80\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.417355772015171 0.582644227984829\r\n" + 
				"		0.232991020131913 0.767008979868087\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 81\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.646029611257743 0.353970388742257\r\n" + 
				"		0.837887872269934 0.162112127730065\r\n" + 
				"		0.033934857122646 0.966065142877354\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9166 0 0 \r\n" + 
				"\r\n" + 
				"Model 82\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.398056957869464 0.601943042130536\r\n" + 
				"		0.231129014864527 0.768870985135473\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.002975696656792 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 83\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.632536248878166 0.367463751121834\r\n" + 
				"		0.000000157103200 0.999999842896800\r\n" + 
				"		0.767713238622284 0.232286761377716\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.056306306630674 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18040 0 0 \r\n" + 
				"\r\n" + 
				"Model 84\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.391123940700138 0.608876059299862\r\n" + 
				"		0.233812474417505 0.766187525582495\r\n" + 
				"		0.945077606036128 0.054922393963872\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.001258396655727 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20718 0 0 \r\n" + 
				"\r\n" + 
				"Model 85\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.598439772140138 0.401560227859862\r\n" + 
				"		0.724534570425017 0.275465429574983\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1320 0 0 \r\n" + 
				"\r\n" + 
				"Model 86\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.387352014603434 0.612647985396566\r\n" + 
				"		0.247611736340899 0.752388263659101\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 87\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.616316577889447 0.383683422110553\r\n" + 
				"		0.284929335233533 0.715070664766467\r\n" + 
				"		0.889092543907576 0.110907456092424\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 88\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.640308794397335 0.359691205602665\r\n" + 
				"		0.812359562255950 0.187640437744050\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000428602397294 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 89\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.375723887670314 0.624276112329686\r\n" + 
				"		0.242180075430100 0.757819924569900\r\n" + 
				"		0.999999999979564 0.000000000020436\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11680 0 0 \r\n" + 
				"\r\n" + 
				"Model 90\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.610069746273868 0.389930253726132\r\n" + 
				"		0.739448561233866 0.260551438766134\r\n" + 
				"		0.000746213190068 0.999253786809932\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"Model 91\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.388823977325557 0.611176022674443\r\n" + 
				"		0.159550253917077 0.840449746082923\r\n" + 
				"		0.869257797331202 0.130742202668798\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4362 0 0 \r\n" + 
				"\r\n" + 
				"Model 92\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.524673015254400 0.475326984745600\r\n" + 
				"		0.305401579083937 0.694598420916063\r\n" + 
				"		0.999999862975337 0.000000137024663\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		175 0 0 \r\n" + 
				"\r\n" + 
				"Model 93\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.699543364276711 0.300456635723289\r\n" + 
				"		0.809328938506887 0.190671061493113\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12633 0 0 \r\n" + 
				"\r\n" + 
				"Model 94\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.418791196658938 0.581208803341062\r\n" + 
				"		0.229761088916860 0.770238911083140\r\n" + 
				"		0.856636814332180 0.143363185667819\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 95\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.556089456967947 0.443910543032053\r\n" + 
				"		0.321929755815523 0.678070244184477\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 96\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.718774501810999 0.281225498189002\r\n" + 
				"		0.133818569016012 0.866181430983988\r\n" + 
				"		0.850976204695373 0.149023795304627\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.477054447806428 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20847 0 0 \r\n" + 
				"\r\n" + 
				"Model 97\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.490843299698482 0.509156700301518\r\n" + 
				"		0.716027187167453 0.283972812832547\r\n" + 
				"		0.001105930031673 0.998894069968327\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"Model 98\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.305502160349481 0.694497839650519\r\n" + 
				"		0.169017705314528 0.830982294685472\r\n" + 
				"		0.917969080951597 0.082030919048403\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.062200451008240 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18411 0 0 \r\n" + 
				"\r\n" + 
				"Model 99\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.549971432228848 0.450028567771153\r\n" + 
				"		0.277414483301516 0.722585516698484\r\n" + 
				"		0.922036728845742 0.077963271154258\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5358 0 0 \r\n" + 
				"\r\n" + 
				"Model 100\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.656206558873745 0.343793441126255\r\n" + 
				"		0.843054120750356 0.156945879249644\r\n" + 
				"		0.100324203500284 0.899675796499716\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9166 0 0 \r\n" + 
				"\r\n" + 
				"TrainedWeights\r\n" + 
				"1.245648223943384 1.223775431622115 1.222186982632712 1.158726240726619 1.087369321422182 1.067257056198431 0.959158544707642 0.959609724598635 1.014835602855130 0.887007093325497 0.976570860718524 0.877661244257584 0.721785291725805 0.943413247078111 0.748645573099684 0.619287081743907 0.904641339801279 0.662917338339767 0.747817773801094 0.727012336263182 1.003742447494120 0.783120279000854 0.699922019729529 1.047161722955060 0.747883925006876 0.825794072042966 0.689077855925928 0.654086897654285 0.708438000987419 1.004476756552310 0.919791742519002 0.499757674864298 0.811591908839349 0.800831018423683 0.799543006414878 0.891433426093862 0.774616142474322 1.018235571851808 0.925810391115034 0.713755416297818 0.666553325223812 0.871508615661362 0.692567064815188 0.655098933179104 0.804834173322008 0.822953043868962 0.960040119267688 0.853591311563499 0.808027105735393 0.631901770119442 0.810732331561491 0.737607639425332 0.829039402097100 0.628848077815185 0.931602082729638 0.729133317036259 0.672220937981188 0.846801529629248 0.742433583626681 0.841495584873697 0.691682980938598 0.798471957045667 0.663906257063443 0.891668528604499 0.756888006594742 0.692948923685173 0.750382290422948 0.695153210753856 0.698436298613677 0.954090748213443 0.612598416805916 0.641012767787533 0.911167577994822 0.709196742177506 0.699126613527358 0.846912629956075 0.720199821834248 0.738368304501964 0.806963570027691 0.768446716435494 0.943777757562946 0.754965273145431 0.720513636202178 0.711322983315099 0.611170779504973 0.688090433057680 0.726705182793345 0.875584526277365 0.694702219997896 0.647379833769623 0.866345467100718 0.665505551508767 0.811445660560680 0.681637978387014 0.660184390854638 0.882277219652234 0.709315792888561 0.854992160195638 0.715049653798124 0.896514989650995 ");
		filewriter.close();
		file = new File(workpath + "\\ionclassifier_B_v_Z.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		filewriter = new FileWriter(file);
		filewriter.write("Model 1\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.471861471861471 0.528138528138529\r\n" + 
				"		0.155240736241549 0.844759263758451\r\n" + 
				"		0.873196865695615 0.126803134304386\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.065071730572354 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21726 0 0 \r\n" + 
				"\r\n" + 
				"Model 2\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.528652202537465 0.471347797462534\r\n" + 
				"		0.834166567246956 0.165833432753044\r\n" + 
				"		0.160526880555084 0.839473119444916\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4615 0 0 \r\n" + 
				"\r\n" + 
				"Model 3\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.495190196936761 0.504809803063239\r\n" + 
				"		0.368673138928990 0.631326861071010\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1966 0 0 \r\n" + 
				"\r\n" + 
				"Model 4\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.642084696696732 0.357915303303268\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.702241029714593 0.297758970285407\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.533199557747976 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		23590 0 0 \r\n" + 
				"\r\n" + 
				"Model 5\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.441144900450761 0.558855099549239\r\n" + 
				"		0.352297381926655 0.647702618073345\r\n" + 
				"		0.980072968107080 0.019927031892920\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.171650513700877 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		14777 0 0 \r\n" + 
				"\r\n" + 
				"Model 6\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.595207040234391 0.404792959765609\r\n" + 
				"		0.368936201207304 0.631063798792696\r\n" + 
				"		0.771734790608193 0.228265209391807\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9041 0 0 \r\n" + 
				"\r\n" + 
				"Model 7\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.584112293321930 0.415887706678070\r\n" + 
				"		0.739311197114709 0.260688802885291\r\n" + 
				"		0.281618963475844 0.718381036524156\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.831112145090754 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 8\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.511961179854540 0.488038820145460\r\n" + 
				"		0.374964056693633 0.625035943306367\r\n" + 
				"		0.957088223490448 0.042911776509552\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.109939299542852 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17170 0 0 \r\n" + 
				"\r\n" + 
				"Model 9\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.643146895330921 0.356853104669079\r\n" + 
				"		0.710844205949420 0.289155794050580\r\n" + 
				"		0.086856462699401 0.913143537300599\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.053182197457791 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21851 0 0 \r\n" + 
				"\r\n" + 
				"Model 10\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.450036240587567 0.549963759412433\r\n" + 
				"		0.319948129089836 0.680051870910164\r\n" + 
				"		0.797653075327987 0.202346924672013\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.093985537827855 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18963 0 0 \r\n" + 
				"\r\n" + 
				"Model 11\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.556832571601359 0.443167428398641\r\n" + 
				"		0.173689723948521 0.826310276051479\r\n" + 
				"		0.662825244077405 0.337174755922595\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		424.224495832000060 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 12\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.434147976508827 0.565852023491173\r\n" + 
				"		0.344114242003950 0.655885757996050\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12322 0 0 \r\n" + 
				"\r\n" + 
				"Model 13\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.597614894160923 0.402385105839077\r\n" + 
				"		0.789408901443758 0.210591098556242\r\n" + 
				"		0.332039836621127 0.667960163378873\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5355 0 0 \r\n" + 
				"\r\n" + 
				"Model 14\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.576561157996880 0.423438842003120\r\n" + 
				"		0.444007047331642 0.555992952668358\r\n" + 
				"		0.925734831900621 0.074265168099379\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.860040865843737 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21726 0 0 \r\n" + 
				"\r\n" + 
				"Model 15\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.663789114416811 0.336210885583189\r\n" + 
				"		0.718568065268883 0.281431934731117\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1439 0 0 \r\n" + 
				"\r\n" + 
				"Model 16\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.448492458988035 0.551507541011965\r\n" + 
				"		0.321065146932381 0.678934853067619\r\n" + 
				"		0.829597212468860 0.170402787531140\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7205 0 0 \r\n" + 
				"\r\n" + 
				"Model 17\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.569670596519953 0.430329403480047\r\n" + 
				"		0.782534593004531 0.217465406995469\r\n" + 
				"		0.380770485488060 0.619229514511940\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9166 0 0 \r\n" + 
				"\r\n" + 
				"Model 18\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.596136538900201 0.403863461099799\r\n" + 
				"		0.154397019076399 0.845602980923601\r\n" + 
				"		0.706758999311748 0.293241000688252\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.648899528682360 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25313 0 0 \r\n" + 
				"\r\n" + 
				"Model 19\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.442974224973523 0.557025775026477\r\n" + 
				"		0.276305481456928 0.723694518543072\r\n" + 
				"		0.672092164827577 0.327907835172423\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12502 0 0 \r\n" + 
				"\r\n" + 
				"Model 20\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.469935971838234 0.530064028161766\r\n" + 
				"		0.344147596084037 0.655852403915963\r\n" + 
				"		0.796917002855755 0.203082997144246\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8664 0 0 \r\n" + 
				"\r\n" + 
				"Model 21\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.566764661816888 0.433235338183112\r\n" + 
				"		0.649912443971542 0.350087556028458\r\n" + 
				"		0.042511136500529 0.957488863499471\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.089080587947466 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17300 0 0 \r\n" + 
				"\r\n" + 
				"Model 22\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.414744965775925 0.585255034224075\r\n" + 
				"		0.100397330918027 0.899602669081973\r\n" + 
				"		0.545713127935974 0.454286872064026\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.518643864910564 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		23463 0 0 \r\n" + 
				"\r\n" + 
				"Model 23\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.338572538349171 0.661427461650829\r\n" + 
				"		0.263308076314703 0.736691923685297\r\n" + 
				"		0.833035167022447 0.166964832977553\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.860040865843737 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21726 0 0 \r\n" + 
				"\r\n" + 
				"Model 24\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.529410922971531 0.470589077028469\r\n" + 
				"		0.895609318889473 0.104390681110527\r\n" + 
				"		0.404156573167154 0.595843426832846\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.286394063171923 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18167 0 0 \r\n" + 
				"\r\n" + 
				"Model 25\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.629187340619577 0.370812659380423\r\n" + 
				"		0.702741940624124 0.297258059375876\r\n" + 
				"		0.020749573864947 0.979250426135053\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11889 0 0 \r\n" + 
				"\r\n" + 
				"Model 26\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.432098388205941 0.567901611794059\r\n" + 
				"		0.335821946769424 0.664178053230576\r\n" + 
				"		0.867187598588362 0.132812401411638\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4486 0 0 \r\n" + 
				"\r\n" + 
				"Model 27\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.571841586793800 0.428158413206200\r\n" + 
				"		0.046152076332638 0.953847923667362\r\n" + 
				"		0.646153147513769 0.353846852486231\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.896022723941260 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16215 0 0 \r\n" + 
				"\r\n" + 
				"Model 28\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.422727955471776 0.577272044528224\r\n" + 
				"		0.359152054219838 0.640847945780162\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12322 0 0 \r\n" + 
				"\r\n" + 
				"Model 29\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.573325306586606 0.426674693413395\r\n" + 
				"		0.107917541702846 0.892082458297154\r\n" + 
				"		0.674420219473445 0.325579780526555\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		424.224495832000060 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 30\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.421984900675964 0.578015099324036\r\n" + 
				"		0.530459935323245 0.469540064676755\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		298 0 0 \r\n" + 
				"\r\n" + 
				"Model 31\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.336791842516523 0.663208157483477\r\n" + 
				"		0.286088263308985 0.713911736691015\r\n" + 
				"		0.994139557995752 0.005860442004248\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12445 0 0 \r\n" + 
				"\r\n" + 
				"Model 32\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.547707415221314 0.452292584778686\r\n" + 
				"		0.689062216979338 0.310937783020662\r\n" + 
				"		0.210786613097879 0.789213386902121\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.831112145090754 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 33\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.448435017147551 0.551564982852449\r\n" + 
				"		0.298772253932133 0.701227746067867\r\n" + 
				"		0.774006124714926 0.225993875285074\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.408132733633355 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21726 0 0 \r\n" + 
				"\r\n" + 
				"Model 34\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.539301868933126 0.460698131066874\r\n" + 
				"		0.077280166408251 0.922719833591749\r\n" + 
				"		0.639595365463451 0.360404634536549\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.028873683031447 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		15251 0 0 \r\n" + 
				"\r\n" + 
				"Model 35\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.402997295623898 0.597002704376102\r\n" + 
				"		0.316472112084067 0.683527887915933\r\n" + 
				"		0.886169788576586 0.113830211423414\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.109939299542852 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17170 0 0 \r\n" + 
				"\r\n" + 
				"Model 36\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.563954149058004 0.436045850941996\r\n" + 
				"		0.658486905304215 0.341513094695785\r\n" + 
				"		0.063510869663038 0.936489130336962\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.035057633484684 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		22722 0 0 \r\n" + 
				"\r\n" + 
				"Model 37\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.411088967457154 0.588911032542846\r\n" + 
				"		0.346606215797028 0.653393784202972\r\n" + 
				"		0.993247859309032 0.006752140690969\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4732 0 0 \r\n" + 
				"\r\n" + 
				"Model 38\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.570979639976704 0.429020360023296\r\n" + 
				"		0.643483111702333 0.356516888297667\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		592 0 0 \r\n" + 
				"\r\n" + 
				"Model 39\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.417594563675962 0.582405436324038\r\n" + 
				"		0.353105837145464 0.646894162854536\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12322 0 0 \r\n" + 
				"\r\n" + 
				"Model 40\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.573076136650721 0.426923863349279\r\n" + 
				"		0.108979930513061 0.891020069486939\r\n" + 
				"		0.674277563032022 0.325722436967978\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		424.224495832000060 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 41\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.422150666927839 0.577849333072161\r\n" + 
				"		0.590804151258868 0.409195848741132\r\n" + 
				"		0.147348762419472 0.852651237580528\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4615 0 0 \r\n" + 
				"\r\n" + 
				"Model 42\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.355648047508822 0.644351952491178\r\n" + 
				"		0.292391770237606 0.707608229762394\r\n" + 
				"		0.949992394128910 0.050007605871090\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.466666024514727 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18963 0 0 \r\n" + 
				"\r\n" + 
				"Model 43\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.553572778244458 0.446427221755542\r\n" + 
				"		0.637326793258027 0.362673206741973\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		298 0 0 \r\n" + 
				"\r\n" + 
				"Model 44\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.404075195118528 0.595924804881472\r\n" + 
				"		0.353499354048875 0.646500645951125\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.126601359909085 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		23586 0 0 \r\n" + 
				"\r\n" + 
				"Model 45\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.558020895246039 0.441979104753961\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.616364124651074 0.383635875348926\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.158842594514028 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		22105 0 0 \r\n" + 
				"\r\n" + 
				"Model 46\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.427485616809842 0.572514383190158\r\n" + 
				"		0.258934539473809 0.741065460526191\r\n" + 
				"		0.620847973949807 0.379152026050193\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9041 0 0 \r\n" + 
				"\r\n" + 
				"Model 47\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.430675247887108 0.569324752112892\r\n" + 
				"		0.628300027838274 0.371699972161726\r\n" + 
				"		0.225151698536949 0.774848301463052\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		10778 0 0 \r\n" + 
				"\r\n" + 
				"Model 48\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.412779348687135 0.587220651312865\r\n" + 
				"		0.344584675856665 0.655415324143335\r\n" + 
				"		0.990582364892321 0.009417635107679\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4732 0 0 \r\n" + 
				"\r\n" + 
				"Model 49\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.574080796755415 0.425919203244585\r\n" + 
				"		0.644156736230638 0.355843263769362\r\n" + 
				"		0.000120418133083 0.999879581866917\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1261 0 0 \r\n" + 
				"\r\n" + 
				"Model 50\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.420360105130075 0.579639894869925\r\n" + 
				"		0.341353019643108 0.658646980356892\r\n" + 
				"		0.917978031173422 0.082021968826578\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.042027874121047 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25187 0 0 \r\n" + 
				"\r\n" + 
				"Model 51\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.572220638157375 0.427779361842625\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.632712987548191 0.367287012451809\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		227.641476331999970 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 52\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.428418837985436 0.571581162014564\r\n" + 
				"		0.571738397183557 0.428261602816443\r\n" + 
				"		0.168080553991873 0.831919446008127\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.831112145090754 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 53\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.366454500529603 0.633545499470398\r\n" + 
				"		0.303029513105694 0.696970486894306\r\n" + 
				"		0.990356670775361 0.009643329224639\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3702 0 0 \r\n" + 
				"\r\n" + 
				"Model 54\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.561497045335350 0.438502954664650\r\n" + 
				"		0.629447816999799 0.370552183000201\r\n" + 
				"		0.008002432350349 0.991997567649651\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11889 0 0 \r\n" + 
				"\r\n" + 
				"Model 55\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.420265710030446 0.579734289969554\r\n" + 
				"		0.985876852801175 0.014123147198825\r\n" + 
				"		0.364079241741411 0.635920758258589\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.004696776220827 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18478 0 0 \r\n" + 
				"\r\n" + 
				"Model 56\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.564806803667343 0.435193196332657\r\n" + 
				"		0.653759032474664 0.346240967525336\r\n" + 
				"		0.179435422320983 0.820564577679017\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1259 0 0 \r\n" + 
				"\r\n" + 
				"Model 57\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.441102531419654 0.558897468580346\r\n" + 
				"		0.992120133528368 0.007879866471632\r\n" + 
				"		0.382057316678427 0.617942683321573\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.033586898324823 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21603 0 0 \r\n" + 
				"\r\n" + 
				"Model 58\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.572291638594048 0.427708361405952\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.636367727358570 0.363632272641430\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		227.641476331999970 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 59\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.425190903226710 0.574809096773290\r\n" + 
				"		0.361252229888343 0.638747770111657\r\n" + 
				"		0.987119999689386 0.012880000310614\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.670630556804425 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		22597 0 0 \r\n" + 
				"\r\n" + 
				"Model 60\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.572752584733952 0.427247415266048\r\n" + 
				"		0.098825125547276 0.901174874452724\r\n" + 
				"		0.653750992657666 0.346249007342334\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.032007278929872 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18040 0 0 \r\n" + 
				"\r\n" + 
				"Model 61\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.427919860001933 0.572080139998067\r\n" + 
				"		0.288834536860143 0.711165463139857\r\n" + 
				"		0.746246424447930 0.253753575552070\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.408132733633355 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21726 0 0 \r\n" + 
				"\r\n" + 
				"Model 62\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.518485789300448 0.481514210699552\r\n" + 
				"		0.114185067935615 0.885814932064385\r\n" + 
				"		0.637035760748929 0.362964239251071\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.380112777538191 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16215 0 0 \r\n" + 
				"\r\n" + 
				"Model 63\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.397408138217178 0.602591861782822\r\n" + 
				"		0.330580572450428 0.669419427549572\r\n" + 
				"		0.945754977207871 0.054245022792129\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.171650513700877 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		14777 0 0 \r\n" + 
				"\r\n" + 
				"Model 64\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.563641172561213 0.436358827438787\r\n" + 
				"		0.680249570943488 0.319750429056512\r\n" + 
				"		0.230027847795034 0.769972152204966\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.013958714754303 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21851 0 0 \r\n" + 
				"\r\n" + 
				"Model 65\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.458724432850366 0.541275567149634\r\n" + 
				"		0.393301382679584 0.606698617320416\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12322 0 0 \r\n" + 
				"\r\n" + 
				"Model 66\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.583063348282251 0.416936651717748\r\n" + 
				"		0.059116262816907 0.940883737183093\r\n" + 
				"		0.655942028935724 0.344057971064276\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.432040485948945 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18963 0 0 \r\n" + 
				"\r\n" + 
				"Model 67\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.428504669411026 0.571495330588974\r\n" + 
				"		0.366300566082928 0.633699433917072\r\n" + 
				"		0.998786196084120 0.001213803915880\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12445 0 0 \r\n" + 
				"\r\n" + 
				"Model 68\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.573167985089103 0.426832014910897\r\n" + 
				"		0.687649557637028 0.312350442362972\r\n" + 
				"		0.275943555368127 0.724056444631873\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.831112145090754 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 69\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.482671862261173 0.517328137738827\r\n" + 
				"		0.368791278625192 0.631208721374808\r\n" + 
				"		0.784129514731627 0.215870485268373\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.408132733633355 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21726 0 0 \r\n" + 
				"\r\n" + 
				"Model 70\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.569157609120115 0.430842390879885\r\n" + 
				"		0.093709034025141 0.906290965974859\r\n" + 
				"		0.651165347441451 0.348834652558549\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.032007278929872 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18040 0 0 \r\n" + 
				"\r\n" + 
				"Model 71\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.425346648283725 0.574653351716275\r\n" + 
				"		0.347387954833366 0.652612045166634\r\n" + 
				"		0.933057429080980 0.066942570919020\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.557196017505331 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25187 0 0 \r\n" + 
				"\r\n" + 
				"Model 72\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.575637770811816 0.424362229188184\r\n" + 
				"		0.182512717993514 0.817487282006486\r\n" + 
				"		0.674462305285018 0.325537694714982\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		424.224495832000060 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 73\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.444996786302788 0.555003213697212\r\n" + 
				"		0.360458755796755 0.639541244203245\r\n" + 
				"		0.993461285253870 0.006538714746130\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4732 0 0 \r\n" + 
				"\r\n" + 
				"Model 74\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.595195974997470 0.404804025002530\r\n" + 
				"		0.668333460914495 0.331666539085505\r\n" + 
				"		0.017544210735065 0.982455789264934\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.074830204503022 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		15009 0 0 \r\n" + 
				"\r\n" + 
				"Model 75\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.424868823747391 0.575131176252609\r\n" + 
				"		0.364198896681740 0.635801103318260\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12443 0 0 \r\n" + 
				"\r\n" + 
				"Model 76\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.571152219551389 0.428847780448611\r\n" + 
				"		0.634636216916594 0.365363783083406\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		298 0 0 \r\n" + 
				"\r\n" + 
				"Model 77\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.425480898279544 0.574519101720456\r\n" + 
				"		0.577180693936555 0.422819306063445\r\n" + 
				"		0.173203212399669 0.826796787600331\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4615 0 0 \r\n" + 
				"\r\n" + 
				"Model 78\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.367438690292183 0.632561309707817\r\n" + 
				"		0.300159185947132 0.699840814052868\r\n" + 
				"		0.945866056656271 0.054133943343729\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.466666024514727 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18963 0 0 \r\n" + 
				"\r\n" + 
				"Model 79\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.557650961912266 0.442349038087734\r\n" + 
				"		0.146484076708434 0.853515923291566\r\n" + 
				"		0.646089570048815 0.353910429951185\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		424.224495832000060 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 80\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.430238085620520 0.569761914379480\r\n" + 
				"		0.946301843088880 0.053698156911120\r\n" + 
				"		0.362999469811695 0.637000530188305\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.767316672002158 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17171 0 0 \r\n" + 
				"\r\n" + 
				"Model 81\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.571628839751122 0.428371160248878\r\n" + 
				"		0.645585193255620 0.354414806744380\r\n" + 
				"		0.010638628628604 0.989361371371396\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4913 0 0 \r\n" + 
				"\r\n" + 
				"Model 82\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.417932901562177 0.582067098437823\r\n" + 
				"		0.029022901815221 0.970977098184779\r\n" + 
				"		0.516115287383447 0.483884712616553\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.904116946626317 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24432 0 0 \r\n" + 
				"\r\n" + 
				"Model 83\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.346452905689385 0.653547094310615\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"		0.301160079086580 0.698839920913420\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.987047672221819 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20970 0 0 \r\n" + 
				"\r\n" + 
				"Model 84\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.545110793157066 0.454889206842934\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.607930673260681 0.392069326739319\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.158842594514028 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		22105 0 0 \r\n" + 
				"\r\n" + 
				"Model 85\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.420321697196303 0.579678302803697\r\n" + 
				"		0.308698081341030 0.691301918658970\r\n" + 
				"		0.681785633382899 0.318214366617101\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.408132733633355 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21726 0 0 \r\n" + 
				"\r\n" + 
				"Model 86\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.495348561454072 0.504651438545928\r\n" + 
				"		0.029809160074858 0.970190839925141\r\n" + 
				"		0.586983220769844 0.413016779230156\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.896022723941260 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16215 0 0 \r\n" + 
				"\r\n" + 
				"Model 87\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.384265973397390 0.615734026602610\r\n" + 
				"		0.328287381527015 0.671712618472985\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12322 0 0 \r\n" + 
				"\r\n" + 
				"Model 88\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.559605603937222 0.440394396062778\r\n" + 
				"		0.682565032559854 0.317434967440146\r\n" + 
				"		0.273172551511098 0.726827448488902\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11027 0 0 \r\n" + 
				"\r\n" + 
				"Model 89\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.478025742702909 0.521974257297091\r\n" + 
				"		0.612457447348889 0.387542552651111\r\n" + 
				"		0.207385477568479 0.792614522431521\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.831112145090754 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 90\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.409348479527003 0.590651520472997\r\n" + 
				"		0.327576659664767 0.672423340335233\r\n" + 
				"		0.841741134314678 0.158258865685322\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.109939299542852 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17170 0 0 \r\n" + 
				"\r\n" + 
				"Model 91\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.553851247119632 0.446148752880368\r\n" + 
				"		0.620776909053014 0.379223090946986\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		298 0 0 \r\n" + 
				"\r\n" + 
				"Model 92\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.418531121107623 0.581468878892377\r\n" + 
				"		0.266988103484160 0.733011896515840\r\n" + 
				"		0.633881015749526 0.366118984250474\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		843.440768115999960 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 93\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.443613372807745 0.556386627192255\r\n" + 
				"		0.528225394834572 0.471774605165428\r\n" + 
				"		0.013896766993921 0.986103233006079\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11889 0 0 \r\n" + 
				"\r\n" + 
				"Model 94\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.368492344432957 0.631507655567043\r\n" + 
				"		0.314514514264958 0.685485485735042\r\n" + 
				"		0.999872272635402 0.000127727364598\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5483 0 0 \r\n" + 
				"\r\n" + 
				"Model 95\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.555420152604378 0.444579847395622\r\n" + 
				"		0.620628594237758 0.379371405762242\r\n" + 
				"		0.049606861683497 0.950393138316504\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.089080587947466 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17300 0 0 \r\n" + 
				"\r\n" + 
				"Model 96\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.425854361886281 0.574145638113719\r\n" + 
				"		0.351437812766219 0.648562187233781\r\n" + 
				"		0.878010890015380 0.121989109984620\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.860040865843737 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21726 0 0 \r\n" + 
				"\r\n" + 
				"Model 97\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.564084126108446 0.435915873891554\r\n" + 
				"		0.888983558550165 0.111016441449835\r\n" + 
				"		0.459670909083441 0.540329090916559\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.286394063171923 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18167 0 0 \r\n" + 
				"\r\n" + 
				"Model 98\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.636920710714744 0.363079289285256\r\n" + 
				"		0.689106663862604 0.310893336137396\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1439 0 0 \r\n" + 
				"\r\n" + 
				"Model 99\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.446867465161040 0.553132534838960\r\n" + 
				"		0.360308654305233 0.639691345694767\r\n" + 
				"		0.895715091797430 0.104284908202570\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.042027874121047 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25187 0 0 \r\n" + 
				"\r\n" + 
				"Model 100\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.579875804388085 0.420124195611915\r\n" + 
				"		0.074003285311707 0.925996714688293\r\n" + 
				"		0.647195699937422 0.352804300062578\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.590604486446324 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		22351 0 0 \r\n" + 
				"\r\n" + 
				"TrainedWeights\r\n" + 
				"0.896523039025346 0.816474553699205 0.436112503563999 0.491613531037728 0.411192011818675 0.447899145523255 0.502942300128845 0.431246234400295 0.504417119122527 0.452746259666077 0.419492612364261 0.431105708468315 0.519042556245952 0.326603040229226 0.523043020487943 0.464045015646778 0.414188753253098 0.508955573151553 0.428334826258651 0.411901381336478 0.404782715533906 0.309063989137696 0.547759234496629 0.359174633343224 0.503835414661747 0.425938416768709 0.386713782107512 0.368816292099977 0.455642423944514 0.258566919920835 0.507452227134592 0.468917150630177 0.482564240489874 0.400276874080916 0.458192524016361 0.429991933305228 0.393725728107885 0.385305625485259 0.381708636439745 0.455193903810239 0.400969192325790 0.499657248660351 0.388393741317259 0.363519015551675 0.315415747199718 0.388602749419251 0.423978796434974 0.401924448208351 0.383477950555898 0.409866330149458 0.349190049180624 0.340845981350205 0.482304106691992 0.352036376586986 0.348547228912138 0.388517861502377 0.318682610588217 0.360851656604161 0.363934554876828 0.399745567165070 0.476784928228564 0.408133565547799 0.422312225327543 0.431981356492514 0.307564881710790 0.401782138080375 0.353200039557712 0.418357927693052 0.361205473253613 0.397017422576584 0.399924641148169 0.431276222493085 0.392618176506514 0.432334916797241 0.355345856263489 0.356773234294333 0.356164093503961 0.485893254112359 0.383352150293989 0.360107611852330 0.389876875581680 0.219039103779696 0.468166983708047 0.306104953884064 0.396452506780016 0.309534533820095 0.421439314155427 0.413828001202097 0.359181382456749 0.422105469394681 0.335351979066238 0.404898990384183 0.210140977536382 0.448289926786814 0.327833593268424 0.379158947036506 0.255680381977759 0.454146116131974 0.379375586093395 0.376748324070793 ");
		filewriter.close();
		file = new File(workpath + "\\ionclassifier_C_v_B.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		filewriter = new FileWriter(file);
		filewriter.write("Model 1\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.500000000000000 0.500000000000000\r\n" + 
				"		0.111111111111111 0.888888888888889\r\n" + 
				"		0.937500000000000 0.062500000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 2\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.575268817204301 0.424731182795699\r\n" + 
				"		0.803504380475595 0.196495619524405\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 3\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.334723670490093 0.665276329509907\r\n" + 
				"		0.153621650305121 0.846378349694879\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 4\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.621679316888046 0.378320683111954\r\n" + 
				"		0.855492326363401 0.144507673636599\r\n" + 
				"		0.066831697824302 0.933168302175698\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5358 0 0 \r\n" + 
				"\r\n" + 
				"Model 5\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.424095968979772 0.575904031020228\r\n" + 
				"		0.075424889634794 0.924575110365206\r\n" + 
				"		0.715379158040976 0.284620841959024\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 6\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.331047177662260 0.668952822337740\r\n" + 
				"		0.224977057785277 0.775022942214723\r\n" + 
				"		0.973094615511565 0.026905384488435\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.038904179750432 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24315 0 0 \r\n" + 
				"\r\n" + 
				"Model 7\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.576209240315136 0.423790759684864\r\n" + 
				"		0.750430571187071 0.249569428812929\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.169087484831897 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16568 0 0 \r\n" + 
				"\r\n" + 
				"Model 8\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.356401450463600 0.643598549536400\r\n" + 
				"		0.128215736692362 0.871784263307638\r\n" + 
				"		0.754792580968519 0.245207419031481\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9166 0 0 \r\n" + 
				"\r\n" + 
				"Model 9\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.404372300387250 0.595627699612751\r\n" + 
				"		0.252512617113323 0.747487382886677\r\n" + 
				"		0.993611568885434 0.006388431114566\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7271 0 0 \r\n" + 
				"\r\n" + 
				"Model 10\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.624344069956520 0.375655930043480\r\n" + 
				"		0.773084504446055 0.226915495553945\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 11\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.382215865180774 0.617784134819226\r\n" + 
				"		0.692434266973433 0.307565733026567\r\n" + 
				"		0.133114099451809 0.866885900548191\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7021 0 0 \r\n" + 
				"\r\n" + 
				"Model 12\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.370491734526736 0.629508265473264\r\n" + 
				"		0.166386829139185 0.833613170860815\r\n" + 
				"		0.826420346627975 0.173579653372025\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6278 0 0 \r\n" + 
				"\r\n" + 
				"Model 13\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.494519787660045 0.505480212339955\r\n" + 
				"		0.309257781543160 0.690742218456840\r\n" + 
				"		0.960315059309230 0.039684940690770\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4734 0 0 \r\n" + 
				"\r\n" + 
				"Model 14\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.653753014394444 0.346246985605556\r\n" + 
				"		0.790772728221415 0.209227271778585\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.010176941697072 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17918 0 0 \r\n" + 
				"\r\n" + 
				"Model 15\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.395243228254368 0.604756771745632\r\n" + 
				"		0.250254654180792 0.749745345819208\r\n" + 
				"		0.979900844754034 0.020099155245966\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.521800304330140 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 16\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.612625474347952 0.387374525652048\r\n" + 
				"		0.732259355082004 0.267740644917996\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000133858416340 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16218 0 0 \r\n" + 
				"\r\n" + 
				"Model 17\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.394731966802530 0.605268033197470\r\n" + 
				"		0.234188837226924 0.765811162773076\r\n" + 
				"		0.783873433026633 0.216126566973367\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5482 0 0 \r\n" + 
				"\r\n" + 
				"Model 18\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.510578886115735 0.489421113884265\r\n" + 
				"		0.702288372513016 0.297711627486984\r\n" + 
				"		0.142053668126210 0.857946331873790\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 19\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.405144311767500 0.594855688232500\r\n" + 
				"		0.248649375262490 0.751350624737509\r\n" + 
				"		0.915688294991476 0.084311705008524\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1320 0 0 \r\n" + 
				"\r\n" + 
				"Model 20\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.588909741513827 0.411090258486173\r\n" + 
				"		0.689755522172091 0.310244477827909\r\n" + 
				"		0.020463363354844 0.979536636645156\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3532 0 0 \r\n" + 
				"\r\n" + 
				"Model 21\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.405163865574830 0.594836134425170\r\n" + 
				"		0.204502008042171 0.795497991957829\r\n" + 
				"		0.798531115041057 0.201468884958943\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 22\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.502093115975477 0.497906884024523\r\n" + 
				"		0.324801326309821 0.675198673690179\r\n" + 
				"		0.876327673806738 0.123672326193262\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4485 0 0 \r\n" + 
				"\r\n" + 
				"Model 23\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.613967319939513 0.386032680060487\r\n" + 
				"		0.724619792222844 0.275380207777156\r\n" + 
				"		0.049940222860677 0.950059777139322\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3533 0 0 \r\n" + 
				"\r\n" + 
				"Model 24\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.414881146927913 0.585118853072087\r\n" + 
				"		0.260639393260174 0.739360606739826\r\n" + 
				"		0.912555617700638 0.087444382299362\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6100 0 0 \r\n" + 
				"\r\n" + 
				"Model 25\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.591249731139475 0.408750268860525\r\n" + 
				"		0.732682183404339 0.267317816595662\r\n" + 
				"		0.053582007851237 0.946417992148763\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6215 0 0 \r\n" + 
				"\r\n" + 
				"Model 26\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.398237263898058 0.601762736101942\r\n" + 
				"		0.277877075220752 0.722122924779248\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 27\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.608450803447625 0.391549196552375\r\n" + 
				"		0.260832190795359 0.739167809204641\r\n" + 
				"		0.819307307863445 0.180692692136555\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 28\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.556573753230811 0.443426246769189\r\n" + 
				"		0.172424050882919 0.827575949117081\r\n" + 
				"		0.724275669228960 0.275724330771040\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		306.664791431999900 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 29\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.440822930800431 0.559177069199570\r\n" + 
				"		0.618716395176571 0.381283604823429\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.169087484831897 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16568 0 0 \r\n" + 
				"\r\n" + 
				"Model 30\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.302620364993975 0.697379635006025\r\n" + 
				"		0.203656569939848 0.796343430060152\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6275 0 0 \r\n" + 
				"\r\n" + 
				"Model 31\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.575623682099814 0.424376317900187\r\n" + 
				"		0.344194259167096 0.655805740832905\r\n" + 
				"		0.868325722922274 0.131674277077727\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6278 0 0 \r\n" + 
				"\r\n" + 
				"Model 32\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.639611150130213 0.360388849869787\r\n" + 
				"		0.826445235623771 0.173554764376229\r\n" + 
				"		0.256574413858530 0.743425586141470\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8033 0 0 \r\n" + 
				"\r\n" + 
				"Model 33\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.557005804441124 0.442994195558876\r\n" + 
				"		0.344525467564513 0.655474532435487\r\n" + 
				"		0.875215427336347 0.124784572663653\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9166 0 0 \r\n" + 
				"\r\n" + 
				"Model 34\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.638297244043484 0.361702755956516\r\n" + 
				"		0.760337084341929 0.239662915658071\r\n" + 
				"		0.086954197986267 0.913045802013733\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 35\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.432174853842210 0.567825146157790\r\n" + 
				"		0.277262119458616 0.722737880541384\r\n" + 
				"		0.981756151119364 0.018243848880636\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7205 0 0 \r\n" + 
				"\r\n" + 
				"Model 36\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.629334467408269 0.370665532591731\r\n" + 
				"		0.000037416649455 0.999962583350545\r\n" + 
				"		0.734398100096775 0.265601899903225\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.307479690930841 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24193 0 0 \r\n" + 
				"\r\n" + 
				"Model 37\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.407401515964138 0.592598484035862\r\n" + 
				"		0.990013389344839 0.009986610655161\r\n" + 
				"		0.294433531975601 0.705566468024399\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.013115054066300 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16333 0 0 \r\n" + 
				"\r\n" + 
				"Model 38\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.603672728028909 0.396327271971091\r\n" + 
				"		0.718288977974675 0.281711022025325\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 39\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.395466567600524 0.604533432399476\r\n" + 
				"		0.285265976857403 0.714734023142597\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 40\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.601608344648690 0.398391655351310\r\n" + 
				"		0.690169042430223 0.309830957569777\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000138200004428 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 41\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.412102428382355 0.587897571617645\r\n" + 
				"		0.167497880687729 0.832502119312271\r\n" + 
				"		0.680023968941913 0.319976031058087\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 42\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.395801651587024 0.604198348412976\r\n" + 
				"		0.655220128747890 0.344779871252110\r\n" + 
				"		0.134623378436613 0.865376621563387\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7021 0 0 \r\n" + 
				"\r\n" + 
				"Model 43\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.356003251650727 0.643996748349273\r\n" + 
				"		0.241327258202083 0.758672741797917\r\n" + 
				"		0.990925922204166 0.009074077795834\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.001890699977649 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24315 0 0 \r\n" + 
				"\r\n" + 
				"Model 44\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.592065675970993 0.407934324029007\r\n" + 
				"		0.387657910703715 0.612342089296285\r\n" + 
				"		0.922030126252124 0.077969873747876\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000428602397294 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 45\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.685909465449696 0.314090534550304\r\n" + 
				"		0.773891626859988 0.226108373140012\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 46\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.428909250085484 0.571090749914515\r\n" + 
				"		0.677050281969630 0.322949718030370\r\n" + 
				"		0.110754198468970 0.889245801531030\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8792 0 0 \r\n" + 
				"\r\n" + 
				"Model 47\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.352504582280069 0.647495417719931\r\n" + 
				"		0.193249526730837 0.806750473269163\r\n" + 
				"		0.858394767169558 0.141605232830442\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6278 0 0 \r\n" + 
				"\r\n" + 
				"Model 48\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.531736758759011 0.468263241240989\r\n" + 
				"		0.336461085978757 0.663538914021243\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		103 0 0 \r\n" + 
				"\r\n" + 
				"Model 49\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.692965278144023 0.307034721855977\r\n" + 
				"		0.782921318214317 0.217078681785683\r\n" + 
				"		0.001450633105368 0.998549366894632\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8103 0 0 \r\n" + 
				"\r\n" + 
				"Model 50\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.429282743461695 0.570717256538305\r\n" + 
				"		0.304456291735937 0.695543708264063\r\n" + 
				"		0.922656262536362 0.077343737463638\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1320 0 0 \r\n" + 
				"\r\n" + 
				"Model 51\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.595445803336917 0.404554196663083\r\n" + 
				"		0.759734374018844 0.240265625981156\r\n" + 
				"		0.218895139882198 0.781104860117802\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8792 0 0 \r\n" + 
				"\r\n" + 
				"Model 52\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.487383883108304 0.512616116891696\r\n" + 
				"		0.290032932125519 0.709967067874481\r\n" + 
				"		0.857831925169692 0.142168074830309\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4485 0 0 \r\n" + 
				"\r\n" + 
				"Model 53\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.592274113350955 0.407725886649045\r\n" + 
				"		0.704940307903035 0.295059692096965\r\n" + 
				"		0.016329349205472 0.983670650794528\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3411 0 0 \r\n" + 
				"\r\n" + 
				"Model 54\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.398138228905813 0.601861771094187\r\n" + 
				"		0.989648609023327 0.010351390976673\r\n" + 
				"		0.292191986502480 0.707808013497520\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.100017637223774 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		23712 0 0 \r\n" + 
				"\r\n" + 
				"Model 55\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.596985335240106 0.403014664759894\r\n" + 
				"		0.721173342284653 0.278826657715347\r\n" + 
				"		0.040740118027942 0.959259881972058\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.113588508071069 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17663 0 0 \r\n" + 
				"\r\n" + 
				"Model 56\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.401309843234604 0.598690156765396\r\n" + 
				"		0.292387515595984 0.707612484404016\r\n" + 
				"		0.981806807715994 0.018193192284006\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9167 0 0 \r\n" + 
				"\r\n" + 
				"Model 57\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.597512634812451 0.402487365187549\r\n" + 
				"		0.293959742089455 0.706040257910545\r\n" + 
				"		0.878551184947026 0.121448815052974\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 58\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.632414095461281 0.367585904538719\r\n" + 
				"		0.761747994300435 0.238252005699565\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 59\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.394174940738353 0.605825059261647\r\n" + 
				"		0.274095789984874 0.725904210015126\r\n" + 
				"		0.883466107961641 0.116533892038359\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7205 0 0 \r\n" + 
				"\r\n" + 
				"Model 60\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.567753821923981 0.432246178076019\r\n" + 
				"		0.668204822062936 0.331795177937064\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000138200004428 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 61\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.395325780666540 0.604674219333460\r\n" + 
				"		0.290718746186025 0.709281253813975\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 62\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.598040089128650 0.401959910871350\r\n" + 
				"		0.292136255048705 0.707863744951295\r\n" + 
				"		0.776582117666751 0.223417882333249\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 63\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.542789501113531 0.457210498886469\r\n" + 
				"		0.755784343244790 0.244215656755210\r\n" + 
				"		0.219361631998479 0.780638368001521\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8033 0 0 \r\n" + 
				"\r\n" + 
				"Model 64\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.483419120066855 0.516580879933145\r\n" + 
				"		0.279294659611370 0.720705340388630\r\n" + 
				"		0.884434625588601 0.115565374411399\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6278 0 0 \r\n" + 
				"\r\n" + 
				"Model 65\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.605254423597821 0.394745576402179\r\n" + 
				"		0.773980062185591 0.226019937814409\r\n" + 
				"		0.260019246248112 0.739980753751888\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8792 0 0 \r\n" + 
				"\r\n" + 
				"Model 66\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.520719262151050 0.479280737848950\r\n" + 
				"		0.323167299844157 0.676832700155843\r\n" + 
				"		0.979118928343683 0.020881071656317\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.001890699977649 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24315 0 0 \r\n" + 
				"\r\n" + 
				"Model 67\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.678465280461958 0.321534719538042\r\n" + 
				"		0.771604291868542 0.228395708131458\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 68\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.424479319066628 0.575520680933372\r\n" + 
				"		0.324189587764842 0.675810412235158\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 69\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.602496983352575 0.397503016647425\r\n" + 
				"		0.712936731307225 0.287063268692775\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.010176941697072 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17918 0 0 \r\n" + 
				"\r\n" + 
				"Model 70\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.397737561180741 0.602262438819259\r\n" + 
				"		0.261501955333408 0.738498044666592\r\n" + 
				"		0.929414855558040 0.070585144441959\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6100 0 0 \r\n" + 
				"\r\n" + 
				"Model 71\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.589577494543769 0.410422505456231\r\n" + 
				"		0.325979574807592 0.674020425192408\r\n" + 
				"		0.911297291776446 0.088702708223554\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9166 0 0 \r\n" + 
				"\r\n" + 
				"Model 72\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.671629839086618 0.328370160913383\r\n" + 
				"		0.777463202695668 0.222536797304332\r\n" + 
				"		0.087651528393159 0.912348471606841\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 73\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.445625910329817 0.554374089670184\r\n" + 
				"		0.079980033707988 0.920019966292012\r\n" + 
				"		0.690509532433292 0.309490467566708\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		306.664791431999900 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 74\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.337993852312871 0.662006147687129\r\n" + 
				"		0.229568126281463 0.770431873718537\r\n" + 
				"		0.894527947009180 0.105472052990820\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11883 0 0 \r\n" + 
				"\r\n" + 
				"Model 75\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.551159849823242 0.448840150176758\r\n" + 
				"		0.666339930719957 0.333660069280043\r\n" + 
				"		0.014934497071105 0.985065502928895\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3411 0 0 \r\n" + 
				"\r\n" + 
				"Model 76\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.384256296251941 0.615743703748059\r\n" + 
				"		0.232553730285851 0.767446269714149\r\n" + 
				"		0.752340494695822 0.247659505304178\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6278 0 0 \r\n" + 
				"\r\n" + 
				"Model 77\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.491366691415405 0.508633308584595\r\n" + 
				"		0.753044327956743 0.246955672043257\r\n" + 
				"		0.215991767060809 0.784008232939191\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7021 0 0 \r\n" + 
				"\r\n" + 
				"Model 78\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.478282705835524 0.521717294164477\r\n" + 
				"		0.202065616709630 0.797934383290370\r\n" + 
				"		0.684971086708560 0.315028913291440\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8162 0 0 \r\n" + 
				"\r\n" + 
				"Model 79\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.429292371418117 0.570707628581884\r\n" + 
				"		0.283732885787693 0.716267114212307\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 80\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.631291134858727 0.368708865141273\r\n" + 
				"		0.753197238075933 0.246802761924067\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 81\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.397968225795551 0.602031774204449\r\n" + 
				"		0.260273284648428 0.739726715351572\r\n" + 
				"		0.909549136157840 0.090450863842160\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1320 0 0 \r\n" + 
				"\r\n" + 
				"Model 82\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.581559253673722 0.418440746326278\r\n" + 
				"		0.326632662088054 0.673367337911946\r\n" + 
				"		0.843354757920483 0.156645242079517\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 83\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.615565627030390 0.384434372969610\r\n" + 
				"		0.737376344418110 0.262623655581890\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.169087484831897 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16568 0 0 \r\n" + 
				"\r\n" + 
				"Model 84\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.394209047667609 0.605790952332391\r\n" + 
				"		0.294730066334872 0.705269933665127\r\n" + 
				"		0.999998662719372 0.000001337280628\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7271 0 0 \r\n" + 
				"\r\n" + 
				"Model 85\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.594431283193026 0.405568716806974\r\n" + 
				"		0.000001427869104 0.999998572130896\r\n" + 
				"		0.684968231833431 0.315031768166569\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.307479690930841 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24193 0 0 \r\n" + 
				"\r\n" + 
				"Model 86\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.409045567919579 0.590954432080422\r\n" + 
				"		0.289490598770410 0.710509401229590\r\n" + 
				"		0.952745810396818 0.047254189603182\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.038904179750432 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24315 0 0 \r\n" + 
				"\r\n" + 
				"Model 87\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.596532932480273 0.403467067519727\r\n" + 
				"		0.413850794105448 0.586149205894552\r\n" + 
				"		0.954675242657444 0.045324757342556\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.521800304330140 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 88\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.700438734103978 0.299561265896022\r\n" + 
				"		0.798559770907372 0.201440229092628\r\n" + 
				"		0.080789690047883 0.919210309952117\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3532 0 0 \r\n" + 
				"\r\n" + 
				"Model 89\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.452771585789522 0.547228414210478\r\n" + 
				"		0.278032651956687 0.721967348043313\r\n" + 
				"		0.807924738697106 0.192075261302894\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9166 0 0 \r\n" + 
				"\r\n" + 
				"Model 90\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.550704352295973 0.449295647704027\r\n" + 
				"		0.738772186485707 0.261227813514293\r\n" + 
				"		0.201871700711335 0.798128299288665\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8033 0 0 \r\n" + 
				"\r\n" + 
				"Model 91\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.463015880708006 0.536984119291994\r\n" + 
				"		0.339860611851384 0.660139388148616\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19826 0 0 \r\n" + 
				"\r\n" + 
				"Model 92\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.628920696028007 0.371079303971993\r\n" + 
				"		0.732744873433440 0.267255126566560\r\n" + 
				"		0.000033169043064 0.999966830956936\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8032 0 0 \r\n" + 
				"\r\n" + 
				"Model 93\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.408074071503502 0.591925928496498\r\n" + 
				"		0.999999782393797 0.000000217606203\r\n" + 
				"		0.286650526674925 0.713349473325075\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.633101550762257 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		14005 0 0 \r\n" + 
				"\r\n" + 
				"Model 94\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.611669460881983 0.388330539118017\r\n" + 
				"		0.690325380907010 0.309674619092990\r\n" + 
				"		0.003540770719176 0.996459229280824\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9477 0 0 \r\n" + 
				"\r\n" + 
				"Model 95\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.422075231740486 0.577924768259514\r\n" + 
				"		0.228202908646201 0.771797091353799\r\n" + 
				"		0.807271251114861 0.192728748885139\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 96\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.523301061802159 0.476698938197841\r\n" + 
				"		0.406333174776708 0.593666825223292\r\n" + 
				"		0.999997803995349 0.000002196004651\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7271 0 0 \r\n" + 
				"\r\n" + 
				"Model 97\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.646221057961536 0.353778942038464\r\n" + 
				"		0.735904720008165 0.264095279991835\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.083853026710830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 98\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.420667736804774 0.579332263195226\r\n" + 
				"		0.316045161182958 0.683954838817042\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.336248068093803 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24315 0 0 \r\n" + 
				"\r\n" + 
				"Model 99\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.604443000438362 0.395556999561638\r\n" + 
				"		0.145233315218571 0.854766684781429\r\n" + 
				"		0.751649516666243 0.248350483333757\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		306.664791431999900 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 100\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.445357676342226 0.554642323657774\r\n" + 
				"		0.318982818350241 0.681017181649759\r\n" + 
				"		0.967609707296479 0.032390292703521\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6100 0 0 \r\n" + 
				"\r\n" + 
				"TrainedWeights\r\n" + 
				"1.167687457908517 0.904822634767565 0.992669806324102 0.989248283547003 0.726948013030770 0.702910841823986 0.719730160755588 0.789907891848670 0.686675610517350 0.747216619078289 0.660028546963755 0.797751412135409 0.596985956122438 0.782348136878452 0.679139131427125 0.621258560617442 0.607228187330386 0.564227710981381 0.662179800343936 0.506017905122140 0.682350203119758 0.522602123468682 0.580718227249454 0.633818913239572 0.624699369830260 0.599756734542382 0.659604377999571 0.564535840191857 0.493116266516114 0.763791468846175 0.548356207336196 0.690734926738470 0.532003402596176 0.656495082262415 0.631941949968220 0.610933450414678 0.554018659695026 0.585266005098937 0.572830499512646 0.497122936710378 0.575603973139120 0.576183996089048 0.675226180337424 0.499352236804431 0.691890087719716 0.604242124717062 0.755183583440500 0.583376129722839 0.717703930284398 0.526634379740926 0.593561167402845 0.580077095596727 0.550758969908595 0.550962564876400 0.589109058425970 0.551796801413476 0.679563187314259 0.700050049761973 0.568021769945009 0.467487407025852 0.555075792924927 0.552661192949087 0.591963109572501 0.621063800371396 0.584097499651852 0.598166458187562 0.690568484459561 0.481994832329194 0.569252872681530 0.625404149024440 0.635395420757509 0.687410000168964 0.640342211203947 0.664473763262800 0.478937860991957 0.584702826575792 0.598895046617182 0.505767668825845 0.615310329254754 0.671986788978358 0.620510671492847 0.568779552266295 0.635051558783898 0.540919328441009 0.488740332159257 0.560498732261245 0.449226777951019 0.741591966502064 0.550140989095027 0.575144509505311 0.481053869899427 0.605878929591786 0.582229454925890 0.485669258988980 0.643602866154710 0.362540598527782 0.598777753413091 0.503159986575938 0.623214339831297 0.514843672043495 ");
		filewriter.close();
		file = new File(workpath + "\\ionclassifier_C_v_O.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		filewriter = new FileWriter(file);
		filewriter.write("Model 1\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.496621621621627 0.503378378378373\r\n" + 
				"		0.688407321068366 0.311592678931634\r\n" + 
				"		0.055695710395184 0.944304289604816\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.748636698366533 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 2\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.349225698898751 0.650774301101249\r\n" + 
				"		0.658884218984493 0.341115781015507\r\n" + 
				"		0.196917039646363 0.803082960353637\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7021 0 0 \r\n" + 
				"\r\n" + 
				"Model 3\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.413731335801283 0.586268664198717\r\n" + 
				"		0.325934392841181 0.674065607158819\r\n" + 
				"		0.950372517055412 0.049627482944588\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"Model 4\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.581563877541464 0.418436122458536\r\n" + 
				"		0.272136873598373 0.727863126401627\r\n" + 
				"		0.727661409744494 0.272338590255506\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1746.889994667350000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25372 0 0 \r\n" + 
				"\r\n" + 
				"Model 5\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.499889104135294 0.500110895864706\r\n" + 
				"		0.363910081358106 0.636089918641894\r\n" + 
				"		0.838107146214980 0.161892853785020\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4485 0 0 \r\n" + 
				"\r\n" + 
				"Model 6\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.597284592752021 0.402715407247979\r\n" + 
				"		0.754731894135758 0.245268105864242\r\n" + 
				"		0.369123603306303 0.630876396693697\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 7\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.571819344525174 0.428180655474826\r\n" + 
				"		0.094743706314215 0.905256293685785\r\n" + 
				"		0.673174897251376 0.326825102748624\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		237.135661432000090 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 8\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.417901896898124 0.582098103101876\r\n" + 
				"		0.503162600476270 0.496837399523730\r\n" + 
				"		0.116135434783197 0.883864565216803\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.009276981737690 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		23218 0 0 \r\n" + 
				"\r\n" + 
				"Model 9\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.365130647967746 0.634869352032254\r\n" + 
				"		0.289759668883399 0.710240331116601\r\n" + 
				"		0.678133705371215 0.321866294628785\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6278 0 0 \r\n" + 
				"\r\n" + 
				"Model 10\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.487950730874064 0.512049269125936\r\n" + 
				"		0.560641302657563 0.439358697342437\r\n" + 
				"		0.077657408446727 0.922342591553273\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.131941791555706 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18411 0 0 \r\n" + 
				"\r\n" + 
				"Model 11\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.402338235469420 0.597661764530580\r\n" + 
				"		0.349687106042183 0.650312893957817\r\n" + 
				"		0.869653479420951 0.130346520579049\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		177 0 0 \r\n" + 
				"\r\n" + 
				"Model 12\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.545317736380055 0.454682263619945\r\n" + 
				"		0.699846905906134 0.300153094093866\r\n" + 
				"		0.384349779546176 0.615650220453824\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3533 0 0 \r\n" + 
				"\r\n" + 
				"Model 13\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.546788979619078 0.453211020380922\r\n" + 
				"		0.606522901447296 0.393477098552704\r\n" + 
				"		0.078522330543138 0.921477669456861\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2107.553116331999700 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 14\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.431241158219853 0.568758841780148\r\n" + 
				"		0.570270884365832 0.429729115634168\r\n" + 
				"		0.256028843418946 0.743971156581054\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8792 0 0 \r\n" + 
				"\r\n" + 
				"Model 15\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.406178396124850 0.593821603875150\r\n" + 
				"		0.365006595084560 0.634993404915440\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.468787372867303 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19585 0 0 \r\n" + 
				"\r\n" + 
				"Model 16\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.549219763656898 0.450780236343103\r\n" + 
				"		0.103288741914963 0.896711258085037\r\n" + 
				"		0.601483000772093 0.398516999227907\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.807235344137393 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		15495 0 0 \r\n" + 
				"\r\n" + 
				"Model 17\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.440371505027863 0.559628494972137\r\n" + 
				"		0.890837838889460 0.109162161110540\r\n" + 
				"		0.394589977529308 0.605410022470692\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.302112162837649 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 18\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.551372394922356 0.448627605077644\r\n" + 
				"		0.122301873852549 0.877698126147451\r\n" + 
				"		0.603129370877268 0.396870629122732\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		237.133116382000050 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 19\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.443256832307855 0.556743167692145\r\n" + 
				"		0.497547649805619 0.502452350194381\r\n" + 
				"		0.062326552483488 0.937673447516512\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.193539255770576 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17663 0 0 \r\n" + 
				"\r\n" + 
				"Model 20\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.500000000000000 0.500000000000000\r\n" + 
				"		0.554321053490984 0.445678946509016\r\n" + 
				"		0.077054335362756 0.922945664637244\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.193539255770576 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17663 0 0 \r\n" + 
				"\r\n" + 
				"Model 21\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.422775843928464 0.577224156071536\r\n" + 
				"		0.376626028386324 0.623373971613676\r\n" + 
				"		0.830343570906995 0.169656429093005\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.001047618089162 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17170 0 0 \r\n" + 
				"\r\n" + 
				"Model 22\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.541264068615045 0.458735931384955\r\n" + 
				"		0.644524213066853 0.355475786933147\r\n" + 
				"		0.346932862781569 0.653067137218430\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000138200004428 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 23\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.495759609363080 0.504240390636920\r\n" + 
				"		0.576050876579664 0.423949123420336\r\n" + 
				"		0.217131243441199 0.782868756558801\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 24\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.423595664161006 0.576404335838994\r\n" + 
				"		0.360740925679846 0.639259074320154\r\n" + 
				"		0.814524895558768 0.185475104441232\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1970 0 0 \r\n" + 
				"\r\n" + 
				"Model 25\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.546838366636868 0.453161633363132\r\n" + 
				"		0.284198416554983 0.715801583445017\r\n" + 
				"		0.619699759307579 0.380300240692421\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.024716995017492 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18040 0 0 \r\n" + 
				"\r\n" + 
				"Model 26\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.464519426153106 0.535480573846894\r\n" + 
				"		0.534293419075000 0.465706580925000\r\n" + 
				"		0.171725752589100 0.828274247410900\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 27\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.405504242821129 0.594495757178870\r\n" + 
				"		0.370635852189154 0.629364147810846\r\n" + 
				"		0.972396178738413 0.027603821261587\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		2986 0 0 \r\n" + 
				"\r\n" + 
				"Model 28\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.541112593737307 0.458887406262693\r\n" + 
				"		0.584866333012779 0.415133666987221\r\n" + 
				"		0.094320020810324 0.905679979189676\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2873.475542003900000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25372 0 0 \r\n" + 
				"\r\n" + 
				"Model 29\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.445044401286844 0.554955598713156\r\n" + 
				"		0.535560281954907 0.464439718045093\r\n" + 
				"		0.243024099744505 0.756975900255495\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		10533 0 0 \r\n" + 
				"\r\n" + 
				"Model 30\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.401091578327452 0.598908421672549\r\n" + 
				"		0.341817584012099 0.658182415987901\r\n" + 
				"		0.794403238139905 0.205596761860095\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.268455720858096 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17047 0 0 \r\n" + 
				"\r\n" + 
				"Model 31\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.535394618527530 0.464605381472470\r\n" + 
				"		0.631647165056103 0.368352834943897\r\n" + 
				"		0.326361762066401 0.673638237933599\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.366690367352846 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 32\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.480207932578808 0.519792067421192\r\n" + 
				"		0.417161570117549 0.582838429882451\r\n" + 
				"		0.867698594813743 0.132301405186257\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12446 0 0 \r\n" + 
				"\r\n" + 
				"Model 33\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.572961985390837 0.427038014609164\r\n" + 
				"		0.176888059131069 0.823111940868931\r\n" + 
				"		0.632260663610586 0.367739336389414\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		237.133116382000050 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 34\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.452030888990563 0.547969111009437\r\n" + 
				"		0.410042888978291 0.589957111021710\r\n" + 
				"		0.939668931422875 0.060331068577126\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11887 0 0 \r\n" + 
				"\r\n" + 
				"Model 35\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.554047377812877 0.445952622187123\r\n" + 
				"		0.600467616871437 0.399532383128563\r\n" + 
				"		0.107282551898980 0.892717448101020\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.193539255770576 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17663 0 0 \r\n" + 
				"\r\n" + 
				"Model 36\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.446669410966689 0.553330589033311\r\n" + 
				"		0.416114648825583 0.583885351174417\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4115 0 0 \r\n" + 
				"\r\n" + 
				"Model 37\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.543200817600786 0.456799182399214\r\n" + 
				"		0.594833881503945 0.405166118496055\r\n" + 
				"		0.228236596571936 0.771763403428064\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.009276981737690 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		23218 0 0 \r\n" + 
				"\r\n" + 
				"Model 38\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.454574819267619 0.545425180732381\r\n" + 
				"		0.409851937407413 0.590148062592587\r\n" + 
				"		0.819597826665032 0.180402173334968\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		10779 0 0 \r\n" + 
				"\r\n" + 
				"Model 39\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.547121994263620 0.452878005736380\r\n" + 
				"		0.649604966656931 0.350395033343069\r\n" + 
				"		0.379188737679410 0.620811262320590\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3883 0 0 \r\n" + 
				"\r\n" + 
				"Model 40\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.514683235188828 0.485316764811172\r\n" + 
				"		0.281910985576773 0.718089014423227\r\n" + 
				"		0.595540514456809 0.404459485543191\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		394.209681282000020 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 41\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.449860298507024 0.550139701492976\r\n" + 
				"		0.404820941960763 0.595179058039237\r\n" + 
				"		0.864071714871789 0.135928285128211\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12142 0 0 \r\n" + 
				"\r\n" + 
				"Model 42\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.550556697392545 0.449443302607455\r\n" + 
				"		0.173555765243823 0.826444234756177\r\n" + 
				"		0.597557103520870 0.402442896479130\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.014930081403989 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16217 0 0 \r\n" + 
				"\r\n" + 
				"Model 43\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.451978098452262 0.548021901547738\r\n" + 
				"		0.914207812045753 0.085792187954247\r\n" + 
				"		0.419378952861891 0.580621047138109\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.531603879839666 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17423 0 0 \r\n" + 
				"\r\n" + 
				"Model 44\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.542862251231275 0.457137748768725\r\n" + 
				"		0.632029944589711 0.367970055410289\r\n" + 
				"		0.361190662641878 0.638809337358122\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.158921909558502 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 45\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.496773042742129 0.503226957257871\r\n" + 
				"		0.431589710540693 0.568410289459307\r\n" + 
				"		0.775885517586254 0.224114482413746\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.068849516923767 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		14529 0 0 \r\n" + 
				"\r\n" + 
				"Model 46\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.566784737644976 0.433215262355025\r\n" + 
				"		0.082605997092715 0.917394002907285\r\n" + 
				"		0.604152461163256 0.395847538836744\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.300251097863849 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17169 0 0 \r\n" + 
				"\r\n" + 
				"Model 47\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.455475513747498 0.544524486252502\r\n" + 
				"		0.426604920253551 0.573395079746449\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.468787372867303 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19585 0 0 \r\n" + 
				"\r\n" + 
				"Model 48\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.542320054551837 0.457679945448163\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.572734813760864 0.427265186239136\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.698558989885411 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21281 0 0 \r\n" + 
				"\r\n" + 
				"Model 49\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.455406238105853 0.544593761894147\r\n" + 
				"		0.429219709259881 0.570780290740119\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.330564021690888 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24315 0 0 \r\n" + 
				"\r\n" + 
				"Model 50\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.538848968165670 0.461151031834330\r\n" + 
				"		0.567351004441409 0.432648995558591\r\n" + 
				"		0.052479446028912 0.947520553971088\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.287340866358337 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		13939 0 0 \r\n" + 
				"\r\n" + 
				"Model 51\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.458956673223700 0.541043326776300\r\n" + 
				"		0.992996540955753 0.007003459044248\r\n" + 
				"		0.433126577547272 0.566873422452728\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.063558690388283 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20329 0 0 \r\n" + 
				"\r\n" + 
				"Model 52\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.538663142515443 0.461336857484557\r\n" + 
				"		0.573791606016246 0.426208393983754\r\n" + 
				"		0.132999442566843 0.867000557433157\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2873.475542003900000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25372 0 0 \r\n" + 
				"\r\n" + 
				"Model 53\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.455302729089529 0.544697270910471\r\n" + 
				"		0.430059421833511 0.569940578166489\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4115 0 0 \r\n" + 
				"\r\n" + 
				"Model 54\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.537599315915760 0.462400684084240\r\n" + 
				"		0.567463449924355 0.432536550075645\r\n" + 
				"		0.040626999355510 0.959373000644490\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3816 0 0 \r\n" + 
				"\r\n" + 
				"Model 55\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.456694108271586 0.543305891728414\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"		0.431353412780401 0.568646587219599\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.817190369347912 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12745 0 0 \r\n" + 
				"\r\n" + 
				"Model 56\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.537902293600121 0.462097706399879\r\n" + 
				"		0.630598939977056 0.369401060022944\r\n" + 
				"		0.383947333883071 0.616052666116929\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000138200004428 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 57\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.507280505734290 0.492719494265710\r\n" + 
				"		0.072491534508974 0.927508465491026\r\n" + 
				"		0.544797076083444 0.455202923916556\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.069214145121904 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		23462 0 0 \r\n" + 
				"\r\n" + 
				"Model 58\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.442734540305768 0.557265459694232\r\n" + 
				"		0.413653277931264 0.586346722068736\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9229 0 0 \r\n" + 
				"\r\n" + 
				"Model 59\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.540863749283106 0.459136250716894\r\n" + 
				"		0.576967595892482 0.423032404107518\r\n" + 
				"		0.120275487325679 0.879724512674321\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2107.553116331999700 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 60\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.454043757259326 0.545956242740674\r\n" + 
				"		0.427033677817483 0.572966322182517\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9103 0 0 \r\n" + 
				"\r\n" + 
				"Model 61\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.539741204519549 0.460258795480451\r\n" + 
				"		0.612428948274304 0.387571051725696\r\n" + 
				"		0.343749767703482 0.656250232296518\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		10533 0 0 \r\n" + 
				"\r\n" + 
				"Model 62\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.481564981637464 0.518435018362536\r\n" + 
				"		0.203931660840684 0.796068339159316\r\n" + 
				"		0.546019158321459 0.453980841678541\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		237.133116382000050 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 63\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.420779277281839 0.579220722718162\r\n" + 
				"		0.390672296215105 0.609327703784895\r\n" + 
				"		0.956753650617132 0.043246349382868\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.001047618089162 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18963 0 0 \r\n" + 
				"\r\n" + 
				"Model 64\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.537436111285047 0.462563888714953\r\n" + 
				"		0.507999333735405 0.492000666264595\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.468787372867303 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19585 0 0 \r\n" + 
				"\r\n" + 
				"Model 65\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.500000000000000 0.500000000000000\r\n" + 
				"		0.470527919147615 0.529472080852385\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.468787372867303 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19585 0 0 \r\n" + 
				"\r\n" + 
				"Model 66\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.550087130029423 0.449912869970577\r\n" + 
				"		0.007760460959749 0.992239539040251\r\n" + 
				"		0.574859467990756 0.425140532009244\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.582900255104155 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24193 0 0 \r\n" + 
				"\r\n" + 
				"Model 67\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.463876193946491 0.536123806053510\r\n" + 
				"		0.438325216518625 0.561674783481375\r\n" + 
				"		0.988246264090713 0.011753735909286\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7640 0 0 \r\n" + 
				"\r\n" + 
				"Model 68\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.538829320389726 0.461170679610274\r\n" + 
				"		0.306643610305747 0.693356389694254\r\n" + 
				"		0.600025510888238 0.399974489111762\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.024716995017492 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18040 0 0 \r\n" + 
				"\r\n" + 
				"Model 69\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.467319426183886 0.532680573816114\r\n" + 
				"		0.436835959227096 0.563164040772904\r\n" + 
				"		0.926947838157903 0.073052161842097\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11887 0 0 \r\n" + 
				"\r\n" + 
				"Model 70\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.543725187365592 0.456274812634409\r\n" + 
				"		0.581140390164681 0.418859609835319\r\n" + 
				"		0.138555497737272 0.861444502262728\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2107.553116331999700 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 71\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.454618732472332 0.545381267527667\r\n" + 
				"		0.562162631992282 0.437837368007718\r\n" + 
				"		0.295952981078405 0.704047018921595\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8792 0 0 \r\n" + 
				"\r\n" + 
				"Model 72\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.427536081174239 0.572463918825761\r\n" + 
				"		0.398218442890966 0.601781557109035\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.331696353536559 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19390 0 0 \r\n" + 
				"\r\n" + 
				"Model 73\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.539214010013426 0.460785989986574\r\n" + 
				"		0.079766956949243 0.920233043050757\r\n" + 
				"		0.572576225909689 0.427423774090311\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.340973036499700 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24431 0 0 \r\n" + 
				"\r\n" + 
				"Model 74\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.454431521190160 0.545568478809840\r\n" + 
				"		0.410612898532715 0.589387101467285\r\n" + 
				"		0.827641675786144 0.172358324213856\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.168142846380299 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		23463 0 0 \r\n" + 
				"\r\n" + 
				"Model 75\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.547283768807417 0.452716231192583\r\n" + 
				"		0.623433929958914 0.376566070041086\r\n" + 
				"		0.368379095462688 0.631620904537312\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.050655475665548 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17918 0 0 \r\n" + 
				"\r\n" + 
				"Model 76\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.496338862593501 0.503661137406499\r\n" + 
				"		0.327318097684468 0.672681902315532\r\n" + 
				"		0.604375386857983 0.395624613142017\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2299.168102829100500 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25372 0 0 \r\n" + 
				"\r\n" + 
				"Model 77\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.465105795277113 0.534894204722887\r\n" + 
				"		0.512084310333993 0.487915689666007\r\n" + 
				"		0.075385176316518 0.924614823683482\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2873.475542003900000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25372 0 0 \r\n" + 
				"\r\n" + 
				"Model 78\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.419767945730059 0.580232054269941\r\n" + 
				"		0.389468945552837 0.610531054447163\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.468787372867303 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19585 0 0 \r\n" + 
				"\r\n" + 
				"Model 79\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.539395531847141 0.460604468152859\r\n" + 
				"		0.500705604827609 0.499294395172392\r\n" + 
				"		0.943839601504073 0.056160398495927\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		60 0 0 \r\n" + 
				"\r\n" + 
				"Model 80\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.500000000000000 0.500000000000000\r\n" + 
				"		0.461305770541627 0.538694229458373\r\n" + 
				"		0.934858596800668 0.065141403199332\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		60 0 0 \r\n" + 
				"\r\n" + 
				"Model 81\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.560677235567052 0.439322764432949\r\n" + 
				"		0.597821075750824 0.402178924249176\r\n" + 
				"		0.155856297021063 0.844143702978937\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2107.553116331999700 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 82\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.459818661745134 0.540181338254866\r\n" + 
				"		0.427947342456704 0.572052657543296\r\n" + 
				"		0.904433457609338 0.095566542390662\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4612 0 0 \r\n" + 
				"\r\n" + 
				"Model 83\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.543020312539781 0.456979687460219\r\n" + 
				"		0.570679449641574 0.429320550358426\r\n" + 
				"		0.044841802693127 0.955158197306873\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.287340866358337 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		13939 0 0 \r\n" + 
				"\r\n" + 
				"Model 84\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.460370358202270 0.539629641797731\r\n" + 
				"		0.436721109084812 0.563278890915188\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.331696353536559 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19390 0 0 \r\n" + 
				"\r\n" + 
				"Model 85\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.536093464711466 0.463906535288534\r\n" + 
				"		0.069869434813567 0.930130565186433\r\n" + 
				"		0.565041995942668 0.434958004057332\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.524864603375965 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17174 0 0 \r\n" + 
				"\r\n" + 
				"Model 86\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.458571677834949 0.541428322165051\r\n" + 
				"		0.511626598755728 0.488373401244272\r\n" + 
				"		0.213435832468088 0.786564167531912\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9911 0 0 \r\n" + 
				"\r\n" + 
				"Model 87\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.418375008503017 0.581624991496983\r\n" + 
				"		0.390989856959861 0.609010143040139\r\n" + 
				"		0.905741937321900 0.094258062678100\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6899 0 0 \r\n" + 
				"\r\n" + 
				"Model 88\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.531878919144691 0.468121080855309\r\n" + 
				"		0.581094085034143 0.418905914965857\r\n" + 
				"		0.244947169842777 0.755052830157223\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12141 0 0 \r\n" + 
				"\r\n" + 
				"Model 89\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.454450398359904 0.545549601640096\r\n" + 
				"		0.416708100207069 0.583291899792931\r\n" + 
				"		0.798550961016551 0.201449038983449\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.001047618089162 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17170 0 0 \r\n" + 
				"\r\n" + 
				"Model 90\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.540101359475817 0.459898640524183\r\n" + 
				"		0.573733866204078 0.426266133795922\r\n" + 
				"		0.166903619745037 0.833096380254963\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2873.475542003900000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25372 0 0 \r\n" + 
				"\r\n" + 
				"Model 91\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.459183376643518 0.540816623356482\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"		0.435376659462427 0.564623340537573\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.817190369347912 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12745 0 0 \r\n" + 
				"\r\n" + 
				"Model 92\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.536162350440035 0.463837649559965\r\n" + 
				"		0.563811052558624 0.436188947441376\r\n" + 
				"		0.084740805279353 0.915259194720647\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.079420083176514 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17046 0 0 \r\n" + 
				"\r\n" + 
				"Model 93\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.460662021469989 0.539337978530012\r\n" + 
				"		0.432854266292640 0.567145733707360\r\n" + 
				"		0.918744665118716 0.081255334881284\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4184 0 0 \r\n" + 
				"\r\n" + 
				"Model 94\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.539133273668920 0.460866726331080\r\n" + 
				"		0.647294193819280 0.352705806180720\r\n" + 
				"		0.422267680709849 0.577732319290151\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8917 0 0 \r\n" + 
				"\r\n" + 
				"Model 95\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.536628257892118 0.463371742107882\r\n" + 
				"		0.481260566921423 0.518739433078577\r\n" + 
				"		0.799641487741186 0.200358512258814\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5485 0 0 \r\n" + 
				"\r\n" + 
				"Model 96\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.582211817744374 0.417788182255626\r\n" + 
				"		0.129106783686546 0.870893216313454\r\n" + 
				"		0.610082586318620 0.389917413681380\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.821781934482834 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21603 0 0 \r\n" + 
				"\r\n" + 
				"Model 97\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.469620818105947 0.530379181894053\r\n" + 
				"		0.846465591092346 0.153534408907654\r\n" + 
				"		0.433088220630685 0.566911779369315\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.359096873271514 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		15372 0 0 \r\n" + 
				"\r\n" + 
				"Model 98\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.546609771171674 0.453390228828326\r\n" + 
				"		0.035528700815749 0.964471299184251\r\n" + 
				"		0.572166759256088 0.427833240743912\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.473604235189419 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24193 0 0 \r\n" + 
				"\r\n" + 
				"Model 99\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.463198115301269 0.536801884698731\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"		0.438052942015336 0.561947057984664\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.817190369347912 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12745 0 0 \r\n" + 
				"\r\n" + 
				"Model 100\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.538471876443116 0.461528123556884\r\n" + 
				"		0.564216161977177 0.435783838022823\r\n" + 
				"		0.053406844316834 0.946593155683166\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		706 0 0 \r\n" + 
				"\r\n" + 
				"TrainedWeights\r\n" + 
				"0.592858182735866 0.564193856613612 0.454791382118458 0.491558110889917 0.409489678186893 0.433594835797965 0.457057153308096 0.175850249889372 0.433232154233593 0.234355172058411 0.359809336854695 0.328547952593293 0.292363713897153 0.303203785837091 0.328663674624918 0.271379549837324 0.269849231610452 0.271875048403487 0.113977337669356 0.194987728701201 0.297312990264682 0.304008874570549 0.249696303599688 0.339545025831352 0.288920250898542 0.183777984344971 0.307851844674470 0.230984036218246 0.211226745449907 0.367777084245849 0.298318237511585 0.250513458999577 0.325228282337506 0.239860026493597 0.261769982175927 0.214554028285031 0.244250749703714 0.234594974907701 0.284847210744054 0.259972529616164 0.248065626858456 0.250999876239310 0.208150183435070 0.275272241419238 0.218806800401173 0.258819603808938 0.192077300304762 0.193218093834015 0.182958958206864 0.178669782125254 0.174825591626082 0.196819864653528 0.179892509378539 0.181319575558155 0.177581567850128 0.255694766674051 0.151543383094473 0.217072125184366 0.204612592909159 0.188391613909678 0.253886440274891 0.188464081171546 0.261406958685580 0.075012602518597 0.111789648192211 0.188380583983476 0.164455886515975 0.243699030395560 0.173294724522589 0.212829734061432 0.243673737146966 0.247284102242831 0.194645285393041 0.232967794084612 0.257287323813739 0.268278290876457 0.113409429179474 0.265806718362185 0.078954719524011 0.143098844917868 0.241641174733662 0.190854082539225 0.183849973767106 0.164702536618977 0.174521772223177 0.121685572252796 0.254978663763172 0.216444515868101 0.212268997907300 0.192700862327546 0.167510407640731 0.169801879207924 0.176341235720383 0.231780668033750 0.136011339604465 0.255830130228359 0.185328243476933 0.183740110485861 0.164566487106706 0.168553453071893 ");
		filewriter.close();
		file = new File(workpath + "\\ionclassifier_C_v_Y.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		filewriter = new FileWriter(file);
		filewriter.write("Model 1\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.467336683417086 0.532663316582914\r\n" + 
				"		0.271366620940290 0.728633379059710\r\n" + 
				"		0.857930853725369 0.142069146274631\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.065071730572354 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20583 0 0 \r\n" + 
				"\r\n" + 
				"Model 2\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.581670667727552 0.418329332272448\r\n" + 
				"		0.804846811870547 0.195153188129453\r\n" + 
				"		0.178580420076906 0.821419579923094\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3533 0 0 \r\n" + 
				"\r\n" + 
				"Model 3\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.487612639595715 0.512387360404285\r\n" + 
				"		0.355820228255425 0.644179771744575\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.089298681213060 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20582 0 0 \r\n" + 
				"\r\n" + 
				"Model 4\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.642675101919921 0.357324898080079\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.737454931096179 0.262545068903821\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		245.652181328527460 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 5\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.416673227719978 0.583326772280022\r\n" + 
				"		0.296133484710949 0.703866515289052\r\n" + 
				"		0.903004233203672 0.096995766796328\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.109939299542852 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16096 0 0 \r\n" + 
				"\r\n" + 
				"Model 6\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.583087670829174 0.416912329170826\r\n" + 
				"		0.762842148551358 0.237157851448642\r\n" + 
				"		0.267657012964465 0.732342987035535\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.806906408898732 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 7\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.518895919006452 0.481104080993548\r\n" + 
				"		0.360057943724668 0.639942056275332\r\n" + 
				"		0.860175227840518 0.139824772159482\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.131869035505466 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 8\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.615882582217741 0.384117417782260\r\n" + 
				"		0.199310552740859 0.800689447259141\r\n" + 
				"		0.754393002085072 0.245606997914928\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		441.232961332000060 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 9\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.475819780884119 0.524180219115881\r\n" + 
				"		0.350953314590546 0.649046685409454\r\n" + 
				"		0.958322106966237 0.041677893033764\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11680 0 0 \r\n" + 
				"\r\n" + 
				"Model 10\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.623324563422894 0.376675436577106\r\n" + 
				"		0.693603086364081 0.306396913635919\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 11\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.430087589328634 0.569912410671366\r\n" + 
				"		0.361451573293047 0.638548426706953\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		830 0 0 \r\n" + 
				"\r\n" + 
				"Model 12\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.579338330039838 0.420661669960162\r\n" + 
				"		0.696370897711251 0.303629102288749\r\n" + 
				"		0.204365188644719 0.795634811355281\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.470178368072280 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20718 0 0 \r\n" + 
				"\r\n" + 
				"Model 13\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.455370602460235 0.544629397539765\r\n" + 
				"		0.352007246231102 0.647992753768898\r\n" + 
				"		0.867377139727878 0.132622860272122\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.860040865843737 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20583 0 0 \r\n" + 
				"\r\n" + 
				"Model 14\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.582517470354072 0.417482529645928\r\n" + 
				"		0.422087312661907 0.577912687338093\r\n" + 
				"		0.844750441376198 0.155249558623802\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1205.128336331999900 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 15\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.644200622869900 0.355799377130100\r\n" + 
				"		0.709531990913915 0.290468009086085\r\n" + 
				"		0.084383075527949 0.915616924472051\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000133858416340 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16218 0 0 \r\n" + 
				"\r\n" + 
				"Model 16\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.450952343380162 0.549047656619838\r\n" + 
				"		0.307824335415993 0.692175664584007\r\n" + 
				"		0.832900655423141 0.167099344576859\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.883633258858334 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 17\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.570873259859964 0.429126740140036\r\n" + 
				"		0.462417721195121 0.537582278804879\r\n" + 
				"		0.970173745107143 0.029826254892857\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.109939299542852 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16096 0 0 \r\n" + 
				"\r\n" + 
				"Model 18\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.655861470914687 0.344138529085313\r\n" + 
				"		0.729966130466378 0.270033869533622\r\n" + 
				"		0.174713374932966 0.825286625067034\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3532 0 0 \r\n" + 
				"\r\n" + 
				"Model 19\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.471157535371947 0.528842464628053\r\n" + 
				"		0.384951203335700 0.615048796664300\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11205 0 0 \r\n" + 
				"\r\n" + 
				"Model 20\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.604754026927261 0.395245973072739\r\n" + 
				"		0.354295793888902 0.645704206111098\r\n" + 
				"		0.743655996809275 0.256344003190725\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.277133122832489 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17918 0 0 \r\n" + 
				"\r\n" + 
				"Model 21\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.554441594838269 0.445558405161731\r\n" + 
				"		0.754533945886429 0.245466054113571\r\n" + 
				"		0.260296123870220 0.739703876129780\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.806906408898732 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 22\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.509491579492765 0.490508420507235\r\n" + 
				"		0.998890777637916 0.001109222362084\r\n" + 
				"		0.406381476128322 0.593618523871677\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.003840485060285 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24020 0 0 \r\n" + 
				"\r\n" + 
				"Model 23\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.630579907734479 0.369420092265521\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.687765391225997 0.312234608774003\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		245.652181328527460 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 24\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.441751661455528 0.558248338544472\r\n" + 
				"		0.348279097194644 0.651720902805356\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.089298681213060 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20582 0 0 \r\n" + 
				"\r\n" + 
				"Model 25\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.602201675724282 0.397798324275718\r\n" + 
				"		0.039624180103251 0.960375819896749\r\n" + 
				"		0.672393961779958 0.327606038220042\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.990463188078087 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		14177 0 0 \r\n" + 
				"\r\n" + 
				"Model 26\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.431806972270606 0.568193027729394\r\n" + 
				"		0.342356754625162 0.657643245374838\r\n" + 
				"		0.904703100966487 0.095296899033513\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.109939299542852 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16096 0 0 \r\n" + 
				"\r\n" + 
				"Model 27\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.578232871216829 0.421767128783171\r\n" + 
				"		0.646622480917240 0.353377519082760\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 28\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.422686561401308 0.577313438598692\r\n" + 
				"		0.345247414165910 0.654752585834090\r\n" + 
				"		0.999049721759790 0.000950278240210\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7454 0 0 \r\n" + 
				"\r\n" + 
				"Model 29\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.584880712095921 0.415119287904079\r\n" + 
				"		0.645154655944211 0.354845344055789\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11513 0 0 \r\n" + 
				"\r\n" + 
				"Model 30\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.431133194808167 0.568866805191834\r\n" + 
				"		0.365427996086920 0.634572003913080\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11333 0 0 \r\n" + 
				"\r\n" + 
				"Model 31\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.576993681679505 0.423006318320495\r\n" + 
				"		0.498203247771318 0.501796752228682\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.089298681213060 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20582 0 0 \r\n" + 
				"\r\n" + 
				"Model 32\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.635353807032186 0.364646192967814\r\n" + 
				"		0.702297077163411 0.297702922836589\r\n" + 
				"		0.117533897215340 0.882466102784660\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.000133858416340 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16218 0 0 \r\n" + 
				"\r\n" + 
				"Model 33\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.454408597376955 0.545591402623045\r\n" + 
				"		0.257115847436660 0.742884152563340\r\n" + 
				"		0.646505791592664 0.353494208407337\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		2566 0 0 \r\n" + 
				"\r\n" + 
				"Model 34\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.443275249979557 0.556724750020443\r\n" + 
				"		0.366212382432421 0.633787617567579\r\n" + 
				"		0.982273887869294 0.017726112130706\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6216 0 0 \r\n" + 
				"\r\n" + 
				"Model 35\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.587260246565384 0.412739753434616\r\n" + 
				"		0.074034867770423 0.925965132229577\r\n" + 
				"		0.671575486067277 0.328424513932723\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.958275494574823 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		15134 0 0 \r\n" + 
				"\r\n" + 
				"Model 36\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.425514617332942 0.574485382667058\r\n" + 
				"		0.357035159133692 0.642964840866308\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.089298681213060 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20582 0 0 \r\n" + 
				"\r\n" + 
				"Model 37\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.578199077959536 0.421800922040465\r\n" + 
				"		0.670613893383643 0.329386106616357\r\n" + 
				"		0.213920450641811 0.786079549358189\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12628 0 0 \r\n" + 
				"\r\n" + 
				"Model 38\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.456121568665591 0.543878431334409\r\n" + 
				"		0.390377858436443 0.609622141563557\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11333 0 0 \r\n" + 
				"\r\n" + 
				"Model 39\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.582737277878362 0.417262722121638\r\n" + 
				"		0.651801870056679 0.348198129943321\r\n" + 
				"		0.074504228165014 0.925495771834986\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9911 0 0 \r\n" + 
				"\r\n" + 
				"Model 40\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.433255646851052 0.566744353148948\r\n" + 
				"		0.356423049197564 0.643576950802436\r\n" + 
				"		0.989906449777671 0.010093550222329\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11335 0 0 \r\n" + 
				"\r\n" + 
				"Model 41\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.585615112881061 0.414384887118939\r\n" + 
				"		0.710137229890006 0.289862770109994\r\n" + 
				"		0.331659474243827 0.668340525756173\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.806906408898732 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 42\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.521820449008282 0.478179550991718\r\n" + 
				"		0.251834834790584 0.748165165209416\r\n" + 
				"		0.715938038401377 0.284061961598623\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.277133122832489 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17918 0 0 \r\n" + 
				"\r\n" + 
				"Model 43\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.480134839890745 0.519865160109255\r\n" + 
				"		0.391608384204361 0.608391615795639\r\n" + 
				"		0.948121381280325 0.051878618719675\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11680 0 0 \r\n" + 
				"\r\n" + 
				"Model 44\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.601615009561160 0.398384990438840\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.663904679496904 0.336095320503096\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.153144757771236 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		14405 0 0 \r\n" + 
				"\r\n" + 
				"Model 45\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.432543819372415 0.567456180627585\r\n" + 
				"		0.361150619725755 0.638849380274246\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.113019664081815 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		13705 0 0 \r\n" + 
				"\r\n" + 
				"Model 46\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.582266867444107 0.417733132555893\r\n" + 
				"		0.641460167477875 0.358539832522125\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8230 0 0 \r\n" + 
				"\r\n" + 
				"Model 47\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.431599168612255 0.568400831387745\r\n" + 
				"		0.286628278360299 0.713371721639701\r\n" + 
				"		0.740700652382788 0.259299347617212\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.408132733633355 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20583 0 0 \r\n" + 
				"\r\n" + 
				"Model 48\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.514799109595713 0.485200890404287\r\n" + 
				"		0.058608001926312 0.941391998073688\r\n" + 
				"		0.606343230150081 0.393656769849919\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.958275494574823 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		15134 0 0 \r\n" + 
				"\r\n" + 
				"Model 49\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.395731350874617 0.604268649125383\r\n" + 
				"		0.327506762006294 0.672493237993706\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.089298681213060 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20582 0 0 \r\n" + 
				"\r\n" + 
				"Model 50\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.571877221149807 0.428122778850194\r\n" + 
				"		0.997963265402770 0.002036734597230\r\n" + 
				"		0.489326766672716 0.510673233327284\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.003840485060285 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24020 0 0 \r\n" + 
				"\r\n" + 
				"Model 51\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.636913318258123 0.363086681741877\r\n" + 
				"		0.686819851822382 0.313180148177618\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 52\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.448798188027385 0.551201811972615\r\n" + 
				"		0.146372530959838 0.853627469040162\r\n" + 
				"		0.573891120216669 0.426108879783331\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.350797489291662 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		22351 0 0 \r\n" + 
				"\r\n" + 
				"Model 53\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.371754056279301 0.628245943720699\r\n" + 
				"		0.313160950267791 0.686839049732209\r\n" + 
				"		0.998452450237519 0.001547549762481\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7454 0 0 \r\n" + 
				"\r\n" + 
				"Model 54\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.559594459821362 0.440405540178638\r\n" + 
				"		0.622309496635808 0.377690503364192\r\n" + 
				"		0.031074159260642 0.968925840739358\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9911 0 0 \r\n" + 
				"\r\n" + 
				"Model 55\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.426862691506353 0.573137308493647\r\n" + 
				"		0.909238054845253 0.090761945154747\r\n" + 
				"		0.354690038697996 0.645309961302004\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.121116134356358 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 56\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.568617005163230 0.431382994836770\r\n" + 
				"		0.660721706567369 0.339278293432631\r\n" + 
				"		0.163652886138254 0.836347113861746\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		180 0 0 \r\n" + 
				"\r\n" + 
				"Model 57\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.437661045494413 0.562338954505587\r\n" + 
				"		0.371469579787887 0.628530420212113\r\n" + 
				"		0.989898966710121 0.010101033289879\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12202 0 0 \r\n" + 
				"\r\n" + 
				"Model 58\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.577773991491268 0.422226008508732\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.645871006408649 0.354128993591351\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		245.652181328527460 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 59\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.422838776580093 0.577161223419907\r\n" + 
				"		0.329515766342307 0.670484233657693\r\n" + 
				"		0.835874436551951 0.164125563448049\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.860040865843737 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20583 0 0 \r\n" + 
				"\r\n" + 
				"Model 60\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.559309198539055 0.440690801460945\r\n" + 
				"		0.643098261504570 0.356901738495430\r\n" + 
				"		0.123291747745500 0.876708252254500\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5979 0 0 \r\n" + 
				"\r\n" + 
				"Model 61\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.427330212956377 0.572669787043623\r\n" + 
				"		0.363625808664411 0.636374191335589\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		893 0 0 \r\n" + 
				"\r\n" + 
				"Model 62\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.574397275129092 0.425602724870908\r\n" + 
				"		0.407425602571823 0.592574397428178\r\n" + 
				"		0.751433411825905 0.248566588174095\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11393 0 0 \r\n" + 
				"\r\n" + 
				"Model 63\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.589690787615011 0.410309212384989\r\n" + 
				"		0.184114424599711 0.815885575400289\r\n" + 
				"		0.688864424053692 0.311135575946308\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.380112777538191 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		15134 0 0 \r\n" + 
				"\r\n" + 
				"Model 64\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.450916473307269 0.549083526692731\r\n" + 
				"		0.380064668492557 0.619935331507443\r\n" + 
				"		0.965612594440722 0.034387405559278\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11680 0 0 \r\n" + 
				"\r\n" + 
				"Model 65\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.582128497597388 0.417871502402612\r\n" + 
				"		0.649286310494272 0.350713689505728\r\n" + 
				"		0.059948531221687 0.940051468778313\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11399 0 0 \r\n" + 
				"\r\n" + 
				"Model 66\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.432267682846434 0.567732317153566\r\n" + 
				"		0.375953680487630 0.624046319512370\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		830 0 0 \r\n" + 
				"\r\n" + 
				"Model 67\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.568574379229224 0.431425620770776\r\n" + 
				"		0.622174811700071 0.377825188299929\r\n" + 
				"		0.006939270487114 0.993060729512886\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7020 0 0 \r\n" + 
				"\r\n" + 
				"Model 68\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.434779416663907 0.565220583336092\r\n" + 
				"		0.378009769140682 0.621990230859318\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1610 0 0 \r\n" + 
				"\r\n" + 
				"Model 69\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.569514195386942 0.430485804613058\r\n" + 
				"		0.628295777865115 0.371704222134885\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 70\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.429451650875444 0.570548349124556\r\n" + 
				"		0.366700558663803 0.633299441336197\r\n" + 
				"		0.949846296872658 0.050153703127342\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12074 0 0 \r\n" + 
				"\r\n" + 
				"Model 71\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.568465979062418 0.431534020937582\r\n" + 
				"		0.637497774499564 0.362502225500436\r\n" + 
				"		0.089128387437286 0.910871612562714\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1606 0 0 \r\n" + 
				"\r\n" + 
				"Model 72\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.431771127839082 0.568228872160919\r\n" + 
				"		0.239704062224943 0.760295937775057\r\n" + 
				"		0.636750799383934 0.363249200616066\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7898 0 0 \r\n" + 
				"\r\n" + 
				"Model 73\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.426464346690656 0.573535653309344\r\n" + 
				"		0.308672165826901 0.691327834173099\r\n" + 
				"		0.762409349673417 0.237590650326583\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1205.128336331999900 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 74\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.533162884491490 0.466837115508510\r\n" + 
				"		0.467077587695276 0.532922412304724\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11333 0 0 \r\n" + 
				"\r\n" + 
				"Model 75\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.604939519318498 0.395060480681502\r\n" + 
				"		0.659911527903622 0.340088472096378\r\n" + 
				"		0.007282676930311 0.992717323069689\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.089080587947466 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16218 0 0 \r\n" + 
				"\r\n" + 
				"Model 76\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.440208911447013 0.559791088552987\r\n" + 
				"		0.347592142042399 0.652407857957600\r\n" + 
				"		0.894449174200086 0.105550825799914\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.109939299542852 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16096 0 0 \r\n" + 
				"\r\n" + 
				"Model 77\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.580081375984511 0.419918624015489\r\n" + 
				"		0.634658401255299 0.365341598744701\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 78\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.435447028784958 0.564552971215042\r\n" + 
				"		0.373353467097482 0.626646532902518\r\n" + 
				"		0.988126348031294 0.011873651968706\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11680 0 0 \r\n" + 
				"\r\n" + 
				"Model 79\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.573468381991786 0.426531618008214\r\n" + 
				"		0.708424179639742 0.291575820360257\r\n" + 
				"		0.317657141372957 0.682342858627043\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.750140903980083 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 80\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.514024069914982 0.485975930085018\r\n" + 
				"		0.247554689101115 0.752445310898885\r\n" + 
				"		0.711009876919552 0.288990123080448\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.277133122832489 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17918 0 0 \r\n" + 
				"\r\n" + 
				"Model 81\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.474394620497055 0.525605379502945\r\n" + 
				"		0.399310639850118 0.600689360149882\r\n" + 
				"		0.986882793355133 0.013117206644867\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11335 0 0 \r\n" + 
				"\r\n" + 
				"Model 82\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.594607378116314 0.405392621883686\r\n" + 
				"		0.438493104100316 0.561506895899684\r\n" + 
				"		0.855266052518815 0.144733947481185\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.883633258858334 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 83\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.656000036495322 0.343999963504678\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.719298415000004 0.280701584999996\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.137734331977630 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20979 0 0 \r\n" + 
				"\r\n" + 
				"Model 84\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.440860120759636 0.559139879240364\r\n" + 
				"		0.999772436789214 0.000227563210786\r\n" + 
				"		0.382594834325392 0.617405165674608\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.072577379992236 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21909 0 0 \r\n" + 
				"\r\n" + 
				"Model 85\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.572183322533789 0.427816677466211\r\n" + 
				"		0.047978693402141 0.952021306597859\r\n" + 
				"		0.640270343098991 0.359729656901009\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.052298208147134 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25190 0 0 \r\n" + 
				"\r\n" + 
				"Model 86\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.427580537471991 0.572419462528009\r\n" + 
				"		0.991108176118694 0.008891823881306\r\n" + 
				"		0.369475186505803 0.630524813494197\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.003840485060285 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		24020 0 0 \r\n" + 
				"\r\n" + 
				"Model 87\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.568498034145270 0.431501965854730\r\n" + 
				"		0.633758777770328 0.366241222229673\r\n" + 
				"		0.057067072168786 0.942932927831214\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.089080587947466 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16218 0 0 \r\n" + 
				"\r\n" + 
				"Model 88\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.429967023678828 0.570032976321172\r\n" + 
				"		0.363388965580920 0.636611034419080\r\n" + 
				"		0.972111224660016 0.027888775339984\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		11680 0 0 \r\n" + 
				"\r\n" + 
				"Model 89\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.574287647311059 0.425712352688941\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.632188230571389 0.367811769428611\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		245.652181328527460 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 90\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.431227678358820 0.568772321641180\r\n" + 
				"		0.347822968571977 0.652177031428023\r\n" + 
				"		0.822223746115408 0.177776253884592\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		1.109939299542852 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16096 0 0 \r\n" + 
				"\r\n" + 
				"Model 91\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.556813585834317 0.443186414165683\r\n" + 
				"		0.413708540694151 0.586291459305849\r\n" + 
				"		0.793268414493070 0.206731585506930\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.408132733633355 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20583 0 0 \r\n" + 
				"\r\n" + 
				"Model 92\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.609002563758967 0.390997436241033\r\n" + 
				"		0.066907893063594 0.933092106936406\r\n" + 
				"		0.684535154781303 0.315464845218697\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.990463188078087 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		14177 0 0 \r\n" + 
				"\r\n" + 
				"Model 93\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.434545477086218 0.565454522913782\r\n" + 
				"		0.364952618228370 0.635047381771630\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.089298681213060 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20582 0 0 \r\n" + 
				"\r\n" + 
				"Model 94\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.581170485551323 0.418829514448677\r\n" + 
				"		0.641744182970987 0.358255817029013\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4487 0 0 \r\n" + 
				"\r\n" + 
				"Model 95\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.430140021894620 0.569859978105380\r\n" + 
				"		0.920413560741275 0.079586439258725\r\n" + 
				"		0.359751242988117 0.640248757011883\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.121116134356358 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18900 0 0 \r\n" + 
				"\r\n" + 
				"Model 96\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.570150153875155 0.429849846124845\r\n" + 
				"		0.623260881004850 0.376739118995150\r\n" + 
				"		0.000021598063148 0.999978401936852\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1911 0 0 \r\n" + 
				"\r\n" + 
				"Model 97\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.434988853007365 0.565011146992635\r\n" + 
				"		0.372395527639960 0.627604472360040\r\n" + 
				"		0.998844202888889 0.001155797111111\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7454 0 0 \r\n" + 
				"\r\n" + 
				"Model 98\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.574901172021292 0.425098827978708\r\n" + 
				"		0.657641817707809 0.342358182292191\r\n" + 
				"		0.219696889247881 0.780303110752119\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.334865520481373 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20718 0 0 \r\n" + 
				"\r\n" + 
				"Model 99\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.456752115361089 0.543247884638911\r\n" + 
				"		0.400041525899391 0.599958474100609\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.089298681213060 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20582 0 0 \r\n" + 
				"\r\n" + 
				"Model 100\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.574104993540057 0.425895006459943\r\n" + 
				"		0.689404877533777 0.310595122466223\r\n" + 
				"		0.297188401510295 0.702811598489704\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3533 0 0 \r\n" + 
				"\r\n" + 
				"TrainedWeights\r\n" + 
				"0.609340749180877 0.727454158542423 0.464757430590489 0.607544014000976 0.531911002889601 0.554039523218974 0.447421124770109 0.592778266987105 0.454094308013266 0.483818862385236 0.370924333524533 0.472187743045902 0.404726229022717 0.375040249606102 0.500026391942840 0.498669842258768 0.266071594511025 0.529992585047873 0.351842418922445 0.444569038003831 0.545393758224696 0.340910758072630 0.456776574186338 0.427637594907781 0.434024072314333 0.416389190500844 0.386101435794237 0.413056964532763 0.372999520044562 0.359551242983807 0.161433794566854 0.479502881623504 0.409565849997652 0.370877745748704 0.441565997047656 0.379165212711606 0.409394225525071 0.313308116627536 0.387369275755631 0.389772011435519 0.415072976804989 0.495834564031149 0.337079069184969 0.412834116603779 0.375069461572941 0.364409058979236 0.477443627169105 0.336871166636431 0.437340715847090 0.181485024784407 0.446664118375961 0.322189406978908 0.456178672012451 0.329591146128532 0.376103399929840 0.407712504715790 0.347792674729187 0.384277851395661 0.425951075420033 0.378620689765395 0.360381579384754 0.353369222647728 0.457008911738442 0.335579385652743 0.382458624390872 0.327135813199210 0.319410866697019 0.323849048156246 0.338505768641406 0.348139776930402 0.358421843667240 0.424916985733480 0.447160112601698 0.183724845354877 0.395263114564322 0.408032581205169 0.345244521554305 0.338697132933201 0.422260894884250 0.493819902694891 0.309607064234183 0.357585656308524 0.533432321582856 0.317236351807296 0.367970769050376 0.341099475009104 0.351259800310078 0.361587636427040 0.344793881768641 0.381657573890952 0.341320205839940 0.459730757425796 0.365538114523681 0.366719880946939 0.366406497739966 0.321350357992866 0.342150369891485 0.378762479749387 0.282853666379840 0.407904659607266 ");
		filewriter.close();
		file = new File(workpath + "\\ionclassifier_C_v_Z.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		filewriter = new FileWriter(file);
		filewriter.write("Model 1\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.500000000000001 0.499999999999999\r\n" + 
				"		0.102728438015016 0.897271561984984\r\n" + 
				"		0.978390297684675 0.021609702315325\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9041 0 0 \r\n" + 
				"\r\n" + 
				"Model 2\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.663248001042729 0.336751998957271\r\n" + 
				"		0.876067254901875 0.123932745098125\r\n" + 
				"		0.042773990450973 0.957226009549027\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5358 0 0 \r\n" + 
				"\r\n" + 
				"Model 3\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.416622362762104 0.583377637237896\r\n" + 
				"		0.155567287120918 0.844432712879082\r\n" + 
				"		0.866933585378935 0.133066414621065\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4485 0 0 \r\n" + 
				"\r\n" + 
				"Model 4\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.520806754451572 0.479193245548428\r\n" + 
				"		0.773272829394721 0.226727170605279\r\n" + 
				"		0.033459843135926 0.966540156864074\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4240 0 0 \r\n" + 
				"\r\n" + 
				"Model 5\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.338997612105275 0.661002387894725\r\n" + 
				"		0.193775050481635 0.806224949518365\r\n" + 
				"		0.982729347501972 0.017270652498028\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.090110045064970 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18963 0 0 \r\n" + 
				"\r\n" + 
				"Model 6\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.597982928810590 0.402017071189410\r\n" + 
				"		0.799175583808300 0.200824416191700\r\n" + 
				"		0.123446219672198 0.876553780327803\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7021 0 0 \r\n" + 
				"\r\n" + 
				"Model 7\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.444659500675640 0.555340499324360\r\n" + 
				"		0.225084177504592 0.774915822495408\r\n" + 
				"		0.916818032358123 0.083181967641877\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"Model 8\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.604133346297529 0.395866653702471\r\n" + 
				"		0.790352504571376 0.209647495428624\r\n" + 
				"		0.014273061022875 0.985726938977125\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 9\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.369267146819371 0.630732853180629\r\n" + 
				"		0.642448213910272 0.357551786089728\r\n" + 
				"		0.038815886603142 0.961184113396859\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 10\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.264707524267985 0.735292475732015\r\n" + 
				"		0.177770169456955 0.822229830543045\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2539.788911264099600 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 11\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.562859904142266 0.437140095857734\r\n" + 
				"		0.272430155734458 0.727569844265542\r\n" + 
				"		0.914834446301703 0.085165553698297\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7270 0 0 \r\n" + 
				"\r\n" + 
				"Model 12\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.652075471365218 0.347924528634782\r\n" + 
				"		0.821858935396127 0.178141064603873\r\n" + 
				"		0.226339704514996 0.773660295485004\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8792 0 0 \r\n" + 
				"\r\n" + 
				"Model 13\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.531676612344785 0.468323387655215\r\n" + 
				"		0.707265594648358 0.292734405351642\r\n" + 
				"		0.000215311839343 0.999784688160657\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3532 0 0 \r\n" + 
				"\r\n" + 
				"Model 14\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.340944937834631 0.659055062165369\r\n" + 
				"		0.185039211600174 0.814960788399826\r\n" + 
				"		0.903732128527157 0.096267871472842\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6278 0 0 \r\n" + 
				"\r\n" + 
				"Model 15\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.554518664871038 0.445481335128962\r\n" + 
				"		0.702162180583279 0.297837819416721\r\n" + 
				"		0.085176764669945 0.914823235330056\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3533 0 0 \r\n" + 
				"\r\n" + 
				"Model 16\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.395916732696087 0.604083267303913\r\n" + 
				"		0.220129735850200 0.779870264149800\r\n" + 
				"		0.860838303391663 0.139161696608337\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5482 0 0 \r\n" + 
				"\r\n" + 
				"Model 17\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.550772645216570 0.449227354783430\r\n" + 
				"		0.323553342922917 0.676446657077083\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2539.788911264099600 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 18\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.713914808848459 0.286085191151541\r\n" + 
				"		0.815226434963906 0.184773565036094\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 19\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.425867428249587 0.574132571750414\r\n" + 
				"		0.058475222022884 0.941524777977116\r\n" + 
				"		0.591800259714391 0.408199740285609\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		257.160381381999970 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 20\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.321326353373578 0.678673646626422\r\n" + 
				"		0.188571132448783 0.811428867551217\r\n" + 
				"		0.696301982626812 0.303698017373188\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3766 0 0 \r\n" + 
				"\r\n" + 
				"Model 21\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.434941181122409 0.565058818877591\r\n" + 
				"		0.234130499491565 0.765869500508435\r\n" + 
				"		0.873066766804931 0.126933233195069\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"Model 22\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.572075772109181 0.427924227890819\r\n" + 
				"		0.760597564392847 0.239402435607153\r\n" + 
				"		0.180796325627558 0.819203674372442\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8033 0 0 \r\n" + 
				"\r\n" + 
				"Model 23\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.462572129290476 0.537427870709524\r\n" + 
				"		0.590671849040632 0.409328150959368\r\n" + 
				"		0.024526313554250 0.975473686445750\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 24\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.345777099755282 0.654222900244718\r\n" + 
				"		0.242419830606493 0.757580169393507\r\n" + 
				"		0.915506649927741 0.084493350072259\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12322 0 0 \r\n" + 
				"\r\n" + 
				"Model 25\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.560170898345065 0.439829101654935\r\n" + 
				"		0.744146360838344 0.255853639161656\r\n" + 
				"		0.149632566639340 0.850367433360660\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8792 0 0 \r\n" + 
				"\r\n" + 
				"Model 26\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.434495941419778 0.565504058580222\r\n" + 
				"		0.306802731427234 0.693197268572766\r\n" + 
				"		0.938504254018707 0.061495745981293\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		4486 0 0 \r\n" + 
				"\r\n" + 
				"Model 27\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.603538315625379 0.396461684374621\r\n" + 
				"		0.721531759269461 0.278468240730539\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 28\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.393404880430509 0.606595119569491\r\n" + 
				"		0.289441476581299 0.710558523418702\r\n" + 
				"		0.953968068407119 0.046031931592881\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1199 0 0 \r\n" + 
				"\r\n" + 
				"Model 29\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.585352832682093 0.414647167317907\r\n" + 
				"		0.723700648909582 0.276299351090418\r\n" + 
				"		0.082958005532750 0.917041994467250\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3533 0 0 \r\n" + 
				"\r\n" + 
				"Model 30\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.408843382039455 0.591156617960545\r\n" + 
				"		0.224125202821828 0.775874797178172\r\n" + 
				"		0.789240728681673 0.210759271318327\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5482 0 0 \r\n" + 
				"\r\n" + 
				"Model 31\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.508575713418019 0.491424286581981\r\n" + 
				"		0.645122866365909 0.354877133634091\r\n" + 
				"		0.069222545521866 0.930777454478134\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7021 0 0 \r\n" + 
				"\r\n" + 
				"Model 32\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.373785877161377 0.626214122838623\r\n" + 
				"		0.228823384145437 0.771176615854564\r\n" + 
				"		0.883265517871680 0.116734482128320\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		6278 0 0 \r\n" + 
				"\r\n" + 
				"Model 33\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.559516467892129 0.440483532107871\r\n" + 
				"		0.682930875562658 0.317069124437342\r\n" + 
				"		0.000075855610954 0.999924144389046\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3532 0 0 \r\n" + 
				"\r\n" + 
				"Model 34\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.377955409271921 0.622044590728079\r\n" + 
				"		0.271511977929243 0.728488022070757\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2539.788911264099600 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 35\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.595107482121147 0.404892517878853\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.713981405916814 0.286018594083186\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		213.123381431999830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 36\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.390694584917065 0.609305415082935\r\n" + 
				"		0.271395977316231 0.728604022683769\r\n" + 
				"		0.964685040353113 0.035314959646887\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.001258396655727 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 37\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.594733630151737 0.405266369848263\r\n" + 
				"		0.745481394509759 0.254518605490241\r\n" + 
				"		0.053106628192868 0.946893371807132\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 38\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.396850128326510 0.603149871673490\r\n" + 
				"		0.640330488856074 0.359669511143926\r\n" + 
				"		0.066425164281286 0.933574835718714\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 39\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.300935443627978 0.699064556372022\r\n" + 
				"		0.175594836707119 0.824405163292881\r\n" + 
				"		0.846888240666154 0.153111759333846\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9041 0 0 \r\n" + 
				"\r\n" + 
				"Model 40\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.512019830898551 0.487980169101449\r\n" + 
				"		0.881021313449264 0.118978686550736\r\n" + 
				"		0.311397320115747 0.688602679884253\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.087474050838235 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		16451 0 0 \r\n" + 
				"\r\n" + 
				"Model 41\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.619120560090122 0.380879439909879\r\n" + 
				"		0.003617455598127 0.996382544401873\r\n" + 
				"		0.724952799823576 0.275047200176424\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-0.001220864421918 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		22103 0 0 \r\n" + 
				"\r\n" + 
				"Model 42\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.405553555759009 0.594446444240991\r\n" + 
				"		0.277010641273342 0.722989358726658\r\n" + 
				"		0.885324792588616 0.114675207411384\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.001258396655727 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 43\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.573597481963946 0.426402518036054\r\n" + 
				"		0.692106629923653 0.307893370076347\r\n" + 
				"		0.000031398449235 0.999968601550765\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3532 0 0 \r\n" + 
				"\r\n" + 
				"Model 44\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.385062589777251 0.614937410222749\r\n" + 
				"		0.254507888982578 0.745492111017422\r\n" + 
				"		0.866576567274082 0.133423432725918\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.299265304625115 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		22597 0 0 \r\n" + 
				"\r\n" + 
				"Model 45\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.557596497824319 0.442403502175681\r\n" + 
				"		0.712754615954592 0.287245384045408\r\n" + 
				"		0.064233680506754 0.935766319493246\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7021 0 0 \r\n" + 
				"\r\n" + 
				"Model 46\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.386737073735201 0.613262926264799\r\n" + 
				"		0.282903144764488 0.717096855235512\r\n" + 
				"		0.988269682429590 0.011730317570410\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1199 0 0 \r\n" + 
				"\r\n" + 
				"Model 47\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.592533930318314 0.407466069681686\r\n" + 
				"		0.723130978045999 0.276869021954001\r\n" + 
				"		0.030740271310247 0.969259728689753\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 48\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.393797834654354 0.606202165345647\r\n" + 
				"		0.244612359993713 0.755387640006287\r\n" + 
				"		0.849545583000866 0.150454416999134\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"Model 49\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.550743791538995 0.449256208461005\r\n" + 
				"		0.690909663909263 0.309090336090737\r\n" + 
				"		0.063997805548990 0.936002194451010\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.010176941697072 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17918 0 0 \r\n" + 
				"\r\n" + 
				"Model 50\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.387816222057302 0.612183777942698\r\n" + 
				"		0.613777208046899 0.386222791953101\r\n" + 
				"		0.097140880359099 0.902859119640901\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8792 0 0 \r\n" + 
				"\r\n" + 
				"Model 51\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.315035499961498 0.684964500038502\r\n" + 
				"		0.222081080881152 0.777918919118848\r\n" + 
				"		0.983498031218251 0.016501968781749\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.090110045064970 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18963 0 0 \r\n" + 
				"\r\n" + 
				"Model 52\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.569646000808190 0.430353999191810\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.662568012334745 0.337431987665255\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		213.123381431999830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 53\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.401220613876888 0.598779386123112\r\n" + 
				"		0.231907788233551 0.768092211766449\r\n" + 
				"		0.776799649121640 0.223200350878360\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5482 0 0 \r\n" + 
				"\r\n" + 
				"Model 54\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.505278028617423 0.494721971382577\r\n" + 
				"		0.356485659799578 0.643514340200422\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2539.788911264099600 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 55\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.659254411632150 0.340745588367850\r\n" + 
				"		0.781269514737533 0.218730485262467\r\n" + 
				"		0.080963121849902 0.919036878150098\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7021 0 0 \r\n" + 
				"\r\n" + 
				"Model 56\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.436797992792626 0.563202007207374\r\n" + 
				"		0.602328623960480 0.397671376039520\r\n" + 
				"		0.043239752441012 0.956760247558988\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 57\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.321609319958104 0.678390680041896\r\n" + 
				"		0.228500477358213 0.771499522641787\r\n" + 
				"		0.922022652622828 0.077977347377172\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.001258396655727 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19955 0 0 \r\n" + 
				"\r\n" + 
				"Model 58\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.553046433348310 0.446953566651690\r\n" + 
				"		0.689607050464467 0.310392949535533\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.542360332800000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		20075 0 0 \r\n" + 
				"\r\n" + 
				"Model 59\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.368170820917906 0.631829179082094\r\n" + 
				"		0.157993679959912 0.842006320040088\r\n" + 
				"		0.730052006010852 0.269947993989149\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3766 0 0 \r\n" + 
				"\r\n" + 
				"Model 60\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.418418985605690 0.581581014394311\r\n" + 
				"		0.272177830433210 0.727822169566790\r\n" + 
				"		0.916927512269766 0.083072487730234\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12502 0 0 \r\n" + 
				"\r\n" + 
				"Model 61\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.593834804834537 0.406165195165463\r\n" + 
				"		0.714121468165098 0.285878531834902\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		238 0 0 \r\n" + 
				"\r\n" + 
				"Model 62\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.389514879611602 0.610485120388398\r\n" + 
				"		0.285711302683632 0.714288697316368\r\n" + 
				"		0.904441165008285 0.095558834991715\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9041 0 0 \r\n" + 
				"\r\n" + 
				"Model 63\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.570092159394332 0.429907840605668\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.669588617246613 0.330411382753387\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		213.123381431999830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 64\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.396621402598964 0.603378597401036\r\n" + 
				"		0.297959113614391 0.702040886385609\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2539.788911264099600 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 65\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.594457289556992 0.405542710443008\r\n" + 
				"		0.730389993317797 0.269610006682203\r\n" + 
				"		0.105109390159914 0.894890609840086\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3533 0 0 \r\n" + 
				"\r\n" + 
				"Model 66\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.421894766233208 0.578105233766791\r\n" + 
				"		0.288052875656139 0.711947124343861\r\n" + 
				"		0.908855138274143 0.091144861725857\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12322 0 0 \r\n" + 
				"\r\n" + 
				"Model 67\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.589863199610916 0.410136800389084\r\n" + 
				"		0.722049397963770 0.277950602036230\r\n" + 
				"		0.000000291325263 0.999999708674737\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3532 0 0 \r\n" + 
				"\r\n" + 
				"Model 68\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.381574179422827 0.618425820577173\r\n" + 
				"		0.274331686558558 0.725668313441442\r\n" + 
				"		0.978599993962527 0.021400006037473\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7205 0 0 \r\n" + 
				"\r\n" + 
				"Model 69\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.590591010891363 0.409408989108637\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.688225302091232 0.311774697908768\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		213.123381431999830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 70\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.403158639676675 0.596841360323324\r\n" + 
				"		0.323691214473730 0.676308785526271\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2539.788911264099600 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 71\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.582244581139880 0.417755418860120\r\n" + 
				"		0.691310822173016 0.308689177826984\r\n" + 
				"		0.013670604729680 0.986329395270320\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 72\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.396773329419286 0.603226670580714\r\n" + 
				"		0.261237640248038 0.738762359751962\r\n" + 
				"		0.861919267570100 0.138080732429900\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		9041 0 0 \r\n" + 
				"\r\n" + 
				"Model 73\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.560124292409478 0.439875707590522\r\n" + 
				"		0.739041306676228 0.260958693323772\r\n" + 
				"		0.084830689691646 0.915169310308354\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7021 0 0 \r\n" + 
				"\r\n" + 
				"Model 74\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.395543699855892 0.604456300144108\r\n" + 
				"		0.296557697894929 0.703442302105071\r\n" + 
				"		0.978267833418913 0.021732166581087\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.090110045064970 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18963 0 0 \r\n" + 
				"\r\n" + 
				"Model 75\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.589397865505686 0.410602134494314\r\n" + 
				"		0.705991479331240 0.294008520668760\r\n" + 
				"		0.040794605592775 0.959205394407225\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7390 0 0 \r\n" + 
				"\r\n" + 
				"Model 76\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.402293659911375 0.597706340088625\r\n" + 
				"		0.232852599951776 0.767147400048224\r\n" + 
				"		0.812256707149888 0.187743292850112\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5482 0 0 \r\n" + 
				"\r\n" + 
				"Model 77\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.527227036513808 0.472772963486192\r\n" + 
				"		0.713393980170344 0.286606019829656\r\n" + 
				"		0.142140742818703 0.857859257181297\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8792 0 0 \r\n" + 
				"\r\n" + 
				"Model 78\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.412883618793242 0.587116381206758\r\n" + 
				"		0.273651512063475 0.726348487936525\r\n" + 
				"		0.945062711684043 0.054937288315957\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5105 0 0 \r\n" + 
				"\r\n" + 
				"Model 79\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.602027608430403 0.397972391569598\r\n" + 
				"		0.699781252245849 0.300218747754151\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.001890699977649 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		23218 0 0 \r\n" + 
				"\r\n" + 
				"Model 80\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.405832495364591 0.594167504635410\r\n" + 
				"		0.622626889663335 0.377373110336665\r\n" + 
				"		0.110653998779084 0.889346001220916\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5233 0 0 \r\n" + 
				"\r\n" + 
				"Model 81\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.332610966173293 0.667389033826707\r\n" + 
				"		0.240890227598790 0.759109772401210\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.101600702854705 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21221 0 0 \r\n" + 
				"\r\n" + 
				"Model 82\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.576645711185013 0.423354288814987\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.681846778299564 0.318153221700436\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		213.123381431999830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 83\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.394458050860903 0.605541949139097\r\n" + 
				"		0.536865587442593 0.463134412557407\r\n" + 
				"		0.004694961159497 0.995305038840503\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5357 0 0 \r\n" + 
				"\r\n" + 
				"Model 84\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.299931648525964 0.700068351474036\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"		0.228365660480357 0.771634339519643\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		-1.155406036300433 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		19088 0 0 \r\n" + 
				"\r\n" + 
				"Model 85\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.558491617815571 0.441508382184429\r\n" + 
				"		0.679277952974263 0.320722047025737\r\n" + 
				"		0.087758939016266 0.912241060983734\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.010176941697072 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		17918 0 0 \r\n" + 
				"\r\n" + 
				"Model 86\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.404662404231462 0.595337595768538\r\n" + 
				"		0.269746919008580 0.730253080991420\r\n" + 
				"		0.845945839425285 0.154054160574715\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		8665 0 0 \r\n" + 
				"\r\n" + 
				"Model 87\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.556444854990523 0.443555145009477\r\n" + 
				"		0.663708171049457 0.336291828950543\r\n" + 
				"		0.000011192030887 0.999988807969113\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3943 0 0 \r\n" + 
				"\r\n" + 
				"Model 88\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.387468074931061 0.612531925068939\r\n" + 
				"		0.218939283956416 0.781060716043584\r\n" + 
				"		0.742970297925147 0.257029702074853\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3766 0 0 \r\n" + 
				"\r\n" + 
				"Model 89\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.476622332333124 0.523377667666876\r\n" + 
				"		0.601964292568387 0.398035707431613\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.002975696656792 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18043 0 0 \r\n" + 
				"\r\n" + 
				"Model 90\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.347978801425655 0.652021198574345\r\n" + 
				"		0.257321336349628 0.742678663650372\r\n" + 
				"		0.997886521991888 0.002113478008112\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		1779 0 0 \r\n" + 
				"\r\n" + 
				"Model 91\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.578349274346787 0.421650725653213\r\n" + 
				"		0.669803389084754 0.330196610915246\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		12504 0 0 \r\n" + 
				"\r\n" + 
				"Model 92\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.404503403313342 0.595496596686658\r\n" + 
				"		0.306126184506684 0.693873815493316\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.065071730572354 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		21726 0 0 \r\n" + 
				"\r\n" + 
				"Model 93\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.596150993609962 0.403849006390038\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"		0.690605201754016 0.309394798245984\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		213.123381431999830 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 94\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.406695155520573 0.593304844479427\r\n" + 
				"		0.532946599080125 0.467053400919875\r\n" + 
				"		0.000000000000000 1.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.368605308807320 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		13042 0 0 \r\n" + 
				"\r\n" + 
				"Model 95\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.315959052369437 0.684040947630563\r\n" + 
				"		0.244014174939938 0.755985825060062\r\n" + 
				"		1.000000000000000 0.000000000000000\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		2539.788911264099600 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		25371 0 0 \r\n" + 
				"\r\n" + 
				"Model 96\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.561066478197959 0.438933521802041\r\n" + 
				"		0.697591512422885 0.302408487577115\r\n" + 
				"		0.124620143320224 0.875379856679776\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		3533 0 0 \r\n" + 
				"\r\n" + 
				"Model 97\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.416151399302637 0.583848600697363\r\n" + 
				"		0.232232869768359 0.767767130231641\r\n" + 
				"		0.799232482127148 0.200767517872852\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		5482 0 0 \r\n" + 
				"\r\n" + 
				"Model 98\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.519961068318801 0.480038931681199\r\n" + 
				"		0.348550367056119 0.651449632943881\r\n" + 
				"		0.976302547427512 0.023697452572488\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.669426557456355 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		18963 0 0 \r\n" + 
				"\r\n" + 
				"Model 99\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.667636341104378 0.332363658895622\r\n" + 
				"		0.801241590964413 0.198758409035587\r\n" + 
				"		0.117452966991135 0.882547033008865\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7021 0 0 \r\n" + 
				"\r\n" + 
				"Model 100\r\n" + 
				"	NumNodes 3\r\n" + 
				"	Children\r\n" + 
				"		2 3\r\n" + 
				"		0 0\r\n" + 
				"		0 0\r\n" + 
				"	EndChildren\r\n" + 
				"	ClassProb\r\n" + 
				"		0.457229999588745 0.542770000411255\r\n" + 
				"		0.323194586611501 0.676805413388499\r\n" + 
				"		0.896413174521519 0.103586825478481\r\n" + 
				"	EndClassProb\r\n" + 
				"	CutPoint\r\n" + 
				"		0.500000000000000 NaN NaN \r\n" + 
				"	CutVar\r\n" + 
				"		7141 0 0 \r\n" + 
				"\r\n" + 
				"TrainedWeights\r\n" + 
				"1.325508372990707 1.081054058894607 0.877928486868550 0.826242354489184 0.824345499914593 0.765711025149390 0.758036497525030 0.818888851128555 0.652561691731814 0.832941395610760 0.732288811027852 0.718911898740927 0.632570503680726 0.807910234912075 0.557477155038489 0.699688258840645 0.647904030254643 0.822407404103822 0.425101355072556 0.636707868422908 0.691774651658478 0.631823508050111 0.371701570179292 0.638184024718727 0.624183456291287 0.530244639036703 0.595920583209433 0.545684150976425 0.591387834353334 0.633543528733706 0.454638417207582 0.680754737573507 0.523561378006536 0.598975691039936 0.580741026646099 0.601978510859734 0.660457665727285 0.589422109291948 0.787879651186364 0.566447703399123 0.589522888425643 0.568946205241550 0.535597503563384 0.607888468112532 0.593237390060599 0.568191741273508 0.602900618164137 0.628787515856697 0.537924947011326 0.523537508789851 0.702626664366843 0.447427951923330 0.606410893952552 0.487061136080645 0.709790953217117 0.441071118600617 0.667625879445967 0.552171975020332 0.695882090283832 0.606175761845702 0.582596048312729 0.539198080789686 0.468975472901274 0.533208636576023 0.593353396151946 0.561107961660362 0.612476522710680 0.587876986546254 0.503556710261258 0.458285847476547 0.519855093049793 0.594468940183441 0.654093848442099 0.531720696911904 0.550304021458938 0.633822007490025 0.577640194191792 0.608978350085729 0.527462009115446 0.511531546471140 0.657101879874874 0.499683585055860 0.330628823794553 0.670986879443949 0.489345215643899 0.569081600250741 0.467419866718032 0.600804261724081 0.388061473200446 0.615290765361396 0.459621950411089 0.515929887089666 0.504747194401881 0.295486552074036 0.630528218124973 0.522865046943137 0.626948132276743 0.523380031973538 0.748504101939628 0.492643937331012 ");
		filewriter.close();
		file = new File(workpath + "\\ionclassifier_massfeatures.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		filewriter = new FileWriter(file);
		filewriter.write("-104.995800000000000\r\n" + 
				"-104.986000000000000\r\n" + 
				"-104.977000000000000\r\n" + 
				"-104.966999999999980\r\n" + 
				"-104.955400000000010\r\n" + 
				"-104.939909090909080\r\n" + 
				"-104.914777777777770\r\n" + 
				"-104.896545454545490\r\n" + 
				"-104.872000000000000\r\n" + 
				"-104.857000000000000\r\n" + 
				"-104.837666666666680\r\n" + 
				"-104.815500000000000\r\n" + 
				"-104.798000000000000\r\n" + 
				"-104.781000000000010\r\n" + 
				"-104.768000000000000\r\n" + 
				"-104.748750000000000\r\n" + 
				"-104.729000000000000\r\n" + 
				"-104.713000000000010\r\n" + 
				"-104.694500000000010\r\n" + 
				"-104.667666666666660\r\n" + 
				"-104.642500000000000\r\n" + 
				"-104.617999999999990\r\n" + 
				"-104.598200000000020\r\n" + 
				"-104.584000000000000\r\n" + 
				"-104.567200000000000\r\n" + 
				"-104.557500000000000\r\n" + 
				"-104.537000000000010\r\n" + 
				"-104.522200000000000\r\n" + 
				"-104.512500000000000\r\n" + 
				"-104.497500000000000\r\n" + 
				"-104.483999999999990\r\n" + 
				"-104.461000000000010\r\n" + 
				"-104.443400000000000\r\n" + 
				"-104.426000000000000\r\n" + 
				"-104.408999999999990\r\n" + 
				"-104.396500000000000\r\n" + 
				"-104.384999999999990\r\n" + 
				"-104.373499999999990\r\n" + 
				"-104.356999999999990\r\n" + 
				"-104.343666666666660\r\n" + 
				"-104.328333333333330\r\n" + 
				"-104.315000000000000\r\n" + 
				"-104.303000000000000\r\n" + 
				"-104.275599999999980\r\n" + 
				"-104.263000000000010\r\n" + 
				"-104.252000000000010\r\n" + 
				"-104.225500000000010\r\n" + 
				"-104.214499999999990\r\n" + 
				"-104.191857142857130\r\n" + 
				"-104.169500000000000\r\n" + 
				"-104.148625000000010\r\n" + 
				"-104.134249999999990\r\n" + 
				"-104.122818181818180\r\n" + 
				"-104.109600000000000\r\n" + 
				"-104.098499999999990\r\n" + 
				"-104.089500000000000\r\n" + 
				"-104.080499999999990\r\n" + 
				"-104.071500000000000\r\n" + 
				"-104.061999999999980\r\n" + 
				"-104.053500000000030\r\n" + 
				"-104.044500000000010\r\n" + 
				"-104.031000000000010\r\n" + 
				"-104.020500000000010\r\n" + 
				"-104.011500000000030\r\n" + 
				"-103.995642857142870\r\n" + 
				"-103.983375000000000\r\n" + 
				"-103.973000000000000\r\n" + 
				"-103.963666666666650\r\n" + 
				"-103.950571428571410\r\n" + 
				"-103.930750000000020\r\n" + 
				"-103.921000000000010\r\n" + 
				"-103.908999999999990\r\n" + 
				"-103.884999999999990\r\n" + 
				"-103.869750000000000\r\n" + 
				"-103.852499999999990\r\n" + 
				"-103.824249999999990\r\n" + 
				"-103.806000000000000\r\n" + 
				"-103.788750000000010\r\n" + 
				"-103.742500000000010\r\n" + 
				"-103.716999999999980\r\n" + 
				"-103.694666666666660\r\n" + 
				"-103.676500000000000\r\n" + 
				"-103.666000000000000\r\n" + 
				"-103.652000000000000\r\n" + 
				"-103.636000000000000\r\n" + 
				"-103.598666666666660\r\n" + 
				"-103.569333333333320\r\n" + 
				"-103.554500000000000\r\n" + 
				"-103.535750000000010\r\n" + 
				"-103.521500000000000\r\n" + 
				"-103.505000000000000\r\n" + 
				"-103.485000000000010\r\n" + 
				"-103.450999999999990\r\n" + 
				"-103.438999999999990\r\n" + 
				"-103.422500000000000\r\n" + 
				"-103.408000000000000\r\n" + 
				"-103.389500000000000\r\n" + 
				"-103.373600000000010\r\n" + 
				"-103.351333333333330\r\n" + 
				"-103.327000000000000\r\n" + 
				"-103.308833333333330\r\n" + 
				"-103.291000000000000\r\n" + 
				"-103.277499999999990\r\n" + 
				"-103.259000000000000\r\n" + 
				"-103.245499999999990\r\n" + 
				"-103.223600000000000\r\n" + 
				"-103.207799999999990\r\n" + 
				"-103.191000000000000\r\n" + 
				"-103.174200000000010\r\n" + 
				"-103.161500000000000\r\n" + 
				"-103.149666666666680\r\n" + 
				"-103.132000000000010\r\n" + 
				"-103.119250000000010\r\n" + 
				"-103.104545454545460\r\n" + 
				"-103.091818181818160\r\n" + 
				"-103.075583333333330\r\n" + 
				"-103.064500000000010\r\n" + 
				"-103.056000000000010\r\n" + 
				"-103.045500000000000\r\n" + 
				"-103.036500000000000\r\n" + 
				"-103.027818181818190\r\n" + 
				"-103.016499999999990\r\n" + 
				"-103.005249999999990\r\n" + 
				"-102.995000000000000\r\n" + 
				"-102.986000000000000\r\n" + 
				"-102.973499999999990\r\n" + 
				"-102.961111111111120\r\n" + 
				"-102.948285714285700\r\n" + 
				"-102.928571428571430\r\n" + 
				"-102.910499999999980\r\n" + 
				"-102.889999999999990\r\n" + 
				"-102.874750000000010\r\n" + 
				"-102.850571428571430\r\n" + 
				"-102.822000000000000\r\n" + 
				"-102.803000000000000\r\n" + 
				"-102.780000000000000\r\n" + 
				"-102.763000000000010\r\n" + 
				"-102.742000000000000\r\n" + 
				"-102.685400000000000\r\n" + 
				"-102.674499999999990\r\n" + 
				"-102.655000000000000\r\n" + 
				"-102.633000000000000\r\n" + 
				"-102.598999999999990\r\n" + 
				"-102.584499999999990\r\n" + 
				"-102.568500000000000\r\n" + 
				"-102.554333333333330\r\n" + 
				"-102.537333333333340\r\n" + 
				"-102.526500000000000\r\n" + 
				"-102.511500000000000\r\n" + 
				"-102.496250000000000\r\n" + 
				"-102.482000000000000\r\n" + 
				"-102.461333333333340\r\n" + 
				"-102.440000000000000\r\n" + 
				"-102.419000000000010\r\n" + 
				"-102.406000000000010\r\n" + 
				"-102.390999999999990\r\n" + 
				"-102.378500000000000\r\n" + 
				"-102.359000000000010\r\n" + 
				"-102.331200000000000\r\n" + 
				"-102.321000000000010\r\n" + 
				"-102.309333333333330\r\n" + 
				"-102.277500000000000\r\n" + 
				"-102.263000000000010\r\n" + 
				"-102.246799999999990\r\n" + 
				"-102.233999999999990\r\n" + 
				"-102.217800000000010\r\n" + 
				"-102.205166666666670\r\n" + 
				"-102.186666666666670\r\n" + 
				"-102.168500000000010\r\n" + 
				"-102.155400000000010\r\n" + 
				"-102.141333333333320\r\n" + 
				"-102.127727272727270\r\n" + 
				"-102.114285714285730\r\n" + 
				"-102.104000000000000\r\n" + 
				"-102.092000000000000\r\n" + 
				"-102.080500000000010\r\n" + 
				"-102.068500000000010\r\n" + 
				"-102.055923076923080\r\n" + 
				"-102.041599999999990\r\n" + 
				"-102.029000000000010\r\n" + 
				"-102.015500000000020\r\n" + 
				"-102.006500000000000\r\n" + 
				"-101.996500000000010\r\n" + 
				"-101.982874999999990\r\n" + 
				"-101.971499999999990\r\n" + 
				"-101.962125000000000\r\n" + 
				"-101.950999999999990\r\n" + 
				"-101.940250000000010\r\n" + 
				"-101.918600000000000\r\n" + 
				"-101.902999999999990\r\n" + 
				"-101.886249999999990\r\n" + 
				"-101.874500000000000\r\n" + 
				"-101.863000000000000\r\n" + 
				"-101.842249999999990\r\n" + 
				"-101.830000000000000\r\n" + 
				"-101.798750000000000\r\n" + 
				"-101.774666666666680\r\n" + 
				"-101.762000000000000\r\n" + 
				"-101.745000000000000\r\n" + 
				"-101.729999999999990\r\n" + 
				"-101.705000000000000\r\n" + 
				"-101.684200000000000\r\n" + 
				"-101.661200000000010\r\n" + 
				"-101.642500000000000\r\n" + 
				"-101.613999999999990\r\n" + 
				"-101.599500000000010\r\n" + 
				"-101.585600000000000\r\n" + 
				"-101.572000000000000\r\n" + 
				"-101.558250000000000\r\n" + 
				"-101.540666666666670\r\n" + 
				"-101.528500000000010\r\n" + 
				"-101.510750000000000\r\n" + 
				"-101.475750000000010\r\n" + 
				"-101.449500000000000\r\n" + 
				"-101.416666666666670\r\n" + 
				"-101.397000000000010\r\n" + 
				"-101.379000000000000\r\n" + 
				"-101.355500000000010\r\n" + 
				"-101.335000000000010\r\n" + 
				"-101.313500000000000\r\n" + 
				"-101.277333333333330\r\n" + 
				"-101.265000000000000\r\n" + 
				"-101.245000000000000\r\n" + 
				"-101.225333333333350\r\n" + 
				"-101.200666666666660\r\n" + 
				"-101.186333333333320\r\n" + 
				"-101.170333333333350\r\n" + 
				"-101.152999999999990\r\n" + 
				"-101.134600000000010\r\n" + 
				"-101.115166666666670\r\n" + 
				"-101.100500000000000\r\n" + 
				"-101.085499999999980\r\n" + 
				"-101.075000000000000\r\n" + 
				"-101.065500000000000\r\n" + 
				"-101.056500000000010\r\n" + 
				"-101.047500000000010\r\n" + 
				"-101.036500000000000\r\n" + 
				"-101.024500000000000\r\n" + 
				"-101.013000000000010\r\n" + 
				"-100.999636363636370\r\n" + 
				"-100.985846153846150\r\n" + 
				"-100.972875000000000\r\n" + 
				"-100.962142857142840\r\n" + 
				"-100.948500000000000\r\n" + 
				"-100.926666666666660\r\n" + 
				"-100.908571428571430\r\n" + 
				"-100.893499999999990\r\n" + 
				"-100.882000000000010\r\n" + 
				"-100.866666666666670\r\n" + 
				"-100.848000000000000\r\n" + 
				"-100.835000000000010\r\n" + 
				"-100.824000000000000\r\n" + 
				"-100.807500000000000\r\n" + 
				"-100.794000000000000\r\n" + 
				"-100.768999999999990\r\n" + 
				"-100.741999999999990\r\n" + 
				"-100.727999999999990\r\n" + 
				"-100.706999999999990\r\n" + 
				"-100.693500000000000\r\n" + 
				"-100.676600000000010\r\n" + 
				"-100.663500000000000\r\n" + 
				"-100.627000000000000\r\n" + 
				"-100.583333333333330\r\n" + 
				"-100.569999999999990\r\n" + 
				"-100.556000000000000\r\n" + 
				"-100.540500000000010\r\n" + 
				"-100.522250000000000\r\n" + 
				"-100.490500000000000\r\n" + 
				"-100.472666666666670\r\n" + 
				"-100.455199999999990\r\n" + 
				"-100.437500000000000\r\n" + 
				"-100.424000000000010\r\n" + 
				"-100.408999999999990\r\n" + 
				"-100.376000000000000\r\n" + 
				"-100.360999999999990\r\n" + 
				"-100.334999999999990\r\n" + 
				"-100.297000000000000\r\n" + 
				"-100.271249999999990\r\n" + 
				"-100.241999999999990\r\n" + 
				"-100.221166666666660\r\n" + 
				"-100.202999999999990\r\n" + 
				"-100.185999999999990\r\n" + 
				"-100.165400000000010\r\n" + 
				"-100.149000000000000\r\n" + 
				"-100.137714285714300\r\n" + 
				"-100.126000000000000\r\n" + 
				"-100.113636363636360\r\n" + 
				"-100.102250000000000\r\n" + 
				"-100.091500000000000\r\n" + 
				"-100.079500000000000\r\n" + 
				"-100.067500000000010\r\n" + 
				"-100.057000000000000\r\n" + 
				"-100.048500000000000\r\n" + 
				"-100.039500000000020\r\n" + 
				"-100.028499999999990\r\n" + 
				"-100.017000000000010\r\n" + 
				"-100.005500000000000\r\n" + 
				"-99.996500000000012\r\n" + 
				"-99.987545454545440\r\n" + 
				"-99.977000000000004\r\n" + 
				"-99.965000000000003\r\n" + 
				"-99.951666666666668\r\n" + 
				"-99.940666666666672\r\n" + 
				"-99.933199999999999\r\n" + 
				"-99.919000000000011\r\n" + 
				"-99.906499999999994\r\n" + 
				"-99.893500000000003\r\n" + 
				"-99.876400000000004\r\n" + 
				"-99.867666666666651\r\n" + 
				"-99.835499999999996\r\n" + 
				"-99.820000000000007\r\n" + 
				"-99.799666666666667\r\n" + 
				"-99.782499999999985\r\n" + 
				"-99.762666666666675\r\n" + 
				"-99.740499999999997\r\n" + 
				"-99.723333333333315\r\n" + 
				"-99.701666666666668\r\n" + 
				"-99.679499999999990\r\n" + 
				"-99.667000000000002\r\n" + 
				"-99.649500000000003\r\n" + 
				"-99.616999999999990\r\n" + 
				"-99.581333333333319\r\n" + 
				"-99.546399999999991\r\n" + 
				"-99.534374999999997\r\n" + 
				"-99.508499999999998\r\n" + 
				"-99.486999999999995\r\n" + 
				"-99.459999999999994\r\n" + 
				"-99.442250000000001\r\n" + 
				"-99.429000000000016\r\n" + 
				"-99.407666666666671\r\n" + 
				"-99.397666666666666\r\n" + 
				"-99.382333333333349\r\n" + 
				"-99.369000000000000\r\n" + 
				"-99.350999999999999\r\n" + 
				"-99.319999999999993\r\n" + 
				"-99.304499999999990\r\n" + 
				"-99.290000000000006\r\n" + 
				"-99.270499999999998\r\n" + 
				"-99.249666666666670\r\n" + 
				"-99.240000000000009\r\n" + 
				"-99.224999999999994\r\n" + 
				"-99.206666666666663\r\n" + 
				"-99.186250000000001\r\n" + 
				"-99.173499999999990\r\n" + 
				"-99.159333333333336\r\n" + 
				"-99.143500000000003\r\n" + 
				"-99.129142857142853\r\n" + 
				"-99.116000000000000\r\n" + 
				"-99.103714285714290\r\n" + 
				"-99.090999999999994\r\n" + 
				"-99.076071428571410\r\n" + 
				"-99.063000000000002\r\n" + 
				"-99.054500000000004\r\n" + 
				"-99.046000000000006\r\n" + 
				"-99.033500000000004\r\n" + 
				"-99.022500000000008\r\n" + 
				"-99.012500000000003\r\n" + 
				"-99.003499999999988\r\n" + 
				"-98.994500000000002\r\n" + 
				"-98.983666666666679\r\n" + 
				"-98.972444444444434\r\n" + 
				"-98.961666666666659\r\n" + 
				"-98.947999999999993\r\n" + 
				"-98.934750000000008\r\n" + 
				"-98.919799999999995\r\n" + 
				"-98.887833333333333\r\n" + 
				"-98.864499999999992\r\n" + 
				"-98.841750000000005\r\n" + 
				"-98.815666666666672\r\n" + 
				"-98.806250000000006\r\n" + 
				"-98.786250000000010\r\n" + 
				"-98.771500000000003\r\n" + 
				"-98.756500000000003\r\n" + 
				"-98.730999999999995\r\n" + 
				"-98.719999999999999\r\n" + 
				"-98.706666666666663\r\n" + 
				"-98.688333333333333\r\n" + 
				"-98.659000000000006\r\n" + 
				"-98.646999999999991\r\n" + 
				"-98.630333333333340\r\n" + 
				"-98.620000000000005\r\n" + 
				"-98.595666666666659\r\n" + 
				"-98.575600000000009\r\n" + 
				"-98.559333333333328\r\n" + 
				"-98.536499999999990\r\n" + 
				"-98.516000000000005\r\n" + 
				"-98.484250000000003\r\n" + 
				"-98.450000000000003\r\n" + 
				"-98.432500000000005\r\n" + 
				"-98.417999999999992\r\n" + 
				"-98.393333333333331\r\n" + 
				"-98.361999999999995\r\n" + 
				"-98.341000000000008\r\n" + 
				"-98.311400000000006\r\n" + 
				"-98.289285714285711\r\n" + 
				"-98.258500000000012\r\n" + 
				"-98.238000000000000\r\n" + 
				"-98.221750000000000\r\n" + 
				"-98.208571428571432\r\n" + 
				"-98.188000000000017\r\n" + 
				"-98.164625000000001\r\n" + 
				"-98.142750000000007\r\n" + 
				"-98.129166666666663\r\n" + 
				"-98.117000000000004\r\n" + 
				"-98.107200000000006\r\n" + 
				"-98.098500000000001\r\n" + 
				"-98.087999999999994\r\n" + 
				"-98.074500000000000\r\n" + 
				"-98.065500000000000\r\n" + 
				"-98.057000000000002\r\n" + 
				"-98.044000000000025\r\n" + 
				"-98.030500000000018\r\n" + 
				"-98.019555555555570\r\n" + 
				"-98.006500000000003\r\n" + 
				"-97.993444444444449\r\n" + 
				"-97.979714285714280\r\n" + 
				"-97.963833333333341\r\n" + 
				"-97.953999999999994\r\n" + 
				"-97.935500000000005\r\n" + 
				"-97.916600000000003\r\n" + 
				"-97.902333333333331\r\n" + 
				"-97.879833333333337\r\n" + 
				"-97.863500000000002\r\n" + 
				"-97.817999999999998\r\n" + 
				"-97.788666666666657\r\n" + 
				"-97.765000000000001\r\n" + 
				"-97.751499999999993\r\n" + 
				"-97.739333333333320\r\n" + 
				"-97.718333333333320\r\n" + 
				"-97.691666666666663\r\n" + 
				"-97.672000000000011\r\n" + 
				"-97.658999999999992\r\n" + 
				"-97.641500000000008\r\n" + 
				"-97.622999999999990\r\n" + 
				"-97.608199999999997\r\n" + 
				"-97.592333333333329\r\n" + 
				"-97.572000000000003\r\n" + 
				"-97.550666666666686\r\n" + 
				"-97.535166666666669\r\n" + 
				"-97.521000000000001\r\n" + 
				"-97.504500000000007\r\n" + 
				"-97.489000000000004\r\n" + 
				"-97.455999999999989\r\n" + 
				"-97.432200000000009\r\n" + 
				"-97.411500000000004\r\n" + 
				"-97.392499999999998\r\n" + 
				"-97.376999999999995\r\n" + 
				"-97.363999999999990\r\n" + 
				"-97.339333333333329\r\n" + 
				"-97.325000000000003\r\n" + 
				"-97.293000000000006\r\n" + 
				"-97.281000000000006\r\n" + 
				"-97.248249999999999\r\n" + 
				"-97.229166666666671\r\n" + 
				"-97.211999999999989\r\n" + 
				"-97.197800000000001\r\n" + 
				"-97.186999999999983\r\n" + 
				"-97.172500000000014\r\n" + 
				"-97.157285714285720\r\n" + 
				"-97.148500000000013\r\n" + 
				"-97.135333333333335\r\n" + 
				"-97.124285714285719\r\n" + 
				"-97.111785714285730\r\n" + 
				"-97.096583333333328\r\n" + 
				"-97.085999999999999\r\n" + 
				"-97.073500000000024\r\n" + 
				"-97.059999999999988\r\n" + 
				"-97.048499999999990\r\n" + 
				"-97.036500000000004\r\n" + 
				"-97.025666666666666\r\n" + 
				"-97.011466666666678\r\n" + 
				"-96.997500000000002\r\n" + 
				"-96.986111111111114\r\n" + 
				"-96.971071428571392\r\n" + 
				"-96.956000000000003\r\n" + 
				"-96.943833333333330\r\n" + 
				"-96.933999999999997\r\n" + 
				"-96.919666666666672\r\n" + 
				"-96.904999999999987\r\n" + 
				"-96.884428571428572\r\n" + 
				"-96.866500000000002\r\n" + 
				"-96.851500000000001\r\n" + 
				"-96.838999999999999\r\n" + 
				"-96.824500000000000\r\n" + 
				"-96.788333333333341\r\n" + 
				"-96.773250000000004\r\n" + 
				"-96.756333333333330\r\n" + 
				"-96.742400000000004\r\n" + 
				"-96.723666666666688\r\n" + 
				"-96.705749999999995\r\n" + 
				"-96.692999999999998\r\n" + 
				"-96.679666666666662\r\n" + 
				"-96.658500000000004\r\n" + 
				"-96.640666666666675\r\n" + 
				"-96.628000000000000\r\n" + 
				"-96.611333333333334\r\n" + 
				"-96.599666666666664\r\n" + 
				"-96.585599999999999\r\n" + 
				"-96.568500000000000\r\n" + 
				"-96.552799999999991\r\n" + 
				"-96.533500000000004\r\n" + 
				"-96.514249999999990\r\n" + 
				"-96.497999999999990\r\n" + 
				"-96.487800000000007\r\n" + 
				"-96.457166666666652\r\n" + 
				"-96.429000000000002\r\n" + 
				"-96.402999999999992\r\n" + 
				"-96.380500000000012\r\n" + 
				"-96.358499999999992\r\n" + 
				"-96.332999999999998\r\n" + 
				"-96.316500000000005\r\n" + 
				"-96.280799999999985\r\n" + 
				"-96.270000000000010\r\n" + 
				"-96.258000000000010\r\n" + 
				"-96.246000000000009\r\n" + 
				"-96.233499999999992\r\n" + 
				"-96.221400000000003\r\n" + 
				"-96.200000000000003\r\n" + 
				"-96.185000000000002\r\n" + 
				"-96.170857142857145\r\n" + 
				"-96.148500000000013\r\n" + 
				"-96.138000000000005\r\n" + 
				"-96.125500000000002\r\n" + 
				"-96.114000000000004\r\n" + 
				"-96.099599999999995\r\n" + 
				"-96.085499999999996\r\n" + 
				"-96.074500000000000\r\n" + 
				"-96.063000000000002\r\n" + 
				"-96.050749999999994\r\n" + 
				"-96.037499999999980\r\n" + 
				"-96.027000000000015\r\n" + 
				"-96.017499999999984\r\n" + 
				"-96.005499999999998\r\n" + 
				"-95.993499999999997\r\n" + 
				"-95.983000000000004\r\n" + 
				"-95.972999999999999\r\n" + 
				"-95.963499999999996\r\n" + 
				"-95.951909090909098\r\n" + 
				"-95.933875000000000\r\n" + 
				"-95.914999999999992\r\n" + 
				"-95.903000000000006\r\n" + 
				"-95.883749999999992\r\n" + 
				"-95.864999999999995\r\n" + 
				"-95.853500000000011\r\n" + 
				"-95.841000000000008\r\n" + 
				"-95.831000000000003\r\n" + 
				"-95.819666666666663\r\n" + 
				"-95.794499999999999\r\n" + 
				"-95.781666666666680\r\n" + 
				"-95.770200000000003\r\n" + 
				"-95.755666666666670\r\n" + 
				"-95.738142857142861\r\n" + 
				"-95.717600000000004\r\n" + 
				"-95.700800000000001\r\n" + 
				"-95.688666666666677\r\n" + 
				"-95.667666666666662\r\n" + 
				"-95.653666666666666\r\n" + 
				"-95.637333333333331\r\n" + 
				"-95.603999999999999\r\n" + 
				"-95.580333333333328\r\n" + 
				"-95.560999999999993\r\n" + 
				"-95.537000000000006\r\n" + 
				"-95.518400000000000\r\n" + 
				"-95.504999999999995\r\n" + 
				"-95.468000000000004\r\n" + 
				"-95.446333333333328\r\n" + 
				"-95.427500000000009\r\n" + 
				"-95.412000000000006\r\n" + 
				"-95.382400000000004\r\n" + 
				"-95.364375000000010\r\n" + 
				"-95.336999999999989\r\n" + 
				"-95.316999999999993\r\n" + 
				"-95.289500000000004\r\n" + 
				"-95.270333333333326\r\n" + 
				"-95.240000000000009\r\n" + 
				"-95.221249999999998\r\n" + 
				"-95.205249999999992\r\n" + 
				"-95.192166666666665\r\n" + 
				"-95.173999999999992\r\n" + 
				"-95.161249999999995\r\n" + 
				"-95.152199999999993\r\n" + 
				"-95.135999999999981\r\n" + 
				"-95.124000000000009\r\n" + 
				"-95.110923076923100\r\n" + 
				"-95.097500000000011\r\n" + 
				"-95.085000000000008\r\n" + 
				"-95.073599999999971\r\n" + 
				"-95.061500000000009\r\n" + 
				"-95.048000000000002\r\n" + 
				"-95.039500000000018\r\n" + 
				"-95.030500000000018\r\n" + 
				"-95.018500000000003\r\n" + 
				"-95.006500000000003\r\n" + 
				"-94.992000000000004\r\n" + 
				"-94.977299999999985\r\n" + 
				"-94.961699999999993\r\n" + 
				"-94.944333333333319\r\n" + 
				"-94.930666666666653\r\n" + 
				"-94.912666666666667\r\n" + 
				"-94.895333333333326\r\n" + 
				"-94.871333333333340\r\n" + 
				"-94.863399999999999\r\n" + 
				"-94.847166666666681\r\n" + 
				"-94.829999999999998\r\n" + 
				"-94.808250000000015\r\n" + 
				"-94.795500000000004\r\n" + 
				"-94.783999999999992\r\n" + 
				"-94.743333333333339\r\n" + 
				"-94.721999999999994\r\n" + 
				"-94.706000000000003\r\n" + 
				"-94.692499999999995\r\n" + 
				"-94.667333333333332\r\n" + 
				"-94.655499999999989\r\n" + 
				"-94.640000000000001\r\n" + 
				"-94.622000000000000\r\n" + 
				"-94.606500000000011\r\n" + 
				"-94.591999999999999\r\n" + 
				"-94.558000000000007\r\n" + 
				"-94.531999999999996\r\n" + 
				"-94.495000000000005\r\n" + 
				"-94.478999999999999\r\n" + 
				"-94.464500000000001\r\n" + 
				"-94.447333333333333\r\n" + 
				"-94.424666666666667\r\n" + 
				"-94.396000000000001\r\n" + 
				"-94.380499999999998\r\n" + 
				"-94.357666666666660\r\n" + 
				"-94.341999999999985\r\n" + 
				"-94.325000000000003\r\n" + 
				"-94.302500000000009\r\n" + 
				"-94.286000000000001\r\n" + 
				"-94.271500000000003\r\n" + 
				"-94.257499999999993\r\n" + 
				"-94.240600000000001\r\n" + 
				"-94.222999999999999\r\n" + 
				"-94.199666666666658\r\n" + 
				"-94.185714285714283\r\n" + 
				"-94.165714285714301\r\n" + 
				"-94.147800000000004\r\n" + 
				"-94.126499999999993\r\n" + 
				"-94.113500000000002\r\n" + 
				"-94.100999999999985\r\n" + 
				"-94.087538461538443\r\n" + 
				"-94.075500000000005\r\n" + 
				"-94.065999999999988\r\n" + 
				"-94.055999999999983\r\n" + 
				"-94.044000000000025\r\n" + 
				"-94.030500000000004\r\n" + 
				"-94.018500000000003\r\n" + 
				"-94.006500000000003\r\n" + 
				"-93.996571428571428\r\n" + 
				"-93.982230769230753\r\n" + 
				"-93.969499999999996\r\n" + 
				"-93.959333333333333\r\n" + 
				"-93.947699999999983\r\n" + 
				"-93.935666666666677\r\n" + 
				"-93.923800000000000\r\n" + 
				"-93.911500000000004\r\n" + 
				"-93.888800000000003\r\n" + 
				"-93.851500000000001\r\n" + 
				"-93.837999999999994\r\n" + 
				"-93.828000000000003\r\n" + 
				"-93.819250000000011\r\n" + 
				"-93.802999999999997\r\n" + 
				"-93.788600000000002\r\n" + 
				"-93.751000000000005\r\n" + 
				"-93.729333333333329\r\n" + 
				"-93.701999999999998\r\n" + 
				"-93.685000000000002\r\n" + 
				"-93.674000000000007\r\n" + 
				"-93.655333333333331\r\n" + 
				"-93.628500000000003\r\n" + 
				"-93.618333333333339\r\n" + 
				"-93.599666666666664\r\n" + 
				"-93.569000000000003\r\n" + 
				"-93.552750000000003\r\n" + 
				"-93.539000000000001\r\n" + 
				"-93.518249999999995\r\n" + 
				"-93.504999999999995\r\n" + 
				"-93.486000000000004\r\n" + 
				"-93.456500000000005\r\n" + 
				"-93.444500000000005\r\n" + 
				"-93.430000000000007\r\n" + 
				"-93.397000000000006\r\n" + 
				"-93.379333333333321\r\n" + 
				"-93.365666666666655\r\n" + 
				"-93.351749999999996\r\n" + 
				"-93.337000000000003\r\n" + 
				"-93.316800000000015\r\n" + 
				"-93.305000000000007\r\n" + 
				"-93.288666666666657\r\n" + 
				"-93.267999999999986\r\n" + 
				"-93.256200000000007\r\n" + 
				"-93.231499999999983\r\n" + 
				"-93.214799999999997\r\n" + 
				"-93.204000000000008\r\n" + 
				"-93.188999999999993\r\n" + 
				"-93.166999999999987\r\n" + 
				"-93.152285714285725\r\n" + 
				"-93.140500000000003\r\n" + 
				"-93.125250000000008\r\n" + 
				"-93.111444444444459\r\n" + 
				"-93.098499999999987\r\n" + 
				"-93.087500000000006\r\n" + 
				"-93.077499999999986\r\n" + 
				"-93.065999999999988\r\n" + 
				"-93.057500000000005\r\n" + 
				"-93.048499999999990\r\n" + 
				"-93.039500000000018\r\n" + 
				"-93.030500000000004\r\n" + 
				"-93.020000000000010\r\n" + 
				"-93.006500000000003\r\n" + 
				"-92.993499999999997\r\n" + 
				"-92.981142857142871\r\n" + 
				"-92.962545454545463\r\n" + 
				"-92.949454545454557\r\n" + 
				"-92.928333333333327\r\n" + 
				"-92.914999999999992\r\n" + 
				"-92.897000000000006\r\n" + 
				"-92.887000000000000\r\n" + 
				"-92.873750000000001\r\n" + 
				"-92.854500000000002\r\n" + 
				"-92.835999999999984\r\n" + 
				"-92.820499999999996\r\n" + 
				"-92.801000000000002\r\n" + 
				"-92.784333333333336\r\n" + 
				"-92.774333333333331\r\n" + 
				"-92.761250000000018\r\n" + 
				"-92.741333333333330\r\n" + 
				"-92.729250000000008\r\n" + 
				"-92.712599999999995\r\n" + 
				"-92.696333333333328\r\n" + 
				"-92.679333333333332\r\n" + 
				"-92.667333333333332\r\n" + 
				"-92.650000000000006\r\n" + 
				"-92.617000000000004\r\n" + 
				"-92.600999999999999\r\n" + 
				"-92.583600000000004\r\n" + 
				"-92.562000000000012\r\n" + 
				"-92.552750000000003\r\n" + 
				"-92.542000000000002\r\n" + 
				"-92.528428571428577\r\n" + 
				"-92.503000000000000\r\n" + 
				"-92.479666666666674\r\n" + 
				"-92.449999999999989\r\n" + 
				"-92.430250000000001\r\n" + 
				"-92.408600000000007\r\n" + 
				"-92.393000000000001\r\n" + 
				"-92.377499999999998\r\n" + 
				"-92.361999999999995\r\n" + 
				"-92.343249999999998\r\n" + 
				"-92.329499999999996\r\n" + 
				"-92.308500000000009\r\n" + 
				"-92.297499999999999\r\n" + 
				"-92.284500000000008\r\n" + 
				"-92.265500000000003\r\n" + 
				"-92.250499999999988\r\n" + 
				"-92.234000000000009\r\n" + 
				"-92.206999999999994\r\n" + 
				"-92.194999999999993\r\n" + 
				"-92.184333333333328\r\n" + 
				"-92.168285714285716\r\n" + 
				"-92.147999999999996\r\n" + 
				"-92.138142857142853\r\n" + 
				"-92.124222222222244\r\n" + 
				"-92.108000000000004\r\n" + 
				"-92.096000000000004\r\n" + 
				"-92.086499999999987\r\n" + 
				"-92.076800000000006\r\n" + 
				"-92.064666666666668\r\n" + 
				"-92.048499999999990\r\n" + 
				"-92.037999999999997\r\n" + 
				"-92.027500000000018\r\n" + 
				"-92.016299999999987\r\n" + 
				"-92.001692307692309\r\n" + 
				"-91.988500000000002\r\n" + 
				"-91.976500000000001\r\n" + 
				"-91.960571428571441\r\n" + 
				"-91.944400000000002\r\n" + 
				"-91.931333333333342\r\n" + 
				"-91.922000000000011\r\n" + 
				"-91.907666666666671\r\n" + 
				"-91.891000000000005\r\n" + 
				"-91.876199999999997\r\n" + 
				"-91.843000000000004\r\n" + 
				"-91.824600000000004\r\n" + 
				"-91.805833333333339\r\n" + 
				"-91.788499999999999\r\n" + 
				"-91.763499999999993\r\n" + 
				"-91.747000000000000\r\n" + 
				"-91.730750000000000\r\n" + 
				"-91.715166666666661\r\n" + 
				"-91.693857142857141\r\n" + 
				"-91.673000000000002\r\n" + 
				"-91.629000000000005\r\n" + 
				"-91.613000000000000\r\n" + 
				"-91.596800000000002\r\n" + 
				"-91.575999999999993\r\n" + 
				"-91.562250000000006\r\n" + 
				"-91.550500000000000\r\n" + 
				"-91.537142857142854\r\n" + 
				"-91.520333333333340\r\n" + 
				"-91.501249999999999\r\n" + 
				"-91.483333333333334\r\n" + 
				"-91.470666666666659\r\n" + 
				"-91.456000000000003\r\n" + 
				"-91.435000000000002\r\n" + 
				"-91.409500000000008\r\n" + 
				"-91.391400000000004\r\n" + 
				"-91.376500000000007\r\n" + 
				"-91.364000000000004\r\n" + 
				"-91.344749999999991\r\n" + 
				"-91.315666666666672\r\n" + 
				"-91.301999999999992\r\n" + 
				"-91.281000000000006\r\n" + 
				"-91.266500000000008\r\n" + 
				"-91.247500000000002\r\n" + 
				"-91.235999999999990\r\n" + 
				"-91.222999999999999\r\n" + 
				"-91.206333333333347\r\n" + 
				"-91.193600000000004\r\n" + 
				"-91.168000000000006\r\n" + 
				"-91.148000000000010\r\n" + 
				"-91.134999999999991\r\n" + 
				"-91.125000000000000\r\n" + 
				"-91.116000000000000\r\n" + 
				"-91.101799999999997\r\n" + 
				"-91.093000000000004\r\n" + 
				"-91.083500000000001\r\n" + 
				"-91.074500000000000\r\n" + 
				"-91.063555555555553\r\n" + 
				"-91.051500000000019\r\n" + 
				"-91.041499999999999\r\n" + 
				"-91.029499999999999\r\n" + 
				"-91.017300000000006\r\n" + 
				"-91.006500000000017\r\n" + 
				"-90.995333333333335\r\n" + 
				"-90.981999999999985\r\n" + 
				"-90.973250000000007\r\n" + 
				"-90.962666666666664\r\n" + 
				"-90.953000000000003\r\n" + 
				"-90.939250000000001\r\n" + 
				"-90.928333333333327\r\n" + 
				"-90.911499999999990\r\n" + 
				"-90.901399999999995\r\n" + 
				"-90.890000000000001\r\n" + 
				"-90.870800000000003\r\n" + 
				"-90.858499999999992\r\n" + 
				"-90.842250000000007\r\n" + 
				"-90.822000000000003\r\n" + 
				"-90.805000000000007\r\n" + 
				"-90.792000000000002\r\n" + 
				"-90.777000000000001\r\n" + 
				"-90.762499999999989\r\n" + 
				"-90.745499999999993\r\n" + 
				"-90.724999999999994\r\n" + 
				"-90.705999999999989\r\n" + 
				"-90.692999999999998\r\n" + 
				"-90.677600000000012\r\n" + 
				"-90.653000000000006\r\n" + 
				"-90.631000000000014\r\n" + 
				"-90.615000000000009\r\n" + 
				"-90.597499999999997\r\n" + 
				"-90.582400000000007\r\n" + 
				"-90.562999999999988\r\n" + 
				"-90.540500000000009\r\n" + 
				"-90.530749999999998\r\n" + 
				"-90.513666666666666\r\n" + 
				"-90.497000000000000\r\n" + 
				"-90.467500000000001\r\n" + 
				"-90.451333333333324\r\n" + 
				"-90.436000000000007\r\n" + 
				"-90.417000000000002\r\n" + 
				"-90.398249999999990\r\n" + 
				"-90.385499999999993\r\n" + 
				"-90.370333333333335\r\n" + 
				"-90.353800000000007\r\n" + 
				"-90.341999999999999\r\n" + 
				"-90.326200000000000\r\n" + 
				"-90.302800000000005\r\n" + 
				"-90.284000000000006\r\n" + 
				"-90.269999999999996\r\n" + 
				"-90.253000000000014\r\n" + 
				"-90.228666666666655\r\n" + 
				"-90.213999999999999\r\n" + 
				"-90.199749999999995\r\n" + 
				"-90.177999999999997\r\n" + 
				"-90.164000000000001\r\n" + 
				"-90.147499999999994\r\n" + 
				"-90.131000000000000\r\n" + 
				"-90.119428571428571\r\n" + 
				"-90.101444444444439\r\n" + 
				"-90.091999999999985\r\n" + 
				"-90.083099999999988\r\n" + 
				"-90.069999999999993\r\n" + 
				"-90.058500000000009\r\n" + 
				"-90.048000000000002\r\n" + 
				"-90.031499999999994\r\n" + 
				"-90.017499999999998\r\n" + 
				"-90.008500000000012\r\n" + 
				"-89.999499999999998\r\n" + 
				"-89.988333333333330\r\n" + 
				"-89.978999999999999\r\n" + 
				"-89.970555555555563\r\n" + 
				"-89.960500000000010\r\n" + 
				"-89.951300000000003\r\n" + 
				"-89.937857142857141\r\n" + 
				"-89.921500000000009\r\n" + 
				"-89.901499999999999\r\n" + 
				"-89.889000000000010\r\n" + 
				"-89.876599999999996\r\n" + 
				"-89.866199999999992\r\n" + 
				"-89.853666666666655\r\n" + 
				"-89.833500000000015\r\n" + 
				"-89.818500000000000\r\n" + 
				"-89.790750000000003\r\n" + 
				"-89.755499999999998\r\n" + 
				"-89.740500000000011\r\n" + 
				"-89.719666666666669\r\n" + 
				"-89.699500000000000\r\n" + 
				"-89.681142857142859\r\n" + 
				"-89.663799999999995\r\n" + 
				"-89.653666666666666\r\n" + 
				"-89.618666666666670\r\n" + 
				"-89.602600000000010\r\n" + 
				"-89.579999999999998\r\n" + 
				"-89.563999999999993\r\n" + 
				"-89.543999999999997\r\n" + 
				"-89.533799999999999\r\n" + 
				"-89.519600000000011\r\n" + 
				"-89.499000000000009\r\n" + 
				"-89.476499999999987\r\n" + 
				"-89.452333333333343\r\n" + 
				"-89.423000000000002\r\n" + 
				"-89.409999999999997\r\n" + 
				"-89.394000000000005\r\n" + 
				"-89.375666666666675\r\n" + 
				"-89.365999999999985\r\n" + 
				"-89.355999999999995\r\n" + 
				"-89.340999999999994\r\n" + 
				"-89.329333333333338\r\n" + 
				"-89.319249999999997\r\n" + 
				"-89.306500000000000\r\n" + 
				"-89.269666666666680\r\n" + 
				"-89.251999999999995\r\n" + 
				"-89.240666666666655\r\n" + 
				"-89.218333333333320\r\n" + 
				"-89.197666666666677\r\n" + 
				"-89.186666666666667\r\n" + 
				"-89.167333333333332\r\n" + 
				"-89.158000000000001\r\n" + 
				"-89.145666666666671\r\n" + 
				"-89.131625000000014\r\n" + 
				"-89.118333333333325\r\n" + 
				"-89.109888888888889\r\n" + 
				"-89.097999999999999\r\n" + 
				"-89.085000000000008\r\n" + 
				"-89.075714285714284\r\n" + 
				"-89.065999999999988\r\n" + 
				"-89.052999999999983\r\n" + 
				"-89.038000000000025\r\n" + 
				"-89.024499999999989\r\n" + 
				"-89.012500000000003\r\n" + 
				"-89.000000000000000\r\n" + 
				"-88.989142857142852\r\n" + 
				"-88.978500000000011\r\n" + 
				"-88.968499999999992\r\n" + 
				"-88.959624999999988\r\n" + 
				"-88.948142857142855\r\n" + 
				"-88.935499999999990\r\n" + 
				"-88.918250000000000\r\n" + 
				"-88.903666666666666\r\n" + 
				"-88.891999999999996\r\n" + 
				"-88.865571428571442\r\n" + 
				"-88.854250000000008\r\n" + 
				"-88.842750000000009\r\n" + 
				"-88.823999999999998\r\n" + 
				"-88.809666666666658\r\n" + 
				"-88.788000000000011\r\n" + 
				"-88.771666666666661\r\n" + 
				"-88.751333333333335\r\n" + 
				"-88.739333333333320\r\n" + 
				"-88.712000000000003\r\n" + 
				"-88.674999999999997\r\n" + 
				"-88.665000000000006\r\n" + 
				"-88.646999999999991\r\n" + 
				"-88.609499999999997\r\n" + 
				"-88.588000000000008\r\n" + 
				"-88.565000000000012\r\n" + 
				"-88.546999999999997\r\n" + 
				"-88.526499999999999\r\n" + 
				"-88.512333333333331\r\n" + 
				"-88.480000000000004\r\n" + 
				"-88.451999999999998\r\n" + 
				"-88.436749999999989\r\n" + 
				"-88.416499999999999\r\n" + 
				"-88.395499999999998\r\n" + 
				"-88.377000000000010\r\n" + 
				"-88.356799999999993\r\n" + 
				"-88.342249999999993\r\n" + 
				"-88.319999999999993\r\n" + 
				"-88.303999999999988\r\n" + 
				"-88.290999999999997\r\n" + 
				"-88.280333333333331\r\n" + 
				"-88.263142857142853\r\n" + 
				"-88.245999999999995\r\n" + 
				"-88.235142857142861\r\n" + 
				"-88.225249999999988\r\n" + 
				"-88.210749999999990\r\n" + 
				"-88.191000000000003\r\n" + 
				"-88.168333333333337\r\n" + 
				"-88.154499999999999\r\n" + 
				"-88.138500000000008\r\n" + 
				"-88.126166666666677\r\n" + 
				"-88.114499999999992\r\n" + 
				"-88.099777777777774\r\n" + 
				"-88.087500000000006\r\n" + 
				"-88.076999999999998\r\n" + 
				"-88.065999999999988\r\n" + 
				"-88.057500000000005\r\n" + 
				"-88.048499999999990\r\n" + 
				"-88.037999999999997\r\n" + 
				"-88.027500000000018\r\n" + 
				"-88.018500000000003\r\n" + 
				"-88.010000000000005\r\n" + 
				"-88.000500000000002\r\n" + 
				"-87.991500000000016\r\n" + 
				"-87.977846153846130\r\n" + 
				"-87.962500000000006\r\n" + 
				"-87.953000000000003\r\n" + 
				"-87.931000000000012\r\n" + 
				"-87.914666666666662\r\n" + 
				"-87.890666666666675\r\n" + 
				"-87.878500000000003\r\n" + 
				"-87.864999999999995\r\n" + 
				"-87.852333333333334\r\n" + 
				"-87.833333333333329\r\n" + 
				"-87.819333333333347\r\n" + 
				"-87.800000000000011\r\n" + 
				"-87.779666666666671\r\n" + 
				"-87.769000000000005\r\n" + 
				"-87.757000000000005\r\n" + 
				"-87.721999999999994\r\n" + 
				"-87.677999999999997\r\n" + 
				"-87.661000000000001\r\n" + 
				"-87.634166666666673\r\n" + 
				"-87.619000000000000\r\n" + 
				"-87.600499999999997\r\n" + 
				"-87.573999999999998\r\n" + 
				"-87.559500000000014\r\n" + 
				"-87.540999999999997\r\n" + 
				"-87.526749999999993\r\n" + 
				"-87.513333333333335\r\n" + 
				"-87.503000000000000\r\n" + 
				"-87.476499999999987\r\n" + 
				"-87.426666666666662\r\n" + 
				"-87.402500000000003\r\n" + 
				"-87.385750000000002\r\n" + 
				"-87.370000000000005\r\n" + 
				"-87.357666666666660\r\n" + 
				"-87.343999999999994\r\n" + 
				"-87.333500000000001\r\n" + 
				"-87.316400000000002\r\n" + 
				"-87.298000000000002\r\n" + 
				"-87.276000000000010\r\n" + 
				"-87.261666666666656\r\n" + 
				"-87.245750000000001\r\n" + 
				"-87.221000000000004\r\n" + 
				"-87.208857142857156\r\n" + 
				"-87.193999999999988\r\n" + 
				"-87.176000000000016\r\n" + 
				"-87.155333333333331\r\n" + 
				"-87.135999999999996\r\n" + 
				"-87.125285714285724\r\n" + 
				"-87.114199999999997\r\n" + 
				"-87.104250000000008\r\n" + 
				"-87.094666666666669\r\n" + 
				"-87.084166666666661\r\n" + 
				"-87.072500000000005\r\n" + 
				"-87.061499999999995\r\n" + 
				"-87.051500000000019\r\n" + 
				"-87.039500000000018\r\n" + 
				"-87.030500000000004\r\n" + 
				"-87.021500000000003\r\n" + 
				"-87.009499999999989\r\n" + 
				"-86.995500000000007\r\n" + 
				"-86.983499999999992\r\n" + 
				"-86.964545454545444\r\n" + 
				"-86.952999999999989\r\n" + 
				"-86.938500000000005\r\n" + 
				"-86.923749999999998\r\n" + 
				"-86.907499999999999\r\n" + 
				"-86.886142857142858\r\n" + 
				"-86.872749999999996\r\n" + 
				"-86.856999999999999\r\n" + 
				"-86.841333333333338\r\n" + 
				"-86.823999999999998\r\n" + 
				"-86.808000000000007\r\n" + 
				"-86.785499999999999\r\n" + 
				"-86.772333333333336\r\n" + 
				"-86.755500000000012\r\n" + 
				"-86.738249999999994\r\n" + 
				"-86.726000000000013\r\n" + 
				"-86.701333333333324\r\n" + 
				"-86.682500000000005\r\n" + 
				"-86.661500000000004\r\n" + 
				"-86.646249999999995\r\n" + 
				"-86.630500000000012\r\n" + 
				"-86.597000000000008\r\n" + 
				"-86.570499999999996\r\n" + 
				"-86.548800000000000\r\n" + 
				"-86.531999999999996\r\n" + 
				"-86.511799999999994\r\n" + 
				"-86.480500000000006\r\n" + 
				"-86.458142857142860\r\n" + 
				"-86.437749999999994\r\n" + 
				"-86.414500000000004\r\n" + 
				"-86.395333333333326\r\n" + 
				"-86.369000000000000\r\n" + 
				"-86.351333333333329\r\n" + 
				"-86.332999999999998\r\n" + 
				"-86.319800000000001\r\n" + 
				"-86.287999999999997\r\n" + 
				"-86.273333333333326\r\n" + 
				"-86.264666666666656\r\n" + 
				"-86.249333333333325\r\n" + 
				"-86.222999999999999\r\n" + 
				"-86.204833333333340\r\n" + 
				"-86.189250000000001\r\n" + 
				"-86.177333333333351\r\n" + 
				"-86.165571428571440\r\n" + 
				"-86.144624999999991\r\n" + 
				"-86.130833333333328\r\n" + 
				"-86.117666666666665\r\n" + 
				"-86.106999999999985\r\n" + 
				"-86.094000000000008\r\n" + 
				"-86.078000000000003\r\n" + 
				"-86.065999999999988\r\n" + 
				"-86.052999999999983\r\n" + 
				"-86.039499999999990\r\n" + 
				"-86.028999999999996\r\n" + 
				"-86.018500000000003\r\n" + 
				"-86.006500000000003\r\n" + 
				"-85.995400000000004\r\n" + 
				"-85.981999999999985\r\n" + 
				"-85.973500000000001\r\n" + 
				"-85.964545454545458\r\n" + 
				"-85.950199999999995\r\n" + 
				"-85.939555555555557\r\n" + 
				"-85.924500000000009\r\n" + 
				"-85.906857142857149\r\n" + 
				"-85.891999999999996\r\n" + 
				"-85.879500000000007\r\n" + 
				"-85.861000000000004\r\n" + 
				"-85.847499999999997\r\n" + 
				"-85.817000000000007\r\n" + 
				"-85.802500000000009\r\n" + 
				"-85.766999999999996\r\n" + 
				"-85.727000000000004\r\n" + 
				"-85.710999999999999\r\n" + 
				"-85.685333333333347\r\n" + 
				"-85.665999999999997\r\n" + 
				"-85.654799999999994\r\n" + 
				"-85.640000000000001\r\n" + 
				"-85.620666666666679\r\n" + 
				"-85.594999999999999\r\n" + 
				"-85.564499999999995\r\n" + 
				"-85.538000000000011\r\n" + 
				"-85.525599999999997\r\n" + 
				"-85.515000000000001\r\n" + 
				"-85.498000000000005\r\n" + 
				"-85.484499999999997\r\n" + 
				"-85.471666666666650\r\n" + 
				"-85.451999999999998\r\n" + 
				"-85.431333333333328\r\n" + 
				"-85.419333333333341\r\n" + 
				"-85.402799999999999\r\n" + 
				"-85.393500000000003\r\n" + 
				"-85.382333333333349\r\n" + 
				"-85.365428571428566\r\n" + 
				"-85.344999999999985\r\n" + 
				"-85.333500000000001\r\n" + 
				"-85.317800000000005\r\n" + 
				"-85.294499999999999\r\n" + 
				"-85.274000000000001\r\n" + 
				"-85.239000000000004\r\n" + 
				"-85.225600000000014\r\n" + 
				"-85.204999999999998\r\n" + 
				"-85.189333333333337\r\n" + 
				"-85.174000000000007\r\n" + 
				"-85.161000000000001\r\n" + 
				"-85.141571428571424\r\n" + 
				"-85.131444444444440\r\n" + 
				"-85.121333333333325\r\n" + 
				"-85.105285714285714\r\n" + 
				"-85.089923076923085\r\n" + 
				"-85.077250000000006\r\n" + 
				"-85.064499999999995\r\n" + 
				"-85.053500000000000\r\n" + 
				"-85.041499999999999\r\n" + 
				"-85.029500000000013\r\n" + 
				"-85.017500000000013\r\n" + 
				"-85.007000000000005\r\n" + 
				"-84.994000000000000\r\n" + 
				"-84.981000000000009\r\n" + 
				"-84.967846153846168\r\n" + 
				"-84.949571428571431\r\n" + 
				"-84.934166666666670\r\n" + 
				"-84.920666666666662\r\n" + 
				"-84.897999999999996\r\n" + 
				"-84.884333333333345\r\n" + 
				"-84.872999999999990\r\n" + 
				"-84.862499999999997\r\n" + 
				"-84.832333333333338\r\n" + 
				"-84.816000000000003\r\n" + 
				"-84.796666666666667\r\n" + 
				"-84.777500000000003\r\n" + 
				"-84.750600000000006\r\n" + 
				"-84.702499999999986\r\n" + 
				"-84.681000000000012\r\n" + 
				"-84.654333333333327\r\n" + 
				"-84.639333333333340\r\n" + 
				"-84.617000000000004\r\n" + 
				"-84.590999999999994\r\n" + 
				"-84.572749999999999\r\n" + 
				"-84.553333333333342\r\n" + 
				"-84.531000000000006\r\n" + 
				"-84.515000000000001\r\n" + 
				"-84.490499999999997\r\n" + 
				"-84.475333333333325\r\n" + 
				"-84.455333333333328\r\n" + 
				"-84.438000000000002\r\n" + 
				"-84.420000000000002\r\n" + 
				"-84.399000000000001\r\n" + 
				"-84.370800000000003\r\n" + 
				"-84.348666666666659\r\n" + 
				"-84.333499999999987\r\n" + 
				"-84.317250000000001\r\n" + 
				"-84.302499999999995\r\n" + 
				"-84.290000000000006\r\n" + 
				"-84.267500000000013\r\n" + 
				"-84.241000000000000\r\n" + 
				"-84.226399999999984\r\n" + 
				"-84.209333333333333\r\n" + 
				"-84.195833333333326\r\n" + 
				"-84.177250000000001\r\n" + 
				"-84.166499999999999\r\n" + 
				"-84.155600000000007\r\n" + 
				"-84.142181818181825\r\n" + 
				"-84.129000000000005\r\n" + 
				"-84.118333333333339\r\n" + 
				"-84.105999999999995\r\n" + 
				"-84.093999999999994\r\n" + 
				"-84.083500000000001\r\n" + 
				"-84.071500000000000\r\n" + 
				"-84.059500000000000\r\n" + 
				"-84.050500000000014\r\n" + 
				"-84.038499999999985\r\n" + 
				"-84.024499999999989\r\n" + 
				"-84.012500000000003\r\n" + 
				"-84.003500000000003\r\n" + 
				"-83.995000000000005\r\n" + 
				"-83.983000000000004\r\n" + 
				"-83.965166666666661\r\n" + 
				"-83.953249999999997\r\n" + 
				"-83.937142857142845\r\n" + 
				"-83.923000000000002\r\n" + 
				"-83.911000000000001\r\n" + 
				"-83.899000000000001\r\n" + 
				"-83.885500000000008\r\n" + 
				"-83.871499999999997\r\n" + 
				"-83.855999999999995\r\n" + 
				"-83.846499999999992\r\n" + 
				"-83.827833333333331\r\n" + 
				"-83.813000000000002\r\n" + 
				"-83.791399999999996\r\n" + 
				"-83.762000000000000\r\n" + 
				"-83.743499999999997\r\n" + 
				"-83.721000000000004\r\n" + 
				"-83.703499999999991\r\n" + 
				"-83.690999999999988\r\n" + 
				"-83.681333333333328\r\n" + 
				"-83.665999999999997\r\n" + 
				"-83.651666666666671\r\n" + 
				"-83.640799999999999\r\n" + 
				"-83.628000000000000\r\n" + 
				"-83.596999999999994\r\n" + 
				"-83.582999999999998\r\n" + 
				"-83.571500000000000\r\n" + 
				"-83.548666666666662\r\n" + 
				"-83.536599999999993\r\n" + 
				"-83.509000000000000\r\n" + 
				"-83.482500000000002\r\n" + 
				"-83.459666666666678\r\n" + 
				"-83.417000000000002\r\n" + 
				"-83.405666666666662\r\n" + 
				"-83.391750000000002\r\n" + 
				"-83.358499999999992\r\n" + 
				"-83.343999999999994\r\n" + 
				"-83.314333333333323\r\n" + 
				"-83.283500000000004\r\n" + 
				"-83.259000000000000\r\n" + 
				"-83.242999999999995\r\n" + 
				"-83.223600000000005\r\n" + 
				"-83.205666666666673\r\n" + 
				"-83.185666666666663\r\n" + 
				"-83.171800000000005\r\n" + 
				"-83.159333333333336\r\n" + 
				"-83.148500000000013\r\n" + 
				"-83.132000000000019\r\n" + 
				"-83.115499999999997\r\n" + 
				"-83.104714285714280\r\n" + 
				"-83.092199999999977\r\n" + 
				"-83.083500000000001\r\n" + 
				"-83.073999999999970\r\n" + 
				"-83.060357142857129\r\n" + 
				"-83.045500000000004\r\n" + 
				"-83.033500000000004\r\n" + 
				"-83.021500000000003\r\n" + 
				"-83.012500000000003\r\n" + 
				"-83.003500000000017\r\n" + 
				"-82.989500000000007\r\n" + 
				"-82.976499999999987\r\n" + 
				"-82.965199999999996\r\n" + 
				"-82.952199999999991\r\n" + 
				"-82.936571428571440\r\n" + 
				"-82.915499999999994\r\n" + 
				"-82.897666666666680\r\n" + 
				"-82.879666666666665\r\n" + 
				"-82.855249999999998\r\n" + 
				"-82.834999999999994\r\n" + 
				"-82.816333333333333\r\n" + 
				"-82.797499999999999\r\n" + 
				"-82.779600000000002\r\n" + 
				"-82.760500000000008\r\n" + 
				"-82.724999999999994\r\n" + 
				"-82.712500000000006\r\n" + 
				"-82.697000000000003\r\n" + 
				"-82.659750000000003\r\n" + 
				"-82.643000000000001\r\n" + 
				"-82.628000000000000\r\n" + 
				"-82.615666666666655\r\n" + 
				"-82.599500000000006\r\n" + 
				"-82.579749999999990\r\n" + 
				"-82.566499999999991\r\n" + 
				"-82.546000000000006\r\n" + 
				"-82.513000000000005\r\n" + 
				"-82.499000000000009\r\n" + 
				"-82.471999999999994\r\n" + 
				"-82.459499999999991\r\n" + 
				"-82.444800000000001\r\n" + 
				"-82.430000000000007\r\n" + 
				"-82.415199999999999\r\n" + 
				"-82.396599999999992\r\n" + 
				"-82.375000000000000\r\n" + 
				"-82.362666666666669\r\n" + 
				"-82.348999999999990\r\n" + 
				"-82.311000000000007\r\n" + 
				"-82.289333333333346\r\n" + 
				"-82.266666666666666\r\n" + 
				"-82.240000000000009\r\n" + 
				"-82.217999999999989\r\n" + 
				"-82.199833333333331\r\n" + 
				"-82.182000000000002\r\n" + 
				"-82.170800000000014\r\n" + 
				"-82.162250000000000\r\n" + 
				"-82.149571428571434\r\n" + 
				"-82.137599999999992\r\n" + 
				"-82.125666666666675\r\n" + 
				"-82.115000000000009\r\n" + 
				"-82.103999999999999\r\n" + 
				"-82.092500000000001\r\n" + 
				"-82.078999999999994\r\n" + 
				"-82.068500000000000\r\n" + 
				"-82.058500000000009\r\n" + 
				"-82.048499999999990\r\n" + 
				"-82.036500000000004\r\n" + 
				"-82.024999999999991\r\n" + 
				"-82.012500000000003\r\n" + 
				"-82.000999999999991\r\n" + 
				"-81.991600000000005\r\n" + 
				"-81.981636363636369\r\n" + 
				"-81.967916666666667\r\n" + 
				"-81.946299999999994\r\n" + 
				"-81.933333333333337\r\n" + 
				"-81.921000000000006\r\n" + 
				"-81.905000000000001\r\n" + 
				"-81.893333333333331\r\n" + 
				"-81.878399999999999\r\n" + 
				"-81.855799999999988\r\n" + 
				"-81.840500000000006\r\n" + 
				"-81.826999999999998\r\n" + 
				"-81.810666666666677\r\n" + 
				"-81.792000000000002\r\n" + 
				"-81.775750000000002\r\n" + 
				"-81.763333333333335\r\n" + 
				"-81.733750000000001\r\n" + 
				"-81.715499999999992\r\n" + 
				"-81.698999999999998\r\n" + 
				"-81.679999999999993\r\n" + 
				"-81.657333333333341\r\n" + 
				"-81.641000000000005\r\n" + 
				"-81.617999999999995\r\n" + 
				"-81.595399999999998\r\n" + 
				"-81.572000000000003\r\n" + 
				"-81.556666666666672\r\n" + 
				"-81.545800000000014\r\n" + 
				"-81.526166666666668\r\n" + 
				"-81.505000000000010\r\n" + 
				"-81.491500000000002\r\n" + 
				"-81.464999999999989\r\n" + 
				"-81.442000000000007\r\n" + 
				"-81.425800000000010\r\n" + 
				"-81.393500000000003\r\n" + 
				"-81.365000000000009\r\n" + 
				"-81.346999999999994\r\n" + 
				"-81.329499999999996\r\n" + 
				"-81.310000000000002\r\n" + 
				"-81.293750000000003\r\n" + 
				"-81.271999999999991\r\n" + 
				"-81.260750000000002\r\n" + 
				"-81.242000000000004\r\n" + 
				"-81.226399999999984\r\n" + 
				"-81.208333333333329\r\n" + 
				"-81.190600000000003\r\n" + 
				"-81.176333333333332\r\n" + 
				"-81.164999999999992\r\n" + 
				"-81.150400000000005\r\n" + 
				"-81.134222222222220\r\n" + 
				"-81.119750000000010\r\n" + 
				"-81.108571428571423\r\n" + 
				"-81.093000000000004\r\n" + 
				"-81.076909090909098\r\n" + 
				"-81.061999999999998\r\n" + 
				"-81.048100000000005\r\n" + 
				"-81.036500000000004\r\n" + 
				"-81.024000000000015\r\n" + 
				"-81.012833333333347\r\n" + 
				"-81.003500000000017\r\n" + 
				"-80.991500000000002\r\n" + 
				"-80.978333333333339\r\n" + 
				"-80.963999999999999\r\n" + 
				"-80.952199999999976\r\n" + 
				"-80.939222222222227\r\n" + 
				"-80.911333333333332\r\n" + 
				"-80.893666666666661\r\n" + 
				"-80.869428571428571\r\n" + 
				"-80.839333333333329\r\n" + 
				"-80.825666666666677\r\n" + 
				"-80.814500000000010\r\n" + 
				"-80.797000000000011\r\n" + 
				"-80.758749999999992\r\n" + 
				"-80.743499999999997\r\n" + 
				"-80.716142857142842\r\n" + 
				"-80.693399999999997\r\n" + 
				"-80.683333333333337\r\n" + 
				"-80.667000000000002\r\n" + 
				"-80.646500000000003\r\n" + 
				"-80.633000000000010\r\n" + 
				"-80.619666666666660\r\n" + 
				"-80.609000000000009\r\n" + 
				"-80.581999999999994\r\n" + 
				"-80.557000000000002\r\n" + 
				"-80.543199999999999\r\n" + 
				"-80.527666666666661\r\n" + 
				"-80.500000000000000\r\n" + 
				"-80.481750000000005\r\n" + 
				"-80.456000000000003\r\n" + 
				"-80.442999999999998\r\n" + 
				"-80.426000000000002\r\n" + 
				"-80.402000000000001\r\n" + 
				"-80.385999999999996\r\n" + 
				"-80.369666666666660\r\n" + 
				"-80.351999999999990\r\n" + 
				"-80.339500000000001\r\n" + 
				"-80.306250000000006\r\n" + 
				"-80.269250000000000\r\n" + 
				"-80.251749999999987\r\n" + 
				"-80.238000000000000\r\n" + 
				"-80.223199999999991\r\n" + 
				"-80.203000000000003\r\n" + 
				"-80.187000000000012\r\n" + 
				"-80.174666666666667\r\n" + 
				"-80.160600000000017\r\n" + 
				"-80.147000000000006\r\n" + 
				"-80.129249999999999\r\n" + 
				"-80.110777777777784\r\n" + 
				"-80.097999999999985\r\n" + 
				"-80.086499999999987\r\n" + 
				"-80.074499999999972\r\n" + 
				"-80.061000000000007\r\n" + 
				"-80.050000000000011\r\n" + 
				"-80.039499999999990\r\n" + 
				"-80.030500000000004\r\n" + 
				"-80.021499999999989\r\n" + 
				"-80.009499999999989\r\n" + 
				"-80.000500000000002\r\n" + 
				"-79.991999999999990\r\n" + 
				"-79.980444444444458\r\n" + 
				"-79.968285714285713\r\n" + 
				"-79.958142857142860\r\n" + 
				"-79.941000000000003\r\n" + 
				"-79.924199999999999\r\n" + 
				"-79.906166666666664\r\n" + 
				"-79.893000000000001\r\n" + 
				"-79.875799999999998\r\n" + 
				"-79.864249999999998\r\n" + 
				"-79.854333333333329\r\n" + 
				"-79.822000000000003\r\n" + 
				"-79.794250000000005\r\n" + 
				"-79.757249999999999\r\n" + 
				"-79.742666666666665\r\n" + 
				"-79.715000000000003\r\n" + 
				"-79.700749999999999\r\n" + 
				"-79.676333333333332\r\n" + 
				"-79.660499999999999\r\n" + 
				"-79.641000000000005\r\n" + 
				"-79.617500000000007\r\n" + 
				"-79.600000000000009\r\n" + 
				"-79.582333333333338\r\n" + 
				"-79.558666666666682\r\n" + 
				"-79.549666666666667\r\n" + 
				"-79.531000000000006\r\n" + 
				"-79.513000000000005\r\n" + 
				"-79.492199999999997\r\n" + 
				"-79.465999999999994\r\n" + 
				"-79.444333333333347\r\n" + 
				"-79.418000000000006\r\n" + 
				"-79.396000000000001\r\n" + 
				"-79.371749999999992\r\n" + 
				"-79.353000000000009\r\n" + 
				"-79.327666666666673\r\n" + 
				"-79.313333333333333\r\n" + 
				"-79.297600000000003\r\n" + 
				"-79.281500000000008\r\n" + 
				"-79.268000000000015\r\n" + 
				"-79.243000000000009\r\n" + 
				"-79.218599999999995\r\n" + 
				"-79.201166666666666\r\n" + 
				"-79.187749999999994\r\n" + 
				"-79.176000000000002\r\n" + 
				"-79.159500000000008\r\n" + 
				"-79.149500000000003\r\n" + 
				"-79.132499999999993\r\n" + 
				"-79.113428571428571\r\n" + 
				"-79.103499999999997\r\n" + 
				"-79.093000000000004\r\n" + 
				"-79.083099999999988\r\n" + 
				"-79.072499999999991\r\n" + 
				"-79.063500000000005\r\n" + 
				"-79.054000000000002\r\n" + 
				"-79.044499999999999\r\n" + 
				"-79.032500000000013\r\n" + 
				"-79.020499999999998\r\n" + 
				"-79.007999999999996\r\n" + 
				"-78.999499999999998\r\n" + 
				"-78.991100000000003\r\n" + 
				"-78.977307692307690\r\n" + 
				"-78.963999999999999\r\n" + 
				"-78.949499999999986\r\n" + 
				"-78.931888888888878\r\n" + 
				"-78.922799999999995\r\n" + 
				"-78.907200000000017\r\n" + 
				"-78.881666666666675\r\n" + 
				"-78.856499999999997\r\n" + 
				"-78.829666666666654\r\n" + 
				"-78.808999999999983\r\n" + 
				"-78.784000000000006\r\n" + 
				"-78.763599999999997\r\n" + 
				"-78.747749999999996\r\n" + 
				"-78.731666666666669\r\n" + 
				"-78.719999999999999\r\n" + 
				"-78.706333333333333\r\n" + 
				"-78.694166666666675\r\n" + 
				"-78.676000000000002\r\n" + 
				"-78.660499999999999\r\n" + 
				"-78.648499999999999\r\n" + 
				"-78.626000000000005\r\n" + 
				"-78.603666666666669\r\n" + 
				"-78.593666666666664\r\n" + 
				"-78.573750000000004\r\n" + 
				"-78.558500000000009\r\n" + 
				"-78.545333333333346\r\n" + 
				"-78.505200000000002\r\n" + 
				"-78.482500000000002\r\n" + 
				"-78.468666666666664\r\n" + 
				"-78.448999999999998\r\n" + 
				"-78.419499999999999\r\n" + 
				"-78.385750000000002\r\n" + 
				"-78.354500000000002\r\n" + 
				"-78.342500000000001\r\n" + 
				"-78.328999999999994\r\n" + 
				"-78.311000000000007\r\n" + 
				"-78.289999999999992\r\n" + 
				"-78.266999999999996\r\n" + 
				"-78.239999999999995\r\n" + 
				"-78.218714285714285\r\n" + 
				"-78.202285714285722\r\n" + 
				"-78.173199999999994\r\n" + 
				"-78.147999999999996\r\n" + 
				"-78.135166666666663\r\n" + 
				"-78.122749999999996\r\n" + 
				"-78.108599999999996\r\n" + 
				"-78.093857142857132\r\n" + 
				"-78.078499999999977\r\n" + 
				"-78.065500000000000\r\n" + 
				"-78.053500000000000\r\n" + 
				"-78.041090909090912\r\n" + 
				"-78.031000000000006\r\n" + 
				"-78.020499999999998\r\n" + 
				"-78.008500000000012\r\n" + 
				"-77.996499999999997\r\n" + 
				"-77.980642857142854\r\n" + 
				"-77.968000000000004\r\n" + 
				"-77.957000000000008\r\n" + 
				"-77.945384615384597\r\n" + 
				"-77.925666666666658\r\n" + 
				"-77.907250000000005\r\n" + 
				"-77.893090909090915\r\n" + 
				"-77.873599999999996\r\n" + 
				"-77.853999999999999\r\n" + 
				"-77.835499999999996\r\n" + 
				"-77.820333333333338\r\n" + 
				"-77.805833333333325\r\n" + 
				"-77.789000000000016\r\n" + 
				"-77.755249999999990\r\n" + 
				"-77.740749999999991\r\n" + 
				"-77.728199999999987\r\n" + 
				"-77.704999999999998\r\n" + 
				"-77.686999999999998\r\n" + 
				"-77.667000000000002\r\n" + 
				"-77.616333333333330\r\n" + 
				"-77.595000000000013\r\n" + 
				"-77.558399999999992\r\n" + 
				"-77.549499999999995\r\n" + 
				"-77.530666666666662\r\n" + 
				"-77.518400000000000\r\n" + 
				"-77.501333333333335\r\n" + 
				"-77.477999999999994\r\n" + 
				"-77.457666666666668\r\n" + 
				"-77.442499999999995\r\n" + 
				"-77.426000000000002\r\n" + 
				"-77.399799999999999\r\n" + 
				"-77.384333333333345\r\n" + 
				"-77.368250000000003\r\n" + 
				"-77.351833333333332\r\n" + 
				"-77.323999999999998\r\n" + 
				"-77.300500000000000\r\n" + 
				"-77.279333333333327\r\n" + 
				"-77.259250000000009\r\n" + 
				"-77.227199999999996\r\n" + 
				"-77.194000000000003\r\n" + 
				"-77.177799999999991\r\n" + 
				"-77.160600000000017\r\n" + 
				"-77.148666666666671\r\n" + 
				"-77.134000000000000\r\n" + 
				"-77.116799999999998\r\n" + 
				"-77.102000000000004\r\n" + 
				"-77.092111111111109\r\n" + 
				"-77.078999999999994\r\n" + 
				"-77.062090909090912\r\n" + 
				"-77.049499999999995\r\n" + 
				"-77.036500000000004\r\n" + 
				"-77.027500000000003\r\n" + 
				"-77.018500000000003\r\n" + 
				"-77.006500000000003\r\n" + 
				"-76.992000000000004\r\n" + 
				"-76.978333333333339\r\n" + 
				"-76.964500000000001\r\n" + 
				"-76.949727272727259\r\n" + 
				"-76.934857142857140\r\n" + 
				"-76.918999999999997\r\n" + 
				"-76.903375000000011\r\n" + 
				"-76.890749999999997\r\n" + 
				"-76.859857142857138\r\n" + 
				"-76.840500000000006\r\n" + 
				"-76.822666666666677\r\n" + 
				"-76.806000000000012\r\n" + 
				"-76.790500000000009\r\n" + 
				"-76.776600000000002\r\n" + 
				"-76.750000000000000\r\n" + 
				"-76.730999999999995\r\n" + 
				"-76.714250000000007\r\n" + 
				"-76.688250000000011\r\n" + 
				"-76.670500000000004\r\n" + 
				"-76.643666666666661\r\n" + 
				"-76.613000000000000\r\n" + 
				"-76.594666666666669\r\n" + 
				"-76.575333333333333\r\n" + 
				"-76.559666666666672\r\n" + 
				"-76.545000000000002\r\n" + 
				"-76.525000000000006\r\n" + 
				"-76.503250000000008\r\n" + 
				"-76.480000000000004\r\n" + 
				"-76.464666666666673\r\n" + 
				"-76.441600000000008\r\n" + 
				"-76.428500000000000\r\n" + 
				"-76.413666666666671\r\n" + 
				"-76.373000000000005\r\n" + 
				"-76.350666666666669\r\n" + 
				"-76.332500000000010\r\n" + 
				"-76.304500000000004\r\n" + 
				"-76.282499999999999\r\n" + 
				"-76.271999999999991\r\n" + 
				"-76.256500000000003\r\n" + 
				"-76.241000000000000\r\n" + 
				"-76.226166666666671\r\n" + 
				"-76.207999999999998\r\n" + 
				"-76.194666666666663\r\n" + 
				"-76.180399999999992\r\n" + 
				"-76.168999999999997\r\n" + 
				"-76.145499999999998\r\n" + 
				"-76.134999999999991\r\n" + 
				"-76.118250000000003\r\n" + 
				"-76.109999999999999\r\n" + 
				"-76.099500000000006\r\n" + 
				"-76.088499999999996\r\n" + 
				"-76.073999999999998\r\n" + 
				"-76.060499999999990\r\n" + 
				"-76.048499999999990\r\n" + 
				"-76.038125000000008\r\n" + 
				"-76.024999999999991\r\n" + 
				"-76.013999999999996\r\n" + 
				"-76.003500000000017\r\n" + 
				"-75.991500000000002\r\n" + 
				"-75.982500000000002\r\n" + 
				"-75.973999999999990\r\n" + 
				"-75.961499999999987\r\n" + 
				"-75.950749999999985\r\n" + 
				"-75.937833333333344\r\n" + 
				"-75.926399999999987\r\n" + 
				"-75.906333333333336\r\n" + 
				"-75.895000000000010\r\n" + 
				"-75.883250000000004\r\n" + 
				"-75.875000000000000\r\n" + 
				"-75.861999999999995\r\n" + 
				"-75.839666666666659\r\n" + 
				"-75.823999999999998\r\n" + 
				"-75.811999999999998\r\n" + 
				"-75.801999999999992\r\n" + 
				"-75.786000000000016\r\n" + 
				"-75.769000000000005\r\n" + 
				"-75.754999999999995\r\n" + 
				"-75.744000000000000\r\n" + 
				"-75.725333333333325\r\n" + 
				"-75.711500000000001\r\n" + 
				"-75.681249999999991\r\n" + 
				"-75.659500000000008\r\n" + 
				"-75.637666666666675\r\n" + 
				"-75.613249999999994\r\n" + 
				"-75.588000000000008\r\n" + 
				"-75.564000000000007\r\n" + 
				"-75.553500000000000\r\n" + 
				"-75.541000000000011\r\n" + 
				"-75.521833333333333\r\n" + 
				"-75.500333333333330\r\n" + 
				"-75.474999999999994\r\n" + 
				"-75.450999999999993\r\n" + 
				"-75.438000000000002\r\n" + 
				"-75.421500000000009\r\n" + 
				"-75.394000000000005\r\n" + 
				"-75.378000000000000\r\n" + 
				"-75.358666666666664\r\n" + 
				"-75.347333333333324\r\n" + 
				"-75.323499999999996\r\n" + 
				"-75.302000000000007\r\n" + 
				"-75.278500000000008\r\n" + 
				"-75.266666666666666\r\n" + 
				"-75.250199999999992\r\n" + 
				"-75.219999999999999\r\n" + 
				"-75.207000000000008\r\n" + 
				"-75.193500000000000\r\n" + 
				"-75.174666666666667\r\n" + 
				"-75.151800000000009\r\n" + 
				"-75.137400000000000\r\n" + 
				"-75.122333333333330\r\n" + 
				"-75.107444444444440\r\n" + 
				"-75.092799999999997\r\n" + 
				"-75.077499999999986\r\n" + 
				"-75.068500000000000\r\n" + 
				"-75.058499999999995\r\n" + 
				"-75.046999999999997\r\n" + 
				"-75.036500000000004\r\n" + 
				"-75.024499999999989\r\n" + 
				"-75.012500000000003\r\n" + 
				"-75.001499999999993\r\n" + 
				"-74.992857142857147\r\n" + 
				"-74.981545454545440\r\n" + 
				"-74.967142857142861\r\n" + 
				"-74.951749999999990\r\n" + 
				"-74.941000000000003\r\n" + 
				"-74.930499999999995\r\n" + 
				"-74.920000000000002\r\n" + 
				"-74.902000000000001\r\n" + 
				"-74.884999999999991\r\n" + 
				"-74.870600000000010\r\n" + 
				"-74.843750000000000\r\n" + 
				"-74.824500000000000\r\n" + 
				"-74.804000000000002\r\n" + 
				"-74.792000000000002\r\n" + 
				"-74.773333333333326\r\n" + 
				"-74.760999999999996\r\n" + 
				"-74.742000000000004\r\n" + 
				"-74.711500000000001\r\n" + 
				"-74.689499999999995\r\n" + 
				"-74.666200000000003\r\n" + 
				"-74.642499999999998\r\n" + 
				"-74.622333333333330\r\n" + 
				"-74.597250000000003\r\n" + 
				"-74.582200000000000\r\n" + 
				"-74.565666666666658\r\n" + 
				"-74.550333333333342\r\n" + 
				"-74.530200000000008\r\n" + 
				"-74.513999999999996\r\n" + 
				"-74.503000000000000\r\n" + 
				"-74.486666666666665\r\n" + 
				"-74.470500000000001\r\n" + 
				"-74.440750000000008\r\n" + 
				"-74.417333333333332\r\n" + 
				"-74.394999999999996\r\n" + 
				"-74.379000000000005\r\n" + 
				"-74.358333333333334\r\n" + 
				"-74.348500000000001\r\n" + 
				"-74.331000000000003\r\n" + 
				"-74.296500000000009\r\n" + 
				"-74.266000000000005\r\n" + 
				"-74.244200000000006\r\n" + 
				"-74.230999999999995\r\n" + 
				"-74.218000000000004\r\n" + 
				"-74.197000000000003\r\n" + 
				"-74.182999999999993\r\n" + 
				"-74.168666666666667\r\n" + 
				"-74.151333333333341\r\n" + 
				"-74.138999999999996\r\n" + 
				"-74.128333333333345\r\n" + 
				"-74.116749999999996\r\n" + 
				"-74.106999999999999\r\n" + 
				"-74.098499999999987\r\n" + 
				"-74.089999999999989\r\n" + 
				"-74.079666666666668\r\n" + 
				"-74.070499999999996\r\n" + 
				"-74.057199999999995\r\n" + 
				"-74.048500000000004\r\n" + 
				"-74.039500000000004\r\n" + 
				"-74.027500000000018\r\n" + 
				"-74.012999999999991\r\n" + 
				"-74.001000000000005\r\n" + 
				"-73.990499999999983\r\n" + 
				"-73.978499999999997\r\n" + 
				"-73.967100000000002\r\n" + 
				"-73.953499999999991\r\n" + 
				"-73.943200000000004\r\n" + 
				"-73.931666666666672\r\n" + 
				"-73.917000000000002\r\n" + 
				"-73.900750000000002\r\n" + 
				"-73.889799999999994\r\n" + 
				"-73.878000000000000\r\n" + 
				"-73.860500000000002\r\n" + 
				"-73.848500000000001\r\n" + 
				"-73.831999999999994\r\n" + 
				"-73.807600000000008\r\n" + 
				"-73.793250000000000\r\n" + 
				"-73.774400000000014\r\n" + 
				"-73.755833333333342\r\n" + 
				"-73.741000000000000\r\n" + 
				"-73.728000000000009\r\n" + 
				"-73.713500000000010\r\n" + 
				"-73.700000000000003\r\n" + 
				"-73.682000000000002\r\n" + 
				"-73.669499999999999\r\n" + 
				"-73.650999999999996\r\n" + 
				"-73.626499999999993\r\n" + 
				"-73.603999999999999\r\n" + 
				"-73.585999999999999\r\n" + 
				"-73.566500000000005\r\n" + 
				"-73.551666666666677\r\n" + 
				"-73.537000000000006\r\n" + 
				"-73.523500000000013\r\n" + 
				"-73.504500000000007\r\n" + 
				"-73.482749999999996\r\n" + 
				"-73.464750000000009\r\n" + 
				"-73.442999999999998\r\n" + 
				"-73.427999999999997\r\n" + 
				"-73.409999999999997\r\n" + 
				"-73.394000000000005\r\n" + 
				"-73.378399999999985\r\n" + 
				"-73.355400000000003\r\n" + 
				"-73.337500000000006\r\n" + 
				"-73.322499999999991\r\n" + 
				"-73.307000000000002\r\n" + 
				"-73.283500000000004\r\n" + 
				"-73.261250000000004\r\n" + 
				"-73.241999999999990\r\n" + 
				"-73.231249999999989\r\n" + 
				"-73.211333333333329\r\n" + 
				"-73.194500000000005\r\n" + 
				"-73.179428571428573\r\n" + 
				"-73.149199999999993\r\n" + 
				"-73.132000000000005\r\n" + 
				"-73.116999999999990\r\n" + 
				"-73.104600000000005\r\n" + 
				"-73.091999999999999\r\n" + 
				"-73.079999999999998\r\n" + 
				"-73.066749999999999\r\n" + 
				"-73.056500000000014\r\n" + 
				"-73.047499999999999\r\n" + 
				"-73.038499999999985\r\n" + 
				"-73.026499999999999\r\n" + 
				"-73.014499999999984\r\n" + 
				"-73.000999999999991\r\n" + 
				"-72.988500000000002\r\n" + 
				"-72.977000000000004\r\n" + 
				"-72.965916666666672\r\n" + 
				"-72.946444444444438\r\n" + 
				"-72.934428571428583\r\n" + 
				"-72.919666666666672\r\n" + 
				"-72.907333333333341\r\n" + 
				"-72.883333333333340\r\n" + 
				"-72.872666666666660\r\n" + 
				"-72.858999999999995\r\n" + 
				"-72.846000000000004\r\n" + 
				"-72.829499999999996\r\n" + 
				"-72.811999999999998\r\n" + 
				"-72.794666666666657\r\n" + 
				"-72.780333333333331\r\n" + 
				"-72.768333333333331\r\n" + 
				"-72.757000000000005\r\n" + 
				"-72.739400000000003\r\n" + 
				"-72.715599999999995\r\n" + 
				"-72.700999999999993\r\n" + 
				"-72.688999999999993\r\n" + 
				"-72.671999999999983\r\n" + 
				"-72.658500000000004\r\n" + 
				"-72.641999999999996\r\n" + 
				"-72.623750000000001\r\n" + 
				"-72.603333333333339\r\n" + 
				"-72.572999999999993\r\n" + 
				"-72.551500000000004\r\n" + 
				"-72.539666666666662\r\n" + 
				"-72.524333333333331\r\n" + 
				"-72.498200000000011\r\n" + 
				"-72.472000000000008\r\n" + 
				"-72.460499999999996\r\n" + 
				"-72.439000000000007\r\n" + 
				"-72.424666666666667\r\n" + 
				"-72.412666666666667\r\n" + 
				"-72.377000000000010\r\n" + 
				"-72.357249999999993\r\n" + 
				"-72.346249999999998\r\n" + 
				"-72.334999999999994\r\n" + 
				"-72.316499999999991\r\n" + 
				"-72.298000000000002\r\n" + 
				"-72.281000000000006\r\n" + 
				"-72.256333333333330\r\n" + 
				"-72.226199999999992\r\n" + 
				"-72.215166666666676\r\n" + 
				"-72.201499999999996\r\n" + 
				"-72.183200000000014\r\n" + 
				"-72.170333333333346\r\n" + 
				"-72.158500000000004\r\n" + 
				"-72.143142857142863\r\n" + 
				"-72.130749999999992\r\n" + 
				"-72.119250000000008\r\n" + 
				"-72.104250000000008\r\n" + 
				"-72.092500000000001\r\n" + 
				"-72.079249999999988\r\n" + 
				"-72.065636363636358\r\n" + 
				"-72.053500000000000\r\n" + 
				"-72.041499999999999\r\n" + 
				"-72.028500000000008\r\n" + 
				"-72.016999999999996\r\n" + 
				"-72.006500000000003\r\n" + 
				"-71.997499999999988\r\n" + 
				"-71.988500000000002\r\n" + 
				"-71.977000000000004\r\n" + 
				"-71.963999999999999\r\n" + 
				"-71.952454545454557\r\n" + 
				"-71.940909090909088\r\n" + 
				"-71.929000000000016\r\n" + 
				"-71.911400000000000\r\n" + 
				"-71.898799999999994\r\n" + 
				"-71.871833333333328\r\n" + 
				"-71.855999999999995\r\n" + 
				"-71.844857142857137\r\n" + 
				"-71.825166666666661\r\n" + 
				"-71.807500000000005\r\n" + 
				"-71.792000000000002\r\n" + 
				"-71.771999999999991\r\n" + 
				"-71.759999999999991\r\n" + 
				"-71.742750000000001\r\n" + 
				"-71.703000000000003\r\n" + 
				"-71.689999999999998\r\n" + 
				"-71.673249999999996\r\n" + 
				"-71.655799999999999\r\n" + 
				"-71.641500000000008\r\n" + 
				"-71.605999999999995\r\n" + 
				"-71.581999999999994\r\n" + 
				"-71.568999999999988\r\n" + 
				"-71.547499999999999\r\n" + 
				"-71.527500000000003\r\n" + 
				"-71.507999999999996\r\n" + 
				"-71.492999999999995\r\n" + 
				"-71.475999999999999\r\n" + 
				"-71.459499999999991\r\n" + 
				"-71.441749999999999\r\n" + 
				"-71.390000000000001\r\n" + 
				"-71.371499999999997\r\n" + 
				"-71.355000000000004\r\n" + 
				"-71.332250000000002\r\n" + 
				"-71.322000000000003\r\n" + 
				"-71.308250000000001\r\n" + 
				"-71.289749999999998\r\n" + 
				"-71.274999999999991\r\n" + 
				"-71.257999999999996\r\n" + 
				"-71.245000000000005\r\n" + 
				"-71.223749999999995\r\n" + 
				"-71.201999999999998\r\n" + 
				"-71.189999999999998\r\n" + 
				"-71.177400000000006\r\n" + 
				"-71.164666666666676\r\n" + 
				"-71.148500000000013\r\n" + 
				"-71.134000000000000\r\n" + 
				"-71.123500000000007\r\n" + 
				"-71.105000000000004\r\n" + 
				"-71.094666666666683\r\n" + 
				"-71.081307692307689\r\n" + 
				"-71.068500000000000\r\n" + 
				"-71.058999999999997\r\n" + 
				"-71.047583333333336\r\n" + 
				"-71.035499999999999\r\n" + 
				"-71.026500000000013\r\n" + 
				"-71.017499999999998\r\n" + 
				"-71.005499999999998\r\n" + 
				"-70.993499999999997\r\n" + 
				"-70.980999999999995\r\n" + 
				"-70.967500000000001\r\n" + 
				"-70.957833333333326\r\n" + 
				"-70.946833333333331\r\n" + 
				"-70.933249999999987\r\n" + 
				"-70.915999999999997\r\n" + 
				"-70.905749999999998\r\n" + 
				"-70.892499999999998\r\n" + 
				"-70.878250000000008\r\n" + 
				"-70.852249999999998\r\n" + 
				"-70.837000000000003\r\n" + 
				"-70.818666666666658\r\n" + 
				"-70.802500000000009\r\n" + 
				"-70.789000000000001\r\n" + 
				"-70.756500000000003\r\n" + 
				"-70.742000000000004\r\n" + 
				"-70.730600000000010\r\n" + 
				"-70.703999999999994\r\n" + 
				"-70.689666666666668\r\n" + 
				"-70.667500000000004\r\n" + 
				"-70.654499999999999\r\n" + 
				"-70.635000000000005\r\n" + 
				"-70.620499999999993\r\n" + 
				"-70.598500000000001\r\n" + 
				"-70.582750000000004\r\n" + 
				"-70.573333333333338\r\n" + 
				"-70.560249999999996\r\n" + 
				"-70.548500000000004\r\n" + 
				"-70.528800000000004\r\n" + 
				"-70.516800000000003\r\n" + 
				"-70.501333333333335\r\n" + 
				"-70.482750000000010\r\n" + 
				"-70.468000000000004\r\n" + 
				"-70.441666666666663\r\n" + 
				"-70.426333333333332\r\n" + 
				"-70.411000000000001\r\n" + 
				"-70.379999999999995\r\n" + 
				"-70.364999999999995\r\n" + 
				"-70.349000000000004\r\n" + 
				"-70.331999999999994\r\n" + 
				"-70.311000000000007\r\n" + 
				"-70.286000000000001\r\n" + 
				"-70.269666666666652\r\n" + 
				"-70.254500000000007\r\n" + 
				"-70.231399999999994\r\n" + 
				"-70.216999999999999\r\n" + 
				"-70.200000000000003\r\n" + 
				"-70.183500000000009\r\n" + 
				"-70.162333333333336\r\n" + 
				"-70.146000000000001\r\n" + 
				"-70.127499999999998\r\n" + 
				"-70.110818181818175\r\n" + 
				"-70.098000000000013\r\n" + 
				"-70.085999999999999\r\n" + 
				"-70.073899999999995\r\n" + 
				"-70.065500000000000\r\n" + 
				"-70.057000000000002\r\n" + 
				"-70.045500000000004\r\n" + 
				"-70.036500000000004\r\n" + 
				"-70.027000000000001\r\n" + 
				"-70.015500000000003\r\n" + 
				"-70.003500000000017\r\n" + 
				"-69.993333333333339\r\n" + 
				"-69.981999999999999\r\n" + 
				"-69.971000000000004\r\n" + 
				"-69.959499999999991\r\n" + 
				"-69.945333333333323\r\n" + 
				"-69.931800000000010\r\n" + 
				"-69.917000000000002\r\n" + 
				"-69.900999999999996\r\n" + 
				"-69.886200000000002\r\n" + 
				"-69.867000000000004\r\n" + 
				"-69.850999999999999\r\n" + 
				"-69.823333333333323\r\n" + 
				"-69.802000000000007\r\n" + 
				"-69.781499999999994\r\n" + 
				"-69.763750000000002\r\n" + 
				"-69.730333333333320\r\n" + 
				"-69.710857142857137\r\n" + 
				"-69.678666666666672\r\n" + 
				"-69.656000000000006\r\n" + 
				"-69.646999999999991\r\n" + 
				"-69.628000000000000\r\n" + 
				"-69.615499999999997\r\n" + 
				"-69.596666666666664\r\n" + 
				"-69.578333333333333\r\n" + 
				"-69.539000000000001\r\n" + 
				"-69.519250000000000\r\n" + 
				"-69.501666666666665\r\n" + 
				"-69.489000000000004\r\n" + 
				"-69.465999999999994\r\n" + 
				"-69.445333333333338\r\n" + 
				"-69.428000000000011\r\n" + 
				"-69.408000000000001\r\n" + 
				"-69.395749999999992\r\n" + 
				"-69.385000000000005\r\n" + 
				"-69.373666666666665\r\n" + 
				"-69.355000000000004\r\n" + 
				"-69.335666666666668\r\n" + 
				"-69.317666666666653\r\n" + 
				"-69.309500000000000\r\n" + 
				"-69.293499999999995\r\n" + 
				"-69.269000000000005\r\n" + 
				"-69.246499999999997\r\n" + 
				"-69.218999999999994\r\n" + 
				"-69.197000000000003\r\n" + 
				"-69.180800000000005\r\n" + 
				"-69.165750000000003\r\n" + 
				"-69.143500000000003\r\n" + 
				"-69.127166666666668\r\n" + 
				"-69.112444444444449\r\n" + 
				"-69.099166666666662\r\n" + 
				"-69.088444444444448\r\n" + 
				"-69.077499999999986\r\n" + 
				"-69.068500000000000\r\n" + 
				"-69.058999999999997\r\n" + 
				"-69.049000000000007\r\n" + 
				"-69.038499999999985\r\n" + 
				"-69.029499999999999\r\n" + 
				"-69.020499999999998\r\n" + 
				"-69.007999999999996\r\n" + 
				"-68.995461538461541\r\n" + 
				"-68.981090909090923\r\n" + 
				"-68.970999999999989\r\n" + 
				"-68.957599999999999\r\n" + 
				"-68.941999999999993\r\n" + 
				"-68.924375000000012\r\n" + 
				"-68.905000000000001\r\n" + 
				"-68.887000000000000\r\n" + 
				"-68.864999999999995\r\n" + 
				"-68.846499999999992\r\n" + 
				"-68.828666666666663\r\n" + 
				"-68.809500000000000\r\n" + 
				"-68.795333333333332\r\n" + 
				"-68.778000000000006\r\n" + 
				"-68.762666666666675\r\n" + 
				"-68.748999999999995\r\n" + 
				"-68.723749999999995\r\n" + 
				"-68.710999999999984\r\n" + 
				"-68.693500000000000\r\n" + 
				"-68.670000000000002\r\n" + 
				"-68.653999999999996\r\n" + 
				"-68.639333333333340\r\n" + 
				"-68.610666666666660\r\n" + 
				"-68.593500000000006\r\n" + 
				"-68.580500000000001\r\n" + 
				"-68.548000000000002\r\n" + 
				"-68.537000000000006\r\n" + 
				"-68.524000000000001\r\n" + 
				"-68.509000000000000\r\n" + 
				"-68.482500000000002\r\n" + 
				"-68.465999999999994\r\n" + 
				"-68.451800000000006\r\n" + 
				"-68.420749999999998\r\n" + 
				"-68.403999999999996\r\n" + 
				"-68.391400000000004\r\n" + 
				"-68.372199999999992\r\n" + 
				"-68.356799999999993\r\n" + 
				"-68.324999999999989\r\n" + 
				"-68.311000000000007\r\n" + 
				"-68.299400000000006\r\n" + 
				"-68.269333333333336\r\n" + 
				"-68.254000000000005\r\n" + 
				"-68.236000000000004\r\n" + 
				"-68.216250000000002\r\n" + 
				"-68.195888888888888\r\n" + 
				"-68.180599999999998\r\n" + 
				"-68.167166666666674\r\n" + 
				"-68.150250000000000\r\n" + 
				"-68.137714285714281\r\n" + 
				"-68.118625000000009\r\n" + 
				"-68.108999999999995\r\n" + 
				"-68.096800000000002\r\n" + 
				"-68.085500000000010\r\n" + 
				"-68.073545454545453\r\n" + 
				"-68.058999999999997\r\n" + 
				"-68.045500000000004\r\n" + 
				"-68.033500000000004\r\n" + 
				"-68.021999999999991\r\n" + 
				"-68.011999999999986\r\n" + 
				"-68.002499999999998\r\n" + 
				"-67.991500000000002\r\n" + 
				"-67.979909090909089\r\n" + 
				"-67.967500000000001\r\n" + 
				"-67.954727272727283\r\n" + 
				"-67.939285714285717\r\n" + 
				"-67.919000000000011\r\n" + 
				"-67.894000000000005\r\n" + 
				"-67.882999999999996\r\n" + 
				"-67.870000000000005\r\n" + 
				"-67.852999999999994\r\n" + 
				"-67.830250000000007\r\n" + 
				"-67.811250000000001\r\n" + 
				"-67.797333333333341\r\n" + 
				"-67.779500000000013\r\n" + 
				"-67.770200000000003\r\n" + 
				"-67.750999999999991\r\n" + 
				"-67.720800000000011\r\n" + 
				"-67.699285714285708\r\n" + 
				"-67.668199999999999\r\n" + 
				"-67.636666666666656\r\n" + 
				"-67.620333333333335\r\n" + 
				"-67.594750000000005\r\n" + 
				"-67.556600000000003\r\n" + 
				"-67.539000000000001\r\n" + 
				"-67.525000000000006\r\n" + 
				"-67.505600000000001\r\n" + 
				"-67.470499999999987\r\n" + 
				"-67.447000000000003\r\n" + 
				"-67.420000000000002\r\n" + 
				"-67.406999999999996\r\n" + 
				"-67.385142857142853\r\n" + 
				"-67.364833333333323\r\n" + 
				"-67.342249999999993\r\n" + 
				"-67.326200000000000\r\n" + 
				"-67.308333333333337\r\n" + 
				"-67.287333333333336\r\n" + 
				"-67.262000000000000\r\n" + 
				"-67.235399999999998\r\n" + 
				"-67.212799999999987\r\n" + 
				"-67.193333333333328\r\n" + 
				"-67.180250000000001\r\n" + 
				"-67.160666666666671\r\n" + 
				"-67.148000000000010\r\n" + 
				"-67.127899999999997\r\n" + 
				"-67.112666666666669\r\n" + 
				"-67.095222222222219\r\n" + 
				"-67.084714285714284\r\n" + 
				"-67.076166666666666\r\n" + 
				"-67.065454545454543\r\n" + 
				"-67.052500000000009\r\n" + 
				"-67.041300000000007\r\n" + 
				"-67.028307692307692\r\n" + 
				"-67.015500000000003\r\n" + 
				"-67.003100000000018\r\n" + 
				"-66.992499999999993\r\n" + 
				"-66.982000000000014\r\n" + 
				"-66.969900000000010\r\n" + 
				"-66.953727272727278\r\n" + 
				"-66.937818181818187\r\n" + 
				"-66.918199999999999\r\n" + 
				"-66.898333333333326\r\n" + 
				"-66.882999999999996\r\n" + 
				"-66.872799999999998\r\n" + 
				"-66.858166666666662\r\n" + 
				"-66.842999999999989\r\n" + 
				"-66.829999999999998\r\n" + 
				"-66.815749999999994\r\n" + 
				"-66.802000000000007\r\n" + 
				"-66.786333333333332\r\n" + 
				"-66.764749999999992\r\n" + 
				"-66.745999999999995\r\n" + 
				"-66.728000000000009\r\n" + 
				"-66.697499999999991\r\n" + 
				"-66.679400000000015\r\n" + 
				"-66.658250000000010\r\n" + 
				"-66.629000000000005\r\n" + 
				"-66.608750000000001\r\n" + 
				"-66.593333333333320\r\n" + 
				"-66.576499999999996\r\n" + 
				"-66.554500000000004\r\n" + 
				"-66.543333333333337\r\n" + 
				"-66.530000000000001\r\n" + 
				"-66.502499999999998\r\n" + 
				"-66.489333333333335\r\n" + 
				"-66.467666666666659\r\n" + 
				"-66.454000000000008\r\n" + 
				"-66.441000000000003\r\n" + 
				"-66.420000000000002\r\n" + 
				"-66.394666666666666\r\n" + 
				"-66.379666666666665\r\n" + 
				"-66.359333333333339\r\n" + 
				"-66.325000000000003\r\n" + 
				"-66.302000000000007\r\n" + 
				"-66.280500000000004\r\n" + 
				"-66.267333333333340\r\n" + 
				"-66.258499999999998\r\n" + 
				"-66.237499999999997\r\n" + 
				"-66.221999999999994\r\n" + 
				"-66.204999999999998\r\n" + 
				"-66.192666666666653\r\n" + 
				"-66.180500000000009\r\n" + 
				"-66.162999999999997\r\n" + 
				"-66.149599999999992\r\n" + 
				"-66.131500000000003\r\n" + 
				"-66.118200000000002\r\n" + 
				"-66.102571428571437\r\n" + 
				"-66.093600000000009\r\n" + 
				"-66.082899999999995\r\n" + 
				"-66.071500000000000\r\n" + 
				"-66.059500000000014\r\n" + 
				"-66.045500000000004\r\n" + 
				"-66.032500000000013\r\n" + 
				"-66.020499999999998\r\n" + 
				"-66.008500000000012\r\n" + 
				"-65.996499999999997\r\n" + 
				"-65.980785714285716\r\n" + 
				"-65.968000000000004\r\n" + 
				"-65.955000000000013\r\n" + 
				"-65.947000000000003\r\n" + 
				"-65.932999999999993\r\n" + 
				"-65.907333333333341\r\n" + 
				"-65.886333333333326\r\n" + 
				"-65.870714285714286\r\n" + 
				"-65.855199999999996\r\n" + 
				"-65.838200000000001\r\n" + 
				"-65.815666666666672\r\n" + 
				"-65.797250000000005\r\n" + 
				"-65.787000000000006\r\n" + 
				"-65.777250000000009\r\n" + 
				"-65.739999999999995\r\n" + 
				"-65.725999999999999\r\n" + 
				"-65.703499999999991\r\n" + 
				"-65.674500000000009\r\n" + 
				"-65.641999999999996\r\n" + 
				"-65.629500000000007\r\n" + 
				"-65.617000000000004\r\n" + 
				"-65.596000000000004\r\n" + 
				"-65.569000000000003\r\n" + 
				"-65.553666666666672\r\n" + 
				"-65.541000000000011\r\n" + 
				"-65.522999999999996\r\n" + 
				"-65.504500000000007\r\n" + 
				"-65.481499999999997\r\n" + 
				"-65.462999999999994\r\n" + 
				"-65.443500000000000\r\n" + 
				"-65.426500000000004\r\n" + 
				"-65.406666666666680\r\n" + 
				"-65.382333333333335\r\n" + 
				"-65.366749999999996\r\n" + 
				"-65.358999999999995\r\n" + 
				"-65.328000000000003\r\n" + 
				"-65.311999999999998\r\n" + 
				"-65.295000000000002\r\n" + 
				"-65.270250000000004\r\n" + 
				"-65.256799999999998\r\n" + 
				"-65.239999999999995\r\n" + 
				"-65.226666666666674\r\n" + 
				"-65.211600000000004\r\n" + 
				"-65.193799999999996\r\n" + 
				"-65.171000000000006\r\n" + 
				"-65.158000000000001\r\n" + 
				"-65.143400000000000\r\n" + 
				"-65.132249999999999\r\n" + 
				"-65.116399999999999\r\n" + 
				"-65.104250000000008\r\n" + 
				"-65.090333333333334\r\n" + 
				"-65.082499999999996\r\n" + 
				"-65.070357142857148\r\n" + 
				"-65.056545454545457\r\n" + 
				"-65.046400000000006\r\n" + 
				"-65.036181818181831\r\n" + 
				"-65.023285714285720\r\n" + 
				"-65.012500000000003\r\n" + 
				"-65.003500000000017\r\n" + 
				"-64.991500000000002\r\n" + 
				"-64.978200000000001\r\n" + 
				"-64.969499999999996\r\n" + 
				"-64.960500000000010\r\n" + 
				"-64.946727272727273\r\n" + 
				"-64.927199999999999\r\n" + 
				"-64.906199999999984\r\n" + 
				"-64.893000000000015\r\n" + 
				"-64.881000000000000\r\n" + 
				"-64.869333333333330\r\n" + 
				"-64.858000000000004\r\n" + 
				"-64.837499999999991\r\n" + 
				"-64.823999999999998\r\n" + 
				"-64.807000000000002\r\n" + 
				"-64.790750000000003\r\n" + 
				"-64.772000000000006\r\n" + 
				"-64.752750000000006\r\n" + 
				"-64.740750000000006\r\n" + 
				"-64.718250000000012\r\n" + 
				"-64.711250000000007\r\n" + 
				"-64.697249999999997\r\n" + 
				"-64.679000000000002\r\n" + 
				"-64.662666666666667\r\n" + 
				"-64.648166666666668\r\n" + 
				"-64.621000000000009\r\n" + 
				"-64.606499999999997\r\n" + 
				"-64.595333333333329\r\n" + 
				"-64.569000000000003\r\n" + 
				"-64.558999999999997\r\n" + 
				"-64.549499999999995\r\n" + 
				"-64.533333333333346\r\n" + 
				"-64.519000000000005\r\n" + 
				"-64.504333333333321\r\n" + 
				"-64.465750000000000\r\n" + 
				"-64.448999999999998\r\n" + 
				"-64.426000000000002\r\n" + 
				"-64.411999999999992\r\n" + 
				"-64.401666666666671\r\n" + 
				"-64.387333333333331\r\n" + 
				"-64.370499999999993\r\n" + 
				"-64.351500000000001\r\n" + 
				"-64.336500000000001\r\n" + 
				"-64.320999999999998\r\n" + 
				"-64.307000000000002\r\n" + 
				"-64.286499999999990\r\n" + 
				"-64.269999999999996\r\n" + 
				"-64.242500000000007\r\n" + 
				"-64.230800000000002\r\n" + 
				"-64.216666666666669\r\n" + 
				"-64.183166666666679\r\n" + 
				"-64.164800000000000\r\n" + 
				"-64.155000000000001\r\n" + 
				"-64.141400000000004\r\n" + 
				"-64.125399999999999\r\n" + 
				"-64.113500000000016\r\n" + 
				"-64.102400000000017\r\n" + 
				"-64.091428571428565\r\n" + 
				"-64.077500000000015\r\n" + 
				"-64.062500000000000\r\n" + 
				"-64.048499999999990\r\n" + 
				"-64.038125000000008\r\n" + 
				"-64.027500000000018\r\n" + 
				"-64.016000000000005\r\n" + 
				"-64.004999999999995\r\n" + 
				"-63.996499999999997\r\n" + 
				"-63.986500000000007\r\n" + 
				"-63.976142857142854\r\n" + 
				"-63.965083333333347\r\n" + 
				"-63.954000000000008\r\n" + 
				"-63.943200000000004\r\n" + 
				"-63.933333333333337\r\n" + 
				"-63.917249999999996\r\n" + 
				"-63.897333333333336\r\n" + 
				"-63.880714285714291\r\n" + 
				"-63.856666666666662\r\n" + 
				"-63.836000000000006\r\n" + 
				"-63.819500000000005\r\n" + 
				"-63.805999999999997\r\n" + 
				"-63.781999999999996\r\n" + 
				"-63.765666666666668\r\n" + 
				"-63.734000000000002\r\n" + 
				"-63.699500000000000\r\n" + 
				"-63.674250000000001\r\n" + 
				"-63.649199999999993\r\n" + 
				"-63.623249999999999\r\n" + 
				"-63.600999999999999\r\n" + 
				"-63.589571428571425\r\n" + 
				"-63.556500000000000\r\n" + 
				"-63.540600000000005\r\n" + 
				"-63.502499999999998\r\n" + 
				"-63.490000000000002\r\n" + 
				"-63.474499999999999\r\n" + 
				"-63.440399999999997\r\n" + 
				"-63.419999999999995\r\n" + 
				"-63.402749999999997\r\n" + 
				"-63.387000000000000\r\n" + 
				"-63.375500000000002\r\n" + 
				"-63.361999999999995\r\n" + 
				"-63.348333333333336\r\n" + 
				"-63.333333333333336\r\n" + 
				"-63.318399999999997\r\n" + 
				"-63.306500000000000\r\n" + 
				"-63.286000000000001\r\n" + 
				"-63.265000000000008\r\n" + 
				"-63.246142857142850\r\n" + 
				"-63.225999999999999\r\n" + 
				"-63.210750000000004\r\n" + 
				"-63.196199999999997\r\n" + 
				"-63.181500000000000\r\n" + 
				"-63.160333333333334\r\n" + 
				"-63.144714285714279\r\n" + 
				"-63.126333333333342\r\n" + 
				"-63.111999999999995\r\n" + 
				"-63.098090909090907\r\n" + 
				"-63.080700000000000\r\n" + 
				"-63.067499999999995\r\n" + 
				"-63.055999999999990\r\n" + 
				"-63.046500000000002\r\n" + 
				"-63.034769230769228\r\n" + 
				"-63.019999999999996\r\n" + 
				"-63.008299999999998\r\n" + 
				"-62.993384615384613\r\n" + 
				"-62.981499999999997\r\n" + 
				"-62.971499999999999\r\n" + 
				"-62.962000000000010\r\n" + 
				"-62.952499999999993\r\n" + 
				"-62.943399999999997\r\n" + 
				"-62.928222222222225\r\n" + 
				"-62.907999999999994\r\n" + 
				"-62.897000000000006\r\n" + 
				"-62.883333333333333\r\n" + 
				"-62.871499999999997\r\n" + 
				"-62.852199999999996\r\n" + 
				"-62.831666666666671\r\n" + 
				"-62.808500000000002\r\n" + 
				"-62.789999999999999\r\n" + 
				"-62.776599999999995\r\n" + 
				"-62.764000000000003\r\n" + 
				"-62.731999999999999\r\n" + 
				"-62.718666666666671\r\n" + 
				"-62.698749999999997\r\n" + 
				"-62.688500000000005\r\n" + 
				"-62.664999999999999\r\n" + 
				"-62.637666666666668\r\n" + 
				"-62.614500000000000\r\n" + 
				"-62.574999999999996\r\n" + 
				"-62.551500000000004\r\n" + 
				"-62.536500000000004\r\n" + 
				"-62.520499999999998\r\n" + 
				"-62.504750000000001\r\n" + 
				"-62.493333333333339\r\n" + 
				"-62.470666666666666\r\n" + 
				"-62.439999999999998\r\n" + 
				"-62.413750000000000\r\n" + 
				"-62.387833333333333\r\n" + 
				"-62.369000000000007\r\n" + 
				"-62.344999999999999\r\n" + 
				"-62.332999999999998\r\n" + 
				"-62.320999999999998\r\n" + 
				"-62.308999999999997\r\n" + 
				"-62.285499999999999\r\n" + 
				"-62.265666666666668\r\n" + 
				"-62.248249999999999\r\n" + 
				"-62.218333333333334\r\n" + 
				"-62.204000000000001\r\n" + 
				"-62.187749999999994\r\n" + 
				"-62.166285714285713\r\n" + 
				"-62.147999999999996\r\n" + 
				"-62.130874999999996\r\n" + 
				"-62.119500000000002\r\n" + 
				"-62.107142857142854\r\n" + 
				"-62.097000000000008\r\n" + 
				"-62.088000000000001\r\n" + 
				"-62.075923076923075\r\n" + 
				"-62.061111111111103\r\n" + 
				"-62.050500000000007\r\n" + 
				"-62.038499999999999\r\n" + 
				"-62.025999999999996\r\n" + 
				"-62.014000000000003\r\n" + 
				"-62.004500000000000\r\n" + 
				"-61.994499999999995\r\n" + 
				"-61.980999999999995\r\n" + 
				"-61.968090909090911\r\n" + 
				"-61.956200000000003\r\n" + 
				"-61.946000000000005\r\n" + 
				"-61.936857142857143\r\n" + 
				"-61.927500000000002\r\n" + 
				"-61.915999999999997\r\n" + 
				"-61.903500000000001\r\n" + 
				"-61.892000000000003\r\n" + 
				"-61.872999999999998\r\n" + 
				"-61.856333333333332\r\n" + 
				"-61.839666666666666\r\n" + 
				"-61.806666666666672\r\n" + 
				"-61.774000000000001\r\n" + 
				"-61.750000000000000\r\n" + 
				"-61.709000000000003\r\n" + 
				"-61.687333333333335\r\n" + 
				"-61.673000000000002\r\n" + 
				"-61.659999999999997\r\n" + 
				"-61.643250000000002\r\n" + 
				"-61.627499999999998\r\n" + 
				"-61.609333333333325\r\n" + 
				"-61.590599999999995\r\n" + 
				"-61.573666666666668\r\n" + 
				"-61.541666666666664\r\n" + 
				"-61.530666666666669\r\n" + 
				"-61.504800000000003\r\n" + 
				"-61.474499999999999\r\n" + 
				"-61.448999999999998\r\n" + 
				"-61.425999999999995\r\n" + 
				"-61.412999999999997\r\n" + 
				"-61.376999999999995\r\n" + 
				"-61.361666666666657\r\n" + 
				"-61.347666666666669\r\n" + 
				"-61.335999999999991\r\n" + 
				"-61.318500000000000\r\n" + 
				"-61.299750000000003\r\n" + 
				"-61.276666666666671\r\n" + 
				"-61.263500000000001\r\n" + 
				"-61.244000000000000\r\n" + 
				"-61.228166666666660\r\n" + 
				"-61.202749999999995\r\n" + 
				"-61.188000000000002\r\n" + 
				"-61.177250000000001\r\n" + 
				"-61.165333333333329\r\n" + 
				"-61.154499999999999\r\n" + 
				"-61.138749999999995\r\n" + 
				"-61.122800000000005\r\n" + 
				"-61.112500000000004\r\n" + 
				"-61.100999999999999\r\n" + 
				"-61.091499999999996\r\n" + 
				"-61.080222222222218\r\n" + 
				"-61.066785714285707\r\n" + 
				"-61.051499999999997\r\n" + 
				"-61.038499999999999\r\n" + 
				"-61.027499999999996\r\n" + 
				"-61.017500000000005\r\n" + 
				"-61.005000000000003\r\n" + 
				"-60.993000000000002\r\n" + 
				"-60.982428571428571\r\n" + 
				"-60.970454545454530\r\n" + 
				"-60.956500000000005\r\n" + 
				"-60.945499999999996\r\n" + 
				"-60.935999999999993\r\n" + 
				"-60.926000000000002\r\n" + 
				"-60.915999999999997\r\n" + 
				"-60.905666666666662\r\n" + 
				"-60.888599999999997\r\n" + 
				"-60.866166666666665\r\n" + 
				"-60.848750000000003\r\n" + 
				"-60.823833333333340\r\n" + 
				"-60.799250000000001\r\n" + 
				"-60.780999999999999\r\n" + 
				"-60.755499999999998\r\n" + 
				"-60.743333333333339\r\n" + 
				"-60.727333333333327\r\n" + 
				"-60.718750000000000\r\n" + 
				"-60.694666666666670\r\n" + 
				"-60.681666666666672\r\n" + 
				"-60.650000000000006\r\n" + 
				"-60.638249999999999\r\n" + 
				"-60.619250000000001\r\n" + 
				"-60.600499999999997\r\n" + 
				"-60.584000000000003\r\n" + 
				"-60.567200000000000\r\n" + 
				"-60.528750000000002\r\n" + 
				"-60.515999999999998\r\n" + 
				"-60.494000000000000\r\n" + 
				"-60.476333333333336\r\n" + 
				"-60.459000000000003\r\n" + 
				"-60.444000000000003\r\n" + 
				"-60.431000000000004\r\n" + 
				"-60.408749999999998\r\n" + 
				"-60.393999999999998\r\n" + 
				"-60.379800000000003\r\n" + 
				"-60.355000000000004\r\n" + 
				"-60.341999999999999\r\n" + 
				"-60.293999999999997\r\n" + 
				"-60.246333333333332\r\n" + 
				"-60.235999999999997\r\n" + 
				"-60.225333333333332\r\n" + 
				"-60.212000000000003\r\n" + 
				"-60.197333333333340\r\n" + 
				"-60.183000000000000\r\n" + 
				"-60.157333333333334\r\n" + 
				"-60.143857142857144\r\n" + 
				"-60.131750000000004\r\n" + 
				"-60.118444444444449\r\n" + 
				"-60.107749999999996\r\n" + 
				"-60.096571428571416\r\n" + 
				"-60.082363636363631\r\n" + 
				"-60.070000000000000\r\n" + 
				"-60.059499999999993\r\n" + 
				"-60.048999999999999\r\n" + 
				"-60.038499999999999\r\n" + 
				"-60.027499999999996\r\n" + 
				"-60.016500000000015\r\n" + 
				"-60.007500000000000\r\n" + 
				"-59.998500000000000\r\n" + 
				"-59.986500000000007\r\n" + 
				"-59.975500000000004\r\n" + 
				"-59.964181818181828\r\n" + 
				"-59.952999999999996\r\n" + 
				"-59.942000000000000\r\n" + 
				"-59.929500000000004\r\n" + 
				"-59.912799999999990\r\n" + 
				"-59.896000000000001\r\n" + 
				"-59.882999999999996\r\n" + 
				"-59.869999999999997\r\n" + 
				"-59.856800000000000\r\n" + 
				"-59.843800000000002\r\n" + 
				"-59.823749999999997\r\n" + 
				"-59.808000000000000\r\n" + 
				"-59.791833333333336\r\n" + 
				"-59.777749999999997\r\n" + 
				"-59.765000000000001\r\n" + 
				"-59.753333333333330\r\n" + 
				"-59.738000000000000\r\n" + 
				"-59.716500000000003\r\n" + 
				"-59.698000000000000\r\n" + 
				"-59.675333333333334\r\n" + 
				"-59.662250000000000\r\n" + 
				"-59.643000000000001\r\n" + 
				"-59.619000000000000\r\n" + 
				"-59.603749999999998\r\n" + 
				"-59.584750000000000\r\n" + 
				"-59.570666666666661\r\n" + 
				"-59.558000000000000\r\n" + 
				"-59.545000000000002\r\n" + 
				"-59.532499999999999\r\n" + 
				"-59.515999999999998\r\n" + 
				"-59.498499999999993\r\n" + 
				"-59.478999999999999\r\n" + 
				"-59.466999999999999\r\n" + 
				"-59.451999999999998\r\n" + 
				"-59.436999999999998\r\n" + 
				"-59.412999999999997\r\n" + 
				"-59.398333333333341\r\n" + 
				"-59.364666666666665\r\n" + 
				"-59.347999999999992\r\n" + 
				"-59.320999999999998\r\n" + 
				"-59.293999999999997\r\n" + 
				"-59.275666666666666\r\n" + 
				"-59.242666666666672\r\n" + 
				"-59.220749999999995\r\n" + 
				"-59.202666666666666\r\n" + 
				"-59.181750000000001\r\n" + 
				"-59.170666666666669\r\n" + 
				"-59.152199999999993\r\n" + 
				"-59.140000000000001\r\n" + 
				"-59.128125000000004\r\n" + 
				"-59.116999999999997\r\n" + 
				"-59.107600000000005\r\n" + 
				"-59.092181818181821\r\n" + 
				"-59.076999999999998\r\n" + 
				"-59.065500000000007\r\n" + 
				"-59.051499999999997\r\n" + 
				"-59.038499999999999\r\n" + 
				"-59.029000000000003\r\n" + 
				"-59.019499999999994\r\n" + 
				"-59.010500000000000\r\n" + 
				"-59.001500000000000\r\n" + 
				"-58.990499999999997\r\n" + 
				"-58.977999999999994\r\n" + 
				"-58.966666666666669\r\n" + 
				"-58.954538461538462\r\n" + 
				"-58.939333333333330\r\n" + 
				"-58.928333333333335\r\n" + 
				"-58.915599999999998\r\n" + 
				"-58.894000000000005\r\n" + 
				"-58.882624999999997\r\n" + 
				"-58.859999999999999\r\n" + 
				"-58.842500000000001\r\n" + 
				"-58.830333333333328\r\n" + 
				"-58.805000000000007\r\n" + 
				"-58.790666666666674\r\n" + 
				"-58.771333333333324\r\n" + 
				"-58.758749999999999\r\n" + 
				"-58.739999999999995\r\n" + 
				"-58.723333333333336\r\n" + 
				"-58.703428571428567\r\n" + 
				"-58.681666666666672\r\n" + 
				"-58.662666666666667\r\n" + 
				"-58.651499999999999\r\n" + 
				"-58.637249999999995\r\n" + 
				"-58.609999999999999\r\n" + 
				"-58.596500000000006\r\n" + 
				"-58.582999999999998\r\n" + 
				"-58.560500000000005\r\n" + 
				"-58.547666666666665\r\n" + 
				"-58.523199999999996\r\n" + 
				"-58.509999999999998\r\n" + 
				"-58.499249999999996\r\n" + 
				"-58.471499999999999\r\n" + 
				"-58.458666666666666\r\n" + 
				"-58.432333333333332\r\n" + 
				"-58.417000000000002\r\n" + 
				"-58.395399999999995\r\n" + 
				"-58.368666666666662\r\n" + 
				"-58.357500000000002\r\n" + 
				"-58.325999999999993\r\n" + 
				"-58.284999999999997\r\n" + 
				"-58.265999999999998\r\n" + 
				"-58.236499999999999\r\n" + 
				"-58.221285714285720\r\n" + 
				"-58.193999999999996\r\n" + 
				"-58.180000000000000\r\n" + 
				"-58.154666666666664\r\n" + 
				"-58.138666666666666\r\n" + 
				"-58.128428571428572\r\n" + 
				"-58.116799999999998\r\n" + 
				"-58.103818181818184\r\n" + 
				"-58.092400000000012\r\n" + 
				"-58.080500000000001\r\n" + 
				"-58.068500000000000\r\n" + 
				"-58.056499999999993\r\n" + 
				"-58.047500000000007\r\n" + 
				"-58.038499999999999\r\n" + 
				"-58.029000000000003\r\n" + 
				"-58.019499999999994\r\n" + 
				"-58.007500000000000\r\n" + 
				"-57.995499999999993\r\n" + 
				"-57.983499999999999\r\n" + 
				"-57.972000000000008\r\n" + 
				"-57.958428571428570\r\n" + 
				"-57.945000000000000\r\n" + 
				"-57.931000000000004\r\n" + 
				"-57.918300000000002\r\n" + 
				"-57.900666666666666\r\n" + 
				"-57.877875000000003\r\n" + 
				"-57.863333333333337\r\n" + 
				"-57.846833333333336\r\n" + 
				"-57.832000000000001\r\n" + 
				"-57.817333333333330\r\n" + 
				"-57.804666666666670\r\n" + 
				"-57.789000000000001\r\n" + 
				"-57.761800000000008\r\n" + 
				"-57.742000000000004\r\n" + 
				"-57.728999999999999\r\n" + 
				"-57.715499999999999\r\n" + 
				"-57.699400000000004\r\n" + 
				"-57.673000000000002\r\n" + 
				"-57.661000000000001\r\n" + 
				"-57.647999999999996\r\n" + 
				"-57.626999999999995\r\n" + 
				"-57.601250000000000\r\n" + 
				"-57.572399999999995\r\n" + 
				"-57.551000000000002\r\n" + 
				"-57.533999999999999\r\n" + 
				"-57.512500000000003\r\n" + 
				"-57.503000000000000\r\n" + 
				"-57.477999999999994\r\n" + 
				"-57.455500000000001\r\n" + 
				"-57.433499999999995\r\n" + 
				"-57.414000000000001\r\n" + 
				"-57.389333333333333\r\n" + 
				"-57.364999999999995\r\n" + 
				"-57.343999999999994\r\n" + 
				"-57.325199999999995\r\n" + 
				"-57.303249999999998\r\n" + 
				"-57.290750000000003\r\n" + 
				"-57.265749999999997\r\n" + 
				"-57.247999999999998\r\n" + 
				"-57.233857142857140\r\n" + 
				"-57.209249999999997\r\n" + 
				"-57.193285714285715\r\n" + 
				"-57.171499999999995\r\n" + 
				"-57.158999999999999\r\n" + 
				"-57.146000000000001\r\n" + 
				"-57.126249999999999\r\n" + 
				"-57.115833333333335\r\n" + 
				"-57.098363636363636\r\n" + 
				"-57.083375000000004\r\n" + 
				"-57.069699999999997\r\n" + 
				"-57.059999999999995\r\n" + 
				"-57.050500000000007\r\n" + 
				"-57.038499999999999\r\n" + 
				"-57.027444444444441\r\n" + 
				"-57.016500000000015\r\n" + 
				"-57.007500000000000\r\n" + 
				"-56.998500000000000\r\n" + 
				"-56.986500000000007\r\n" + 
				"-56.975571428571428\r\n" + 
				"-56.964399999999998\r\n" + 
				"-56.949909090909088\r\n" + 
				"-56.937818181818187\r\n" + 
				"-56.927600000000005\r\n" + 
				"-56.918142857142854\r\n" + 
				"-56.906500000000001\r\n" + 
				"-56.894500000000001\r\n" + 
				"-56.880599999999994\r\n" + 
				"-56.866499999999995\r\n" + 
				"-56.834000000000003\r\n" + 
				"-56.814999999999998\r\n" + 
				"-56.792499999999997\r\n" + 
				"-56.772799999999997\r\n" + 
				"-56.758666666666670\r\n" + 
				"-56.725000000000001\r\n" + 
				"-56.697333333333340\r\n" + 
				"-56.674750000000003\r\n" + 
				"-56.661500000000004\r\n" + 
				"-56.648250000000004\r\n" + 
				"-56.636249999999997\r\n" + 
				"-56.621499999999997\r\n" + 
				"-56.607999999999997\r\n" + 
				"-56.593000000000004\r\n" + 
				"-56.576333333333331\r\n" + 
				"-56.556333333333328\r\n" + 
				"-56.536000000000001\r\n" + 
				"-56.524500000000003\r\n" + 
				"-56.508499999999998\r\n" + 
				"-56.495199999999997\r\n" + 
				"-56.468499999999999\r\n" + 
				"-56.435000000000002\r\n" + 
				"-56.405124999999998\r\n" + 
				"-56.375000000000000\r\n" + 
				"-56.360500000000002\r\n" + 
				"-56.341000000000008\r\n" + 
				"-56.316333333333340\r\n" + 
				"-56.304000000000002\r\n" + 
				"-56.287999999999997\r\n" + 
				"-56.257399999999997\r\n" + 
				"-56.237285714285711\r\n" + 
				"-56.219399999999993\r\n" + 
				"-56.201000000000001\r\n" + 
				"-56.186499999999995\r\n" + 
				"-56.170000000000002\r\n" + 
				"-56.157999999999994\r\n" + 
				"-56.146333333333331\r\n" + 
				"-56.128799999999991\r\n" + 
				"-56.112090909090917\r\n" + 
				"-56.100000000000001\r\n" + 
				"-56.090000000000003\r\n" + 
				"-56.079000000000008\r\n" + 
				"-56.066500000000005\r\n" + 
				"-56.051499999999997\r\n" + 
				"-56.038499999999999\r\n" + 
				"-56.025999999999996\r\n" + 
				"-56.013500000000001\r\n" + 
				"-56.000999999999998\r\n" + 
				"-55.989500000000000\r\n" + 
				"-55.977499999999999\r\n" + 
				"-55.966999999999999\r\n" + 
				"-55.955999999999996\r\n" + 
				"-55.939999999999998\r\n" + 
				"-55.928124999999994\r\n" + 
				"-55.915333333333329\r\n" + 
				"-55.904222222222224\r\n" + 
				"-55.892499999999998\r\n" + 
				"-55.881833333333333\r\n" + 
				"-55.868333333333332\r\n" + 
				"-55.853166666666660\r\n" + 
				"-55.839333333333329\r\n" + 
				"-55.821199999999997\r\n" + 
				"-55.802750000000003\r\n" + 
				"-55.763249999999999\r\n" + 
				"-55.750500000000009\r\n" + 
				"-55.735999999999997\r\n" + 
				"-55.722999999999992\r\n" + 
				"-55.709000000000003\r\n" + 
				"-55.692333333333330\r\n" + 
				"-55.673000000000002\r\n" + 
				"-55.634400000000007\r\n" + 
				"-55.616000000000000\r\n" + 
				"-55.578249999999997\r\n" + 
				"-55.564000000000000\r\n" + 
				"-55.539999999999999\r\n" + 
				"-55.527999999999999\r\n" + 
				"-55.511333333333333\r\n" + 
				"-55.498500000000000\r\n" + 
				"-55.480999999999995\r\n" + 
				"-55.456999999999994\r\n" + 
				"-55.426500000000004\r\n" + 
				"-55.408999999999999\r\n" + 
				"-55.379200000000004\r\n" + 
				"-55.348499999999994\r\n" + 
				"-55.330249999999999\r\n" + 
				"-55.316666666666670\r\n" + 
				"-55.296333333333337\r\n" + 
				"-55.276333333333334\r\n" + 
				"-55.262500000000003\r\n" + 
				"-55.246000000000002\r\n" + 
				"-55.229999999999997\r\n" + 
				"-55.213000000000001\r\n" + 
				"-55.198571428571427\r\n" + 
				"-55.177200000000006\r\n" + 
				"-55.156500000000001\r\n" + 
				"-55.137833333333333\r\n" + 
				"-55.122400000000006\r\n" + 
				"-55.111666666666672\r\n" + 
				"-55.095916666666653\r\n" + 
				"-55.081714285714284\r\n" + 
				"-55.070083333333336\r\n" + 
				"-55.058000000000007\r\n" + 
				"-55.048499999999997\r\n" + 
				"-55.038499999999999\r\n" + 
				"-55.029000000000003\r\n" + 
				"-55.019499999999994\r\n" + 
				"-55.005846153846157\r\n" + 
				"-54.991999999999990\r\n" + 
				"-54.980499999999999\r\n" + 
				"-54.969000000000001\r\n" + 
				"-54.957272727272724\r\n" + 
				"-54.944875000000003\r\n" + 
				"-54.934000000000005\r\n" + 
				"-54.924250000000001\r\n" + 
				"-54.916200000000003\r\n" + 
				"-54.901833333333336\r\n" + 
				"-54.878000000000000\r\n" + 
				"-54.857399999999998\r\n" + 
				"-54.842500000000001\r\n" + 
				"-54.818500000000000\r\n" + 
				"-54.799999999999997\r\n" + 
				"-54.784333333333336\r\n" + 
				"-54.763750000000002\r\n" + 
				"-54.743000000000002\r\n" + 
				"-54.730833333333329\r\n" + 
				"-54.707399999999993\r\n" + 
				"-54.687800000000003\r\n" + 
				"-54.661666666666662\r\n" + 
				"-54.646500000000003\r\n" + 
				"-54.631000000000000\r\n" + 
				"-54.615000000000002\r\n" + 
				"-54.577666666666666\r\n" + 
				"-54.562333333333335\r\n" + 
				"-54.539999999999999\r\n" + 
				"-54.518333333333338\r\n" + 
				"-54.503333333333330\r\n" + 
				"-54.479428571428571\r\n" + 
				"-54.461500000000001\r\n" + 
				"-54.445999999999998\r\n" + 
				"-54.426500000000004\r\n" + 
				"-54.392333333333340\r\n" + 
				"-54.369000000000000\r\n" + 
				"-54.356600000000000\r\n" + 
				"-54.341000000000001\r\n" + 
				"-54.301000000000002\r\n" + 
				"-54.286333333333324\r\n" + 
				"-54.274999999999999\r\n" + 
				"-54.251666666666665\r\n" + 
				"-54.231249999999996\r\n" + 
				"-54.216999999999999\r\n" + 
				"-54.203333333333340\r\n" + 
				"-54.188333333333340\r\n" + 
				"-54.175500000000000\r\n" + 
				"-54.160000000000004\r\n" + 
				"-54.144714285714279\r\n" + 
				"-54.129999999999995\r\n" + 
				"-54.119500000000002\r\n" + 
				"-54.108799999999995\r\n" + 
				"-54.093888888888891\r\n" + 
				"-54.083999999999996\r\n" + 
				"-54.074500000000008\r\n" + 
				"-54.062500000000000\r\n" + 
				"-54.048785714285707\r\n" + 
				"-54.034500000000001\r\n" + 
				"-54.022500000000008\r\n" + 
				"-54.010500000000000\r\n" + 
				"-53.998500000000007\r\n" + 
				"-53.987499999999997\r\n" + 
				"-53.975416666666668\r\n" + 
				"-53.961500000000001\r\n" + 
				"-53.951222222222228\r\n" + 
				"-53.939384615384597\r\n" + 
				"-53.926666666666669\r\n" + 
				"-53.912500000000001\r\n" + 
				"-53.893000000000001\r\n" + 
				"-53.877000000000002\r\n" + 
				"-53.860999999999997\r\n" + 
				"-53.841999999999999\r\n" + 
				"-53.827599999999997\r\n" + 
				"-53.800571428571423\r\n" + 
				"-53.773600000000002\r\n" + 
				"-53.755333333333333\r\n" + 
				"-53.740749999999998\r\n" + 
				"-53.729500000000002\r\n" + 
				"-53.715500000000006\r\n" + 
				"-53.697666666666670\r\n" + 
				"-53.673999999999999\r\n" + 
				"-53.652750000000005\r\n" + 
				"-53.633333333333333\r\n" + 
				"-53.615000000000002\r\n" + 
				"-53.597499999999997\r\n" + 
				"-53.574000000000005\r\n" + 
				"-53.560000000000002\r\n" + 
				"-53.531571428571432\r\n" + 
				"-53.516600000000004\r\n" + 
				"-53.499000000000002\r\n" + 
				"-53.484499999999997\r\n" + 
				"-53.467500000000001\r\n" + 
				"-53.448599999999999\r\n" + 
				"-53.433999999999997\r\n" + 
				"-53.406500000000001\r\n" + 
				"-53.387500000000003\r\n" + 
				"-53.368999999999993\r\n" + 
				"-53.351666666666667\r\n" + 
				"-53.323666666666668\r\n" + 
				"-53.308000000000000\r\n" + 
				"-53.286666666666669\r\n" + 
				"-53.269666666666666\r\n" + 
				"-53.247000000000007\r\n" + 
				"-53.230000000000004\r\n" + 
				"-53.211999999999996\r\n" + 
				"-53.196500000000000\r\n" + 
				"-53.169374999999995\r\n" + 
				"-53.155500000000004\r\n" + 
				"-53.118333333333339\r\n" + 
				"-53.095833333333339\r\n" + 
				"-53.085714285714289\r\n" + 
				"-53.072499999999998\r\n" + 
				"-53.060500000000005\r\n" + 
				"-53.045692307692313\r\n" + 
				"-53.030500000000004\r\n" + 
				"-53.016500000000008\r\n" + 
				"-53.002785714285714\r\n" + 
				"-52.989500000000000\r\n" + 
				"-52.976999999999997\r\n" + 
				"-52.965499999999999\r\n" + 
				"-52.953999999999994\r\n" + 
				"-52.943857142857148\r\n" + 
				"-52.931416666666657\r\n" + 
				"-52.917500000000004\r\n" + 
				"-52.905666666666669\r\n" + 
				"-52.897500000000001\r\n" + 
				"-52.869000000000000\r\n" + 
				"-52.854500000000002\r\n" + 
				"-52.842200000000005\r\n" + 
				"-52.820750000000004\r\n" + 
				"-52.806333333333328\r\n" + 
				"-52.792000000000002\r\n" + 
				"-52.768999999999998\r\n" + 
				"-52.749250000000004\r\n" + 
				"-52.735999999999997\r\n" + 
				"-52.713333333333331\r\n" + 
				"-52.691000000000003\r\n" + 
				"-52.675500000000000\r\n" + 
				"-52.662499999999994\r\n" + 
				"-52.640999999999998\r\n" + 
				"-52.627499999999998\r\n" + 
				"-52.611499999999999\r\n" + 
				"-52.584000000000003\r\n" + 
				"-52.569000000000003\r\n" + 
				"-52.548600000000000\r\n" + 
				"-52.532999999999994\r\n" + 
				"-52.506500000000003\r\n" + 
				"-52.491999999999997\r\n" + 
				"-52.479999999999997\r\n" + 
				"-52.459333333333326\r\n" + 
				"-52.437500000000000\r\n" + 
				"-52.425500000000000\r\n" + 
				"-52.403833333333331\r\n" + 
				"-52.383249999999997\r\n" + 
				"-52.370600000000003\r\n" + 
				"-52.348333333333336\r\n" + 
				"-52.331000000000003\r\n" + 
				"-52.305999999999997\r\n" + 
				"-52.289666666666669\r\n" + 
				"-52.272500000000001\r\n" + 
				"-52.258666666666670\r\n" + 
				"-52.231499999999997\r\n" + 
				"-52.214666666666666\r\n" + 
				"-52.199749999999995\r\n" + 
				"-52.186666666666667\r\n" + 
				"-52.169599999999988\r\n" + 
				"-52.154499999999999\r\n" + 
				"-52.139400000000002\r\n" + 
				"-52.128999999999998\r\n" + 
				"-52.117428571428569\r\n" + 
				"-52.106857142857152\r\n" + 
				"-52.093333333333334\r\n" + 
				"-52.080500000000001\r\n" + 
				"-52.069375000000001\r\n" + 
				"-52.059999999999995\r\n" + 
				"-52.050500000000007\r\n" + 
				"-52.038499999999999\r\n" + 
				"-52.027499999999996\r\n" + 
				"-52.016454545454536\r\n" + 
				"-52.004500000000000\r\n" + 
				"-51.992500000000007\r\n" + 
				"-51.979307692307692\r\n" + 
				"-51.963333333333338\r\n" + 
				"-51.950375000000008\r\n" + 
				"-51.939999999999998\r\n" + 
				"-51.930142857142862\r\n" + 
				"-51.920000000000002\r\n" + 
				"-51.908666666666669\r\n" + 
				"-51.890999999999998\r\n" + 
				"-51.869166666666672\r\n" + 
				"-51.843999999999994\r\n" + 
				"-51.829666666666668\r\n" + 
				"-51.813000000000002\r\n" + 
				"-51.797199999999997\r\n" + 
				"-51.776600000000009\r\n" + 
				"-51.757000000000005\r\n" + 
				"-51.744666666666667\r\n" + 
				"-51.725499999999997\r\n" + 
				"-51.695999999999998\r\n" + 
				"-51.669999999999995\r\n" + 
				"-51.646000000000001\r\n" + 
				"-51.622000000000000\r\n" + 
				"-51.605400000000010\r\n" + 
				"-51.585400000000007\r\n" + 
				"-51.570999999999998\r\n" + 
				"-51.547666666666665\r\n" + 
				"-51.527333333333331\r\n" + 
				"-51.507199999999997\r\n" + 
				"-51.483999999999995\r\n" + 
				"-51.457000000000001\r\n" + 
				"-51.427199999999992\r\n" + 
				"-51.414000000000001\r\n" + 
				"-51.394666666666666\r\n" + 
				"-51.382000000000005\r\n" + 
				"-51.369000000000000\r\n" + 
				"-51.342333333333329\r\n" + 
				"-51.327500000000001\r\n" + 
				"-51.311666666666667\r\n" + 
				"-51.296999999999997\r\n" + 
				"-51.279666666666664\r\n" + 
				"-51.258799999999994\r\n" + 
				"-51.246499999999997\r\n" + 
				"-51.228999999999999\r\n" + 
				"-51.201500000000003\r\n" + 
				"-51.186999999999998\r\n" + 
				"-51.171499999999995\r\n" + 
				"-51.161499999999997\r\n" + 
				"-51.149199999999993\r\n" + 
				"-51.134750000000004\r\n" + 
				"-51.120249999999999\r\n" + 
				"-51.105636363636364\r\n" + 
				"-51.085333333333338\r\n" + 
				"-51.074500000000000\r\n" + 
				"-51.064142857142848\r\n" + 
				"-51.051000000000002\r\n" + 
				"-51.038499999999999\r\n" + 
				"-51.024999999999999\r\n" + 
				"-51.010500000000000\r\n" + 
				"-50.999499999999998\r\n" + 
				"-50.990000000000002\r\n" + 
				"-50.980999999999995\r\n" + 
				"-50.971499999999999\r\n" + 
				"-50.960000000000008\r\n" + 
				"-50.942999999999998\r\n" + 
				"-50.928000000000004\r\n" + 
				"-50.902400000000000\r\n" + 
				"-50.889000000000003\r\n" + 
				"-50.877333333333333\r\n" + 
				"-50.860399999999998\r\n" + 
				"-50.844999999999999\r\n" + 
				"-50.821750000000002\r\n" + 
				"-50.803333333333335\r\n" + 
				"-50.787666666666667\r\n" + 
				"-50.771749999999997\r\n" + 
				"-50.762749999999997\r\n" + 
				"-50.747333333333330\r\n" + 
				"-50.722499999999997\r\n" + 
				"-50.703125000000000\r\n" + 
				"-50.689750000000004\r\n" + 
				"-50.677000000000000\r\n" + 
				"-50.658999999999999\r\n" + 
				"-50.641666666666673\r\n" + 
				"-50.619199999999999\r\n" + 
				"-50.594999999999999\r\n" + 
				"-50.570999999999998\r\n" + 
				"-50.549399999999991\r\n" + 
				"-50.536333333333339\r\n" + 
				"-50.525750000000002\r\n" + 
				"-50.515249999999995\r\n" + 
				"-50.488999999999997\r\n" + 
				"-50.469666666666662\r\n" + 
				"-50.455666666666673\r\n" + 
				"-50.436666666666667\r\n" + 
				"-50.424999999999997\r\n" + 
				"-50.397333333333336\r\n" + 
				"-50.381333333333338\r\n" + 
				"-50.365800000000000\r\n" + 
				"-50.347333333333331\r\n" + 
				"-50.323999999999998\r\n" + 
				"-50.302833333333332\r\n" + 
				"-50.292000000000002\r\n" + 
				"-50.258000000000003\r\n" + 
				"-50.241749999999996\r\n" + 
				"-50.230000000000004\r\n" + 
				"-50.219833333333334\r\n" + 
				"-50.201599999999999\r\n" + 
				"-50.187666666666665\r\n" + 
				"-50.172799999999995\r\n" + 
				"-50.157000000000004\r\n" + 
				"-50.145400000000002\r\n" + 
				"-50.136200000000002\r\n" + 
				"-50.123250000000006\r\n" + 
				"-50.114624999999997\r\n" + 
				"-50.101599999999998\r\n" + 
				"-50.091888888888896\r\n" + 
				"-50.080000000000013\r\n" + 
				"-50.066866666666662\r\n" + 
				"-50.051307692307688\r\n" + 
				"-50.038499999999999\r\n" + 
				"-50.029000000000003\r\n" + 
				"-50.019499999999994\r\n" + 
				"-50.007500000000000\r\n" + 
				"-49.996299999999998\r\n" + 
				"-49.986499999999999\r\n" + 
				"-49.977499999999999\r\n" + 
				"-49.963466666666669\r\n" + 
				"-49.949500000000000\r\n" + 
				"-49.937199999999997\r\n" + 
				"-49.924599999999998\r\n" + 
				"-49.913444444444444\r\n" + 
				"-49.897125000000003\r\n" + 
				"-49.882500000000000\r\n" + 
				"-49.865166666666660\r\n" + 
				"-49.849200000000003\r\n" + 
				"-49.833250000000000\r\n" + 
				"-49.819000000000003\r\n" + 
				"-49.805250000000001\r\n" + 
				"-49.789499999999997\r\n" + 
				"-49.767375000000001\r\n" + 
				"-49.748999999999995\r\n" + 
				"-49.719499999999996\r\n" + 
				"-49.697600000000001\r\n" + 
				"-49.676833333333342\r\n" + 
				"-49.658000000000001\r\n" + 
				"-49.646999999999998\r\n" + 
				"-49.625750000000004\r\n" + 
				"-49.610666666666667\r\n" + 
				"-49.598999999999997\r\n" + 
				"-49.585333333333331\r\n" + 
				"-49.570999999999998\r\n" + 
				"-49.551500000000004\r\n" + 
				"-49.541499999999999\r\n" + 
				"-49.525000000000006\r\n" + 
				"-49.513000000000005\r\n" + 
				"-49.502999999999993\r\n" + 
				"-49.491333333333330\r\n" + 
				"-49.476500000000001\r\n" + 
				"-49.456000000000003\r\n" + 
				"-49.415999999999997\r\n" + 
				"-49.397500000000001\r\n" + 
				"-49.379999999999995\r\n" + 
				"-49.367999999999995\r\n" + 
				"-49.353999999999999\r\n" + 
				"-49.334500000000006\r\n" + 
				"-49.323750000000004\r\n" + 
				"-49.311333333333330\r\n" + 
				"-49.295333333333332\r\n" + 
				"-49.281999999999996\r\n" + 
				"-49.262000000000000\r\n" + 
				"-49.245666666666665\r\n" + 
				"-49.233333333333341\r\n" + 
				"-49.218000000000004\r\n" + 
				"-49.201999999999998\r\n" + 
				"-49.182142857142857\r\n" + 
				"-49.167000000000002\r\n" + 
				"-49.152500000000003\r\n" + 
				"-49.131000000000000\r\n" + 
				"-49.112250000000003\r\n" + 
				"-49.093666666666671\r\n" + 
				"-49.078875000000004\r\n" + 
				"-49.064363636363630\r\n" + 
				"-49.051000000000002\r\n" + 
				"-49.038999999999994\r\n" + 
				"-49.029000000000003\r\n" + 
				"-49.018499999999996\r\n" + 
				"-49.003499999999995\r\n" + 
				"-48.989500000000000\r\n" + 
				"-48.977499999999999\r\n" + 
				"-48.968166666666662\r\n" + 
				"-48.957625000000007\r\n" + 
				"-48.945333333333338\r\n" + 
				"-48.933499999999995\r\n" + 
				"-48.922999999999995\r\n" + 
				"-48.912500000000001\r\n" + 
				"-48.898333333333333\r\n" + 
				"-48.885999999999996\r\n" + 
				"-48.869333333333337\r\n" + 
				"-48.856999999999999\r\n" + 
				"-48.840499999999999\r\n" + 
				"-48.814200000000000\r\n" + 
				"-48.798000000000002\r\n" + 
				"-48.789250000000003\r\n" + 
				"-48.773666666666664\r\n" + 
				"-48.752200000000002\r\n" + 
				"-48.717600000000004\r\n" + 
				"-48.697000000000003\r\n" + 
				"-48.685499999999998\r\n" + 
				"-48.664500000000004\r\n" + 
				"-48.642333333333333\r\n" + 
				"-48.605714285714285\r\n" + 
				"-48.586250000000007\r\n" + 
				"-48.563000000000002\r\n" + 
				"-48.547499999999999\r\n" + 
				"-48.534199999999998\r\n" + 
				"-48.519500000000001\r\n" + 
				"-48.496749999999999\r\n" + 
				"-48.461750000000009\r\n" + 
				"-48.445500000000003\r\n" + 
				"-48.422499999999999\r\n" + 
				"-48.396333333333331\r\n" + 
				"-48.382000000000005\r\n" + 
				"-48.366999999999997\r\n" + 
				"-48.347999999999999\r\n" + 
				"-48.326875000000001\r\n" + 
				"-48.307000000000002\r\n" + 
				"-48.284999999999997\r\n" + 
				"-48.259999999999998\r\n" + 
				"-48.245428571428576\r\n" + 
				"-48.228999999999999\r\n" + 
				"-48.212666666666671\r\n" + 
				"-48.187750000000001\r\n" + 
				"-48.167199999999994\r\n" + 
				"-48.156500000000001\r\n" + 
				"-48.140000000000008\r\n" + 
				"-48.122799999999998\r\n" + 
				"-48.105999999999995\r\n" + 
				"-48.091222222222221\r\n" + 
				"-48.078874999999996\r\n" + 
				"-48.066000000000003\r\n" + 
				"-48.053999999999995\r\n" + 
				"-48.041500000000006\r\n" + 
				"-48.028500000000001\r\n" + 
				"-48.019500000000001\r\n" + 
				"-48.010500000000000\r\n" + 
				"-47.998500000000000\r\n" + 
				"-47.987499999999997\r\n" + 
				"-47.976125000000003\r\n" + 
				"-47.965000000000003\r\n" + 
				"-47.953888888888891\r\n" + 
				"-47.937999999999995\r\n" + 
				"-47.924875000000007\r\n" + 
				"-47.912999999999997\r\n" + 
				"-47.893666666666668\r\n" + 
				"-47.877400000000002\r\n" + 
				"-47.856749999999998\r\n" + 
				"-47.840600000000002\r\n" + 
				"-47.825500000000005\r\n" + 
				"-47.807399999999994\r\n" + 
				"-47.783250000000002\r\n" + 
				"-47.772333333333336\r\n" + 
				"-47.760000000000005\r\n" + 
				"-47.747200000000007\r\n" + 
				"-47.727750000000000\r\n" + 
				"-47.713666666666676\r\n" + 
				"-47.694000000000003\r\n" + 
				"-47.677500000000002\r\n" + 
				"-47.664571428571428\r\n" + 
				"-47.632666666666665\r\n" + 
				"-47.605000000000004\r\n" + 
				"-47.581500000000005\r\n" + 
				"-47.561999999999998\r\n" + 
				"-47.539285714285711\r\n" + 
				"-47.517666666666663\r\n" + 
				"-47.509399999999992\r\n" + 
				"-47.485333333333330\r\n" + 
				"-47.463333333333331\r\n" + 
				"-47.445999999999998\r\n" + 
				"-47.414333333333332\r\n" + 
				"-47.394000000000005\r\n" + 
				"-47.382000000000005\r\n" + 
				"-47.366000000000007\r\n" + 
				"-47.338375000000006\r\n" + 
				"-47.315600000000003\r\n" + 
				"-47.302000000000000\r\n" + 
				"-47.285399999999996\r\n" + 
				"-47.270000000000003\r\n" + 
				"-47.248800000000003\r\n" + 
				"-47.229500000000002\r\n" + 
				"-47.216750000000005\r\n" + 
				"-47.193200000000004\r\n" + 
				"-47.175750000000001\r\n" + 
				"-47.160333333333334\r\n" + 
				"-47.151200000000003\r\n" + 
				"-47.133400000000002\r\n" + 
				"-47.118166666666667\r\n" + 
				"-47.097500000000004\r\n" + 
				"-47.078249999999997\r\n" + 
				"-47.065500000000007\r\n" + 
				"-47.051499999999990\r\n" + 
				"-47.040000000000006\r\n" + 
				"-47.030555555555551\r\n" + 
				"-47.019499999999994\r\n" + 
				"-47.007500000000000\r\n" + 
				"-46.995499999999993\r\n" + 
				"-46.985399999999998\r\n" + 
				"-46.975500000000004\r\n" + 
				"-46.965083333333347\r\n" + 
				"-46.954125000000005\r\n" + 
				"-46.940222222222218\r\n" + 
				"-46.927571428571433\r\n" + 
				"-46.914999999999999\r\n" + 
				"-46.903800000000004\r\n" + 
				"-46.883666666666670\r\n" + 
				"-46.863499999999995\r\n" + 
				"-46.845428571428570\r\n" + 
				"-46.830999999999996\r\n" + 
				"-46.817999999999998\r\n" + 
				"-46.802800000000005\r\n" + 
				"-46.781571428571432\r\n" + 
				"-46.758666666666670\r\n" + 
				"-46.742999999999995\r\n" + 
				"-46.729250000000000\r\n" + 
				"-46.711400000000005\r\n" + 
				"-46.702333333333335\r\n" + 
				"-46.689250000000001\r\n" + 
				"-46.670249999999996\r\n" + 
				"-46.649000000000001\r\n" + 
				"-46.637500000000003\r\n" + 
				"-46.621599999999994\r\n" + 
				"-46.600999999999999\r\n" + 
				"-46.573000000000000\r\n" + 
				"-46.557500000000005\r\n" + 
				"-46.537799999999990\r\n" + 
				"-46.523000000000003\r\n" + 
				"-46.506999999999998\r\n" + 
				"-46.496000000000002\r\n" + 
				"-46.469500000000004\r\n" + 
				"-46.442499999999995\r\n" + 
				"-46.420999999999992\r\n" + 
				"-46.404666666666664\r\n" + 
				"-46.381799999999998\r\n" + 
				"-46.361750000000001\r\n" + 
				"-46.347499999999997\r\n" + 
				"-46.337750000000007\r\n" + 
				"-46.315250000000006\r\n" + 
				"-46.295333333333332\r\n" + 
				"-46.281999999999996\r\n" + 
				"-46.232749999999996\r\n" + 
				"-46.214555555555563\r\n" + 
				"-46.197249999999997\r\n" + 
				"-46.186999999999998\r\n" + 
				"-46.168750000000003\r\n" + 
				"-46.146666666666668\r\n" + 
				"-46.124714285714283\r\n" + 
				"-46.110249999999994\r\n" + 
				"-46.101857142857156\r\n" + 
				"-46.089666666666666\r\n" + 
				"-46.080222222222226\r\n" + 
				"-46.068250000000006\r\n" + 
				"-46.059000000000005\r\n" + 
				"-46.049500000000002\r\n" + 
				"-46.038499999999999\r\n" + 
				"-46.027300000000004\r\n" + 
				"-46.013500000000001\r\n" + 
				"-46.001500000000000\r\n" + 
				"-45.989500000000000\r\n" + 
				"-45.977499999999999\r\n" + 
				"-45.963090909090909\r\n" + 
				"-45.948500000000003\r\n" + 
				"-45.937545454545450\r\n" + 
				"-45.923166666666667\r\n" + 
				"-45.910000000000004\r\n" + 
				"-45.899000000000001\r\n" + 
				"-45.884250000000002\r\n" + 
				"-45.871000000000002\r\n" + 
				"-45.851333333333336\r\n" + 
				"-45.834000000000003\r\n" + 
				"-45.811333333333330\r\n" + 
				"-45.792333333333339\r\n" + 
				"-45.767333333333340\r\n" + 
				"-45.719999999999999\r\n" + 
				"-45.707666666666661\r\n" + 
				"-45.688499999999998\r\n" + 
				"-45.674999999999997\r\n" + 
				"-45.654999999999994\r\n" + 
				"-45.633000000000003\r\n" + 
				"-45.612749999999998\r\n" + 
				"-45.576499999999996\r\n" + 
				"-45.561499999999995\r\n" + 
				"-45.537999999999997\r\n" + 
				"-45.522142857142853\r\n" + 
				"-45.503000000000000\r\n" + 
				"-45.488500000000002\r\n" + 
				"-45.461200000000005\r\n" + 
				"-45.438000000000002\r\n" + 
				"-45.425666666666665\r\n" + 
				"-45.411249999999995\r\n" + 
				"-45.394600000000004\r\n" + 
				"-45.380499999999998\r\n" + 
				"-45.362250000000003\r\n" + 
				"-45.348500000000001\r\n" + 
				"-45.329000000000001\r\n" + 
				"-45.311000000000000\r\n" + 
				"-45.293999999999997\r\n" + 
				"-45.271500000000003\r\n" + 
				"-45.254500000000000\r\n" + 
				"-45.238999999999997\r\n" + 
				"-45.213999999999999\r\n" + 
				"-45.199599999999997\r\n" + 
				"-45.162333333333343\r\n" + 
				"-45.142200000000003\r\n" + 
				"-45.124000000000002\r\n" + 
				"-45.111333333333334\r\n" + 
				"-45.096555555555554\r\n" + 
				"-45.081125000000000\r\n" + 
				"-45.070999999999998\r\n" + 
				"-45.061000000000000\r\n" + 
				"-45.050500000000000\r\n" + 
				"-45.038499999999999\r\n" + 
				"-45.027555555555558\r\n" + 
				"-45.016500000000008\r\n" + 
				"-45.004500000000000\r\n" + 
				"-44.992799999999995\r\n" + 
				"-44.983800000000002\r\n" + 
				"-44.973999999999997\r\n" + 
				"-44.961181818181814\r\n" + 
				"-44.949500000000000\r\n" + 
				"-44.938428571428567\r\n" + 
				"-44.926111111111112\r\n" + 
				"-44.908333333333331\r\n" + 
				"-44.889428571428581\r\n" + 
				"-44.876142857142860\r\n" + 
				"-44.858400000000003\r\n" + 
				"-44.835250000000002\r\n" + 
				"-44.812333333333335\r\n" + 
				"-44.795000000000002\r\n" + 
				"-44.779166666666661\r\n" + 
				"-44.762500000000003\r\n" + 
				"-44.740000000000002\r\n" + 
				"-44.723199999999999\r\n" + 
				"-44.711500000000001\r\n" + 
				"-44.691800000000001\r\n" + 
				"-44.676500000000004\r\n" + 
				"-44.665500000000002\r\n" + 
				"-44.652500000000003\r\n" + 
				"-44.627000000000002\r\n" + 
				"-44.614000000000004\r\n" + 
				"-44.592500000000001\r\n" + 
				"-44.567000000000000\r\n" + 
				"-44.552666666666674\r\n" + 
				"-44.528999999999996\r\n" + 
				"-44.509000000000007\r\n" + 
				"-44.483571428571430\r\n" + 
				"-44.465333333333341\r\n" + 
				"-44.454500000000003\r\n" + 
				"-44.436000000000000\r\n" + 
				"-44.417000000000002\r\n" + 
				"-44.399999999999999\r\n" + 
				"-44.384999999999998\r\n" + 
				"-44.369333333333337\r\n" + 
				"-44.359666666666669\r\n" + 
				"-44.345250000000000\r\n" + 
				"-44.319599999999994\r\n" + 
				"-44.301333333333332\r\n" + 
				"-44.277750000000005\r\n" + 
				"-44.242500000000000\r\n" + 
				"-44.213499999999996\r\n" + 
				"-44.202500000000008\r\n" + 
				"-44.183000000000000\r\n" + 
				"-44.169333333333327\r\n" + 
				"-44.153000000000006\r\n" + 
				"-44.133000000000003\r\n" + 
				"-44.115714285714276\r\n" + 
				"-44.102374999999995\r\n" + 
				"-44.088000000000001\r\n" + 
				"-44.078249999999997\r\n" + 
				"-44.066500000000005\r\n" + 
				"-44.051785714285714\r\n" + 
				"-44.038499999999999\r\n" + 
				"-44.029000000000003\r\n" + 
				"-44.019500000000001\r\n" + 
				"-44.010500000000000\r\n" + 
				"-44.001500000000000\r\n" + 
				"-43.989500000000000\r\n" + 
				"-43.977499999999999\r\n" + 
				"-43.966500000000011\r\n" + 
				"-43.955500000000001\r\n" + 
				"-43.942714285714295\r\n" + 
				"-43.928083333333326\r\n" + 
				"-43.910666666666664\r\n" + 
				"-43.896666666666668\r\n" + 
				"-43.880333333333333\r\n" + 
				"-43.863000000000000\r\n" + 
				"-43.845333333333336\r\n" + 
				"-43.832749999999997\r\n" + 
				"-43.816999999999993\r\n" + 
				"-43.793999999999997\r\n" + 
				"-43.762666666666668\r\n" + 
				"-43.738800000000005\r\n" + 
				"-43.692999999999998\r\n" + 
				"-43.650750000000002\r\n" + 
				"-43.635000000000005\r\n" + 
				"-43.622500000000002\r\n" + 
				"-43.609999999999999\r\n" + 
				"-43.594999999999999\r\n" + 
				"-43.573999999999998\r\n" + 
				"-43.555333333333330\r\n" + 
				"-43.532499999999999\r\n" + 
				"-43.521500000000003\r\n" + 
				"-43.488000000000000\r\n" + 
				"-43.463999999999999\r\n" + 
				"-43.446333333333335\r\n" + 
				"-43.419250000000005\r\n" + 
				"-43.397000000000006\r\n" + 
				"-43.373333333333335\r\n" + 
				"-43.343750000000000\r\n" + 
				"-43.329999999999998\r\n" + 
				"-43.311000000000000\r\n" + 
				"-43.298999999999999\r\n" + 
				"-43.291249999999998\r\n" + 
				"-43.276499999999999\r\n" + 
				"-43.259666666666668\r\n" + 
				"-43.237000000000002\r\n" + 
				"-43.214500000000001\r\n" + 
				"-43.193500000000000\r\n" + 
				"-43.177333333333330\r\n" + 
				"-43.158999999999999\r\n" + 
				"-43.131750000000004\r\n" + 
				"-43.108181818181819\r\n" + 
				"-43.097142857142849\r\n" + 
				"-43.087333333333333\r\n" + 
				"-43.075583333333334\r\n" + 
				"-43.063777777777773\r\n" + 
				"-43.053999999999995\r\n" + 
				"-43.044000000000004\r\n" + 
				"-43.031999999999996\r\n" + 
				"-43.018999999999998\r\n" + 
				"-43.007500000000000\r\n" + 
				"-42.995500000000000\r\n" + 
				"-42.983499999999999\r\n" + 
				"-42.972500000000004\r\n" + 
				"-42.963166666666666\r\n" + 
				"-42.941099999999999\r\n" + 
				"-42.924599999999998\r\n" + 
				"-42.912999999999997\r\n" + 
				"-42.900399999999998\r\n" + 
				"-42.883249999999997\r\n" + 
				"-42.855499999999992\r\n" + 
				"-42.844333333333331\r\n" + 
				"-42.830500000000001\r\n" + 
				"-42.813500000000005\r\n" + 
				"-42.786000000000001\r\n" + 
				"-42.769666666666666\r\n" + 
				"-42.758333333333326\r\n" + 
				"-42.744000000000000\r\n" + 
				"-42.730999999999995\r\n" + 
				"-42.717999999999996\r\n" + 
				"-42.705999999999996\r\n" + 
				"-42.674124999999997\r\n" + 
				"-42.661000000000001\r\n" + 
				"-42.644500000000001\r\n" + 
				"-42.624000000000002\r\n" + 
				"-42.596750000000000\r\n" + 
				"-42.576666666666668\r\n" + 
				"-42.555199999999999\r\n" + 
				"-42.537333333333329\r\n" + 
				"-42.522250000000000\r\n" + 
				"-42.505499999999998\r\n" + 
				"-42.490666666666662\r\n" + 
				"-42.469666666666669\r\n" + 
				"-42.440999999999995\r\n" + 
				"-42.420999999999999\r\n" + 
				"-42.410499999999999\r\n" + 
				"-42.397333333333336\r\n" + 
				"-42.367833333333330\r\n" + 
				"-42.349333333333334\r\n" + 
				"-42.332333333333331\r\n" + 
				"-42.287999999999997\r\n" + 
				"-42.272999999999996\r\n" + 
				"-42.255499999999998\r\n" + 
				"-42.232399999999998\r\n" + 
				"-42.211999999999996\r\n" + 
				"-42.194749999999999\r\n" + 
				"-42.182399999999994\r\n" + 
				"-42.154249999999998\r\n" + 
				"-42.143500000000003\r\n" + 
				"-42.131799999999998\r\n" + 
				"-42.118999999999993\r\n" + 
				"-42.108750000000001\r\n" + 
				"-42.096545454545449\r\n" + 
				"-42.080833333333338\r\n" + 
				"-42.069000000000003\r\n" + 
				"-42.058999999999990\r\n" + 
				"-42.049999999999997\r\n" + 
				"-42.037999999999997\r\n" + 
				"-42.029000000000003\r\n" + 
				"-42.019500000000001\r\n" + 
				"-42.007500000000000\r\n" + 
				"-41.994999999999997\r\n" + 
				"-41.986499999999999\r\n" + 
				"-41.977499999999999\r\n" + 
				"-41.967285714285715\r\n" + 
				"-41.956000000000003\r\n" + 
				"-41.944888888888890\r\n" + 
				"-41.934600000000003\r\n" + 
				"-41.922799999999995\r\n" + 
				"-41.913499999999999\r\n" + 
				"-41.904333333333334\r\n" + 
				"-41.884000000000000\r\n" + 
				"-41.870666666666665\r\n" + 
				"-41.855399999999996\r\n" + 
				"-41.837750000000000\r\n" + 
				"-41.822800000000001\r\n" + 
				"-41.785999999999994\r\n" + 
				"-41.762500000000003\r\n" + 
				"-41.750000000000000\r\n" + 
				"-41.715000000000003\r\n" + 
				"-41.691000000000003\r\n" + 
				"-41.669799999999995\r\n" + 
				"-41.655000000000001\r\n" + 
				"-41.629500000000000\r\n" + 
				"-41.606142857142856\r\n" + 
				"-41.590000000000003\r\n" + 
				"-41.572333333333326\r\n" + 
				"-41.557749999999999\r\n" + 
				"-41.539749999999998\r\n" + 
				"-41.518000000000001\r\n" + 
				"-41.500666666666667\r\n" + 
				"-41.481499999999997\r\n" + 
				"-41.466500000000003\r\n" + 
				"-41.451000000000001\r\n" + 
				"-41.439333333333330\r\n" + 
				"-41.411749999999998\r\n" + 
				"-41.400333333333329\r\n" + 
				"-41.380749999999999\r\n" + 
				"-41.360333333333330\r\n" + 
				"-41.344999999999999\r\n" + 
				"-41.333399999999997\r\n" + 
				"-41.304249999999996\r\n" + 
				"-41.260600000000004\r\n" + 
				"-41.230666666666671\r\n" + 
				"-41.198999999999998\r\n" + 
				"-41.178500000000000\r\n" + 
				"-41.163800000000002\r\n" + 
				"-41.140749999999997\r\n" + 
				"-41.126666666666672\r\n" + 
				"-41.113900000000001\r\n" + 
				"-41.096624999999996\r\n" + 
				"-41.085999999999999\r\n" + 
				"-41.072749999999999\r\n" + 
				"-41.062999999999995\r\n" + 
				"-41.051999999999992\r\n" + 
				"-41.039384615384613\r\n" + 
				"-41.027000000000001\r\n" + 
				"-41.016500000000001\r\n" + 
				"-41.004500000000000\r\n" + 
				"-40.992500000000000\r\n" + 
				"-40.980499999999999\r\n" + 
				"-40.967500000000001\r\n" + 
				"-40.955999999999996\r\n" + 
				"-40.944000000000003\r\n" + 
				"-40.925714285714285\r\n" + 
				"-40.911000000000001\r\n" + 
				"-40.899600000000000\r\n" + 
				"-40.868000000000002\r\n" + 
				"-40.852499999999999\r\n" + 
				"-40.842500000000001\r\n" + 
				"-40.825833333333328\r\n" + 
				"-40.804142857142857\r\n" + 
				"-40.780749999999998\r\n" + 
				"-40.767000000000003\r\n" + 
				"-40.750399999999999\r\n" + 
				"-40.729500000000002\r\n" + 
				"-40.713999999999999\r\n" + 
				"-40.695000000000000\r\n" + 
				"-40.680000000000000\r\n" + 
				"-40.666499999999999\r\n" + 
				"-40.646000000000001\r\n" + 
				"-40.618000000000002\r\n" + 
				"-40.584666666666671\r\n" + 
				"-40.554500000000004\r\n" + 
				"-40.537999999999997\r\n" + 
				"-40.523000000000003\r\n" + 
				"-40.507624999999997\r\n" + 
				"-40.489000000000004\r\n" + 
				"-40.467333333333329\r\n" + 
				"-40.445999999999998\r\n" + 
				"-40.426499999999997\r\n" + 
				"-40.405333333333331\r\n" + 
				"-40.391750000000002\r\n" + 
				"-40.379999999999995\r\n" + 
				"-40.361333333333334\r\n" + 
				"-40.348200000000006\r\n" + 
				"-40.336333333333336\r\n" + 
				"-40.324500000000000\r\n" + 
				"-40.300333333333334\r\n" + 
				"-40.284499999999994\r\n" + 
				"-40.267000000000003\r\n" + 
				"-40.228285714285718\r\n" + 
				"-40.204799999999999\r\n" + 
				"-40.183199999999999\r\n" + 
				"-40.170800000000000\r\n" + 
				"-40.149333333333331\r\n" + 
				"-40.137600000000006\r\n" + 
				"-40.117888888888885\r\n" + 
				"-40.096818181818179\r\n" + 
				"-40.079499999999996\r\n" + 
				"-40.070000000000000\r\n" + 
				"-40.061000000000000\r\n" + 
				"-40.050909090909094\r\n" + 
				"-40.038000000000004\r\n" + 
				"-40.027499999999996\r\n" + 
				"-40.016083333333334\r\n" + 
				"-40.005000000000003\r\n" + 
				"-39.995500000000000\r\n" + 
				"-39.983499999999999\r\n" + 
				"-39.972333333333331\r\n" + 
				"-39.962571428571430\r\n" + 
				"-39.953125000000000\r\n" + 
				"-39.940222222222218\r\n" + 
				"-39.926999999999992\r\n" + 
				"-39.909500000000001\r\n" + 
				"-39.900250000000000\r\n" + 
				"-39.889999999999993\r\n" + 
				"-39.872000000000000\r\n" + 
				"-39.860199999999999\r\n" + 
				"-39.848749999999995\r\n" + 
				"-39.839000000000006\r\n" + 
				"-39.823166666666665\r\n" + 
				"-39.794999999999995\r\n" + 
				"-39.760500000000000\r\n" + 
				"-39.741999999999997\r\n" + 
				"-39.728000000000002\r\n" + 
				"-39.699666666666666\r\n" + 
				"-39.686500000000002\r\n" + 
				"-39.663800000000002\r\n" + 
				"-39.647999999999996\r\n" + 
				"-39.612399999999994\r\n" + 
				"-39.593000000000004\r\n" + 
				"-39.570000000000000\r\n" + 
				"-39.553666666666665\r\n" + 
				"-39.517800000000001\r\n" + 
				"-39.493199999999995\r\n" + 
				"-39.456000000000003\r\n" + 
				"-39.444249999999997\r\n" + 
				"-39.429999999999993\r\n" + 
				"-39.407000000000004\r\n" + 
				"-39.392000000000003\r\n" + 
				"-39.376666666666665\r\n" + 
				"-39.366749999999996\r\n" + 
				"-39.352999999999994\r\n" + 
				"-39.337000000000003\r\n" + 
				"-39.317428571428579\r\n" + 
				"-39.290499999999994\r\n" + 
				"-39.276666666666664\r\n" + 
				"-39.259666666666668\r\n" + 
				"-39.237249999999996\r\n" + 
				"-39.214999999999996\r\n" + 
				"-39.201000000000001\r\n" + 
				"-39.182571428571421\r\n" + 
				"-39.164749999999998\r\n" + 
				"-39.148499999999999\r\n" + 
				"-39.130250000000004\r\n" + 
				"-39.120500000000000\r\n" + 
				"-39.106714285714283\r\n" + 
				"-39.093166666666662\r\n" + 
				"-39.084000000000003\r\n" + 
				"-39.075500000000005\r\n" + 
				"-39.061785714285705\r\n" + 
				"-39.047499999999999\r\n" + 
				"-39.036500000000004\r\n" + 
				"-39.023500000000006\r\n" + 
				"-39.010500000000000\r\n" + 
				"-38.998500000000000\r\n" + 
				"-38.986999999999995\r\n" + 
				"-38.977499999999999\r\n" + 
				"-38.967111111111109\r\n" + 
				"-38.957500000000003\r\n" + 
				"-38.945000000000007\r\n" + 
				"-38.931625000000004\r\n" + 
				"-38.907833333333336\r\n" + 
				"-38.884333333333338\r\n" + 
				"-38.867500000000000\r\n" + 
				"-38.852499999999999\r\n" + 
				"-38.838999999999999\r\n" + 
				"-38.820000000000000\r\n" + 
				"-38.805999999999997\r\n" + 
				"-38.788666666666664\r\n" + 
				"-38.762750000000004\r\n" + 
				"-38.745666666666665\r\n" + 
				"-38.735799999999998\r\n" + 
				"-38.713000000000001\r\n" + 
				"-38.696666666666665\r\n" + 
				"-38.675600000000003\r\n" + 
				"-38.656999999999996\r\n" + 
				"-38.637499999999996\r\n" + 
				"-38.615749999999998\r\n" + 
				"-38.574999999999996\r\n" + 
				"-38.539749999999998\r\n" + 
				"-38.522666666666666\r\n" + 
				"-38.502000000000002\r\n" + 
				"-38.484666666666669\r\n" + 
				"-38.466666666666661\r\n" + 
				"-38.451333333333338\r\n" + 
				"-38.427333333333337\r\n" + 
				"-38.411499999999997\r\n" + 
				"-38.399000000000001\r\n" + 
				"-38.378000000000000\r\n" + 
				"-38.359000000000002\r\n" + 
				"-38.341000000000001\r\n" + 
				"-38.320000000000000\r\n" + 
				"-38.297333333333334\r\n" + 
				"-38.272000000000006\r\n" + 
				"-38.253250000000001\r\n" + 
				"-38.230000000000004\r\n" + 
				"-38.201666666666668\r\n" + 
				"-38.183750000000003\r\n" + 
				"-38.165714285714280\r\n" + 
				"-38.152000000000001\r\n" + 
				"-38.132399999999997\r\n" + 
				"-38.117000000000004\r\n" + 
				"-38.101700000000001\r\n" + 
				"-38.087000000000003\r\n" + 
				"-38.074499999999993\r\n" + 
				"-38.063874999999996\r\n" + 
				"-38.053999999999995\r\n" + 
				"-38.044000000000004\r\n" + 
				"-38.031999999999996\r\n" + 
				"-38.019500000000001\r\n" + 
				"-38.007500000000000\r\n" + 
				"-37.995500000000000\r\n" + 
				"-37.983499999999999\r\n" + 
				"-37.971499999999999\r\n" + 
				"-37.961500000000001\r\n" + 
				"-37.952999999999996\r\n" + 
				"-37.939555555555557\r\n" + 
				"-37.924499999999995\r\n" + 
				"-37.911799999999992\r\n" + 
				"-37.901666666666664\r\n" + 
				"-37.890166666666666\r\n" + 
				"-37.875999999999998\r\n" + 
				"-37.865500000000004\r\n" + 
				"-37.847999999999999\r\n" + 
				"-37.837750000000000\r\n" + 
				"-37.826666666666668\r\n" + 
				"-37.812250000000006\r\n" + 
				"-37.796499999999995\r\n" + 
				"-37.781999999999996\r\n" + 
				"-37.749000000000002\r\n" + 
				"-37.735500000000002\r\n" + 
				"-37.717833333333331\r\n" + 
				"-37.698999999999998\r\n" + 
				"-37.679199999999994\r\n" + 
				"-37.661000000000001\r\n" + 
				"-37.634000000000000\r\n" + 
				"-37.619000000000000\r\n" + 
				"-37.604500000000002\r\n" + 
				"-37.579000000000001\r\n" + 
				"-37.563666666666670\r\n" + 
				"-37.549499999999995\r\n" + 
				"-37.533999999999992\r\n" + 
				"-37.518999999999998\r\n" + 
				"-37.495333333333328\r\n" + 
				"-37.479500000000002\r\n" + 
				"-37.456666666666671\r\n" + 
				"-37.439999999999998\r\n" + 
				"-37.422249999999991\r\n" + 
				"-37.399000000000001\r\n" + 
				"-37.374333333333340\r\n" + 
				"-37.362333333333332\r\n" + 
				"-37.339333333333336\r\n" + 
				"-37.311999999999998\r\n" + 
				"-37.297666666666665\r\n" + 
				"-37.283999999999999\r\n" + 
				"-37.264000000000003\r\n" + 
				"-37.244499999999995\r\n" + 
				"-37.222999999999999\r\n" + 
				"-37.210999999999999\r\n" + 
				"-37.189750000000004\r\n" + 
				"-37.170833333333327\r\n" + 
				"-37.149250000000002\r\n" + 
				"-37.136600000000001\r\n" + 
				"-37.125749999999996\r\n" + 
				"-37.114500000000000\r\n" + 
				"-37.103999999999999\r\n" + 
				"-37.092222222222219\r\n" + 
				"-37.078545454545456\r\n" + 
				"-37.066500000000005\r\n" + 
				"-37.054692307692306\r\n" + 
				"-37.040999999999997\r\n" + 
				"-37.029999999999994\r\n" + 
				"-37.019999999999996\r\n" + 
				"-37.010500000000000\r\n" + 
				"-36.999499999999998\r\n" + 
				"-36.986499999999999\r\n" + 
				"-36.973500000000001\r\n" + 
				"-36.964499999999994\r\n" + 
				"-36.956100000000006\r\n" + 
				"-36.945714285714288\r\n" + 
				"-36.934555555555562\r\n" + 
				"-36.912500000000001\r\n" + 
				"-36.898600000000002\r\n" + 
				"-36.880400000000002\r\n" + 
				"-36.858249999999998\r\n" + 
				"-36.844666666666662\r\n" + 
				"-36.824333333333335\r\n" + 
				"-36.809250000000006\r\n" + 
				"-36.786833333333334\r\n" + 
				"-36.766999999999996\r\n" + 
				"-36.752250000000004\r\n" + 
				"-36.722000000000001\r\n" + 
				"-36.713666666666661\r\n" + 
				"-36.689000000000000\r\n" + 
				"-36.673600000000000\r\n" + 
				"-36.661249999999995\r\n" + 
				"-36.643000000000001\r\n" + 
				"-36.624749999999992\r\n" + 
				"-36.613500000000002\r\n" + 
				"-36.596000000000004\r\n" + 
				"-36.581000000000003\r\n" + 
				"-36.565333333333335\r\n" + 
				"-36.546500000000002\r\n" + 
				"-36.525199999999998\r\n" + 
				"-36.508600000000008\r\n" + 
				"-36.480399999999996\r\n" + 
				"-36.451000000000001\r\n" + 
				"-36.432500000000005\r\n" + 
				"-36.413666666666664\r\n" + 
				"-36.379999999999995\r\n" + 
				"-36.349999999999994\r\n" + 
				"-36.335666666666661\r\n" + 
				"-36.316499999999998\r\n" + 
				"-36.296333333333330\r\n" + 
				"-36.275500000000001\r\n" + 
				"-36.253000000000000\r\n" + 
				"-36.241666666666667\r\n" + 
				"-36.216999999999992\r\n" + 
				"-36.198000000000000\r\n" + 
				"-36.182000000000002\r\n" + 
				"-36.161749999999998\r\n" + 
				"-36.149200000000000\r\n" + 
				"-36.129818181818180\r\n" + 
				"-36.114666666666665\r\n" + 
				"-36.098999999999997\r\n" + 
				"-36.082499999999996\r\n" + 
				"-36.069714285714284\r\n" + 
				"-36.056500000000000\r\n" + 
				"-36.045444444444442\r\n" + 
				"-36.033874999999995\r\n" + 
				"-36.019999999999996\r\n" + 
				"-36.007500000000000\r\n" + 
				"-35.996499999999997\r\n" + 
				"-35.987000000000002\r\n" + 
				"-35.977999999999994\r\n" + 
				"-35.967999999999996\r\n" + 
				"-35.959777777777774\r\n" + 
				"-35.945692307692305\r\n" + 
				"-35.931333333333335\r\n" + 
				"-35.915333333333336\r\n" + 
				"-35.899750000000004\r\n" + 
				"-35.885666666666673\r\n" + 
				"-35.870750000000001\r\n" + 
				"-35.860199999999999\r\n" + 
				"-35.847000000000001\r\n" + 
				"-35.831750000000000\r\n" + 
				"-35.814000000000000\r\n" + 
				"-35.792000000000002\r\n" + 
				"-35.780749999999998\r\n" + 
				"-35.762999999999998\r\n" + 
				"-35.746333333333332\r\n" + 
				"-35.718499999999999\r\n" + 
				"-35.702666666666666\r\n" + 
				"-35.691500000000005\r\n" + 
				"-35.676599999999993\r\n" + 
				"-35.651750000000000\r\n" + 
				"-35.641333333333328\r\n" + 
				"-35.618499999999997\r\n" + 
				"-35.606999999999999\r\n" + 
				"-35.589250000000000\r\n" + 
				"-35.555000000000000\r\n" + 
				"-35.531199999999998\r\n" + 
				"-35.521000000000001\r\n" + 
				"-35.504500000000000\r\n" + 
				"-35.483499999999999\r\n" + 
				"-35.453333333333326\r\n" + 
				"-35.439999999999998\r\n" + 
				"-35.419499999999999\r\n" + 
				"-35.399000000000001\r\n" + 
				"-35.381999999999998\r\n" + 
				"-35.363500000000002\r\n" + 
				"-35.342999999999996\r\n" + 
				"-35.315500000000000\r\n" + 
				"-35.286999999999999\r\n" + 
				"-35.272333333333336\r\n" + 
				"-35.254750000000001\r\n" + 
				"-35.241000000000000\r\n" + 
				"-35.228999999999999\r\n" + 
				"-35.216999999999999\r\n" + 
				"-35.203499999999998\r\n" + 
				"-35.183499999999995\r\n" + 
				"-35.167000000000002\r\n" + 
				"-35.149000000000001\r\n" + 
				"-35.138249999999999\r\n" + 
				"-35.125750000000004\r\n" + 
				"-35.105428571428568\r\n" + 
				"-35.088099999999997\r\n" + 
				"-35.073307692307694\r\n" + 
				"-35.062500000000000\r\n" + 
				"-35.053500000000007\r\n" + 
				"-35.041500000000006\r\n" + 
				"-35.026857142857146\r\n" + 
				"-35.013500000000001\r\n" + 
				"-35.000999999999998\r\n" + 
				"-34.989500000000000\r\n" + 
				"-34.979428571428571\r\n" + 
				"-34.965000000000003\r\n" + 
				"-34.952500000000008\r\n" + 
				"-34.941000000000003\r\n" + 
				"-34.928888888888892\r\n" + 
				"-34.912999999999997\r\n" + 
				"-34.896400000000000\r\n" + 
				"-34.884500000000003\r\n" + 
				"-34.847999999999999\r\n" + 
				"-34.826750000000004\r\n" + 
				"-34.814750000000004\r\n" + 
				"-34.798999999999999\r\n" + 
				"-34.784666666666674\r\n" + 
				"-34.767499999999998\r\n" + 
				"-34.744000000000007\r\n" + 
				"-34.727000000000004\r\n" + 
				"-34.708333333333336\r\n" + 
				"-34.692000000000000\r\n" + 
				"-34.680333333333337\r\n" + 
				"-34.666666666666664\r\n" + 
				"-34.654166666666661\r\n" + 
				"-34.645999999999994\r\n" + 
				"-34.632000000000005\r\n" + 
				"-34.614333333333335\r\n" + 
				"-34.602499999999999\r\n" + 
				"-34.588999999999999\r\n" + 
				"-34.573250000000002\r\n" + 
				"-34.548666666666662\r\n" + 
				"-34.532000000000004\r\n" + 
				"-34.504000000000005\r\n" + 
				"-34.491666666666667\r\n" + 
				"-34.470600000000005\r\n" + 
				"-34.444000000000003\r\n" + 
				"-34.427500000000002\r\n" + 
				"-34.414999999999999\r\n" + 
				"-34.397000000000006\r\n" + 
				"-34.378749999999997\r\n" + 
				"-34.358333333333327\r\n" + 
				"-34.335999999999999\r\n" + 
				"-34.312999999999995\r\n" + 
				"-34.292999999999999\r\n" + 
				"-34.270499999999998\r\n" + 
				"-34.253599999999992\r\n" + 
				"-34.239999999999995\r\n" + 
				"-34.223500000000001\r\n" + 
				"-34.199333333333328\r\n" + 
				"-34.186799999999998\r\n" + 
				"-34.169333333333327\r\n" + 
				"-34.148750000000000\r\n" + 
				"-34.133499999999998\r\n" + 
				"-34.125000000000000\r\n" + 
				"-34.104818181818182\r\n" + 
				"-34.089600000000004\r\n" + 
				"-34.081777777777781\r\n" + 
				"-34.068333333333335\r\n" + 
				"-34.059499999999993\r\n" + 
				"-34.050499999999992\r\n" + 
				"-34.038499999999999\r\n" + 
				"-34.029000000000003\r\n" + 
				"-34.019454545454550\r\n" + 
				"-34.008499999999998\r\n" + 
				"-33.998500000000000\r\n" + 
				"-33.986499999999999\r\n" + 
				"-33.974699999999999\r\n" + 
				"-33.959785714285715\r\n" + 
				"-33.946500000000000\r\n" + 
				"-33.931799999999996\r\n" + 
				"-33.922499999999999\r\n" + 
				"-33.906199999999998\r\n" + 
				"-33.893000000000001\r\n" + 
				"-33.878999999999998\r\n" + 
				"-33.867500000000000\r\n" + 
				"-33.857199999999999\r\n" + 
				"-33.828500000000005\r\n" + 
				"-33.810250000000003\r\n" + 
				"-33.786500000000004\r\n" + 
				"-33.769999999999996\r\n" + 
				"-33.756500000000003\r\n" + 
				"-33.741399999999999\r\n" + 
				"-33.710333333333331\r\n" + 
				"-33.695666666666661\r\n" + 
				"-33.676428571428566\r\n" + 
				"-33.653750000000002\r\n" + 
				"-33.636666666666663\r\n" + 
				"-33.619999999999997\r\n" + 
				"-33.602000000000004\r\n" + 
				"-33.590999999999994\r\n" + 
				"-33.577500000000001\r\n" + 
				"-33.561000000000000\r\n" + 
				"-33.545999999999992\r\n" + 
				"-33.527799999999999\r\n" + 
				"-33.506000000000000\r\n" + 
				"-33.492500000000000\r\n" + 
				"-33.477999999999994\r\n" + 
				"-33.442400000000006\r\n" + 
				"-33.414000000000001\r\n" + 
				"-33.400199999999998\r\n" + 
				"-33.389499999999998\r\n" + 
				"-33.368000000000002\r\n" + 
				"-33.346000000000004\r\n" + 
				"-33.333500000000001\r\n" + 
				"-33.312999999999995\r\n" + 
				"-33.302000000000000\r\n" + 
				"-33.288750000000000\r\n" + 
				"-33.273499999999999\r\n" + 
				"-33.259999999999998\r\n" + 
				"-33.231999999999999\r\n" + 
				"-33.218000000000004\r\n" + 
				"-33.204999999999998\r\n" + 
				"-33.186333333333330\r\n" + 
				"-33.169333333333334\r\n" + 
				"-33.140000000000001\r\n" + 
				"-33.129500000000000\r\n" + 
				"-33.113857142857142\r\n" + 
				"-33.092199999999998\r\n" + 
				"-33.080666666666666\r\n" + 
				"-33.072000000000003\r\n" + 
				"-33.062500000000000\r\n" + 
				"-33.050818181818187\r\n" + 
				"-33.038000000000004\r\n" + 
				"-33.029000000000003\r\n" + 
				"-33.019545454545451\r\n" + 
				"-33.009499999999996\r\n" + 
				"-33.000000000000000\r\n" + 
				"-32.989500000000000\r\n" + 
				"-32.978000000000002\r\n" + 
				"-32.968599999999995\r\n" + 
				"-32.958999999999996\r\n" + 
				"-32.944928571428576\r\n" + 
				"-32.931999999999995\r\n" + 
				"-32.917076923076927\r\n" + 
				"-32.902000000000001\r\n" + 
				"-32.890000000000001\r\n" + 
				"-32.873333333333328\r\n" + 
				"-32.856999999999999\r\n" + 
				"-32.835714285714282\r\n" + 
				"-32.811833333333333\r\n" + 
				"-32.780666666666669\r\n" + 
				"-32.762499999999996\r\n" + 
				"-32.751200000000004\r\n" + 
				"-32.741666666666667\r\n" + 
				"-32.728999999999999\r\n" + 
				"-32.713000000000001\r\n" + 
				"-32.703200000000002\r\n" + 
				"-32.686857142857143\r\n" + 
				"-32.665999999999997\r\n" + 
				"-32.650333333333329\r\n" + 
				"-32.632666666666665\r\n" + 
				"-32.600666666666676\r\n" + 
				"-32.582666666666668\r\n" + 
				"-32.560499999999998\r\n" + 
				"-32.540749999999996\r\n" + 
				"-32.527500000000003\r\n" + 
				"-32.497999999999998\r\n" + 
				"-32.481999999999999\r\n" + 
				"-32.463999999999999\r\n" + 
				"-32.441000000000003\r\n" + 
				"-32.408999999999999\r\n" + 
				"-32.384999999999998\r\n" + 
				"-32.374400000000001\r\n" + 
				"-32.343000000000004\r\n" + 
				"-32.329000000000001\r\n" + 
				"-32.305600000000005\r\n" + 
				"-32.292714285714283\r\n" + 
				"-32.249428571428567\r\n" + 
				"-32.232249999999993\r\n" + 
				"-32.220999999999997\r\n" + 
				"-32.204999999999998\r\n" + 
				"-32.193400000000004\r\n" + 
				"-32.176749999999998\r\n" + 
				"-32.164285714285718\r\n" + 
				"-32.149000000000001\r\n" + 
				"-32.133000000000003\r\n" + 
				"-32.112166666666660\r\n" + 
				"-32.096285714285720\r\n" + 
				"-32.081416666666669\r\n" + 
				"-32.063076923076920\r\n" + 
				"-32.047499999999999\r\n" + 
				"-32.033000000000001\r\n" + 
				"-32.019500000000001\r\n" + 
				"-32.007500000000000\r\n" + 
				"-31.996499999999997\r\n" + 
				"-31.984500000000001\r\n" + 
				"-31.971499999999995\r\n" + 
				"-31.959499999999995\r\n" + 
				"-31.947500000000002\r\n" + 
				"-31.931749999999997\r\n" + 
				"-31.914285714285715\r\n" + 
				"-31.903166666666664\r\n" + 
				"-31.885666666666665\r\n" + 
				"-31.873999999999999\r\n" + 
				"-31.859500000000001\r\n" + 
				"-31.848750000000003\r\n" + 
				"-31.834000000000000\r\n" + 
				"-31.814666666666668\r\n" + 
				"-31.791499999999999\r\n" + 
				"-31.779666666666667\r\n" + 
				"-31.765250000000002\r\n" + 
				"-31.753333333333334\r\n" + 
				"-31.738750000000003\r\n" + 
				"-31.715499999999999\r\n" + 
				"-31.690500000000000\r\n" + 
				"-31.674714285714288\r\n" + 
				"-31.634000000000000\r\n" + 
				"-31.613000000000000\r\n" + 
				"-31.595500000000001\r\n" + 
				"-31.577500000000001\r\n" + 
				"-31.555000000000000\r\n" + 
				"-31.535750000000000\r\n" + 
				"-31.516666666666666\r\n" + 
				"-31.502499999999998\r\n" + 
				"-31.487333333333336\r\n" + 
				"-31.460250000000002\r\n" + 
				"-31.433999999999997\r\n" + 
				"-31.410750000000000\r\n" + 
				"-31.388666666666666\r\n" + 
				"-31.369500000000002\r\n" + 
				"-31.352499999999999\r\n" + 
				"-31.339999999999996\r\n" + 
				"-31.324500000000000\r\n" + 
				"-31.302600000000002\r\n" + 
				"-31.283500000000000\r\n" + 
				"-31.264499999999998\r\n" + 
				"-31.249333333333336\r\n" + 
				"-31.233200000000000\r\n" + 
				"-31.217800000000000\r\n" + 
				"-31.207333333333334\r\n" + 
				"-31.194333333333333\r\n" + 
				"-31.179285714285715\r\n" + 
				"-31.160499999999999\r\n" + 
				"-31.143000000000001\r\n" + 
				"-31.117428571428569\r\n" + 
				"-31.100999999999999\r\n" + 
				"-31.089800000000004\r\n" + 
				"-31.079222222222217\r\n" + 
				"-31.067625000000000\r\n" + 
				"-31.056083333333333\r\n" + 
				"-31.043000000000006\r\n" + 
				"-31.031499999999994\r\n" + 
				"-31.020499999999998\r\n" + 
				"-31.007999999999999\r\n" + 
				"-30.995999999999999\r\n" + 
				"-30.984500000000001\r\n" + 
				"-30.972000000000001\r\n" + 
				"-30.961142857142853\r\n" + 
				"-30.951999999999998\r\n" + 
				"-30.942999999999998\r\n" + 
				"-30.933499999999999\r\n" + 
				"-30.922999999999998\r\n" + 
				"-30.910625000000000\r\n" + 
				"-30.888500000000001\r\n" + 
				"-30.875999999999998\r\n" + 
				"-30.863000000000000\r\n" + 
				"-30.850666666666665\r\n" + 
				"-30.833500000000001\r\n" + 
				"-30.820750000000000\r\n" + 
				"-30.801000000000002\r\n" + 
				"-30.787500000000001\r\n" + 
				"-30.777000000000001\r\n" + 
				"-30.763000000000002\r\n" + 
				"-30.734999999999999\r\n" + 
				"-30.712000000000000\r\n" + 
				"-30.685833333333335\r\n" + 
				"-30.671500000000002\r\n" + 
				"-30.658000000000001\r\n" + 
				"-30.645499999999998\r\n" + 
				"-30.629666666666665\r\n" + 
				"-30.613666666666671\r\n" + 
				"-30.602000000000000\r\n" + 
				"-30.588999999999999\r\n" + 
				"-30.570666666666668\r\n" + 
				"-30.556500000000000\r\n" + 
				"-30.543666666666667\r\n" + 
				"-30.523666666666667\r\n" + 
				"-30.495000000000001\r\n" + 
				"-30.477333333333334\r\n" + 
				"-30.455333333333332\r\n" + 
				"-30.420000000000002\r\n" + 
				"-30.402000000000001\r\n" + 
				"-30.388000000000002\r\n" + 
				"-30.363000000000000\r\n" + 
				"-30.349000000000000\r\n" + 
				"-30.325799999999997\r\n" + 
				"-30.311250000000001\r\n" + 
				"-30.287333333333333\r\n" + 
				"-30.263000000000002\r\n" + 
				"-30.239750000000001\r\n" + 
				"-30.230000000000000\r\n" + 
				"-30.214799999999997\r\n" + 
				"-30.196333333333332\r\n" + 
				"-30.183000000000000\r\n" + 
				"-30.155250000000002\r\n" + 
				"-30.136500000000002\r\n" + 
				"-30.124333333333329\r\n" + 
				"-30.107999999999997\r\n" + 
				"-30.092874999999996\r\n" + 
				"-30.076818181818183\r\n" + 
				"-30.066125000000000\r\n" + 
				"-30.056500000000000\r\n" + 
				"-30.045499999999997\r\n" + 
				"-30.032499999999999\r\n" + 
				"-30.023499999999999\r\n" + 
				"-30.014499999999998\r\n" + 
				"-30.002499999999998\r\n" + 
				"-29.990499999999997\r\n" + 
				"-29.981000000000002\r\n" + 
				"-29.972000000000001\r\n" + 
				"-29.960874999999998\r\n" + 
				"-29.950500000000002\r\n" + 
				"-29.939099999999996\r\n" + 
				"-29.927125000000000\r\n" + 
				"-29.916000000000000\r\n" + 
				"-29.904499999999999\r\n" + 
				"-29.893666666666661\r\n" + 
				"-29.878999999999998\r\n" + 
				"-29.859749999999998\r\n" + 
				"-29.847749999999998\r\n" + 
				"-29.835249999999998\r\n" + 
				"-29.820000000000000\r\n" + 
				"-29.799999999999997\r\n" + 
				"-29.786500000000000\r\n" + 
				"-29.774666666666665\r\n" + 
				"-29.762499999999999\r\n" + 
				"-29.730499999999999\r\n" + 
				"-29.708500000000001\r\n" + 
				"-29.692666666666668\r\n" + 
				"-29.680500000000002\r\n" + 
				"-29.667000000000002\r\n" + 
				"-29.653500000000001\r\n" + 
				"-29.637666666666671\r\n" + 
				"-29.624000000000002\r\n" + 
				"-29.602249999999998\r\n" + 
				"-29.587000000000000\r\n" + 
				"-29.564333333333334\r\n" + 
				"-29.549999999999997\r\n" + 
				"-29.528399999999998\r\n" + 
				"-29.516666666666666\r\n" + 
				"-29.502499999999998\r\n" + 
				"-29.478000000000002\r\n" + 
				"-29.438166666666671\r\n" + 
				"-29.414999999999999\r\n" + 
				"-29.398000000000000\r\n" + 
				"-29.377499999999998\r\n" + 
				"-29.348666666666670\r\n" + 
				"-29.327999999999996\r\n" + 
				"-29.315500000000000\r\n" + 
				"-29.301000000000002\r\n" + 
				"-29.288000000000000\r\n" + 
				"-29.269599999999997\r\n" + 
				"-29.245333333333335\r\n" + 
				"-29.222666666666669\r\n" + 
				"-29.198750000000004\r\n" + 
				"-29.181500000000000\r\n" + 
				"-29.167600000000000\r\n" + 
				"-29.152500000000000\r\n" + 
				"-29.134599999999999\r\n" + 
				"-29.118000000000002\r\n" + 
				"-29.104333333333336\r\n" + 
				"-29.093000000000000\r\n" + 
				"-29.080625000000001\r\n" + 
				"-29.063111111111109\r\n" + 
				"-29.052499999999998\r\n" + 
				"-29.042500000000004\r\n" + 
				"-29.032499999999999\r\n" + 
				"-29.020499999999998\r\n" + 
				"-29.010499999999997\r\n" + 
				"-29.000499999999999\r\n" + 
				"-28.991499999999998\r\n" + 
				"-28.982500000000002\r\n" + 
				"-28.970500000000001\r\n" + 
				"-28.958500000000004\r\n" + 
				"-28.949000000000002\r\n" + 
				"-28.940999999999999\r\n" + 
				"-28.929250000000003\r\n" + 
				"-28.918777777777784\r\n" + 
				"-28.905833333333334\r\n" + 
				"-28.891750000000002\r\n" + 
				"-28.877400000000002\r\n" + 
				"-28.863999999999997\r\n" + 
				"-28.843999999999998\r\n" + 
				"-28.832999999999998\r\n" + 
				"-28.819500000000001\r\n" + 
				"-28.803666666666668\r\n" + 
				"-28.792000000000002\r\n" + 
				"-28.782000000000000\r\n" + 
				"-28.765800000000002\r\n" + 
				"-28.745500000000000\r\n" + 
				"-28.734666666666666\r\n" + 
				"-28.714250000000000\r\n" + 
				"-28.695000000000000\r\n" + 
				"-28.677999999999997\r\n" + 
				"-28.661333333333335\r\n" + 
				"-28.645499999999998\r\n" + 
				"-28.634000000000000\r\n" + 
				"-28.614399999999996\r\n" + 
				"-28.595666666666670\r\n" + 
				"-28.564666666666668\r\n" + 
				"-28.551749999999998\r\n" + 
				"-28.536000000000001\r\n" + 
				"-28.512599999999999\r\n" + 
				"-28.494999999999997\r\n" + 
				"-28.473666666666670\r\n" + 
				"-28.459750000000000\r\n" + 
				"-28.443000000000001\r\n" + 
				"-28.414000000000001\r\n" + 
				"-28.390499999999999\r\n" + 
				"-28.376500000000000\r\n" + 
				"-28.363599999999998\r\n" + 
				"-28.350999999999999\r\n" + 
				"-28.328749999999999\r\n" + 
				"-28.316000000000003\r\n" + 
				"-28.300999999999998\r\n" + 
				"-28.280500000000000\r\n" + 
				"-28.266000000000002\r\n" + 
				"-28.239999999999998\r\n" + 
				"-28.222999999999999\r\n" + 
				"-28.203666666666663\r\n" + 
				"-28.190499999999997\r\n" + 
				"-28.175500000000000\r\n" + 
				"-28.160000000000000\r\n" + 
				"-28.147750000000002\r\n" + 
				"-28.134799999999995\r\n" + 
				"-28.124749999999999\r\n" + 
				"-28.109416666666664\r\n" + 
				"-28.091600000000000\r\n" + 
				"-28.076750000000001\r\n" + 
				"-28.065500000000000\r\n" + 
				"-28.055499999999999\r\n" + 
				"-28.043363636363640\r\n" + 
				"-28.028500000000001\r\n" + 
				"-28.014999999999997\r\n" + 
				"-28.003499999999999\r\n" + 
				"-27.991499999999998\r\n" + 
				"-27.979999999999997\r\n" + 
				"-27.968500000000002\r\n" + 
				"-27.957555555555558\r\n" + 
				"-27.947999999999997\r\n" + 
				"-27.935076923076924\r\n" + 
				"-27.921555555555557\r\n" + 
				"-27.909000000000002\r\n" + 
				"-27.898333333333330\r\n" + 
				"-27.882666666666665\r\n" + 
				"-27.866750000000000\r\n" + 
				"-27.842833333333331\r\n" + 
				"-27.824333333333332\r\n" + 
				"-27.805500000000002\r\n" + 
				"-27.791800000000002\r\n" + 
				"-27.780666666666672\r\n" + 
				"-27.766999999999999\r\n" + 
				"-27.748999999999999\r\n" + 
				"-27.725333333333335\r\n" + 
				"-27.712249999999997\r\n" + 
				"-27.694249999999997\r\n" + 
				"-27.676749999999998\r\n" + 
				"-27.663000000000000\r\n" + 
				"-27.643799999999999\r\n" + 
				"-27.629500000000000\r\n" + 
				"-27.618749999999999\r\n" + 
				"-27.602000000000000\r\n" + 
				"-27.587333333333333\r\n" + 
				"-27.567499999999999\r\n" + 
				"-27.554000000000002\r\n" + 
				"-27.532999999999998\r\n" + 
				"-27.517800000000001\r\n" + 
				"-27.501000000000001\r\n" + 
				"-27.492999999999999\r\n" + 
				"-27.478600000000000\r\n" + 
				"-27.438200000000002\r\n" + 
				"-27.415749999999999\r\n" + 
				"-27.401499999999999\r\n" + 
				"-27.378750000000000\r\n" + 
				"-27.359999999999999\r\n" + 
				"-27.340600000000002\r\n" + 
				"-27.324500000000000\r\n" + 
				"-27.312200000000001\r\n" + 
				"-27.297666666666668\r\n" + 
				"-27.276400000000002\r\n" + 
				"-27.255833333333332\r\n" + 
				"-27.230000000000000\r\n" + 
				"-27.202333333333332\r\n" + 
				"-27.187500000000000\r\n" + 
				"-27.164800000000003\r\n" + 
				"-27.143999999999998\r\n" + 
				"-27.131166666666669\r\n" + 
				"-27.111000000000001\r\n" + 
				"-27.093199999999996\r\n" + 
				"-27.080500000000001\r\n" + 
				"-27.071500000000000\r\n" + 
				"-27.059071428571428\r\n" + 
				"-27.044499999999999\r\n" + 
				"-27.033499999999997\r\n" + 
				"-27.021500000000000\r\n" + 
				"-27.009499999999996\r\n" + 
				"-27.000500000000002\r\n" + 
				"-26.991499999999998\r\n" + 
				"-26.977999999999994\r\n" + 
				"-26.966000000000005\r\n" + 
				"-26.953333333333337\r\n" + 
				"-26.939999999999998\r\n" + 
				"-26.927399999999999\r\n" + 
				"-26.915666666666663\r\n" + 
				"-26.904000000000000\r\n" + 
				"-26.884250000000002\r\n" + 
				"-26.864750000000001\r\n" + 
				"-26.851333333333333\r\n" + 
				"-26.837000000000000\r\n" + 
				"-26.826166666666666\r\n" + 
				"-26.813499999999998\r\n" + 
				"-26.791666666666668\r\n" + 
				"-26.772000000000002\r\n" + 
				"-26.744199999999999\r\n" + 
				"-26.722499999999997\r\n" + 
				"-26.704250000000002\r\n" + 
				"-26.677333333333333\r\n" + 
				"-26.655000000000001\r\n" + 
				"-26.626500000000000\r\n" + 
				"-26.606000000000002\r\n" + 
				"-26.591500000000000\r\n" + 
				"-26.575500000000002\r\n" + 
				"-26.560250000000000\r\n" + 
				"-26.547333333333331\r\n" + 
				"-26.528500000000001\r\n" + 
				"-26.514333333333337\r\n" + 
				"-26.484000000000002\r\n" + 
				"-26.465714285714284\r\n" + 
				"-26.447333333333336\r\n" + 
				"-26.417666666666666\r\n" + 
				"-26.402000000000001\r\n" + 
				"-26.393000000000001\r\n" + 
				"-26.360500000000002\r\n" + 
				"-26.347000000000001\r\n" + 
				"-26.334199999999999\r\n" + 
				"-26.302000000000000\r\n" + 
				"-26.276750000000000\r\n" + 
				"-26.266500000000001\r\n" + 
				"-26.249000000000002\r\n" + 
				"-26.230499999999999\r\n" + 
				"-26.215499999999999\r\n" + 
				"-26.205166666666667\r\n" + 
				"-26.189000000000004\r\n" + 
				"-26.174500000000002\r\n" + 
				"-26.157333333333337\r\n" + 
				"-26.140000000000001\r\n" + 
				"-26.124833333333331\r\n" + 
				"-26.106200000000001\r\n" + 
				"-26.091076923076919\r\n" + 
				"-26.076000000000001\r\n" + 
				"-26.059888888888892\r\n" + 
				"-26.046266666666668\r\n" + 
				"-26.032499999999999\r\n" + 
				"-26.023499999999999\r\n" + 
				"-26.014999999999997\r\n" + 
				"-26.003499999999999\r\n" + 
				"-25.991499999999998\r\n" + 
				"-25.981500000000000\r\n" + 
				"-25.971500000000002\r\n" + 
				"-25.959000000000000\r\n" + 
				"-25.946923076923081\r\n" + 
				"-25.926888888888886\r\n" + 
				"-25.914999999999996\r\n" + 
				"-25.903285714285715\r\n" + 
				"-25.885000000000002\r\n" + 
				"-25.873999999999999\r\n" + 
				"-25.847333333333335\r\n" + 
				"-25.834666666666667\r\n" + 
				"-25.820800000000002\r\n" + 
				"-25.803000000000001\r\n" + 
				"-25.785250000000001\r\n" + 
				"-25.765999999999998\r\n" + 
				"-25.736999999999998\r\n" + 
				"-25.717500000000001\r\n" + 
				"-25.705500000000001\r\n" + 
				"-25.691142857142857\r\n" + 
				"-25.673000000000002\r\n" + 
				"-25.643999999999998\r\n" + 
				"-25.628599999999999\r\n" + 
				"-25.615499999999997\r\n" + 
				"-25.597999999999999\r\n" + 
				"-25.581000000000000\r\n" + 
				"-25.564333333333334\r\n" + 
				"-25.552250000000001\r\n" + 
				"-25.539999999999999\r\n" + 
				"-25.525333333333332\r\n" + 
				"-25.506499999999999\r\n" + 
				"-25.483000000000001\r\n" + 
				"-25.465750000000000\r\n" + 
				"-25.455000000000002\r\n" + 
				"-25.433000000000000\r\n" + 
				"-25.413600000000002\r\n" + 
				"-25.366000000000000\r\n" + 
				"-25.352999999999998\r\n" + 
				"-25.338250000000002\r\n" + 
				"-25.320250000000001\r\n" + 
				"-25.299599999999998\r\n" + 
				"-25.279666666666667\r\n" + 
				"-25.268249999999998\r\n" + 
				"-25.246166666666667\r\n" + 
				"-25.213000000000005\r\n" + 
				"-25.193000000000001\r\n" + 
				"-25.172333333333331\r\n" + 
				"-25.154750000000000\r\n" + 
				"-25.134399999999999\r\n" + 
				"-25.116750000000000\r\n" + 
				"-25.089142857142857\r\n" + 
				"-25.076100000000000\r\n" + 
				"-25.063499999999998\r\n" + 
				"-25.052999999999997\r\n" + 
				"-25.042000000000002\r\n" + 
				"-25.031500000000001\r\n" + 
				"-25.020499999999998\r\n" + 
				"-25.009000000000000\r\n" + 
				"-24.997499999999999\r\n" + 
				"-24.983500000000003\r\n" + 
				"-24.971500000000002\r\n" + 
				"-24.959500000000002\r\n" + 
				"-24.947374999999997\r\n" + 
				"-24.934888888888889\r\n" + 
				"-24.922285714285717\r\n" + 
				"-24.910599999999999\r\n" + 
				"-24.896666666666665\r\n" + 
				"-24.880499999999998\r\n" + 
				"-24.851400000000002\r\n" + 
				"-24.827999999999999\r\n" + 
				"-24.811499999999999\r\n" + 
				"-24.789333333333332\r\n" + 
				"-24.774500000000000\r\n" + 
				"-24.757999999999999\r\n" + 
				"-24.746199999999998\r\n" + 
				"-24.733999999999998\r\n" + 
				"-24.721250000000001\r\n" + 
				"-24.708333333333332\r\n" + 
				"-24.677999999999997\r\n" + 
				"-24.665500000000002\r\n" + 
				"-24.649999999999999\r\n" + 
				"-24.624000000000002\r\n" + 
				"-24.612000000000002\r\n" + 
				"-24.591999999999999\r\n" + 
				"-24.578499999999998\r\n" + 
				"-24.559000000000001\r\n" + 
				"-24.539166666666663\r\n" + 
				"-24.526250000000001\r\n" + 
				"-24.513999999999999\r\n" + 
				"-24.484000000000002\r\n" + 
				"-24.454999999999998\r\n" + 
				"-24.437500000000000\r\n" + 
				"-24.427000000000000\r\n" + 
				"-24.399000000000001\r\n" + 
				"-24.383333333333336\r\n" + 
				"-24.373666666666665\r\n" + 
				"-24.354333333333333\r\n" + 
				"-24.342599999999997\r\n" + 
				"-24.327749999999998\r\n" + 
				"-24.314666666666668\r\n" + 
				"-24.301500000000001\r\n" + 
				"-24.287500000000001\r\n" + 
				"-24.268000000000001\r\n" + 
				"-24.248999999999999\r\n" + 
				"-24.231000000000002\r\n" + 
				"-24.216749999999998\r\n" + 
				"-24.205333333333332\r\n" + 
				"-24.188000000000002\r\n" + 
				"-24.167000000000002\r\n" + 
				"-24.151499999999999\r\n" + 
				"-24.138142857142860\r\n" + 
				"-24.116250000000001\r\n" + 
				"-24.103500000000000\r\n" + 
				"-24.091199999999997\r\n" + 
				"-24.080428571428570\r\n" + 
				"-24.069999999999997\r\n" + 
				"-24.058499999999999\r\n" + 
				"-24.047499999999999\r\n" + 
				"-24.034285714285716\r\n" + 
				"-24.020499999999998\r\n" + 
				"-24.009000000000000\r\n" + 
				"-23.997499999999999\r\n" + 
				"-23.984769230769231\r\n" + 
				"-23.974500000000003\r\n" + 
				"-23.965499999999995\r\n" + 
				"-23.953500000000002\r\n" + 
				"-23.940999999999999\r\n" + 
				"-23.931857142857144\r\n" + 
				"-23.918666666666667\r\n" + 
				"-23.906124999999999\r\n" + 
				"-23.885666666666665\r\n" + 
				"-23.872750000000000\r\n" + 
				"-23.858333333333334\r\n" + 
				"-23.843333333333334\r\n" + 
				"-23.830800000000000\r\n" + 
				"-23.818999999999999\r\n" + 
				"-23.805750000000000\r\n" + 
				"-23.785333333333330\r\n" + 
				"-23.771500000000000\r\n" + 
				"-23.756000000000000\r\n" + 
				"-23.736666666666668\r\n" + 
				"-23.722600000000000\r\n" + 
				"-23.704749999999997\r\n" + 
				"-23.690999999999999\r\n" + 
				"-23.680000000000003\r\n" + 
				"-23.659000000000002\r\n" + 
				"-23.643999999999998\r\n" + 
				"-23.620571428571427\r\n" + 
				"-23.592500000000001\r\n" + 
				"-23.574000000000002\r\n" + 
				"-23.552800000000001\r\n" + 
				"-23.535666666666668\r\n" + 
				"-23.515000000000001\r\n" + 
				"-23.503000000000000\r\n" + 
				"-23.491000000000000\r\n" + 
				"-23.475600000000004\r\n" + 
				"-23.448749999999997\r\n" + 
				"-23.431333333333331\r\n" + 
				"-23.390000000000001\r\n" + 
				"-23.371749999999999\r\n" + 
				"-23.351750000000003\r\n" + 
				"-23.337799999999998\r\n" + 
				"-23.323333333333334\r\n" + 
				"-23.312000000000001\r\n" + 
				"-23.300999999999998\r\n" + 
				"-23.287500000000001\r\n" + 
				"-23.270333333333337\r\n" + 
				"-23.258250000000004\r\n" + 
				"-23.237200000000001\r\n" + 
				"-23.229200000000002\r\n" + 
				"-23.202999999999999\r\n" + 
				"-23.183333333333334\r\n" + 
				"-23.165333333333333\r\n" + 
				"-23.152999999999999\r\n" + 
				"-23.140000000000001\r\n" + 
				"-23.125833333333333\r\n" + 
				"-23.106999999999999\r\n" + 
				"-23.086300000000005\r\n" + 
				"-23.072750000000003\r\n" + 
				"-23.062500000000000\r\n" + 
				"-23.052499999999998\r\n" + 
				"-23.037000000000003\r\n" + 
				"-23.023499999999999\r\n" + 
				"-23.013374999999996\r\n" + 
				"-23.003999999999998\r\n" + 
				"-22.995000000000001\r\n" + 
				"-22.982000000000003\r\n" + 
				"-22.967599999999997\r\n" + 
				"-22.959500000000002\r\n" + 
				"-22.950999999999997\r\n" + 
				"-22.941499999999998\r\n" + 
				"-22.929714285714283\r\n" + 
				"-22.920749999999998\r\n" + 
				"-22.909333333333336\r\n" + 
				"-22.893374999999999\r\n" + 
				"-22.878666666666671\r\n" + 
				"-22.853199999999998\r\n" + 
				"-22.834999999999997\r\n" + 
				"-22.811000000000000\r\n" + 
				"-22.794333333333338\r\n" + 
				"-22.774500000000000\r\n" + 
				"-22.754999999999999\r\n" + 
				"-22.734999999999999\r\n" + 
				"-22.706333333333333\r\n" + 
				"-22.696749999999998\r\n" + 
				"-22.683000000000000\r\n" + 
				"-22.670000000000002\r\n" + 
				"-22.652666666666665\r\n" + 
				"-22.639499999999998\r\n" + 
				"-22.610500000000002\r\n" + 
				"-22.594500000000000\r\n" + 
				"-22.578499999999998\r\n" + 
				"-22.555499999999999\r\n" + 
				"-22.532000000000000\r\n" + 
				"-22.500571428571426\r\n" + 
				"-22.484000000000002\r\n" + 
				"-22.463500000000000\r\n" + 
				"-22.449999999999999\r\n" + 
				"-22.427999999999997\r\n" + 
				"-22.417000000000002\r\n" + 
				"-22.397500000000001\r\n" + 
				"-22.381499999999999\r\n" + 
				"-22.366750000000000\r\n" + 
				"-22.337250000000001\r\n" + 
				"-22.320666666666668\r\n" + 
				"-22.297999999999998\r\n" + 
				"-22.280200000000001\r\n" + 
				"-22.258166666666668\r\n" + 
				"-22.242750000000001\r\n" + 
				"-22.226500000000001\r\n" + 
				"-22.209999999999997\r\n" + 
				"-22.192000000000000\r\n" + 
				"-22.182500000000001\r\n" + 
				"-22.173800000000000\r\n" + 
				"-22.154333333333330\r\n" + 
				"-22.133500000000002\r\n" + 
				"-22.120500000000000\r\n" + 
				"-22.102125000000001\r\n" + 
				"-22.087571428571430\r\n" + 
				"-22.076999999999998\r\n" + 
				"-22.065999999999999\r\n" + 
				"-22.056500000000000\r\n" + 
				"-22.047000000000001\r\n" + 
				"-22.037833333333335\r\n" + 
				"-22.028500000000005\r\n" + 
				"-22.019500000000004\r\n" + 
				"-22.009499999999999\r\n" + 
				"-22.000499999999999\r\n" + 
				"-21.991499999999998\r\n" + 
				"-21.979999999999997\r\n" + 
				"-21.969199999999997\r\n" + 
				"-21.955461538461538\r\n" + 
				"-21.942999999999998\r\n" + 
				"-21.932999999999996\r\n" + 
				"-21.922999999999998\r\n" + 
				"-21.912749999999999\r\n" + 
				"-21.898777777777777\r\n" + 
				"-21.879666666666669\r\n" + 
				"-21.864000000000001\r\n" + 
				"-21.852000000000004\r\n" + 
				"-21.840000000000000\r\n" + 
				"-21.823333333333334\r\n" + 
				"-21.810600000000001\r\n" + 
				"-21.787500000000005\r\n" + 
				"-21.771000000000001\r\n" + 
				"-21.754000000000001\r\n" + 
				"-21.725500000000000\r\n" + 
				"-21.707499999999996\r\n" + 
				"-21.692000000000000\r\n" + 
				"-21.672833333333333\r\n" + 
				"-21.651199999999996\r\n" + 
				"-21.629600000000000\r\n" + 
				"-21.613000000000000\r\n" + 
				"-21.597500000000000\r\n" + 
				"-21.577000000000002\r\n" + 
				"-21.554000000000002\r\n" + 
				"-21.539749999999998\r\n" + 
				"-21.512333333333334\r\n" + 
				"-21.497500000000002\r\n" + 
				"-21.474833333333333\r\n" + 
				"-21.463000000000001\r\n" + 
				"-21.445000000000000\r\n" + 
				"-21.418749999999999\r\n" + 
				"-21.401000000000000\r\n" + 
				"-21.388500000000001\r\n" + 
				"-21.374499999999998\r\n" + 
				"-21.361400000000000\r\n" + 
				"-21.348666666666670\r\n" + 
				"-21.331999999999997\r\n" + 
				"-21.320333333333334\r\n" + 
				"-21.302333333333333\r\n" + 
				"-21.275000000000002\r\n" + 
				"-21.253000000000000\r\n" + 
				"-21.228749999999998\r\n" + 
				"-21.215000000000000\r\n" + 
				"-21.202000000000002\r\n" + 
				"-21.186250000000001\r\n" + 
				"-21.169000000000000\r\n" + 
				"-21.152999999999999\r\n" + 
				"-21.128000000000000\r\n" + 
				"-21.118400000000001\r\n" + 
				"-21.105333333333334\r\n" + 
				"-21.090444444444444\r\n" + 
				"-21.079799999999999\r\n" + 
				"-21.070999999999998\r\n" + 
				"-21.059749999999998\r\n" + 
				"-21.050000000000001\r\n" + 
				"-21.040999999999997\r\n" + 
				"-21.029499999999999\r\n" + 
				"-21.019124999999995\r\n" + 
				"-21.008500000000002\r\n" + 
				"-20.996500000000001\r\n" + 
				"-20.986500000000003\r\n" + 
				"-20.978000000000002\r\n" + 
				"-20.964500000000001\r\n" + 
				"-20.951625000000000\r\n" + 
				"-20.936083333333332\r\n" + 
				"-20.920500000000001\r\n" + 
				"-20.904599999999999\r\n" + 
				"-20.890333333333334\r\n" + 
				"-20.872999999999998\r\n" + 
				"-20.835400000000000\r\n" + 
				"-20.796749999999999\r\n" + 
				"-20.775666666666666\r\n" + 
				"-20.761333333333337\r\n" + 
				"-20.748000000000001\r\n" + 
				"-20.729166666666668\r\n" + 
				"-20.704999999999998\r\n" + 
				"-20.687399999999997\r\n" + 
				"-20.661999999999999\r\n" + 
				"-20.641666666666666\r\n" + 
				"-20.618499999999997\r\n" + 
				"-20.607749999999999\r\n" + 
				"-20.580500000000001\r\n" + 
				"-20.550000000000001\r\n" + 
				"-20.537250000000000\r\n" + 
				"-20.518571428571427\r\n" + 
				"-20.486666666666668\r\n" + 
				"-20.475999999999999\r\n" + 
				"-20.460500000000000\r\n" + 
				"-20.439000000000000\r\n" + 
				"-20.429666666666666\r\n" + 
				"-20.411000000000001\r\n" + 
				"-20.390750000000001\r\n" + 
				"-20.379500000000000\r\n" + 
				"-20.367333333333335\r\n" + 
				"-20.355333333333334\r\n" + 
				"-20.341999999999999\r\n" + 
				"-20.329749999999997\r\n" + 
				"-20.309000000000001\r\n" + 
				"-20.283500000000000\r\n" + 
				"-20.263999999999999\r\n" + 
				"-20.248000000000001\r\n" + 
				"-20.233333333333334\r\n" + 
				"-20.216999999999999\r\n" + 
				"-20.202999999999999\r\n" + 
				"-20.191749999999999\r\n" + 
				"-20.177666666666664\r\n" + 
				"-20.156499999999998\r\n" + 
				"-20.141500000000001\r\n" + 
				"-20.129666666666669\r\n" + 
				"-20.118000000000002\r\n" + 
				"-20.100800000000000\r\n" + 
				"-20.088166666666670\r\n" + 
				"-20.078399999999998\r\n" + 
				"-20.064454545454545\r\n" + 
				"-20.052624999999999\r\n" + 
				"-20.043600000000001\r\n" + 
				"-20.034499999999998\r\n" + 
				"-20.026500000000002\r\n" + 
				"-20.017499999999998\r\n" + 
				"-20.005500000000001\r\n" + 
				"-19.991846153846154\r\n" + 
				"-19.977499999999999\r\n" + 
				"-19.965499999999999\r\n" + 
				"-19.954300000000000\r\n" + 
				"-19.940230769230769\r\n" + 
				"-19.927499999999998\r\n" + 
				"-19.914625000000001\r\n" + 
				"-19.904428571428575\r\n" + 
				"-19.888333333333332\r\n" + 
				"-19.871800000000000\r\n" + 
				"-19.853199999999998\r\n" + 
				"-19.836599999999997\r\n" + 
				"-19.818500000000000\r\n" + 
				"-19.801200000000001\r\n" + 
				"-19.778200000000002\r\n" + 
				"-19.763000000000002\r\n" + 
				"-19.735375000000001\r\n" + 
				"-19.707750000000001\r\n" + 
				"-19.684749999999998\r\n" + 
				"-19.661799999999999\r\n" + 
				"-19.650500000000001\r\n" + 
				"-19.622666666666667\r\n" + 
				"-19.609500000000001\r\n" + 
				"-19.591666666666665\r\n" + 
				"-19.573499999999999\r\n" + 
				"-19.562000000000001\r\n" + 
				"-19.520250000000001\r\n" + 
				"-19.501666666666669\r\n" + 
				"-19.482600000000001\r\n" + 
				"-19.463000000000001\r\n" + 
				"-19.447499999999998\r\n" + 
				"-19.433333333333334\r\n" + 
				"-19.417200000000001\r\n" + 
				"-19.393000000000001\r\n" + 
				"-19.369749999999996\r\n" + 
				"-19.357333333333333\r\n" + 
				"-19.345666666666670\r\n" + 
				"-19.332999999999998\r\n" + 
				"-19.310000000000002\r\n" + 
				"-19.291250000000002\r\n" + 
				"-19.272600000000001\r\n" + 
				"-19.252000000000002\r\n" + 
				"-19.231000000000002\r\n" + 
				"-19.213999999999999\r\n" + 
				"-19.199000000000002\r\n" + 
				"-19.179250000000000\r\n" + 
				"-19.159000000000002\r\n" + 
				"-19.146999999999998\r\n" + 
				"-19.134249999999998\r\n" + 
				"-19.116666666666664\r\n" + 
				"-19.103333333333335\r\n" + 
				"-19.093000000000000\r\n" + 
				"-19.082428571428572\r\n" + 
				"-19.071333333333332\r\n" + 
				"-19.061799999999998\r\n" + 
				"-19.045785714285717\r\n" + 
				"-19.032500000000002\r\n" + 
				"-19.020500000000002\r\n" + 
				"-19.010000000000002\r\n" + 
				"-19.000999999999998\r\n" + 
				"-18.990500000000001\r\n" + 
				"-18.980500000000003\r\n" + 
				"-18.971499999999999\r\n" + 
				"-18.960000000000001\r\n" + 
				"-18.948499999999999\r\n" + 
				"-18.939499999999999\r\n" + 
				"-18.930818181818182\r\n" + 
				"-18.918499999999998\r\n" + 
				"-18.902999999999999\r\n" + 
				"-18.889400000000002\r\n" + 
				"-18.873200000000001\r\n" + 
				"-18.861999999999998\r\n" + 
				"-18.850571428571431\r\n" + 
				"-18.833749999999998\r\n" + 
				"-18.819399999999998\r\n" + 
				"-18.799000000000003\r\n" + 
				"-18.784500000000001\r\n" + 
				"-18.771000000000001\r\n" + 
				"-18.759333333333331\r\n" + 
				"-18.747333333333330\r\n" + 
				"-18.736000000000001\r\n" + 
				"-18.724000000000000\r\n" + 
				"-18.710000000000001\r\n" + 
				"-18.696749999999998\r\n" + 
				"-18.684000000000001\r\n" + 
				"-18.671333333333333\r\n" + 
				"-18.658500000000000\r\n" + 
				"-18.646599999999999\r\n" + 
				"-18.631999999999998\r\n" + 
				"-18.614500000000000\r\n" + 
				"-18.597400000000000\r\n" + 
				"-18.575000000000003\r\n" + 
				"-18.552333333333333\r\n" + 
				"-18.521285714285714\r\n" + 
				"-18.503999999999998\r\n" + 
				"-18.489333333333335\r\n" + 
				"-18.474000000000000\r\n" + 
				"-18.460500000000000\r\n" + 
				"-18.442500000000003\r\n" + 
				"-18.425500000000000\r\n" + 
				"-18.409000000000002\r\n" + 
				"-18.396999999999998\r\n" + 
				"-18.372000000000000\r\n" + 
				"-18.362250000000003\r\n" + 
				"-18.347333333333335\r\n" + 
				"-18.337000000000000\r\n" + 
				"-18.325800000000001\r\n" + 
				"-18.305199999999999\r\n" + 
				"-18.282200000000000\r\n" + 
				"-18.246666666666666\r\n" + 
				"-18.234249999999999\r\n" + 
				"-18.218666666666667\r\n" + 
				"-18.197750000000003\r\n" + 
				"-18.186000000000000\r\n" + 
				"-18.159833333333335\r\n" + 
				"-18.149999999999999\r\n" + 
				"-18.135999999999999\r\n" + 
				"-18.115222222222219\r\n" + 
				"-18.097714285714289\r\n" + 
				"-18.083666666666669\r\n" + 
				"-18.070909090909090\r\n" + 
				"-18.057999999999996\r\n" + 
				"-18.049499999999998\r\n" + 
				"-18.039923076923078\r\n" + 
				"-18.026000000000003\r\n" + 
				"-18.014500000000002\r\n" + 
				"-18.002500000000001\r\n" + 
				"-17.992000000000001\r\n" + 
				"-17.983100000000000\r\n" + 
				"-17.973500000000001\r\n" + 
				"-17.964500000000001\r\n" + 
				"-17.956500000000002\r\n" + 
				"-17.948499999999999\r\n" + 
				"-17.937333333333331\r\n" + 
				"-17.925999999999998\r\n" + 
				"-17.916222222222220\r\n" + 
				"-17.903199999999998\r\n" + 
				"-17.895000000000000\r\n" + 
				"-17.879571428571431\r\n" + 
				"-17.866750000000000\r\n" + 
				"-17.857250000000001\r\n" + 
				"-17.838250000000002\r\n" + 
				"-17.818333333333332\r\n" + 
				"-17.780666666666665\r\n" + 
				"-17.758000000000003\r\n" + 
				"-17.742799999999999\r\n" + 
				"-17.715499999999999\r\n" + 
				"-17.700500000000002\r\n" + 
				"-17.686500000000002\r\n" + 
				"-17.676333333333332\r\n" + 
				"-17.654000000000000\r\n" + 
				"-17.638500000000001\r\n" + 
				"-17.627166666666668\r\n" + 
				"-17.611000000000001\r\n" + 
				"-17.591000000000001\r\n" + 
				"-17.573999999999998\r\n" + 
				"-17.547750000000001\r\n" + 
				"-17.523499999999999\r\n" + 
				"-17.510999999999996\r\n" + 
				"-17.494000000000003\r\n" + 
				"-17.475250000000003\r\n" + 
				"-17.462250000000001\r\n" + 
				"-17.452400000000004\r\n" + 
				"-17.435666666666666\r\n" + 
				"-17.409666666666666\r\n" + 
				"-17.389600000000002\r\n" + 
				"-17.373333333333335\r\n" + 
				"-17.356999999999999\r\n" + 
				"-17.334800000000001\r\n" + 
				"-17.305999999999997\r\n" + 
				"-17.292500000000000\r\n" + 
				"-17.279000000000000\r\n" + 
				"-17.259000000000000\r\n" + 
				"-17.244000000000000\r\n" + 
				"-17.234000000000002\r\n" + 
				"-17.219000000000001\r\n" + 
				"-17.203500000000002\r\n" + 
				"-17.181000000000001\r\n" + 
				"-17.169000000000000\r\n" + 
				"-17.142500000000002\r\n" + 
				"-17.125499999999999\r\n" + 
				"-17.108750000000001\r\n" + 
				"-17.096333333333337\r\n" + 
				"-17.082833333333333\r\n" + 
				"-17.071000000000002\r\n" + 
				"-17.055833333333332\r\n" + 
				"-17.044142857142855\r\n" + 
				"-17.032500000000002\r\n" + 
				"-17.023499999999999\r\n" + 
				"-17.014500000000002\r\n" + 
				"-17.002500000000001\r\n" + 
				"-16.991000000000000\r\n" + 
				"-16.978500000000000\r\n" + 
				"-16.966500000000000\r\n" + 
				"-16.955499999999997\r\n" + 
				"-16.942899999999998\r\n" + 
				"-16.930624999999999\r\n" + 
				"-16.919333333333334\r\n" + 
				"-16.904142857142858\r\n" + 
				"-16.886500000000002\r\n" + 
				"-16.875000000000000\r\n" + 
				"-16.859999999999999\r\n" + 
				"-16.839750000000002\r\n" + 
				"-16.827999999999999\r\n" + 
				"-16.818666666666669\r\n" + 
				"-16.802000000000000\r\n" + 
				"-16.780500000000000\r\n" + 
				"-16.761833333333332\r\n" + 
				"-16.751000000000001\r\n" + 
				"-16.737500000000001\r\n" + 
				"-16.703666666666667\r\n" + 
				"-16.689999999999998\r\n" + 
				"-16.674600000000002\r\n" + 
				"-16.658999999999999\r\n" + 
				"-16.637000000000000\r\n" + 
				"-16.621333333333336\r\n" + 
				"-16.605499999999999\r\n" + 
				"-16.588750000000001\r\n" + 
				"-16.557500000000001\r\n" + 
				"-16.544250000000002\r\n" + 
				"-16.533000000000001\r\n" + 
				"-16.515500000000003\r\n" + 
				"-16.497199999999999\r\n" + 
				"-16.484000000000002\r\n" + 
				"-16.451999999999998\r\n" + 
				"-16.424499999999998\r\n" + 
				"-16.403500000000001\r\n" + 
				"-16.381599999999999\r\n" + 
				"-16.361499999999999\r\n" + 
				"-16.346999999999998\r\n" + 
				"-16.288666666666668\r\n" + 
				"-16.268999999999998\r\n" + 
				"-16.245500000000000\r\n" + 
				"-16.217400000000001\r\n" + 
				"-16.203749999999999\r\n" + 
				"-16.187999999999999\r\n" + 
				"-16.175750000000001\r\n" + 
				"-16.157333333333334\r\n" + 
				"-16.140666666666664\r\n" + 
				"-16.123333333333335\r\n" + 
				"-16.113000000000000\r\n" + 
				"-16.100000000000001\r\n" + 
				"-16.088666666666668\r\n" + 
				"-16.075749999999999\r\n" + 
				"-16.064125000000001\r\n" + 
				"-16.052545454545452\r\n" + 
				"-16.042571428571428\r\n" + 
				"-16.032500000000002\r\n" + 
				"-16.020500000000002\r\n" + 
				"-16.007923076923078\r\n" + 
				"-15.996000000000000\r\n" + 
				"-15.985499999999996\r\n" + 
				"-15.971500000000001\r\n" + 
				"-15.957500000000001\r\n" + 
				"-15.943181818181815\r\n" + 
				"-15.932499999999999\r\n" + 
				"-15.922000000000001\r\n" + 
				"-15.912699999999997\r\n" + 
				"-15.898428571428571\r\n" + 
				"-15.881333333333332\r\n" + 
				"-15.869000000000000\r\n" + 
				"-15.856666666666667\r\n" + 
				"-15.843000000000000\r\n" + 
				"-15.830000000000000\r\n" + 
				"-15.807799999999997\r\n" + 
				"-15.792199999999998\r\n" + 
				"-15.777333333333333\r\n" + 
				"-15.758666666666665\r\n" + 
				"-15.744000000000000\r\n" + 
				"-15.731000000000000\r\n" + 
				"-15.700166666666666\r\n" + 
				"-15.687999999999999\r\n" + 
				"-15.671999999999999\r\n" + 
				"-15.651000000000002\r\n" + 
				"-15.638999999999999\r\n" + 
				"-15.623799999999999\r\n" + 
				"-15.612333333333334\r\n" + 
				"-15.594500000000000\r\n" + 
				"-15.582999999999998\r\n" + 
				"-15.564000000000000\r\n" + 
				"-15.550333333333333\r\n" + 
				"-15.533249999999999\r\n" + 
				"-15.520333333333333\r\n" + 
				"-15.507333333333333\r\n" + 
				"-15.486000000000001\r\n" + 
				"-15.458250000000001\r\n" + 
				"-15.445666666666666\r\n" + 
				"-15.428500000000000\r\n" + 
				"-15.407499999999999\r\n" + 
				"-15.395500000000000\r\n" + 
				"-15.383666666666665\r\n" + 
				"-15.363666666666667\r\n" + 
				"-15.330500000000001\r\n" + 
				"-15.317250000000001\r\n" + 
				"-15.302500000000000\r\n" + 
				"-15.289000000000000\r\n" + 
				"-15.280000000000001\r\n" + 
				"-15.257750000000000\r\n" + 
				"-15.244000000000000\r\n" + 
				"-15.221750000000000\r\n" + 
				"-15.197375000000001\r\n" + 
				"-15.185666666666668\r\n" + 
				"-15.166499999999999\r\n" + 
				"-15.154600000000002\r\n" + 
				"-15.139999999999999\r\n" + 
				"-15.125333333333332\r\n" + 
				"-15.114666666666666\r\n" + 
				"-15.099499999999999\r\n" + 
				"-15.084285714285715\r\n" + 
				"-15.073142857142857\r\n" + 
				"-15.061727272727273\r\n" + 
				"-15.048000000000000\r\n" + 
				"-15.032499999999999\r\n" + 
				"-15.016500000000001\r\n" + 
				"-15.002000000000001\r\n" + 
				"-14.990500000000001\r\n" + 
				"-14.978285714285716\r\n" + 
				"-14.965399999999999\r\n" + 
				"-14.956285714285716\r\n" + 
				"-14.943199999999999\r\n" + 
				"-14.929466666666666\r\n" + 
				"-14.917000000000000\r\n" + 
				"-14.899400000000000\r\n" + 
				"-14.875250000000001\r\n" + 
				"-14.853249999999999\r\n" + 
				"-14.837999999999999\r\n" + 
				"-14.826800000000000\r\n" + 
				"-14.811000000000000\r\n" + 
				"-14.799750000000001\r\n" + 
				"-14.770599999999998\r\n" + 
				"-14.749750000000001\r\n" + 
				"-14.733500000000001\r\n" + 
				"-14.718666666666666\r\n" + 
				"-14.705750000000000\r\n" + 
				"-14.693000000000000\r\n" + 
				"-14.680999999999999\r\n" + 
				"-14.670000000000000\r\n" + 
				"-14.656666666666666\r\n" + 
				"-14.639000000000001\r\n" + 
				"-14.614999999999998\r\n" + 
				"-14.598500000000000\r\n" + 
				"-14.576000000000001\r\n" + 
				"-14.550666666666666\r\n" + 
				"-14.529666666666666\r\n" + 
				"-14.519333333333334\r\n" + 
				"-14.500800000000002\r\n" + 
				"-14.480499999999999\r\n" + 
				"-14.462666666666665\r\n" + 
				"-14.452500000000001\r\n" + 
				"-14.434857142857144\r\n" + 
				"-14.417000000000000\r\n" + 
				"-14.386599999999998\r\n" + 
				"-14.366250000000001\r\n" + 
				"-14.355250000000000\r\n" + 
				"-14.335000000000001\r\n" + 
				"-14.318000000000000\r\n" + 
				"-14.308499999999999\r\n" + 
				"-14.290800000000001\r\n" + 
				"-14.271000000000001\r\n" + 
				"-14.254333333333333\r\n" + 
				"-14.238500000000000\r\n" + 
				"-14.228000000000000\r\n" + 
				"-14.207333333333333\r\n" + 
				"-14.187250000000001\r\n" + 
				"-14.169400000000001\r\n" + 
				"-14.147874999999999\r\n" + 
				"-14.132999999999999\r\n" + 
				"-14.117333333333335\r\n" + 
				"-14.100250000000001\r\n" + 
				"-14.086666666666668\r\n" + 
				"-14.074099999999998\r\n" + 
				"-14.057333333333332\r\n" + 
				"-14.046500000000000\r\n" + 
				"-14.032333333333334\r\n" + 
				"-14.016500000000001\r\n" + 
				"-14.002000000000001\r\n" + 
				"-13.987500000000001\r\n" + 
				"-13.971500000000001\r\n" + 
				"-13.955499999999999\r\n" + 
				"-13.941818181818180\r\n" + 
				"-13.930000000000000\r\n" + 
				"-13.920499999999999\r\n" + 
				"-13.910000000000002\r\n" + 
				"-13.895999999999999\r\n" + 
				"-13.885000000000000\r\n" + 
				"-13.872500000000000\r\n" + 
				"-13.862666666666668\r\n" + 
				"-13.846250000000001\r\n" + 
				"-13.828250000000001\r\n" + 
				"-13.805499999999999\r\n" + 
				"-13.779833333333334\r\n" + 
				"-13.758000000000001\r\n" + 
				"-13.727399999999999\r\n" + 
				"-13.712999999999999\r\n" + 
				"-13.696999999999999\r\n" + 
				"-13.665799999999999\r\n" + 
				"-13.643500000000001\r\n" + 
				"-13.629999999999999\r\n" + 
				"-13.613500000000000\r\n" + 
				"-13.595800000000001\r\n" + 
				"-13.581666666666665\r\n" + 
				"-13.568000000000000\r\n" + 
				"-13.549500000000000\r\n" + 
				"-13.531000000000001\r\n" + 
				"-13.514000000000001\r\n" + 
				"-13.502000000000001\r\n" + 
				"-13.472500000000000\r\n" + 
				"-13.457000000000001\r\n" + 
				"-13.441500000000000\r\n" + 
				"-13.421666666666667\r\n" + 
				"-13.403800000000000\r\n" + 
				"-13.384000000000000\r\n" + 
				"-13.369999999999999\r\n" + 
				"-13.328500000000000\r\n" + 
				"-13.307499999999999\r\n" + 
				"-13.294799999999999\r\n" + 
				"-13.277750000000001\r\n" + 
				"-13.266333333333334\r\n" + 
				"-13.255000000000001\r\n" + 
				"-13.241000000000000\r\n" + 
				"-13.224000000000000\r\n" + 
				"-13.206000000000000\r\n" + 
				"-13.187000000000001\r\n" + 
				"-13.165666666666665\r\n" + 
				"-13.137000000000000\r\n" + 
				"-13.123199999999997\r\n" + 
				"-13.111499999999999\r\n" + 
				"-13.096571428571428\r\n" + 
				"-13.080714285714285\r\n" + 
				"-13.067000000000000\r\n" + 
				"-13.054444444444444\r\n" + 
				"-13.042999999999999\r\n" + 
				"-13.031416666666667\r\n" + 
				"-13.017071428571429\r\n" + 
				"-13.002000000000001\r\n" + 
				"-12.990444444444444\r\n" + 
				"-12.977500000000001\r\n" + 
				"-12.961933333333331\r\n" + 
				"-12.947111111111111\r\n" + 
				"-12.934999999999999\r\n" + 
				"-12.925714285714287\r\n" + 
				"-12.914124999999999\r\n" + 
				"-12.899999999999999\r\n" + 
				"-12.882000000000000\r\n" + 
				"-12.867500000000000\r\n" + 
				"-12.850666666666667\r\n" + 
				"-12.839250000000000\r\n" + 
				"-12.822500000000000\r\n" + 
				"-12.810000000000000\r\n" + 
				"-12.789500000000000\r\n" + 
				"-12.758500000000002\r\n" + 
				"-12.741999999999999\r\n" + 
				"-12.722000000000001\r\n" + 
				"-12.702999999999999\r\n" + 
				"-12.686666666666667\r\n" + 
				"-12.673714285714285\r\n" + 
				"-12.660333333333334\r\n" + 
				"-12.638000000000000\r\n" + 
				"-12.626600000000000\r\n" + 
				"-12.606000000000000\r\n" + 
				"-12.593000000000000\r\n" + 
				"-12.582666666666666\r\n" + 
				"-12.559666666666667\r\n" + 
				"-12.542999999999999\r\n" + 
				"-12.526333333333334\r\n" + 
				"-12.507166666666668\r\n" + 
				"-12.486666666666666\r\n" + 
				"-12.472249999999999\r\n" + 
				"-12.452500000000001\r\n" + 
				"-12.433666666666667\r\n" + 
				"-12.413666666666666\r\n" + 
				"-12.401000000000000\r\n" + 
				"-12.370500000000000\r\n" + 
				"-12.358499999999999\r\n" + 
				"-12.346499999999999\r\n" + 
				"-12.332000000000001\r\n" + 
				"-12.315000000000000\r\n" + 
				"-12.301000000000000\r\n" + 
				"-12.272333333333334\r\n" + 
				"-12.259000000000000\r\n" + 
				"-12.246000000000000\r\n" + 
				"-12.230000000000000\r\n" + 
				"-12.212999999999999\r\n" + 
				"-12.202999999999999\r\n" + 
				"-12.181500000000000\r\n" + 
				"-12.167500000000000\r\n" + 
				"-12.147571428571428\r\n" + 
				"-12.132333333333333\r\n" + 
				"-12.120500000000000\r\n" + 
				"-12.102818181818179\r\n" + 
				"-12.086666666666666\r\n" + 
				"-12.074874999999999\r\n" + 
				"-12.062499999999998\r\n" + 
				"-12.050500000000001\r\n" + 
				"-12.040000000000001\r\n" + 
				"-12.030500000000002\r\n" + 
				"-12.016266666666665\r\n" + 
				"-12.002000000000001\r\n" + 
				"-11.990500000000001\r\n" + 
				"-11.977500000000001\r\n" + 
				"-11.964000000000000\r\n" + 
				"-11.951428571428574\r\n" + 
				"-11.940999999999999\r\n" + 
				"-11.930142857142856\r\n" + 
				"-11.919428571428570\r\n" + 
				"-11.906124999999999\r\n" + 
				"-11.895833333333334\r\n" + 
				"-11.882444444444443\r\n" + 
				"-11.868500000000001\r\n" + 
				"-11.850800000000001\r\n" + 
				"-11.836500000000001\r\n" + 
				"-11.824999999999999\r\n" + 
				"-11.807000000000000\r\n" + 
				"-11.787749999999999\r\n" + 
				"-11.772599999999999\r\n" + 
				"-11.715750000000002\r\n" + 
				"-11.702999999999999\r\n" + 
				"-11.691166666666668\r\n" + 
				"-11.669000000000000\r\n" + 
				"-11.655999999999999\r\n" + 
				"-11.632000000000000\r\n" + 
				"-11.614666666666666\r\n" + 
				"-11.597333333333333\r\n" + 
				"-11.576000000000001\r\n" + 
				"-11.561999999999999\r\n" + 
				"-11.547666666666666\r\n" + 
				"-11.535499999999999\r\n" + 
				"-11.517500000000000\r\n" + 
				"-11.501999999999999\r\n" + 
				"-11.490000000000000\r\n" + 
				"-11.461000000000000\r\n" + 
				"-11.436999999999999\r\n" + 
				"-11.414666666666667\r\n" + 
				"-11.395000000000000\r\n" + 
				"-11.381399999999999\r\n" + 
				"-11.367500000000000\r\n" + 
				"-11.356666666666667\r\n" + 
				"-11.346333333333334\r\n" + 
				"-11.332000000000001\r\n" + 
				"-11.320000000000000\r\n" + 
				"-11.305400000000001\r\n" + 
				"-11.287750000000001\r\n" + 
				"-11.272800000000000\r\n" + 
				"-11.254500000000002\r\n" + 
				"-11.235333333333335\r\n" + 
				"-11.218000000000000\r\n" + 
				"-11.202199999999999\r\n" + 
				"-11.190200000000001\r\n" + 
				"-11.172666666666666\r\n" + 
				"-11.157400000000001\r\n" + 
				"-11.142500000000000\r\n" + 
				"-11.129000000000000\r\n" + 
				"-11.110000000000001\r\n" + 
				"-11.093714285714285\r\n" + 
				"-11.081555555555555\r\n" + 
				"-11.067666666666666\r\n" + 
				"-11.052750000000001\r\n" + 
				"-11.041499999999999\r\n" + 
				"-11.030500000000002\r\n" + 
				"-11.019500000000001\r\n" + 
				"-11.008499999999998\r\n" + 
				"-10.993499999999999\r\n" + 
				"-10.978499999999999\r\n" + 
				"-10.966999999999999\r\n" + 
				"-10.957818181818181\r\n" + 
				"-10.944099999999999\r\n" + 
				"-10.931624999999999\r\n" + 
				"-10.920199999999999\r\n" + 
				"-10.906714285714285\r\n" + 
				"-10.891333333333334\r\n" + 
				"-10.866333333333335\r\n" + 
				"-10.848333333333334\r\n" + 
				"-10.826499999999999\r\n" + 
				"-10.804000000000000\r\n" + 
				"-10.791499999999999\r\n" + 
				"-10.780666666666667\r\n" + 
				"-10.769333333333334\r\n" + 
				"-10.750500000000001\r\n" + 
				"-10.726714285714284\r\n" + 
				"-10.709500000000000\r\n" + 
				"-10.694000000000001\r\n" + 
				"-10.681200000000000\r\n" + 
				"-10.668500000000000\r\n" + 
				"-10.652999999999999\r\n" + 
				"-10.632999999999999\r\n" + 
				"-10.614333333333335\r\n" + 
				"-10.599666666666666\r\n" + 
				"-10.578500000000000\r\n" + 
				"-10.556666666666667\r\n" + 
				"-10.538333333333332\r\n" + 
				"-10.522000000000000\r\n" + 
				"-10.508500000000000\r\n" + 
				"-10.496666666666668\r\n" + 
				"-10.455666666666666\r\n" + 
				"-10.433999999999999\r\n" + 
				"-10.406666666666666\r\n" + 
				"-10.395333333333333\r\n" + 
				"-10.378000000000000\r\n" + 
				"-10.360749999999999\r\n" + 
				"-10.346500000000001\r\n" + 
				"-10.323499999999999\r\n" + 
				"-10.310666666666668\r\n" + 
				"-10.292666666666667\r\n" + 
				"-10.265750000000001\r\n" + 
				"-10.251200000000001\r\n" + 
				"-10.238333333333333\r\n" + 
				"-10.219500000000000\r\n" + 
				"-10.210000000000001\r\n" + 
				"-10.196500000000000\r\n" + 
				"-10.183249999999999\r\n" + 
				"-10.169599999999999\r\n" + 
				"-10.149600000000001\r\n" + 
				"-10.132000000000000\r\n" + 
				"-10.112399999999999\r\n" + 
				"-10.102600000000001\r\n" + 
				"-10.090777777777776\r\n" + 
				"-10.079333333333333\r\n" + 
				"-10.062909090909091\r\n" + 
				"-10.048499999999999\r\n" + 
				"-10.032500000000001\r\n" + 
				"-10.016500000000001\r\n" + 
				"-10.001999999999999\r\n" + 
				"-9.990500000000001\r\n" + 
				"-9.977500000000001\r\n" + 
				"-9.961500000000001\r\n" + 
				"-9.946769230769231\r\n" + 
				"-9.930999999999999\r\n" + 
				"-9.921999999999999\r\n" + 
				"-9.909400000000000\r\n" + 
				"-9.895250000000001\r\n" + 
				"-9.886000000000001\r\n" + 
				"-9.869333333333335\r\n" + 
				"-9.852000000000000\r\n" + 
				"-9.839000000000000\r\n" + 
				"-9.829400000000000\r\n" + 
				"-9.802000000000000\r\n" + 
				"-9.783500000000000\r\n" + 
				"-9.770500000000000\r\n" + 
				"-9.758500000000000\r\n" + 
				"-9.736666666666666\r\n" + 
				"-9.715500000000001\r\n" + 
				"-9.697500000000000\r\n" + 
				"-9.686499999999999\r\n" + 
				"-9.668666666666667\r\n" + 
				"-9.650000000000000\r\n" + 
				"-9.637499999999999\r\n" + 
				"-9.612250000000000\r\n" + 
				"-9.594333333333333\r\n" + 
				"-9.577999999999999\r\n" + 
				"-9.553750000000001\r\n" + 
				"-9.535000000000000\r\n" + 
				"-9.520333333333333\r\n" + 
				"-9.503200000000000\r\n" + 
				"-9.478333333333334\r\n" + 
				"-9.454166666666666\r\n" + 
				"-9.429500000000001\r\n" + 
				"-9.409000000000001\r\n" + 
				"-9.392500000000000\r\n" + 
				"-9.381666666666666\r\n" + 
				"-9.365000000000000\r\n" + 
				"-9.353666666666667\r\n" + 
				"-9.342000000000001\r\n" + 
				"-9.326200000000000\r\n" + 
				"-9.316333333333335\r\n" + 
				"-9.301000000000000\r\n" + 
				"-9.285000000000000\r\n" + 
				"-9.267000000000000\r\n" + 
				"-9.256000000000000\r\n" + 
				"-9.246400000000000\r\n" + 
				"-9.236333333333334\r\n" + 
				"-9.223500000000001\r\n" + 
				"-9.209500000000000\r\n" + 
				"-9.194857142857144\r\n" + 
				"-9.175666666666666\r\n" + 
				"-9.158000000000000\r\n" + 
				"-9.137400000000000\r\n" + 
				"-9.105666666666666\r\n" + 
				"-9.094749999999999\r\n" + 
				"-9.082374999999999\r\n" + 
				"-9.070285714285713\r\n" + 
				"-9.060499999999999\r\n" + 
				"-9.049999999999999\r\n" + 
				"-9.039000000000000\r\n" + 
				"-9.028000000000002\r\n" + 
				"-9.014500000000000\r\n" + 
				"-9.003499999999999\r\n" + 
				"-8.991636363636363\r\n" + 
				"-8.977499999999999\r\n" + 
				"-8.964400000000000\r\n" + 
				"-8.951999999999998\r\n" + 
				"-8.939250000000000\r\n" + 
				"-8.925400000000000\r\n" + 
				"-8.908222222222223\r\n" + 
				"-8.894000000000000\r\n" + 
				"-8.881000000000000\r\n" + 
				"-8.866833333333334\r\n" + 
				"-8.850500000000000\r\n" + 
				"-8.836400000000001\r\n" + 
				"-8.816142857142857\r\n" + 
				"-8.803400000000000\r\n" + 
				"-8.791000000000000\r\n" + 
				"-8.778600000000001\r\n" + 
				"-8.759000000000000\r\n" + 
				"-8.742500000000000\r\n" + 
				"-8.728000000000000\r\n" + 
				"-8.712666666666665\r\n" + 
				"-8.702000000000000\r\n" + 
				"-8.690333333333335\r\n" + 
				"-8.676000000000000\r\n" + 
				"-8.652666666666667\r\n" + 
				"-8.632999999999999\r\n" + 
				"-8.615500000000001\r\n" + 
				"-8.600999999999999\r\n" + 
				"-8.583666666666666\r\n" + 
				"-8.565500000000000\r\n" + 
				"-8.542000000000000\r\n" + 
				"-8.514666666666667\r\n" + 
				"-8.494250000000001\r\n" + 
				"-8.471333333333334\r\n" + 
				"-8.454000000000001\r\n" + 
				"-8.438666666666668\r\n" + 
				"-8.414750000000002\r\n" + 
				"-8.398333333333332\r\n" + 
				"-8.379666666666667\r\n" + 
				"-8.365000000000000\r\n" + 
				"-8.352833333333335\r\n" + 
				"-8.336500000000001\r\n" + 
				"-8.315000000000000\r\n" + 
				"-8.294499999999999\r\n" + 
				"-8.277500000000000\r\n" + 
				"-8.265000000000001\r\n" + 
				"-8.251999999999999\r\n" + 
				"-8.239500000000000\r\n" + 
				"-8.218000000000002\r\n" + 
				"-8.205000000000000\r\n" + 
				"-8.193000000000000\r\n" + 
				"-8.179800000000000\r\n" + 
				"-8.169000000000001\r\n" + 
				"-8.149250000000000\r\n" + 
				"-8.133500000000000\r\n" + 
				"-8.122199999999999\r\n" + 
				"-8.110400000000000\r\n" + 
				"-8.095600000000001\r\n" + 
				"-8.082249999999998\r\n" + 
				"-8.071500000000000\r\n" + 
				"-8.062499999999998\r\n" + 
				"-8.051499999999999\r\n" + 
				"-8.038500000000001\r\n" + 
				"-8.022800000000000\r\n" + 
				"-8.007999999999999\r\n" + 
				"-7.997999999999999\r\n" + 
				"-7.988000000000000\r\n" + 
				"-7.973500000000000\r\n" + 
				"-7.958500000000000\r\n" + 
				"-7.944500000000000\r\n" + 
				"-7.933999999999999\r\n" + 
				"-7.919600000000000\r\n" + 
				"-7.906714285714286\r\n" + 
				"-7.896500000000000\r\n" + 
				"-7.879000000000000\r\n" + 
				"-7.864400000000001\r\n" + 
				"-7.837142857142857\r\n" + 
				"-7.821000000000001\r\n" + 
				"-7.810666666666667\r\n" + 
				"-7.794500000000000\r\n" + 
				"-7.771500000000000\r\n" + 
				"-7.750000000000000\r\n" + 
				"-7.726750000000000\r\n" + 
				"-7.712000000000000\r\n" + 
				"-7.689166666666668\r\n" + 
				"-7.670999999999999\r\n" + 
				"-7.654750000000000\r\n" + 
				"-7.635000000000000\r\n" + 
				"-7.619333333333334\r\n" + 
				"-7.582500000000000\r\n" + 
				"-7.555500000000000\r\n" + 
				"-7.538666666666667\r\n" + 
				"-7.521666666666666\r\n" + 
				"-7.490000000000000\r\n" + 
				"-7.471333333333334\r\n" + 
				"-7.459500000000000\r\n" + 
				"-7.448333333333333\r\n" + 
				"-7.432333333333333\r\n" + 
				"-7.395500000000000\r\n" + 
				"-7.376500000000000\r\n" + 
				"-7.362500000000001\r\n" + 
				"-7.350500000000000\r\n" + 
				"-7.338000000000000\r\n" + 
				"-7.327000000000000\r\n" + 
				"-7.306600000000000\r\n" + 
				"-7.284500000000000\r\n" + 
				"-7.269500000000000\r\n" + 
				"-7.245500000000000\r\n" + 
				"-7.233666666666667\r\n" + 
				"-7.217499999999999\r\n" + 
				"-7.206000000000000\r\n" + 
				"-7.185000000000001\r\n" + 
				"-7.170999999999999\r\n" + 
				"-7.158666666666666\r\n" + 
				"-7.142666666666666\r\n" + 
				"-7.121000000000000\r\n" + 
				"-7.106200000000001\r\n" + 
				"-7.095000000000000\r\n" + 
				"-7.079875000000000\r\n" + 
				"-7.067250000000001\r\n" + 
				"-7.056875000000000\r\n" + 
				"-7.044500000000001\r\n" + 
				"-7.031000000000001\r\n" + 
				"-7.021500000000001\r\n" + 
				"-7.011500000000001\r\n" + 
				"-7.002000000000000\r\n" + 
				"-6.989499999999999\r\n" + 
				"-6.972999999999999\r\n" + 
				"-6.961500000000001\r\n" + 
				"-6.951000000000001\r\n" + 
				"-6.938000000000000\r\n" + 
				"-6.929833333333334\r\n" + 
				"-6.917625000000000\r\n" + 
				"-6.899428571428572\r\n" + 
				"-6.886800000000001\r\n" + 
				"-6.877250000000000\r\n" + 
				"-6.850600000000000\r\n" + 
				"-6.813333333333334\r\n" + 
				"-6.799500000000000\r\n" + 
				"-6.783200000000001\r\n" + 
				"-6.761500000000000\r\n" + 
				"-6.746333333333333\r\n" + 
				"-6.732666666666667\r\n" + 
				"-6.711833333333334\r\n" + 
				"-6.687000000000000\r\n" + 
				"-6.672250000000001\r\n" + 
				"-6.661750000000000\r\n" + 
				"-6.649000000000000\r\n" + 
				"-6.634750000000000\r\n" + 
				"-6.605000000000000\r\n" + 
				"-6.574000000000000\r\n" + 
				"-6.560000000000001\r\n" + 
				"-6.547000000000000\r\n" + 
				"-6.529750000000000\r\n" + 
				"-6.520333333333333\r\n" + 
				"-6.506000000000000\r\n" + 
				"-6.493000000000000\r\n" + 
				"-6.478000000000000\r\n" + 
				"-6.459000000000000\r\n" + 
				"-6.437000000000000\r\n" + 
				"-6.416999999999999\r\n" + 
				"-6.395666666666666\r\n" + 
				"-6.383000000000000\r\n" + 
				"-6.370000000000000\r\n" + 
				"-6.355000000000000\r\n" + 
				"-6.340500000000001\r\n" + 
				"-6.327428571428571\r\n" + 
				"-6.303000000000000\r\n" + 
				"-6.292000000000000\r\n" + 
				"-6.277000000000000\r\n" + 
				"-6.255333333333333\r\n" + 
				"-6.239500000000000\r\n" + 
				"-6.220000000000000\r\n" + 
				"-6.206200000000001\r\n" + 
				"-6.193000000000000\r\n" + 
				"-6.178000000000000\r\n" + 
				"-6.164000000000000\r\n" + 
				"-6.146999999999999\r\n" + 
				"-6.131000000000000\r\n" + 
				"-6.116714285714286\r\n" + 
				"-6.097000000000000\r\n" + 
				"-6.076444444444444\r\n" + 
				"-6.060000000000001\r\n" + 
				"-6.045500000000001\r\n" + 
				"-6.029500000000001\r\n" + 
				"-6.017500000000001\r\n" + 
				"-6.005500000000001\r\n" + 
				"-5.991000000000000\r\n" + 
				"-5.976500000000000\r\n" + 
				"-5.960500000000000\r\n" + 
				"-5.945000000000001\r\n" + 
				"-5.930800000000000\r\n" + 
				"-5.918583333333334\r\n" + 
				"-5.904285714285713\r\n" + 
				"-5.890000000000001\r\n" + 
				"-5.871666666666667\r\n" + 
				"-5.859600000000000\r\n" + 
				"-5.838800000000000\r\n" + 
				"-5.824000000000000\r\n" + 
				"-5.806428571428572\r\n" + 
				"-5.793200000000000\r\n" + 
				"-5.779666666666667\r\n" + 
				"-5.770200000000000\r\n" + 
				"-5.752333333333333\r\n" + 
				"-5.737333333333333\r\n" + 
				"-5.712500000000000\r\n" + 
				"-5.697666666666667\r\n" + 
				"-5.689750000000000\r\n" + 
				"-5.663857142857144\r\n" + 
				"-5.646666666666666\r\n" + 
				"-5.637800000000000\r\n" + 
				"-5.625000000000000\r\n" + 
				"-5.607500000000000\r\n" + 
				"-5.581000000000000\r\n" + 
				"-5.563499999999999\r\n" + 
				"-5.548000000000000\r\n" + 
				"-5.525000000000000\r\n" + 
				"-5.510000000000000\r\n" + 
				"-5.495166666666667\r\n" + 
				"-5.477833333333334\r\n" + 
				"-5.460000000000000\r\n" + 
				"-5.447333333333333\r\n" + 
				"-5.428571428571428\r\n" + 
				"-5.383800000000000\r\n" + 
				"-5.361500000000000\r\n" + 
				"-5.348750000000000\r\n" + 
				"-5.334222222222222\r\n" + 
				"-5.315000000000000\r\n" + 
				"-5.300250000000000\r\n" + 
				"-5.271875000000000\r\n" + 
				"-5.245666666666667\r\n" + 
				"-5.236500000000000\r\n" + 
				"-5.222000000000000\r\n" + 
				"-5.196000000000000\r\n" + 
				"-5.182250000000001\r\n" + 
				"-5.170333333333333\r\n" + 
				"-5.153000000000000\r\n" + 
				"-5.141333333333333\r\n" + 
				"-5.125333333333334\r\n" + 
				"-5.111600000000000\r\n" + 
				"-5.099800000000000\r\n" + 
				"-5.083500000000000\r\n" + 
				"-5.071125000000000\r\n" + 
				"-5.062250000000000\r\n" + 
				"-5.052111111111111\r\n" + 
				"-5.040000000000000\r\n" + 
				"-5.030500000000000\r\n" + 
				"-5.018500000000000\r\n" + 
				"-5.003090909090909\r\n" + 
				"-4.990500000000000\r\n" + 
				"-4.980499999999999\r\n" + 
				"-4.970500000000000\r\n" + 
				"-4.956500000000000\r\n" + 
				"-4.946000000000000\r\n" + 
				"-4.936222222222223\r\n" + 
				"-4.924833333333334\r\n" + 
				"-4.913250000000001\r\n" + 
				"-4.896000000000000\r\n" + 
				"-4.880666666666667\r\n" + 
				"-4.869666666666667\r\n" + 
				"-4.858666666666667\r\n" + 
				"-4.843600000000000\r\n" + 
				"-4.833500000000000\r\n" + 
				"-4.814500000000000\r\n" + 
				"-4.795000000000000\r\n" + 
				"-4.780500000000000\r\n" + 
				"-4.766500000000001\r\n" + 
				"-4.747600000000000\r\n" + 
				"-4.721000000000000\r\n" + 
				"-4.696000000000000\r\n" + 
				"-4.676333333333333\r\n" + 
				"-4.659000000000001\r\n" + 
				"-4.644750000000000\r\n" + 
				"-4.629000000000000\r\n" + 
				"-4.609000000000000\r\n" + 
				"-4.586666666666667\r\n" + 
				"-4.570000000000000\r\n" + 
				"-4.541000000000000\r\n" + 
				"-4.528333333333333\r\n" + 
				"-4.514500000000000\r\n" + 
				"-4.504000000000000\r\n" + 
				"-4.485833333333333\r\n" + 
				"-4.466500000000000\r\n" + 
				"-4.438250000000000\r\n" + 
				"-4.426000000000000\r\n" + 
				"-4.414000000000001\r\n" + 
				"-4.401000000000000\r\n" + 
				"-4.385333333333334\r\n" + 
				"-4.371500000000000\r\n" + 
				"-4.353750000000000\r\n" + 
				"-4.341333333333334\r\n" + 
				"-4.317500000000000\r\n" + 
				"-4.290333333333334\r\n" + 
				"-4.267000000000000\r\n" + 
				"-4.249000000000000\r\n" + 
				"-4.228000000000000\r\n" + 
				"-4.219500000000000\r\n" + 
				"-4.206250000000001\r\n" + 
				"-4.182500000000000\r\n" + 
				"-4.164000000000001\r\n" + 
				"-4.144250000000000\r\n" + 
				"-4.123400000000001\r\n" + 
				"-4.112800000000000\r\n" + 
				"-4.093333333333334\r\n" + 
				"-4.078333333333333\r\n" + 
				"-4.063818181818181\r\n" + 
				"-4.050444444444444\r\n" + 
				"-4.037500000000001\r\n" + 
				"-4.021500000000001\r\n" + 
				"-4.005857142857143\r\n" + 
				"-3.989500000000000\r\n" + 
				"-3.977500000000000\r\n" + 
				"-3.965500000000000\r\n" + 
				"-3.949230769230769\r\n" + 
				"-3.935000000000000\r\n" + 
				"-3.921625000000000\r\n" + 
				"-3.913500000000000\r\n" + 
				"-3.903571428571429\r\n" + 
				"-3.893250000000000\r\n" + 
				"-3.866500000000000\r\n" + 
				"-3.850750000000000\r\n" + 
				"-3.838666666666667\r\n" + 
				"-3.805250000000000\r\n" + 
				"-3.785000000000000\r\n" + 
				"-3.769000000000000\r\n" + 
				"-3.756666666666666\r\n" + 
				"-3.746000000000000\r\n" + 
				"-3.722500000000000\r\n" + 
				"-3.700333333333334\r\n" + 
				"-3.662000000000000\r\n" + 
				"-3.648000000000000\r\n" + 
				"-3.632000000000000\r\n" + 
				"-3.617000000000000\r\n" + 
				"-3.577500000000001\r\n" + 
				"-3.561500000000000\r\n" + 
				"-3.545666666666667\r\n" + 
				"-3.524000000000000\r\n" + 
				"-3.498500000000000\r\n" + 
				"-3.484000000000000\r\n" + 
				"-3.472250000000000\r\n" + 
				"-3.458333333333334\r\n" + 
				"-3.431500000000000\r\n" + 
				"-3.411000000000000\r\n" + 
				"-3.387666666666667\r\n" + 
				"-3.357333333333334\r\n" + 
				"-3.337250000000000\r\n" + 
				"-3.318600000000000\r\n" + 
				"-3.302750000000000\r\n" + 
				"-3.286500000000000\r\n" + 
				"-3.266800000000000\r\n" + 
				"-3.235666666666667\r\n" + 
				"-3.210750000000000\r\n" + 
				"-3.191666666666666\r\n" + 
				"-3.178750000000000\r\n" + 
				"-3.165250000000000\r\n" + 
				"-3.152800000000000\r\n" + 
				"-3.128500000000000\r\n" + 
				"-3.111285714285714\r\n" + 
				"-3.093571428571429\r\n" + 
				"-3.081125000000000\r\n" + 
				"-3.069500000000000\r\n" + 
				"-3.059857142857143\r\n" + 
				"-3.050000000000000\r\n" + 
				"-3.040111111111111\r\n" + 
				"-3.026500000000000\r\n" + 
				"-3.010500000000000\r\n" + 
				"-2.996000000000000\r\n" + 
				"-2.981500000000000\r\n" + 
				"-2.969500000000001\r\n" + 
				"-2.957500000000000\r\n" + 
				"-2.941500000000000\r\n" + 
				"-2.925230769230769\r\n" + 
				"-2.910000000000000\r\n" + 
				"-2.892999999999999\r\n" + 
				"-2.881500000000000\r\n" + 
				"-2.872000000000000\r\n" + 
				"-2.826142857142858\r\n" + 
				"-2.799666666666667\r\n" + 
				"-2.783000000000000\r\n" + 
				"-2.764250000000000\r\n" + 
				"-2.742200000000000\r\n" + 
				"-2.726000000000000\r\n" + 
				"-2.712250000000000\r\n" + 
				"-2.694250000000000\r\n" + 
				"-2.680000000000000\r\n" + 
				"-2.658000000000000\r\n" + 
				"-2.641000000000000\r\n" + 
				"-2.626750000000000\r\n" + 
				"-2.608500000000000\r\n" + 
				"-2.598000000000000\r\n" + 
				"-2.580000000000000\r\n" + 
				"-2.567333333333333\r\n" + 
				"-2.551500000000000\r\n" + 
				"-2.530500000000000\r\n" + 
				"-2.512666666666667\r\n" + 
				"-2.499000000000000\r\n" + 
				"-2.486750000000000\r\n" + 
				"-2.468500000000000\r\n" + 
				"-2.456000000000000\r\n" + 
				"-2.445333333333334\r\n" + 
				"-2.417000000000000\r\n" + 
				"-2.400500000000000\r\n" + 
				"-2.388333333333333\r\n" + 
				"-2.367666666666667\r\n" + 
				"-2.345250000000000\r\n" + 
				"-2.325500000000000\r\n" + 
				"-2.296000000000000\r\n" + 
				"-2.272600000000000\r\n" + 
				"-2.245166666666667\r\n" + 
				"-2.224250000000000\r\n" + 
				"-2.203000000000000\r\n" + 
				"-2.185250000000000\r\n" + 
				"-2.170000000000000\r\n" + 
				"-2.155400000000000\r\n" + 
				"-2.122500000000000\r\n" + 
				"-2.103285714285714\r\n" + 
				"-2.088333333333333\r\n" + 
				"-2.075000000000000\r\n" + 
				"-2.062833333333333\r\n" + 
				"-2.051333333333334\r\n" + 
				"-2.038142857142857\r\n" + 
				"-2.028000000000001\r\n" + 
				"-2.018500000000000\r\n" + 
				"-2.007000000000000\r\n" + 
				"-1.994500000000000\r\n" + 
				"-1.982500000000000\r\n" + 
				"-1.966500000000000\r\n" + 
				"-1.951000000000000\r\n" + 
				"-1.935769230769231\r\n" + 
				"-1.922833333333333\r\n" + 
				"-1.913285714285714\r\n" + 
				"-1.899166666666667\r\n" + 
				"-1.890250000000000\r\n" + 
				"-1.871500000000000\r\n" + 
				"-1.858250000000000\r\n" + 
				"-1.847200000000000\r\n" + 
				"-1.834500000000000\r\n" + 
				"-1.824000000000000\r\n" + 
				"-1.809000000000000\r\n" + 
				"-1.793800000000000\r\n" + 
				"-1.771000000000000\r\n" + 
				"-1.752500000000000\r\n" + 
				"-1.731714285714286\r\n" + 
				"-1.693000000000000\r\n" + 
				"-1.677000000000000\r\n" + 
				"-1.666000000000000\r\n" + 
				"-1.652000000000000\r\n" + 
				"-1.639200000000000\r\n" + 
				"-1.608500000000000\r\n" + 
				"-1.592500000000000\r\n" + 
				"-1.577000000000000\r\n" + 
				"-1.562000000000000\r\n" + 
				"-1.551500000000000\r\n" + 
				"-1.534000000000000\r\n" + 
				"-1.516500000000000\r\n" + 
				"1.522000000000000\r\n" + 
				"1.550000000000000\r\n" + 
				"1.568500000000000\r\n" + 
				"1.588000000000000\r\n" + 
				"1.606200000000000\r\n" + 
				"1.631333333333333\r\n" + 
				"1.642333333333333\r\n" + 
				"1.652000000000000\r\n" + 
				"1.673428571428572\r\n" + 
				"1.693500000000000\r\n" + 
				"1.708666666666667\r\n" + 
				"1.731800000000000\r\n" + 
				"1.751000000000000\r\n" + 
				"1.769500000000000\r\n" + 
				"1.790000000000000\r\n" + 
				"1.806000000000000\r\n" + 
				"1.832800000000000\r\n" + 
				"1.848142857142857\r\n" + 
				"1.864800000000000\r\n" + 
				"1.879000000000000\r\n" + 
				"1.897600000000000\r\n" + 
				"1.909000000000000\r\n" + 
				"1.922600000000000\r\n" + 
				"1.933800000000000\r\n" + 
				"1.945333333333334\r\n" + 
				"1.957000000000000\r\n" + 
				"1.966500000000000\r\n" + 
				"1.977000000000000\r\n" + 
				"1.986000000000000\r\n" + 
				"1.998500000000000\r\n" + 
				"2.014500000000000\r\n" + 
				"2.030500000000000\r\n" + 
				"2.042500000000000\r\n" + 
				"2.054200000000000\r\n" + 
				"2.071214285714286\r\n" + 
				"2.084333333333333\r\n" + 
				"2.105500000000000\r\n" + 
				"2.122000000000000\r\n" + 
				"2.134666666666667\r\n" + 
				"2.153571428571429\r\n" + 
				"2.171000000000000\r\n" + 
				"2.183666666666667\r\n" + 
				"2.214000000000000\r\n" + 
				"2.226666666666667\r\n" + 
				"2.244333333333334\r\n" + 
				"2.261000000000000\r\n" + 
				"2.275666666666667\r\n" + 
				"2.298000000000000\r\n" + 
				"2.319600000000000\r\n" + 
				"2.333000000000000\r\n" + 
				"2.347000000000000\r\n" + 
				"2.356000000000000\r\n" + 
				"2.370666666666667\r\n" + 
				"2.392400000000000\r\n" + 
				"2.417333333333333\r\n" + 
				"2.429000000000000\r\n" + 
				"2.444000000000000\r\n" + 
				"2.458666666666666\r\n" + 
				"2.485000000000000\r\n" + 
				"2.497500000000000\r\n" + 
				"2.510250000000000\r\n" + 
				"2.532333333333333\r\n" + 
				"2.550250000000000\r\n" + 
				"2.565333333333333\r\n" + 
				"2.577500000000000\r\n" + 
				"2.596000000000000\r\n" + 
				"2.610666666666667\r\n" + 
				"2.626500000000000\r\n" + 
				"2.644333333333333\r\n" + 
				"2.656000000000000\r\n" + 
				"2.674000000000000\r\n" + 
				"2.692666666666666\r\n" + 
				"2.710000000000000\r\n" + 
				"2.724500000000000\r\n" + 
				"2.746000000000000\r\n" + 
				"2.763000000000000\r\n" + 
				"2.786000000000000\r\n" + 
				"2.802000000000000\r\n" + 
				"2.822000000000000\r\n" + 
				"2.846333333333333\r\n" + 
				"2.861000000000000\r\n" + 
				"2.895714285714286\r\n" + 
				"2.919000000000000\r\n" + 
				"2.933000000000000\r\n" + 
				"2.940833333333333\r\n" + 
				"2.951333333333334\r\n" + 
				"2.961000000000000\r\n" + 
				"2.974307692307693\r\n" + 
				"2.989500000000000\r\n" + 
				"3.002000000000000\r\n" + 
				"3.014500000000000\r\n" + 
				"3.030500000000000\r\n" + 
				"3.045000000000000\r\n" + 
				"3.057333333333333\r\n" + 
				"3.071666666666666\r\n" + 
				"3.084250000000000\r\n" + 
				"3.099714285714286\r\n" + 
				"3.113500000000000\r\n" + 
				"3.136400000000000\r\n" + 
				"3.156500000000000\r\n" + 
				"3.166500000000000\r\n" + 
				"3.181200000000000\r\n" + 
				"3.190750000000000\r\n" + 
				"3.215000000000000\r\n" + 
				"3.238750000000000\r\n" + 
				"3.259333333333333\r\n" + 
				"3.281500000000000\r\n" + 
				"3.298500000000000\r\n" + 
				"3.310500000000000\r\n" + 
				"3.323000000000000\r\n" + 
				"3.335400000000000\r\n" + 
				"3.351500000000000\r\n" + 
				"3.368000000000000\r\n" + 
				"3.385666666666667\r\n" + 
				"3.406333333333333\r\n" + 
				"3.434500000000000\r\n" + 
				"3.455200000000000\r\n" + 
				"3.472500000000000\r\n" + 
				"3.490500000000000\r\n" + 
				"3.512000000000000\r\n" + 
				"3.544000000000000\r\n" + 
				"3.563400000000000\r\n" + 
				"3.578000000000000\r\n" + 
				"3.616750000000000\r\n" + 
				"3.644000000000000\r\n" + 
				"3.658500000000000\r\n" + 
				"3.672000000000000\r\n" + 
				"3.700666666666667\r\n" + 
				"3.735000000000000\r\n" + 
				"3.748833333333333\r\n" + 
				"3.765000000000000\r\n" + 
				"3.783800000000000\r\n" + 
				"3.798333333333333\r\n" + 
				"3.821000000000000\r\n" + 
				"3.832000000000000\r\n" + 
				"3.845200000000001\r\n" + 
				"3.867400000000001\r\n" + 
				"3.885000000000000\r\n" + 
				"3.907875000000000\r\n" + 
				"3.920400000000000\r\n" + 
				"3.932153846153846\r\n" + 
				"3.945142857142857\r\n" + 
				"3.959083333333334\r\n" + 
				"3.973500000000000\r\n" + 
				"3.985500000000000\r\n" + 
				"3.996000000000000\r\n" + 
				"4.009500000000000\r\n" + 
				"4.023500000000000\r\n" + 
				"4.039500000000000\r\n" + 
				"4.054000000000000\r\n" + 
				"4.065500000000000\r\n" + 
				"4.076250000000000\r\n" + 
				"4.086125000000001\r\n" + 
				"4.096857142857143\r\n" + 
				"4.107250000000000\r\n" + 
				"4.117400000000001\r\n" + 
				"4.128666666666667\r\n" + 
				"4.142666666666666\r\n" + 
				"4.162500000000000\r\n" + 
				"4.177000000000001\r\n" + 
				"4.208500000000001\r\n" + 
				"4.228000000000000\r\n" + 
				"4.245000000000000\r\n" + 
				"4.270000000000000\r\n" + 
				"4.284599999999999\r\n" + 
				"4.303000000000000\r\n" + 
				"4.348000000000000\r\n" + 
				"4.366200000000001\r\n" + 
				"4.387000000000001\r\n" + 
				"4.413000000000000\r\n" + 
				"4.427000000000001\r\n" + 
				"4.438500000000000\r\n" + 
				"4.459000000000001\r\n" + 
				"4.468000000000000\r\n" + 
				"4.487000000000000\r\n" + 
				"4.501500000000000\r\n" + 
				"4.511600000000000\r\n" + 
				"4.524750000000000\r\n" + 
				"4.542000000000000\r\n" + 
				"4.569250000000000\r\n" + 
				"4.586399999999999\r\n" + 
				"4.611750000000000\r\n" + 
				"4.624000000000000\r\n" + 
				"4.642000000000000\r\n" + 
				"4.658000000000000\r\n" + 
				"4.673666666666667\r\n" + 
				"4.686999999999999\r\n" + 
				"4.697000000000000\r\n" + 
				"4.719000000000000\r\n" + 
				"4.745500000000000\r\n" + 
				"4.763999999999999\r\n" + 
				"4.778000000000000\r\n" + 
				"4.816000000000000\r\n" + 
				"4.830500000000000\r\n" + 
				"4.844200000000000\r\n" + 
				"4.858000000000001\r\n" + 
				"4.875999999999999\r\n" + 
				"4.891250000000000\r\n" + 
				"4.902833333333334\r\n" + 
				"4.913500000000000\r\n" + 
				"4.931800000000000\r\n" + 
				"4.944375000000000\r\n" + 
				"4.956454545454546\r\n" + 
				"4.966500000000000\r\n" + 
				"4.976500000000000\r\n" + 
				"4.988166666666666\r\n" + 
				"4.998500000000000\r\n" + 
				"5.010500000000000\r\n" + 
				"5.025500000000000\r\n" + 
				"5.038076923076924\r\n" + 
				"5.052181818181818\r\n" + 
				"5.066500000000000\r\n" + 
				"5.076000000000000\r\n" + 
				"5.089900000000000\r\n" + 
				"5.103800000000001\r\n" + 
				"5.112833333333334\r\n" + 
				"5.125000000000000\r\n" + 
				"5.152749999999999\r\n" + 
				"5.169666666666666\r\n" + 
				"5.188428571428572\r\n" + 
				"5.204200000000000\r\n" + 
				"5.226142857142857\r\n" + 
				"5.244200000000000\r\n" + 
				"5.259000000000000\r\n" + 
				"5.282500000000000\r\n" + 
				"5.303714285714285\r\n" + 
				"5.327200000000000\r\n" + 
				"5.343500000000001\r\n" + 
				"5.356500000000001\r\n" + 
				"5.379000000000000\r\n" + 
				"5.390333333333333\r\n" + 
				"5.403500000000000\r\n" + 
				"5.420000000000000\r\n" + 
				"5.433600000000000\r\n" + 
				"5.449777777777777\r\n" + 
				"5.471000000000000\r\n" + 
				"5.488333333333333\r\n" + 
				"5.501833333333334\r\n" + 
				"5.525666666666666\r\n" + 
				"5.553666666666667\r\n" + 
				"5.582000000000001\r\n" + 
				"5.606249999999999\r\n" + 
				"5.631000000000000\r\n" + 
				"5.642000000000000\r\n" + 
				"5.659666666666666\r\n" + 
				"5.674333333333333\r\n" + 
				"5.690000000000000\r\n" + 
				"5.712333333333334\r\n" + 
				"5.739000000000000\r\n" + 
				"5.752000000000000\r\n" + 
				"5.761250000000000\r\n" + 
				"5.782500000000000\r\n" + 
				"5.800750000000001\r\n" + 
				"5.818000000000001\r\n" + 
				"5.839000000000000\r\n" + 
				"5.863833333333333\r\n" + 
				"5.882500000000000\r\n" + 
				"5.894749999999999\r\n" + 
				"5.902000000000000\r\n" + 
				"5.914000000000001\r\n" + 
				"5.923833333333334\r\n" + 
				"5.933300000000000\r\n" + 
				"5.944500000000000\r\n" + 
				"5.954500000000001\r\n" + 
				"5.965500000000001\r\n" + 
				"5.976500000000000\r\n" + 
				"5.988000000000000\r\n" + 
				"5.998500000000000\r\n" + 
				"6.009000000000000\r\n" + 
				"6.019499999999999\r\n" + 
				"6.031500000000001\r\n" + 
				"6.047500000000000\r\n" + 
				"6.059500000000000\r\n" + 
				"6.071500000000000\r\n" + 
				"6.084666666666667\r\n" + 
				"6.099857142857142\r\n" + 
				"6.110833333333333\r\n" + 
				"6.122200000000000\r\n" + 
				"6.132000000000000\r\n" + 
				"6.150666666666666\r\n" + 
				"6.167500000000000\r\n" + 
				"6.176833333333334\r\n" + 
				"6.191400000000000\r\n" + 
				"6.206333333333333\r\n" + 
				"6.224500000000000\r\n" + 
				"6.239200000000000\r\n" + 
				"6.254000000000000\r\n" + 
				"6.274000000000000\r\n" + 
				"6.284833333333334\r\n" + 
				"6.300333333333334\r\n" + 
				"6.319400000000000\r\n" + 
				"6.339500000000000\r\n" + 
				"6.358666666666667\r\n" + 
				"6.375499999999999\r\n" + 
				"6.389500000000000\r\n" + 
				"6.402000000000001\r\n" + 
				"6.417500000000000\r\n" + 
				"6.439666666666668\r\n" + 
				"6.455000000000000\r\n" + 
				"6.477333333333334\r\n" + 
				"6.497666666666667\r\n" + 
				"6.528800000000000\r\n" + 
				"6.553285714285713\r\n" + 
				"6.574750000000000\r\n" + 
				"6.594333333333334\r\n" + 
				"6.610750000000000\r\n" + 
				"6.628000000000000\r\n" + 
				"6.645000000000000\r\n" + 
				"6.660500000000001\r\n" + 
				"6.670200000000000\r\n" + 
				"6.692250000000000\r\n" + 
				"6.707000000000000\r\n" + 
				"6.721333333333334\r\n" + 
				"6.734000000000000\r\n" + 
				"6.752000000000000\r\n" + 
				"6.774250000000000\r\n" + 
				"6.787400000000000\r\n" + 
				"6.799750000000000\r\n" + 
				"6.813000000000001\r\n" + 
				"6.828500000000000\r\n" + 
				"6.848600000000000\r\n" + 
				"6.860500000000000\r\n" + 
				"6.880000000000000\r\n" + 
				"6.895333333333333\r\n" + 
				"6.909333333333334\r\n" + 
				"6.922166666666667\r\n" + 
				"6.933625000000000\r\n" + 
				"6.946777777777777\r\n" + 
				"6.959000000000000\r\n" + 
				"6.968999999999999\r\n" + 
				"6.980000000000000\r\n" + 
				"6.994500000000000\r\n" + 
				"7.010142857142858\r\n" + 
				"7.026000000000000\r\n" + 
				"7.041000000000001\r\n" + 
				"7.051000000000000\r\n" + 
				"7.061500000000000\r\n" + 
				"7.076700000000000\r\n" + 
				"7.091250000000001\r\n" + 
				"7.102833333333334\r\n" + 
				"7.114200000000001\r\n" + 
				"7.125000000000000\r\n" + 
				"7.139000000000000\r\n" + 
				"7.156333333333333\r\n" + 
				"7.174500000000000\r\n" + 
				"7.191000000000000\r\n" + 
				"7.213750000000000\r\n" + 
				"7.231285714285714\r\n" + 
				"7.247999999999999\r\n" + 
				"7.267249999999999\r\n" + 
				"7.283666666666666\r\n" + 
				"7.304500000000001\r\n" + 
				"7.329500000000000\r\n" + 
				"7.342666666666667\r\n" + 
				"7.356333333333335\r\n" + 
				"7.373666666666668\r\n" + 
				"7.390000000000000\r\n" + 
				"7.407000000000000\r\n" + 
				"7.420000000000000\r\n" + 
				"7.434500000000000\r\n" + 
				"7.450666666666667\r\n" + 
				"7.471799999999999\r\n" + 
				"7.488666666666667\r\n" + 
				"7.517499999999999\r\n" + 
				"7.538400000000000\r\n" + 
				"7.552666666666667\r\n" + 
				"7.565000000000000\r\n" + 
				"7.592333333333333\r\n" + 
				"7.617000000000000\r\n" + 
				"7.656333333333333\r\n" + 
				"7.684200000000000\r\n" + 
				"7.695666666666667\r\n" + 
				"7.714799999999999\r\n" + 
				"7.734999999999999\r\n" + 
				"7.752000000000000\r\n" + 
				"7.767500000000000\r\n" + 
				"7.796000000000000\r\n" + 
				"7.809000000000000\r\n" + 
				"7.821000000000001\r\n" + 
				"7.836666666666666\r\n" + 
				"7.849000000000000\r\n" + 
				"7.863400000000000\r\n" + 
				"7.878500000000002\r\n" + 
				"7.895500000000000\r\n" + 
				"7.910300000000001\r\n" + 
				"7.922666666666665\r\n" + 
				"7.932166666666667\r\n" + 
				"7.943333333333334\r\n" + 
				"7.956499999999998\r\n" + 
				"7.966500000000001\r\n" + 
				"7.976727272727273\r\n" + 
				"7.989500000000001\r\n" + 
				"8.001500000000000\r\n" + 
				"8.014500000000000\r\n" + 
				"8.025499999999999\r\n" + 
				"8.037000000000001\r\n" + 
				"8.050909090909091\r\n" + 
				"8.062500000000002\r\n" + 
				"8.072999999999999\r\n" + 
				"8.082500000000000\r\n" + 
				"8.092499999999999\r\n" + 
				"8.107666666666667\r\n" + 
				"8.120799999999999\r\n" + 
				"8.140000000000001\r\n" + 
				"8.154333333333334\r\n" + 
				"8.166000000000000\r\n" + 
				"8.179000000000000\r\n" + 
				"8.193000000000000\r\n" + 
				"8.204833333333333\r\n" + 
				"8.219333333333333\r\n" + 
				"8.252333333333333\r\n" + 
				"8.262400000000000\r\n" + 
				"8.274000000000001\r\n" + 
				"8.286500000000000\r\n" + 
				"8.315333333333333\r\n" + 
				"8.335400000000000\r\n" + 
				"8.346166666666667\r\n" + 
				"8.355666666666666\r\n" + 
				"8.371333333333334\r\n" + 
				"8.387750000000001\r\n" + 
				"8.398999999999999\r\n" + 
				"8.413000000000000\r\n" + 
				"8.432666666666664\r\n" + 
				"8.453666666666665\r\n" + 
				"8.473333333333333\r\n" + 
				"8.494000000000002\r\n" + 
				"8.511666666666667\r\n" + 
				"8.529000000000000\r\n" + 
				"8.543400000000000\r\n" + 
				"8.570000000000000\r\n" + 
				"8.597000000000000\r\n" + 
				"8.613000000000000\r\n" + 
				"8.630000000000001\r\n" + 
				"8.642599999999998\r\n" + 
				"8.657666666666668\r\n" + 
				"8.674999999999999\r\n" + 
				"8.688750000000001\r\n" + 
				"8.706333333333333\r\n" + 
				"8.717000000000001\r\n" + 
				"8.744000000000000\r\n" + 
				"8.757500000000000\r\n" + 
				"8.774750000000001\r\n" + 
				"8.785599999999999\r\n" + 
				"8.802000000000000\r\n" + 
				"8.817428571428572\r\n" + 
				"8.837333333333334\r\n" + 
				"8.859666666666668\r\n" + 
				"8.878333333333332\r\n" + 
				"8.891750000000000\r\n" + 
				"8.901666666666667\r\n" + 
				"8.913400000000001\r\n" + 
				"8.927375000000001\r\n" + 
				"8.939000000000000\r\n" + 
				"8.949499999999999\r\n" + 
				"8.960000000000001\r\n" + 
				"8.972999999999999\r\n" + 
				"8.985500000000000\r\n" + 
				"8.998000000000001\r\n" + 
				"9.012000000000001\r\n" + 
				"9.025499999999999\r\n" + 
				"9.036500000000000\r\n" + 
				"9.049285714285714\r\n" + 
				"9.058500000000000\r\n" + 
				"9.068000000000000\r\n" + 
				"9.081500000000000\r\n" + 
				"9.100000000000000\r\n" + 
				"9.116333333333333\r\n" + 
				"9.137333333333332\r\n" + 
				"9.155799999999999\r\n" + 
				"9.172250000000000\r\n" + 
				"9.181000000000001\r\n" + 
				"9.190750000000000\r\n" + 
				"9.208000000000000\r\n" + 
				"9.225333333333333\r\n" + 
				"9.235666666666667\r\n" + 
				"9.247666666666667\r\n" + 
				"9.260666666666666\r\n" + 
				"9.283500000000000\r\n" + 
				"9.300500000000000\r\n" + 
				"9.317599999999999\r\n" + 
				"9.331000000000000\r\n" + 
				"9.345500000000001\r\n" + 
				"9.358000000000001\r\n" + 
				"9.376333333333333\r\n" + 
				"9.390499999999999\r\n" + 
				"9.425333333333333\r\n" + 
				"9.454500000000000\r\n" + 
				"9.475999999999999\r\n" + 
				"9.489666666666667\r\n" + 
				"9.509666666666666\r\n" + 
				"9.529000000000000\r\n" + 
				"9.551666666666668\r\n" + 
				"9.567400000000001\r\n" + 
				"9.580000000000000\r\n" + 
				"9.606000000000000\r\n" + 
				"9.618000000000000\r\n" + 
				"9.632999999999999\r\n" + 
				"9.654399999999999\r\n" + 
				"9.676500000000001\r\n" + 
				"9.694000000000001\r\n" + 
				"9.716333333333333\r\n" + 
				"9.738000000000000\r\n" + 
				"9.754000000000000\r\n" + 
				"9.763500000000001\r\n" + 
				"9.773000000000000\r\n" + 
				"9.782250000000001\r\n" + 
				"9.818999999999999\r\n" + 
				"9.834999999999999\r\n" + 
				"9.850500000000000\r\n" + 
				"9.867666666666667\r\n" + 
				"9.879999999999999\r\n" + 
				"9.892000000000000\r\n" + 
				"9.903666666666666\r\n" + 
				"9.913571428571430\r\n" + 
				"9.923000000000000\r\n" + 
				"9.932142857142859\r\n" + 
				"9.945333333333332\r\n" + 
				"9.955666666666666\r\n" + 
				"9.968769230769230\r\n" + 
				"9.980500000000001\r\n" + 
				"9.992000000000001\r\n" + 
				"10.004000000000000\r\n" + 
				"10.017333333333333\r\n" + 
				"10.030500000000002\r\n" + 
				"10.041499999999999\r\n" + 
				"10.054000000000002\r\n" + 
				"10.069300000000002\r\n" + 
				"10.081222222222221\r\n" + 
				"10.097000000000001\r\n" + 
				"10.111750000000001\r\n" + 
				"10.130499999999998\r\n" + 
				"10.145500000000000\r\n" + 
				"10.165666666666667\r\n" + 
				"10.180000000000000\r\n" + 
				"10.194199999999999\r\n" + 
				"10.212999999999999\r\n" + 
				"10.231249999999999\r\n" + 
				"10.249000000000001\r\n" + 
				"10.269333333333334\r\n" + 
				"10.287999999999998\r\n" + 
				"10.312250000000001\r\n" + 
				"10.324749999999998\r\n" + 
				"10.344000000000001\r\n" + 
				"10.356333333333334\r\n" + 
				"10.366400000000001\r\n" + 
				"10.388000000000000\r\n" + 
				"10.405000000000001\r\n" + 
				"10.417500000000000\r\n" + 
				"10.433999999999999\r\n" + 
				"10.446000000000000\r\n" + 
				"10.462499999999999\r\n" + 
				"10.481333333333334\r\n" + 
				"10.490500000000001\r\n" + 
				"10.504333333333333\r\n" + 
				"10.518500000000000\r\n" + 
				"10.529199999999999\r\n" + 
				"10.540500000000000\r\n" + 
				"10.560333333333332\r\n" + 
				"10.576250000000000\r\n" + 
				"10.587333333333333\r\n" + 
				"10.601500000000000\r\n" + 
				"10.615000000000000\r\n" + 
				"10.630500000000001\r\n" + 
				"10.657500000000001\r\n" + 
				"10.679749999999999\r\n" + 
				"10.697666666666668\r\n" + 
				"10.707500000000001\r\n" + 
				"10.726333333333335\r\n" + 
				"10.750750000000000\r\n" + 
				"10.764333333333333\r\n" + 
				"10.779333333333332\r\n" + 
				"10.792000000000000\r\n" + 
				"10.808499999999999\r\n" + 
				"10.823250000000002\r\n" + 
				"10.836666666666666\r\n" + 
				"10.846200000000000\r\n" + 
				"10.855666666666666\r\n" + 
				"10.868000000000000\r\n" + 
				"10.888499999999999\r\n" + 
				"10.903000000000000\r\n" + 
				"10.914857142857143\r\n" + 
				"10.929000000000000\r\n" + 
				"10.937833333333336\r\n" + 
				"10.949900000000000\r\n" + 
				"10.963000000000001\r\n" + 
				"10.975000000000000\r\n" + 
				"10.985500000000002\r\n" + 
				"10.997583333333333\r\n" + 
				"11.009333333333334\r\n" + 
				"11.020999999999999\r\n" + 
				"11.033999999999999\r\n" + 
				"11.043999999999999\r\n" + 
				"11.052999999999999\r\n" + 
				"11.062500000000000\r\n" + 
				"11.073000000000000\r\n" + 
				"11.084000000000001\r\n" + 
				"11.095600000000001\r\n" + 
				"11.113333333333335\r\n" + 
				"11.127999999999998\r\n" + 
				"11.140333333333333\r\n" + 
				"11.155200000000001\r\n" + 
				"11.169499999999999\r\n" + 
				"11.190400000000000\r\n" + 
				"11.200500000000000\r\n" + 
				"11.209142857142856\r\n" + 
				"11.222999999999999\r\n" + 
				"11.234500000000001\r\n" + 
				"11.251333333333335\r\n" + 
				"11.260999999999999\r\n" + 
				"11.275999999999998\r\n" + 
				"11.299666666666667\r\n" + 
				"11.323666666666668\r\n" + 
				"11.338666666666667\r\n" + 
				"11.352750000000000\r\n" + 
				"11.370000000000001\r\n" + 
				"11.383500000000000\r\n" + 
				"11.417333333333334\r\n" + 
				"11.439333333333332\r\n" + 
				"11.457199999999998\r\n" + 
				"11.478249999999999\r\n" + 
				"11.493000000000000\r\n" + 
				"11.515000000000001\r\n" + 
				"11.527999999999999\r\n" + 
				"11.547666666666666\r\n" + 
				"11.568000000000000\r\n" + 
				"11.590333333333334\r\n" + 
				"11.606750000000002\r\n" + 
				"11.621500000000001\r\n" + 
				"11.635750000000000\r\n" + 
				"11.660750000000000\r\n" + 
				"11.670999999999999\r\n" + 
				"11.690000000000001\r\n" + 
				"11.706750000000000\r\n" + 
				"11.721250000000001\r\n" + 
				"11.737666666666668\r\n" + 
				"11.762333333333332\r\n" + 
				"11.773000000000000\r\n" + 
				"11.791750000000000\r\n" + 
				"11.810000000000000\r\n" + 
				"11.829000000000002\r\n" + 
				"11.848500000000001\r\n" + 
				"11.868800000000000\r\n" + 
				"11.878750000000000\r\n" + 
				"11.888500000000001\r\n" + 
				"11.901571428571430\r\n" + 
				"11.916333333333334\r\n" + 
				"11.928999999999998\r\n" + 
				"11.940200000000001\r\n" + 
				"11.952999999999999\r\n" + 
				"11.966000000000001\r\n" + 
				"11.978000000000002\r\n" + 
				"11.991071428571427\r\n" + 
				"12.004999999999999\r\n" + 
				"12.018000000000001\r\n" + 
				"12.032000000000002\r\n" + 
				"12.046500000000000\r\n" + 
				"12.060000000000000\r\n" + 
				"12.074833333333332\r\n" + 
				"12.085875000000000\r\n" + 
				"12.096857142857143\r\n" + 
				"12.110714285714286\r\n" + 
				"12.124499999999999\r\n" + 
				"12.143750000000001\r\n" + 
				"12.152142857142858\r\n" + 
				"12.173999999999999\r\n" + 
				"12.208400000000001\r\n" + 
				"12.229333333333335\r\n" + 
				"12.239000000000001\r\n" + 
				"12.253500000000001\r\n" + 
				"12.268000000000001\r\n" + 
				"12.286500000000000\r\n" + 
				"12.312333333333333\r\n" + 
				"12.326333333333332\r\n" + 
				"12.352750000000000\r\n" + 
				"12.366750000000001\r\n" + 
				"12.390000000000001\r\n" + 
				"12.411249999999999\r\n" + 
				"12.431500000000000\r\n" + 
				"12.445999999999998\r\n" + 
				"12.461666666666666\r\n" + 
				"12.482999999999999\r\n" + 
				"12.504333333333335\r\n" + 
				"12.527374999999999\r\n" + 
				"12.545500000000001\r\n" + 
				"12.558999999999999\r\n" + 
				"12.568999999999999\r\n" + 
				"12.593999999999999\r\n" + 
				"12.604250000000000\r\n" + 
				"12.618666666666668\r\n" + 
				"12.651999999999999\r\n" + 
				"12.665666666666667\r\n" + 
				"12.680200000000001\r\n" + 
				"12.697666666666668\r\n" + 
				"12.715333333333334\r\n" + 
				"12.733499999999999\r\n" + 
				"12.745000000000001\r\n" + 
				"12.756750000000000\r\n" + 
				"12.780249999999999\r\n" + 
				"12.788750000000000\r\n" + 
				"12.806500000000000\r\n" + 
				"12.823333333333332\r\n" + 
				"12.837800000000001\r\n" + 
				"12.849000000000000\r\n" + 
				"12.863333333333335\r\n" + 
				"12.878666666666666\r\n" + 
				"12.898249999999999\r\n" + 
				"12.911999999999999\r\n" + 
				"12.923124999999999\r\n" + 
				"12.936199999999999\r\n" + 
				"12.948250000000000\r\n" + 
				"12.958999999999998\r\n" + 
				"12.970444444444444\r\n" + 
				"12.983266666666669\r\n" + 
				"12.997999999999999\r\n" + 
				"13.009499999999999\r\n" + 
				"13.022499999999999\r\n" + 
				"13.038500000000001\r\n" + 
				"13.055846153846151\r\n" + 
				"13.066875000000001\r\n" + 
				"13.080000000000002\r\n" + 
				"13.095000000000001\r\n" + 
				"13.111000000000001\r\n" + 
				"13.121799999999999\r\n" + 
				"13.138999999999999\r\n" + 
				"13.153000000000000\r\n" + 
				"13.168000000000001\r\n" + 
				"13.185500000000001\r\n" + 
				"13.205333333333334\r\n" + 
				"13.244500000000000\r\n" + 
				"13.263800000000000\r\n" + 
				"13.284749999999999\r\n" + 
				"13.301000000000000\r\n" + 
				"13.319999999999999\r\n" + 
				"13.335500000000000\r\n" + 
				"13.352000000000000\r\n" + 
				"13.369000000000000\r\n" + 
				"13.381499999999999\r\n" + 
				"13.397333333333334\r\n" + 
				"13.414666666666667\r\n" + 
				"13.424999999999999\r\n" + 
				"13.440000000000000\r\n" + 
				"13.473500000000000\r\n" + 
				"13.488000000000000\r\n" + 
				"13.506499999999999\r\n" + 
				"13.526833333333334\r\n" + 
				"13.542999999999999\r\n" + 
				"13.567000000000000\r\n" + 
				"13.586333333333334\r\n" + 
				"13.603666666666667\r\n" + 
				"13.626600000000000\r\n" + 
				"13.648499999999999\r\n" + 
				"13.664500000000000\r\n" + 
				"13.683000000000000\r\n" + 
				"13.700500000000000\r\n" + 
				"13.717600000000001\r\n" + 
				"13.734142857142857\r\n" + 
				"13.760666666666665\r\n" + 
				"13.781000000000001\r\n" + 
				"13.803199999999999\r\n" + 
				"13.832500000000000\r\n" + 
				"13.848250000000000\r\n" + 
				"13.860666666666667\r\n" + 
				"13.876799999999999\r\n" + 
				"13.891399999999999\r\n" + 
				"13.918444444444445\r\n" + 
				"13.929999999999998\r\n" + 
				"13.939428571428573\r\n" + 
				"13.949500000000000\r\n" + 
				"13.959916666666665\r\n" + 
				"13.971142857142857\r\n" + 
				"13.981999999999999\r\n" + 
				"13.992875000000000\r\n" + 
				"14.004000000000001\r\n" + 
				"14.014500000000000\r\n" + 
				"14.028499999999999\r\n" + 
				"14.041499999999999\r\n" + 
				"14.053000000000001\r\n" + 
				"14.063999999999998\r\n" + 
				"14.074000000000000\r\n" + 
				"14.085142857142857\r\n" + 
				"14.095999999999998\r\n" + 
				"14.105000000000000\r\n" + 
				"14.116250000000001\r\n" + 
				"14.139000000000001\r\n" + 
				"14.149375000000001\r\n" + 
				"14.161999999999999\r\n" + 
				"14.172799999999999\r\n" + 
				"14.184500000000000\r\n" + 
				"14.209200000000001\r\n" + 
				"14.230000000000000\r\n" + 
				"14.254500000000000\r\n" + 
				"14.270499999999998\r\n" + 
				"14.290999999999999\r\n" + 
				"14.302999999999999\r\n" + 
				"14.320000000000000\r\n" + 
				"14.347999999999999\r\n" + 
				"14.362200000000001\r\n" + 
				"14.383500000000000\r\n" + 
				"14.401999999999999\r\n" + 
				"14.431666666666667\r\n" + 
				"14.447250000000000\r\n" + 
				"14.461000000000000\r\n" + 
				"14.475000000000000\r\n" + 
				"14.500000000000000\r\n" + 
				"14.516000000000000\r\n" + 
				"14.529000000000002\r\n" + 
				"14.549666666666667\r\n" + 
				"14.579666666666668\r\n" + 
				"14.596000000000000\r\n" + 
				"14.607999999999999\r\n" + 
				"14.627799999999999\r\n" + 
				"14.644000000000000\r\n" + 
				"14.654750000000000\r\n" + 
				"14.674999999999999\r\n" + 
				"14.697999999999999\r\n" + 
				"14.713399999999998\r\n" + 
				"14.733200000000000\r\n" + 
				"14.750000000000000\r\n" + 
				"14.770666666666665\r\n" + 
				"14.796500000000000\r\n" + 
				"14.821571428571430\r\n" + 
				"14.841999999999999\r\n" + 
				"14.858666666666666\r\n" + 
				"14.881000000000000\r\n" + 
				"14.891666666666666\r\n" + 
				"14.905625000000001\r\n" + 
				"14.921333333333333\r\n" + 
				"14.932499999999999\r\n" + 
				"14.941333333333333\r\n" + 
				"14.951333333333332\r\n" + 
				"14.961888888888890\r\n" + 
				"14.973090909090907\r\n" + 
				"14.985500000000002\r\n" + 
				"14.997500000000000\r\n" + 
				"15.012499999999999\r\n" + 
				"15.028499999999999\r\n" + 
				"15.044666666666668\r\n" + 
				"15.058909090909093\r\n" + 
				"15.069000000000001\r\n" + 
				"15.077800000000000\r\n" + 
				"15.089200000000000\r\n" + 
				"15.100166666666667\r\n" + 
				"15.117142857142857\r\n" + 
				"15.137000000000000\r\n" + 
				"15.152000000000001\r\n" + 
				"15.186000000000000\r\n" + 
				"15.202500000000001\r\n" + 
				"15.217000000000001\r\n" + 
				"15.250000000000000\r\n" + 
				"15.266249999999999\r\n" + 
				"15.283000000000001\r\n" + 
				"15.297000000000001\r\n" + 
				"15.308500000000000\r\n" + 
				"15.322000000000001\r\n" + 
				"15.335750000000001\r\n" + 
				"15.369999999999999\r\n" + 
				"15.385200000000001\r\n" + 
				"15.408199999999999\r\n" + 
				"15.423999999999999\r\n" + 
				"15.441666666666668\r\n" + 
				"15.455000000000000\r\n" + 
				"15.481500000000000\r\n" + 
				"15.500333333333332\r\n" + 
				"15.520000000000001\r\n" + 
				"15.532000000000000\r\n" + 
				"15.552000000000000\r\n" + 
				"15.564000000000000\r\n" + 
				"15.592666666666666\r\n" + 
				"15.609999999999999\r\n" + 
				"15.626500000000000\r\n" + 
				"15.641000000000000\r\n" + 
				"15.652000000000001\r\n" + 
				"15.675750000000001\r\n" + 
				"15.687999999999999\r\n" + 
				"15.700500000000000\r\n" + 
				"15.719999999999999\r\n" + 
				"15.732999999999999\r\n" + 
				"15.744333333333335\r\n" + 
				"15.760333333333334\r\n" + 
				"15.775000000000000\r\n" + 
				"15.789999999999999\r\n" + 
				"15.812250000000001\r\n" + 
				"15.835999999999999\r\n" + 
				"15.853875000000000\r\n" + 
				"15.875000000000000\r\n" + 
				"15.892799999999999\r\n" + 
				"15.911000000000001\r\n" + 
				"15.920285714285715\r\n" + 
				"15.936571428571428\r\n" + 
				"15.948333333333332\r\n" + 
				"15.961000000000002\r\n" + 
				"15.974000000000000\r\n" + 
				"15.987500000000001\r\n" + 
				"15.998999999999999\r\n" + 
				"16.008199999999999\r\n" + 
				"16.018500000000000\r\n" + 
				"16.028499999999998\r\n" + 
				"16.040499999999998\r\n" + 
				"16.053500000000000\r\n" + 
				"16.066000000000003\r\n" + 
				"16.076750000000001\r\n" + 
				"16.089111111111112\r\n" + 
				"16.101250000000000\r\n" + 
				"16.116999999999997\r\n" + 
				"16.138200000000001\r\n" + 
				"16.150749999999999\r\n" + 
				"16.174090909090911\r\n" + 
				"16.187571428571431\r\n" + 
				"16.205400000000004\r\n" + 
				"16.218499999999999\r\n" + 
				"16.237666666666669\r\n" + 
				"16.252333333333333\r\n" + 
				"16.275599999999997\r\n" + 
				"16.291499999999999\r\n" + 
				"16.301499999999997\r\n" + 
				"16.318999999999999\r\n" + 
				"16.337000000000000\r\n" + 
				"16.355499999999999\r\n" + 
				"16.373249999999999\r\n" + 
				"16.387000000000000\r\n" + 
				"16.400250000000000\r\n" + 
				"16.422999999999998\r\n" + 
				"16.457000000000001\r\n" + 
				"16.488599999999998\r\n" + 
				"16.503249999999998\r\n" + 
				"16.515249999999998\r\n" + 
				"16.530500000000000\r\n" + 
				"16.546600000000002\r\n" + 
				"16.560499999999998\r\n" + 
				"16.590999999999998\r\n" + 
				"16.602000000000000\r\n" + 
				"16.619000000000000\r\n" + 
				"16.635000000000002\r\n" + 
				"16.653500000000001\r\n" + 
				"16.674750000000000\r\n" + 
				"16.688000000000002\r\n" + 
				"16.701333333333334\r\n" + 
				"16.713749999999997\r\n" + 
				"16.733000000000001\r\n" + 
				"16.751500000000000\r\n" + 
				"16.761666666666667\r\n" + 
				"16.780000000000001\r\n" + 
				"16.799750000000000\r\n" + 
				"16.813000000000002\r\n" + 
				"16.829000000000001\r\n" + 
				"16.840333333333334\r\n" + 
				"16.856000000000002\r\n" + 
				"16.869000000000000\r\n" + 
				"16.880400000000002\r\n" + 
				"16.896000000000001\r\n" + 
				"16.910000000000000\r\n" + 
				"16.921333333333333\r\n" + 
				"16.933428571428571\r\n" + 
				"16.946000000000002\r\n" + 
				"16.956181818181815\r\n" + 
				"16.968250000000001\r\n" + 
				"16.982285714285716\r\n" + 
				"16.996500000000001\r\n" + 
				"17.008500000000002\r\n" + 
				"17.020000000000003\r\n" + 
				"17.028499999999998\r\n" + 
				"17.036999999999999\r\n" + 
				"17.049363636363637\r\n" + 
				"17.062999999999999\r\n" + 
				"17.073166666666669\r\n" + 
				"17.082714285714285\r\n" + 
				"17.095555555555553\r\n" + 
				"17.114374999999999\r\n" + 
				"17.128333333333334\r\n" + 
				"17.138500000000001\r\n" + 
				"17.148499999999999\r\n" + 
				"17.164666666666665\r\n" + 
				"17.200333333333333\r\n" + 
				"17.215999999999998\r\n" + 
				"17.233999999999998\r\n" + 
				"17.254999999999999\r\n" + 
				"17.278166666666667\r\n" + 
				"17.296166666666664\r\n" + 
				"17.314000000000000\r\n" + 
				"17.336500000000001\r\n" + 
				"17.349000000000000\r\n" + 
				"17.371749999999999\r\n" + 
				"17.385666666666669\r\n" + 
				"17.403999999999996\r\n" + 
				"17.416499999999999\r\n" + 
				"17.435333333333332\r\n" + 
				"17.451999999999998\r\n" + 
				"17.463999999999999\r\n" + 
				"17.474999999999998\r\n" + 
				"17.491166666666668\r\n" + 
				"17.500333333333334\r\n" + 
				"17.518000000000001\r\n" + 
				"17.540000000000003\r\n" + 
				"17.560800000000000\r\n" + 
				"17.573999999999998\r\n" + 
				"17.591500000000000\r\n" + 
				"17.602000000000000\r\n" + 
				"17.623166666666666\r\n" + 
				"17.638999999999999\r\n" + 
				"17.654499999999999\r\n" + 
				"17.666750000000000\r\n" + 
				"17.680333333333333\r\n" + 
				"17.696249999999999\r\n" + 
				"17.711750000000002\r\n" + 
				"17.741666666666667\r\n" + 
				"17.756599999999999\r\n" + 
				"17.780249999999999\r\n" + 
				"17.795666666666666\r\n" + 
				"17.816000000000003\r\n" + 
				"17.828499999999998\r\n" + 
				"17.841999999999999\r\n" + 
				"17.864874999999998\r\n" + 
				"17.884000000000000\r\n" + 
				"17.906749999999999\r\n" + 
				"17.920400000000001\r\n" + 
				"17.931833333333334\r\n" + 
				"17.941500000000001\r\n" + 
				"17.952999999999999\r\n" + 
				"17.964000000000002\r\n" + 
				"17.976000000000003\r\n" + 
				"17.988499999999998\r\n" + 
				"17.998999999999999\r\n" + 
				"18.008500000000002\r\n" + 
				"18.018500000000000\r\n" + 
				"18.028499999999998\r\n" + 
				"18.040499999999998\r\n" + 
				"18.050500000000000\r\n" + 
				"18.060500000000001\r\n" + 
				"18.072500000000002\r\n" + 
				"18.084099999999999\r\n" + 
				"18.104166666666668\r\n" + 
				"18.114999999999998\r\n" + 
				"18.132999999999999\r\n" + 
				"18.145000000000000\r\n" + 
				"18.159199999999998\r\n" + 
				"18.173500000000001\r\n" + 
				"18.186666666666667\r\n" + 
				"18.198999999999998\r\n" + 
				"18.216500000000000\r\n" + 
				"18.231999999999999\r\n" + 
				"18.243500000000001\r\n" + 
				"18.265000000000001\r\n" + 
				"18.286500000000000\r\n" + 
				"18.311000000000000\r\n" + 
				"18.325333333333333\r\n" + 
				"18.351750000000003\r\n" + 
				"18.368000000000002\r\n" + 
				"18.396166666666669\r\n" + 
				"18.410666666666668\r\n" + 
				"18.438666666666666\r\n" + 
				"18.463999999999999\r\n" + 
				"18.479333333333333\r\n" + 
				"18.497999999999998\r\n" + 
				"18.523000000000000\r\n" + 
				"18.542000000000002\r\n" + 
				"18.555333333333333\r\n" + 
				"18.568500000000000\r\n" + 
				"18.594750000000001\r\n" + 
				"18.619666666666664\r\n" + 
				"18.635500000000000\r\n" + 
				"18.646999999999998\r\n" + 
				"18.670000000000002\r\n" + 
				"18.685714285714283\r\n" + 
				"18.713000000000001\r\n" + 
				"18.733000000000001\r\n" + 
				"18.750666666666664\r\n" + 
				"18.769500000000001\r\n" + 
				"18.779666666666667\r\n" + 
				"18.795000000000002\r\n" + 
				"18.806666666666668\r\n" + 
				"18.819000000000003\r\n" + 
				"18.838333333333335\r\n" + 
				"18.849333333333334\r\n" + 
				"18.861499999999999\r\n" + 
				"18.872666666666664\r\n" + 
				"18.885000000000002\r\n" + 
				"18.897749999999998\r\n" + 
				"18.919750000000001\r\n" + 
				"18.934799999999999\r\n" + 
				"18.949166666666667\r\n" + 
				"18.962999999999997\r\n" + 
				"18.974000000000000\r\n" + 
				"18.986000000000001\r\n" + 
				"18.996500000000001\r\n" + 
				"19.005500000000001\r\n" + 
				"19.014500000000002\r\n" + 
				"19.026499999999999\r\n" + 
				"19.041999999999998\r\n" + 
				"19.053500000000000\r\n" + 
				"19.063200000000002\r\n" + 
				"19.073000000000000\r\n" + 
				"19.089000000000002\r\n" + 
				"19.101199999999999\r\n" + 
				"19.112500000000001\r\n" + 
				"19.131333333333334\r\n" + 
				"19.152000000000001\r\n" + 
				"19.162500000000001\r\n" + 
				"19.179500000000001\r\n" + 
				"19.195000000000000\r\n" + 
				"19.207999999999998\r\n" + 
				"19.222000000000001\r\n" + 
				"19.239500000000000\r\n" + 
				"19.253000000000000\r\n" + 
				"19.271249999999998\r\n" + 
				"19.285499999999999\r\n" + 
				"19.323333333333334\r\n" + 
				"19.339333333333332\r\n" + 
				"19.356600000000000\r\n" + 
				"19.370999999999999\r\n" + 
				"19.385500000000000\r\n" + 
				"19.399000000000001\r\n" + 
				"19.414714285714290\r\n" + 
				"19.433000000000000\r\n" + 
				"19.450571428571429\r\n" + 
				"19.478750000000002\r\n" + 
				"19.498500000000000\r\n" + 
				"19.514749999999999\r\n" + 
				"19.530000000000001\r\n" + 
				"19.547999999999998\r\n" + 
				"19.568000000000001\r\n" + 
				"19.579499999999999\r\n" + 
				"19.596666666666668\r\n" + 
				"19.610250000000001\r\n" + 
				"19.649249999999999\r\n" + 
				"19.663399999999999\r\n" + 
				"19.684199999999997\r\n" + 
				"19.701999999999998\r\n" + 
				"19.714333333333332\r\n" + 
				"19.734571428571428\r\n" + 
				"19.745999999999999\r\n" + 
				"19.759999999999998\r\n" + 
				"19.778200000000002\r\n" + 
				"19.801333333333332\r\n" + 
				"19.832500000000000\r\n" + 
				"19.852666666666668\r\n" + 
				"19.866000000000000\r\n" + 
				"19.877666666666666\r\n" + 
				"19.894749999999998\r\n" + 
				"19.910100000000000\r\n" + 
				"19.924285714285713\r\n" + 
				"19.934166666666666\r\n" + 
				"19.948699999999999\r\n" + 
				"19.962499999999999\r\n" + 
				"19.974499999999999\r\n" + 
				"19.989000000000001\r\n" + 
				"20.003000000000000\r\n" + 
				"20.011500000000002\r\n" + 
				"20.020000000000003\r\n" + 
				"20.031500000000001\r\n" + 
				"20.042999999999999\r\n" + 
				"20.055000000000003\r\n" + 
				"20.066000000000003\r\n" + 
				"20.080499999999997\r\n" + 
				"20.091999999999999\r\n" + 
				"20.106000000000002\r\n" + 
				"20.119000000000003\r\n" + 
				"20.133444444444443\r\n" + 
				"20.149000000000001\r\n" + 
				"20.158500000000000\r\n" + 
				"20.176666666666666\r\n" + 
				"20.192399999999999\r\n" + 
				"20.209800000000001\r\n" + 
				"20.236666666666665\r\n" + 
				"20.247000000000000\r\n" + 
				"20.274000000000001\r\n" + 
				"20.289999999999999\r\n" + 
				"20.309600000000000\r\n" + 
				"20.333600000000001\r\n" + 
				"20.354500000000002\r\n" + 
				"20.373500000000000\r\n" + 
				"20.388249999999999\r\n" + 
				"20.410000000000000\r\n" + 
				"20.421999999999997\r\n" + 
				"20.434000000000005\r\n" + 
				"20.452666666666669\r\n" + 
				"20.469999999999999\r\n" + 
				"20.483000000000001\r\n" + 
				"20.497666666666667\r\n" + 
				"20.511250000000004\r\n" + 
				"20.527999999999999\r\n" + 
				"20.543999999999997\r\n" + 
				"20.594750000000001\r\n" + 
				"20.608000000000001\r\n" + 
				"20.625000000000000\r\n" + 
				"20.639749999999999\r\n" + 
				"20.657000000000000\r\n" + 
				"20.668333333333333\r\n" + 
				"20.685714285714283\r\n" + 
				"20.699000000000002\r\n" + 
				"20.726833333333335\r\n" + 
				"20.748000000000001\r\n" + 
				"20.760500000000000\r\n" + 
				"20.778800000000000\r\n" + 
				"20.797000000000001\r\n" + 
				"20.814499999999999\r\n" + 
				"20.829000000000001\r\n" + 
				"20.838999999999999\r\n" + 
				"20.854666666666667\r\n" + 
				"20.873000000000001\r\n" + 
				"20.890499999999999\r\n" + 
				"20.906000000000002\r\n" + 
				"20.918333333333333\r\n" + 
				"20.927600000000002\r\n" + 
				"20.938999999999997\r\n" + 
				"20.954500000000003\r\n" + 
				"20.965222222222224\r\n" + 
				"20.976700000000001\r\n" + 
				"20.988249999999997\r\n" + 
				"21.000500000000002\r\n" + 
				"21.011500000000002\r\n" + 
				"21.020499999999998\r\n" + 
				"21.029499999999999\r\n" + 
				"21.041499999999999\r\n" + 
				"21.055500000000002\r\n" + 
				"21.070500000000003\r\n" + 
				"21.082875000000001\r\n" + 
				"21.095142857142857\r\n" + 
				"21.106000000000002\r\n" + 
				"21.117166666666666\r\n" + 
				"21.131000000000000\r\n" + 
				"21.153333333333332\r\n" + 
				"21.171749999999999\r\n" + 
				"21.188749999999999\r\n" + 
				"21.197199999999999\r\n" + 
				"21.206666666666667\r\n" + 
				"21.224499999999999\r\n" + 
				"21.233333333333334\r\n" + 
				"21.251400000000000\r\n" + 
				"21.273666666666667\r\n" + 
				"21.296000000000003\r\n" + 
				"21.308799999999998\r\n" + 
				"21.327833333333334\r\n" + 
				"21.354833333333332\r\n" + 
				"21.371333333333336\r\n" + 
				"21.390000000000001\r\n" + 
				"21.407499999999999\r\n" + 
				"21.436000000000000\r\n" + 
				"21.452000000000002\r\n" + 
				"21.475000000000001\r\n" + 
				"21.492999999999999\r\n" + 
				"21.510999999999999\r\n" + 
				"21.533500000000004\r\n" + 
				"21.566500000000001\r\n" + 
				"21.577333333333332\r\n" + 
				"21.600250000000003\r\n" + 
				"21.628250000000001\r\n" + 
				"21.652333333333331\r\n" + 
				"21.668249999999997\r\n" + 
				"21.683666666666667\r\n" + 
				"21.702000000000002\r\n" + 
				"21.723666666666670\r\n" + 
				"21.752000000000002\r\n" + 
				"21.774999999999995\r\n" + 
				"21.786166666666663\r\n" + 
				"21.805500000000002\r\n" + 
				"21.818000000000001\r\n" + 
				"21.840666666666667\r\n" + 
				"21.856999999999999\r\n" + 
				"21.876499999999997\r\n" + 
				"21.893444444444444\r\n" + 
				"21.910000000000000\r\n" + 
				"21.921199999999999\r\n" + 
				"21.935499999999998\r\n" + 
				"21.946999999999999\r\n" + 
				"21.959714285714288\r\n" + 
				"21.969999999999999\r\n" + 
				"21.979500000000002\r\n" + 
				"21.991000000000000\r\n" + 
				"22.002454545454547\r\n" + 
				"22.014000000000003\r\n" + 
				"22.025499999999997\r\n" + 
				"22.037499999999998\r\n" + 
				"22.049499999999998\r\n" + 
				"22.061499999999999\r\n" + 
				"22.074166666666667\r\n" + 
				"22.084111111111110\r\n" + 
				"22.095500000000001\r\n" + 
				"22.104142857142858\r\n" + 
				"22.117500000000000\r\n" + 
				"22.127250000000000\r\n" + 
				"22.153000000000002\r\n" + 
				"22.166250000000002\r\n" + 
				"22.177999999999997\r\n" + 
				"22.195999999999998\r\n" + 
				"22.215000000000000\r\n" + 
				"22.244666666666664\r\n" + 
				"22.257999999999999\r\n" + 
				"22.271999999999998\r\n" + 
				"22.282333333333337\r\n" + 
				"22.300000000000001\r\n" + 
				"22.318000000000001\r\n" + 
				"22.335999999999999\r\n" + 
				"22.364249999999998\r\n" + 
				"22.381200000000000\r\n" + 
				"22.398666666666667\r\n" + 
				"22.417250000000003\r\n" + 
				"22.454999999999998\r\n" + 
				"22.474000000000000\r\n" + 
				"22.488199999999999\r\n" + 
				"22.502500000000001\r\n" + 
				"22.523750000000000\r\n" + 
				"22.538999999999998\r\n" + 
				"22.553999999999998\r\n" + 
				"22.588800000000003\r\n" + 
				"22.601500000000001\r\n" + 
				"22.615499999999997\r\n" + 
				"22.634333333333331\r\n" + 
				"22.655500000000000\r\n" + 
				"22.667000000000002\r\n" + 
				"22.683000000000000\r\n" + 
				"22.696666666666669\r\n" + 
				"22.707000000000001\r\n" + 
				"22.719000000000001\r\n" + 
				"22.736599999999999\r\n" + 
				"22.756000000000000\r\n" + 
				"22.772500000000001\r\n" + 
				"22.790250000000000\r\n" + 
				"22.805333333333333\r\n" + 
				"22.829666666666668\r\n" + 
				"22.841999999999999\r\n" + 
				"22.858750000000001\r\n" + 
				"22.888500000000001\r\n" + 
				"22.896399999999996\r\n" + 
				"22.913666666666668\r\n" + 
				"22.925500000000000\r\n" + 
				"22.937400000000004\r\n" + 
				"22.951454545454546\r\n" + 
				"22.965818181818179\r\n" + 
				"22.977500000000003\r\n" + 
				"22.990454545454547\r\n" + 
				"23.003000000000000\r\n" + 
				"23.016272727272728\r\n" + 
				"23.028000000000002\r\n" + 
				"23.038625000000000\r\n" + 
				"23.048500000000001\r\n" + 
				"23.057000000000002\r\n" + 
				"23.067333333333337\r\n" + 
				"23.077700000000004\r\n" + 
				"23.089444444444446\r\n" + 
				"23.100600000000000\r\n" + 
				"23.111800000000002\r\n" + 
				"23.123600000000000\r\n" + 
				"23.139599999999998\r\n" + 
				"23.161666666666665\r\n" + 
				"23.174499999999998\r\n" + 
				"23.186500000000002\r\n" + 
				"23.199500000000000\r\n" + 
				"23.223666666666663\r\n" + 
				"23.236599999999999\r\n" + 
				"23.259000000000000\r\n" + 
				"23.295333333333332\r\n" + 
				"23.312999999999999\r\n" + 
				"23.323500000000003\r\n" + 
				"23.334999999999997\r\n" + 
				"23.353666666666669\r\n" + 
				"23.368714285714283\r\n" + 
				"23.384499999999999\r\n" + 
				"23.398499999999999\r\n" + 
				"23.429000000000002\r\n" + 
				"23.445000000000000\r\n" + 
				"23.456333333333333\r\n" + 
				"23.481800000000000\r\n" + 
				"23.514499999999998\r\n" + 
				"23.530999999999999\r\n" + 
				"23.547499999999999\r\n" + 
				"23.564333333333334\r\n" + 
				"23.590333333333334\r\n" + 
				"23.619749999999996\r\n" + 
				"23.642599999999998\r\n" + 
				"23.659199999999998\r\n" + 
				"23.676499999999997\r\n" + 
				"23.689250000000001\r\n" + 
				"23.701999999999998\r\n" + 
				"23.723333333333333\r\n" + 
				"23.733000000000001\r\n" + 
				"23.764499999999998\r\n" + 
				"23.782333333333337\r\n" + 
				"23.792000000000002\r\n" + 
				"23.816199999999998\r\n" + 
				"23.832500000000000\r\n" + 
				"23.844999999999999\r\n" + 
				"23.859333333333336\r\n" + 
				"23.875333333333334\r\n" + 
				"23.894166666666667\r\n" + 
				"23.911500000000004\r\n" + 
				"23.931000000000001\r\n" + 
				"23.942999999999998\r\n" + 
				"23.952499999999997\r\n" + 
				"23.962499999999999\r\n" + 
				"23.975888888888889\r\n" + 
				"23.986000000000001\r\n" + 
				"23.996500000000001\r\n" + 
				"24.008500000000002\r\n" + 
				"24.021500000000003\r\n" + 
				"24.033600000000000\r\n" + 
				"24.048500000000001\r\n" + 
				"24.060500000000001\r\n" + 
				"24.071777777777775\r\n" + 
				"24.085999999999999\r\n" + 
				"24.102285714285710\r\n" + 
				"24.114750000000001\r\n" + 
				"24.125999999999998\r\n" + 
				"24.139333333333337\r\n" + 
				"24.150500000000001\r\n" + 
				"24.165666666666667\r\n" + 
				"24.183999999999997\r\n" + 
				"24.209666666666667\r\n" + 
				"24.227499999999999\r\n" + 
				"24.242999999999999\r\n" + 
				"24.260999999999999\r\n" + 
				"24.286749999999998\r\n" + 
				"24.299500000000002\r\n" + 
				"24.325333333333333\r\n" + 
				"24.340000000000000\r\n" + 
				"24.351749999999999\r\n" + 
				"24.378142857142855\r\n" + 
				"24.397399999999998\r\n" + 
				"24.411000000000001\r\n" + 
				"24.423333333333332\r\n" + 
				"24.453499999999998\r\n" + 
				"24.485500000000002\r\n" + 
				"24.498000000000001\r\n" + 
				"24.512999999999998\r\n" + 
				"24.529000000000000\r\n" + 
				"24.540250000000000\r\n" + 
				"24.560499999999998\r\n" + 
				"24.577000000000002\r\n" + 
				"24.591666666666669\r\n" + 
				"24.608499999999999\r\n" + 
				"24.622000000000000\r\n" + 
				"24.652799999999999\r\n" + 
				"24.669799999999999\r\n" + 
				"24.701333333333334\r\n" + 
				"24.719000000000001\r\n" + 
				"24.732500000000002\r\n" + 
				"24.744399999999999\r\n" + 
				"24.759000000000000\r\n" + 
				"24.781250000000000\r\n" + 
				"24.803000000000001\r\n" + 
				"24.825200000000002\r\n" + 
				"24.843000000000000\r\n" + 
				"24.855400000000003\r\n" + 
				"24.867999999999999\r\n" + 
				"24.888000000000002\r\n" + 
				"24.900500000000001\r\n" + 
				"24.910499999999999\r\n" + 
				"24.919800000000002\r\n" + 
				"24.930000000000000\r\n" + 
				"24.937875000000002\r\n" + 
				"24.949571428571428\r\n" + 
				"24.959000000000003\r\n" + 
				"24.968499999999999\r\n" + 
				"24.979545454545452\r\n" + 
				"24.989500000000003\r\n" + 
				"24.999499999999998\r\n" + 
				"25.009875000000005\r\n" + 
				"25.018000000000001\r\n" + 
				"25.028499999999998\r\n" + 
				"25.040499999999998\r\n" + 
				"25.050500000000000\r\n" + 
				"25.060545454545455\r\n" + 
				"25.070875000000001\r\n" + 
				"25.085111111111111\r\n" + 
				"25.103666666666665\r\n" + 
				"25.117600000000003\r\n" + 
				"25.129400000000000\r\n" + 
				"25.142599999999998\r\n" + 
				"25.152666666666665\r\n" + 
				"25.169000000000000\r\n" + 
				"25.180666666666667\r\n" + 
				"25.204333333333334\r\n" + 
				"25.221000000000000\r\n" + 
				"25.245000000000001\r\n" + 
				"25.265000000000001\r\n" + 
				"25.277000000000001\r\n" + 
				"25.295000000000002\r\n" + 
				"25.313250000000000\r\n" + 
				"25.339857142857145\r\n" + 
				"25.353999999999999\r\n" + 
				"25.365000000000002\r\n" + 
				"25.385500000000000\r\n" + 
				"25.402000000000001\r\n" + 
				"25.415399999999998\r\n" + 
				"25.433599999999998\r\n" + 
				"25.454999999999998\r\n" + 
				"25.467333333333332\r\n" + 
				"25.486250000000002\r\n" + 
				"25.505333333333329\r\n" + 
				"25.519500000000001\r\n" + 
				"25.534333333333333\r\n" + 
				"25.555000000000000\r\n" + 
				"25.597999999999999\r\n" + 
				"25.616500000000002\r\n" + 
				"25.630000000000003\r\n" + 
				"25.644499999999997\r\n" + 
				"25.662500000000001\r\n" + 
				"25.674999999999997\r\n" + 
				"25.691333333333336\r\n" + 
				"25.716199999999997\r\n" + 
				"25.730750000000000\r\n" + 
				"25.744666666666664\r\n" + 
				"25.773333333333330\r\n" + 
				"25.800000000000001\r\n" + 
				"25.815500000000000\r\n" + 
				"25.831000000000000\r\n" + 
				"25.847666666666669\r\n" + 
				"25.863000000000000\r\n" + 
				"25.877799999999997\r\n" + 
				"25.895499999999998\r\n" + 
				"25.910666666666668\r\n" + 
				"25.928300000000000\r\n" + 
				"25.944727272727274\r\n" + 
				"25.959999999999997\r\n" + 
				"25.974000000000004\r\n" + 
				"25.986500000000003\r\n" + 
				"25.998857142857140\r\n" + 
				"26.008500000000002\r\n" + 
				"26.018500000000000\r\n" + 
				"26.028499999999998\r\n" + 
				"26.040499999999998\r\n" + 
				"26.051700000000000\r\n" + 
				"26.061000000000000\r\n" + 
				"26.071499999999997\r\n" + 
				"26.084500000000002\r\n" + 
				"26.094111111111115\r\n" + 
				"26.106454545454543\r\n" + 
				"26.125333333333334\r\n" + 
				"26.138499999999997\r\n" + 
				"26.153666666666666\r\n" + 
				"26.166000000000000\r\n" + 
				"26.184500000000000\r\n" + 
				"26.193666666666669\r\n" + 
				"26.207500000000003\r\n" + 
				"26.231999999999999\r\n" + 
				"26.261000000000003\r\n" + 
				"26.275333333333332\r\n" + 
				"26.301500000000001\r\n" + 
				"26.332000000000001\r\n" + 
				"26.346249999999998\r\n" + 
				"26.361999999999998\r\n" + 
				"26.376000000000001\r\n" + 
				"26.394714285714283\r\n" + 
				"26.410800000000002\r\n" + 
				"26.448399999999999\r\n" + 
				"26.469000000000001\r\n" + 
				"26.478999999999999\r\n" + 
				"26.490000000000002\r\n" + 
				"26.509333333333334\r\n" + 
				"26.518666666666665\r\n" + 
				"26.529666666666667\r\n" + 
				"26.548000000000002\r\n" + 
				"26.567799999999998\r\n" + 
				"26.592500000000001\r\n" + 
				"26.605000000000000\r\n" + 
				"26.624000000000002\r\n" + 
				"26.653000000000002\r\n" + 
				"26.671500000000002\r\n" + 
				"26.681666666666668\r\n" + 
				"26.707200000000000\r\n" + 
				"26.724800000000005\r\n" + 
				"26.754200000000004\r\n" + 
				"26.766600000000000\r\n" + 
				"26.781333333333333\r\n" + 
				"26.792000000000002\r\n" + 
				"26.810333333333332\r\n" + 
				"26.826166666666666\r\n" + 
				"26.838999999999999\r\n" + 
				"26.855249999999998\r\n" + 
				"26.868833333333331\r\n" + 
				"26.879666666666665\r\n" + 
				"26.890000000000001\r\n" + 
				"26.901166666666668\r\n" + 
				"26.913714285714288\r\n" + 
				"26.925750000000001\r\n" + 
				"26.937333333333331\r\n" + 
				"26.949142857142864\r\n" + 
				"26.957499999999996\r\n" + 
				"26.968000000000000\r\n" + 
				"26.978111111111108\r\n" + 
				"26.989500000000003\r\n" + 
				"26.998699999999996\r\n" + 
				"27.010000000000002\r\n" + 
				"27.018500000000000\r\n" + 
				"27.028499999999998\r\n" + 
				"27.040499999999998\r\n" + 
				"27.050500000000000\r\n" + 
				"27.061545454545453\r\n" + 
				"27.073499999999999\r\n" + 
				"27.083500000000001\r\n" + 
				"27.091777777777779\r\n" + 
				"27.102285714285710\r\n" + 
				"27.111499999999996\r\n" + 
				"27.132428571428573\r\n" + 
				"27.151000000000003\r\n" + 
				"27.167999999999999\r\n" + 
				"27.184500000000000\r\n" + 
				"27.195999999999998\r\n" + 
				"27.210999999999999\r\n" + 
				"27.220500000000001\r\n" + 
				"27.231000000000005\r\n" + 
				"27.246000000000002\r\n" + 
				"27.257000000000001\r\n" + 
				"27.269500000000001\r\n" + 
				"27.286000000000001\r\n" + 
				"27.298999999999999\r\n" + 
				"27.311399999999999\r\n" + 
				"27.324999999999999\r\n" + 
				"27.337250000000001\r\n" + 
				"27.359999999999999\r\n" + 
				"27.372333333333334\r\n" + 
				"27.385666666666665\r\n" + 
				"27.402999999999999\r\n" + 
				"27.415500000000002\r\n" + 
				"27.432200000000002\r\n" + 
				"27.440000000000001\r\n" + 
				"27.454999999999998\r\n" + 
				"27.477399999999999\r\n" + 
				"27.494000000000000\r\n" + 
				"27.517800000000001\r\n" + 
				"27.539999999999999\r\n" + 
				"27.564500000000002\r\n" + 
				"27.581666666666667\r\n" + 
				"27.614749999999997\r\n" + 
				"27.628333333333334\r\n" + 
				"27.641249999999999\r\n" + 
				"27.657499999999999\r\n" + 
				"27.672000000000001\r\n" + 
				"27.693999999999999\r\n" + 
				"27.709666666666667\r\n" + 
				"27.724499999999999\r\n" + 
				"27.742666666666665\r\n" + 
				"27.759500000000003\r\n" + 
				"27.773499999999999\r\n" + 
				"27.789800000000003\r\n" + 
				"27.805500000000002\r\n" + 
				"27.819000000000003\r\n" + 
				"27.834000000000000\r\n" + 
				"27.843166666666665\r\n" + 
				"27.865000000000002\r\n" + 
				"27.878000000000000\r\n" + 
				"27.890666666666664\r\n" + 
				"27.906333333333333\r\n" + 
				"27.916499999999999\r\n" + 
				"27.927000000000003\r\n" + 
				"27.936000000000000\r\n" + 
				"27.949400000000004\r\n" + 
				"27.959272727272729\r\n" + 
				"27.971500000000002\r\n" + 
				"27.979500000000002\r\n" + 
				"27.988499999999998\r\n" + 
				"27.999499999999998\r\n" + 
				"28.009875000000001\r\n" + 
				"28.018500000000000\r\n" + 
				"28.028499999999998\r\n" + 
				"28.040499999999998\r\n" + 
				"28.052000000000000\r\n" + 
				"28.060500000000001\r\n" + 
				"28.068999999999999\r\n" + 
				"28.078833333333336\r\n" + 
				"28.090999999999998\r\n" + 
				"28.103571428571428\r\n" + 
				"28.113499999999998\r\n" + 
				"28.125200000000000\r\n" + 
				"28.134666666666664\r\n" + 
				"28.147000000000002\r\n" + 
				"28.159250000000000\r\n" + 
				"28.172000000000001\r\n" + 
				"28.189999999999998\r\n" + 
				"28.203499999999998\r\n" + 
				"28.219666666666665\r\n" + 
				"28.228500000000000\r\n" + 
				"28.244000000000000\r\n" + 
				"28.260749999999998\r\n" + 
				"28.279599999999999\r\n" + 
				"28.291399999999999\r\n" + 
				"28.308000000000000\r\n" + 
				"28.320399999999996\r\n" + 
				"28.329999999999998\r\n" + 
				"28.359666666666669\r\n" + 
				"28.371500000000001\r\n" + 
				"28.387000000000000\r\n" + 
				"28.402000000000001\r\n" + 
				"28.413999999999998\r\n" + 
				"28.429000000000002\r\n" + 
				"28.440000000000001\r\n" + 
				"28.460000000000001\r\n" + 
				"28.477999999999998\r\n" + 
				"28.501999999999999\r\n" + 
				"28.514000000000003\r\n" + 
				"28.526499999999999\r\n" + 
				"28.536999999999999\r\n" + 
				"28.554000000000002\r\n" + 
				"28.587750000000000\r\n" + 
				"28.608999999999998\r\n" + 
				"28.650333333333332\r\n" + 
				"28.672000000000001\r\n" + 
				"28.692500000000003\r\n" + 
				"28.704999999999998\r\n" + 
				"28.722000000000001\r\n" + 
				"28.733999999999998\r\n" + 
				"28.743500000000001\r\n" + 
				"28.759000000000000\r\n" + 
				"28.770500000000002\r\n" + 
				"28.793999999999997\r\n" + 
				"28.806500000000000\r\n" + 
				"28.825166666666664\r\n" + 
				"28.839400000000001\r\n" + 
				"28.847999999999999\r\n" + 
				"28.862800000000000\r\n" + 
				"28.875999999999998\r\n" + 
				"28.890499999999999\r\n" + 
				"28.901499999999999\r\n" + 
				"28.915285714285716\r\n" + 
				"28.929375000000000\r\n" + 
				"28.944181818181814\r\n" + 
				"28.961090909090903\r\n" + 
				"28.974444444444444\r\n" + 
				"28.987142857142857\r\n" + 
				"28.998999999999999\r\n" + 
				"29.008499999999998\r\n" + 
				"29.019799999999996\r\n" + 
				"29.028499999999998\r\n" + 
				"29.036999999999999\r\n" + 
				"29.047499999999999\r\n" + 
				"29.057818181818178\r\n" + 
				"29.070000000000004\r\n" + 
				"29.078749999999999\r\n" + 
				"29.088999999999999\r\n" + 
				"29.101500000000001\r\n" + 
				"29.117333333333335\r\n" + 
				"29.136250000000000\r\n" + 
				"29.146000000000001\r\n" + 
				"29.163800000000002\r\n" + 
				"29.180333333333333\r\n" + 
				"29.201000000000001\r\n" + 
				"29.214599999999997\r\n" + 
				"29.237000000000002\r\n" + 
				"29.250666666666671\r\n" + 
				"29.264499999999998\r\n" + 
				"29.277999999999999\r\n" + 
				"29.293500000000002\r\n" + 
				"29.317000000000000\r\n" + 
				"29.340000000000000\r\n" + 
				"29.351999999999997\r\n" + 
				"29.373500000000000\r\n" + 
				"29.390000000000001\r\n" + 
				"29.402749999999997\r\n" + 
				"29.421500000000002\r\n" + 
				"29.433999999999997\r\n" + 
				"29.454999999999998\r\n" + 
				"29.470500000000001\r\n" + 
				"29.500000000000000\r\n" + 
				"29.516333333333336\r\n" + 
				"29.529250000000001\r\n" + 
				"29.547999999999998\r\n" + 
				"29.564000000000000\r\n" + 
				"29.585999999999999\r\n" + 
				"29.599400000000003\r\n" + 
				"29.616000000000000\r\n" + 
				"29.632500000000000\r\n" + 
				"29.646666666666665\r\n" + 
				"29.660333333333330\r\n" + 
				"29.674666666666667\r\n" + 
				"29.685000000000002\r\n" + 
				"29.694600000000001\r\n" + 
				"29.703749999999999\r\n" + 
				"29.719999999999999\r\n" + 
				"29.735833333333336\r\n" + 
				"29.761666666666667\r\n" + 
				"29.778399999999998\r\n" + 
				"29.798333333333336\r\n" + 
				"29.826200000000000\r\n" + 
				"29.838400000000000\r\n" + 
				"29.847250000000003\r\n" + 
				"29.859600000000000\r\n" + 
				"29.875000000000000\r\n" + 
				"29.889749999999996\r\n" + 
				"29.906833333333338\r\n" + 
				"29.926111111111108\r\n" + 
				"29.940833333333334\r\n" + 
				"29.953272727272726\r\n" + 
				"29.963999999999999\r\n" + 
				"29.973500000000001\r\n" + 
				"29.985000000000003\r\n" + 
				"29.996499999999997\r\n" + 
				"30.008499999999998\r\n" + 
				"30.018500000000000\r\n" + 
				"30.028500000000005\r\n" + 
				"30.040500000000005\r\n" + 
				"30.052000000000000\r\n" + 
				"30.060500000000001\r\n" + 
				"30.069000000000003\r\n" + 
				"30.079428571428572\r\n" + 
				"30.091555555555558\r\n" + 
				"30.105624999999996\r\n" + 
				"30.119142857142858\r\n" + 
				"30.136333333333337\r\n" + 
				"30.147750000000002\r\n" + 
				"30.158249999999999\r\n" + 
				"30.174500000000002\r\n" + 
				"30.186000000000000\r\n" + 
				"30.200400000000002\r\n" + 
				"30.214500000000001\r\n" + 
				"30.233666666666664\r\n" + 
				"30.245666666666665\r\n" + 
				"30.277999999999999\r\n" + 
				"30.295000000000002\r\n" + 
				"30.315166666666666\r\n" + 
				"30.328749999999999\r\n" + 
				"30.337999999999997\r\n" + 
				"30.350666666666669\r\n" + 
				"30.369333333333334\r\n" + 
				"30.389499999999998\r\n" + 
				"30.413000000000000\r\n" + 
				"30.425666666666668\r\n" + 
				"30.437000000000001\r\n" + 
				"30.451333333333338\r\n" + 
				"30.460333333333335\r\n" + 
				"30.495000000000001\r\n" + 
				"30.525400000000001\r\n" + 
				"30.555000000000000\r\n" + 
				"30.570500000000003\r\n" + 
				"30.594999999999999\r\n" + 
				"30.619000000000000\r\n" + 
				"30.630749999999999\r\n" + 
				"30.649333333333335\r\n" + 
				"30.670999999999999\r\n" + 
				"30.686000000000000\r\n" + 
				"30.698000000000004\r\n" + 
				"30.712249999999997\r\n" + 
				"30.725749999999998\r\n" + 
				"30.736999999999998\r\n" + 
				"30.753499999999999\r\n" + 
				"30.768000000000001\r\n" + 
				"30.785499999999999\r\n" + 
				"30.800000000000001\r\n" + 
				"30.819750000000003\r\n" + 
				"30.832000000000001\r\n" + 
				"30.845500000000001\r\n" + 
				"30.858000000000001\r\n" + 
				"30.873333333333335\r\n" + 
				"30.889499999999998\r\n" + 
				"30.908250000000002\r\n" + 
				"30.921250000000001\r\n" + 
				"30.935000000000002\r\n" + 
				"30.945099999999996\r\n" + 
				"30.956500000000002\r\n" + 
				"30.966500000000003\r\n" + 
				"30.976454545454544\r\n" + 
				"30.986500000000003\r\n" + 
				"30.996499999999997\r\n" + 
				"31.008499999999998\r\n" + 
				"31.020000000000003\r\n" + 
				"31.030500000000000\r\n" + 
				"31.039999999999999\r\n" + 
				"31.052000000000000\r\n" + 
				"31.062500000000000\r\n" + 
				"31.071428571428573\r\n" + 
				"31.081666666666667\r\n" + 
				"31.098999999999997\r\n" + 
				"31.109999999999999\r\n" + 
				"31.120624999999997\r\n" + 
				"31.134499999999999\r\n" + 
				"31.149199999999997\r\n" + 
				"31.168399999999998\r\n" + 
				"31.180250000000001\r\n" + 
				"31.205750000000002\r\n" + 
				"31.221000000000000\r\n" + 
				"31.239500000000000\r\n" + 
				"31.259000000000000\r\n" + 
				"31.282000000000000\r\n" + 
				"31.295499999999997\r\n" + 
				"31.308250000000001\r\n" + 
				"31.326999999999998\r\n" + 
				"31.345400000000001\r\n" + 
				"31.358666666666668\r\n" + 
				"31.371666666666670\r\n" + 
				"31.390000000000001\r\n" + 
				"31.411799999999999\r\n" + 
				"31.434000000000001\r\n" + 
				"31.459249999999997\r\n" + 
				"31.477000000000004\r\n" + 
				"31.494999999999997\r\n" + 
				"31.514666666666667\r\n" + 
				"31.545500000000001\r\n" + 
				"31.562999999999999\r\n" + 
				"31.579499999999999\r\n" + 
				"31.610333333333330\r\n" + 
				"31.677000000000003\r\n" + 
				"31.686666666666667\r\n" + 
				"31.701000000000001\r\n" + 
				"31.717666666666663\r\n" + 
				"31.729000000000003\r\n" + 
				"31.739250000000002\r\n" + 
				"31.751500000000004\r\n" + 
				"31.764199999999999\r\n" + 
				"31.778666666666666\r\n" + 
				"31.790500000000002\r\n" + 
				"31.816857142857142\r\n" + 
				"31.836666666666662\r\n" + 
				"31.854999999999997\r\n" + 
				"31.872000000000000\r\n" + 
				"31.884500000000003\r\n" + 
				"31.894333333333332\r\n" + 
				"31.908500000000000\r\n" + 
				"31.918500000000002\r\n" + 
				"31.930000000000000\r\n" + 
				"31.941833333333332\r\n" + 
				"31.954615384615384\r\n" + 
				"31.967500000000001\r\n" + 
				"31.979500000000002\r\n" + 
				"31.991499999999998\r\n" + 
				"32.005500000000005\r\n" + 
				"32.017499999999998\r\n" + 
				"32.027999999999999\r\n" + 
				"32.040999999999997\r\n" + 
				"32.053500000000000\r\n" + 
				"32.064333333333337\r\n" + 
				"32.074833333333338\r\n" + 
				"32.084500000000006\r\n" + 
				"32.094555555555559\r\n" + 
				"32.109499999999997\r\n" + 
				"32.123999999999995\r\n" + 
				"32.137833333333333\r\n" + 
				"32.156571428571432\r\n" + 
				"32.175375000000003\r\n" + 
				"32.193249999999999\r\n" + 
				"32.212000000000003\r\n" + 
				"32.224000000000004\r\n" + 
				"32.236000000000004\r\n" + 
				"32.248399999999997\r\n" + 
				"32.260999999999996\r\n" + 
				"32.274000000000001\r\n" + 
				"32.292500000000004\r\n" + 
				"32.305000000000000\r\n" + 
				"32.323999999999998\r\n" + 
				"32.344666666666662\r\n" + 
				"32.375399999999999\r\n" + 
				"32.387666666666668\r\n" + 
				"32.399500000000003\r\n" + 
				"32.414500000000004\r\n" + 
				"32.434333333333335\r\n" + 
				"32.460750000000004\r\n" + 
				"32.475333333333332\r\n" + 
				"32.495249999999999\r\n" + 
				"32.508499999999998\r\n" + 
				"32.524000000000001\r\n" + 
				"32.540749999999996\r\n" + 
				"32.558333333333330\r\n" + 
				"32.570666666666668\r\n" + 
				"32.580000000000005\r\n" + 
				"32.600000000000001\r\n" + 
				"32.617500000000000\r\n" + 
				"32.633499999999998\r\n" + 
				"32.663666666666664\r\n" + 
				"32.688333333333333\r\n" + 
				"32.704666666666668\r\n" + 
				"32.714000000000006\r\n" + 
				"32.733000000000004\r\n" + 
				"32.746000000000002\r\n" + 
				"32.756000000000000\r\n" + 
				"32.771000000000001\r\n" + 
				"32.786999999999999\r\n" + 
				"32.806500000000000\r\n" + 
				"32.822857142857146\r\n" + 
				"32.835625000000007\r\n" + 
				"32.852333333333334\r\n" + 
				"32.868000000000002\r\n" + 
				"32.878250000000001\r\n" + 
				"32.887999999999998\r\n" + 
				"32.901499999999999\r\n" + 
				"32.914249999999996\r\n" + 
				"32.926333333333332\r\n" + 
				"32.934199999999997\r\n" + 
				"32.943285714285715\r\n" + 
				"32.954500000000003\r\n" + 
				"32.964500000000008\r\n" + 
				"32.975000000000001\r\n" + 
				"32.989500000000000\r\n" + 
				"33.001500000000000\r\n" + 
				"33.012000000000000\r\n" + 
				"33.022500000000001\r\n" + 
				"33.033499999999997\r\n" + 
				"33.044000000000004\r\n" + 
				"33.056500000000000\r\n" + 
				"33.068000000000005\r\n" + 
				"33.079999999999998\r\n" + 
				"33.094300000000004\r\n" + 
				"33.105333333333334\r\n" + 
				"33.117000000000004\r\n" + 
				"33.124833333333335\r\n" + 
				"33.137599999999999\r\n" + 
				"33.151499999999999\r\n" + 
				"33.174500000000002\r\n" + 
				"33.191833333333335\r\n" + 
				"33.213999999999999\r\n" + 
				"33.236000000000004\r\n" + 
				"33.256999999999998\r\n" + 
				"33.271000000000001\r\n" + 
				"33.295000000000002\r\n" + 
				"33.314999999999998\r\n" + 
				"33.334500000000006\r\n" + 
				"33.347000000000001\r\n" + 
				"33.360500000000002\r\n" + 
				"33.372000000000000\r\n" + 
				"33.398199999999996\r\n" + 
				"33.417999999999999\r\n" + 
				"33.439499999999995\r\n" + 
				"33.459000000000003\r\n" + 
				"33.474999999999994\r\n" + 
				"33.500000000000000\r\n" + 
				"33.528499999999994\r\n" + 
				"33.550333333333334\r\n" + 
				"33.570750000000004\r\n" + 
				"33.590000000000003\r\n" + 
				"33.601500000000001\r\n" + 
				"33.624499999999998\r\n" + 
				"33.641000000000005\r\n" + 
				"33.655999999999999\r\n" + 
				"33.676800000000000\r\n" + 
				"33.689000000000000\r\n" + 
				"33.700249999999997\r\n" + 
				"33.714250000000007\r\n" + 
				"33.740250000000003\r\n" + 
				"33.756999999999998\r\n" + 
				"33.775000000000006\r\n" + 
				"33.793750000000003\r\n" + 
				"33.820599999999999\r\n" + 
				"33.846333333333334\r\n" + 
				"33.859999999999999\r\n" + 
				"33.870333333333328\r\n" + 
				"33.882333333333328\r\n" + 
				"33.891333333333336\r\n" + 
				"33.902000000000008\r\n" + 
				"33.926272727272725\r\n" + 
				"33.944454545454541\r\n" + 
				"33.960599999999999\r\n" + 
				"33.973124999999996\r\n" + 
				"33.983499999999999\r\n" + 
				"33.995500000000000\r\n" + 
				"34.007500000000000\r\n" + 
				"34.019000000000005\r\n" + 
				"34.032000000000004\r\n" + 
				"34.044000000000004\r\n" + 
				"34.053500000000007\r\n" + 
				"34.062999999999995\r\n" + 
				"34.071500000000007\r\n" + 
				"34.079111111111111\r\n" + 
				"34.089250000000007\r\n" + 
				"34.100384615384613\r\n" + 
				"34.114000000000004\r\n" + 
				"34.125000000000000\r\n" + 
				"34.135999999999996\r\n" + 
				"34.148750000000000\r\n" + 
				"34.161999999999999\r\n" + 
				"34.181249999999999\r\n" + 
				"34.192599999999999\r\n" + 
				"34.209000000000003\r\n" + 
				"34.221000000000004\r\n" + 
				"34.236333333333334\r\n" + 
				"34.248500000000000\r\n" + 
				"34.260999999999996\r\n" + 
				"34.283999999999999\r\n" + 
				"34.311999999999998\r\n" + 
				"34.339666666666666\r\n" + 
				"34.357666666666667\r\n" + 
				"34.376750000000001\r\n" + 
				"34.395000000000003\r\n" + 
				"34.414000000000001\r\n" + 
				"34.429000000000002\r\n" + 
				"34.442000000000000\r\n" + 
				"34.470333333333336\r\n" + 
				"34.492999999999995\r\n" + 
				"34.508166666666668\r\n" + 
				"34.531750000000002\r\n" + 
				"34.546833333333332\r\n" + 
				"34.581666666666671\r\n" + 
				"34.600333333333339\r\n" + 
				"34.619666666666660\r\n" + 
				"34.633499999999998\r\n" + 
				"34.649999999999999\r\n" + 
				"34.663499999999999\r\n" + 
				"34.680000000000000\r\n" + 
				"34.695000000000000\r\n" + 
				"34.709000000000003\r\n" + 
				"34.728714285714290\r\n" + 
				"34.748500000000000\r\n" + 
				"34.765200000000007\r\n" + 
				"34.780600000000000\r\n" + 
				"34.809750000000001\r\n" + 
				"34.824750000000002\r\n" + 
				"34.839399999999998\r\n" + 
				"34.849999999999994\r\n" + 
				"34.859749999999998\r\n" + 
				"34.881571428571434\r\n" + 
				"34.896000000000001\r\n" + 
				"34.906400000000005\r\n" + 
				"34.917499999999997\r\n" + 
				"34.932444444444442\r\n" + 
				"34.943833333333338\r\n" + 
				"34.955999999999996\r\n" + 
				"34.966444444444441\r\n" + 
				"34.979444444444439\r\n" + 
				"34.991500000000002\r\n" + 
				"35.003124999999997\r\n" + 
				"35.013000000000005\r\n" + 
				"35.024000000000001\r\n" + 
				"35.034999999999997\r\n" + 
				"35.046500000000002\r\n" + 
				"35.058500000000002\r\n" + 
				"35.073538461538462\r\n" + 
				"35.086200000000005\r\n" + 
				"35.098400000000005\r\n" + 
				"35.109200000000001\r\n" + 
				"35.124857142857145\r\n" + 
				"35.139199999999995\r\n" + 
				"35.152000000000001\r\n" + 
				"35.168999999999997\r\n" + 
				"35.186000000000000\r\n" + 
				"35.211000000000006\r\n" + 
				"35.226250000000007\r\n" + 
				"35.238999999999997\r\n" + 
				"35.254999999999995\r\n" + 
				"35.268666666666668\r\n" + 
				"35.285333333333334\r\n" + 
				"35.295500000000004\r\n" + 
				"35.312500000000000\r\n" + 
				"35.322000000000003\r\n" + 
				"35.342166666666664\r\n" + 
				"35.363749999999996\r\n" + 
				"35.375000000000000\r\n" + 
				"35.390999999999998\r\n" + 
				"35.401000000000003\r\n" + 
				"35.416999999999994\r\n" + 
				"35.433500000000002\r\n" + 
				"35.448000000000000\r\n" + 
				"35.458500000000001\r\n" + 
				"35.484999999999999\r\n" + 
				"35.506600000000006\r\n" + 
				"35.525500000000001\r\n" + 
				"35.547000000000004\r\n" + 
				"35.567000000000000\r\n" + 
				"35.587499999999999\r\n" + 
				"35.609750000000005\r\n" + 
				"35.642000000000003\r\n" + 
				"35.667500000000004\r\n" + 
				"35.683500000000002\r\n" + 
				"35.698800000000006\r\n" + 
				"35.714200000000005\r\n" + 
				"35.742666666666672\r\n" + 
				"35.762250000000002\r\n" + 
				"35.784500000000001\r\n" + 
				"35.794200000000004\r\n" + 
				"35.831249999999997\r\n" + 
				"35.843000000000004\r\n" + 
				"35.856499999999997\r\n" + 
				"35.871333333333332\r\n" + 
				"35.888666666666666\r\n" + 
				"35.897750000000002\r\n" + 
				"35.908250000000002\r\n" + 
				"35.932000000000002\r\n" + 
				"35.942428571428572\r\n" + 
				"35.952500000000001\r\n" + 
				"35.964500000000001\r\n" + 
				"35.975000000000001\r\n" + 
				"35.983428571428568\r\n" + 
				"35.995083333333334\r\n" + 
				"36.007500000000000\r\n" + 
				"36.019500000000001\r\n" + 
				"36.033999999999999\r\n" + 
				"36.047499999999992\r\n" + 
				"36.058999999999997\r\n" + 
				"36.069499999999998\r\n" + 
				"36.078499999999998\r\n" + 
				"36.088000000000001\r\n" + 
				"36.101250000000000\r\n" + 
				"36.115833333333335\r\n" + 
				"36.126333333333335\r\n" + 
				"36.135500000000000\r\n" + 
				"36.145833333333336\r\n" + 
				"36.158749999999998\r\n" + 
				"36.183333333333330\r\n" + 
				"36.199250000000006\r\n" + 
				"36.213400000000000\r\n" + 
				"36.238500000000002\r\n" + 
				"36.252000000000002\r\n" + 
				"36.283333333333331\r\n" + 
				"36.303500000000000\r\n" + 
				"36.326500000000003\r\n" + 
				"36.346750000000000\r\n" + 
				"36.385199999999998\r\n" + 
				"36.410600000000002\r\n" + 
				"36.424499999999995\r\n" + 
				"36.450399999999995\r\n" + 
				"36.469999999999999\r\n" + 
				"36.490666666666669\r\n" + 
				"36.511250000000004\r\n" + 
				"36.534999999999997\r\n" + 
				"36.549999999999997\r\n" + 
				"36.563500000000005\r\n" + 
				"36.585000000000001\r\n" + 
				"36.615000000000002\r\n" + 
				"36.628250000000001\r\n" + 
				"36.640000000000001\r\n" + 
				"36.656999999999996\r\n" + 
				"36.673333333333332\r\n" + 
				"36.682400000000001\r\n" + 
				"36.693999999999996\r\n" + 
				"36.714599999999997\r\n" + 
				"36.733499999999999\r\n" + 
				"36.745333333333328\r\n" + 
				"36.758000000000003\r\n" + 
				"36.780500000000004\r\n" + 
				"36.797399999999996\r\n" + 
				"36.806333333333335\r\n" + 
				"36.822500000000005\r\n" + 
				"36.846142857142851\r\n" + 
				"36.859000000000002\r\n" + 
				"36.872166666666665\r\n" + 
				"36.881749999999997\r\n" + 
				"36.889800000000001\r\n" + 
				"36.907499999999999\r\n" + 
				"36.928857142857147\r\n" + 
				"36.946272727272728\r\n" + 
				"36.961636363636373\r\n" + 
				"36.973500000000001\r\n" + 
				"36.984000000000002\r\n" + 
				"36.995500000000000\r\n" + 
				"37.007500000000000\r\n" + 
				"37.021500000000003\r\n" + 
				"37.033999999999999\r\n" + 
				"37.044499999999999\r\n" + 
				"37.055999999999997\r\n" + 
				"37.068500000000000\r\n" + 
				"37.080500000000001\r\n" + 
				"37.095666666666666\r\n" + 
				"37.112000000000002\r\n" + 
				"37.126500000000000\r\n" + 
				"37.141500000000001\r\n" + 
				"37.151000000000003\r\n" + 
				"37.167666666666662\r\n" + 
				"37.185000000000002\r\n" + 
				"37.210000000000001\r\n" + 
				"37.233333333333327\r\n" + 
				"37.247250000000001\r\n" + 
				"37.267499999999998\r\n" + 
				"37.285000000000004\r\n" + 
				"37.293799999999997\r\n" + 
				"37.311499999999995\r\n" + 
				"37.332000000000001\r\n" + 
				"37.350333333333332\r\n" + 
				"37.367333333333335\r\n" + 
				"37.381000000000000\r\n" + 
				"37.396000000000001\r\n" + 
				"37.423333333333325\r\n" + 
				"37.439499999999995\r\n" + 
				"37.453249999999997\r\n" + 
				"37.480333333333334\r\n" + 
				"37.492000000000004\r\n" + 
				"37.519000000000005\r\n" + 
				"37.532000000000004\r\n" + 
				"37.546499999999995\r\n" + 
				"37.563000000000002\r\n" + 
				"37.574749999999995\r\n" + 
				"37.606000000000002\r\n" + 
				"37.622000000000000\r\n" + 
				"37.652500000000003\r\n" + 
				"37.670999999999999\r\n" + 
				"37.686400000000006\r\n" + 
				"37.701000000000001\r\n" + 
				"37.721166666666669\r\n" + 
				"37.736833333333330\r\n" + 
				"37.756333333333338\r\n" + 
				"37.775750000000002\r\n" + 
				"37.787799999999997\r\n" + 
				"37.799666666666667\r\n" + 
				"37.812500000000000\r\n" + 
				"37.826400000000000\r\n" + 
				"37.845666666666666\r\n" + 
				"37.861999999999995\r\n" + 
				"37.875249999999994\r\n" + 
				"37.893000000000001\r\n" + 
				"37.901750000000000\r\n" + 
				"37.917000000000002\r\n" + 
				"37.929199999999994\r\n" + 
				"37.941166666666668\r\n" + 
				"37.952500000000001\r\n" + 
				"37.967461538461535\r\n" + 
				"37.980499999999999\r\n" + 
				"37.992500000000000\r\n" + 
				"38.001500000000000\r\n" + 
				"38.010500000000000\r\n" + 
				"38.022500000000001\r\n" + 
				"38.034999999999997\r\n" + 
				"38.048583333333333\r\n" + 
				"38.062999999999995\r\n" + 
				"38.071500000000007\r\n" + 
				"38.080500000000001\r\n" + 
				"38.095538461538460\r\n" + 
				"38.107749999999996\r\n" + 
				"38.118666666666662\r\n" + 
				"38.131666666666675\r\n" + 
				"38.154399999999995\r\n" + 
				"38.166166666666662\r\n" + 
				"38.180333333333330\r\n" + 
				"38.194000000000003\r\n" + 
				"38.222249999999995\r\n" + 
				"38.238000000000000\r\n" + 
				"38.251333333333328\r\n" + 
				"38.268000000000001\r\n" + 
				"38.283999999999999\r\n" + 
				"38.297749999999994\r\n" + 
				"38.316500000000005\r\n" + 
				"38.337500000000006\r\n" + 
				"38.353666666666662\r\n" + 
				"38.369499999999995\r\n" + 
				"38.381000000000000\r\n" + 
				"38.399666666666668\r\n" + 
				"38.414000000000001\r\n" + 
				"38.427000000000000\r\n" + 
				"38.436999999999998\r\n" + 
				"38.446666666666665\r\n" + 
				"38.460999999999999\r\n" + 
				"38.479250000000000\r\n" + 
				"38.497250000000001\r\n" + 
				"38.521000000000001\r\n" + 
				"38.529666666666664\r\n" + 
				"38.546666666666660\r\n" + 
				"38.564000000000000\r\n" + 
				"38.582999999999998\r\n" + 
				"38.605666666666671\r\n" + 
				"38.615333333333332\r\n" + 
				"38.636000000000003\r\n" + 
				"38.657499999999999\r\n" + 
				"38.670000000000002\r\n" + 
				"38.682666666666670\r\n" + 
				"38.694600000000001\r\n" + 
				"38.710000000000001\r\n" + 
				"38.738833333333339\r\n" + 
				"38.760333333333335\r\n" + 
				"38.783333333333339\r\n" + 
				"38.801000000000002\r\n" + 
				"38.820000000000000\r\n" + 
				"38.830750000000002\r\n" + 
				"38.852999999999994\r\n" + 
				"38.868499999999997\r\n" + 
				"38.885666666666673\r\n" + 
				"38.899333333333338\r\n" + 
				"38.917600000000000\r\n" + 
				"38.932166666666667\r\n" + 
				"38.941000000000003\r\n" + 
				"38.950500000000005\r\n" + 
				"38.962000000000003\r\n" + 
				"38.973124999999996\r\n" + 
				"38.981500000000004\r\n" + 
				"38.994000000000007\r\n" + 
				"39.007500000000000\r\n" + 
				"39.018499999999996\r\n" + 
				"39.027499999999996\r\n" + 
				"39.040692307692311\r\n" + 
				"39.053000000000004\r\n" + 
				"39.062833333333337\r\n" + 
				"39.074000000000005\r\n" + 
				"39.085142857142856\r\n" + 
				"39.094833333333334\r\n" + 
				"39.104666666666667\r\n" + 
				"39.113999999999997\r\n" + 
				"39.127142857142857\r\n" + 
				"39.140999999999998\r\n" + 
				"39.158333333333339\r\n" + 
				"39.178200000000004\r\n" + 
				"39.195750000000004\r\n" + 
				"39.217666666666666\r\n" + 
				"39.236800000000002\r\n" + 
				"39.257666666666665\r\n" + 
				"39.276400000000002\r\n" + 
				"39.286999999999999\r\n" + 
				"39.296333333333330\r\n" + 
				"39.314000000000007\r\n" + 
				"39.330714285714279\r\n" + 
				"39.348999999999997\r\n" + 
				"39.365499999999997\r\n" + 
				"39.381200000000000\r\n" + 
				"39.397000000000006\r\n" + 
				"39.417000000000002\r\n" + 
				"39.439499999999995\r\n" + 
				"39.457000000000001\r\n" + 
				"39.471500000000006\r\n" + 
				"39.489000000000004\r\n" + 
				"39.503999999999998\r\n" + 
				"39.513500000000001\r\n" + 
				"39.522333333333336\r\n" + 
				"39.547399999999996\r\n" + 
				"39.560000000000002\r\n" + 
				"39.573999999999998\r\n" + 
				"39.588999999999999\r\n" + 
				"39.605571428571423\r\n" + 
				"39.638000000000005\r\n" + 
				"39.664333333333332\r\n" + 
				"39.687499999999993\r\n" + 
				"39.698333333333331\r\n" + 
				"39.721999999999994\r\n" + 
				"39.739166666666669\r\n" + 
				"39.759000000000000\r\n" + 
				"39.788799999999995\r\n" + 
				"39.807666666666663\r\n" + 
				"39.825800000000001\r\n" + 
				"39.846750000000000\r\n" + 
				"39.859000000000002\r\n" + 
				"39.889400000000002\r\n" + 
				"39.905124999999998\r\n" + 
				"39.922571428571423\r\n" + 
				"39.934000000000005\r\n" + 
				"39.943777777777782\r\n" + 
				"39.956428571428582\r\n" + 
				"39.970299999999995\r\n" + 
				"39.985769230769236\r\n" + 
				"39.998500000000000\r\n" + 
				"40.009666666666675\r\n" + 
				"40.022500000000001\r\n" + 
				"40.034999999999997\r\n" + 
				"40.047500000000007\r\n" + 
				"40.059499999999993\r\n" + 
				"40.070499999999996\r\n" + 
				"40.082000000000001\r\n" + 
				"40.093500000000006\r\n" + 
				"40.109000000000002\r\n" + 
				"40.118499999999997\r\n" + 
				"40.136857142857146\r\n" + 
				"40.148666666666664\r\n" + 
				"40.159199999999998\r\n" + 
				"40.172499999999999\r\n" + 
				"40.186000000000000\r\n" + 
				"40.203400000000002\r\n" + 
				"40.220500000000001\r\n" + 
				"40.230000000000004\r\n" + 
				"40.249499999999998\r\n" + 
				"40.268500000000003\r\n" + 
				"40.286333333333324\r\n" + 
				"40.312333333333335\r\n" + 
				"40.336500000000001\r\n" + 
				"40.350250000000003\r\n" + 
				"40.373750000000001\r\n" + 
				"40.387000000000000\r\n" + 
				"40.399666666666661\r\n" + 
				"40.424333333333330\r\n" + 
				"40.444500000000005\r\n" + 
				"40.460500000000003\r\n" + 
				"40.488500000000002\r\n" + 
				"40.498666666666672\r\n" + 
				"40.511749999999999\r\n" + 
				"40.522500000000001\r\n" + 
				"40.539600000000000\r\n" + 
				"40.573999999999998\r\n" + 
				"40.588499999999996\r\n" + 
				"40.608499999999999\r\n" + 
				"40.622500000000002\r\n" + 
				"40.639499999999998\r\n" + 
				"40.655333333333338\r\n" + 
				"40.669499999999999\r\n" + 
				"40.691666666666663\r\n" + 
				"40.719000000000001\r\n" + 
				"40.735750000000003\r\n" + 
				"40.750000000000000\r\n" + 
				"40.763666666666666\r\n" + 
				"40.774000000000001\r\n" + 
				"40.789333333333332\r\n" + 
				"40.803166666666662\r\n" + 
				"40.816800000000001\r\n" + 
				"40.833500000000001\r\n" + 
				"40.850166666666659\r\n" + 
				"40.865000000000002\r\n" + 
				"40.882249999999999\r\n" + 
				"40.898285714285713\r\n" + 
				"40.908749999999998\r\n" + 
				"40.922000000000004\r\n" + 
				"40.935600000000001\r\n" + 
				"40.946333333333335\r\n" + 
				"40.958555555555556\r\n" + 
				"40.968000000000004\r\n" + 
				"40.980000000000004\r\n" + 
				"40.991999999999997\r\n" + 
				"41.004500000000000\r\n" + 
				"41.015500000000003\r\n" + 
				"41.028500000000008\r\n" + 
				"41.041499999999999\r\n" + 
				"41.053000000000004\r\n" + 
				"41.064000000000000\r\n" + 
				"41.073833333333333\r\n" + 
				"41.083000000000006\r\n" + 
				"41.092916666666667\r\n" + 
				"41.109300000000005\r\n" + 
				"41.123500000000000\r\n" + 
				"41.133600000000001\r\n" + 
				"41.147599999999997\r\n" + 
				"41.166333333333334\r\n" + 
				"41.188800000000001\r\n" + 
				"41.204999999999998\r\n" + 
				"41.219000000000001\r\n" + 
				"41.238250000000001\r\n" + 
				"41.258333333333333\r\n" + 
				"41.301000000000002\r\n" + 
				"41.335000000000001\r\n" + 
				"41.347999999999999\r\n" + 
				"41.367500000000000\r\n" + 
				"41.380333333333333\r\n" + 
				"41.393000000000001\r\n" + 
				"41.404200000000003\r\n" + 
				"41.426000000000002\r\n" + 
				"41.439000000000000\r\n" + 
				"41.460799999999999\r\n" + 
				"41.484999999999999\r\n" + 
				"41.499333333333340\r\n" + 
				"41.524500000000003\r\n" + 
				"41.537333333333329\r\n" + 
				"41.549499999999995\r\n" + 
				"41.560666666666670\r\n" + 
				"41.572199999999995\r\n" + 
				"41.588999999999999\r\n" + 
				"41.607999999999997\r\n" + 
				"41.628999999999998\r\n" + 
				"41.646333333333338\r\n" + 
				"41.670249999999996\r\n" + 
				"41.683999999999997\r\n" + 
				"41.695999999999998\r\n" + 
				"41.715666666666664\r\n" + 
				"41.741999999999997\r\n" + 
				"41.757999999999996\r\n" + 
				"41.783166666666666\r\n" + 
				"41.808999999999997\r\n" + 
				"41.823000000000008\r\n" + 
				"41.835999999999999\r\n" + 
				"41.849999999999994\r\n" + 
				"41.868600000000001\r\n" + 
				"41.884250000000002\r\n" + 
				"41.906999999999996\r\n" + 
				"41.918333333333329\r\n" + 
				"41.929000000000002\r\n" + 
				"41.937250000000006\r\n" + 
				"41.948500000000010\r\n" + 
				"41.964125000000003\r\n" + 
				"41.973500000000001\r\n" + 
				"41.983666666666664\r\n" + 
				"41.995500000000000\r\n" + 
				"42.007500000000000\r\n" + 
				"42.019500000000001\r\n" + 
				"42.031125000000003\r\n" + 
				"42.041499999999999\r\n" + 
				"42.053500000000000\r\n" + 
				"42.065500000000000\r\n" + 
				"42.077500000000001\r\n" + 
				"42.088428571428572\r\n" + 
				"42.101666666666667\r\n" + 
				"42.114333333333335\r\n" + 
				"42.130625000000009\r\n" + 
				"42.142666666666663\r\n" + 
				"42.152000000000001\r\n" + 
				"42.163666666666664\r\n" + 
				"42.177333333333337\r\n" + 
				"42.191285714285712\r\n" + 
				"42.207499999999996\r\n" + 
				"42.231333333333332\r\n" + 
				"42.249499999999998\r\n" + 
				"42.278500000000001\r\n" + 
				"42.298749999999998\r\n" + 
				"42.333999999999996\r\n" + 
				"42.350999999999999\r\n" + 
				"42.369714285714288\r\n" + 
				"42.391666666666666\r\n" + 
				"42.403999999999996\r\n" + 
				"42.417999999999992\r\n" + 
				"42.433999999999997\r\n" + 
				"42.465500000000006\r\n" + 
				"42.478499999999997\r\n" + 
				"42.492999999999995\r\n" + 
				"42.511400000000002\r\n" + 
				"42.524000000000001\r\n" + 
				"42.537999999999997\r\n" + 
				"42.552999999999997\r\n" + 
				"42.573500000000003\r\n" + 
				"42.590500000000006\r\n" + 
				"42.618250000000003\r\n" + 
				"42.654999999999994\r\n" + 
				"42.665499999999994\r\n" + 
				"42.676000000000002\r\n" + 
				"42.689999999999998\r\n" + 
				"42.704250000000002\r\n" + 
				"42.713250000000002\r\n" + 
				"42.728249999999996\r\n" + 
				"42.741000000000000\r\n" + 
				"42.761666666666663\r\n" + 
				"42.780999999999999\r\n" + 
				"42.800750000000001\r\n" + 
				"42.819166666666682\r\n" + 
				"42.836600000000004\r\n" + 
				"42.853833333333334\r\n" + 
				"42.880000000000003\r\n" + 
				"42.892499999999998\r\n" + 
				"42.912399999999998\r\n" + 
				"42.928833333333330\r\n" + 
				"42.944666666666670\r\n" + 
				"42.957800000000006\r\n" + 
				"42.968222222222217\r\n" + 
				"42.981000000000002\r\n" + 
				"42.992500000000000\r\n" + 
				"43.001500000000000\r\n" + 
				"43.010500000000000\r\n" + 
				"43.022500000000001\r\n" + 
				"43.032000000000004\r\n" + 
				"43.041500000000006\r\n" + 
				"43.053500000000007\r\n" + 
				"43.065090909090912\r\n" + 
				"43.076750000000004\r\n" + 
				"43.092545454545444\r\n" + 
				"43.105600000000003\r\n" + 
				"43.115000000000002\r\n" + 
				"43.128200000000000\r\n" + 
				"43.137666666666668\r\n" + 
				"43.157333333333334\r\n" + 
				"43.173000000000002\r\n" + 
				"43.181399999999996\r\n" + 
				"43.196500000000000\r\n" + 
				"43.213200000000001\r\n" + 
				"43.233249999999998\r\n" + 
				"43.254666666666672\r\n" + 
				"43.276333333333334\r\n" + 
				"43.293666666666667\r\n" + 
				"43.307749999999999\r\n" + 
				"43.331999999999994\r\n" + 
				"43.346666666666664\r\n" + 
				"43.365499999999997\r\n" + 
				"43.380000000000003\r\n" + 
				"43.398000000000003\r\n" + 
				"43.422333333333334\r\n" + 
				"43.440000000000005\r\n" + 
				"43.468500000000006\r\n" + 
				"43.491000000000000\r\n" + 
				"43.504333333333335\r\n" + 
				"43.518250000000002\r\n" + 
				"43.532333333333334\r\n" + 
				"43.552999999999997\r\n" + 
				"43.580500000000001\r\n" + 
				"43.602999999999994\r\n" + 
				"43.612749999999998\r\n" + 
				"43.637250000000002\r\n" + 
				"43.653000000000006\r\n" + 
				"43.667000000000002\r\n" + 
				"43.691499999999998\r\n" + 
				"43.712500000000006\r\n" + 
				"43.731333333333332\r\n" + 
				"43.742500000000000\r\n" + 
				"43.754500000000000\r\n" + 
				"43.767499999999998\r\n" + 
				"43.780500000000004\r\n" + 
				"43.792000000000002\r\n" + 
				"43.818400000000004\r\n" + 
				"43.846499999999999\r\n" + 
				"43.859749999999998\r\n" + 
				"43.874428571428574\r\n" + 
				"43.899749999999997\r\n" + 
				"43.912666666666667\r\n" + 
				"43.924333333333344\r\n" + 
				"43.937999999999995\r\n" + 
				"43.952500000000001\r\n" + 
				"43.963000000000001\r\n" + 
				"43.973100000000002\r\n" + 
				"43.987999999999992\r\n" + 
				"44.001000000000005\r\n" + 
				"44.012000000000000\r\n" + 
				"44.022500000000001\r\n" + 
				"44.032000000000004\r\n" + 
				"44.042000000000002\r\n" + 
				"44.053500000000007\r\n" + 
				"44.065454545454543\r\n" + 
				"44.075500000000005\r\n" + 
				"44.086500000000001\r\n" + 
				"44.097600000000000\r\n" + 
				"44.109899999999996\r\n" + 
				"44.120750000000001\r\n" + 
				"44.133666666666670\r\n" + 
				"44.151750000000007\r\n" + 
				"44.167999999999999\r\n" + 
				"44.180000000000000\r\n" + 
				"44.212500000000006\r\n" + 
				"44.225499999999997\r\n" + 
				"44.241999999999997\r\n" + 
				"44.268666666666668\r\n" + 
				"44.281999999999996\r\n" + 
				"44.299999999999997\r\n" + 
				"44.317600000000006\r\n" + 
				"44.346750000000000\r\n" + 
				"44.362399999999994\r\n" + 
				"44.380250000000004\r\n" + 
				"44.395999999999994\r\n" + 
				"44.409999999999997\r\n" + 
				"44.430499999999995\r\n" + 
				"44.446000000000005\r\n" + 
				"44.463749999999997\r\n" + 
				"44.482199999999999\r\n" + 
				"44.509999999999998\r\n" + 
				"44.522833333333331\r\n" + 
				"44.539500000000004\r\n" + 
				"44.558250000000001\r\n" + 
				"44.572000000000003\r\n" + 
				"44.582999999999998\r\n" + 
				"44.596499999999999\r\n" + 
				"44.613999999999997\r\n" + 
				"44.624499999999998\r\n" + 
				"44.637999999999998\r\n" + 
				"44.651499999999999\r\n" + 
				"44.666999999999994\r\n" + 
				"44.686750000000004\r\n" + 
				"44.717400000000005\r\n" + 
				"44.732333333333337\r\n" + 
				"44.743499999999997\r\n" + 
				"44.757999999999996\r\n" + 
				"44.781833333333331\r\n" + 
				"44.810749999999999\r\n" + 
				"44.831666666666671\r\n" + 
				"44.851200000000006\r\n" + 
				"44.874600000000001\r\n" + 
				"44.887499999999996\r\n" + 
				"44.902000000000001\r\n" + 
				"44.919857142857140\r\n" + 
				"44.936800000000005\r\n" + 
				"44.951600000000006\r\n" + 
				"44.961666666666673\r\n" + 
				"44.973500000000001\r\n" + 
				"44.982999999999997\r\n" + 
				"44.991285714285716\r\n" + 
				"45.000499999999995\r\n" + 
				"45.009999999999998\r\n" + 
				"45.022500000000001\r\n" + 
				"45.033499999999989\r\n" + 
				"45.044999999999995\r\n" + 
				"45.056500000000000\r\n" + 
				"45.067999999999998\r\n" + 
				"45.079500000000003\r\n" + 
				"45.089999999999996\r\n" + 
				"45.100600000000000\r\n" + 
				"45.113888888888894\r\n" + 
				"45.127400000000002\r\n" + 
				"45.140750000000004\r\n" + 
				"45.153666666666673\r\n" + 
				"45.195250000000001\r\n" + 
				"45.207666666666661\r\n" + 
				"45.231199999999994\r\n" + 
				"45.248666666666658\r\n" + 
				"45.280000000000001\r\n" + 
				"45.302499999999988\r\n" + 
				"45.318250000000006\r\n" + 
				"45.332999999999998\r\n" + 
				"45.348750000000003\r\n" + 
				"45.375249999999994\r\n" + 
				"45.393333333333338\r\n" + 
				"45.408000000000001\r\n" + 
				"45.429500000000004\r\n" + 
				"45.441000000000003\r\n" + 
				"45.459714285714291\r\n" + 
				"45.493499999999997\r\n" + 
				"45.506000000000000\r\n" + 
				"45.517000000000003\r\n" + 
				"45.528250000000000\r\n" + 
				"45.542999999999999\r\n" + 
				"45.555999999999997\r\n" + 
				"45.578000000000003\r\n" + 
				"45.594499999999996\r\n" + 
				"45.606666666666662\r\n" + 
				"45.617666666666658\r\n" + 
				"45.631499999999996\r\n" + 
				"45.654499999999999\r\n" + 
				"45.669499999999999\r\n" + 
				"45.686666666666667\r\n" + 
				"45.704499999999996\r\n" + 
				"45.717333333333336\r\n" + 
				"45.748200000000004\r\n" + 
				"45.771000000000001\r\n" + 
				"45.793999999999997\r\n" + 
				"45.805500000000002\r\n" + 
				"45.817999999999998\r\n" + 
				"45.830500000000001\r\n" + 
				"45.845500000000001\r\n" + 
				"45.856999999999999\r\n" + 
				"45.875799999999998\r\n" + 
				"45.894000000000005\r\n" + 
				"45.905000000000001\r\n" + 
				"45.918125000000003\r\n" + 
				"45.933199999999999\r\n" + 
				"45.947555555555560\r\n" + 
				"45.964071428571422\r\n" + 
				"45.977499999999999\r\n" + 
				"45.986499999999999\r\n" + 
				"45.995500000000000\r\n" + 
				"46.007499999999993\r\n" + 
				"46.018111111111111\r\n" + 
				"46.031499999999994\r\n" + 
				"46.044499999999999\r\n" + 
				"46.055000000000007\r\n" + 
				"46.065500000000007\r\n" + 
				"46.077000000000005\r\n" + 
				"46.087666666666678\r\n" + 
				"46.100000000000001\r\n" + 
				"46.111249999999998\r\n" + 
				"46.123199999999997\r\n" + 
				"46.146142857142863\r\n" + 
				"46.159666666666659\r\n" + 
				"46.169999999999995\r\n" + 
				"46.190749999999994\r\n" + 
				"46.211333333333336\r\n" + 
				"46.231399999999994\r\n" + 
				"46.262999999999998\r\n" + 
				"46.281999999999996\r\n" + 
				"46.294333333333327\r\n" + 
				"46.319999999999993\r\n" + 
				"46.336333333333336\r\n" + 
				"46.360199999999999\r\n" + 
				"46.376500000000000\r\n" + 
				"46.406250000000000\r\n" + 
				"46.425999999999995\r\n" + 
				"46.442249999999994\r\n" + 
				"46.472499999999997\r\n" + 
				"46.507666666666665\r\n" + 
				"46.525500000000001\r\n" + 
				"46.540000000000006\r\n" + 
				"46.555000000000000\r\n" + 
				"46.575000000000003\r\n" + 
				"46.598000000000006\r\n" + 
				"46.607333333333337\r\n" + 
				"46.620500000000000\r\n" + 
				"46.635500000000000\r\n" + 
				"46.651999999999994\r\n" + 
				"46.680499999999995\r\n" + 
				"46.700250000000004\r\n" + 
				"46.725999999999999\r\n" + 
				"46.736249999999998\r\n" + 
				"46.748500000000000\r\n" + 
				"46.762749999999997\r\n" + 
				"46.779666666666664\r\n" + 
				"46.797249999999998\r\n" + 
				"46.811999999999998\r\n" + 
				"46.827666666666666\r\n" + 
				"46.845428571428570\r\n" + 
				"46.859499999999997\r\n" + 
				"46.882500000000007\r\n" + 
				"46.891999999999996\r\n" + 
				"46.902999999999999\r\n" + 
				"46.915599999999998\r\n" + 
				"46.927199999999999\r\n" + 
				"46.938500000000005\r\n" + 
				"46.954000000000008\r\n" + 
				"46.965099999999993\r\n" + 
				"46.977545454545456\r\n" + 
				"46.988999999999997\r\n" + 
				"46.998888888888892\r\n" + 
				"47.010500000000000\r\n" + 
				"47.022500000000001\r\n" + 
				"47.034999999999997\r\n" + 
				"47.047500000000007\r\n" + 
				"47.059499999999993\r\n" + 
				"47.071000000000005\r\n" + 
				"47.082000000000008\r\n" + 
				"47.094769230769231\r\n" + 
				"47.107555555555557\r\n" + 
				"47.126624999999997\r\n" + 
				"47.143250000000009\r\n" + 
				"47.163750000000000\r\n" + 
				"47.177000000000000\r\n" + 
				"47.188333333333333\r\n" + 
				"47.200000000000003\r\n" + 
				"47.212666666666671\r\n" + 
				"47.229799999999997\r\n" + 
				"47.249000000000002\r\n" + 
				"47.271333333333331\r\n" + 
				"47.285499999999999\r\n" + 
				"47.300000000000004\r\n" + 
				"47.320000000000000\r\n" + 
				"47.336799999999997\r\n" + 
				"47.356999999999999\r\n" + 
				"47.369999999999997\r\n" + 
				"47.389000000000003\r\n" + 
				"47.409666666666659\r\n" + 
				"47.425749999999994\r\n" + 
				"47.443333333333335\r\n" + 
				"47.473333333333336\r\n" + 
				"47.485500000000002\r\n" + 
				"47.510333333333335\r\n" + 
				"47.524666666666668\r\n" + 
				"47.538250000000005\r\n" + 
				"47.562500000000000\r\n" + 
				"47.579999999999998\r\n" + 
				"47.597333333333331\r\n" + 
				"47.614666666666665\r\n" + 
				"47.628000000000000\r\n" + 
				"47.637999999999998\r\n" + 
				"47.657999999999994\r\n" + 
				"47.670749999999998\r\n" + 
				"47.686999999999998\r\n" + 
				"47.699333333333335\r\n" + 
				"47.712666666666671\r\n" + 
				"47.729166666666664\r\n" + 
				"47.747599999999998\r\n" + 
				"47.769666666666666\r\n" + 
				"47.780666666666669\r\n" + 
				"47.806500000000000\r\n" + 
				"47.832999999999998\r\n" + 
				"47.844999999999999\r\n" + 
				"47.858499999999999\r\n" + 
				"47.876833333333330\r\n" + 
				"47.893250000000002\r\n" + 
				"47.911999999999999\r\n" + 
				"47.923000000000002\r\n" + 
				"47.934833333333337\r\n" + 
				"47.949555555555563\r\n" + 
				"47.962699999999998\r\n" + 
				"47.972400000000000\r\n" + 
				"47.981999999999999\r\n" + 
				"47.992500000000000\r\n" + 
				"48.004500000000007\r\n" + 
				"48.016500000000001\r\n" + 
				"48.030200000000001\r\n" + 
				"48.044499999999999\r\n" + 
				"48.056500000000000\r\n" + 
				"48.068500000000000\r\n" + 
				"48.080999999999996\r\n" + 
				"48.092799999999997\r\n" + 
				"48.106833333333334\r\n" + 
				"48.117874999999998\r\n" + 
				"48.130333333333333\r\n" + 
				"48.141500000000001\r\n" + 
				"48.151499999999999\r\n" + 
				"48.164999999999999\r\n" + 
				"48.185500000000005\r\n" + 
				"48.197500000000005\r\n" + 
				"48.210999999999999\r\n" + 
				"48.226750000000003\r\n" + 
				"48.244600000000005\r\n" + 
				"48.259333333333338\r\n" + 
				"48.283999999999999\r\n" + 
				"48.301666666666669\r\n" + 
				"48.316000000000003\r\n" + 
				"48.329500000000003\r\n" + 
				"48.351999999999997\r\n" + 
				"48.375000000000000\r\n" + 
				"48.394333333333329\r\n" + 
				"48.420500000000004\r\n" + 
				"48.438000000000009\r\n" + 
				"48.463333333333338\r\n" + 
				"48.487499999999997\r\n" + 
				"48.496200000000002\r\n" + 
				"48.535000000000004\r\n" + 
				"48.548833333333334\r\n" + 
				"48.586500000000001\r\n" + 
				"48.602600000000010\r\n" + 
				"48.626500000000000\r\n" + 
				"48.645666666666671\r\n" + 
				"48.662499999999994\r\n" + 
				"48.684749999999994\r\n" + 
				"48.701999999999998\r\n" + 
				"48.719999999999999\r\n" + 
				"48.744000000000000\r\n" + 
				"48.777000000000001\r\n" + 
				"48.790499999999994\r\n" + 
				"48.815399999999997\r\n" + 
				"48.833833333333338\r\n" + 
				"48.850333333333339\r\n" + 
				"48.865555555555567\r\n" + 
				"48.883800000000001\r\n" + 
				"48.896166666666666\r\n" + 
				"48.907500000000006\r\n" + 
				"48.921749999999996\r\n" + 
				"48.934600000000003\r\n" + 
				"48.944200000000002\r\n" + 
				"48.954875000000001\r\n" + 
				"48.973071428571430\r\n" + 
				"48.986499999999999\r\n" + 
				"48.998500000000000\r\n" + 
				"49.010500000000000\r\n" + 
				"49.022500000000001\r\n" + 
				"49.032000000000004\r\n" + 
				"49.041500000000006\r\n" + 
				"49.053500000000007\r\n" + 
				"49.065000000000005\r\n" + 
				"49.076124999999998\r\n" + 
				"49.088750000000005\r\n" + 
				"49.102125000000001\r\n" + 
				"49.114199999999997\r\n" + 
				"49.125399999999999\r\n" + 
				"49.139000000000003\r\n" + 
				"49.149000000000001\r\n" + 
				"49.165333333333329\r\n" + 
				"49.178500000000000\r\n" + 
				"49.192799999999991\r\n" + 
				"49.204000000000001\r\n" + 
				"49.234249999999996\r\n" + 
				"49.248000000000005\r\n" + 
				"49.265000000000001\r\n" + 
				"49.293750000000003\r\n" + 
				"49.306000000000004\r\n" + 
				"49.318750000000001\r\n" + 
				"49.330666666666666\r\n" + 
				"49.343000000000004\r\n" + 
				"49.355333333333334\r\n" + 
				"49.373285714285714\r\n" + 
				"49.401000000000003\r\n" + 
				"49.414833333333341\r\n" + 
				"49.433000000000000\r\n" + 
				"49.475999999999999\r\n" + 
				"49.495000000000005\r\n" + 
				"49.506749999999997\r\n" + 
				"49.527000000000001\r\n" + 
				"49.544000000000004\r\n" + 
				"49.564000000000000\r\n" + 
				"49.597499999999997\r\n" + 
				"49.609666666666669\r\n" + 
				"49.622500000000002\r\n" + 
				"49.643000000000001\r\n" + 
				"49.660333333333334\r\n" + 
				"49.674999999999997\r\n" + 
				"49.693400000000004\r\n" + 
				"49.719250000000002\r\n" + 
				"49.738999999999997\r\n" + 
				"49.760999999999996\r\n" + 
				"49.772999999999996\r\n" + 
				"49.789000000000009\r\n" + 
				"49.803333333333335\r\n" + 
				"49.824249999999999\r\n" + 
				"49.843999999999994\r\n" + 
				"49.854999999999997\r\n" + 
				"49.863199999999992\r\n" + 
				"49.874333333333333\r\n" + 
				"49.888333333333343\r\n" + 
				"49.898333333333333\r\n" + 
				"49.908999999999999\r\n" + 
				"49.917999999999999\r\n" + 
				"49.928999999999995\r\n" + 
				"49.937500000000000\r\n" + 
				"49.952999999999996\r\n" + 
				"49.966099999999997\r\n" + 
				"49.975999999999999\r\n" + 
				"49.985999999999997\r\n" + 
				"49.997571428571440\r\n" + 
				"50.009000000000007\r\n" + 
				"50.022500000000001\r\n" + 
				"50.034999999999997\r\n" + 
				"50.047500000000007\r\n" + 
				"50.058999999999997\r\n" + 
				"50.072499999999998\r\n" + 
				"50.087100000000000\r\n" + 
				"50.099000000000004\r\n" + 
				"50.109200000000001\r\n" + 
				"50.121583333333326\r\n" + 
				"50.139000000000003\r\n" + 
				"50.158200000000001\r\n" + 
				"50.178000000000004\r\n" + 
				"50.188999999999993\r\n" + 
				"50.203444444444443\r\n" + 
				"50.222666666666669\r\n" + 
				"50.239000000000004\r\n" + 
				"50.252250000000004\r\n" + 
				"50.263600000000004\r\n" + 
				"50.291499999999999\r\n" + 
				"50.302857142857135\r\n" + 
				"50.315500000000000\r\n" + 
				"50.362400000000001\r\n" + 
				"50.382999999999996\r\n" + 
				"50.396333333333338\r\n" + 
				"50.412999999999997\r\n" + 
				"50.423666666666662\r\n" + 
				"50.442000000000000\r\n" + 
				"50.463750000000005\r\n" + 
				"50.484000000000002\r\n" + 
				"50.495333333333328\r\n" + 
				"50.513599999999997\r\n" + 
				"50.530250000000002\r\n" + 
				"50.545999999999999\r\n" + 
				"50.567000000000000\r\n" + 
				"50.583500000000001\r\n" + 
				"50.595000000000006\r\n" + 
				"50.617000000000004\r\n" + 
				"50.627666666666670\r\n" + 
				"50.643999999999998\r\n" + 
				"50.677666666666674\r\n" + 
				"50.703250000000004\r\n" + 
				"50.721166666666669\r\n" + 
				"50.744500000000002\r\n" + 
				"50.754999999999995\r\n" + 
				"50.767249999999997\r\n" + 
				"50.785333333333334\r\n" + 
				"50.799999999999997\r\n" + 
				"50.815500000000000\r\n" + 
				"50.826800000000006\r\n" + 
				"50.840999999999994\r\n" + 
				"50.863666666666660\r\n" + 
				"50.875249999999994\r\n" + 
				"50.884999999999998\r\n" + 
				"50.900600000000004\r\n" + 
				"50.912999999999997\r\n" + 
				"50.925500000000000\r\n" + 
				"50.937999999999995\r\n" + 
				"50.948333333333331\r\n" + 
				"50.964363636363629\r\n" + 
				"50.977888888888884\r\n" + 
				"50.986999999999995\r\n" + 
				"50.998000000000005\r\n" + 
				"51.010500000000000\r\n" + 
				"51.022500000000001\r\n" + 
				"51.033000000000001\r\n" + 
				"51.043000000000006\r\n" + 
				"51.053500000000007\r\n" + 
				"51.067499999999995\r\n" + 
				"51.080999999999996\r\n" + 
				"51.092333333333336\r\n" + 
				"51.102499999999999\r\n" + 
				"51.111499999999999\r\n" + 
				"51.127125000000007\r\n" + 
				"51.143200000000000\r\n" + 
				"51.161999999999999\r\n" + 
				"51.170500000000004\r\n" + 
				"51.184500000000000\r\n" + 
				"51.204799999999999\r\n" + 
				"51.221000000000004\r\n" + 
				"51.233000000000004\r\n" + 
				"51.262666666666668\r\n" + 
				"51.273666666666664\r\n" + 
				"51.284666666666659\r\n" + 
				"51.299999999999997\r\n" + 
				"51.321750000000002\r\n" + 
				"51.365499999999997\r\n" + 
				"51.373500000000000\r\n" + 
				"51.383666666666670\r\n" + 
				"51.393500000000003\r\n" + 
				"51.415499999999994\r\n" + 
				"51.456000000000003\r\n" + 
				"51.482428571428564\r\n" + 
				"51.497000000000000\r\n" + 
				"51.509500000000003\r\n" + 
				"51.520000000000003\r\n" + 
				"51.534999999999997\r\n" + 
				"51.564000000000000\r\n" + 
				"51.585666666666668\r\n" + 
				"51.599000000000004\r\n" + 
				"51.612499999999997\r\n" + 
				"51.624600000000001\r\n" + 
				"51.637500000000003\r\n" + 
				"51.649000000000001\r\n" + 
				"51.667000000000002\r\n" + 
				"51.680999999999997\r\n" + 
				"51.694500000000005\r\n" + 
				"51.710249999999995\r\n" + 
				"51.738999999999997\r\n" + 
				"51.762000000000000\r\n" + 
				"51.780000000000001\r\n" + 
				"51.789999999999999\r\n" + 
				"51.806666666666672\r\n" + 
				"51.823999999999998\r\n" + 
				"51.837000000000003\r\n" + 
				"51.869666666666660\r\n" + 
				"51.884857142857150\r\n" + 
				"51.897666666666659\r\n" + 
				"51.911999999999999\r\n" + 
				"51.930142857142862\r\n" + 
				"51.942000000000007\r\n" + 
				"51.954538461538469\r\n" + 
				"51.968363636363641\r\n" + 
				"51.982416666666659\r\n" + 
				"51.995500000000000\r\n" + 
				"52.006999999999998\r\n" + 
				"52.018000000000001\r\n" + 
				"52.030500000000004\r\n" + 
				"52.044499999999999\r\n" + 
				"52.056500000000000\r\n" + 
				"52.067899999999995\r\n" + 
				"52.082384615384612\r\n" + 
				"52.095111111111109\r\n" + 
				"52.105000000000004\r\n" + 
				"52.114090909090912\r\n" + 
				"52.126750000000001\r\n" + 
				"52.140599999999992\r\n" + 
				"52.161124999999998\r\n" + 
				"52.190000000000012\r\n" + 
				"52.212333333333333\r\n" + 
				"52.227999999999994\r\n" + 
				"52.257666666666665\r\n" + 
				"52.274000000000001\r\n" + 
				"52.290499999999994\r\n" + 
				"52.302999999999997\r\n" + 
				"52.316500000000005\r\n" + 
				"52.329000000000001\r\n" + 
				"52.347499999999997\r\n" + 
				"52.368333333333339\r\n" + 
				"52.380333333333333\r\n" + 
				"52.403500000000001\r\n" + 
				"52.420250000000003\r\n" + 
				"52.436571428571426\r\n" + 
				"52.451999999999998\r\n" + 
				"52.481499999999997\r\n" + 
				"52.508000000000003\r\n" + 
				"52.539249999999996\r\n" + 
				"52.549999999999990\r\n" + 
				"52.563000000000002\r\n" + 
				"52.584499999999998\r\n" + 
				"52.609000000000002\r\n" + 
				"52.640999999999998\r\n" + 
				"52.658500000000004\r\n" + 
				"52.674999999999997\r\n" + 
				"52.687333333333335\r\n" + 
				"52.703000000000003\r\n" + 
				"52.716499999999996\r\n" + 
				"52.735500000000002\r\n" + 
				"52.748000000000005\r\n" + 
				"52.774000000000001\r\n" + 
				"52.789249999999996\r\n" + 
				"52.800250000000005\r\n" + 
				"52.814000000000000\r\n" + 
				"52.828200000000002\r\n" + 
				"52.849499999999999\r\n" + 
				"52.865000000000002\r\n" + 
				"52.878333333333330\r\n" + 
				"52.889666666666663\r\n" + 
				"52.903599999999997\r\n" + 
				"52.921199999999999\r\n" + 
				"52.933500000000002\r\n" + 
				"52.942714285714281\r\n" + 
				"52.956999999999994\r\n" + 
				"52.970800000000011\r\n" + 
				"52.987000000000002\r\n" + 
				"53.002499999999998\r\n" + 
				"53.015999999999991\r\n" + 
				"53.025500000000001\r\n" + 
				"53.034500000000001\r\n" + 
				"53.046000000000006\r\n" + 
				"53.055428571428571\r\n" + 
				"53.065181818181806\r\n" + 
				"53.076833333333333\r\n" + 
				"53.085999999999999\r\n" + 
				"53.094750000000005\r\n" + 
				"53.108400000000003\r\n" + 
				"53.123888888888885\r\n" + 
				"53.151714285714277\r\n" + 
				"53.167000000000002\r\n" + 
				"53.189999999999998\r\n" + 
				"53.202249999999992\r\n" + 
				"53.224333333333334\r\n" + 
				"53.238999999999997\r\n" + 
				"53.250666666666667\r\n" + 
				"53.265999999999998\r\n" + 
				"53.278333333333329\r\n" + 
				"53.290333333333329\r\n" + 
				"53.308999999999997\r\n" + 
				"53.324750000000002\r\n" + 
				"53.343333333333334\r\n" + 
				"53.359999999999992\r\n" + 
				"53.373500000000000\r\n" + 
				"53.390333333333331\r\n" + 
				"53.416499999999999\r\n" + 
				"53.433499999999995\r\n" + 
				"53.448499999999996\r\n" + 
				"53.477999999999994\r\n" + 
				"53.494999999999997\r\n" + 
				"53.519399999999997\r\n" + 
				"53.529499999999999\r\n" + 
				"53.557999999999993\r\n" + 
				"53.567749999999997\r\n" + 
				"53.585999999999999\r\n" + 
				"53.597400000000007\r\n" + 
				"53.632500000000007\r\n" + 
				"53.654499999999999\r\n" + 
				"53.692666666666668\r\n" + 
				"53.706833333333329\r\n" + 
				"53.719999999999999\r\n" + 
				"53.732666666666660\r\n" + 
				"53.741999999999997\r\n" + 
				"53.756000000000000\r\n" + 
				"53.773000000000003\r\n" + 
				"53.796999999999997\r\n" + 
				"53.809666666666665\r\n" + 
				"53.827999999999996\r\n" + 
				"53.837500000000006\r\n" + 
				"53.856499999999997\r\n" + 
				"53.870500000000000\r\n" + 
				"53.893000000000001\r\n" + 
				"53.906500000000001\r\n" + 
				"53.927999999999997\r\n" + 
				"53.942500000000010\r\n" + 
				"53.956333333333340\r\n" + 
				"53.968499999999999\r\n" + 
				"53.976700000000008\r\n" + 
				"53.990785714285714\r\n" + 
				"54.001500000000000\r\n" + 
				"54.010500000000000\r\n" + 
				"54.022500000000001\r\n" + 
				"54.033000000000001\r\n" + 
				"54.044000000000004\r\n" + 
				"54.056500000000000\r\n" + 
				"54.068500000000000\r\n" + 
				"54.080500000000001\r\n" + 
				"54.091499999999996\r\n" + 
				"54.105636363636357\r\n" + 
				"54.118285714285712\r\n" + 
				"54.130142857142857\r\n" + 
				"54.139999999999993\r\n" + 
				"54.153499999999994\r\n" + 
				"54.162199999999999\r\n" + 
				"54.179857142857145\r\n" + 
				"54.192333333333330\r\n" + 
				"54.203000000000003\r\n" + 
				"54.223400000000005\r\n" + 
				"54.244500000000002\r\n" + 
				"54.262333333333338\r\n" + 
				"54.277000000000001\r\n" + 
				"54.295500000000004\r\n" + 
				"54.313000000000002\r\n" + 
				"54.332999999999998\r\n" + 
				"54.342666666666673\r\n" + 
				"54.356600000000000\r\n" + 
				"54.370999999999995\r\n" + 
				"54.396500000000003\r\n" + 
				"54.415250000000000\r\n" + 
				"54.431500000000000\r\n" + 
				"54.445999999999998\r\n" + 
				"54.460000000000001\r\n" + 
				"54.476999999999997\r\n" + 
				"54.487000000000002\r\n" + 
				"54.506000000000000\r\n" + 
				"54.521749999999997\r\n" + 
				"54.538000000000004\r\n" + 
				"54.558000000000000\r\n" + 
				"54.579000000000001\r\n" + 
				"54.599499999999999\r\n" + 
				"54.610500000000002\r\n" + 
				"54.643000000000001\r\n" + 
				"54.662999999999997\r\n" + 
				"54.681333333333328\r\n" + 
				"54.689499999999995\r\n" + 
				"54.714500000000001\r\n" + 
				"54.729600000000005\r\n" + 
				"54.747000000000000\r\n" + 
				"54.762250000000002\r\n" + 
				"54.775999999999996\r\n" + 
				"54.785200000000010\r\n" + 
				"54.796500000000002\r\n" + 
				"54.816571428571429\r\n" + 
				"54.835000000000001\r\n" + 
				"54.849833333333322\r\n" + 
				"54.865499999999997\r\n" + 
				"54.886000000000003\r\n" + 
				"54.901799999999994\r\n" + 
				"54.913333333333334\r\n" + 
				"54.922249999999998\r\n" + 
				"54.934111111111100\r\n" + 
				"54.952083333333341\r\n" + 
				"54.964250000000000\r\n" + 
				"54.975555555555552\r\n" + 
				"54.988214285714278\r\n" + 
				"55.001999999999995\r\n" + 
				"55.010499999999986\r\n" + 
				"55.021214285714287\r\n" + 
				"55.033499999999997\r\n" + 
				"55.044499999999999\r\n" + 
				"55.055500000000009\r\n" + 
				"55.065000000000005\r\n" + 
				"55.075999999999993\r\n" + 
				"55.086888888888893\r\n" + 
				"55.098400000000005\r\n" + 
				"55.106428571428573\r\n" + 
				"55.118250000000003\r\n" + 
				"55.130600000000001\r\n" + 
				"55.141000000000005\r\n" + 
				"55.156333333333329\r\n" + 
				"55.173333333333339\r\n" + 
				"55.183833333333332\r\n" + 
				"55.198166666666673\r\n" + 
				"55.222999999999992\r\n" + 
				"55.241500000000002\r\n" + 
				"55.273000000000003\r\n" + 
				"55.297333333333334\r\n" + 
				"55.323000000000000\r\n" + 
				"55.351250000000000\r\n" + 
				"55.367500000000000\r\n" + 
				"55.379500000000000\r\n" + 
				"55.405000000000001\r\n" + 
				"55.419249999999998\r\n" + 
				"55.435250000000003\r\n" + 
				"55.457399999999993\r\n" + 
				"55.470500000000001\r\n" + 
				"55.483666666666664\r\n" + 
				"55.499499999999998\r\n" + 
				"55.516000000000005\r\n" + 
				"55.532833333333322\r\n" + 
				"55.550500000000000\r\n" + 
				"55.570500000000003\r\n" + 
				"55.585000000000001\r\n" + 
				"55.608000000000004\r\n" + 
				"55.634000000000000\r\n" + 
				"55.658000000000001\r\n" + 
				"55.692500000000003\r\n" + 
				"55.724399999999989\r\n" + 
				"55.745999999999995\r\n" + 
				"55.759666666666668\r\n" + 
				"55.786000000000001\r\n" + 
				"55.801000000000009\r\n" + 
				"55.809333333333335\r\n" + 
				"55.822000000000003\r\n" + 
				"55.839874999999999\r\n" + 
				"55.853666666666669\r\n" + 
				"55.872199999999999\r\n" + 
				"55.883666666666670\r\n" + 
				"55.900000000000013\r\n" + 
				"55.914799999999993\r\n" + 
				"55.926249999999996\r\n" + 
				"55.940333333333335\r\n" + 
				"55.954000000000008\r\n" + 
				"55.961500000000001\r\n" + 
				"55.971454545454549\r\n" + 
				"55.981000000000002\r\n" + 
				"55.990599999999993\r\n" + 
				"56.000999999999998\r\n" + 
				"56.011499999999998\r\n" + 
				"56.024500000000003\r\n" + 
				"56.038499999999999\r\n" + 
				"56.050499999999992\r\n" + 
				"56.061500000000002\r\n" + 
				"56.071000000000005\r\n" + 
				"56.080500000000001\r\n" + 
				"56.092000000000006\r\n" + 
				"56.105500000000006\r\n" + 
				"56.115857142857138\r\n" + 
				"56.128374999999998\r\n" + 
				"56.142000000000003\r\n" + 
				"56.153666666666673\r\n" + 
				"56.172800000000009\r\n" + 
				"56.186000000000000\r\n" + 
				"56.197833333333335\r\n" + 
				"56.213727272727276\r\n" + 
				"56.228999999999999\r\n" + 
				"56.244333333333337\r\n" + 
				"56.254999999999995\r\n" + 
				"56.268000000000001\r\n" + 
				"56.289999999999999\r\n" + 
				"56.300333333333334\r\n" + 
				"56.320499999999996\r\n" + 
				"56.344333333333331\r\n" + 
				"56.363000000000000\r\n" + 
				"56.377999999999993\r\n" + 
				"56.399999999999999\r\n" + 
				"56.410249999999998\r\n" + 
				"56.424666666666667\r\n" + 
				"56.440500000000000\r\n" + 
				"56.454000000000001\r\n" + 
				"56.471500000000006\r\n" + 
				"56.491166666666665\r\n" + 
				"56.515000000000001\r\n" + 
				"56.530799999999999\r\n" + 
				"56.544333333333327\r\n" + 
				"56.555999999999997\r\n" + 
				"56.576000000000008\r\n" + 
				"56.603999999999999\r\n" + 
				"56.632333333333328\r\n" + 
				"56.646400000000007\r\n" + 
				"56.661666666666662\r\n" + 
				"56.678249999999998\r\n" + 
				"56.697000000000003\r\n" + 
				"56.709571428571429\r\n" + 
				"56.733499999999999\r\n" + 
				"56.744249999999994\r\n" + 
				"56.763599999999997\r\n" + 
				"56.780999999999999\r\n" + 
				"56.791499999999999\r\n" + 
				"56.810499999999990\r\n" + 
				"56.832000000000001\r\n" + 
				"56.842999999999996\r\n" + 
				"56.864000000000004\r\n" + 
				"56.879285714285722\r\n" + 
				"56.894799999999996\r\n" + 
				"56.916499999999999\r\n" + 
				"56.925333333333334\r\n" + 
				"56.936800000000005\r\n" + 
				"56.945750000000004\r\n" + 
				"56.954000000000008\r\n" + 
				"56.968222222222231\r\n" + 
				"56.979200000000006\r\n" + 
				"56.988666666666667\r\n" + 
				"56.999000000000002\r\n" + 
				"57.007500000000000\r\n" + 
				"57.016500000000001\r\n" + 
				"57.030500000000004\r\n" + 
				"57.044499999999999\r\n" + 
				"57.056500000000000\r\n" + 
				"57.067500000000010\r\n" + 
				"57.080818181818181\r\n" + 
				"57.090999999999994\r\n" + 
				"57.100111111111104\r\n" + 
				"57.111800000000002\r\n" + 
				"57.122571428571419\r\n" + 
				"57.134666666666668\r\n" + 
				"57.148714285714284\r\n" + 
				"57.167499999999997\r\n" + 
				"57.180000000000000\r\n" + 
				"57.196199999999997\r\n" + 
				"57.207749999999997\r\n" + 
				"57.222999999999999\r\n" + 
				"57.235500000000002\r\n" + 
				"57.253999999999998\r\n" + 
				"57.273666666666664\r\n" + 
				"57.289749999999998\r\n" + 
				"57.300750000000001\r\n" + 
				"57.317000000000000\r\n" + 
				"57.333285714285715\r\n" + 
				"57.344999999999999\r\n" + 
				"57.356999999999999\r\n" + 
				"57.372666666666667\r\n" + 
				"57.392499999999998\r\n" + 
				"57.417999999999999\r\n" + 
				"57.439666666666660\r\n" + 
				"57.466999999999999\r\n" + 
				"57.491250000000001\r\n" + 
				"57.511499999999998\r\n" + 
				"57.530999999999999\r\n" + 
				"57.548000000000002\r\n" + 
				"57.567999999999998\r\n" + 
				"57.584000000000003\r\n" + 
				"57.600749999999998\r\n" + 
				"57.625399999999999\r\n" + 
				"57.659999999999997\r\n" + 
				"57.672199999999997\r\n" + 
				"57.685500000000005\r\n" + 
				"57.699749999999995\r\n" + 
				"57.716999999999999\r\n" + 
				"57.736599999999996\r\n" + 
				"57.763400000000004\r\n" + 
				"57.777000000000001\r\n" + 
				"57.799333333333330\r\n" + 
				"57.814000000000000\r\n" + 
				"57.831750000000000\r\n" + 
				"57.847749999999998\r\n" + 
				"57.856666666666662\r\n" + 
				"57.870000000000005\r\n" + 
				"57.890250000000002\r\n" + 
				"57.910444444444437\r\n" + 
				"57.924499999999995\r\n" + 
				"57.944181818181818\r\n" + 
				"57.958333333333336\r\n" + 
				"57.972000000000001\r\n" + 
				"57.984000000000009\r\n" + 
				"57.992500000000000\r\n" + 
				"58.003499999999995\r\n" + 
				"58.015999999999991\r\n" + 
				"58.028999999999996\r\n" + 
				"58.041500000000006\r\n" + 
				"58.052500000000002\r\n" + 
				"58.062500000000000\r\n" + 
				"58.074499999999993\r\n" + 
				"58.086222222222233\r\n" + 
				"58.098000000000006\r\n" + 
				"58.106500000000004\r\n" + 
				"58.116499999999995\r\n" + 
				"58.125124999999997\r\n" + 
				"58.135999999999989\r\n" + 
				"58.147285714285715\r\n" + 
				"58.163333333333334\r\n" + 
				"58.181999999999995\r\n" + 
				"58.193333333333328\r\n" + 
				"58.207500000000003\r\n" + 
				"58.220199999999998\r\n" + 
				"58.235666666666667\r\n" + 
				"58.264333333333333\r\n" + 
				"58.317250000000001\r\n" + 
				"58.332999999999998\r\n" + 
				"58.371499999999997\r\n" + 
				"58.393666666666661\r\n" + 
				"58.426666666666669\r\n" + 
				"58.454499999999996\r\n" + 
				"58.471750000000000\r\n" + 
				"58.490000000000002\r\n" + 
				"58.509999999999998\r\n" + 
				"58.526499999999999\r\n" + 
				"58.545500000000004\r\n" + 
				"58.564750000000004\r\n" + 
				"58.581999999999994\r\n" + 
				"58.593000000000004\r\n" + 
				"58.617000000000004\r\n" + 
				"58.632333333333328\r\n" + 
				"58.659999999999997\r\n" + 
				"58.679000000000002\r\n" + 
				"58.699500000000000\r\n" + 
				"58.712666666666671\r\n" + 
				"58.728833333333341\r\n" + 
				"58.744500000000002\r\n" + 
				"58.762499999999996\r\n" + 
				"58.782750000000000\r\n" + 
				"58.805125000000004\r\n" + 
				"58.826500000000003\r\n" + 
				"58.844399999999993\r\n" + 
				"58.859200000000001\r\n" + 
				"58.873333333333335\r\n" + 
				"58.888571428571424\r\n" + 
				"58.914400000000001\r\n" + 
				"58.929499999999997\r\n" + 
				"58.939999999999998\r\n" + 
				"58.951857142857136\r\n" + 
				"58.967090909090913\r\n" + 
				"58.981000000000002\r\n" + 
				"58.991500000000002\r\n" + 
				"59.000999999999998\r\n" + 
				"59.010500000000000\r\n" + 
				"59.022500000000001\r\n" + 
				"59.034999999999997\r\n" + 
				"59.047500000000007\r\n" + 
				"59.058999999999997\r\n" + 
				"59.072090909090917\r\n" + 
				"59.082999999999991\r\n" + 
				"59.097545454545454\r\n" + 
				"59.111199999999997\r\n" + 
				"59.123222222222225\r\n" + 
				"59.140000000000008\r\n" + 
				"59.161166666666674\r\n" + 
				"59.174666666666667\r\n" + 
				"59.186400000000006\r\n" + 
				"59.214000000000006\r\n" + 
				"59.228499999999997\r\n" + 
				"59.244000000000000\r\n" + 
				"59.271500000000003\r\n" + 
				"59.281999999999996\r\n" + 
				"59.293499999999995\r\n" + 
				"59.346000000000004\r\n" + 
				"59.357500000000002\r\n" + 
				"59.375999999999998\r\n" + 
				"59.397599999999997\r\n" + 
				"59.411999999999999\r\n" + 
				"59.430999999999997\r\n" + 
				"59.442000000000000\r\n" + 
				"59.470333333333336\r\n" + 
				"59.484000000000002\r\n" + 
				"59.499000000000002\r\n" + 
				"59.514750000000006\r\n" + 
				"59.533000000000001\r\n" + 
				"59.548000000000002\r\n" + 
				"59.565333333333335\r\n" + 
				"59.582999999999998\r\n" + 
				"59.597999999999992\r\n" + 
				"59.613999999999997\r\n" + 
				"59.633000000000003\r\n" + 
				"59.653200000000005\r\n" + 
				"59.673333333333325\r\n" + 
				"59.701250000000002\r\n" + 
				"59.716999999999999\r\n" + 
				"59.741999999999997\r\n" + 
				"59.763000000000005\r\n" + 
				"59.779571428571430\r\n" + 
				"59.794249999999998\r\n" + 
				"59.809333333333335\r\n" + 
				"59.827666666666666\r\n" + 
				"59.843399999999995\r\n" + 
				"59.861400000000003\r\n" + 
				"59.882249999999999\r\n" + 
				"59.905666666666662\r\n" + 
				"59.920333333333332\r\n" + 
				"59.938714285714290\r\n" + 
				"59.950999999999993\r\n" + 
				"59.962714285714291\r\n" + 
				"59.979461538461535\r\n" + 
				"59.992500000000000\r\n" + 
				"60.001500000000000\r\n" + 
				"60.010500000000000\r\n" + 
				"60.022500000000001\r\n" + 
				"60.032000000000004\r\n" + 
				"60.041500000000006\r\n" + 
				"60.053500000000007\r\n" + 
				"60.065500000000007\r\n" + 
				"60.077500000000008\r\n" + 
				"60.088444444444434\r\n" + 
				"60.102909090909094\r\n" + 
				"60.116499999999995\r\n" + 
				"60.125999999999998\r\n" + 
				"60.137636363636368\r\n" + 
				"60.151599999999995\r\n" + 
				"60.166599999999995\r\n" + 
				"60.190500000000000\r\n" + 
				"60.200799999999994\r\n" + 
				"60.211499999999994\r\n" + 
				"60.221000000000004\r\n" + 
				"60.241000000000007\r\n" + 
				"60.256000000000000\r\n" + 
				"60.265999999999998\r\n" + 
				"60.284666666666659\r\n" + 
				"60.295999999999999\r\n" + 
				"60.323666666666668\r\n" + 
				"60.338999999999999\r\n" + 
				"60.357400000000005\r\n" + 
				"60.380599999999994\r\n" + 
				"60.410999999999994\r\n" + 
				"60.430000000000000\r\n" + 
				"60.441333333333340\r\n" + 
				"60.462000000000003\r\n" + 
				"60.478000000000002\r\n" + 
				"60.488000000000000\r\n" + 
				"60.513599999999997\r\n" + 
				"60.529750000000000\r\n" + 
				"60.566499999999998\r\n" + 
				"60.585000000000001\r\n" + 
				"60.601749999999996\r\n" + 
				"60.619999999999997\r\n" + 
				"60.637250000000002\r\n" + 
				"60.652000000000001\r\n" + 
				"60.676800000000000\r\n" + 
				"60.689250000000001\r\n" + 
				"60.721166666666669\r\n" + 
				"60.738000000000000\r\n" + 
				"60.750000000000000\r\n" + 
				"60.780500000000004\r\n" + 
				"60.801250000000003\r\n" + 
				"60.814750000000004\r\n" + 
				"60.829499999999996\r\n" + 
				"60.845749999999995\r\n" + 
				"60.858499999999999\r\n" + 
				"60.868499999999997\r\n" + 
				"60.889000000000003\r\n" + 
				"60.904499999999999\r\n" + 
				"60.919399999999996\r\n" + 
				"60.933249999999994\r\n" + 
				"60.944000000000003\r\n" + 
				"60.953333333333340\r\n" + 
				"60.967454545454537\r\n" + 
				"60.982769230769222\r\n" + 
				"60.995090909090912\r\n" + 
				"61.008000000000010\r\n" + 
				"61.017857142857153\r\n" + 
				"61.027499999999996\r\n" + 
				"61.038499999999999\r\n" + 
				"61.050499999999992\r\n" + 
				"61.062500000000000\r\n" + 
				"61.074499999999993\r\n" + 
				"61.085285714285710\r\n" + 
				"61.096307692307697\r\n" + 
				"61.112888888888882\r\n" + 
				"61.123199999999997\r\n" + 
				"61.139714285714284\r\n" + 
				"61.161249999999995\r\n" + 
				"61.175333333333334\r\n" + 
				"61.189000000000000\r\n" + 
				"61.201000000000001\r\n" + 
				"61.228333333333332\r\n" + 
				"61.243499999999997\r\n" + 
				"61.260249999999999\r\n" + 
				"61.276499999999999\r\n" + 
				"61.301666666666669\r\n" + 
				"61.313500000000005\r\n" + 
				"61.328500000000005\r\n" + 
				"61.343666666666671\r\n" + 
				"61.363250000000001\r\n" + 
				"61.383666666666670\r\n" + 
				"61.420999999999992\r\n" + 
				"61.430500000000002\r\n" + 
				"61.451000000000001\r\n" + 
				"61.472000000000001\r\n" + 
				"61.484999999999999\r\n" + 
				"61.497666666666667\r\n" + 
				"61.513999999999996\r\n" + 
				"61.528500000000001\r\n" + 
				"61.549666666666667\r\n" + 
				"61.564000000000000\r\n" + 
				"61.586666666666666\r\n" + 
				"61.614666666666665\r\n" + 
				"61.624666666666663\r\n" + 
				"61.640333333333331\r\n" + 
				"61.667999999999999\r\n" + 
				"61.683666666666660\r\n" + 
				"61.695000000000000\r\n" + 
				"61.720249999999993\r\n" + 
				"61.738000000000000\r\n" + 
				"61.751333333333328\r\n" + 
				"61.771666666666668\r\n" + 
				"61.796999999999997\r\n" + 
				"61.808000000000000\r\n" + 
				"61.840000000000003\r\n" + 
				"61.858000000000004\r\n" + 
				"61.868666666666662\r\n" + 
				"61.884750000000004\r\n" + 
				"61.894000000000005\r\n" + 
				"61.903399999999998\r\n" + 
				"61.917800000000000\r\n" + 
				"61.932249999999996\r\n" + 
				"61.952142857142860\r\n" + 
				"61.967363636363636\r\n" + 
				"61.979999999999997\r\n" + 
				"61.990142857142857\r\n" + 
				"62.001599999999996\r\n" + 
				"62.012499999999996\r\n" + 
				"62.022500000000001\r\n" + 
				"62.034999999999997\r\n" + 
				"62.047500000000007\r\n" + 
				"62.058499999999995\r\n" + 
				"62.067999999999998\r\n" + 
				"62.077090909090913\r\n" + 
				"62.088571428571427\r\n" + 
				"62.098181818181821\r\n" + 
				"62.112000000000002\r\n" + 
				"62.122800000000005\r\n" + 
				"62.132000000000005\r\n" + 
				"62.140833333333340\r\n" + 
				"62.154399999999995\r\n" + 
				"62.166499999999999\r\n" + 
				"62.176499999999997\r\n" + 
				"62.189399999999999\r\n" + 
				"62.203500000000005\r\n" + 
				"62.220714285714287\r\n" + 
				"62.241499999999995\r\n" + 
				"62.263000000000005\r\n" + 
				"62.298000000000002\r\n" + 
				"62.320500000000003\r\n" + 
				"62.330500000000001\r\n" + 
				"62.356499999999997\r\n" + 
				"62.372500000000002\r\n" + 
				"62.390499999999996\r\n" + 
				"62.409666666666659\r\n" + 
				"62.425750000000001\r\n" + 
				"62.445999999999998\r\n" + 
				"62.471499999999999\r\n" + 
				"62.499000000000002\r\n" + 
				"62.512000000000000\r\n" + 
				"62.522000000000006\r\n" + 
				"62.540999999999997\r\n" + 
				"62.556666666666672\r\n" + 
				"62.576000000000001\r\n" + 
				"62.600800000000007\r\n" + 
				"62.624499999999998\r\n" + 
				"62.635666666666673\r\n" + 
				"62.653333333333329\r\n" + 
				"62.679000000000002\r\n" + 
				"62.698333333333331\r\n" + 
				"62.718666666666671\r\n" + 
				"62.729500000000002\r\n" + 
				"62.773499999999999\r\n" + 
				"62.789799999999993\r\n" + 
				"62.814000000000000\r\n" + 
				"62.834666666666671\r\n" + 
				"62.850999999999999\r\n" + 
				"62.862499999999997\r\n" + 
				"62.876888888888885\r\n" + 
				"62.886749999999999\r\n" + 
				"62.901400000000002\r\n" + 
				"62.926500000000004\r\n" + 
				"62.940874999999991\r\n" + 
				"62.950400000000002\r\n" + 
				"62.962125000000000\r\n" + 
				"62.973499999999994\r\n" + 
				"62.985454545454537\r\n" + 
				"62.997624999999999\r\n" + 
				"63.009999999999998\r\n" + 
				"63.022500000000001\r\n" + 
				"63.033499999999989\r\n" + 
				"63.045785714285721\r\n" + 
				"63.058999999999997\r\n" + 
				"63.069000000000010\r\n" + 
				"63.080090909090906\r\n" + 
				"63.091600000000007\r\n" + 
				"63.100714285714282\r\n" + 
				"63.113615384615386\r\n" + 
				"63.127000000000002\r\n" + 
				"63.136666666666663\r\n" + 
				"63.152333333333331\r\n" + 
				"63.173000000000002\r\n" + 
				"63.191000000000003\r\n" + 
				"63.207999999999998\r\n" + 
				"63.223500000000001\r\n" + 
				"63.241799999999998\r\n" + 
				"63.269333333333329\r\n" + 
				"63.285499999999999\r\n" + 
				"63.301666666666669\r\n" + 
				"63.314750000000004\r\n" + 
				"63.331500000000005\r\n" + 
				"63.349499999999999\r\n" + 
				"63.360999999999997\r\n" + 
				"63.374000000000002\r\n" + 
				"63.384857142857143\r\n" + 
				"63.401499999999999\r\n" + 
				"63.416800000000002\r\n" + 
				"63.444499999999998\r\n" + 
				"63.475999999999999\r\n" + 
				"63.507500000000000\r\n" + 
				"63.531250000000000\r\n" + 
				"63.543999999999997\r\n" + 
				"63.560333333333340\r\n" + 
				"63.587499999999999\r\n" + 
				"63.617666666666658\r\n" + 
				"63.628666666666668\r\n" + 
				"63.656000000000006\r\n" + 
				"63.677666666666674\r\n" + 
				"63.699500000000000\r\n" + 
				"63.710499999999996\r\n" + 
				"63.723999999999997\r\n" + 
				"63.736999999999995\r\n" + 
				"63.766333333333328\r\n" + 
				"63.786499999999997\r\n" + 
				"63.801500000000004\r\n" + 
				"63.830250000000007\r\n" + 
				"63.853000000000002\r\n" + 
				"63.865000000000002\r\n" + 
				"63.888166666666670\r\n" + 
				"63.903500000000001\r\n" + 
				"63.915250000000000\r\n" + 
				"63.928777777777768\r\n" + 
				"63.938499999999998\r\n" + 
				"63.952166666666663\r\n" + 
				"63.959500000000006\r\n" + 
				"63.971899999999991\r\n" + 
				"63.983499999999999\r\n" + 
				"63.993500000000004\r\n" + 
				"64.003500000000003\r\n" + 
				"64.016249999999999\r\n" + 
				"64.028500000000008\r\n" + 
				"64.038499999999999\r\n" + 
				"64.047499999999999\r\n" + 
				"64.056500000000000\r\n" + 
				"64.068499999999986\r\n" + 
				"64.079999999999998\r\n" + 
				"64.089181818181814\r\n" + 
				"64.100499999999997\r\n" + 
				"64.111999999999995\r\n" + 
				"64.123499999999993\r\n" + 
				"64.133124999999993\r\n" + 
				"64.145333333333326\r\n" + 
				"64.161599999999993\r\n" + 
				"64.178250000000006\r\n" + 
				"64.188999999999993\r\n" + 
				"64.198666666666668\r\n" + 
				"64.213666666666668\r\n" + 
				"64.224833333333336\r\n" + 
				"64.236750000000001\r\n" + 
				"64.260999999999996\r\n" + 
				"64.277500000000003\r\n" + 
				"64.299999999999997\r\n" + 
				"64.314999999999998\r\n" + 
				"64.336999999999989\r\n" + 
				"64.350833333333327\r\n" + 
				"64.365166666666667\r\n" + 
				"64.384000000000000\r\n" + 
				"64.403000000000006\r\n" + 
				"64.415999999999997\r\n" + 
				"64.427999999999997\r\n" + 
				"64.456999999999994\r\n" + 
				"64.474500000000006\r\n" + 
				"64.515250000000009\r\n" + 
				"64.532250000000005\r\n" + 
				"64.548000000000002\r\n" + 
				"64.558833333333340\r\n" + 
				"64.575000000000003\r\n" + 
				"64.594333333333338\r\n" + 
				"64.623000000000005\r\n" + 
				"64.649000000000001\r\n" + 
				"64.664000000000001\r\n" + 
				"64.694333333333319\r\n" + 
				"64.709749999999985\r\n" + 
				"64.721499999999992\r\n" + 
				"64.744333333333330\r\n" + 
				"64.761500000000012\r\n" + 
				"64.777500000000003\r\n" + 
				"64.788666666666686\r\n" + 
				"64.836250000000007\r\n" + 
				"64.864714285714285\r\n" + 
				"64.884333333333331\r\n" + 
				"64.894749999999988\r\n" + 
				"64.908500000000004\r\n" + 
				"64.924999999999997\r\n" + 
				"64.944499999999991\r\n" + 
				"64.955222222222204\r\n" + 
				"64.969499999999982\r\n" + 
				"64.982500000000002\r\n" + 
				"64.993000000000009\r\n" + 
				"65.002499999999998\r\n" + 
				"65.014166666666668\r\n" + 
				"65.022999999999996\r\n" + 
				"65.033500000000018\r\n" + 
				"65.045500000000004\r\n" + 
				"65.056500000000000\r\n" + 
				"65.067999999999998\r\n" + 
				"65.078999999999994\r\n" + 
				"65.088499999999996\r\n" + 
				"65.099800000000002\r\n" + 
				"65.109999999999999\r\n" + 
				"65.121571428571428\r\n" + 
				"65.130999999999986\r\n" + 
				"65.140285714285724\r\n" + 
				"65.156999999999996\r\n" + 
				"65.173000000000002\r\n" + 
				"65.194999999999993\r\n" + 
				"65.208999999999989\r\n" + 
				"65.223333333333329\r\n" + 
				"65.237400000000008\r\n" + 
				"65.251000000000005\r\n" + 
				"65.267399999999995\r\n" + 
				"65.292333333333332\r\n" + 
				"65.311999999999998\r\n" + 
				"65.323999999999998\r\n" + 
				"65.335000000000008\r\n" + 
				"65.363499999999988\r\n" + 
				"65.372749999999996\r\n" + 
				"65.385500000000008\r\n" + 
				"65.403400000000005\r\n" + 
				"65.422333333333341\r\n" + 
				"65.453999999999994\r\n" + 
				"65.479500000000002\r\n" + 
				"65.503333333333330\r\n" + 
				"65.522666666666666\r\n" + 
				"65.533999999999992\r\n" + 
				"65.550333333333342\r\n" + 
				"65.567999999999998\r\n" + 
				"65.591250000000002\r\n" + 
				"65.617999999999995\r\n" + 
				"65.632000000000005\r\n" + 
				"65.649000000000001\r\n" + 
				"65.670999999999992\r\n" + 
				"65.681666666666658\r\n" + 
				"65.694999999999993\r\n" + 
				"65.710333333333338\r\n" + 
				"65.728600000000000\r\n" + 
				"65.745999999999995\r\n" + 
				"65.763000000000005\r\n" + 
				"65.777599999999993\r\n" + 
				"65.791499999999999\r\n" + 
				"65.803500000000000\r\n" + 
				"65.826500000000010\r\n" + 
				"65.840750000000000\r\n" + 
				"65.854200000000006\r\n" + 
				"65.870999999999995\r\n" + 
				"65.881833333333333\r\n" + 
				"65.892499999999998\r\n" + 
				"65.909999999999997\r\n" + 
				"65.923333333333332\r\n" + 
				"65.937399999999997\r\n" + 
				"65.951500000000010\r\n" + 
				"65.963499999999996\r\n" + 
				"65.972499999999982\r\n" + 
				"65.985100000000003\r\n" + 
				"65.995500000000007\r\n" + 
				"66.005499999999998\r\n" + 
				"66.014499999999998\r\n" + 
				"66.023500000000013\r\n" + 
				"66.035499999999999\r\n" + 
				"66.046499999999995\r\n" + 
				"66.056500000000000\r\n" + 
				"66.068499999999986\r\n" + 
				"66.080500000000001\r\n" + 
				"66.090999999999994\r\n" + 
				"66.102363636363634\r\n" + 
				"66.117400000000004\r\n" + 
				"66.126499999999993\r\n" + 
				"66.135999999999996\r\n" + 
				"66.149799999999999\r\n" + 
				"66.165166666666664\r\n" + 
				"66.192000000000007\r\n" + 
				"66.229600000000005\r\n" + 
				"66.249857142857138\r\n" + 
				"66.275999999999996\r\n" + 
				"66.299666666666667\r\n" + 
				"66.326999999999998\r\n" + 
				"66.340999999999994\r\n" + 
				"66.376833333333337\r\n" + 
				"66.395499999999998\r\n" + 
				"66.409000000000006\r\n" + 
				"66.426000000000002\r\n" + 
				"66.438333333333333\r\n" + 
				"66.452500000000001\r\n" + 
				"66.465666666666664\r\n" + 
				"66.488000000000000\r\n" + 
				"66.505200000000002\r\n" + 
				"66.528000000000006\r\n" + 
				"66.540500000000009\r\n" + 
				"66.561333333333337\r\n" + 
				"66.582999999999998\r\n" + 
				"66.605000000000004\r\n" + 
				"66.615333333333339\r\n" + 
				"66.633333333333326\r\n" + 
				"66.659500000000008\r\n" + 
				"66.671500000000009\r\n" + 
				"66.694749999999999\r\n" + 
				"66.713499999999996\r\n" + 
				"66.724333333333334\r\n" + 
				"66.737250000000003\r\n" + 
				"66.758600000000001\r\n" + 
				"66.770666666666671\r\n" + 
				"66.787333333333336\r\n" + 
				"66.797333333333327\r\n" + 
				"66.813249999999996\r\n" + 
				"66.829999999999998\r\n" + 
				"66.846999999999994\r\n" + 
				"66.860749999999996\r\n" + 
				"66.874200000000002\r\n" + 
				"66.885999999999996\r\n" + 
				"66.901800000000009\r\n" + 
				"66.917000000000002\r\n" + 
				"66.935000000000002\r\n" + 
				"66.943833333333330\r\n" + 
				"66.955833333333331\r\n" + 
				"66.967428571428570\r\n" + 
				"66.976399999999998\r\n" + 
				"66.984899999999996\r\n" + 
				"66.994000000000000\r\n" + 
				"67.003181818181815\r\n" + 
				"67.016000000000005\r\n" + 
				"67.027000000000015\r\n" + 
				"67.035499999999999\r\n" + 
				"67.044499999999985\r\n" + 
				"67.056500000000000\r\n" + 
				"67.067999999999998\r\n" + 
				"67.080615384615385\r\n" + 
				"67.096100000000007\r\n" + 
				"67.110545454545445\r\n" + 
				"67.124444444444450\r\n" + 
				"67.136200000000002\r\n" + 
				"67.155000000000001\r\n" + 
				"67.175250000000005\r\n" + 
				"67.188999999999993\r\n" + 
				"67.210333333333338\r\n" + 
				"67.238333333333330\r\n" + 
				"67.260500000000008\r\n" + 
				"67.277999999999992\r\n" + 
				"67.300500000000014\r\n" + 
				"67.315500000000000\r\n" + 
				"67.328999999999994\r\n" + 
				"67.340499999999992\r\n" + 
				"67.364999999999981\r\n" + 
				"67.380999999999986\r\n" + 
				"67.388999999999996\r\n" + 
				"67.412250000000000\r\n" + 
				"67.429333333333346\r\n" + 
				"67.447000000000003\r\n" + 
				"67.479666666666660\r\n" + 
				"67.510000000000005\r\n" + 
				"67.536333333333332\r\n" + 
				"67.548500000000004\r\n" + 
				"67.558333333333337\r\n" + 
				"67.579999999999998\r\n" + 
				"67.597499999999997\r\n" + 
				"67.613000000000000\r\n" + 
				"67.634999999999991\r\n" + 
				"67.652500000000003\r\n" + 
				"67.666499999999999\r\n" + 
				"67.685000000000002\r\n" + 
				"67.699333333333328\r\n" + 
				"67.713500000000010\r\n" + 
				"67.727999999999994\r\n" + 
				"67.738000000000000\r\n" + 
				"67.749600000000001\r\n" + 
				"67.763000000000005\r\n" + 
				"67.784800000000004\r\n" + 
				"67.801249999999996\r\n" + 
				"67.818399999999997\r\n" + 
				"67.842500000000001\r\n" + 
				"67.854399999999998\r\n" + 
				"67.869799999999998\r\n" + 
				"67.883666666666656\r\n" + 
				"67.897500000000008\r\n" + 
				"67.909500000000008\r\n" + 
				"67.920999999999992\r\n" + 
				"67.936999999999998\r\n" + 
				"67.949999999999989\r\n" + 
				"67.958571428571432\r\n" + 
				"67.969888888888889\r\n" + 
				"67.984499999999997\r\n" + 
				"67.996200000000002\r\n" + 
				"68.010083333333341\r\n" + 
				"68.022500000000008\r\n" + 
				"68.033500000000018\r\n" + 
				"68.047000000000011\r\n" + 
				"68.061500000000009\r\n" + 
				"68.074500000000000\r\n" + 
				"68.082499999999996\r\n" + 
				"68.091181818181809\r\n" + 
				"68.102499999999992\r\n" + 
				"68.112000000000009\r\n" + 
				"68.124777777777766\r\n" + 
				"68.142333333333326\r\n" + 
				"68.153000000000006\r\n" + 
				"68.166333333333341\r\n" + 
				"68.183799999999991\r\n" + 
				"68.198250000000002\r\n" + 
				"68.212999999999994\r\n" + 
				"68.230666666666664\r\n" + 
				"68.252499999999998\r\n" + 
				"68.275000000000006\r\n" + 
				"68.304999999999993\r\n" + 
				"68.328499999999991\r\n" + 
				"68.349999999999994\r\n" + 
				"68.362499999999997\r\n" + 
				"68.373999999999995\r\n" + 
				"68.391499999999994\r\n" + 
				"68.409333333333336\r\n" + 
				"68.424999999999997\r\n" + 
				"68.439500000000010\r\n" + 
				"68.456666666666663\r\n" + 
				"68.473500000000001\r\n" + 
				"68.507000000000005\r\n" + 
				"68.522000000000006\r\n" + 
				"68.537499999999994\r\n" + 
				"68.563000000000002\r\n" + 
				"68.582599999999985\r\n" + 
				"68.593000000000004\r\n" + 
				"68.613666666666660\r\n" + 
				"68.634000000000000\r\n" + 
				"68.694999999999993\r\n" + 
				"68.708749999999981\r\n" + 
				"68.719666666666669\r\n" + 
				"68.730750000000000\r\n" + 
				"68.758999999999986\r\n" + 
				"68.780200000000008\r\n" + 
				"68.794666666666672\r\n" + 
				"68.809500000000000\r\n" + 
				"68.825166666666675\r\n" + 
				"68.840400000000002\r\n" + 
				"68.863666666666674\r\n" + 
				"68.873999999999995\r\n" + 
				"68.884500000000003\r\n" + 
				"68.909500000000008\r\n" + 
				"68.921999999999997\r\n" + 
				"68.940333333333328\r\n" + 
				"68.953666666666663\r\n" + 
				"68.972818181818184\r\n" + 
				"68.983857142857133\r\n" + 
				"68.994818181818175\r\n" + 
				"69.006500000000003\r\n" + 
				"69.018499999999989\r\n" + 
				"69.031999999999996\r\n" + 
				"69.044499999999985\r\n" + 
				"69.056500000000000\r\n" + 
				"69.067285714285717\r\n" + 
				"69.076499999999996\r\n" + 
				"69.085899999999995\r\n" + 
				"69.099999999999994\r\n" + 
				"69.112499999999997\r\n" + 
				"69.122666666666660\r\n" + 
				"69.131799999999998\r\n" + 
				"69.144500000000008\r\n" + 
				"69.163499999999999\r\n" + 
				"69.177374999999998\r\n" + 
				"69.194999999999993\r\n" + 
				"69.210000000000008\r\n" + 
				"69.231499999999997\r\n" + 
				"69.247999999999990\r\n" + 
				"69.266666666666666\r\n" + 
				"69.283000000000001\r\n" + 
				"69.303666666666672\r\n" + 
				"69.317333333333337\r\n" + 
				"69.327249999999992\r\n" + 
				"69.339333333333329\r\n" + 
				"69.354999999999990\r\n" + 
				"69.376500000000007\r\n" + 
				"69.394000000000005\r\n" + 
				"69.408222222222221\r\n" + 
				"69.428600000000017\r\n" + 
				"69.453000000000003\r\n" + 
				"69.466333333333338\r\n" + 
				"69.490499999999997\r\n" + 
				"69.509500000000003\r\n" + 
				"69.541333333333341\r\n" + 
				"69.562999999999988\r\n" + 
				"69.579499999999996\r\n" + 
				"69.593000000000004\r\n" + 
				"69.606666666666669\r\n" + 
				"69.622799999999998\r\n" + 
				"69.640000000000001\r\n" + 
				"69.653250000000014\r\n" + 
				"69.671999999999997\r\n" + 
				"69.685999999999993\r\n" + 
				"69.710333333333338\r\n" + 
				"69.740666666666655\r\n" + 
				"69.756666666666675\r\n" + 
				"69.773499999999999\r\n" + 
				"69.812500000000000\r\n" + 
				"69.833500000000001\r\n" + 
				"69.847999999999999\r\n" + 
				"69.867999999999981\r\n" + 
				"69.884999999999991\r\n" + 
				"69.898000000000010\r\n" + 
				"69.914333333333346\r\n" + 
				"69.935142857142850\r\n" + 
				"69.946599999999989\r\n" + 
				"69.958374999999990\r\n" + 
				"69.970100000000002\r\n" + 
				"69.980428571428575\r\n" + 
				"69.991499999999988\r\n" + 
				"70.003500000000003\r\n" + 
				"70.014499999999998\r\n" + 
				"70.026499999999999\r\n" + 
				"70.035499999999999\r\n" + 
				"70.044499999999985\r\n" + 
				"70.056500000000000\r\n" + 
				"70.069499999999991\r\n" + 
				"70.085538461538462\r\n" + 
				"70.100000000000009\r\n" + 
				"70.113000000000000\r\n" + 
				"70.125181818181815\r\n" + 
				"70.140999999999991\r\n" + 
				"70.164000000000001\r\n" + 
				"70.179500000000004\r\n" + 
				"70.199600000000004\r\n" + 
				"70.215666666666664\r\n" + 
				"70.227999999999994\r\n" + 
				"70.248999999999995\r\n" + 
				"70.262249999999995\r\n" + 
				"70.280333333333331\r\n" + 
				"70.300000000000011\r\n" + 
				"70.316000000000003\r\n" + 
				"70.328666666666663\r\n" + 
				"70.359599999999986\r\n" + 
				"70.376000000000005\r\n" + 
				"70.406499999999994\r\n" + 
				"70.425000000000011\r\n" + 
				"70.447499999999991\r\n" + 
				"70.466999999999999\r\n" + 
				"70.481499999999997\r\n" + 
				"70.500000000000000\r\n" + 
				"70.519499999999994\r\n" + 
				"70.530857142857144\r\n" + 
				"70.545333333333346\r\n" + 
				"70.561000000000007\r\n" + 
				"70.575999999999993\r\n" + 
				"70.593000000000004\r\n" + 
				"70.617999999999995\r\n" + 
				"70.638999999999996\r\n" + 
				"70.658333333333346\r\n" + 
				"70.683999999999997\r\n" + 
				"70.700249999999997\r\n" + 
				"70.726200000000006\r\n" + 
				"70.741000000000000\r\n" + 
				"70.759500000000003\r\n" + 
				"70.774000000000001\r\n" + 
				"70.787666666666667\r\n" + 
				"70.805400000000006\r\n" + 
				"70.817999999999998\r\n" + 
				"70.834999999999994\r\n" + 
				"70.849199999999996\r\n" + 
				"70.858333333333334\r\n" + 
				"70.876571428571438\r\n" + 
				"70.891000000000005\r\n" + 
				"70.908000000000001\r\n" + 
				"70.923666666666676\r\n" + 
				"70.934400000000011\r\n" + 
				"70.945999999999984\r\n" + 
				"70.957142857142856\r\n" + 
				"70.967249999999993\r\n" + 
				"70.982916666666668\r\n" + 
				"70.999384615384614\r\n" + 
				"71.012500000000003\r\n" + 
				"71.023500000000013\r\n" + 
				"71.035499999999999\r\n" + 
				"71.047500000000014\r\n" + 
				"71.059000000000012\r\n" + 
				"71.070999999999998\r\n" + 
				"71.081500000000005\r\n" + 
				"71.091700000000003\r\n" + 
				"71.101428571428571\r\n" + 
				"71.113900000000001\r\n" + 
				"71.129899999999992\r\n" + 
				"71.144399999999990\r\n" + 
				"71.162333333333336\r\n" + 
				"71.176000000000002\r\n" + 
				"71.188166666666675\r\n" + 
				"71.215333333333334\r\n" + 
				"71.278400000000005\r\n" + 
				"71.290750000000003\r\n" + 
				"71.310599999999994\r\n" + 
				"71.327333333333328\r\n" + 
				"71.357333333333330\r\n" + 
				"71.372999999999990\r\n" + 
				"71.388666666666666\r\n" + 
				"71.400499999999994\r\n" + 
				"71.421999999999997\r\n" + 
				"71.440999999999988\r\n" + 
				"71.459999999999994\r\n" + 
				"71.490666666666655\r\n" + 
				"71.503500000000003\r\n" + 
				"71.518749999999997\r\n" + 
				"71.530999999999992\r\n" + 
				"71.544666666666657\r\n" + 
				"71.558999999999997\r\n" + 
				"71.572249999999997\r\n" + 
				"71.598500000000001\r\n" + 
				"71.620000000000005\r\n" + 
				"71.651800000000009\r\n" + 
				"71.672800000000009\r\n" + 
				"71.683000000000007\r\n" + 
				"71.698749999999990\r\n" + 
				"71.719499999999996\r\n" + 
				"71.741666666666674\r\n" + 
				"71.754999999999995\r\n" + 
				"71.766000000000005\r\n" + 
				"71.786499999999990\r\n" + 
				"71.809500000000000\r\n" + 
				"71.823999999999998\r\n" + 
				"71.839999999999989\r\n" + 
				"71.851250000000007\r\n" + 
				"71.873428571428562\r\n" + 
				"71.890999999999991\r\n" + 
				"71.910499999999999\r\n" + 
				"71.922000000000011\r\n" + 
				"71.936400000000006\r\n" + 
				"71.951250000000002\r\n" + 
				"71.967909090909089\r\n" + 
				"71.984000000000009\r\n" + 
				"71.997999999999990\r\n" + 
				"72.009499999999989\r\n" + 
				"72.020499999999984\r\n" + 
				"72.029499999999999\r\n" + 
				"72.038499999999999\r\n" + 
				"72.050500000000000\r\n" + 
				"72.062500000000000\r\n" + 
				"72.071500000000000\r\n" + 
				"72.080500000000001\r\n" + 
				"72.092499999999987\r\n" + 
				"72.103250000000003\r\n" + 
				"72.116499999999988\r\n" + 
				"72.130625000000009\r\n" + 
				"72.143666666666675\r\n" + 
				"72.163399999999996\r\n" + 
				"72.179666666666662\r\n" + 
				"72.194000000000003\r\n" + 
				"72.204800000000006\r\n" + 
				"72.216333333333338\r\n" + 
				"72.226999999999990\r\n" + 
				"72.244000000000000\r\n" + 
				"72.257999999999996\r\n" + 
				"72.275999999999996\r\n" + 
				"72.293250000000000\r\n" + 
				"72.314999999999998\r\n" + 
				"72.342285714285723\r\n" + 
				"72.361999999999995\r\n" + 
				"72.376199999999997\r\n" + 
				"72.404400000000010\r\n" + 
				"72.424000000000007\r\n" + 
				"72.440833333333330\r\n" + 
				"72.454999999999998\r\n" + 
				"72.469333333333338\r\n" + 
				"72.495999999999995\r\n" + 
				"72.518000000000001\r\n" + 
				"72.530500000000004\r\n" + 
				"72.548000000000002\r\n" + 
				"72.566999999999993\r\n" + 
				"72.598333333333343\r\n" + 
				"72.609999999999999\r\n" + 
				"72.621499999999997\r\n" + 
				"72.667500000000004\r\n" + 
				"72.680333333333337\r\n" + 
				"72.692800000000005\r\n" + 
				"72.710999999999999\r\n" + 
				"72.722999999999999\r\n" + 
				"72.744142857142847\r\n" + 
				"72.756000000000000\r\n" + 
				"72.770833333333329\r\n" + 
				"72.790600000000012\r\n" + 
				"72.810800000000000\r\n" + 
				"72.827500000000001\r\n" + 
				"72.844250000000002\r\n" + 
				"72.857249999999993\r\n" + 
				"72.871666666666670\r\n" + 
				"72.899000000000001\r\n" + 
				"72.921666666666667\r\n" + 
				"72.934800000000010\r\n" + 
				"72.945799999999991\r\n" + 
				"72.955999999999989\r\n" + 
				"72.967714285714280\r\n" + 
				"72.976249999999993\r\n" + 
				"72.985999999999990\r\n" + 
				"72.995999999999995\r\n" + 
				"73.006000000000000\r\n" + 
				"73.015181818181816\r\n" + 
				"73.027500000000003\r\n" + 
				"73.035499999999999\r\n" + 
				"73.044499999999985\r\n" + 
				"73.056500000000000\r\n" + 
				"73.067999999999998\r\n" + 
				"73.081857142857132\r\n" + 
				"73.095499999999987\r\n" + 
				"73.111571428571423\r\n" + 
				"73.125000000000000\r\n" + 
				"73.136500000000012\r\n" + 
				"73.148833333333329\r\n" + 
				"73.168499999999995\r\n" + 
				"73.179000000000002\r\n" + 
				"73.188000000000002\r\n" + 
				"73.202799999999996\r\n" + 
				"73.211999999999989\r\n" + 
				"73.231999999999999\r\n" + 
				"73.242333333333335\r\n" + 
				"73.256000000000000\r\n" + 
				"73.271000000000001\r\n" + 
				"73.283999999999992\r\n" + 
				"73.306000000000012\r\n" + 
				"73.322000000000003\r\n" + 
				"73.338999999999999\r\n" + 
				"73.364000000000004\r\n" + 
				"73.375000000000000\r\n" + 
				"73.390999999999991\r\n" + 
				"73.415000000000006\r\n" + 
				"73.438249999999996\r\n" + 
				"73.459333333333333\r\n" + 
				"73.481999999999999\r\n" + 
				"73.494666666666660\r\n" + 
				"73.514666666666656\r\n" + 
				"73.530666666666662\r\n" + 
				"73.540500000000009\r\n" + 
				"73.552000000000007\r\n" + 
				"73.576499999999996\r\n" + 
				"73.602499999999992\r\n" + 
				"73.623666666666665\r\n" + 
				"73.669250000000005\r\n" + 
				"73.690200000000004\r\n" + 
				"73.711749999999995\r\n" + 
				"73.738666666666674\r\n" + 
				"73.752666666666670\r\n" + 
				"73.764499999999998\r\n" + 
				"73.776749999999993\r\n" + 
				"73.792749999999998\r\n" + 
				"73.806285714285721\r\n" + 
				"73.831500000000005\r\n" + 
				"73.849000000000004\r\n" + 
				"73.865500000000011\r\n" + 
				"73.880499999999998\r\n" + 
				"73.893200000000007\r\n" + 
				"73.908749999999998\r\n" + 
				"73.923499999999990\r\n" + 
				"73.936749999999989\r\n" + 
				"73.946500000000000\r\n" + 
				"73.955750000000009\r\n" + 
				"73.968999999999994\r\n" + 
				"73.979874999999993\r\n" + 
				"73.992500000000007\r\n" + 
				"74.002499999999998\r\n" + 
				"74.011499999999998\r\n" + 
				"74.021000000000001\r\n" + 
				"74.032499999999999\r\n" + 
				"74.044499999999985\r\n" + 
				"74.056500000000000\r\n" + 
				"74.066499999999991\r\n" + 
				"74.075900000000004\r\n" + 
				"74.085999999999999\r\n" + 
				"74.095500000000001\r\n" + 
				"74.103500000000011\r\n" + 
				"74.112499999999997\r\n" + 
				"74.124000000000009\r\n" + 
				"74.135799999999989\r\n" + 
				"74.149000000000001\r\n" + 
				"74.168000000000006\r\n" + 
				"74.192666666666668\r\n" + 
				"74.209666666666664\r\n" + 
				"74.225666666666669\r\n" + 
				"74.239142857142852\r\n" + 
				"74.264800000000008\r\n" + 
				"74.299750000000003\r\n" + 
				"74.325999999999993\r\n" + 
				"74.344999999999999\r\n" + 
				"74.358249999999998\r\n" + 
				"74.370999999999995\r\n" + 
				"74.384500000000003\r\n" + 
				"74.398666666666671\r\n" + 
				"74.409500000000008\r\n" + 
				"74.420500000000004\r\n" + 
				"74.444249999999997\r\n" + 
				"74.469999999999999\r\n" + 
				"74.480999999999995\r\n" + 
				"74.492999999999995\r\n" + 
				"74.506500000000003\r\n" + 
				"74.528999999999996\r\n" + 
				"74.545500000000004\r\n" + 
				"74.565499999999986\r\n" + 
				"74.582666666666668\r\n" + 
				"74.592500000000001\r\n" + 
				"74.616000000000000\r\n" + 
				"74.631333333333330\r\n" + 
				"74.658000000000001\r\n" + 
				"74.671999999999997\r\n" + 
				"74.688500000000005\r\n" + 
				"74.705500000000001\r\n" + 
				"74.727499999999992\r\n" + 
				"74.744333333333330\r\n" + 
				"74.760500000000008\r\n" + 
				"74.771333333333345\r\n" + 
				"74.784999999999997\r\n" + 
				"74.798199999999994\r\n" + 
				"74.820499999999996\r\n" + 
				"74.842250000000007\r\n" + 
				"74.855000000000004\r\n" + 
				"74.868500000000012\r\n" + 
				"74.877666666666656\r\n" + 
				"74.890749999999997\r\n" + 
				"74.902999999999992\r\n" + 
				"74.915750000000003\r\n" + 
				"74.926000000000002\r\n" + 
				"74.937874999999991\r\n" + 
				"74.952250000000006\r\n" + 
				"74.962499999999991\r\n" + 
				"74.971666666666650\r\n" + 
				"74.983181818181819\r\n" + 
				"74.995428571428562\r\n" + 
				"75.005499999999998\r\n" + 
				"75.017499999999998\r\n" + 
				"75.031999999999996\r\n" + 
				"75.045500000000004\r\n" + 
				"75.056500000000000\r\n" + 
				"75.066999999999993\r\n" + 
				"75.078999999999994\r\n" + 
				"75.088999999999999\r\n" + 
				"75.099000000000004\r\n" + 
				"75.108500000000006\r\n" + 
				"75.121625000000009\r\n" + 
				"75.136375000000001\r\n" + 
				"75.150333333333336\r\n" + 
				"75.170333333333332\r\n" + 
				"75.189666666666668\r\n" + 
				"75.206333333333319\r\n" + 
				"75.215000000000003\r\n" + 
				"75.245199999999997\r\n" + 
				"75.263666666666666\r\n" + 
				"75.281000000000006\r\n" + 
				"75.300666666666658\r\n" + 
				"75.317800000000005\r\n" + 
				"75.342666666666673\r\n" + 
				"75.359666666666655\r\n" + 
				"75.384500000000003\r\n" + 
				"75.400000000000006\r\n" + 
				"75.420500000000004\r\n" + 
				"75.453249999999997\r\n" + 
				"75.476500000000001\r\n" + 
				"75.504000000000005\r\n" + 
				"75.520499999999998\r\n" + 
				"75.537599999999998\r\n" + 
				"75.546000000000006\r\n" + 
				"75.555999999999997\r\n" + 
				"75.569000000000003\r\n" + 
				"75.580749999999995\r\n" + 
				"75.593500000000006\r\n" + 
				"75.608000000000004\r\n" + 
				"75.616749999999996\r\n" + 
				"75.638000000000005\r\n" + 
				"75.682000000000002\r\n" + 
				"75.701999999999998\r\n" + 
				"75.719999999999999\r\n" + 
				"75.737249999999989\r\n" + 
				"75.758250000000004\r\n" + 
				"75.782750000000007\r\n" + 
				"75.808250000000001\r\n" + 
				"75.838000000000008\r\n" + 
				"75.861000000000004\r\n" + 
				"75.873999999999995\r\n" + 
				"75.896999999999991\r\n" + 
				"75.907333333333327\r\n" + 
				"75.923714285714283\r\n" + 
				"75.936166666666665\r\n" + 
				"75.951666666666668\r\n" + 
				"75.962833333333322\r\n" + 
				"75.977333333333334\r\n" + 
				"75.990499999999997\r\n" + 
				"76.001000000000005\r\n" + 
				"76.011499999999998\r\n" + 
				"76.023500000000013\r\n" + 
				"76.033875000000009\r\n" + 
				"76.044499999999985\r\n" + 
				"76.056500000000000\r\n" + 
				"76.068500000000000\r\n" + 
				"76.076499999999996\r\n" + 
				"76.086272727272728\r\n" + 
				"76.098285714285709\r\n" + 
				"76.110222222222234\r\n" + 
				"76.121111111111119\r\n" + 
				"76.141142857142867\r\n" + 
				"76.157749999999993\r\n" + 
				"76.167800000000014\r\n" + 
				"76.189571428571426\r\n" + 
				"76.212799999999987\r\n" + 
				"76.225999999999999\r\n" + 
				"76.249333333333325\r\n" + 
				"76.263000000000005\r\n" + 
				"76.275500000000008\r\n" + 
				"76.311000000000007\r\n" + 
				"76.331999999999994\r\n" + 
				"76.350999999999999\r\n" + 
				"76.366666666666674\r\n" + 
				"76.387333333333331\r\n" + 
				"76.409999999999997\r\n" + 
				"76.437375000000003\r\n" + 
				"76.460000000000008\r\n" + 
				"76.472999999999999\r\n" + 
				"76.492400000000004\r\n" + 
				"76.513000000000005\r\n" + 
				"76.537999999999997\r\n" + 
				"76.550333333333342\r\n" + 
				"76.572499999999991\r\n" + 
				"76.582333333333338\r\n" + 
				"76.595749999999995\r\n" + 
				"76.626999999999995\r\n" + 
				"76.644000000000005\r\n" + 
				"76.666400000000010\r\n" + 
				"76.679999999999993\r\n" + 
				"76.698999999999998\r\n" + 
				"76.711499999999987\r\n" + 
				"76.728750000000005\r\n" + 
				"76.742666666666665\r\n" + 
				"76.759333333333345\r\n" + 
				"76.769000000000005\r\n" + 
				"76.780249999999995\r\n" + 
				"76.791999999999987\r\n" + 
				"76.802333333333323\r\n" + 
				"76.813999999999993\r\n" + 
				"76.828666666666678\r\n" + 
				"76.847749999999991\r\n" + 
				"76.861000000000004\r\n" + 
				"76.878000000000000\r\n" + 
				"76.897999999999996\r\n" + 
				"76.915500000000009\r\n" + 
				"76.925500000000000\r\n" + 
				"76.936000000000007\r\n" + 
				"76.945666666666668\r\n" + 
				"76.956600000000009\r\n" + 
				"76.965875000000011\r\n" + 
				"76.976500000000001\r\n" + 
				"76.986500000000007\r\n" + 
				"77.000100000000003\r\n" + 
				"77.010999999999996\r\n" + 
				"77.021499999999989\r\n" + 
				"77.032499999999999\r\n" + 
				"77.044499999999985\r\n" + 
				"77.056500000000000\r\n" + 
				"77.069499999999991\r\n" + 
				"77.084818181818179\r\n" + 
				"77.098666666666659\r\n" + 
				"77.110333333333330\r\n" + 
				"77.122428571428571\r\n" + 
				"77.136200000000002\r\n" + 
				"77.149000000000015\r\n" + 
				"77.162000000000006\r\n" + 
				"77.180250000000001\r\n" + 
				"77.191999999999993\r\n" + 
				"77.208333333333329\r\n" + 
				"77.224750000000000\r\n" + 
				"77.254999999999995\r\n" + 
				"77.280000000000001\r\n" + 
				"77.302250000000001\r\n" + 
				"77.325999999999993\r\n" + 
				"77.351200000000006\r\n" + 
				"77.372000000000000\r\n" + 
				"77.384333333333345\r\n" + 
				"77.399400000000000\r\n" + 
				"77.418499999999995\r\n" + 
				"77.436333333333337\r\n" + 
				"77.454000000000008\r\n" + 
				"77.478999999999999\r\n" + 
				"77.498000000000005\r\n" + 
				"77.512500000000003\r\n" + 
				"77.524833333333333\r\n" + 
				"77.553166666666669\r\n" + 
				"77.567999999999998\r\n" + 
				"77.581999999999994\r\n" + 
				"77.593000000000004\r\n" + 
				"77.608000000000004\r\n" + 
				"77.627499999999998\r\n" + 
				"77.654499999999999\r\n" + 
				"77.668499999999995\r\n" + 
				"77.681333333333342\r\n" + 
				"77.703499999999991\r\n" + 
				"77.726249999999993\r\n" + 
				"77.742000000000004\r\n" + 
				"77.757999999999996\r\n" + 
				"77.787250000000000\r\n" + 
				"77.804000000000002\r\n" + 
				"77.819000000000003\r\n" + 
				"77.831333333333347\r\n" + 
				"77.852799999999988\r\n" + 
				"77.871499999999997\r\n" + 
				"77.888999999999996\r\n" + 
				"77.904444444444437\r\n" + 
				"77.924833333333325\r\n" + 
				"77.938249999999996\r\n" + 
				"77.949999999999989\r\n" + 
				"77.963200000000001\r\n" + 
				"77.975666666666655\r\n" + 
				"77.986499999999992\r\n" + 
				"77.997100000000003\r\n" + 
				"78.008499999999998\r\n" + 
				"78.020499999999984\r\n" + 
				"78.032499999999999\r\n" + 
				"78.044499999999985\r\n" + 
				"78.057000000000002\r\n" + 
				"78.066499999999991\r\n" + 
				"78.076000000000008\r\n" + 
				"78.085999999999999\r\n" + 
				"78.095500000000001\r\n" + 
				"78.107111111111124\r\n" + 
				"78.121666666666670\r\n" + 
				"78.131000000000000\r\n" + 
				"78.140000000000001\r\n" + 
				"78.158285714285725\r\n" + 
				"78.170000000000002\r\n" + 
				"78.185400000000001\r\n" + 
				"78.199799999999996\r\n" + 
				"78.210999999999999\r\n" + 
				"78.222666666666669\r\n" + 
				"78.234499999999997\r\n" + 
				"78.247333333333330\r\n" + 
				"78.259333333333345\r\n" + 
				"78.269333333333336\r\n" + 
				"78.283333333333346\r\n" + 
				"78.311499999999995\r\n" + 
				"78.328499999999991\r\n" + 
				"78.355999999999995\r\n" + 
				"78.390199999999993\r\n" + 
				"78.405666666666662\r\n" + 
				"78.422499999999999\r\n" + 
				"78.453000000000003\r\n" + 
				"78.469999999999999\r\n" + 
				"78.503500000000003\r\n" + 
				"78.523000000000010\r\n" + 
				"78.539000000000001\r\n" + 
				"78.558750000000003\r\n" + 
				"78.575249999999983\r\n" + 
				"78.593800000000002\r\n" + 
				"78.623499999999993\r\n" + 
				"78.646999999999991\r\n" + 
				"78.662999999999997\r\n" + 
				"78.676333333333332\r\n" + 
				"78.693166666666670\r\n" + 
				"78.710749999999990\r\n" + 
				"78.729333333333329\r\n" + 
				"78.750000000000000\r\n" + 
				"78.770249999999990\r\n" + 
				"78.809600000000003\r\n" + 
				"78.829000000000008\r\n" + 
				"78.859799999999993\r\n" + 
				"78.873999999999995\r\n" + 
				"78.885333333333335\r\n" + 
				"78.901600000000002\r\n" + 
				"78.919749999999993\r\n" + 
				"78.934000000000012\r\n" + 
				"78.947999999999993\r\n" + 
				"78.963125000000005\r\n" + 
				"78.976500000000001\r\n" + 
				"78.988249999999994\r\n" + 
				"79.000454545454545\r\n" + 
				"79.012999999999991\r\n" + 
				"79.024500000000003\r\n" + 
				"79.034999999999982\r\n" + 
				"79.044499999999985\r\n" + 
				"79.056600000000017\r\n" + 
				"79.066499999999991\r\n" + 
				"79.076545454545439\r\n" + 
				"79.088111111111104\r\n" + 
				"79.099714285714271\r\n" + 
				"79.109999999999999\r\n" + 
				"79.122124999999983\r\n" + 
				"79.131000000000000\r\n" + 
				"79.142499999999984\r\n" + 
				"79.154249999999990\r\n" + 
				"79.169599999999988\r\n" + 
				"79.185000000000016\r\n" + 
				"79.204499999999996\r\n" + 
				"79.216000000000008\r\n" + 
				"79.239499999999992\r\n" + 
				"79.257000000000005\r\n" + 
				"79.271666666666661\r\n" + 
				"79.282666666666657\r\n" + 
				"79.308499999999995\r\n" + 
				"79.323999999999998\r\n" + 
				"79.352249999999998\r\n" + 
				"79.367000000000004\r\n" + 
				"79.378333333333330\r\n" + 
				"79.393000000000001\r\n" + 
				"79.409500000000008\r\n" + 
				"79.438500000000005\r\n" + 
				"79.465000000000003\r\n" + 
				"79.483000000000004\r\n" + 
				"79.498999999999995\r\n" + 
				"79.527999999999992\r\n" + 
				"79.540999999999997\r\n" + 
				"79.560750000000013\r\n" + 
				"79.580500000000001\r\n" + 
				"79.600000000000009\r\n" + 
				"79.608999999999995\r\n" + 
				"79.620750000000001\r\n" + 
				"79.639333333333340\r\n" + 
				"79.655000000000001\r\n" + 
				"79.665999999999997\r\n" + 
				"79.674499999999995\r\n" + 
				"79.700999999999993\r\n" + 
				"79.719666666666669\r\n" + 
				"79.747399999999999\r\n" + 
				"79.766999999999996\r\n" + 
				"79.788499999999999\r\n" + 
				"79.818399999999997\r\n" + 
				"79.853999999999999\r\n" + 
				"79.871000000000009\r\n" + 
				"79.883333333333340\r\n" + 
				"79.896285714285710\r\n" + 
				"79.907428571428582\r\n" + 
				"79.924500000000009\r\n" + 
				"79.939999999999984\r\n" + 
				"79.955250000000007\r\n" + 
				"79.965000000000003\r\n" + 
				"79.974571428571423\r\n" + 
				"79.984499999999997\r\n" + 
				"79.995777777777775\r\n" + 
				"80.007555555555555\r\n" + 
				"80.017000000000010\r\n" + 
				"80.026499999999999\r\n" + 
				"80.038500000000013\r\n" + 
				"80.050500000000000\r\n" + 
				"80.062500000000000\r\n" + 
				"80.074500000000000\r\n" + 
				"80.086500000000015\r\n" + 
				"80.097700000000003\r\n" + 
				"80.109499999999997\r\n" + 
				"80.118500000000012\r\n" + 
				"80.127399999999994\r\n" + 
				"80.137749999999997\r\n" + 
				"80.149000000000001\r\n" + 
				"80.164999999999992\r\n" + 
				"80.181142857142859\r\n" + 
				"80.198599999999985\r\n" + 
				"80.211999999999989\r\n" + 
				"80.229249999999993\r\n" + 
				"80.248000000000005\r\n" + 
				"80.276000000000010\r\n" + 
				"80.299499999999995\r\n" + 
				"80.314999999999998\r\n" + 
				"80.352499999999992\r\n" + 
				"80.375500000000002\r\n" + 
				"80.402999999999992\r\n" + 
				"80.423000000000002\r\n" + 
				"80.441499999999991\r\n" + 
				"80.456500000000005\r\n" + 
				"80.468999999999994\r\n" + 
				"80.490499999999997\r\n" + 
				"80.513999999999996\r\n" + 
				"80.529666666666671\r\n" + 
				"80.546999999999997\r\n" + 
				"80.560000000000002\r\n" + 
				"80.572333333333333\r\n" + 
				"80.593999999999994\r\n" + 
				"80.609571428571442\r\n" + 
				"80.640799999999999\r\n" + 
				"80.685999999999993\r\n" + 
				"80.708333333333329\r\n" + 
				"80.741000000000000\r\n" + 
				"80.754500000000007\r\n" + 
				"80.767600000000002\r\n" + 
				"80.784333333333336\r\n" + 
				"80.795249999999996\r\n" + 
				"80.814666666666668\r\n" + 
				"80.846499999999992\r\n" + 
				"80.873199999999997\r\n" + 
				"80.894000000000005\r\n" + 
				"80.912166666666678\r\n" + 
				"80.920000000000002\r\n" + 
				"80.933000000000007\r\n" + 
				"80.946999999999989\r\n" + 
				"80.958666666666659\r\n" + 
				"80.966000000000008\r\n" + 
				"80.975999999999999\r\n" + 
				"80.990099999999998\r\n" + 
				"81.002499999999998\r\n" + 
				"81.013777777777761\r\n" + 
				"81.028000000000020\r\n" + 
				"81.040999999999997\r\n" + 
				"81.051999999999992\r\n" + 
				"81.063499999999991\r\n" + 
				"81.077399999999983\r\n" + 
				"81.085499999999996\r\n" + 
				"81.094200000000001\r\n" + 
				"81.105857142857147\r\n" + 
				"81.114499999999992\r\n" + 
				"81.124090909090924\r\n" + 
				"81.139200000000002\r\n" + 
				"81.150142857142868\r\n" + 
				"81.163199999999989\r\n" + 
				"81.178333333333342\r\n" + 
				"81.196500000000000\r\n" + 
				"81.221000000000004\r\n" + 
				"81.235500000000002\r\n" + 
				"81.246000000000009\r\n" + 
				"81.258250000000004\r\n" + 
				"81.275499999999994\r\n" + 
				"81.293666666666667\r\n" + 
				"81.309000000000012\r\n" + 
				"81.323999999999998\r\n" + 
				"81.337250000000012\r\n" + 
				"81.363000000000000\r\n" + 
				"81.378999999999991\r\n" + 
				"81.392666666666670\r\n" + 
				"81.420000000000002\r\n" + 
				"81.430000000000007\r\n" + 
				"81.456333333333319\r\n" + 
				"81.497800000000012\r\n" + 
				"81.513999999999996\r\n" + 
				"81.529333333333341\r\n" + 
				"81.543199999999999\r\n" + 
				"81.555000000000007\r\n" + 
				"81.570500000000010\r\n" + 
				"81.593999999999994\r\n" + 
				"81.625333333333330\r\n" + 
				"81.640500000000003\r\n" + 
				"81.655000000000001\r\n" + 
				"81.685333333333332\r\n" + 
				"81.706500000000005\r\n" + 
				"81.718333333333334\r\n" + 
				"81.742999999999995\r\n" + 
				"81.755249999999990\r\n" + 
				"81.764000000000010\r\n" + 
				"81.775999999999996\r\n" + 
				"81.790199999999999\r\n" + 
				"81.811999999999998\r\n" + 
				"81.825666666666663\r\n" + 
				"81.842200000000005\r\n" + 
				"81.862499999999997\r\n" + 
				"81.876000000000005\r\n" + 
				"81.890000000000001\r\n" + 
				"81.902333333333331\r\n" + 
				"81.920000000000002\r\n" + 
				"81.936250000000001\r\n" + 
				"81.947624999999988\r\n" + 
				"81.963999999999999\r\n" + 
				"81.977999999999994\r\n" + 
				"81.992749999999987\r\n" + 
				"82.005153846153846\r\n" + 
				"82.017555555555560\r\n" + 
				"82.028000000000006\r\n" + 
				"82.039500000000004\r\n" + 
				"82.050500000000000\r\n" + 
				"82.062500000000000\r\n" + 
				"82.074499999999986\r\n" + 
				"82.084699999999998\r\n" + 
				"82.096000000000004\r\n" + 
				"82.105599999999995\r\n" + 
				"82.119000000000014\r\n" + 
				"82.129444444444445\r\n" + 
				"82.141199999999998\r\n" + 
				"82.154250000000005\r\n" + 
				"82.165500000000009\r\n" + 
				"82.181750000000008\r\n" + 
				"82.192999999999998\r\n" + 
				"82.203000000000003\r\n" + 
				"82.216499999999996\r\n" + 
				"82.238333333333330\r\n" + 
				"82.272999999999996\r\n" + 
				"82.296000000000006\r\n" + 
				"82.309666666666672\r\n" + 
				"82.332999999999998\r\n" + 
				"82.346000000000004\r\n" + 
				"82.362000000000009\r\n" + 
				"82.378000000000000\r\n" + 
				"82.396999999999991\r\n" + 
				"82.416800000000009\r\n" + 
				"82.435000000000002\r\n" + 
				"82.446333333333328\r\n" + 
				"82.456666666666663\r\n" + 
				"82.468666666666664\r\n" + 
				"82.492999999999995\r\n" + 
				"82.510000000000005\r\n" + 
				"82.527000000000001\r\n" + 
				"82.546666666666667\r\n" + 
				"82.555999999999997\r\n" + 
				"82.572999999999993\r\n" + 
				"82.587500000000006\r\n" + 
				"82.606999999999999\r\n" + 
				"82.623000000000005\r\n" + 
				"82.641999999999996\r\n" + 
				"82.660799999999995\r\n" + 
				"82.677000000000007\r\n" + 
				"82.696499999999986\r\n" + 
				"82.707666666666668\r\n" + 
				"82.723874999999992\r\n" + 
				"82.768000000000001\r\n" + 
				"82.784333333333336\r\n" + 
				"82.797499999999999\r\n" + 
				"82.811999999999998\r\n" + 
				"82.834999999999994\r\n" + 
				"82.847571428571413\r\n" + 
				"82.858499999999992\r\n" + 
				"82.876666666666665\r\n" + 
				"82.893000000000001\r\n" + 
				"82.912749999999988\r\n" + 
				"82.933599999999998\r\n" + 
				"82.945999999999998\r\n" + 
				"82.962000000000003\r\n" + 
				"82.974916666666658\r\n" + 
				"82.987499999999997\r\n" + 
				"83.000818181818190\r\n" + 
				"83.009499999999989\r\n" + 
				"83.018499999999989\r\n" + 
				"83.027500000000003\r\n" + 
				"83.036500000000004\r\n" + 
				"83.047500000000014\r\n" + 
				"83.059090909090912\r\n" + 
				"83.071500000000000\r\n" + 
				"83.083099999999988\r\n" + 
				"83.094499999999982\r\n" + 
				"83.105000000000004\r\n" + 
				"83.119000000000000\r\n" + 
				"83.132000000000005\r\n" + 
				"83.146000000000001\r\n" + 
				"83.158666666666662\r\n" + 
				"83.180000000000007\r\n" + 
				"83.211999999999989\r\n" + 
				"83.230999999999995\r\n" + 
				"83.245499999999993\r\n" + 
				"83.278999999999996\r\n" + 
				"83.290333333333351\r\n" + 
				"83.303500000000014\r\n" + 
				"83.322000000000003\r\n" + 
				"83.344666666666669\r\n" + 
				"83.369999999999990\r\n" + 
				"83.385000000000005\r\n" + 
				"83.404499999999999\r\n" + 
				"83.433999999999997\r\n" + 
				"83.458333333333329\r\n" + 
				"83.480999999999995\r\n" + 
				"83.500000000000000\r\n" + 
				"83.513249999999999\r\n" + 
				"83.531499999999994\r\n" + 
				"83.544250000000005\r\n" + 
				"83.559600000000017\r\n" + 
				"83.570000000000007\r\n" + 
				"83.604666666666660\r\n" + 
				"83.627000000000010\r\n" + 
				"83.639499999999998\r\n" + 
				"83.653500000000008\r\n" + 
				"83.672250000000005\r\n" + 
				"83.691000000000003\r\n" + 
				"83.710999999999999\r\n" + 
				"83.727999999999994\r\n" + 
				"83.741666666666674\r\n" + 
				"83.757333333333335\r\n" + 
				"83.775999999999996\r\n" + 
				"83.786999999999992\r\n" + 
				"83.799000000000007\r\n" + 
				"83.832400000000007\r\n" + 
				"83.850166666666667\r\n" + 
				"83.866600000000005\r\n" + 
				"83.884000000000000\r\n" + 
				"83.899499999999989\r\n" + 
				"83.911000000000016\r\n" + 
				"83.920500000000004\r\n" + 
				"83.940999999999988\r\n" + 
				"83.959857142857132\r\n" + 
				"83.967399999999998\r\n" + 
				"83.981000000000009\r\n" + 
				"83.995125000000002\r\n" + 
				"84.007230769230773\r\n" + 
				"84.020499999999984\r\n" + 
				"84.032499999999999\r\n" + 
				"84.045000000000002\r\n" + 
				"84.053500000000000\r\n" + 
				"84.061999999999998\r\n" + 
				"84.070499999999996\r\n" + 
				"84.079499999999996\r\n" + 
				"84.091499999999996\r\n" + 
				"84.102285714285699\r\n" + 
				"84.114499999999992\r\n" + 
				"84.127166666666668\r\n" + 
				"84.140538461538455\r\n" + 
				"84.153000000000006\r\n" + 
				"84.165250000000000\r\n" + 
				"84.175666666666658\r\n" + 
				"84.187000000000012\r\n" + 
				"84.203249999999983\r\n" + 
				"84.223333333333329\r\n" + 
				"84.234499999999997\r\n" + 
				"84.249666666666670\r\n" + 
				"84.283500000000004\r\n" + 
				"84.310999999999993\r\n" + 
				"84.337000000000003\r\n" + 
				"84.373000000000005\r\n" + 
				"84.397999999999996\r\n" + 
				"84.414000000000001\r\n" + 
				"84.430999999999997\r\n" + 
				"84.461500000000001\r\n" + 
				"84.474999999999994\r\n" + 
				"84.485749999999996\r\n" + 
				"84.509999999999991\r\n" + 
				"84.532400000000010\r\n" + 
				"84.546999999999997\r\n" + 
				"84.560000000000002\r\n" + 
				"84.584800000000001\r\n" + 
				"84.625666666666675\r\n" + 
				"84.646500000000003\r\n" + 
				"84.679000000000002\r\n" + 
				"84.698333333333323\r\n" + 
				"84.710999999999999\r\n" + 
				"84.741833333333332\r\n" + 
				"84.758666666666670\r\n" + 
				"84.775400000000005\r\n" + 
				"84.794400000000010\r\n" + 
				"84.822000000000003\r\n" + 
				"84.842999999999989\r\n" + 
				"84.854500000000002\r\n" + 
				"84.871399999999994\r\n" + 
				"84.892666666666670\r\n" + 
				"84.915999999999997\r\n" + 
				"84.930500000000009\r\n" + 
				"84.943749999999994\r\n" + 
				"84.958111111111108\r\n" + 
				"84.973249999999993\r\n" + 
				"84.987454545454554\r\n" + 
				"84.999500000000012\r\n" + 
				"85.011499999999998\r\n" + 
				"85.025142857142853\r\n" + 
				"85.038500000000013\r\n" + 
				"85.050500000000000\r\n" + 
				"85.061499999999995\r\n" + 
				"85.073999999999998\r\n" + 
				"85.085499999999996\r\n" + 
				"85.095499999999987\r\n" + 
				"85.110923076923072\r\n" + 
				"85.126249999999999\r\n" + 
				"85.141300000000001\r\n" + 
				"85.156199999999998\r\n" + 
				"85.167999999999992\r\n" + 
				"85.187333333333342\r\n" + 
				"85.204250000000002\r\n" + 
				"85.226666666666659\r\n" + 
				"85.250999999999991\r\n" + 
				"85.265249999999995\r\n" + 
				"85.288666666666686\r\n" + 
				"85.312749999999994\r\n" + 
				"85.338999999999999\r\n" + 
				"85.359333333333325\r\n" + 
				"85.370333333333335\r\n" + 
				"85.384000000000015\r\n" + 
				"85.402000000000001\r\n" + 
				"85.424250000000015\r\n" + 
				"85.441999999999993\r\n" + 
				"85.466000000000008\r\n" + 
				"85.493749999999991\r\n" + 
				"85.510333333333335\r\n" + 
				"85.528000000000006\r\n" + 
				"85.543499999999995\r\n" + 
				"85.558666666666682\r\n" + 
				"85.567333333333337\r\n" + 
				"85.588999999999999\r\n" + 
				"85.604500000000002\r\n" + 
				"85.623999999999995\r\n" + 
				"85.641833333333338\r\n" + 
				"85.658999999999992\r\n" + 
				"85.680000000000007\r\n" + 
				"85.713666666666654\r\n" + 
				"85.726600000000005\r\n" + 
				"85.743499999999997\r\n" + 
				"85.756000000000000\r\n" + 
				"85.767600000000002\r\n" + 
				"85.812333333333342\r\n" + 
				"85.847250000000003\r\n" + 
				"85.860500000000002\r\n" + 
				"85.873999999999981\r\n" + 
				"85.885499999999993\r\n" + 
				"85.897999999999996\r\n" + 
				"85.908500000000004\r\n" + 
				"85.924166666666679\r\n" + 
				"85.944874999999996\r\n" + 
				"85.962916666666658\r\n" + 
				"85.976222222222219\r\n" + 
				"85.990416666666690\r\n" + 
				"86.004000000000005\r\n" + 
				"86.019214285714298\r\n" + 
				"86.032499999999985\r\n" + 
				"86.044499999999985\r\n" + 
				"86.056499999999986\r\n" + 
				"86.069499999999991\r\n" + 
				"86.082499999999996\r\n" + 
				"86.094499999999996\r\n" + 
				"86.106499999999997\r\n" + 
				"86.117199999999997\r\n" + 
				"86.127285714285719\r\n" + 
				"86.144857142857148\r\n" + 
				"86.159599999999998\r\n" + 
				"86.176600000000008\r\n" + 
				"86.194999999999993\r\n" + 
				"86.210285714285718\r\n" + 
				"86.224999999999994\r\n" + 
				"86.246000000000009\r\n" + 
				"86.258499999999998\r\n" + 
				"86.271666666666661\r\n" + 
				"86.318600000000004\r\n" + 
				"86.331666666666663\r\n" + 
				"86.346333333333334\r\n" + 
				"86.361249999999998\r\n" + 
				"86.369666666666674\r\n" + 
				"86.384333333333345\r\n" + 
				"86.398000000000010\r\n" + 
				"86.408000000000001\r\n" + 
				"86.437333333333342\r\n" + 
				"86.455399999999997\r\n" + 
				"86.480999999999995\r\n" + 
				"86.492999999999995\r\n" + 
				"86.509500000000003\r\n" + 
				"86.538142857142859\r\n" + 
				"86.558500000000009\r\n" + 
				"86.575333333333333\r\n" + 
				"86.599500000000006\r\n" + 
				"86.629999999999995\r\n" + 
				"86.652666666666661\r\n" + 
				"86.683000000000007\r\n" + 
				"86.701999999999998\r\n" + 
				"86.729666666666660\r\n" + 
				"86.739000000000004\r\n" + 
				"86.756500000000003\r\n" + 
				"86.767249999999990\r\n" + 
				"86.784400000000005\r\n" + 
				"86.804000000000002\r\n" + 
				"86.820999999999998\r\n" + 
				"86.840499999999992\r\n" + 
				"86.856666666666669\r\n" + 
				"86.877499999999984\r\n" + 
				"86.908500000000004\r\n" + 
				"86.927500000000009\r\n" + 
				"86.938500000000019\r\n" + 
				"86.949500000000000\r\n" + 
				"86.961714285714280\r\n" + 
				"86.974899999999991\r\n" + 
				"86.986571428571423\r\n" + 
				"86.999099999999999\r\n" + 
				"87.009000000000015\r\n" + 
				"87.019583333333330\r\n" + 
				"87.032799999999995\r\n" + 
				"87.044499999999985\r\n" + 
				"87.056499999999986\r\n" + 
				"87.066499999999991\r\n" + 
				"87.076500000000010\r\n" + 
				"87.089111111111094\r\n" + 
				"87.101249999999993\r\n" + 
				"87.114285714285714\r\n" + 
				"87.122500000000002\r\n" + 
				"87.136249999999990\r\n" + 
				"87.154166666666683\r\n" + 
				"87.174999999999997\r\n" + 
				"87.185749999999999\r\n" + 
				"87.210624999999993\r\n" + 
				"87.247000000000000\r\n" + 
				"87.262000000000000\r\n" + 
				"87.275000000000006\r\n" + 
				"87.302999999999997\r\n" + 
				"87.314599999999999\r\n" + 
				"87.328499999999991\r\n" + 
				"87.340499999999992\r\n" + 
				"87.353333333333339\r\n" + 
				"87.367999999999995\r\n" + 
				"87.384000000000000\r\n" + 
				"87.406499999999994\r\n" + 
				"87.421999999999997\r\n" + 
				"87.434500000000014\r\n" + 
				"87.454999999999998\r\n" + 
				"87.484666666666669\r\n" + 
				"87.505500000000012\r\n" + 
				"87.524333333333331\r\n" + 
				"87.537999999999997\r\n" + 
				"87.555499999999995\r\n" + 
				"87.567999999999998\r\n" + 
				"87.602999999999994\r\n" + 
				"87.616749999999996\r\n" + 
				"87.633250000000004\r\n" + 
				"87.660000000000011\r\n" + 
				"87.691999999999993\r\n" + 
				"87.711500000000001\r\n" + 
				"87.727999999999994\r\n" + 
				"87.749000000000009\r\n" + 
				"87.759600000000006\r\n" + 
				"87.775999999999996\r\n" + 
				"87.784999999999997\r\n" + 
				"87.799000000000007\r\n" + 
				"87.821600000000004\r\n" + 
				"87.837999999999994\r\n" + 
				"87.852999999999994\r\n" + 
				"87.863500000000002\r\n" + 
				"87.879499999999979\r\n" + 
				"87.902999999999992\r\n" + 
				"87.914999999999992\r\n" + 
				"87.926999999999992\r\n" + 
				"87.943499999999986\r\n" + 
				"87.958666666666659\r\n" + 
				"87.971699999999998\r\n" + 
				"87.983500000000006\r\n" + 
				"87.995000000000005\r\n" + 
				"88.006500000000003\r\n" + 
				"88.017499999999998\r\n" + 
				"88.029499999999999\r\n" + 
				"88.041499999999999\r\n" + 
				"88.050500000000000\r\n" + 
				"88.059000000000012\r\n" + 
				"88.072499999999991\r\n" + 
				"88.085499999999982\r\n" + 
				"88.098625000000013\r\n" + 
				"88.111499999999992\r\n" + 
				"88.123999999999995\r\n" + 
				"88.137249999999995\r\n" + 
				"88.150333333333336\r\n" + 
				"88.161333333333332\r\n" + 
				"88.175250000000005\r\n" + 
				"88.209333333333348\r\n" + 
				"88.225750000000005\r\n" + 
				"88.238666666666674\r\n" + 
				"88.260499999999993\r\n" + 
				"88.275750000000002\r\n" + 
				"88.317000000000007\r\n" + 
				"88.347499999999997\r\n" + 
				"88.360249999999994\r\n" + 
				"88.377000000000010\r\n" + 
				"88.398400000000009\r\n" + 
				"88.411499999999990\r\n" + 
				"88.432249999999996\r\n" + 
				"88.449249999999992\r\n" + 
				"88.465499999999992\r\n" + 
				"88.480666666666664\r\n" + 
				"88.505499999999998\r\n" + 
				"88.522000000000006\r\n" + 
				"88.545000000000002\r\n" + 
				"88.556499999999986\r\n" + 
				"88.572999999999993\r\n" + 
				"88.587400000000002\r\n" + 
				"88.654000000000011\r\n" + 
				"88.677000000000007\r\n" + 
				"88.716499999999996\r\n" + 
				"88.738500000000002\r\n" + 
				"88.751000000000005\r\n" + 
				"88.765500000000003\r\n" + 
				"88.778750000000002\r\n" + 
				"88.795999999999992\r\n" + 
				"88.815599999999989\r\n" + 
				"88.826000000000008\r\n" + 
				"88.842666666666659\r\n" + 
				"88.855166666666662\r\n" + 
				"88.867333333333349\r\n" + 
				"88.892249999999990\r\n" + 
				"88.903250000000000\r\n" + 
				"88.925200000000004\r\n" + 
				"88.938000000000002\r\n" + 
				"88.948749999999990\r\n" + 
				"88.962699999999998\r\n" + 
				"88.977583333333328\r\n" + 
				"88.988874999999993\r\n" + 
				"88.998500000000007\r\n" + 
				"89.009222222222235\r\n" + 
				"89.021000000000001\r\n" + 
				"89.032499999999985\r\n" + 
				"89.044499999999985\r\n" + 
				"89.056499999999986\r\n" + 
				"89.068999999999988\r\n" + 
				"89.080499999999986\r\n" + 
				"89.089500000000001\r\n" + 
				"89.101699999999994\r\n" + 
				"89.111571428571423\r\n" + 
				"89.123999999999995\r\n" + 
				"89.137888888888895\r\n" + 
				"89.156500000000008\r\n" + 
				"89.174250000000001\r\n" + 
				"89.191999999999993\r\n" + 
				"89.209999999999994\r\n" + 
				"89.223799999999983\r\n" + 
				"89.246000000000009\r\n" + 
				"89.261249999999990\r\n" + 
				"89.279000000000011\r\n" + 
				"89.290999999999997\r\n" + 
				"89.313000000000002\r\n" + 
				"89.325571428571408\r\n" + 
				"89.343333333333348\r\n" + 
				"89.355999999999995\r\n" + 
				"89.368999999999986\r\n" + 
				"89.395750000000007\r\n" + 
				"89.414142857142863\r\n" + 
				"89.429500000000004\r\n" + 
				"89.448333333333323\r\n" + 
				"89.463999999999999\r\n" + 
				"89.499499999999998\r\n" + 
				"89.511499999999998\r\n" + 
				"89.522500000000008\r\n" + 
				"89.534000000000006\r\n" + 
				"89.560000000000002\r\n" + 
				"89.572666666666649\r\n" + 
				"89.618333333333339\r\n" + 
				"89.656750000000002\r\n" + 
				"89.671999999999983\r\n" + 
				"89.686000000000007\r\n" + 
				"89.711333333333314\r\n" + 
				"89.732799999999983\r\n" + 
				"89.749499999999998\r\n" + 
				"89.775999999999996\r\n" + 
				"89.802000000000007\r\n" + 
				"89.824500000000000\r\n" + 
				"89.837428571428561\r\n" + 
				"89.854249999999993\r\n" + 
				"89.866000000000000\r\n" + 
				"89.878333333333330\r\n" + 
				"89.888833333333352\r\n" + 
				"89.901666666666657\r\n" + 
				"89.919333333333341\r\n" + 
				"89.932749999999999\r\n" + 
				"89.947285714285712\r\n" + 
				"89.954599999999999\r\n" + 
				"89.964714285714280\r\n" + 
				"89.976999999999990\r\n" + 
				"89.993727272727270\r\n" + 
				"90.005000000000010\r\n" + 
				"90.014499999999998\r\n" + 
				"90.026499999999999\r\n" + 
				"90.035499999999999\r\n" + 
				"90.044499999999985\r\n" + 
				"90.056499999999986\r\n" + 
				"90.065500000000000\r\n" + 
				"90.074181818181799\r\n" + 
				"90.087692307692322\r\n" + 
				"90.100090909090923\r\n" + 
				"90.114333333333320\r\n" + 
				"90.126923076923063\r\n" + 
				"90.139111111111106\r\n" + 
				"90.151000000000010\r\n" + 
				"90.163499999999999\r\n" + 
				"90.177333333333351\r\n" + 
				"90.196499999999986\r\n" + 
				"90.212750000000000\r\n" + 
				"90.225800000000007\r\n" + 
				"90.235999999999990\r\n" + 
				"90.248500000000007\r\n" + 
				"90.265000000000001\r\n" + 
				"90.285500000000013\r\n" + 
				"90.303666666666672\r\n" + 
				"90.318333333333328\r\n" + 
				"90.335499999999996\r\n" + 
				"90.350285714285718\r\n" + 
				"90.371666666666670\r\n" + 
				"90.389285714285705\r\n" + 
				"90.405749999999998\r\n" + 
				"90.417000000000002\r\n" + 
				"90.431749999999994\r\n" + 
				"90.449249999999992\r\n" + 
				"90.468999999999994\r\n" + 
				"90.489666666666665\r\n" + 
				"90.499666666666670\r\n" + 
				"90.513000000000005\r\n" + 
				"90.533999999999992\r\n" + 
				"90.559666666666658\r\n" + 
				"90.572000000000003\r\n" + 
				"90.593750000000000\r\n" + 
				"90.616000000000000\r\n" + 
				"90.628000000000000\r\n" + 
				"90.653999999999996\r\n" + 
				"90.675333333333342\r\n" + 
				"90.693499999999986\r\n" + 
				"90.712999999999994\r\n" + 
				"90.727666666666664\r\n" + 
				"90.741000000000000\r\n" + 
				"90.752250000000004\r\n" + 
				"90.767500000000013\r\n" + 
				"90.779333333333341\r\n" + 
				"90.791499999999999\r\n" + 
				"90.804249999999996\r\n" + 
				"90.821666666666673\r\n" + 
				"90.840750000000000\r\n" + 
				"90.851166666666657\r\n" + 
				"90.870599999999996\r\n" + 
				"90.887999999999991\r\n" + 
				"90.904799999999994\r\n" + 
				"90.923499999999990\r\n" + 
				"90.934666666666658\r\n" + 
				"90.953999999999994\r\n" + 
				"90.964999999999989\r\n" + 
				"90.974499999999992\r\n" + 
				"90.982857142857142\r\n" + 
				"90.998000000000019\r\n" + 
				"91.010888888888886\r\n" + 
				"91.022538461538474\r\n" + 
				"91.035499999999999\r\n" + 
				"91.047500000000014\r\n" + 
				"91.060099999999991\r\n" + 
				"91.068499999999986\r\n" + 
				"91.077181818181828\r\n" + 
				"91.088999999999999\r\n" + 
				"91.097500000000011\r\n" + 
				"91.105999999999995\r\n" + 
				"91.115749999999991\r\n" + 
				"91.126444444444445\r\n" + 
				"91.137600000000006\r\n" + 
				"91.154200000000003\r\n" + 
				"91.168666666666681\r\n" + 
				"91.180250000000001\r\n" + 
				"91.194249999999997\r\n" + 
				"91.216000000000008\r\n" + 
				"91.235666666666660\r\n" + 
				"91.247666666666660\r\n" + 
				"91.272500000000008\r\n" + 
				"91.289666666666676\r\n" + 
				"91.301000000000002\r\n" + 
				"91.315500000000000\r\n" + 
				"91.336999999999989\r\n" + 
				"91.362500000000011\r\n" + 
				"91.375000000000000\r\n" + 
				"91.387666666666675\r\n" + 
				"91.397999999999982\r\n" + 
				"91.417750000000012\r\n" + 
				"91.435499999999990\r\n" + 
				"91.450666666666663\r\n" + 
				"91.466499999999996\r\n" + 
				"91.480500000000006\r\n" + 
				"91.500666666666675\r\n" + 
				"91.515000000000001\r\n" + 
				"91.528666666666666\r\n" + 
				"91.540999999999997\r\n" + 
				"91.556166666666670\r\n" + 
				"91.579499999999996\r\n" + 
				"91.596333333333334\r\n" + 
				"91.609499999999997\r\n" + 
				"91.622000000000000\r\n" + 
				"91.632499999999993\r\n" + 
				"91.653000000000006\r\n" + 
				"91.668400000000005\r\n" + 
				"91.688000000000002\r\n" + 
				"91.701999999999998\r\n" + 
				"91.716999999999999\r\n" + 
				"91.728666666666655\r\n" + 
				"91.748999999999995\r\n" + 
				"91.760500000000008\r\n" + 
				"91.775999999999996\r\n" + 
				"91.798749999999998\r\n" + 
				"91.816749999999999\r\n" + 
				"91.827666666666644\r\n" + 
				"91.844749999999991\r\n" + 
				"91.853000000000009\r\n" + 
				"91.870749999999987\r\n" + 
				"91.882000000000005\r\n" + 
				"91.891500000000008\r\n" + 
				"91.903999999999996\r\n" + 
				"91.918333333333337\r\n" + 
				"91.929500000000004\r\n" + 
				"91.940599999999989\r\n" + 
				"91.953818181818178\r\n" + 
				"91.966857142857151\r\n" + 
				"91.978300000000004\r\n" + 
				"91.990666666666655\r\n" + 
				"92.001999999999995\r\n" + 
				"92.012400000000000\r\n" + 
				"92.024500000000003\r\n" + 
				"92.036499999999990\r\n" + 
				"92.048500000000004\r\n" + 
				"92.060100000000006\r\n" + 
				"92.072500000000005\r\n" + 
				"92.083500000000001\r\n" + 
				"92.095500000000001\r\n" + 
				"92.107500000000002\r\n" + 
				"92.118499999999983\r\n" + 
				"92.129599999999996\r\n" + 
				"92.143200000000007\r\n" + 
				"92.151399999999995\r\n" + 
				"92.162833333333353\r\n" + 
				"92.196499999999986\r\n" + 
				"92.209999999999994\r\n" + 
				"92.229500000000002\r\n" + 
				"92.238499999999988\r\n" + 
				"92.250250000000008\r\n" + 
				"92.265666666666675\r\n" + 
				"92.275000000000006\r\n" + 
				"92.305333333333337\r\n" + 
				"92.322999999999993\r\n" + 
				"92.338999999999999\r\n" + 
				"92.353833333333341\r\n" + 
				"92.372000000000000\r\n" + 
				"92.389166666666668\r\n" + 
				"92.402500000000003\r\n" + 
				"92.417333333333332\r\n" + 
				"92.431399999999996\r\n" + 
				"92.447999999999993\r\n" + 
				"92.470500000000001\r\n" + 
				"92.481999999999999\r\n" + 
				"92.494000000000000\r\n" + 
				"92.505333333333340\r\n" + 
				"92.518000000000001\r\n" + 
				"92.527200000000008\r\n" + 
				"92.550250000000005\r\n" + 
				"92.558750000000003\r\n" + 
				"92.574666666666658\r\n" + 
				"92.596333333333334\r\n" + 
				"92.615999999999985\r\n" + 
				"92.628500000000003\r\n" + 
				"92.641999999999996\r\n" + 
				"92.663000000000011\r\n" + 
				"92.678500000000014\r\n" + 
				"92.690500000000000\r\n" + 
				"92.703000000000003\r\n" + 
				"92.713666666666654\r\n" + 
				"92.728400000000008\r\n" + 
				"92.738499999999988\r\n" + 
				"92.757333333333335\r\n" + 
				"92.769499999999994\r\n" + 
				"92.784000000000006\r\n" + 
				"92.799999999999997\r\n" + 
				"92.816333333333318\r\n" + 
				"92.836600000000004\r\n" + 
				"92.851666666666674\r\n" + 
				"92.874499999999998\r\n" + 
				"92.885500000000008\r\n" + 
				"92.894999999999996\r\n" + 
				"92.915599999999998\r\n" + 
				"92.932800000000000\r\n" + 
				"92.947999999999993\r\n" + 
				"92.961300000000008\r\n" + 
				"92.972714285714275\r\n" + 
				"92.986181818181819\r\n" + 
				"92.999181818181825\r\n" + 
				"93.013000000000005\r\n" + 
				"93.025000000000006\r\n" + 
				"93.035499999999999\r\n" + 
				"93.047500000000014\r\n" + 
				"93.056499999999986\r\n" + 
				"93.065500000000000\r\n" + 
				"93.076500000000010\r\n" + 
				"93.086500000000001\r\n" + 
				"93.097999999999999\r\n" + 
				"93.106200000000001\r\n" + 
				"93.115375000000000\r\n" + 
				"93.123833333333323\r\n" + 
				"93.137500000000003\r\n" + 
				"93.149599999999992\r\n" + 
				"93.164857142857159\r\n" + 
				"93.200333333333333\r\n" + 
				"93.220124999999996\r\n" + 
				"93.242000000000004\r\n" + 
				"93.259999999999991\r\n" + 
				"93.277000000000001\r\n" + 
				"93.319666666666663\r\n" + 
				"93.347499999999997\r\n" + 
				"93.365000000000009\r\n" + 
				"93.376999999999995\r\n" + 
				"93.387000000000000\r\n" + 
				"93.402500000000003\r\n" + 
				"93.423000000000002\r\n" + 
				"93.442499999999995\r\n" + 
				"93.457999999999998\r\n" + 
				"93.471999999999994\r\n" + 
				"93.486000000000004\r\n" + 
				"93.510666666666665\r\n" + 
				"93.533249999999995\r\n" + 
				"93.551857142857145\r\n" + 
				"93.561999999999998\r\n" + 
				"93.578000000000003\r\n" + 
				"93.605999999999995\r\n" + 
				"93.626499999999993\r\n" + 
				"93.641000000000005\r\n" + 
				"93.654749999999993\r\n" + 
				"93.675500000000000\r\n" + 
				"93.691666666666677\r\n" + 
				"93.721666666666678\r\n" + 
				"93.745000000000005\r\n" + 
				"93.773499999999999\r\n" + 
				"93.789666666666662\r\n" + 
				"93.801000000000002\r\n" + 
				"93.820200000000014\r\n" + 
				"93.832250000000002\r\n" + 
				"93.859000000000009\r\n" + 
				"93.875000000000000\r\n" + 
				"93.890666666666675\r\n" + 
				"93.907499999999999\r\n" + 
				"93.920500000000004\r\n" + 
				"93.937571428571431\r\n" + 
				"93.950399999999988\r\n" + 
				"93.965727272727278\r\n" + 
				"93.979222222222205\r\n" + 
				"93.991699999999994\r\n" + 
				"94.003999999999991\r\n" + 
				"94.013000000000005\r\n" + 
				"94.021999999999991\r\n" + 
				"94.030500000000004\r\n" + 
				"94.039500000000004\r\n" + 
				"94.047499999999999\r\n" + 
				"94.056499999999986\r\n" + 
				"94.066499999999991\r\n" + 
				"94.075500000000005\r\n" + 
				"94.084444444444458\r\n" + 
				"94.094000000000008\r\n" + 
				"94.102999999999994\r\n" + 
				"94.114666666666665\r\n" + 
				"94.125799999999998\r\n" + 
				"94.141166666666663\r\n" + 
				"94.152888888888882\r\n" + 
				"94.166499999999999\r\n" + 
				"94.178333333333342\r\n" + 
				"94.187714285714279\r\n" + 
				"94.206249999999997\r\n" + 
				"94.222000000000023\r\n" + 
				"94.236599999999996\r\n" + 
				"94.259999999999991\r\n" + 
				"94.283000000000001\r\n" + 
				"94.296500000000009\r\n" + 
				"94.322599999999994\r\n" + 
				"94.346666666666650\r\n" + 
				"94.359666666666669\r\n" + 
				"94.377000000000010\r\n" + 
				"94.392499999999998\r\n" + 
				"94.406499999999994\r\n" + 
				"94.421999999999983\r\n" + 
				"94.442250000000001\r\n" + 
				"94.451749999999990\r\n" + 
				"94.479749999999996\r\n" + 
				"94.493500000000012\r\n" + 
				"94.521500000000003\r\n" + 
				"94.538499999999999\r\n" + 
				"94.555750000000003\r\n" + 
				"94.588999999999999\r\n" + 
				"94.603499999999997\r\n" + 
				"94.644499999999994\r\n" + 
				"94.661000000000001\r\n" + 
				"94.673000000000002\r\n" + 
				"94.692000000000007\r\n" + 
				"94.722700000000003\r\n" + 
				"94.738666666666674\r\n" + 
				"94.759333333333316\r\n" + 
				"94.777000000000015\r\n" + 
				"94.790000000000006\r\n" + 
				"94.804666666666662\r\n" + 
				"94.827500000000001\r\n" + 
				"94.840599999999995\r\n" + 
				"94.853857142857137\r\n" + 
				"94.872666666666660\r\n" + 
				"94.886333333333326\r\n" + 
				"94.903666666666666\r\n" + 
				"94.922400000000010\r\n" + 
				"94.939000000000007\r\n" + 
				"94.948333333333323\r\n" + 
				"94.959714285714284\r\n" + 
				"94.976363636363644\r\n" + 
				"94.986999999999995\r\n" + 
				"94.997100000000017\r\n" + 
				"95.009499999999989\r\n" + 
				"95.021769230769252\r\n" + 
				"95.036000000000001\r\n" + 
				"95.047500000000014\r\n" + 
				"95.059500000000000\r\n" + 
				"95.071500000000000\r\n" + 
				"95.083500000000001\r\n" + 
				"95.094571428571427\r\n" + 
				"95.106545454545440\r\n" + 
				"95.117555555555555\r\n" + 
				"95.132000000000005\r\n" + 
				"95.154142857142872\r\n" + 
				"95.167666666666662\r\n" + 
				"95.189999999999984\r\n" + 
				"95.210499999999996\r\n" + 
				"95.221500000000006\r\n" + 
				"95.237666666666655\r\n" + 
				"95.256500000000003\r\n" + 
				"95.269000000000005\r\n" + 
				"95.282000000000011\r\n" + 
				"95.313500000000005\r\n" + 
				"95.334999999999994\r\n" + 
				"95.348999999999990\r\n" + 
				"95.359399999999994\r\n" + 
				"95.374000000000009\r\n" + 
				"95.396000000000001\r\n" + 
				"95.410249999999991\r\n" + 
				"95.428800000000010\r\n" + 
				"95.444000000000003\r\n" + 
				"95.461999999999989\r\n" + 
				"95.475333333333325\r\n" + 
				"95.500000000000000\r\n" + 
				"95.512999999999991\r\n" + 
				"95.521749999999997\r\n" + 
				"95.535499999999999\r\n" + 
				"95.560749999999999\r\n" + 
				"95.576250000000002\r\n" + 
				"95.591999999999999\r\n" + 
				"95.603666666666655\r\n" + 
				"95.615333333333339\r\n" + 
				"95.627499999999998\r\n" + 
				"95.638499999999993\r\n" + 
				"95.652999999999992\r\n" + 
				"95.671999999999983\r\n" + 
				"95.688333333333333\r\n" + 
				"95.700800000000001\r\n" + 
				"95.719666666666669\r\n" + 
				"95.738000000000000\r\n" + 
				"95.753000000000000\r\n" + 
				"95.772666666666666\r\n" + 
				"95.787333333333336\r\n" + 
				"95.814999999999998\r\n" + 
				"95.830333333333328\r\n" + 
				"95.849499999999992\r\n" + 
				"95.862749999999991\r\n" + 
				"95.875000000000000\r\n" + 
				"95.891000000000005\r\n" + 
				"95.902666666666661\r\n" + 
				"95.914299999999997\r\n" + 
				"95.932249999999996\r\n" + 
				"95.945333333333323\r\n" + 
				"95.958666666666659\r\n" + 
				"95.971999999999994\r\n" + 
				"95.981900000000010\r\n" + 
				"95.992428571428576\r\n" + 
				"96.002166666666653\r\n" + 
				"96.015999999999991\r\n" + 
				"96.029499999999999\r\n" + 
				"96.042000000000016\r\n" + 
				"96.055071428571438\r\n" + 
				"96.069499999999991\r\n" + 
				"96.082499999999996\r\n" + 
				"96.094499999999982\r\n" + 
				"96.106875000000002\r\n" + 
				"96.116285714285709\r\n" + 
				"96.125499999999988\r\n" + 
				"96.135714285714272\r\n" + 
				"96.144777777777762\r\n" + 
				"96.160200000000003\r\n" + 
				"96.173000000000002\r\n" + 
				"96.194428571428574\r\n" + 
				"96.211000000000013\r\n" + 
				"96.222166666666666\r\n" + 
				"96.238749999999996\r\n" + 
				"96.258600000000001\r\n" + 
				"96.280333333333331\r\n" + 
				"96.321499999999986\r\n" + 
				"96.334000000000003\r\n" + 
				"96.347200000000015\r\n" + 
				"96.361999999999995\r\n" + 
				"96.382999999999996\r\n" + 
				"96.404500000000013\r\n" + 
				"96.427199999999999\r\n" + 
				"96.451999999999998\r\n" + 
				"96.462500000000006\r\n" + 
				"96.477999999999994\r\n" + 
				"96.492600000000010\r\n" + 
				"96.513499999999993\r\n" + 
				"96.534000000000006\r\n" + 
				"96.549333333333337\r\n" + 
				"96.562999999999988\r\n" + 
				"96.579399999999993\r\n" + 
				"96.597999999999999\r\n" + 
				"96.610500000000002\r\n" + 
				"96.631250000000009\r\n" + 
				"96.656000000000006\r\n" + 
				"96.670500000000004\r\n" + 
				"96.683666666666667\r\n" + 
				"96.693666666666672\r\n" + 
				"96.709571428571422\r\n" + 
				"96.725200000000001\r\n" + 
				"96.739750000000001\r\n" + 
				"96.753333333333330\r\n" + 
				"96.771249999999995\r\n" + 
				"96.792499999999990\r\n" + 
				"96.805750000000003\r\n" + 
				"96.823599999999999\r\n" + 
				"96.841000000000008\r\n" + 
				"96.860999999999990\r\n" + 
				"96.873333333333335\r\n" + 
				"96.886250000000004\r\n" + 
				"96.903666666666666\r\n" + 
				"96.916666666666671\r\n" + 
				"96.931500000000000\r\n" + 
				"96.944000000000003\r\n" + 
				"96.956000000000003\r\n" + 
				"96.967285714285708\r\n" + 
				"96.976833333333332\r\n" + 
				"96.991818181818189\r\n" + 
				"97.004666666666665\r\n" + 
				"97.015499999999989\r\n" + 
				"97.024499999999989\r\n" + 
				"97.032499999999985\r\n" + 
				"97.040999999999997\r\n" + 
				"97.052000000000007\r\n" + 
				"97.063499999999991\r\n" + 
				"97.075700000000012\r\n" + 
				"97.087500000000006\r\n" + 
				"97.100000000000009\r\n" + 
				"97.111999999999995\r\n" + 
				"97.123499999999993\r\n" + 
				"97.136249999999990\r\n" + 
				"97.150000000000006\r\n" + 
				"97.161333333333332\r\n" + 
				"97.173399999999987\r\n" + 
				"97.185200000000009\r\n" + 
				"97.197749999999999\r\n" + 
				"97.223399999999998\r\n" + 
				"97.235499999999988\r\n" + 
				"97.253666666666675\r\n" + 
				"97.272000000000006\r\n" + 
				"97.283000000000001\r\n" + 
				"97.301500000000004\r\n" + 
				"97.316499999999991\r\n" + 
				"97.335999999999999\r\n" + 
				"97.366500000000002\r\n" + 
				"97.377000000000010\r\n" + 
				"97.411000000000001\r\n" + 
				"97.433333333333337\r\n" + 
				"97.451999999999998\r\n" + 
				"97.495999999999995\r\n" + 
				"97.515999999999991\r\n" + 
				"97.528999999999996\r\n" + 
				"97.542666666666662\r\n" + 
				"97.557333333333347\r\n" + 
				"97.573666666666668\r\n" + 
				"97.592599999999990\r\n" + 
				"97.608000000000004\r\n" + 
				"97.620000000000005\r\n" + 
				"97.641999999999996\r\n" + 
				"97.655000000000001\r\n" + 
				"97.667666666666676\r\n" + 
				"97.699500000000000\r\n" + 
				"97.717799999999997\r\n" + 
				"97.736500000000007\r\n" + 
				"97.746666666666670\r\n" + 
				"97.763000000000005\r\n" + 
				"97.791500000000013\r\n" + 
				"97.828666666666663\r\n" + 
				"97.852499999999992\r\n" + 
				"97.864000000000004\r\n" + 
				"97.879999999999995\r\n" + 
				"97.893000000000001\r\n" + 
				"97.912125000000003\r\n" + 
				"97.935666666666677\r\n" + 
				"97.951499999999996\r\n" + 
				"97.965500000000006\r\n" + 
				"97.975499999999997\r\n" + 
				"97.986083333333340\r\n" + 
				"97.999500000000012\r\n" + 
				"98.010899999999992\r\n" + 
				"98.024000000000015\r\n" + 
				"98.034999999999997\r\n" + 
				"98.044499999999985\r\n" + 
				"98.056499999999986\r\n" + 
				"98.067999999999998\r\n" + 
				"98.075999999999993\r\n" + 
				"98.085999999999999\r\n" + 
				"98.098500000000001\r\n" + 
				"98.112923076923067\r\n" + 
				"98.126499999999993\r\n" + 
				"98.140999999999991\r\n" + 
				"98.155777777777772\r\n" + 
				"98.168750000000017\r\n" + 
				"98.178666666666672\r\n" + 
				"98.192999999999998\r\n" + 
				"98.201666666666668\r\n" + 
				"98.228333333333339\r\n" + 
				"98.249499999999998\r\n" + 
				"98.260333333333335\r\n" + 
				"98.277333333333331\r\n" + 
				"98.289000000000001\r\n" + 
				"98.296666666666667\r\n" + 
				"98.316000000000003\r\n" + 
				"98.337000000000003\r\n" + 
				"98.367999999999995\r\n" + 
				"98.390250000000009\r\n" + 
				"98.420833333333334\r\n" + 
				"98.444500000000005\r\n" + 
				"98.467333333333329\r\n" + 
				"98.482999999999990\r\n" + 
				"98.511333333333326\r\n" + 
				"98.534000000000006\r\n" + 
				"98.549499999999995\r\n" + 
				"98.565399999999997\r\n" + 
				"98.581249999999997\r\n" + 
				"98.596000000000004\r\n" + 
				"98.621499999999997\r\n" + 
				"98.639000000000010\r\n" + 
				"98.659999999999997\r\n" + 
				"98.678500000000000\r\n" + 
				"98.690499999999986\r\n" + 
				"98.707999999999998\r\n" + 
				"98.719500000000011\r\n" + 
				"98.745750000000001\r\n" + 
				"98.762999999999991\r\n" + 
				"98.776000000000010\r\n" + 
				"98.794499999999999\r\n" + 
				"98.807400000000001\r\n" + 
				"98.839666666666673\r\n" + 
				"98.860749999999996\r\n" + 
				"98.878199999999993\r\n" + 
				"98.888000000000005\r\n" + 
				"98.911000000000001\r\n" + 
				"98.923500000000004\r\n" + 
				"98.945624999999993\r\n" + 
				"98.961666666666659\r\n" + 
				"98.975111111111119\r\n" + 
				"98.986285714285714\r\n" + 
				"98.999142857142843\r\n" + 
				"99.009500000000003\r\n" + 
				"99.021500000000003\r\n" + 
				"99.034999999999997\r\n" + 
				"99.047500000000014\r\n" + 
				"99.058499999999995\r\n" + 
				"99.069499999999991\r\n" + 
				"99.082999999999998\r\n" + 
				"99.091666666666654\r\n" + 
				"99.100999999999985\r\n" + 
				"99.109400000000008\r\n" + 
				"99.120499999999993\r\n" + 
				"99.135599999999997\r\n" + 
				"99.146833333333333\r\n" + 
				"99.157799999999995\r\n" + 
				"99.171999999999997\r\n" + 
				"99.189999999999998\r\n" + 
				"99.204499999999996\r\n" + 
				"99.213750000000005\r\n" + 
				"99.232666666666660\r\n" + 
				"99.244799999999998\r\n" + 
				"99.266999999999996\r\n" + 
				"99.288333333333341\r\n" + 
				"99.303749999999994\r\n" + 
				"99.324999999999989\r\n" + 
				"99.336999999999989\r\n" + 
				"99.347499999999997\r\n" + 
				"99.368499999999997\r\n" + 
				"99.382750000000001\r\n" + 
				"99.399666666666675\r\n" + 
				"99.424666666666667\r\n" + 
				"99.436666666666667\r\n" + 
				"99.456999999999994\r\n" + 
				"99.490499999999997\r\n" + 
				"99.507333333333349\r\n" + 
				"99.533166666666659\r\n" + 
				"99.544000000000011\r\n" + 
				"99.567000000000007\r\n" + 
				"99.581999999999994\r\n" + 
				"99.616799999999998\r\n" + 
				"99.632000000000005\r\n" + 
				"99.646199999999993\r\n" + 
				"99.659666666666666\r\n" + 
				"99.671200000000013\r\n" + 
				"99.685000000000002\r\n" + 
				"99.713333333333324\r\n" + 
				"99.723999999999990\r\n" + 
				"99.749499999999998\r\n" + 
				"99.773666666666671\r\n" + 
				"99.784333333333336\r\n" + 
				"99.801500000000004\r\n" + 
				"99.829000000000008\r\n" + 
				"99.838999999999999\r\n" + 
				"99.850800000000007\r\n" + 
				"99.872999999999990\r\n" + 
				"99.887666666666675\r\n" + 
				"99.907499999999999\r\n" + 
				"99.920000000000002\r\n" + 
				"99.934666666666672\r\n" + 
				"99.952166666666656\r\n" + 
				"99.976181818181828\r\n" + 
				"99.989499999999978\r\n" + 
				"100.003249999999990\r\n" + 
				"100.015499999999990\r\n" + 
				"100.027222222222240\r\n" + 
				"100.039500000000000\r\n" + 
				"100.050500000000000\r\n" + 
				"100.062500000000000\r\n" + 
				"100.074500000000000\r\n" + 
				"100.086500000000000\r\n" + 
				"100.099250000000010\r\n" + 
				"100.109499999999980\r\n" + 
				"100.119428571428570\r\n" + 
				"100.131500000000000\r\n" + 
				"100.142700000000000\r\n" + 
				"100.155199999999990\r\n" + 
				"100.168499999999990\r\n" + 
				"100.180000000000010\r\n" + 
				"100.192666666666650\r\n" + 
				"100.204250000000000\r\n" + 
				"100.220285714285720\r\n" + 
				"100.239125000000020\r\n" + 
				"100.274000000000000\r\n" + 
				"100.294999999999990\r\n" + 
				"100.314500000000010\r\n" + 
				"100.346999999999990\r\n" + 
				"100.378999999999990\r\n" + 
				"100.397999999999980\r\n" + 
				"100.422500000000010\r\n" + 
				"100.443000000000000\r\n" + 
				"100.459499999999990\r\n" + 
				"100.497000000000000\r\n" + 
				"100.511666666666660\r\n" + 
				"100.541500000000000\r\n" + 
				"100.559000000000000\r\n" + 
				"100.573000000000010\r\n" + 
				"100.587000000000000\r\n" + 
				"100.605000000000000\r\n" + 
				"100.626666666666670\r\n" + 
				"100.671000000000010\r\n" + 
				"100.685666666666680\r\n" + 
				"100.695500000000010\r\n" + 
				"100.707500000000010\r\n" + 
				"100.723500000000000\r\n" + 
				"100.734750000000010\r\n" + 
				"100.751666666666670\r\n" + 
				"100.769499999999990\r\n" + 
				"100.788857142857150\r\n" + 
				"100.811250000000000\r\n" + 
				"100.822250000000000\r\n" + 
				"100.831999999999990\r\n" + 
				"100.855999999999990\r\n" + 
				"100.875000000000000\r\n" + 
				"100.889750000000010\r\n" + 
				"100.900499999999990\r\n" + 
				"100.923833333333350\r\n" + 
				"100.945833333333340\r\n" + 
				"100.961249999999990\r\n" + 
				"100.973750000000000\r\n" + 
				"100.986600000000010\r\n" + 
				"100.997444444444430\r\n" + 
				"101.013428571428550\r\n" + 
				"101.026499999999980\r\n" + 
				"101.038500000000010\r\n" + 
				"101.050500000000000\r\n" + 
				"101.061500000000000\r\n" + 
				"101.071500000000000\r\n" + 
				"101.080499999999990\r\n" + 
				"101.092499999999990\r\n" + 
				"101.106300000000000\r\n" + 
				"101.121900000000010\r\n" + 
				"101.138777777777790\r\n" + 
				"101.151200000000000\r\n" + 
				"101.168333333333340\r\n" + 
				"101.190500000000000\r\n" + 
				"101.206000000000000\r\n" + 
				"101.224666666666660\r\n" + 
				"101.243333333333340\r\n" + 
				"101.261500000000000\r\n" + 
				"101.285000000000010\r\n" + 
				"101.309250000000010\r\n" + 
				"101.334333333333330\r\n" + 
				"101.352000000000000\r\n" + 
				"101.362333333333320\r\n" + 
				"101.388000000000010\r\n" + 
				"101.411500000000020\r\n" + 
				"101.446500000000000\r\n" + 
				"101.466000000000010\r\n" + 
				"101.480999999999990\r\n" + 
				"101.514600000000000\r\n" + 
				"101.545750000000000\r\n" + 
				"101.560333333333330\r\n" + 
				"101.574000000000000\r\n" + 
				"101.587999999999990\r\n" + 
				"101.599999999999990\r\n" + 
				"101.613000000000000\r\n" + 
				"101.641000000000010\r\n" + 
				"101.654000000000000\r\n" + 
				"101.689666666666670\r\n" + 
				"101.706500000000010\r\n" + 
				"101.721499999999990\r\n" + 
				"101.733166666666660\r\n" + 
				"101.746500000000000\r\n" + 
				"101.761500000000010\r\n" + 
				"101.771750000000000\r\n" + 
				"101.796666666666670\r\n" + 
				"101.840999999999990\r\n" + 
				"101.860666666666660\r\n" + 
				"101.877000000000000\r\n" + 
				"101.885750000000000\r\n" + 
				"101.896666666666660\r\n" + 
				"101.914000000000000\r\n" + 
				"101.926799999999990\r\n" + 
				"101.937250000000010\r\n" + 
				"101.947166666666660\r\n" + 
				"101.957166666666650\r\n" + 
				"101.966625000000010\r\n" + 
				"101.982571428571430\r\n" + 
				"101.996499999999980\r\n" + 
				"102.008000000000020\r\n" + 
				"102.018500000000000\r\n" + 
				"102.030999999999990\r\n" + 
				"102.044499999999990\r\n" + 
				"102.056499999999990\r\n" + 
				"102.068000000000000\r\n" + 
				"102.081499999999990\r\n" + 
				"102.094499999999980\r\n" + 
				"102.105699999999980\r\n" + 
				"102.115500000000000\r\n" + 
				"102.127000000000010\r\n" + 
				"102.139666666666660\r\n" + 
				"102.155428571428570\r\n" + 
				"102.168000000000010\r\n" + 
				"102.182666666666660\r\n" + 
				"102.201666666666650\r\n" + 
				"102.220600000000000\r\n" + 
				"102.235750000000000\r\n" + 
				"102.243250000000000\r\n" + 
				"102.260500000000010\r\n" + 
				"102.280666666666660\r\n" + 
				"102.301500000000000\r\n" + 
				"102.325333333333330\r\n" + 
				"102.354666666666670\r\n" + 
				"102.385000000000020\r\n" + 
				"102.404000000000000\r\n" + 
				"102.440500000000000\r\n" + 
				"102.456999999999990\r\n" + 
				"102.471000000000000\r\n" + 
				"102.482249999999990\r\n" + 
				"102.496000000000010\r\n" + 
				"102.534333333333340\r\n" + 
				"102.554200000000010\r\n" + 
				"102.569500000000010\r\n" + 
				"102.592285714285710\r\n" + 
				"102.610500000000000\r\n" + 
				"102.624000000000010\r\n" + 
				"102.649000000000000\r\n" + 
				"102.674000000000010\r\n" + 
				"102.684000000000000\r\n" + 
				"102.741666666666670\r\n" + 
				"102.755000000000000\r\n" + 
				"102.766666666666670\r\n" + 
				"102.781000000000010\r\n" + 
				"102.801500000000000\r\n" + 
				"102.819999999999990\r\n" + 
				"102.830500000000000\r\n" + 
				"102.852999999999990\r\n" + 
				"102.872000000000000\r\n" + 
				"102.885666666666680\r\n" + 
				"102.899750000000010\r\n" + 
				"102.909250000000010\r\n" + 
				"102.918000000000010\r\n" + 
				"102.928666666666670\r\n" + 
				"102.943000000000000\r\n" + 
				"102.957250000000000\r\n" + 
				"102.966571428571410\r\n" + 
				"102.975799999999980\r\n" + 
				"102.984624999999990\r\n" + 
				"102.995571428571440\r\n" + 
				"103.007000000000010\r\n" + 
				"103.018000000000010\r\n" + 
				"103.029500000000030\r\n" + 
				"103.041000000000000\r\n" + 
				"103.053500000000000\r\n" + 
				"103.062500000000000\r\n" + 
				"103.071500000000000\r\n" + 
				"103.083454545454530\r\n" + 
				"103.094714285714280\r\n" + 
				"103.105083333333330\r\n" + 
				"103.121749999999990\r\n" + 
				"103.130333333333330\r\n" + 
				"103.140250000000010\r\n" + 
				"103.150625000000010\r\n" + 
				"103.160500000000000\r\n" + 
				"103.170666666666660\r\n" + 
				"103.187666666666660\r\n" + 
				"103.203999999999990\r\n" + 
				"103.220400000000000\r\n" + 
				"103.235500000000000\r\n" + 
				"103.256999999999990\r\n" + 
				"103.274000000000000\r\n" + 
				"103.294333333333330\r\n" + 
				"103.305666666666680\r\n" + 
				"103.317333333333340\r\n" + 
				"103.328250000000000\r\n" + 
				"103.343500000000010\r\n" + 
				"103.365500000000000\r\n" + 
				"103.379500000000010\r\n" + 
				"103.406250000000000\r\n" + 
				"103.423000000000000\r\n" + 
				"103.438333333333330\r\n" + 
				"103.486500000000010\r\n" + 
				"103.499000000000000\r\n" + 
				"103.512500000000000\r\n" + 
				"103.524000000000000\r\n" + 
				"103.538000000000000\r\n" + 
				"103.554333333333330\r\n" + 
				"103.569500000000010\r\n" + 
				"103.592666666666670\r\n" + 
				"103.611000000000000\r\n" + 
				"103.630000000000000\r\n" + 
				"103.649500000000000\r\n" + 
				"103.671250000000000\r\n" + 
				"103.686000000000010\r\n" + 
				"103.698749999999990\r\n" + 
				"103.724399999999990\r\n" + 
				"103.744000000000000\r\n" + 
				"103.758000000000000\r\n" + 
				"103.783999999999990\r\n" + 
				"103.807999999999990\r\n" + 
				"103.825333333333330\r\n" + 
				"103.854500000000000\r\n" + 
				"103.869666666666670\r\n" + 
				"103.884499999999990\r\n" + 
				"103.895333333333340\r\n" + 
				"103.903800000000000\r\n" + 
				"103.918571428571430\r\n" + 
				"103.932000000000000\r\n" + 
				"103.945250000000000\r\n" + 
				"103.960555555555560\r\n" + 
				"103.974500000000010\r\n" + 
				"103.984166666666680\r\n" + 
				"103.993600000000010\r\n" + 
				"104.006333333333320\r\n" + 
				"104.014500000000000\r\n" + 
				"104.023500000000000\r\n" + 
				"104.034428571428560\r\n" + 
				"104.044500000000010\r\n" + 
				"104.056499999999990\r\n" + 
				"104.066499999999990\r\n" + 
				"104.076500000000000\r\n" + 
				"104.088500000000010\r\n" + 
				"104.101000000000010\r\n" + 
				"104.112500000000000\r\n" + 
				"104.124222222222230\r\n" + 
				"104.136375000000000\r\n" + 
				"104.147571428571420\r\n" + 
				"104.160999999999990\r\n" + 
				"104.178999999999990\r\n" + 
				"104.194500000000010\r\n" + 
				"104.214999999999990\r\n" + 
				"104.224000000000000\r\n" + 
				"104.247000000000000\r\n" + 
				"104.260333333333340\r\n" + 
				"104.276199999999990\r\n" + 
				"104.293250000000000\r\n" + 
				"104.311250000000000\r\n" + 
				"104.326500000000010\r\n" + 
				"104.342666666666670\r\n" + 
				"104.360750000000000\r\n" + 
				"104.381500000000000\r\n" + 
				"104.402750000000000\r\n" + 
				"104.426499999999990\r\n" + 
				"104.440666666666670\r\n" + 
				"104.461999999999990\r\n" + 
				"104.492000000000000\r\n" + 
				"104.519666666666650\r\n" + 
				"104.535750000000010\r\n" + 
				"104.545000000000000\r\n" + 
				"104.556000000000000\r\n" + 
				"104.568500000000000\r\n" + 
				"104.587000000000000\r\n" + 
				"104.598666666666660\r\n" + 
				"104.624000000000000\r\n" + 
				"104.644666666666650\r\n" + 
				"104.666666666666670\r\n" + 
				"104.689500000000010\r\n" + 
				"104.700000000000000\r\n" + 
				"104.717000000000000\r\n" + 
				"104.752000000000000\r\n" + 
				"104.766500000000010\r\n" + 
				"104.796500000000010\r\n" + 
				"104.810333333333350\r\n" + 
				"104.825999999999980\r\n" + 
				"104.857800000000000\r\n" + 
				"104.873500000000010\r\n" + 
				"104.890666666666680\r\n" + 
				"104.908999999999990\r\n" + 
				"104.921000000000010\r\n" + 
				"104.937999999999990\r\n" + 
				"104.948285714285700\r\n" + 
				"104.959750000000010\r\n" + 
				"104.969399999999990\r\n" + 
				"104.977625000000000\r\n" + 
				"104.993083333333330\r\n" + 
				"");
		filewriter.close();
	}
	
}
