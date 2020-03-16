/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.obtbs.bus;

/**
 *
 * @author User
 */
import java.util.*;
public class BusType implements Bus{
    Scanner in=new Scanner(System.in);
    private ArrayList<String> busName=new ArrayList();
    private ArrayList<String> busPlat=new ArrayList();
    private ArrayList<String> busID=new ArrayList();
    private ArrayList<String> busDriver=new ArrayList();
    
    public BusType(String busID,String busName,String busPlat,String busDriver){
        setbusname(busName);
        setbusplat(busPlat);
        setbusid(busID);
        setbusdriver(busDriver);
    }
    public void setbustype(String busID,String busName,String busPlat,String busDriver){
        setbusname(busName);
        setbusplat(busPlat);
        setbusid(busID);
        setbusdriver(busDriver);
    }

    private void setbusname(String busName) {
     this.busName.add(busName);
    }

    private void setbusplat(String busPlat) {
        this.busPlat.add(busPlat);
    }

    private void setbusid(String busID) {
       this.busID.add(busID);
    }

    private void setbusdriver(String busDriver) {
       this.busDriver.add(busDriver);
    }
    public ArrayList<String> getbusname(){
        return this.busName;
    }
    public ArrayList<String> getbusplat(){
        return this.busPlat;
    }
    public ArrayList<String> getbusid(){
         return this.busID;
    }
    public ArrayList<String> getbusdriver(){
        return this.busDriver; 
    }
    
    public void display(){
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("|%-12s|%-25s|%-10s|%-20s|","Bus Type ID","Bus Name","Bus Plat","Bus Driver");
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        
        
        for(int i=0;i<getbusid().size();i++){
            System.out.print("|");
            System.out.printf("%-12s",getbusid().get(i));
            System.out.print("|");
            System.out.printf("%-25s",getbusname().get(i));
            System.out.print("|");
            System.out.printf("%-10s",getbusplat().get(i));
            System.out.print("|");
            System.out.printf("%-20s",getbusdriver().get(i));
            System.out.println("|");     
        }
        System.out.println("------------------------------------------------------------------------");
    }
     public void enterdetails(){
        String ino="";
        do{
            
            System.out.println("Enter Bus ID");
            String id=in.next();
            System.out.print("\nEnter Route");
            String route=in.next();
            
            System.out.print("\nEnter Date");
            System.out.print("Day:");
            int day=in.nextInt();
            System.out.print("Month :");
            int month=in.nextInt();
            System.out.print("Year :");
            int year=in.nextInt();
            Date date=new Date(day,month,year);
            System.out.print("\nEnter Time");
            String time=in.next();
            
            BusRoute busroute=new BusRoute(id,route,date,time);
            System.out.print("\nContinue?(y/n) :");
        }while(!ino.equals("n"));
    }
        
}
