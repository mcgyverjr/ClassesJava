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

public class SalaAula
{     
    private String numeroSala, cor;
    
    private int capacidade;
    
    private double area;
    
    
    public SalaAula()
    {
        
    }
    
    public SalaAula(String numeroSala, String cor, int capacidade,  double area, Professor professorResponsavel)
    {
        this.numeroSala=numeroSala;
        
        this.cor=cor;
        
        this.capacidade=capacidade;
        
        this.area=area;
    }
    
    public String retornarNumeroSala()
    {   
        return this.numeroSala;
    }
    
    public String retornarCor()
    {
        return this.cor;
    }
    
    public void alterarCor(String novaCor)
    {
        this.cor=novaCor;
    }
    
    public int retornarCapacidade()
    {    
        return this.capacidade;
    }
    
    public void alterarCapacidade(int novaCapacidade)
    {    
        this.capacidade=novaCapacidade;
    }
    
    public double retornarArea()
    {
        return this.area;
    }
    
    public void alterarAreaSala(double novaArea)
    {    
        this.area=novaArea;
    }
    
}//Fim da classe SalaAula;