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
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient);
		gui.setPreferredSize(new java.awt.Dimension(300, 200));
		gui.setVisible(true);
		
		System.out.println(pacient.getSymptoms());


	}

}
