/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.hospital.farmacia;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.dominio.api.Funcionario;

import br.dominio.api.Acesso;

import br.dominio.api.Endereco;


public class Farmaceutico extends Funcionario
{
   private String crf;
   
   //Fim do campo de declaração de atributos;
   
   
   public Farmaceutico()
   {
      
   }
   
   public Farmaceutico(String nome, Date dataNascimento, String cpf, String email, Endereco endereco, double salario, String setor, Date dataAdmissao, Acesso conta, String crf)
   {
      super(nome,dataNascimento, cpf, email, endereco, salario, setor, dataAdmissao, conta);
      
      //Fim do método super da classe mãe ou super classe Funcionario, inicializando o seu primeiro método contrutor personalizado;
      
      this.crf = crf;
   }//Fim do método construtor personalizado;
   
}//Fim da classe Farmaceutico;