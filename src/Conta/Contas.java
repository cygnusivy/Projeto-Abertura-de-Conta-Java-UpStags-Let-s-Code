package Conta;

import Clientes.Cliente;
import Clientes.PessoaF;
import Clientes.PessoaJ;

public class Contas {
	private int numeroConta;
	private String numeroAgencia = "2039-7";
	private Cliente titular;
	private double saldo;
	private CodigoTipoConta tipo;
	
	public Contas() {
		
	}
	public Contas(Cliente titular, CodigoTipoConta tipo) {
		this.titular = titular;
		this.tipo = tipo;
	}
	
	public Contas(String numeroAgencia, int numeroConta, Cliente titular) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
	}
	
	public CodigoTipoConta getTipo() {
		return tipo;
	}
	public void setTipo(CodigoTipoConta tipo) {
		this.tipo = tipo;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void deposita(double valor) {
		if (getTipo() != CodigoTipoConta.Investimento) {
		this.saldo += valor;
		}
		else {
			System.out.println("Não é possível realizar depósito em conta investimento");
		}
	}
	public void saca(double valor) {
		if (this.saldo >= valor && getTitular() instanceof PessoaJ) {
			this.saldo -= (valor + (valor*0.005));
			System.out.println("Valor sacado com sucesso");
		}
		else if (this.saldo >= valor && getTitular() instanceof PessoaF) {
			this.saldo -= (valor + (valor*0.005));
			System.out.println("Valor sacado com sucesso");
		}
		else {
			System.out.println("Saque não disponível: Saldo insuficiente ou limite de saque excedido");
		}
	}

	public void tranfere(double valor, Contas destino) {
		if (this.saldo >= valor && getTitular() instanceof PessoaJ) {
			this.saldo -= (valor + (valor *0.005));
			destino.deposita(valor);
			System.out.println("Valor transferido com sucesso");
			
		}else if (this.saldo >= valor && getTitular() instanceof PessoaF){
			this.saldo -= (valor);
			destino.deposita(valor);	
			System.out.println("Valor transferido com sucesso");

			}else {
				System.out.println("Valor não transferido");
			}
		}
	
	public void investe(double valor) {
		if(getTitular() instanceof PessoaJ && getTipo() == CodigoTipoConta.Investimento) {
		this.saldo += valor + (valor * 0.02);
		
		}else if (getTitular() instanceof PessoaF && getTipo() == CodigoTipoConta.Investimento) {
		this.saldo += valor + (valor *0.02);
	
		}else {
			System.out.println("Investimentto não realizado: só é possível realzar investimento em conta investimento");
		}
		
	}
	public void consultarSaldo() {
	 	System.out.println("_______________________");
		System.out.println("----DADOS DA CONTA----");
		System.out.println("Cliente: " + getTitular().getTitular());
		System.out.println("Número da conta: " + getNumeroConta());
		System.out.println("Agência: " + getNumeroAgencia());
	 	System.out.println("Saldo: " + getSaldo());
	 	System.out.println("_______________________");
	}
}
