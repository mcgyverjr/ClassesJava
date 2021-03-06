/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.educacionalead.udemy;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import br.com.dominio.empresa.Empresa;

import br.com.dominio.api.Funcionario;

import br.com.dominio.universidade.colegiado.Professor;

import br.com.dominio.api.Telefone;

import br.com.dominio.api.Endereco;

//Fim dos imports de biblioteca de classes ou APIs (Application's Programming Interfaces) Java;


public final class Udemy extends Empresa
{         
   private ArrayList <Curso> listaCursos = new ArrayList();
   
   private ArrayList <Professor> listaProfessores = new ArrayList(listaCursos.size()/2);
   
   private ArrayList <Aluno> listaAlunos = new ArrayList(listaProfessores.size()*20);
   
   private IRecebeCodigoCertificador codigoCertificador;
   
   //Fim do campo de declaração de atributos;
   
           
   public Udemy()
   {
      
   }//Fim do método construtor padrão;
   
   public Udemy (String razaoSocial, String nomeFantasia, double capitalSocial, Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente)
   {
      super (razaoSocial, nomeFantasia,capitalSocial, endereco, telefone, presidente, vicePresidente);
      
      //Fim do método super da classe mãe ou super classe Empresa, inicializando o seu método construtor personalizado;
      
   }//Fim do método construtor personalizado;
   
   public final ArrayList retornarListaCursos()
   {
      return listaCursos;
   }//Fim do método que retorna a lista de objetos do tipo Curso do objeto do tipo Udemy;
   
   public final ArrayList retornarListaProfessores()
   {
      return listaProfessores;
   }//Fim do método que retorna a lista de objetos do tipo Professor do objeto do tipo Udemy;
   
   public final ArrayList retornarListaAlunos()
   {
      return listaAlunos;
   }//Fim do método que retorna a lista de objeto do tipo Aluno do objeto do tipo Udemy;
   
   public final long retornarCodigoCertificador()
   {
      return codigoCertificador.retornarCodigoCertificador();
   }//Fim do método que retorna o código certificador do objeto do tipo Udemy;
   
}//Fim da classe Udemy;