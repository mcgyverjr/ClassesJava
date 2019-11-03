package br.dominio.hospital;


import br.dominio.api.ProfissionalMedicina;

import br.dominio.api.ProfissionalEnfermagem;

import java.util.Date;

import java.util.ArrayList;

import br.dominio.api.Endereco;

import br.dominio.api.Pessoa;

import br.dominio.drograria.Remedio;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Paciente extends Pessoa
{ 
   private Date dataEntrada,
            dataAlta;
   
   private ArrayList <Remedio> listaRemedios = new ArrayList();
    
   private ArrayList <ProfissionalMedicina> listaMedicos = new ArrayList(3);
    
   private ArrayList <ProfissionalEnfermagem>listasEnfermeiras = new ArrayList(3);

   //Fim do campo de declaração de atributos;
 
   public Paciente()
   {
        
   }//Fim do método construtor padrão;
    
   public Paciente(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, Date dataEntrada, Date dataAlta)
   {   
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil);
       
      //Fim do método super da classe mãe ou superclasse Pessoa;
       
      this.dataEntrada=dataEntrada;
        
      this.dataAlta=dataAlta;
   }//Fim do método construtor personalizado;
    
   public Date retornarDataEntrada()
   {     
      return this.dataEntrada;
   }
    
   public Date retornarDataAlta()
   {
      return this.dataAlta;
   }      
    
   public ArrayList retornarListaRemedios()
   { 
      return this.listaRemedios;
   }
    
   public void inserirRemedioListaPaciente(Remedio novoRemedio)
   { 
      this.listaRemedios.add(novoRemedio);
   }
    
   public void removerRemedioListaPaciente(Remedio removerRemedio)
   { 
        this.listaRemedios.remove(removerRemedio);
   }
    
   public ArrayList retornarListaMedicos()
   {
      return this.listaMedicos;
   }
     
   public void alterarListaMedicos(ProfissionalMedicina novoMedico, ProfissionalMedicina novoMedico2, ProfissionalMedicina novoMedico3)
   { 
      this.listaMedicos.add(novoMedico);    
      
      this.listaMedicos.add(novoMedico2);
        
      this.listaMedicos.add(novoMedico3);
   }
  
   public ArrayList retornarListaEnfermeiras()
   {       
      return this.listasEnfermeiras;
   }
    
   public void alterarListaEnfermeiras(ProfissionalEnfermagem novoProfissionalEnfermagem, ProfissionalEnfermagem novoProfissionalEnfermagem2, ProfissionalEnfermagem novoProfissionalEnfermagem3)
   {  
      this.listasEnfermeiras.add(novoProfissionalEnfermagem);
        
      this.listasEnfermeiras.add(novoProfissionalEnfermagem2);
        
      this.listasEnfermeiras.add(novoProfissionalEnfermagem3);
   }
    
}//Fim da classe Paciente;