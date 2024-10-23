package domain;

public class NeuroMuscularSymptom extends Symptom{
	
	private static NeuroMuscularSymptom nms = null;

	public NeuroMuscularSymptom(String name, int covidImpact, int severityIndex) {
		super(name, covidImpact, severityIndex);
		// TODO Auto-generated constructor stub
	}
	
	public static NeuroMuscularSymptom getInstance(String name, int covidImpact, int severityIndex) {
		if(nms == null) {
			nms = new NeuroMuscularSymptom(name, covidImpact, severityIndex);
		}
		return nms;
	}

}
