package vetdb.database;


import java.sql.*;
import java.util.Properties;

public class Postgres {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql:/localhost:5433/vetdb";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "tysker3085");
        try (Connection conn = DriverManager.getConnection(url, props)) {
            String sql = "SELECT * FROM CatsEntity;";
            PreparedStatement statement = conn.prepareStatement(sql);
            try (ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    System.out.println("" + result.getInt(1) + " " + result.getString(2));
                }
            }
        }
    }
}
