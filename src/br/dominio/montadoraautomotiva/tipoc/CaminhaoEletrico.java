/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.montadoraautomotiva.tipoc;

/**
 *
 * @author belogo
 */

import br.dominio.api.AutomovelEletrico;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class CaminhaoEletrico extends AutomovelEletrico
{   
   
   public CaminhaoEletrico()
   {
      
   }//Fim do método construtor padrão;

   public CaminhaoEletrico(double peso, double largura, double altura, double comprimento, String cor, double cavalosPotencia, double torque, double velocidadeMaximaEletronica, double autonomiaMedia, double capacidadeBateria)
   {
      super(peso, largura, altura, comprimento, cor, cavalosPotencia, torque, velocidadeMaximaEletronica, autonomiaMedia, capacidadeBateria);
      
      //Fim do método super da classe mãe ou super classe AutomovelEletrico;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe CaminhaoEletrico;