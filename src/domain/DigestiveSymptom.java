package domain;

public class DigestiveSymptom extends Symptom{

	private static DigestiveSymptom ds = null;

	public DigestiveSymptom(String name, int covidImpact, int severityIndex) {
		super(name, covidImpact, severityIndex);
		// TODO Auto-generated constructor stub
	}
	
	public static DigestiveSymptom getInstance(String name, int covidImpact, int severityIndex) {
		if(ds == null) {
			ds = new DigestiveSymptom(name, covidImpact, severityIndex);
		}
		return ds;
	}

}
