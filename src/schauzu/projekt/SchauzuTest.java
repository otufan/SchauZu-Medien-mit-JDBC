package schauzu.projekt;

import java.sql.*;
import java.util.Scanner;

public class SchauzuTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schauzu_projekt?serverTimezone=UTC", "root", "Pass.4150");

		Statement st = con.createStatement();

		ResultSet veri1 = st.executeQuery("SELECT * FROM film f, filmstudio fs where f.filmstudio_id=fs.filmstudio_id and fs.studio_name='Warner Bros'");


		Scanner scan=new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Filmtitel ein : ");
		String sorgu = scan.nextLine();
		
		String sonuc="SELECT * FROM film f, film_land fl, land l where l.land_id=fl.land_id and fl.filmtitel=f.filmtitel and f.filmtitel='" +sorgu +"'";
		
		ResultSet veri = st.executeQuery(sonuc);
		
		
		while (veri.next()) {
			System.out.println(veri.getString("Land") + " " + veri.getInt("Dauer")+ " " + veri.getString("filmtitel") );


		}

		st.close();
		con.close();

	}

}
