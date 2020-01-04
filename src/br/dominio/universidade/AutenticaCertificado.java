/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.universidade;

/**
 *
 * @author belogo
 */

import br.dominio.universidade.colegiado.Estudante;

import br.dominio.universidade.colegiado.Turma;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java

//Falta inserir a carga horária para Estudante;
public final class AutenticaCertificado 
{  
   private IAutenticaCertificado certificado;
   
   private Estudante estudante;
   
   private Turma listaEstudante;
   
   //Fim do campo de declaração de atributos;
   
   
   public AutenticaCertificado()
   {
      
   }//Fim do campo de decalração de atributos;
   
   public boolean validarCertificado()
   {
      if (listaEstudante.retornarListaEstudantesTurma().contains(estudante) || certificado.retornarEstudante().equals(estudante))
      {
         return true;
      }
      else
      {
         return false;
      }
   }

}//Fim da clasee ValidaCertificados;