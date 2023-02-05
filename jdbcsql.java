import java.sql.*;

public class jdbcsql {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/customer_db";
        String username = "system";
        String password = "manager";
        
        try {
            // Establish a connection to the database
            Connection conn = DriverManager.getConnection(url, username, password);
            
            // Create a statement object
            Statement stmt = conn.createStatement();
            
            // Update the customer's information
            String sql = "UPDATE customers SET name='John Doe', email='johndoe@example.com' WHERE id=1";
            int rowsAffected = stmt.executeUpdate(sql);
            
            // Print the number of rows affected
            System.out.println(rowsAffected + " row(s) affected.");
            
            // Close the connection
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
