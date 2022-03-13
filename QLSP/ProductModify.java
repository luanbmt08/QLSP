/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSP;

/**
 *
 * @author ADMIN
 */
import QLSP.Product;
import QLSP.ConnectSql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class ProductModify {
    public static List<Product> getProductList(String s){
        List<Product> dataList = new ArrayList<>();
        Connection conn=null;
        PreparedStatement statement=null;
         
        try {
            conn = DriverManager.getConnection(ConnectSql.URL, ConnectSql.USERNAME,ConnectSql.PASSWORD);
            String sql = "select * from Product";
            if(s!= null && !s.isEmpty()) {
                sql += " where IdPD like ?";
            }
            statement = conn.prepareStatement(sql);
            if(s != null && !s.isEmpty()) {
                statement.setString(1, s);
            }
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                Product sp = new Product(
                        resultSet.getString("IdPD"),
                        resultSet.getString("NamePD"),
                        resultSet.getString("Catogery"),
                        resultSet.getString("Quantity"),
                        resultSet.getString("Price")
                );
                dataList.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dataList;
    }
    public static void insert(Product sp) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(ConnectSql.URL,ConnectSql.USERNAME,ConnectSql.PASSWORD);
            
            String sql = "insert into Product(IdPD,NamePD,Catogery,Quantity,Price) "
                    + "values (?, ?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, sp.getIdPD());
            statement.setString(2, sp.getNamePD());
            statement.setString(3, sp.getCatogery());
            statement.setString(4, sp.getQuantity());
            statement.setString(5, sp.getPrice());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void update(Product sp) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(ConnectSql.URL, ConnectSql.USERNAME, ConnectSql.PASSWORD);
            
            String sql = "update Product set IdPD = ?, NamePD = ?, Catogery = ?, Quantity = ?, Price = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, sp.getIdPD());
            statement.setString(2, sp.getNamePD());
            statement.setString(3, sp.getCatogery());
             statement.setString(4, sp.getQuantity());
            statement.setString(5, sp.getPrice());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void delete(String IdPD) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(ConnectSql.URL, ConnectSql.USERNAME,ConnectSql.PASSWORD);
            
            String sql = "delete from Product where IdPD = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, IdPD);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}