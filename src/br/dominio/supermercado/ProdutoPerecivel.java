/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */
package br.dominio.supermercado;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.dominio.api.ProdutoComValidade;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class ProdutoPerecivel extends ProdutoComValidade
{
   
   public ProdutoPerecivel()
   {
      
   }//Fim do método construtor padrão;
   
   public ProdutoPerecivel(int codigo,int quantidade, Date dataEntrada, Date dataSaida, String categoria, String nome, Date dataValidade)
   {
      super(codigo, quantidade, dataEntrada, dataSaida, categoria, nome, dataValidade);
      
      //Fim do método super da classe mãe ou super classe Produto;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classeProdutoPerecivel;