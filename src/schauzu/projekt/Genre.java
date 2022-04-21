package schauzu.projekt;

public class Genre extends Film{
	
	private int genreId;
	private String bezeichnung;
	
	public Genre() {

	}

	public Genre(String filmtitel, int dauer, String inhaltbeschreibung, int genreId, String bezeichnung) {
		
		setFilmtitel(filmtitel);
		setDauer(dauer);
		setInhaltbeschreibung(inhaltbeschreibung);
		setGenreId(genreId);
		setBezeichnung(bezeichnung);
	}

	public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	@Override
	public String toString() {
		return super.toString()+", Bezeichnung=" + bezeichnung;
	}
	
	
}
