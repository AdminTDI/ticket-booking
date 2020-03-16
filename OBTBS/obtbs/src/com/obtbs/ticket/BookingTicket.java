/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obtbs.ticket;

/**
 *
 * @author User
 */
public class BookingTicket {

    private int TicketNo;
    private int SeatNo;
    private Amount amount;
    
    public BookingTicket(){
        
    }
    public BookingTicket (int TicketNo, int SeatNo, Amount amount){
        setTicketNo(TicketNo);
        setSeatNo(SeatNo);
        setAmount(amount);
        display();
    }
    
    public void setTicketNo(int TicketNo){
        this.TicketNo = TicketNo ;
    }
    public int getTicketNo(){
        return(this.TicketNo);
    }
    public void setSeatNo(int SeatNo){
        this.SeatNo = SeatNo;
    }
    public int getSeatNo(){
        return(this.SeatNo);
    }
    public void setAmount(Amount amount){
        this.amount = amount;
    }
    public Amount getAmount(){
        return(this.amount);
    }
    
    public void display(){
        System.out.println("Ticket No\t: "+getTicketNo());
        System.out.println("Seat No\t\t: "+getSeatNo());
        System.out.println(getAmount());
    }
}
