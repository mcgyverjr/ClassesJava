/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.universidade.colegiado;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import br.com.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Colegiado
{   
   private String nome;
    
   private Funcionario coordenador;
        
   private ArrayList <SalaAula> listaSalasAula = new ArrayList();
   
   private ArrayList <Curso> listaCursos = new ArrayList();
   
   //Fim do campo de declaração de atributos;
    
   //Corrigir comentários de acordo com a classe curso;
   public enum AreaCientifica
   {
      CIENCIAS_EXATAS,
      CIENCIAS_TERRA,
      CIENCIAS_HUMANAS,
      CIENCIAS_SOCIAS,
      SAUDE,
   }//Fim do enum AreaCientifica;
    
   public Colegiado()
   {
        
   }//Fim do método construtor padrão;
    
   public Colegiado (String nome, Funcionario coordenador)
   {        
      this.nome = nome;
        
      this.coordenador = coordenador;
   }//Fim do método construtor personalisado da classe Colegiado
    
   public final String retornarNomeColegiado()
   {
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Colegiado;
 
   public final Funcionario retornarCoordenador()
   {   
      return coordenador;
   }//Fim do método que retorna o coordenador do tipo Funcionario do objeto do tipo Colegiado;
    
   public final void alterarCoordenador (Funcionario novoCoordenador)
   {     
      coordenador = novoCoordenador;
   }//Fim do método que altera o coordenador do objeto do tipo Colegiado;
    
   public final ArrayList retornarListaSalasAula()
   {
      return listaSalasAula;       
   }//Fim do método que retorna a lista de objetos do tipo Sala da lista do objeto do tipo Colegiado;
    
   public final void inserirSalaAulaLista (SalaAula novaSala)
   {   
      listaSalasAula.add (novaSala);       
   }//Final do método que insere um objeto do tipo Sala na lisa do objeto do tipo Colegiado;
    
   public final void removerSalaAulaLista (SalaAula removerSala)
   {   
      listaSalasAula.remove (removerSala);     
   }//Final do método que remove um objeto to tipo Sala da lista do objeto do tipo Colegiado;
   
   public final ArrayList retornarListaCursos()
   {
      return listaCursos;
   }//Fim do método que retorna a lista de objetos do tipo Curso da lista do objeto do tipo Colegiado;
   
   public final void inserirCursoLista (Curso novoCurso)
   {
      listaCursos.add (novoCurso);
   }//Fim do método que insere um objeto do tipo Curso na lista do objeto do tipo Colegiado;
   
   public final void removerCursoLista(Curso removerCurso)
   {
      listaCursos.remove (removerCurso);
   }//Fim do método que remove um objeto do tipo Curso da lista do objeto do tipo Colegiado;
   
}//Fim da classe Colegiado;