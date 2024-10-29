/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author HP
 */
public class Products {
    private int ProductID;
    private String ProductName;
    private double Price;
    private int Stock;
    private int CategoryID;
    private String Description;
    private String ImageURL;

    public Products(int ProductID, String ProductName, double Price, int Stock, int CategoryID, String Description, String ImageURL) {
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.Price = Price;
        this.Stock = Stock;
        this.CategoryID = CategoryID;
        this.Description = Description;
        this.ImageURL = ImageURL;
    }

    public Products(String ProductName, double Price, int Stock, int CategoryID, String Description, String ImageURL) {
        this.ProductName = ProductName;
        this.Price = Price;
        this.Stock = Stock;
        this.CategoryID = CategoryID;
        this.Description = Description;
        this.ImageURL = ImageURL;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String ImageURL) {
        this.ImageURL = ImageURL;
    }
    
    
}
