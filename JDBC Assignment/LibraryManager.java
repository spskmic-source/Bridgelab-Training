import java.sql.*;

public class LibraryManager {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO books VALUES (1,'Java Basics','James','Available')");
            st.executeUpdate("INSERT INTO books VALUES (2,'DBMS','Korth','Available')");
            st.executeUpdate("INSERT INTO books VALUES (3,'Python','Guido','Issued')");

            ResultSet rs = st.executeQuery("SELECT * FROM books WHERE status='Available'");

            while (rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));

            st.executeUpdate("UPDATE books SET status='Issued' WHERE id=1");

            // DELETE (remove damaged/lost book)
            st.executeUpdate("DELETE FROM books WHERE id=3");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}