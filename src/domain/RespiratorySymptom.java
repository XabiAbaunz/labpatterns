package domain;

import java.util.ArrayList;
import java.util.Iterator;

public class RespiratorySymptom extends Symptom{

	private static ArrayList<RespiratorySymptom> rs = new ArrayList<>();

	public RespiratorySymptom(String name, int covidImpact, int severityIndex) {
		super(name, covidImpact, severityIndex);
		// TODO Auto-generated constructor stub
	}
	
	public static RespiratorySymptom getInstance(String name, int covidImpact, int severityIndex) {
		RespiratorySymptom s = null;
		Iterator iterator = rs.iterator();
		boolean aurkitua = false;
		while(iterator.hasNext() && !aurkitua) {
			s = (RespiratorySymptom) iterator.next();
			if(s.getName().equals(name)) {
				aurkitua = true;
			}
		}
		if(!aurkitua) {
			s=new RespiratorySymptom(name, covidImpact, severityIndex);
			rs.add(s);
		}
		return s;
	}
}
