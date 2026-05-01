import java.sql.*;

public class HospitalManager {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO patients VALUES (1,'Aman','Fever')");
            st.executeUpdate("INSERT INTO patients VALUES (2,'Riya','Diabetes')");
            st.executeUpdate("INSERT INTO patients VALUES (3,'Vikram','Fever')");

            ResultSet rs = st.executeQuery("SELECT * FROM patients WHERE disease='Fever'");

            while (rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));

            st.executeUpdate("UPDATE patients SET disease='Cold' WHERE id = 1");

            st.executeUpdate("DELETE FROM patients WHERE id = 2");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}