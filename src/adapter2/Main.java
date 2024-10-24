package adapter2;

import domain.Covid19Pacient;
import domain.FactorySymptom;

public class Main {

	public static void main(String[] args) {
		FactorySymptom fs = new FactorySymptom();
		Covid19Pacient pacient=new Covid19Pacient("aitor", 35, fs);
		
		pacient.addSymptomByName("disnea", 2);
		pacient.addSymptomByName("cefalea", 1);
		pacient.addSymptomByName("astenia", 3);
		
		Covid19Pacient pacient2=new Covid19Pacient("xabi", 35, fs);
		
		pacient2.addSymptomByName("disnea", 3);
		pacient2.addSymptomByName("cefalea", 1);
		pacient2.addSymptomByName("astenia", 2);
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient);
		gui.setPreferredSize(new java.awt.Dimension(300, 200));
		gui.setVisible(true);
		
		ShowPacientTableGUI gui2=new ShowPacientTableGUI(pacient2);
		gui2.setPreferredSize(new java.awt.Dimension(300, 200));
		gui2.setVisible(true);
	}

}
