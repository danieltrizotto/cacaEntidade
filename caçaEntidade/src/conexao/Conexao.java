/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Conexao {
   private static final String url = "jdbc:mysql://localhost:3306/caça_entidade";
    private static final String usuario = "root";
    private static final String senha = "1234";
    
    
    public static Connection conectar() throws SQLException {
        return (Connection) DriverManager.getConnection(url, usuario, senha);
    }
       
}
