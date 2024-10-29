/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author HP
 */
public class Orders {
    private int OrderID;
    private int UserID;
    private String OrderDate;
    private double TotalAmount;
    private String Status;
    private String FirstName;
    private String LastName;
    private String Country;
    private String Address;
    private String Phone;
    private String Email;
    private String OrderNotes;

    public Orders(int OrderID, int UserID, String OrderDate, double TotalAmount, String Status, String FirstName, String LastName, String Country, String Address, String Phone, String Email, String OrderNotes) {
        this.OrderID = OrderID;
        this.UserID = UserID;
        this.OrderDate = OrderDate;
        this.TotalAmount = TotalAmount;
        this.Status = Status;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Country = Country;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
        this.OrderNotes = OrderNotes;
    }

    public Orders(int UserID, String OrderDate, double TotalAmount, String Status, String FirstName, String LastName, String Country, String Address, String Phone, String Email, String OrderNotes) {
        this.UserID = UserID;
        this.OrderDate = OrderDate;
        this.TotalAmount = TotalAmount;
        this.Status = Status;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Country = Country;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
        this.OrderNotes = OrderNotes;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public double getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(double TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getOrderNotes() {
        return OrderNotes;
    }

    public void setOrderNotes(String OrderNotes) {
        this.OrderNotes = OrderNotes;
    }

    
    
    
}
