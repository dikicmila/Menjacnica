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
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs nadjiKurs(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
