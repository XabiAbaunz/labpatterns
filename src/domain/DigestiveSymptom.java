package domain;

import java.util.ArrayList;
import java.util.Iterator;

public class DigestiveSymptom extends Symptom{

	private static ArrayList<DigestiveSymptom> ds = new ArrayList<>();

	public DigestiveSymptom(String name, int covidImpact, int severityIndex) {
		super(name, covidImpact, severityIndex);
		// TODO Auto-generated constructor stub
	}
	
	public static DigestiveSymptom getInstance(String name, int covidImpact, int severityIndex) {
		DigestiveSymptom s = null;
		Iterator iterator = ds.iterator();
		boolean aurkitua = false;
		while(iterator.hasNext() && !aurkitua) {
			s = (DigestiveSymptom) iterator.next();
			if(s.getName().equals(name)) {
				aurkitua = true;
			}
		}
		if(!aurkitua) {
			s=new DigestiveSymptom(name, covidImpact, severityIndex);
			ds.add(s);
		}
		return s;
	}
}
