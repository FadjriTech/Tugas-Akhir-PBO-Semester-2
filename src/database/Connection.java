package database;

import java.sql.*;
import java.util.*;

public final class Connection {
    private static java.sql.Connection conn;

    private static final String URL = "jdbc:mysql://localhost/pos";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    
    public Connection(){
        connect();
    }
    
    public void connect(){
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }
    
    
    public Object authentication(String username, String password) throws SQLException {
        
     // username validation
     try {
         Statement stmt = conn.createStatement();
         String sql = "SELECT * FROM user WHERE username = '" + username + "'";
         ResultSet rs = stmt.executeQuery(sql);

         if (rs.next()) {
            int id = rs.getInt("id");
            String storedPassword = rs.getString("password");
            String storedUsername = rs.getString("username");
            String role = rs.getString("role");
            
            UserModel user = new UserModel(id, storedUsername, storedPassword, role);
            

            // password matching
            if (storedPassword.equals(password)) {
                // Authentication successful
                return user;
            } else {
                // Wrong password
                return false;
            }
         } else { // 404
             return false;
         }
     } catch (SQLException e) {
         System.err.println("Error Message : " + e.getMessage());
     }
        return null;
    }
   
    
    // --> Buat Fungsi untuk mengembalikan nilai berupa Object ResultSet
    public ResultSet runQueries(String sql) {
        ResultSet rs = null;
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Error retrieving data from the database: " + e.getMessage());
        }

        return rs;
    }
    
    
    public void insertStok(String item, int price, int quantity) {
        try {
            // Prepare the SQL statement with placeholders for the values
            String sql = "INSERT INTO stok (item, price, quantity) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Set the values for the prepared statement
            pstmt.setString(1, item);
            pstmt.setDouble(2, price);
            pstmt.setInt(3, quantity);

            // Execute the statement
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error inserting data into the database: " + e.getMessage());
        }
    }
    
    
    



    public static List<Map<String, Object>> getData(String tableName) {
        List<Map<String, Object>> data = new ArrayList<>();

        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM " + tableName;
            ResultSet rs = stmt.executeQuery(sql);

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object value = rs.getObject(i);
                    row.put(columnName, value);
                }
                data.add(row);
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving data from the database: " + e.getMessage());
        }

        return data;
    }
}
