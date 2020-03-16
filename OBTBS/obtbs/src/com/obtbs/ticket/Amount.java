package com.obtbs.ticket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Amount {
    
    private int Quantity;
    private double price;
    
    public Amount(int Quantity, double price){
        setQuantity(Quantity);
        setPrice(price);
//        System.out.println(toString());
    }
    
    public void setQuantity(int Quantity){
        this.Quantity = Quantity;
    }
    public int getQuantity(){
        return(this.Quantity);
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return(this.price);
    }
    
    public double totalAmount(){
        return (getQuantity() * getPrice());
    }
    
    public String toString(){
        return String.format("Total Amount\t:RM %.2f", totalAmount());
    }
}
