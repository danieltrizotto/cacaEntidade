/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author User
 */
public class Funcionarios {

    private int idfuncionarios;
    private String nome;
    private static String nomeAtual;

    private String cargo;
    private String cpf;
    private String idade;
    private String departamento;
    private String usuario;
    private String senha;

    public Funcionarios(int idfuncionarios, String nome, String cargo, String cpf, String idade, String departamento, String usuario, String senha) {
        this.idfuncionarios = idfuncionarios;
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.idade = idade;
        this.departamento = departamento;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public static String getNomeAtual() {
        return nomeAtual;
    }

    public static void setNomeAtual(String nomeAtual) {
        Funcionarios.nomeAtual = nomeAtual;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionarios() {

    }

    public int getIdfuncionarios() {
        return idfuncionarios;
    }

    public void setIdfuncionarios(int idfuncionarios) {
        this.idfuncionarios = idfuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
