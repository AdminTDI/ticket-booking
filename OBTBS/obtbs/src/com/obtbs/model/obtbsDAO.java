/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obtbs.model;

import com.obtbs.user.Customer;
import com.obtbs.user.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fhfai
 */
public class obtbsDAO {

    public static int addStaff(Staff staff) {
        int status = 0;
        try {
            Connection conn = DBConnection.getConnection();
            String sql = "insert into staff (sUsername, sPassword, sFname, sLname, sPhone, sQualification, sAge, sEmail) values (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, staff.getUsrName());
            ps.setString(2, staff.getUsrPass());
            ps.setString(3, staff.getUsrFname());
            ps.setString(4, staff.getUsrLname());
            ps.setString(5, staff.getUsrPhone());
            ps.setString(6, staff.getsQualification());
            ps.setString(7, staff.getUsrAge());
            ps.setString(8, staff.getUsrEmail());
            status = ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return status;
    }
    
    public static int addCust(Customer cust){
        int status = 0;
        try{
            Connection conn = DBConnection.getConnection();
            String sql = "insert into customer (cUsername, cPassword, cFname, cLname, cPhone, cMembership, cAge, cEmail) values (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cust.getUsrName());
            ps.setString(2, cust.getUsrPass());
            ps.setString(3, cust.getUsrFname());
            ps.setString(4, cust.getUsrLname());
            ps.setString(5, cust.getUsrPhone());
            ps.setString(6, cust.getcMembership());
            ps.setString(7, cust.getUsrAge());
            ps.setString(8, cust.getUsrEmail());
            status = ps.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex);
        }
        return status;
    }
    
    public static Customer getCustByUsername(String cUsername){
        Customer cust = null;
        try{
            Connection conn = DBConnection.getConnection();
            String sql = "select * from customer where cUsername = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cUsername);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cust = new Customer();
                cust.setcId(rs.getInt(1));
                cust.setUsrName(rs.getString("cUsername"));
                cust.setUsrPass(rs.getString("cPassword"));
                cust.setUsrFname(rs.getString("cFname"));
                cust.setUsrLname(rs.getString("cLname"));
                cust.setUsrPhone(rs.getString("cPhone"));
                cust.setcMembership(rs.getString("cMembership"));
                cust.setUsrAge(rs.getString("cAge"));
                cust.setUsrEmail(rs.getString("cEmail"));
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        return cust;
    }
    
    public static Staff getStaffByUsername(String sUsername){
        Staff staff = null;
        try{
            Connection conn = DBConnection.getConnection();
            String sql = "select * from staff where sUsername = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sUsername);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                staff = new Staff();
                staff.setsId(rs.getInt(1));
                staff.setUsrName(rs.getString("sUsername"));
                staff.setUsrPass(rs.getString("sPassword"));
                staff.setUsrFname(rs.getString("sFname"));
                staff.setUsrLname(rs.getString("sLname"));
                staff.setUsrPhone(rs.getString("sPhone"));
                staff.setsQualification(rs.getString("sQualification"));
                staff.setUsrAge(rs.getString("sAge"));
                staff.setUsrEmail(rs.getString("sEmail"));
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        return staff;
    }
    
    public static int updateCust(Customer cust){
        int status = 0;
        try{
            Connection conn = DBConnection.getConnection();
            String sql = "update customer set cUsername = ?, cPassword = ?, cFname = ?, cLname = ?, cPhone = ?, cMembership = ?, cAge = ?, cEmail = ? where cId = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cust.getUsrName());
            ps.setString(2, cust.getUsrPass());
            ps.setString(3, cust.getUsrFname());
            ps.setString(4, cust.getUsrLname());
            ps.setString(5, cust.getUsrPhone());
            ps.setString(6, cust.getcMembership());
            ps.setString(7, cust.getUsrAge());
            ps.setString(8, cust.getUsrEmail());
            ps.setString(9, Integer.toString(cust.getcId()));
            status = ps.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex);
        }
        return status;
    }
    
    public static int updateStaff(Staff staff){
        int status = 0;
        try{
            Connection conn = DBConnection.getConnection();
            String sql = "update staff set sUsername = ?, sPassword = ?, sFname = ?, sLname = ?, sPhone = ?, sQualification = ?, sAge = ?, sEmail = ? where sId = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, staff.getUsrName());
            ps.setString(2, staff.getUsrPass());
            ps.setString(3, staff.getUsrFname());
            ps.setString(4, staff.getUsrLname());
            ps.setString(5, staff.getUsrPhone());
            ps.setString(6, staff.getsQualification());
            ps.setString(7, staff.getUsrAge());
            ps.setString(8, staff.getUsrEmail());
            ps.setString(9, Integer.toString(staff.getsId()));
            status = ps.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex);
        }
        return status;
    }
}
