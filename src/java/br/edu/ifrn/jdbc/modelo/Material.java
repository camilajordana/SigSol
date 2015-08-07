/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.jdbc.modelo;


public class Material {
    private int idmaterial;
    private int tipo;
    private String nome_material;
    
    public Material() {
        
    }

    public Material(int idmaterial, int tipo, String nome_material) {
        this.idmaterial = idmaterial;
        this.tipo = tipo;
        this.nome_material = nome_material;
    }

    public int getIdmaterial() {
        return idmaterial;
    }

    public void setIdmaterial(int idmaterial) {
        this.idmaterial = idmaterial;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome_material() {
        return nome_material;
    }

    public void setNome_material(String nome_material) {
        this.nome_material = nome_material;
    }
    
    
    
}
