package iterator;

import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.Covid19PacientAdapter;
import adapter.SeverityIndexComparator;
import adapter.Sorting;
import adapter.SymptomNameComparator;
import domain.Covid19Pacient;
import domain.FactorySymptom;
import domain.Symptom;

	public class Main {

		public static void main(String[] args) {
			FactorySymptom fs = new FactorySymptom();
			Covid19Pacient p=new Covid19Pacient("Ane", 29, fs);
			p.addSymptom(new Symptom("s2", 10, 14), 1);
			p.addSymptom(new Symptom("s4", 10, 12), 2);
			p.addSymptom(new Symptom("s3", 10, 7), 3);
			p.addSymptom(new Symptom("s1", 10, 16), 4);
			p.addSymptom(new Symptom("s5", 10, 10), 5);
			
			Covid19PacientAdapter pAdapter = new Covid19PacientAdapter(p.getSymptoms());
			SeverityIndexComparator sic = new SeverityIndexComparator();
			SymptomNameComparator snc = new SymptomNameComparator();
			
			Iterator i1=Sorting.sortedIterator(pAdapter, sic);
			while(i1.hasNext())
				System.out.println(i1.next());
			
			System.out.println("");
			
			Iterator i2=Sorting.sortedIterator(pAdapter, snc);
			while(i2.hasNext())
				System.out.println(i2.next());


		}

	}

