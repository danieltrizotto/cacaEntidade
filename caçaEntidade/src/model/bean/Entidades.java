/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

public class Entidades {

    private int identidades;
    private String nome;
    private String hostilidade;
    private String descriçao;
    private String tarefa;
    private  String engarregado;
    
            
    public Entidades(int identidades, String nome, String hostilidade, String descriçao, String tarefa ,String encarregado) {
        this.identidades = identidades;
        this.nome = nome;
        this.hostilidade = hostilidade;
        this.descriçao = descriçao;
        this.tarefa = tarefa;
        this.engarregado= encarregado;
    }

    public String getEngarregado() {
        return engarregado;
    }

    public void setEngarregado(String engarregado) {
        this.engarregado = engarregado;
    }
    public Entidades(){
        
    }

    public int getIdentidades() {
        return identidades;
    }

    public void setIdentidades(int identidades) {
        this.identidades = identidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHostilidade() {
        return hostilidade;
    }

    public void setHostilidade(String hostilidade) {
        this.hostilidade = hostilidade;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

}
