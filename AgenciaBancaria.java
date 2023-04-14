/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agenciabancaria;

class Cliente {
    String Nome;
    String CPF; //CPF está no formato XXX.XXX.XXX-XX
    String RG; 
    String Telefone; //Será um vetor de telefones
    String Endereco;
    float RendaMensal;
    float Saldo;
    String Agencia;
    String ContaCorrente;
    
    Cliente() {} //Construtor para ler dados e iniciar variáveis
    
    Cliente(String N, String C, String R, String T, String E, float RM, float S){
        this.Nome = N;
        if(this.VerificarCPF(C)) this.CPF
    
    }
    
    boolean VerificarCPF(String CPF){
    //PARA PESQUISAR
    return(true);
    }
    
    boolean ReceberDeposito(float Valor){
        if(Valor > 0){
            this.Saldo = this.Saldo + Valor;
            return (true);
        }else{
            return (false);
        }

        
    }
        
    boolean EfetuarSaque(float Valor){
              if(this.Saldo >= Va){
            this.Saldo = this.Saldo + Valor;
            return (true);
        }else{
            return (false);
        }
        
        
        
        
    }
    
    float ExibirSaldo(){
        return (this.Saldo);
    }
    
    String ExibirExtrato(){
        //
    }
    

}
/**
 *
 * @author matheus.lsousa
 */
public class AgenciaBancaria {

    public static void main(String[] args) {
        
    }
}
