package Conta;

import Clientes.Cliente;

public class ContaC extends Contas {


	public ContaC() {
		
	}
	public ContaC(Cliente cliente, CodigoTipoConta tipo) {
		super(cliente, tipo);
	}
	public ContaC(String numeroAgencia, int numeroConta, Cliente titular) {
		super(numeroAgencia, numeroConta, titular);
	}
	
}
