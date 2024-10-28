package adapter;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import domain.Symptom;

public class Covid19PacientAdapter implements InvertedIterator{
	
	private List<Symptom> symptoms = new Vector<Symptom>();
	private int pos;
	
	public Covid19PacientAdapter(Set<Symptom> s) {
		this.pos = s.size()-1;
		Iterator<Symptom> i=s.iterator();
		while (i.hasNext())
			symptoms.add(i.next());
	}

	@Override
	public Object previous() {
		Symptom s = symptoms.get(pos);
		pos--;
		return s;
	}

	@Override
	public boolean hasPrevious() {
		if(pos >= 0) return true;
		else return false;
	}

	@Override
	public void goLast() {
		pos = symptoms.size()-1;
	}

}
