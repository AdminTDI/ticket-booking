/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obtbs.user;

import com.obtbs.bus.BusRoute;
import java.util.Scanner;

/**
 *
 * @author fhfai
 */
public class Staff extends User {

    Scanner input = new Scanner(System.in);
    private int sId;
    private String sQualification;
    private BusRoute bus;

    //constructor
    public Staff(String usrName, String usrPass, String usrFname, String usrLname, String usrPhone, String sQualification, String usrAge, String usrEmail) {
        super(usrName, usrPass, usrFname, usrLname, usrPhone, usrAge, usrEmail);
        setsId(sId);
        setsQualification(sQualification);
    }

    public Staff() {
    }

    //getter setter variable
    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsQualification() {
        return sQualification;
    }

    public void setsQualification(String sQualification) {
        this.sQualification = sQualification;
    }

    //staff method 
//    public void menu(){
//        System.out.println("Menu");
//        System.out.println("1. Display Profile");
//        System.out.println("2. Update Profile");
//        System.out.println("3. Manage Bus");
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
//                    manageBus();
//                    break;
//                default:
//                    System.out.println("Menu not found!");
//                    break;
//            }
//            break;
//        }
//    }
//    public void manageBus(){
//        System.out.println("Enter 1 to Manage Route or 2 to Manage Bus Type");
//        int no=input.nextInt();
//        if(no==1){
//            this.bus=new BusRoute();
//            bus.enterdetails();
//        }else if(no==2){
//            
//        }else{
//            System.out.println("Wrong input");
//            manageBus();
//        }
//    }
//    @Override
//    public void displayProfile() {
//        System.out.println("Staff ID\t: " + getStaffID());
//        System.out.println("Staff Type\t: " + getStaffType());
//        super.displayProfile();
//        System.out.printf("Salary\t\t: RM%.2f\n", getSalary());
//        System.out.println("Qualification\t: " + getQualification());
//        menu();
//    }
//    @Override
//    public void updateProfile() {
//        System.out.print("Staff ID\t: ");
//        String sid = input.next();
//        setStaffID(sid);
//        System.out.print("Staff Type\t: ");
//        String sType = input.next();
//        setStaffType(sType);
//        super.updateProfile();
//        System.out.print("Salary\t\t: RM");
//        double s = input.nextDouble();
//        setSalary(s);
//        System.out.print("Qualification\t: ");
//        String q = input.next();
//        setQualification(q);
//        System.out.println("");
//        menu();
//    }
}
