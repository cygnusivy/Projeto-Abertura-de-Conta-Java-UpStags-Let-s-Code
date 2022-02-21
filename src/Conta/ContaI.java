package Conta;

import Clientes.Cliente;

public class ContaI extends Contas {


	public ContaI() {
		
	}
	public ContaI(Cliente titular, CodigoTipoConta tipo) {
		super(titular, tipo);
	}
	
}
