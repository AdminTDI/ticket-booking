/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obtbs.user;

/**
 *
 * @author fhfai
 */
public class Customer extends User {

    private int cId;
    private String cMembership;
    
    public Customer(){}

    public Customer(String usrName, String usrPass, String usrFname, String usrLname, String usrPhone, String cMembership, String usrAge, String usrEmail) {
        super(usrName, usrPass, usrFname, usrLname, usrPhone, usrAge, usrEmail);
        setcId(cId);
        setcMembership(cMembership);
    }
    
    //getter setter
        public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcMembership() {
        return cMembership;
    }

    public void setcMembership(String cMembership) {
        this.cMembership = cMembership;
    }
    
//    public void displayProfile() {
//        System.out.println("Customer ID\t: " + getCustID());
//        System.out.println("Membership\t: " + getMembership());
//        super.displayProfile();
//        menu();
//    }
    
//    public void updateProfile() {
//        System.out.print("Customer ID\t: ");
//        String cid = input.next();
//        setCustID(cid);
//        System.out.print("Membership\t: ");
//        String mem = input.next();
//        setMembership(mem);
//        super.updateProfile();
//        menu();
//    }
    
//    public void menu() {
//        System.out.println("Menu");
//        System.out.println("1. Display Profile");
//        System.out.println("2. Update Profile");
//        System.out.println("3. Book Ticket");
//        System.out.println("4. Logout");
//        System.out.print("Enter number: ");
//        String menu = input.next();
//
//        while (!menu.equals("4")) {
//            switch (menu) {
//                case "1":
//                    displayProfile();
//                    break;
//                case "2":
//                    updateProfile();
//                    break;
//                case "3":
//                    super.BookTicket();
//                    break;
//                default:
//                    System.out.println("Menu not found!");
//                    break;
//            }
//            break;
//        }
//    }

}
