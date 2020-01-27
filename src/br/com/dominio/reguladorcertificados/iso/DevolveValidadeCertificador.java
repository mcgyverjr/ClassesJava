/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.reguladorcertificados.iso;

/**
 *
 * @author belogo
 */

import br.com.dominio.universidade.IRecebeValidacao;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class DevolveValidadeCertificador implements IRecebeValidacao
{
   private IValidaCertificador validadeCertificador;
   
   private ISO iso;
   
   //Fim do campo de declaração de atributos;
   
   
   @Override
   public final boolean retornarValidadeCertificador()
   {
      if (iso.retornarListEmissoresCertificados().contains (validadeCertificador.retornarCodigoCertificador()) == true)
      {
         return true;
      }
      else
      {
         return false;
      }
   }//Fim do método que retorna a validade do certificador para a interface IRecebeValidacao;
   
}//Fim da classe DevolveValidadeCertificador;