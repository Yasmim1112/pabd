/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yasmimf;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author 20221074010012
 */
public class CustomerDAO {
    private Connection con;

    public CustomerDAO() throws SQLException {
        this.con = new ConnectionFactory().getConnection();
        System.out.println("Connection OK");
    }
    public void insertCustomer(Customer c) throws SQLException {
          String sql = "insert into customer (Store_ID, email, Address_ID, Active, first_name, last_name) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);
           
            st.setInt(1, c.getStore_id());
            st.setString(2,c.getEmail());
            st.setInt(3, c.getAddress_id());
            st.setInt(4, c.getActive());
            st.setString(5,c.getFirst_name());
            st.setString(6, c.getLast_name());
           
            st.execute();
            
    }
    public void deleteCustomer(int id) {
       String sql = "delete from cutomer"
               + "where customer_id";
    }
    public void updateCustomer(int id) {
       String sql = "update customer"
               +"set store_id= ?, first_name=?, last_name=?, active=?, address_id=?, email=?, store_id=?"
               + "where customer_id";
    }
    
    public void showCustomer() throws SQLException{
     String query = "select * from customer"
                    + " order by customer_id desc"
                    + " limit 10";
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData md = rs.getMetaData();
            
            int col = md.getColumnCount();
            
            for (int i = 1; i <= col; i++) {
                System.out.print(md.getColumnName(i)+ " \t");
            }
            System.out.println("");
           
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i)+" \t");
                }
                System.out.println("");
            }
    }
}

        
       
            
        
    

    

