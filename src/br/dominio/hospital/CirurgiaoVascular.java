package br.dominio.hospital;


import java.util.Date;

import br.dominio.api.ProfissionalMedicina;

import br.dominio.api.Endereco;

import br.dominio.api.Acesso;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class CirurgiaoVascular extends ProfissionalMedicina
{  
   private double valorCirurgia;
     
   //Fim do campo de declaração de atributos;
   
   
   public CirurgiaoVascular()
   {    
   
   }//Fim do método construtor padrão;
     
   public CirurgiaoVascular(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, String setor, Date dataAdmissao, Acesso conta, String crm, double valorConsulta, double valorCirurgia)
   {     
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, setor, dataAdmissao, conta, crm, valorConsulta);  
      
      //Fim do método super da classe mãe ou super classe ProfissionalMedicina;
         
      this.valorCirurgia=valorCirurgia;
   }//Fim do método construtor padrão;
 
   
   @Override
   public void realizarConsulta()
   {
      
   }//Terminar esse polimorfismo;
   
   public double retornarValorCirurgia()
   {    
      return this.valorCirurgia; 
   }//Fim do método que retorna o valor da cirurgia do objeto do tipo CirurgiaoVascular;
     
   public void alterarValorCirurgia(double novoValorCirurgia)
   {    
      this.valorCirurgia=novoValorCirurgia; 
   }//Fim do método que altera o valor da cirurgia do objeto do tipo CirurgiaoVascular;
    
}//Fim da classe CirurgiaoVascular;