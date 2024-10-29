/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entity.Products;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class DAOProducts extends DBConnection {

    public int addProduct(Products pro) {
        int n = 0;
        String sql = "INSERT INTO [dbo].[Products]\n"
                + "           ([ProductName]\n"
                + "           ,[Price]\n"
                + "           ,[Stock]\n"
                + "           ,[CategoryID]\n"
                + "           ,[Description]\n"
                + "           ,[ImageURL])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, pro.getProductName());
            pre.setDouble(2, pro.getPrice());
            pre.setInt(3, pro.getStock());
            pre.setInt(4, pro.getCategoryID());
            pre.setString(5, pro.getDescription());
            pre.setString(6, pro.getImageURL());

            n = pre.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }

    public Vector<Products> getProducts(String sql) {
        Vector<Products> vector = new Vector<Products>();
        Statement state;
        try {
            state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = state.executeQuery(sql);
            while (rs.next()) {
                int ProductID = rs.getInt(1);
                String ProductName = rs.getString(2);
                double Price = rs.getDouble(3);
                int Stock = rs.getInt(4);
                int CategoryID = rs.getInt(5);
                String Description = rs.getString(6);
                String ImageURL = rs.getString(7);
                vector.add(new Products(ProductID, ProductName, Price, Stock, CategoryID, Description, ImageURL));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vector;
    }

    public int getTotalProducts(String sql) {
        int total = 0;
        try {
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            if (rs.next()) {
                total = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return total;
    }

    public Products getProductById(int pid) {
        Products pro = null;
        String sql = "SELECT * FROM Products WHERE ProductID = " + pid;
        try {
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            if (rs.next()) {
                int ProductID = rs.getInt(1);
                String ProductName = rs.getString(2);
                double Price = rs.getDouble(3);
                int Stock = rs.getInt(4);
                int CategoryID = rs.getInt(5);
                String Description = rs.getString(6);
                String ImageURL = rs.getString(7);
                
                pro = new Products(ProductID, ProductName, Price, Stock, CategoryID, Description, ImageURL);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pro;
    }
    
    public int updateProduct(Products pro) {
        int n = 0;
        String sql = "UPDATE [dbo].[Products]\n"
                + "   SET [ProductName] = ?,[Price] = ?,[Stock] = ?,[CategoryID] = ?,[Description] = ?,[ImageURL] = ?\n"
                + " WHERE ProductID=?";
        try {
            //  ? --> field , index start 1 : first : ProductName; second:  SupplierID ...
            PreparedStatement pre = conn.prepareStatement(sql);
            
            pre.setString(1, pro.getProductName());
            pre.setDouble(2, pro.getPrice());
            pre.setInt(3, pro.getStock());
            pre.setInt(4, pro.getCategoryID());
            pre.setString(5, pro.getDescription());
            pre.setString(6, pro.getImageURL());
            pre.setInt(7, pro.getProductID());
            
            
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }
    
    public int deleteProduct(int pid) {
        int n = 0;        
        String sql = "delete from Products where ProductID=" + pid;
        try {
            Statement state = conn.createStatement();
            n = state.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }
    
    public static void main(String[] args) {
        DAOProducts dao = new DAOProducts();
//        Vector<Products> vector = dao.getProducts("SELECT * FROM PRODUCTS");
//        for (Products x : vector) {
//            System.out.println(x.getImageURL());
//        }
        Products p = dao.getProductById(165);
        System.out.println(p.getProductID() + " " + p.getProductName());
    }
}
