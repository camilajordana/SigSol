package br.edu.ifrn.jdbc.modelo;

public class Livro {
    
    private int idlivro;
    private String nome;
    private String autor;
    private String disciplina;
    private int isbn;

    public Livro() {
    }

    public Livro(int idlivro, String nome, String autor, String disciplina, int isbn) {
        this.idlivro = idlivro;
        this.nome = nome;
        this.autor = autor;
        this.disciplina = disciplina;
        this.isbn = isbn;
    }

    public int getIdlivro() {
        return idlivro;
    }

    public void setIdlivro(int idlivro) {
        this.idlivro = idlivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    
    
}
