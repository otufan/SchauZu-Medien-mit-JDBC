package schauzu.projekt;

import java.sql.*;
import java.util.Scanner;

public class Methode {

	public void menu(String filmtitel) throws ClassNotFoundException, SQLException {

		Scanner scan = new Scanner(System.in);

		int auswahl = 0;
		String film = filmtitel;

		do {

			System.out.println(
					"\n1-Dauer \n2-Hauptdarsteller \n3-Filmstudio \n4-Land \n5-Genre \n6-Inhaltbeschreibung \n7-neuen Film eingeben \n8-Exit");

			System.out.println("Welche Information möchten Sie erreichen ? ");
			auswahl = scan.nextInt();

			switch (auswahl) {
			case 1:
				findDauer(film);
				break;
			case 2:
				findHauptdarsteller(film);
				break;
			case 3:
				findFilmstudio(film);
				break;
			case 4:
				findLand(filmtitel);
				break;
			case 5:
				findGenre(filmtitel);
				break;
			case 6:
				findInhaltbeschreibung(filmtitel);
				break;
			case 7:
				getAllFilmtitel();
				film = neuerFilmtitel();
				break;
			case 8:
				System.out.println("Vielen Dank ! ");
				break;
			default:
				System.out.println("Bitte geben Sie eine Nummer zwischen 1-8 ein ! ");
				break;
			}

		} while (auswahl != 8);

	}

	
	public static void findDauer(String filmtitel) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schauzu_projekt?serverTimezone=UTC",
				"root", "Pass.4150");

		Statement st = con.createStatement();

		String abfrage = "SELECT * FROM film WHERE filmtitel='" + filmtitel + "'";

		ResultSet veri = st.executeQuery(abfrage);

		while (veri.next()) {
			System.out.println("Filmtitel : " + veri.getString("Filmtitel") + ", Dauer : " + veri.getString("Dauer"));
		}

		st.close();
		con.close();

	}

	public static void findHauptdarsteller(String filmtitel) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schauzu_projekt?serverTimezone=UTC",
				"root", "Pass.4150");

		Statement st = con.createStatement();

		String abfrage = "SELECT * FROM film f, hauptdarsteller h, schauspieler s WHERE f.filmtitel=h.filmtitel and h.schauspieler_id=s.schauspieler_id and f.filmtitel='"
				+ filmtitel + "'";

		ResultSet veri = st.executeQuery(abfrage);

		while (veri.next()) {
			System.out.println("Vorname und Name : " + veri.getString("Vorname") + " " + veri.getString("Name")
					+ ", Rolle: " + veri.getString("Rolle"));
		}

		st.close();
		con.close();

	}

	public static void findFilmstudio(String filmtitel) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schauzu_projekt?serverTimezone=UTC",
				"root", "Pass.4150");

		Statement st = con.createStatement();

		String abfrage = "SELECT * FROM film f, filmstudio fs WHERE f.filmstudio_id=fs.filmstudio_id and f.filmtitel='"
				+ filmtitel + "'";

		ResultSet veri = st.executeQuery(abfrage);

		while (veri.next()) {
			System.out.println(
					"Filmtitel : " + veri.getString("Filmtitel") + "\nFilmstudio : " + veri.getString("studio_name"));
		}

		st.close();
		con.close();

	}

	public static void findLand(String filmtitel) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schauzu_projekt?serverTimezone=UTC",
				"root", "Pass.4150");

		Statement st = con.createStatement();

		String abfrage = "SELECT * FROM film f, film_land fl, land l WHERE f.filmtitel=fl.filmtitel and fl.land_id=l.land_id and f.filmtitel='"
				+ filmtitel + "'";

		ResultSet veri = st.executeQuery(abfrage);

		System.out.print("Länder, in denen der Film gedreht wurde : ");

		while (veri.next()) {
			System.out.print(veri.getString("Land") + " \t");

		}
		System.out.println();
		st.close();
		con.close();

	}

	public static void findGenre(String filmtitel) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schauzu_projekt?serverTimezone=UTC",
				"root", "Pass.4150");

		Statement st = con.createStatement();

		String abfrage = "SELECT * FROM film f, film_genre fg, genre g WHERE f.filmtitel=fg.filmtitel and fg.genre_id=g.genre_id and f.filmtitel='"
				+ filmtitel + "'";

		ResultSet veri = st.executeQuery(abfrage);

		System.out.print("Filmgenre : ");

		while (veri.next()) {
			System.out.print(veri.getString("Bezeichnung") + " - ");
		}
		System.out.println();
		st.close();
		con.close();

	}

	public static void findInhaltbeschreibung(String filmtitel) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schauzu_projekt?serverTimezone=UTC",
				"root", "Pass.4150");

		Statement st = con.createStatement();

		String abfrage = "SELECT * FROM film WHERE filmtitel='" + filmtitel + "'";

		ResultSet veri = st.executeQuery(abfrage);

		while (veri.next()) {
			System.out.println("Filmtitel : " + veri.getString("Filmtitel") + "\nInhaltbeschreibung : "
					+ veri.getString("Inhaltbeschreibung"));

		}

		st.close();
		con.close();

	}
	
	public void getAllFilmtitel() throws ClassNotFoundException, SQLException {

		int count=0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schauzu_projekt?serverTimezone=UTC", "root", "Pass.4150");

		Statement st = con.createStatement();
		
		String abfrage = "SELECT * FROM film ";

		ResultSet veri = st.executeQuery(abfrage);

		while (veri.next()) {
			count++;
			System.out.println(count+". Filmtitel : " + veri.getString("Filmtitel"));
		}

		st.close();
		con.close();

	}

	public void addFilm() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schauzu_projekt?serverTimezone=UTC",
				"root", "Pass.4150");

		Statement st = con.createStatement();
		PreparedStatement ps = con.prepareStatement("INSERT INTO film VALUES(?,?,?,?)");

		Scanner scan = new Scanner(System.in);
		String eingabe = "";

		Film film = new Film();
		System.out.println("Bitte geben Sie den Filmtitel ein : ");
		film.setFilmtitel(scan.nextLine());
		System.out.println("Bitte geben Sie die Inhaltbeschreibung ein : ");
		film.setInhaltbeschreibung(scan.nextLine());
		System.out.println("Bitte geben Sie die Dauer des Films ein : ");
		film.setDauer(scan.nextInt());

		int idFilmStudio = einfugenFilmId();

		System.out.println("Möchten Sie den eingegeneben Film in der Datenbak einfügen ? (Ja/Nein) ");
		eingabe = scan.next();

		if (eingabe.equalsIgnoreCase("Ja")) {

			ps.setString(1, film.getFilmtitel());
			ps.setInt(2, film.getDauer());
			ps.setString(3, film.getInhaltbeschreibung());
			ps.setInt(4, idFilmStudio);
			ps.executeUpdate();
			System.out.println("Film wurde in der Datenbank eingefügt!");

		} else {
			System.out.println("Film wurde in der Datenbank NICHT eingefügt !");
		}

	}

	private String neuerFilmtitel() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bitte geben Sie neuen Filmtitel ein, zu dem Sie auf Informationen zugreifen möchten : ");

		String film = scan.nextLine();

		return film;
	}

	private int einfugenFilmId() {
		Scanner scan = new Scanner(System.in);
		int id = 0;

		System.out.println(
				"10-Warner Bros, \n11-Paramount Pictures \n12-Lucas Film \13-UFA \n14-Pinewood Studios\n15-Universal Picture");

		do {
			System.out.println("Bitte geben Sie die ID Nummer des Filmstudios ein :");

			id = scan.nextInt();
		} while (id < 10 || id > 15);

		return id;
	}

}
