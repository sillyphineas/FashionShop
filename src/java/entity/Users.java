/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author HP
 */
public class Users {
    private int userID;
    private String username;
    private String password;
    private int roleID;

    public Users(int userID, String username, String password, int roleID) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.roleID = roleID;
    }

    public Users(String username, String password, int roleID) {
        this.username = username;
        this.password = password;
        this.roleID = roleID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    
    
}
