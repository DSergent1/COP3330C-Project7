import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) throws SQLException {
        String uname = "d_sergent";  //probably don't need?
        String password = "password";
        String query = "select * from EngineeringStudents";
        String url = "jdbc:sqlite:C:\\Users\\danie\\sqlite\\University.db";

        try {
            Connection con = DriverManager.getConnection(url);
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);

            while(result.next()) {
                String UniversityData = "";
                for (int i = 1; i <= 6; i++){
                    UniversityData += result.getString(i) + ":";
                }
                System.out.println(UniversityData);
            }


            String UniversityData = "";
        } catch(SQLException e) {
            e.printStackTrace();
        }

    }

}
