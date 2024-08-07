package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Funcionarios;

public class FuncionariosDAO {

    public List<Funcionarios> ler() {
        List<Funcionarios> dao = new ArrayList();

        try {

            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM  funcionarios");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionarios funci = new Funcionarios();
                funci.setIdfuncionarios(rs.getInt("idfuncionarios"));
                funci.setNome(rs.getString("nome"));
                funci.setCargo(rs.getString("cargo"));
                funci.setCpf(rs.getString("cpf"));
                funci.setIdade(rs.getString("idade"));
                funci.setDepartamento(rs.getString("departamento"));
                funci.setUsuario(rs.getString("usuario"));
                funci.setSenha(rs.getString("senha"));
                dao.add(funci);

            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dao;

    }

    public boolean lerLogin(String usuario, String senha) {//login de usuario
        boolean check = false;
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("select * from funcionarios where usuario = ? and senha = ? ;");

            stmt.setString(1, usuario);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
                Funcionarios.setNomeAtual(rs.getString("nome"));
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return check;
    }

    public void criar(Funcionarios traz) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("insert into funcionarios(nome,cargo,idade,cpf,departamento,usuario,senha) values (?,?,?,?,?,?,?)");

            stmt.setString(1, traz.getNome());
            stmt.setString(2, traz.getCargo());
            stmt.setInt(3, Integer.parseInt(traz.getIdade()));
            stmt.setString(4, traz.getCpf());
            stmt.setString(5, traz.getDepartamento());
            stmt.setString(6, traz.getUsuario());
            stmt.setString(7, traz.getSenha());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "funcionario cadastrado");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void delete(Funcionarios traz) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("delete from funcionarios where idfuncionarios = ?");
            stmt.setInt(1, traz.getIdfuncionarios());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "funcionario deletado");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(Funcionarios traz){//dao em reparo
        try{
             Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("update funcionarios set nome = ?, cargo = ? , idade=?, cpf = ?, departamento = ?, usuario =?, senha = ? where  idfuncionarios = ? ");
            stmt.setString(1, traz.getNome());
            stmt.setString(2, traz.getCargo());
            stmt.setInt(3, Integer.parseInt(traz.getIdade()));
            stmt.setString(4, traz.getCpf());
            stmt.setString(5, traz.getDepartamento());
            stmt.setString(6, traz.getUsuario());
            stmt.setString(7, traz.getSenha());
            stmt.setInt(8, traz.getIdfuncionarios());
            stmt.executeUpdate();
        

            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "funcionario atualizado");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
