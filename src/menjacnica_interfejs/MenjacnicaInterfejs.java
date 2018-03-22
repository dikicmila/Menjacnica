package menjacnica_interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface MenjacnicaInterfejs {

	public void dodajKurs(Valuta valuta, GregorianCalendar datum, String tip, double cena);
	
	public void brisiKurs(Valuta valuta, GregorianCalendar datum);
	
	public Kurs nadjiKurs(Valuta valuta, GregorianCalendar datum);
}
