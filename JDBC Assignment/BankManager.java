import java.sql.*;

public class BankManager {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO accounts VALUES (101,'Amit',15000)");
            st.executeUpdate("INSERT INTO accounts VALUES (102,'Riya',5000)");
            st.executeUpdate("INSERT INTO accounts VALUES (103,'Vikram',25000)");

            ResultSet rs = st.executeQuery(
                "SELECT * FROM accounts WHERE balance > 10000"
            );

            while (rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));

            st.executeUpdate(
                "UPDATE accounts SET balance = balance + 2000 WHERE accNo = 102"
            );

            st.executeUpdate(
                "DELETE FROM accounts WHERE accNo = 101"
            );

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}