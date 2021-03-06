/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.hospital.funcionarios.profissionais_medicina.profissionais_tratamento;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.com.dominio.api.ProfissionalMedicina;

import br.com.dominio.api.Endereco;

import br.com.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Anestesista extends ProfissionalMedicina
{
   private float valorCirurgia;
   
   //Fim do campo de declaração de atributos;
   
   
   public Anestesista()
   {
      
   }//Fim do método construtor personalizado;
   
   public Anestesista (String nome, int cpf, Date dataNascimento, float salario, String setor, Date dataAdmissao, Endereco endereco, Telefone telefone, String email, int crm, float valorCirurgia)
   {
      super (nome, cpf,dataNascimento, salario, setor, dataAdmissao, email, endereco, telefone, crm);
      
      //Fim do método super da classe mãe ou super classe ProfissionalMedicina, inicializando o seu método construtor personalizado;
      
   }//Fim do método constutor personalizado;
   
   @Override
   public void realizarConsulta()
   {
      
   }
      
   public float retornarValorCirurgia()
   {
      return valorCirurgia;
   }//Fim do método que retorna o valor da cirurgia do objeto do tipo Anestesista;
   
}//Fim da classe Anestesista;