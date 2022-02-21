package Conta;

import java.util.ArrayList;
import java.util.List;

import Clientes.Cliente;
import Clientes.PessoaJ;

public class Banco {
	
	private Cliente titular;
	
	public Banco() {
		
	}
	public Banco(Cliente titular) {
		this.titular = titular;
	}
	
	private List<Contas> conta = new ArrayList<>();

	public void abrirConta(Contas cliente) {
		cliente.setNumeroConta(conta.size() + 1);
		conta.add(new Contas());
		if (cliente.getTitular() instanceof PessoaJ && cliente.getTipo() == CodigoTipoConta.Poupanca) {
			System.out.println("N�o foi possivel abrir conta Poupan�a para " + getTitular().getTitular() + ", pois pessoa jur�dica n�o abre conta poupan�a");
		}else {
			System.out.println("Conta aberta com sucesso");
		}
		
	}

	public List<Contas> getConta() {
		return conta;
	}

	public void setConta(List<Contas> conta) {
		this.conta = conta;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	
}
