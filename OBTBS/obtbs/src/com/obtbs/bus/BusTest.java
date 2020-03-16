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
public class BusTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BusType bustype=new BusType("KQ-102","Sani Express","WSL9028","Ahmad Nig");      
        bustype.setbustype("OQ-121","Tranisional","KSL1024","Ali Baba");
        bustype.setbustype("AG-202","SP Bumi","SAB2932","Samir Aop");
         bustype.display();
         
         Date date=new Date(12,12,2019);
         Date date1=new Date(3,8,2019); 
         BusRoute busroute=new BusRoute("KQ-102","KL-Kemaman",date,"12:00pm");
         busroute.setBusRoute("AG-202","Shah Alam-Petaling Jaya", date1, "1:00am");
         busroute.display();
    }
    
}
