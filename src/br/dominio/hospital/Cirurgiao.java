package br.dominio.hospital;


import java.util.Date;

import br.dominio.universidade.Endereco;

import br.dominio.banco.Acesso;

import br.dominio.universidade.Telefone;


public class Cirurgiao extends ProfissionalMedicina{
    
    
    private double valorCirurgia;
    
    private String especialidade;
    
    
    public Cirurgiao(){
       
    }
    
    public Cirurgiao(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String setor, String cargo, Date dataAdmissao, Acesso conta, String crm, double valorConsulta, double valorCirurgia, String especialidade){
        
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, setor, cargo, dataAdmissao, conta, crm, valorConsulta);
        
        this.valorCirurgia=valorCirurgia;
        
        this.especialidade=especialidade;
    }
 
    public double retornarValorCirurgia(){
        
        return this.valorCirurgia;
    }
    
    public void alterarValorCirurgia(double novoValorCirurgia){
        
        this.valorCirurgia=novoValorCirurgia;
    }
    
    public String retornarEspecialidade(){
        
        return this.especialidade;
    }
    
    public void alterarEspecialidade(String novaEspecialidade){
        
        this.especialidade=novaEspecialidade;
    }
    
}//Fim da classe Cirurgiao;