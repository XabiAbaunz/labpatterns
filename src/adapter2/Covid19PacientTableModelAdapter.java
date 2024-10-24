package adapter2;

import java.util.Iterator;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] {"Symptom", "Weight" };

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	  }

	  public int getColumnCount() {
		 return columnNames.length;
	  }

	  public String getColumnName(int i) {
		  return columnNames[i];
	  }

	  public int getRowCount() {
	    return this.pacient.getSymptoms().size();
	  }

	  public Object getValueAt(int row, int col) {
		  Iterator<Symptom> iterator = pacient.getSymptoms().iterator(); 
		  Symptom currentSymptom = null; 

		  for(int i = 0; i <= row; i++) { 
			  if(iterator.hasNext()) { 
				  currentSymptom = iterator.next(); 
			  } else { 
				  return null;
			  }
		  }
		  if(currentSymptom == null) { 
			  return null;
		  } 
		  switch(col) { 
		  	case 0:
		  		return currentSymptom.getName(); 
		  	case 1:
		  		return pacient.getWeight(currentSymptom); 
		  	default: 
		  		return null;
		  }
	  }
	}
