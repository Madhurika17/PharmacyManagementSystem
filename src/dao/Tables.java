/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class Tables {
    public static void main (String[] args) throws ClassNotFoundException {
        try{
            Connection con =ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            //st.executeUpdate(" create table User (User_ID int AUTO_INCREMENT primary key, U_name varchar(50), email varchar(30), password varchar (30), designation varchar(50));");
            //st.executeUpdate(" insert into User (U_name, email, password,designation) values ('Adam', 'h@email.com','qwe','Employee');");
            st.executeUpdate(" create table Drug (D_ID int AUTO_INCREMENT primary key, D_Name varchar (50), Quantity bigint,Selling_Price bigint, Cost_Price bigint, Expiry_Date varchar(50), Company varchar(50)); ");
            st.executeUpdate(" insert into Drug (D_Name, Quantity,Selling_Price, Cost_Price, Expiry_Date, Company) values ('dawai', '5', '40', '45', '12-02-2012', 'Hima');");
            JOptionPane.showMessageDialog(null, "Table crated successfully");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
