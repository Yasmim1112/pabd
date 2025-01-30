/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yasmimf;
import java.sql.*;


/**
 *
 * @author 20221074010060
 */
public class YasmimF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws SQLException {
        // TODO code application logic here
        Customer c = new Customer (1, "Dimitri", "Toltoi", "d.tolstoi@gmail.com", 10, 1);
        
        CustomerDAO dao = new CustomerDAO();
        
        dao.insertCustomer(c);
       dao.deleteCustomer(0);
       dao.updateCustomer(0);
        dao.showCustomer();

    /**
     * @param args the command line arguments
     */
   
        Connection con = null;

        /*try {
            

            // ********** CRUD ********** 
            
            //CREATE: 
            String sql = "inset into customer (customer_id, store_id, first_name, last_name, email, address_id, active, create_date, last_update)" 
                    + "values" + ("?, ?, ?, ?, ?, ?, ?, ? ,?");
           
            
            PrepareStatement pst = con.prepareStatement(sql);
            
             pst.Int(1, 3);
             pst.Int(2, 1);
             pst.String(3, "Alcemy");
             pst.String(4, "Severino");
             pst.String(5, "alcemy@gmail.com");
             pst.Int(6, 10);
             pst.Int(7, 1);
             pst.Timestamp(8, 1);
             pst.Timestamp(9, 1);
             
             pst.execute();
             pst.close();
            
            
             // UPDATE:
             sql = "update customer" +
                    " where store_id = ?" +
                     " set customer_id = ?";
            
               pst = con.prepareStatement(sql);
               
               pst.Int(1,2);
               pst.Int(2,610);
               
             pst.execute();
             pst.close();
            
               
               //DELETE: 
               sql = " delete from customer"+
                       "where customer_id = ?";
               
                pst = con.prepareStatement(sql);
                
             pst.execute();
             pst.close();
             
             //READ
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
            
               
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.close();
            System.out.println("Connection closed!");
        }
*/
    }

}
    
    

