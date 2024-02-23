/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbpaquete;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class ConexionDBClass {
    
    public static Connection obtenerConexion(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/novacaesar","root","12345");
            return cn;
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Hubo el siguiente error: "+error+".", "Error en la conexión", JOptionPane.ERROR_MESSAGE);
            System.err.println("Hubo un error en la base de datos. Motivo: "+error+".");
        }
        return null;
    }
}
