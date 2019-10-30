package br.dominio.biblioteca;


import java.util.Date;

import br.dominio.api.ProdutoSemValidade;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Livro extends ProdutoSemValidade
{     
   private String titulo, subtitulo, genero, nomeAutor, editora, tradutor;

   private long isbn;
          
   private int quantidadePaginas, edicao;

   private Date anoPublicacao;
   
   //Fim do campo de declaração de atributos;
    

   public Livro()
   {       
    
   }//Fim do método construtor padrão;
    
   public Livro(int codigo, int quantidade, Date dataEntrada, Date dataSaida, String categoria, String nome, String titulo, String subtitulo, String genero, String nomeAutor, String tradutor, String editora, long isbn, int quantidadePaginas, int edicao, Date anoPublicacao)
   {     
      super(codigo, quantidade, dataEntrada, dataSaida, categoria, nome);
      
      //Fim do método super da classe mãe ou super classe ProdutoSemValidade;
      
      this.titulo=titulo;

      this.subtitulo=subtitulo;

      this.genero=genero;

      this.nomeAutor=nomeAutor;

      this.editora=editora;

      this.tradutor=tradutor;

      this.isbn=isbn;

      this.quantidadePaginas=quantidadePaginas;

      this.edicao=edicao;

      this.anoPublicacao=anoPublicacao;
   }//Fim do método construtor personalizado;
    
   public String retornarTitulo()
   {
      return this.titulo;
   }//Fim do método que retorna o título do objeto do tipo Livro;

   public String retornarSubtitulo()
   {
      return this.subtitulo;
   }//Fim do método que retorna o subtítulo do objeto do tipo Livro;

   public String retornarGenero()
   {
      return this.genero;
   }//Fim do método que retorna o gênero do objeto do tipo Livro;

   public String retornarNomeAutor()
   {
      return this.nomeAutor;
   }//Fim do método que retorna o nome do autor do objeto do tipo Livros;

   public String retornarEditora()
   {
      return this.editora;
   }//Fim do método que retorna a editora do objeto do tipo Livro;
    
   public String retornarTradutor()
   {
      return this.tradutor;
   }//Fim do método que retorna o tradutor do objeto do tipo Livro;

   public long retornarIsbn()
   {
      return this.isbn;
   }//Fim do método que retorna o isbn do objeto do tipo Livro;

   public int retornarQuantidadePaginas()
   {
      return this.quantidadePaginas;
   }//Fim do método que retorna a quantidade páginas do objeto do tipo Livro;

   public int retornarEdicao()
   {
      return this.edicao;
   }//Fim do método que retorna a edição do objeto do tipo Livro;

   public Date retornarAnoPublicacao()
   {
      return this.anoPublicacao;
   }//Fim do método que retorna o ano publicação do objeto do tipo Livro;
    
}//Fim da classe Livro;