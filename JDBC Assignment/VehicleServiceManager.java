import java.sql.*;

public class VehicleServiceManager {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO vehicles VALUES ('UP32A1234','Aman','Pending')");
            st.executeUpdate("INSERT INTO vehicles VALUES ('UP32B5678','Riya','Completed')");
            st.executeUpdate("INSERT INTO vehicles VALUES ('UP32C9999','Vikram','Pending')");

            ResultSet rs = st.executeQuery("SELECT * FROM vehicles WHERE status='Pending'");

            while (rs.next())
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));

            st.executeUpdate("UPDATE vehicles SET status='Completed' WHERE regNo='UP32A1234'");

            st.executeUpdate("DELETE FROM vehicles WHERE regNo='UP32B5678'");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}