package schauzu.projekt;

import java.sql.*;
import java.util.Scanner;

public class SchauzuTest {
	
	static String benutzerName="root";
	static String pass="Pass.4150";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner scan = new Scanner(System.in);
		
		  System.out.println("------------- überprüfen die Verbindung zwischen MySQL un Java ----------------------"); 
		  System.out.println("-------------------------------------------------------------------------------------"); 
		  
		  Methode mt = new Methode(); String filmtitel = ""; String neuerFilm = "";
		  
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  Connection con = DriverManager.getConnection(
		  "jdbc:mysql://localhost:3306/schauzu_projekt?serverTimezone=UTC",benutzerName, pass);
		  
		  Statement st = con.createStatement();
		  
		  mt.getAllFilmtitel(); // Mit Hilfe dieser Methode werden alle Filmtitels in der Datenbank auf der Konsole angezeigt.
		  
		  System.out.println("Bitte geben Sie die Namen des Films ein, zu dem Sie auf Informationen zugreifen möchten : ");
		  
		  filmtitel = scan.nextLine();
		  
		  mt.menu(filmtitel); // Mit Hilfe dieser Methode sind beliebige Informationen zu diesen Filmtiteln optional verfügbar.
		  
		  System.out.println("Möchten Sie einen neuen Film einfügen ? (Ja/Nein) ");
		  
		  neuerFilm = scan.next();
		  
		  if (neuerFilm.equalsIgnoreCase("ja")) { mt.addFilm(); }
		  
		  mt.getAllFilmtitel(); //Mit Hilfe dieser Methode kann ein Film, der sich nicht in der Datenbank befindet, der Datenbank hinzugefügt werden.
		  
		  st.close(); 
		  con.close();
		 
		
		System.out.println("--------------------- überprüfen die Objekte Klasse in Java -------------------------");
		System.out.println("-------------------------------------------------------------------------------------\n");
		
		System.out.println("TESTEN: spreichern jedes Klassenobjekts im Array, dessen Datentyp Film ist\n");
		
		Film[] filmList=new Film[6];
		
		Film f=new Film("Batman Begins", 140, "Inhalbeschreibung für Batman Begins");
		Genre g=new Genre("Shutter Island", 138, "Inhalbeschreibung für Shutter Island", 222, "Drama");
		Schauspieler s1=new Schauspieler("Star Wars", 121, "Inhalbeschreibung für Star Wars", 1002, "Hamill", "Mark", true);
		Schauspieler s2=new Schauspieler("The Bourne Supremacy", 108, "Inhalbeschreibung für The Bourne Supremacy", 1007, "Cox", "Brian", false);
		Land l=new Land("Shutter Island", 138, "Inhalbeschreibung für Shutter Island",100, "Vereinigte Staaten");
		Filmstudio fs=new Filmstudio("The Pianist", 150, "Inhalbeschreibung für The Pianist",13, "StudioCanal");
		
		filmList[0]=f;
		filmList[1]=g;
		filmList[2]=s1;
		filmList[3]=s2;
		filmList[4]=l;
		filmList[5]=fs;
		
		for (Film film : filmList) {
			System.out.println(film);
		}
				
		System.out.println("\nTESTEN: überprüfen, ob ein negativer Wert für die Dauer des Films angegeben ist.");
		f.setDauer(-16); 
		
		System.out.println("f.getDauer() : "+f.getDauer());
		
		System.out.println("\nTESTEN: überprüfen die Vererbung zwischen die Klassen Filmstudio und Film als Beispiel");
		
		Filmstudio filmstudio= new Filmstudio();
		
		filmstudio.setFilmtitel("Test");
		filmstudio.setInhaltbeschreibung("Test");
		filmstudio.setDauer(120);
		filmstudio.setStudioName("Test");
		
		System.out.println(filmstudio);

	}

}
