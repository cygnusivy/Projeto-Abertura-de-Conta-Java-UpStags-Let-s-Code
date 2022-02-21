package Conta;

import Clientes.Cliente;

public class ContaC extends Contas {


	public ContaC() {
		
	}
	public ContaC(Cliente cliente, CodigoTipoConta tipo) {
		super(cliente, tipo);
	}
	
}
