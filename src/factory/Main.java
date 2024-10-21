package factory;

import domain.Covid19Pacient;
import domain.FactorySymptom;
import domain.Medicament;

public class Main {

	public static void main(String[] args) {
		FactorySymptom fs = new FactorySymptom();
		Covid19Pacient p1=new Covid19Pacient("aitor", 35, fs);
		new PacientSymptomGUI(p1);

	}

}
