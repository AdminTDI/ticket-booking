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
public class BusRoute implements Bus{
    Scanner in=new Scanner(System.in);
    private ArrayList<String> busID=new ArrayList();
    private ArrayList<String> busRoute=new ArrayList();
    private ArrayList<Date> busDate=new ArrayList();
    private ArrayList<String> busTime=new ArrayList();
    
    
    public BusRoute(String busID,String busRoute,Date busDate,String busTime){
        setbusid(busID);
        setbusroute(busRoute);
        setbusdate(busDate);
        setbustime(busTime);
    }
    public BusRoute(){
        
    }
    public void setBusRoute(String busID,String busRoute,Date busDate,String busTime){
        setbusroute(busRoute);
        setbusdate(busDate);
        setbustime(busTime);
        setbusid(busID);
    }
    

    private void setbusroute(String busRoute) {
        this.busRoute.add(busRoute);
    }

    private void setbusdate(Date busDate) {
        this.busDate.add(busDate);
    }

    private void setbustime(String busTime) {
        this.busTime.add(busTime);
    }
    private void setbusid(String busID) {
       this.busID.add(busID);
    }
    public ArrayList<String> getbusid(){
         return this.busID;
    }
    public ArrayList<String> getroute(){
        return this.busRoute;
    }
    
    public ArrayList<Date> getdate(){
        return this.busDate;               
    }
    public ArrayList<String> gettime(){
        return this.busTime;
    }
    public void display(){
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("|%-12s|%-25s|%-15s|%-15s|","Bus Type ID","Bus Route","Bus Date","Bus Time");
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        
        
        for(int i=0;i<getbusid().size();i++){
            System.out.print("|");
            System.out.printf("%-12s",getbusid().get(i));
            System.out.print("|");
            System.out.printf("%-25s",getroute().get(i));
            System.out.print("|");
            System.out.printf("%-15s",getdate().get(i));
            System.out.print("|");
            System.out.printf("%-15s",gettime().get(i));
            System.out.println("|");     
        }
        System.out.println("------------------------------------------------------------------------");
    }
    public void enterdetails(){
        String ino="y";
        BusRoute busroute=new BusRoute();
        while(!ino.equals("n")){
            
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
            
            busroute=new BusRoute(id,route,date,time);
            System.out.print("\nContinue?(y/n) :");
            ino=in.next();
        }
        busroute.display();
    }
    
}
