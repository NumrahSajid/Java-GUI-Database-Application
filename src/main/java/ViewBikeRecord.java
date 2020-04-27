/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Nimra Sajid
 */
public class ViewBikeRecord {
    
     
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    public void view(JTable table){
            
   
    {
      try {
        
        con = DBConnection.getConnection();
        Statement pst = con.createStatement();
        
        String sql = "SELECT * From AddBike";    
        ResultSet rs =  pst.executeQuery(sql);
      
        table.setModel(DbUtils.resultSetToTableModel(rs));
      
       
            
        }
      
      catch(Exception ex){
         System.out.println(""+ex);
     }
    
            
            
            
            
            
            
    }      
            
            
    }
    
    
}
