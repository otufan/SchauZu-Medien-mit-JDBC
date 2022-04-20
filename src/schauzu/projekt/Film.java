package schauzu.projekt;

public class Film  {
	
	private String filmtitel;
	private int dauer;
	private String inhaltbeschreibung;
	
	
	public Film() {

	}

	public Film(String filmtitel, int dauer, String inhaltbeschreibung) {
		
		setFilmtitel(filmtitel);
		setDauer(dauer);
		setInhaltbeschreibung(inhaltbeschreibung);
	}

	public String getFilmtitel() {
		return filmtitel;
	}

	public void setFilmtitel(String filmtitel) {
		this.filmtitel = filmtitel;
	}


	public int getDauer() {
		return dauer;
	}

	public void setDauer(int dauer) {
		this.dauer = dauer;
	}

	public String getInhaltbeschreibung() {
		return inhaltbeschreibung;
	}

	public void setInhaltbeschreibung(String inhaltbeschreibung) {
		this.inhaltbeschreibung = inhaltbeschreibung;
	}

	@Override
	public String toString() {
		return "Filmtitel=" + filmtitel + ", Dauer=" + dauer + ", Inhaltbeschreibung=" + inhaltbeschreibung;
	}
	

}
