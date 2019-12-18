/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.beans;

/**
 *
 * @author 14372
 */
public class AddBooks {
    
    private String title;
    private String author;
    private double price;
    private int inventoryQuantity;
    private String listOfCourses;

    public AddBooks(String title, String author, double price, int inventoryQuantity, String listOfCourses) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.inventoryQuantity = inventoryQuantity;
        this.listOfCourses = listOfCourses;
    }

    

    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the inventoryQuantity
     */
    public int getInventoryQuantity() {
        return inventoryQuantity;
    }

    /**
     * @param inventoryQuantity the inventoryQuantity to set
     */
    public void setInventoryQuantity(int inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    /**
     * @return the listOfCourses
     */
    public String getListOfCourses() {
        return listOfCourses;
    }

    /**
     * @param listOfCourses the listOfCourses to set
     */
    public void setListOfCourses(String listOfCourses) {
        this.listOfCourses = listOfCourses;
    }
    
}
