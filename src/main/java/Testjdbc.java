import java.sql.Connection;
import java.sql.DriverManager;

public class Testjdbc {
public static void main(String[] args) {
		
	
String jdbcUrl="jdbc:mysql://localhost:3306/dbusers";
	String user ="root";
	String pass= "";
	try {
		System.out.println("Connecting to database!!!" +jdbcUrl);
		Connection myCon= DriverManager.getConnection(jdbcUrl, user, pass);
	}catch(Exception exc) {
		
		exc.printStackTrace();
	}
	

}


}
