package schauzu.projekt;

public class Land extends Film{

	private int landId;
	private String land;

	public Land() {

	}

	public Land(String filmtitel, int dauer, String inhaltbeschreibung, int landId, String land) {

		setFilmtitel(filmtitel);
		setDauer(dauer);
		setInhaltbeschreibung(inhaltbeschreibung);
		setLandId(landId);
		setLand(land);
	}

	public int getLandId() {
		return landId;
	}

	public void setLandId(int landId) {
		this.landId = landId;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	@Override
	public String toString() {
		return super.toString()+ ", Land=" + land;
	}

	
}
