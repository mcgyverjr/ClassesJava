package br.com.dominio.empresa;


import java.util.ArrayList;

import br.com.dominio.api.Endereco;

import br.com.dominio.api.Funcionario;

import br.com.dominio.empresa.departamento.Departamento;

import br.com.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Empresa
{     
   private String razaoSocial,
           nomeFantasia;
 
   private Endereco endereco;
       
   private ArrayList listaDepartamentos = new ArrayList(10);
        
   private Funcionario presidente,
           vicePresidente;
   
   private double capitalSocial;
   
   private Telefone telefone;
   
   private long cnpj;
   
   //Fim do campo de declaração de atributos;
    
     
   public Empresa()
   {    
   
   }//Fim do método construtor padrão;
     
   public Empresa (String razaoSocial, String nomeFantasia, double capitalSocial, Endereco endereco, Telefone telefone)
   {    
      this.razaoSocial = razaoSocial;
        
      this.nomeFantasia = nomeFantasia;
      
      this.capitalSocial = capitalSocial;
      
      this.endereco = endereco;
      
      this.telefone = telefone;
   }//Fim do primeiro método construtor personalizado;    
   
   public Empresa (String razaoSocial, String nomeFantasia, double capitalSocial, Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente)
   {           
      this.razaoSocial = razaoSocial;
        
      this.nomeFantasia = nomeFantasia;
      
      this.presidente = presidente;
            
      this.vicePresidente = vicePresidente;
      
      this.capitalSocial = capitalSocial;
      
      this.endereco = endereco;
      
      this.telefone = telefone;
   }//Fim do segundo método construtor personalizado;
   
   public final String retornarRazaoSocial()
   {     
      return razaoSocial;
   }//Fim do método que retorna razão social do objeto do tipo Empresa;
   
   public final String retornarNomeFantasia()
   {     
      return nomeFantasia;
   }//Fim do método que retorna o nome fantasia do objeto do tipo Empresa;
    
   public final Endereco retornarEndereco()
   {
      return endereco;
   }//Fim do método que retorna o objeto do tipo Endereco do objeto do tipo Empresa;
   
   public final Funcionario retornarPresidente()
   {     
      return presidente;
   }//Fim do método que retorna o presidente do objeto do tipo Empresa;
   
   public final Funcionario retornarVicePresidente()
   {     
      return vicePresidente;
   }//Fim do método que retorna o vice presidente do objeto do tipo Empresa;
   
   public final double retornarCapitalSocial()
   {
      return capitalSocial;
   }//Fim do método que retorna o capital social do objeto do tipo Empresa;
   
   public final long retornarCnpj()
   {
      return cnpj;
   }//Fim do método que retorna o cnpj do objeto do tipo Empresa;
   
   public final String retornarTelefone()
   {
      return telefone.retornarTelefoneCompleto();
   }//Fim do método que retorna o telefone do objeto do tipo Empresa;
        
   public final ArrayList retornarListaDepartamentos()
   {     
      return listaDepartamentos;
   }//Fim do método que retorna a lista do objeto do tipo Empresa;
    
   public final void inserirDepartamentoLista (Departamento novoDepartamento)
   {     
      if (listaDepartamentos.size() == 8)
      {  
         System.out.println("já fora preenchido o número limite de departamentos ");
      }
      else
      {
         listaDepartamentos.add (novoDepartamento);
      }
   }//Fim do método que insere departamento na lista do objeto do tipo Empresa;
    
   public final void removerDepartamentoLista (Departamento removerDepartamento)
   {     
      if (listaDepartamentos.size() == 1)
      {
         System.out.println("Já não é mais possível remover departamentos");
      }
      else
      {        
         listaDepartamentos.remove (removerDepartamento);   
      }
   }//Fim do método que remove departamento da lista do objeto do tipo Empresa;
    
}//Fim da classe Empresa;