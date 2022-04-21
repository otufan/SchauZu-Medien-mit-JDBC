package schauzu.projekt;

public class Filmstudio extends Film{
	
	private int studioId;
	private String studioName;
	
	public Filmstudio() {
		
	}

	public Filmstudio(String filmtitel, int dauer, String inhaltbeschreibung, int studioId, String studioName) {
		
		setFilmtitel(filmtitel);
		setDauer(dauer);
		setInhaltbeschreibung(inhaltbeschreibung);
		setStudioId(studioId);
		setStudioName(studioName);
	}

	public int getStudioId() {
		return studioId;
	}

	public void setStudioId(int studioId) {
		this.studioId = studioId;
	}

	public String getStudioName() {
		return studioName;
	}

	public void setStudioName(String studioName) {
		this.studioName = studioName;
	}

	@Override
	public String toString() {
		return super.toString()+ ", Studio Name=" + studioName;
	}
	
}
