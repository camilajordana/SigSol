package br.edu.ifrn.jdbc.modelo;

public class Login {

    private int idlogin;
    private int tipo;
    private String matricula;
    private String nome;
    private String horalogin;
    private String dialogin;

    public Login() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    public int getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(int idlogin) {
        this.idlogin = idlogin;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getHoralogin() {
        return horalogin;
    }

    public void setHoralogin(String horalogin) {
        this.horalogin = horalogin;
    }

    public String getDialogin() {
        return dialogin;
    }

    public void setDialogin(String dialogin) {
        this.dialogin = dialogin;
    }

}
