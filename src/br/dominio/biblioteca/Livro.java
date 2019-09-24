package br.dominio.biblioteca;


import java.util.Date;


public class Livro{
    

    private String titulo, subtitulo, genero, nomeAutor, editora, tradutor;

    private int isbn, quantidadePaginas, edicao;

    private Date ano;
    

    public Livro(){
        
    }
    
    public Livro(String titulo, String subtitulo, String genero, String nomeAutor, String tradutor, String editora, int isbn, int quantidadePaginas, int edicao, Date anoPublicação){
        
        this.titulo=titulo;

        this.subtitulo=subtitulo;

        this.genero=genero;

        this.nomeAutor=nomeAutor;

        this.editora=editora;

        this.tradutor=tradutor;

        this.isbn=isbn;

        this.quantidadePaginas=quantidadePaginas;

        this.edicao=edicao;

        this.ano=anoPublicação;
    }
    
    public String retornarTitulo(){

        return this.titulo;
    }

    public String retornarSubtitulo(){

        return this.subtitulo;
    }

    public String retornarGenero(){

        return this.genero;
    }

    public String retornarNomeAutor(){

        return this.nomeAutor;
    }

    public String retornarEditora(){

        return this.editora;
    }

    public String retornarTradutor(){

        return this.tradutor;
    }

    public int retornarIsbn(){

        return this.isbn;
    }

    public int retornarQuantidadePaginas(){

        return this.quantidadePaginas;
    } 

    public int retornarEdicao(){

        return this.edicao;
    }

    public Date retornarAnoPublicação(){

        return this.ano;
    }
}