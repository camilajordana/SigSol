package br.edu.ifrn.jdbc.modelo;

public class Solicitacao {

    private int idsolicitacao;
    private String status;
    private String tipo;
    
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    

    
    
    
    private int idsolicitarsala;
    private String sala;
    private String diaSala;
    private String inicioSala;
    private String terminoSala;
    private String descricaoSala;
    private String solicitantenomeSala;
    private String solicitantematriculaSala;
    private int id_solicitacaoSala;

    private int idsolicitarlivro;
    private String livro;
    private int quantidadeLivro;
    private String descricaoLivro;
    private String solicitantenomeLivro;
    private String solicitantematriculaLivro;
    private int id_solicitacaoLivro;
    
    private int idsolicitarobjeto;
    private String objeto;
    private String diaObjeto;
    private String localObjeto;
    private String descricaoObjeto;
    private String solicitantenomeObjeto;
    private String solicitantematriculaObjeto;
    private int id_solicitacaoObjeto;

    
    
    private int idsolicitarescritorio;
    private String escritorio;
    private int quantidadeEscritorio;
    private String descricaoEscritorio;
    private String solicitantenomeEscritorio;
    private String solicitantematriculaEscritorio;
    private String comentarioEscritorio;
    private int id_solicitacaoEscritorio;
 
    

    private int idsolicitarvideoaula;
    private String diaVideoAula;
    private String inicioVideoAula;
    private String terminoVideoAula;
    private String descricaoVideoAula;
    private String solicitantenomeVideoAula;
    private String solicitantematriculaVideoAula;
    private int id_solicitacaoVideoAula;

    private int idsolicitarlimpeza;
    private String localLimpeza;
    private String descricaoLimpeza;
    private String solicitantenomeLimpeza;
    private String solicitantematriculaLimpeza;
    private int id_solicitacaoLimpeza;

    public Solicitacao() {
    }

    public int getId_solicitacaoVideoAula() {
        return id_solicitacaoVideoAula;
    }

    public int getId_solicitacaoLimpeza() {
        return id_solicitacaoLimpeza;
    }

    public void setId_solicitacaoLimpeza(int id_solicitacaoLimpeza) {
        this.id_solicitacaoLimpeza = id_solicitacaoLimpeza;
    }

    
    public int getId_solicitacaoSala() {
        return id_solicitacaoSala;
    }

    public void setId_solicitacaoSala(int id_solicitacaoSala) {
        this.id_solicitacaoSala = id_solicitacaoSala;
    }

    public int getId_solicitacaoObjeto() {
        return id_solicitacaoObjeto;
    }

    public void setId_solicitacaoObjeto(int id_solicitacaoObjeto) {
        this.id_solicitacaoObjeto = id_solicitacaoObjeto;
    }
    

    public void setId_solicitacaoVideoAula(int id_solicitacaoVideoAula) {
        this.id_solicitacaoVideoAula = id_solicitacaoVideoAula;
    }

    public int getId_solicitacaoEscritorio() {
        return id_solicitacaoEscritorio;
    }

    public void setId_solicitacaoEscritorio(int id_solicitacaoEscritorio) {
        this.id_solicitacaoEscritorio = id_solicitacaoEscritorio;
    }

    public int getId_solicitacaoLivro() {
        return id_solicitacaoLivro;
    }

    public void setId_solicitacaoLivro(int id_solicitacaoLivro) {
        this.id_solicitacaoLivro = id_solicitacaoLivro;
    }
    

    public String getComentarioEscritorio() {
        return comentarioEscritorio;
    }

    public void setComentarioEscritorio(String comentarioEscritorio) {
        this.comentarioEscritorio = comentarioEscritorio;
    }

    public int getIdsolicitarlimpeza() {
        return idsolicitarlimpeza;
    }

    public void setIdsolicitarlimpeza(int idsolicitarlimpeza) {
        this.idsolicitarlimpeza = idsolicitarlimpeza;
    }

    public String getLocalLimpeza() {
        return localLimpeza;
    }

    public void setLocalLimpeza(String localLimpeza) {
        this.localLimpeza = localLimpeza;
    }

    public String getDescricaoLimpeza() {
        return descricaoLimpeza;
    }

    public void setDescricaoLimpeza(String descricaoLimpeza) {
        this.descricaoLimpeza = descricaoLimpeza;
    }

    public String getSolicitantenomeLimpeza() {
        return solicitantenomeLimpeza;
    }

    public void setSolicitantenomeLimpeza(String solicitantenomeLimpeza) {
        this.solicitantenomeLimpeza = solicitantenomeLimpeza;
    }

    public String getSolicitantematriculaLimpeza() {
        return solicitantematriculaLimpeza;
    }

    public void setSolicitantematriculaLimpeza(String solicitantematriculaLimpeza) {
        this.solicitantematriculaLimpeza = solicitantematriculaLimpeza;
    }

    public int getIdsolicitarvideoaula() {
        return idsolicitarvideoaula;
    }

    public void setIdsolicitarvideoaula(int idsolicitarvideoaula) {
        this.idsolicitarvideoaula = idsolicitarvideoaula;
    }

    public String getDiaVideoAula() {
        return diaVideoAula;
    }

    public void setDiaVideoAula(String diaVideoAula) {
        this.diaVideoAula = diaVideoAula;
    }

    public String getInicioVideoAula() {
        return inicioVideoAula;
    }

    public void setInicioVideoAula(String inicioVideoAula) {
        this.inicioVideoAula = inicioVideoAula;
    }

    public String getTerminoVideoAula() {
        return terminoVideoAula;
    }

    public void setTerminoVideoAula(String terminoVideoAula) {
        this.terminoVideoAula = terminoVideoAula;
    }

    
    public String getDescricaoVideoAula() {
        return descricaoVideoAula;
    }

    public void setDescricaoVideoAula(String descricaoVideoAula) {
        this.descricaoVideoAula = descricaoVideoAula;
    }

    public String getSolicitantenomeVideoAula() {
        return solicitantenomeVideoAula;
    }

    public void setSolicitantenomeVideoAula(String solicitantenomeVideoAula) {
        this.solicitantenomeVideoAula = solicitantenomeVideoAula;
    }

    public String getSolicitantematriculaVideoAula() {
        return solicitantematriculaVideoAula;
    }

    public void setSolicitantematriculaVideoAula(String solicitantematriculaVideoAula) {
        this.solicitantematriculaVideoAula = solicitantematriculaVideoAula;
    }

    public int getIdsolicitarescritorio() {
        return idsolicitarescritorio;
    }

    public void setIdsolicitarescritorio(int idsolicitarescritorio) {
        this.idsolicitarescritorio = idsolicitarescritorio;
    }

    public String getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(String material) {
        this.escritorio = material;
    }

    public int getQuantidadeEscritorio() {
        return quantidadeEscritorio;
    }

    public void setQuantidadeEscritorio(int quantidadeEscritorio) {
        this.quantidadeEscritorio = quantidadeEscritorio;
    }

    public String getDescricaoEscritorio() {
        return descricaoEscritorio;
    }

    public void setDescricaoEscritorio(String descricaoEscritorio) {
        this.descricaoEscritorio = descricaoEscritorio;
    }

    public String getSolicitantenomeEscritorio() {
        return solicitantenomeEscritorio;
    }

    public void setSolicitantenomeEscritorio(String solicitantenomeEscritorio) {
        this.solicitantenomeEscritorio = solicitantenomeEscritorio;
    }

    public String getSolicitantematriculaEscritorio() {
        return solicitantematriculaEscritorio;
    }

    public void setSolicitantematriculaEscritorio(String solicitantematriculaEscritorio) {
        this.solicitantematriculaEscritorio = solicitantematriculaEscritorio;
    }

    public int getIdsolicitarobjeto() {
        return idsolicitarobjeto;
    }

    public void setIdsolicitarobjeto(int idsolicitarobjeto) {
        this.idsolicitarobjeto = idsolicitarobjeto;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getDiaObjeto() {
        return diaObjeto;
    }

    public void setDiaObjeto(String diaObjeto) {
        this.diaObjeto = diaObjeto;
    }

    public String getLocalObjeto() {
        return localObjeto;
    }

    public void setLocalObjeto(String localObjeto) {
        this.localObjeto = localObjeto;
    }

    public String getDescricaoObjeto() {
        return descricaoObjeto;
    }

    public void setDescricaoObjeto(String descricaoObjeto) {
        this.descricaoObjeto = descricaoObjeto;
    }

    public String getSolicitantenomeObjeto() {
        return solicitantenomeObjeto;
    }

    public void setSolicitantenomeObjeto(String solicitantenomeObjeto) {
        this.solicitantenomeObjeto = solicitantenomeObjeto;
    }

    public String getSolicitantematriculaObjeto() {
        return solicitantematriculaObjeto;
    }

    public void setSolicitantematriculaObjeto(String solicitantematriculaObjeto) {
        this.solicitantematriculaObjeto = solicitantematriculaObjeto;
    }

    public String getSolicitantematriculaSala() {
        return solicitantematriculaSala;
    }

    public int getIdsolicitarlivro() {
        return idsolicitarlivro;
    }

    public void setIdsolicitarlivro(int idsolicitarlivro) {
        this.idsolicitarlivro = idsolicitarlivro;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public int getQuantidadeLivro() {
        return quantidadeLivro;
    }

    public void setQuantidadeLivro(int quantidadeLivro) {
        this.quantidadeLivro = quantidadeLivro;
    }

    public String getDescricaoLivro() {
        return descricaoLivro;
    }

    public void setDescricaoLivro(String descricaoLivro) {
        this.descricaoLivro = descricaoLivro;
    }

    public String getSolicitantenomeLivro() {
        return solicitantenomeLivro;
    }

    public void setSolicitantenomeLivro(String solicitantenomeLivro) {
        this.solicitantenomeLivro = solicitantenomeLivro;
    }

    public String getSolicitantematriculaLivro() {
        return solicitantematriculaLivro;
    }

    public void setSolicitantematriculaLivro(String solicitantematriculaLivro) {
        this.solicitantematriculaLivro = solicitantematriculaLivro;
    }

    public void setSolicitantematriculaSala(String solicitantematriculaSala) {
        this.solicitantematriculaSala = solicitantematriculaSala;
    }

    public int getIdsolicitacao() {
        return idsolicitacao;
    }

    public void setIdsolicitacao(int idsolicitacao) {
        this.idsolicitacao = idsolicitacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdsolicitarsala() {
        return idsolicitarsala;
    }

    public void setIdsolicitarsala(int idsolicitarsala) {
        this.idsolicitarsala = idsolicitarsala;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDiaSala() {
        return diaSala;
    }

    public void setDiaSala(String diaSala) {
        this.diaSala = diaSala;
    }

    public String getInicioSala() {
        return inicioSala;
    }

    public void setInicioSala(String inicioSala) {
        this.inicioSala = inicioSala;
    }

    public String getTerminoSala() {
        return terminoSala;
    }

    public void setTerminoSala(String terminoSala) {
        this.terminoSala = terminoSala;
    }

    public String getDescricaoSala() {
        return descricaoSala;
    }

    public void setDescricaoSala(String descricaoSala) {
        this.descricaoSala = descricaoSala;
    }

    public String getSolicitantenomeSala() {
        return solicitantenomeSala;
    }

    public void setSolicitantenomeSala(String solicitantenomeSala) {
        this.solicitantenomeSala = solicitantenomeSala;
    }

}
