import java.sql.*;

public class ProductManager {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO product VALUES (1,'Pen',50)");
            st.executeUpdate("INSERT INTO product VALUES (2,'Notebook',5)");
            st.executeUpdate("INSERT INTO product VALUES (3,'Eraser',8)");

            ResultSet rs = st.executeQuery("SELECT * FROM product WHERE qty < 10");

            while (rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));

            st.executeUpdate("UPDATE product SET qty = qty + 20 WHERE pid = 2");

            st.executeUpdate("DELETE FROM product WHERE pid = 3");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}