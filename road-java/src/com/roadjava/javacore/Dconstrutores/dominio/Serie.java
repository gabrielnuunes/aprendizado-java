package com.roadjava.javacore.Dconstrutores.dominio;

public class Serie {

    private String nome;
    private String tipo;
    private int episodio;
    private String genero;
    private String produtora;

    public Serie(String nome, String tipo, int episodio, String genero, String produtora) {
        this(nome, tipo, episodio, genero);
        this.produtora = produtora;
    }

    public Serie(String nome, String tipo, int episodio, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
        this.genero = genero;
    }

    public Serie() {

    }

//    public void init(String nome, String tipo, int episodio) {
//        this.tipo = tipo;
//        this.episodio = episodio;
//        this.nome = nome;
//    }

//    Primeira forma de sobrecarga
//    public void init(String nome, String tipo, int episodio, String genero) {
//        this.tipo = tipo;
//        this.episodio = episodio;
//        this.nome = nome;
//        this.genero = genero;
//    }

//    Segunda forma de sobrecarga
//    public void init(String nome, String tipo, int episodio, String genero) {
//        init(nome, tipo, episodio);
//        this.genero = genero;
//    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.genero);
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
