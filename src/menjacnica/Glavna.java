package menjacnica;

import java.util.GregorianCalendar;

import menjacnica_interfejs.MenjacnicaInterfejs;

public class Glavna implements MenjacnicaInterfejs {

	@Override
	public void dodajKurs(Valuta valuta, GregorianCalendar datum, String tip, double cena) {
		Kurs novi = new Kurs(tip, datum, cena);
		valuta.kursevi.add(novi); 
	}

	@Override
	public void brisiKurs(Valuta valuta, GregorianCalendar datum) {
		for (int i = 0; i < valuta.kursevi.size(); i++) {
			if (valuta.kursevi.get(i).getDatum().equals(datum))
				valuta.kursevi.remove(i);
		}
	}

	@Override
	public Kurs nadjiKurs(Valuta valuta, GregorianCalendar datum) {
		for (int i = 0; i < valuta.kursevi.size(); i++) 
			if (valuta.kursevi.get(i).getDatum().equals(datum))
				return valuta.kursevi.get(i);
		return null;
	}

}
