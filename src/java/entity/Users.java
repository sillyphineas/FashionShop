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
    private int UserID;
    private String Username;
    private String Password;
    private int RoleID;

    public Users(int UserID, String Username, String Password, int RoleID) {
        this.UserID = UserID;
        this.Username = Username;
        this.Password = Password;
        this.RoleID = RoleID;
    }

    public Users(String Username, String Password, int RoleID) {
        this.Username = Username;
        this.Password = Password;
        this.RoleID = RoleID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int RoleID) {
        this.RoleID = RoleID;
    }
    
    
}
