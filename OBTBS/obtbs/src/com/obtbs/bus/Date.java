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
public class Date {
    
     private int month;
    private int day;
    private int year;
    
    public Date(int theday,int themonth,int theyear){
        month=checkmonth(themonth);
        year=checkyear(theyear);
        day=checkday(theday);
      
    }
    private int checkyear(int testyear){
        if(testyear>0)
            return testyear;
        else
        {
            System.out.printf("Invalid year (%d) set to 1.0\n",testyear);
            return 1;
        }
    }
    private int checkmonth(int testmonth){
        if (testmonth>0 && testmonth<=12)
            return testmonth;
        else{
            System.out.printf("Invalid month (%d) set to 1. \n",testmonth);
            return 1;
        }
    }
    private int checkday(int testday){
        int daypermonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        if (testday>0 && testday<=daypermonth[month])
            return testday;
        if (month ==2 && testday==29 &&(year % 400==0||(year %4 ==0&& year%100!=0)))
            return testday;
        System.out.printf("Invalid day(%d) set to 1.0 \n",testday);
        return 1;
    }
    public  String toString(){
        return String.format(" %d/%d/%d",month,day,year);
    }
}
