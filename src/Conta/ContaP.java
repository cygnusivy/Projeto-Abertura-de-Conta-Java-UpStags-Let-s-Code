package Conta;

import Clientes.Cliente;

public class ContaP extends Contas {

	public ContaP() {
		
	}
	public ContaP(Cliente cliente, CodigoTipoConta tipo) {
		super(cliente, tipo);
	}
	public ContaP(String numeroAgencia, int numeroConta, Cliente titular) {
		super(numeroAgencia, numeroConta, titular);
	}
}
