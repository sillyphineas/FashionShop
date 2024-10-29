/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entity.Categories;
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
public class DAOCategories extends DBConnection {

    public int addCategory(Categories cate) {
        int n = 0;
        String sql = "INSERT INTO [dbo].[Categories]\n"
                + "           ([CategoryName])\n"
                + "     VALUES\n"
                + "           (?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, cate.getCategoryName());

            n = pre.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }

    public Vector<Categories> getCategories(String sql) {
        Vector<Categories> vector = new Vector<Categories>();
        Statement state;
        try {
            state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = state.executeQuery(sql);
            while (rs.next()) {
                int CategoryID = rs.getInt(1);
                String CategoryName = rs.getString(2);
                vector.add(new Categories(CategoryID, CategoryName));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vector;
    }

    public static void main(String[] args) {
        DAOCategories dao = new DAOCategories();
        Vector<Categories> listCategories = dao.getCategories("SELECT * FROM [dbo].[Categories]");
        for (Categories cate : listCategories) {
            System.out.println(cate.getCategoryName());
        }
    }
}
