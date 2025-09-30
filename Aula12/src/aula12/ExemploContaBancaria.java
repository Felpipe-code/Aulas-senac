/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class ExemploContaBancaria {
    private double saldo;
    
    //construtor
    public ExemploContaBancaria (double saldoInicial){
        this.saldo = saldoInicial;
    }
    
    //método para depositar dinheiro na conta 
    public void depositar(double valor){
    if(valor > 0){
        saldo += valor;
        System.out.println("Depósito de R$"+valor+" realizado com sucesso.");
    }else{
        System.out.println("Valor de depósito inválido");
    }
}
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$"+valor+" realizado com sucesso.");
        }else{
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }
    //método para obter o saldo atual da conta
    public double obterSaldo(){
        return saldo;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //criar uma conta com saldo inicial R$1000.0
        ExemploContaBancaria minhaConta = new ExemploContaBancaria (1000.00);
        
        //exibir o saldo inicial
        System.out.println("Saldo inicial: R$"+minhaConta.obterSaldo());
        
        //depositar 500 reais
        System.out.println("Digite o valor para o deposito");
        double depositar = teclado.nextDouble();
        minhaConta.depositar(depositar);
        
        //obter saldo após depósito
        System.out.println("Saldo após depósito: R$"+minhaConta.obterSaldo());
        
        //sacar R$200
        System.out.println("digite o valor para saque ");
        double saque1 = teclado.nextDouble();
        minhaConta.sacar(saque1);
        
        //Obter saldo após saque
        System.out.println("Saldo após o saque: R$"+minhaConta.obterSaldo());
        
        //sacar um valor maior que o saldo
       // minhaConta.sacar(5000.00);
        
        //obter saldo após saque
        System.out.println("saldo final: R$"+minhaConta.obterSaldo());
    }
}
