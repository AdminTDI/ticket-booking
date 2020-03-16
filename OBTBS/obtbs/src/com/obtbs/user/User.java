/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obtbs.user;

import com.obtbs.ticket.BookingTicket;
import java.util.Scanner;

/**
 *
 * @author fhfai
 */
public abstract class User {

    Scanner input = new Scanner(System.in);
    private String usrName;
    private String usrPass;
    private String usrFname;
    private String usrLname;
    private String usrAge;
    private String usrPhone;
    private String usrEmail;
    private BookingTicket book;

    //constructor
    
    public User(){}
    
    public User(String usrName, String usrPass, String usrFname, String usrLname, String usrPhone, String usrAge, String usrEmail) {
        setUsrName(usrName);
        setUsrPass(usrPass);
        setUsrFname(usrFname);
        setUsrLname(usrLname);
        setUsrPhone(usrPhone);
        setUsrAge(usrAge);
        setUsrEmail(usrEmail);
    }

    //getter seeter variable
    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrPass() {
        return usrPass;
    }

    public void setUsrPass(String usrPass) {
        this.usrPass = usrPass;
    }

    public String getUsrFname() {
        return usrFname;
    }

    public void setUsrFname(String usrFname) {
        this.usrFname = usrFname;
    }

    public String getUsrLname() {
        return usrLname;
    }

    public void setUsrLname(String usrLname) {
        this.usrLname = usrLname;
    }

    public String getUsrAge() {
        return usrAge;
    }

    public void setUsrAge(String usrAge) {
        this.usrAge = usrAge;
    }

    public String getUsrPhone() {
        return usrPhone;
    }

    public void setUsrPhone(String usrPhone) {
        this.usrPhone = usrPhone;
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }
    //User method 
//    public abstract void menu(); 
//    
//    public void displayProfile() {
//        System.out.println("Username\t: " + getUsrName());
//        System.out.println("Password\t: " + getUsrPass());
//        System.out.println("Phone No\t: " + getUsrPhone());
//        System.out.println("Email\t\t: " + getUsrEmail());
//    }

//    public void updateProfile() {
//        System.out.print("Username\t: ");
//        String username = input.next();
//        setUsrName(username);
//        System.out.print("Password\t: ");
//        String password = input.next();
//        setUsrPass(password);
//        System.out.print("Phone No\t: ");
//        String phone = input.next();
//        setUsrPhone(phone);
//        System.out.print("Email\t\t: ");
//        String email = input.next();
//        setUsrEmail(email);
//    }
//    public void BookTicket(){
//        System.out.print("TicketNo\t: ");
//        int ticket = input.nextInt();        
//        System.out.print("Seat No\t\t: ");
//        int seat = input.nextInt();        
//        System.out.print("Quantity\t: ");
//        int qty = input.nextInt();       
//        System.out.print("Price\t\t: ");
//        double p = input.nextDouble();
//              
//        System.out.println("");
//        System.out.println("----Welcome to OBTBS-------");
//        System.out.println("Username\t: "+getUsrName());
//        System.out.println("Phone\t\t: "+getUsrPhone());
//        System.out.println("Email\t\t: "+getUsrEmail());
//        
//        this.amount = new Amount(qty, p);
//        this.book = new BookingTicket(ticket, seat, amount);
//        this.book.setTicketNo(ticket);
//        this.book.setSeatNo(seat);
//        this.amount.setQuantity(qty);
//        this.amount.setPrice(p);
//        System.out.println("---------------------------");
//    }
//    public void login() {
//        System.out.print("Enter Username: ");
//        String name = input.nextLine();
//        System.out.print("Enter Password: ");
//        String pass = input.nextLine();
//
//        if (name.equals(getUsrName()) && pass.equals(getUsrPass())) {
//            System.out.println("Login Success..");
//            menu();
//        } else {
//            System.out.println("Wrong password");
//        }
//    }
}
