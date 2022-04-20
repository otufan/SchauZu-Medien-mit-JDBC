package schauzu.projekt;

import java.sql.*;
import java.util.Scanner;

public class SchauzuTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner scan=new Scanner(System.in);
		Methode mt=new Methode();
		
		String filmtitel="";
		String neuerFilm="";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schauzu_projekt?serverTimezone=UTC", "root", "Pass.4150");

		Statement st = con.createStatement();
		
		mt.getAllFilmtitel();
			
		System.out.println("Bitte geben Sie die Namen des Films ein, zu dem Sie auf Informationen zugreifen möchten : ");
		filmtitel=scan.nextLine();
		
		mt.menu(filmtitel);
		
		System.out.println("Möchten Sie einen neuen Film einfügen ? (Ja/Nein) ");
		neuerFilm=scan.next();
		
		if (neuerFilm.equalsIgnoreCase("ja")) {			
			mt.addFilm();
		}
		
		
		
		st.close();
		con.close();

	}

}
