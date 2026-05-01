import java.sql.*;

public class MovieManager {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO movies VALUES (1,'Pathaan',50)");
            st.executeUpdate("INSERT INTO movies VALUES (2,'Avengers',0)");
            st.executeUpdate("INSERT INTO movies VALUES (3,'Dunki',30)");

            ResultSet rs = st.executeQuery("SELECT * FROM movies WHERE seats > 0");

            while (rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));

            st.executeUpdate("UPDATE movies SET seats = seats - 1 WHERE id = 1");

            st.executeUpdate("DELETE FROM movies WHERE id = 2");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}