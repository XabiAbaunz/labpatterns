package domain;

import java.util.ArrayList;
import java.util.Iterator;

public class NeuroMuscularSymptom extends Symptom{
	
	private static ArrayList<NeuroMuscularSymptom> nms = new ArrayList<>();

	public NeuroMuscularSymptom(String name, int covidImpact, int severityIndex) {
		super(name, covidImpact, severityIndex);
		// TODO Auto-generated constructor stub
	}
	
	public static NeuroMuscularSymptom getInstance(String name, int covidImpact, int severityIndex) {
		NeuroMuscularSymptom s = null;
		Iterator iterator = nms.iterator();
		boolean aurkitua = false;
		while(iterator.hasNext() && !aurkitua) {
			s = (NeuroMuscularSymptom) iterator.next();
			if(s.getName().equals(name)) {
				aurkitua = true;
			}
		}
		if(!aurkitua) {
			s=new NeuroMuscularSymptom(name, covidImpact, severityIndex);
			nms.add(s);
		}
		return s;
	}
}
