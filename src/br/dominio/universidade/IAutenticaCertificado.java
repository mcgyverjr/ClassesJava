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

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public interface IAutenticaCertificado 
{  
   
   String retornarCpfEstudante();
   
   String retornarNomeEstudante();
   
   Estudante retornarEstudante();
   
   int retornarCargaHoraria();
   
   long retornarCodigoCertificado();

}//Fim da interface IValidaCertificados;