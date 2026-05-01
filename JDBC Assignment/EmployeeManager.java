import java.sql.*;

public class EmployeeManager {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO employee VALUES (1,'Amit',50000)");
            st.executeUpdate("INSERT INTO employee VALUES (2,'Rahul',12000)");

            ResultSet rs = st.executeQuery("SELECT * FROM employee WHERE salary > 30000");

            while (rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));

            st.executeUpdate("UPDATE employee SET salary = salary*1.10 WHERE id=1");

            st.executeUpdate("DELETE FROM employee WHERE salary < 15000");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}