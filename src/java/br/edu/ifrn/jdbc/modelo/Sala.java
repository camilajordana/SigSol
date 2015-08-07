/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.jdbc.modelo;

public class Sala {

    private String nome;
    private int idsala;

    public Sala(){
        
    }
    public Sala(String nome, int idsala) {
        this.nome = nome;
        this.idsala = idsala;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdsala() {
        return idsala;
    }

    public void setIdsala(int idsala) {
        this.idsala = idsala;
    }
    
    
}
