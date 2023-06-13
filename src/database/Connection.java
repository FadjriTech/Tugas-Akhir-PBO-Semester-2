package database;

import java.sql.*;
import java.util.*;

public final class Connection {
    private static java.sql.Connection conn;

    private static final String URL = "jdbc:mysql://localhost/pos";
    private static final String USERNAME = "faidfadjri";
    private static final String PASSWORD = "bismillah";
    
    
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
    
    public int getCash() {
        int total = 0;
        ResultSet rs = null;
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT SUM(harga) as total FROM transaksi");

            if (rs.next()) {
                String totalStr = rs.getString("total");
                if (totalStr != null) {
                    total = Integer.parseInt(totalStr);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving data from the database: " + e.getMessage());
        }

        return total;
    }

    
    public void insertTransaction(String barang, int price) {
        try {
            // Prepare the SQL statement with placeholders for the values
            String sql = "INSERT INTO transaksi (barang, harga) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Set the values for the prepared statement
            pstmt.setString(1, barang);
            pstmt.setInt(2, price);

            // Execute the statement
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error inserting data into the database: " + e.getMessage());
        }
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
    
    
    
    
    
    public void updateStockTo(String item, int qty){
        try {
            // Prepare the SQL statement with placeholders for the values
            String sql = "UPDATE stok SET quantity = quantity - ? WHERE item = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Set the values for the prepared statement
            pstmt.setInt(1, qty);
            pstmt.setString(2, item);

            // Execute the statement
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error inserting data into the database: " + e.getMessage());
        }
    }
    
    
    public void deleteStokById(String idBarang){
        try {
            // Prepare the SQL statement with placeholders for the values
            String sql = "DELETE FROM stok WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Set the values for the prepared statement
            pstmt.setInt(1, Integer.parseInt(idBarang));

            // Execute the statement
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error inserting data into the database: " + e.getMessage());
        }
    }
    
    
    public void deleteTransactionById(String idTransaksi){
        try {
            // Prepare the SQL statement with placeholders for the values
            String sql = "DELETE FROM transaksi WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Set the values for the prepared statement
            pstmt.setInt(1, Integer.parseInt(idTransaksi));

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
