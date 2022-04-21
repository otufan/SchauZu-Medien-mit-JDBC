package schauzu.projekt;

public class Schauspieler extends Film{

	private int id;
	private String name;
	private String vorname;
	private boolean hauptrolle;
	
	
	
	public Schauspieler() {

	}

	public Schauspieler(String filmtitel, int dauer, String inhaltbeschreibung, int id, String name, String vorname, boolean hauptrolle) {
		
		setFilmtitel(filmtitel);
		setDauer(dauer);
		setInhaltbeschreibung(inhaltbeschreibung);
		setId(id);
		setName(name);
		setVorname(vorname);
		setHauptrolle(hauptrolle);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
		
	}

	public boolean isHauptrolle() {
		return hauptrolle;
	}

	public void setHauptrolle(boolean hauptrolle) {
		this.hauptrolle = hauptrolle;
	}
	
	@Override
	public String toString() {
		
		String hR=isHauptrolle() ? "Hauptdarsteller 1" : "Hauptdarsteller 2";
		
		return super.toString()+", Name=" + vorname + " " + name +", Rolle=" + hR;
	}

	
		
}
