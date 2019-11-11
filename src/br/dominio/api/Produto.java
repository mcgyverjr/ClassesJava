package br.dominio.api;


import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Produto
{  
   private int codigoBarras,
           quantidade;

   private Date dataEntrada,
           dataSaida;
   
   private String categoria,
           nome;
  
   //Fim do campo de declaração de atributos;
   

   public Produto()
   {
        
   }//Fim do método construtor padrão;

   public Produto(int codigoBarras, int quantidade, Date dataEntrada, Date dataSaida, String categoria, String nome)   
   {        
      this.codigoBarras=codigoBarras;
       
      this.quantidade=quantidade;
       
      this.dataEntrada=dataEntrada;
       
      this.dataSaida=dataSaida;
      
      this.categoria=categoria;
   }//Fim do primeiro método construtor personalizado;
    
   public int retornarCodigo() 
   {
      return this.codigoBarras;
   }//Fim do método que retorna o codigo do objeto do tipo Produto;
    
   public int retornarQuantidade()
   {
      return this.quantidade;
   }//Fim do método que retorna a quantidade do objeto do tipo Produto;
    
   public Date retornarDataEntrada()
   { 
      return this.dataEntrada;
   }//Fim do método que retorna a data de entrada do objeto do tipo Produto;
    
   public Date retornarDataSaida()
   { 
      return this.dataSaida;
   }//Fim do método que retorna a data de saída do objeto do tipo Produto;
    
   public String retornarCategoria()
   {       
      return this.categoria;
   }//Fim do método que retorna a categoria do objeto do tipo Produto; 
   
   public String retornarNome()
   {
      return this.nome;
   }//Fim do método que retorna o nome do objeto do tipo Produto;
   
}//Fim da classe Produto;