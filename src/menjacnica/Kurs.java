package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	private String tip;
	private GregorianCalendar datum;
	private double cena;
	
	public Kurs() {
		
	}
	
	public Kurs(String tip, GregorianCalendar datum, double cena) {
		this.tip = tip;
		this.datum = datum;
		this.cena = cena;
	}
	
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		if (tip == null)
			throw new RuntimeException();
		this.tip = tip;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if (datum == null)
			throw new RuntimeException();
		this.datum = datum;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		if (cena < 0)
			throw new RuntimeException();
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Tip kursa: " + tip + " Datum: " + datum + " Cena: " + cena ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cena);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((tip == null) ? 0 : tip.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (Double.doubleToLongBits(cena) != Double.doubleToLongBits(other.cena))
			return false;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (tip == null) {
			if (other.tip != null)
				return false;
		} else if (!tip.equals(other.tip))
			return false;
		return true;
	}
	
	
	
}
