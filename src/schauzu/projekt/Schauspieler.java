package schauzu.projekt;

public class Schauspieler extends Film{

	private int id;
	private String name;
	private String vorname;
	
	public Schauspieler() {

	}

	public Schauspieler(int id, String name, String vorname) {
		
		setId(id);
		setName(vorname);
		setVorname(vorname);
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

	@Override
	public String toString() {
		return "Schauspieler ID=" + id + ", Name=" + name + ", Vorname=" + vorname;
	}
		
}
