package schauzu.projekt;

public class Genre {
	
	private int genreId;
	private String bezeichnung;
	
	public Genre() {

	}

	public Genre(int genreId, String bezeichnung) {
		
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
		return "GenreId=" + genreId + ", Bezeichnung=" + bezeichnung;
	}
	
	
}
