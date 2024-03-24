/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Entidades;
import model.bean.Funcionarios;

/**
 *
 * @author User
 */
public class EntidadesDAO {
    public List<Entidades> ler(){
        List<Entidades>dao = new ArrayList();
        
        try {
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM  entidades");
      
      
            rs = stmt.executeQuery();

            while (rs.next()) {
         Entidades enti = new Entidades();
                 enti.setIdentidades(rs.getInt("identidades"));
                 enti.setNome(rs.getString("nome"));
                 enti.setHostilidade(rs.getString("hostilidade"));
                 enti.setDescriçao(rs.getString("descriçao"));
                 enti.setTarefa(rs.getString("tarefa"));
                 enti.setEngarregado(rs.getString("encarregado"));
                 dao.add(enti);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dao;
       
    }
    
public List<Entidades> ler2(){
        List<Entidades>dao = new ArrayList();
        
        try {
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM  entidades where encarregado = ?");
      
      
            rs = stmt.executeQuery();

            while (rs.next()) {
         Entidades enti = new Entidades();
                 enti.setIdentidades(rs.getInt("identidades"));
                 enti.setNome(rs.getString("nome"));
                 enti.setHostilidade(rs.getString("hostilidade"));
                 enti.setDescriçao(rs.getString("descriçao"));
                 enti.setTarefa(rs.getString("tarefa"));
                 
                 dao.add(enti); 
         
         
                 
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dao;
       
    }
    
    public void criar(Entidades traz){
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("insert into entidades(nome,hostilidade,descriçao,tarefa,encarregado) values (?,?,?,?,?)");

           stmt.setString(1, traz.getNome());
           stmt.setString(2, traz.getHostilidade());
           stmt.setString(3, traz.getDescriçao());
           stmt.setString(4, traz.getTarefa());
           stmt.setString(5, traz.getEngarregado());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "tarefa enviada");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void Delete(Entidades traz){
            try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("delete from entidades where identidades = ?");
            stmt.setInt(1, traz.getIdentidades());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "tarefa apagada");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
