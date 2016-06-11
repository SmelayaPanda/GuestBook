import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

public class DBConnect {
    private static final String URL = "jdbc:mysql://localhost:3306/gbook";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";

    public static void addIntoDB(String name, String comments) throws ClassNotFoundException {

        Connection conn = null;
        Class.forName("com.mysql.jdbc.Driver");
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement ps = conn.prepareStatement("INSERT INTO guest (name, comment) values(?,?)");
            ps.setString(1, name);
            ps.setString(2, comments);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
