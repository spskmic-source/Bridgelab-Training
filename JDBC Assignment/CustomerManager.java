import java.sql.*;

public class CustomerManager {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO customers VALUES (1,'Aman','9876543210')");
            st.executeUpdate("INSERT INTO customers VALUES (2,'Riya','9123456780')");
            st.executeUpdate("INSERT INTO customers VALUES (3,'Vikram','9988776655')");

            ResultSet rs = st.executeQuery(
                "SELECT * FROM customers WHERE name LIKE 'R%'"
            );

            while (rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));

            st.executeUpdate(
                "UPDATE customers SET phone='9000000000' WHERE id=2"
            );

            st.executeUpdate(
                "DELETE FROM customers WHERE id=3"
            );

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}