/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.educacionalead.udemy;

/**
 *
 * @author belogo
 */

import br.dominio.universidade.IValidaCertificados;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;s


public final class AutenticarCertificado implements IValidaCertificados
{  
   private Certificado certificado;
   
   //Fim do campo de declaração de atributos;
   
   
   public AutenticarCertificado()
   {
      
   }//Fim do método construtor padrão;
   
   @Override
   public String retornarCpfEstudante()
   {
      return certificado.retornarBeneficiario().retornarCpf();
   }//Fim do método que retorna o cpf do objeto do tipo Estudante para a interface IValidaCertificados;
   
   @Override
   public int retornarCargaHoraria()
   {
      return certificado.retornarCargaHoraria();
   }//Fim do método que retorna a carga Horária do objeto do tipo Certificado para a interface IValidaCertificados;
   
   @Override
   public long retornarCodigoCertificado()
   {
      return certificado.retornarCodigoCertificado();
   }//Fim do método que retorna o codigo do objeto do tipo Certificado para a interface IValidadeCertifcados;
   
}//Fim da classe AunteticarCertificado;