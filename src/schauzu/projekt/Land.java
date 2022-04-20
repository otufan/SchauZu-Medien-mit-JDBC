package schauzu.projekt;

public class Land extends Film{

	private int landId;
	private String land;

	public Land() {

	}

	public Land(int landId, String land) {

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
		return "Land Id=" + landId + ", Land=" + land;
	}

	
}
