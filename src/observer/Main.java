package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import domain.FactorySymptom;

public class Main {
	public static void main(String	args[]){
		FactorySymptom fs = new FactorySymptom();
		
		Observable	pacient1=new	Covid19Pacient("aitor",	35, fs);
		new	PacientObserverGUI(pacient1);
		new	PacientSymptomGUI((Covid19Pacient)pacient1);
		new PacientThermometerGUI(pacient1);
		new SemaphorGUI(pacient1);
		
		/*Observable	pacient2=new	Covid19Pacient("xabi",	35, fs);
		new	PacientObserverGUI(pacient2);
		new	PacientSymptomGUI((Covid19Pacient)pacient2);
		new PacientThermometerGUI(pacient2);
		
		Observable	pacient3=new	Covid19Pacient("beñat",	35, fs);
		new	PacientObserverGUI(pacient3);
		new	PacientSymptomGUI((Covid19Pacient)pacient3);
		new PacientThermometerGUI(pacient3);*/
	}
}