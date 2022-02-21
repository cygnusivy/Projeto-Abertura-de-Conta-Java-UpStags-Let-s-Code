package Conta;

import Clientes.Cliente;
import Clientes.PessoaJ;

public class ClientePJnaoAbrePoupanca extends Exception {

	public ClientePJnaoAbrePoupanca(Cliente pessoaJ) {
		super("Pessoa Juridica não abre conta poupanaça");	
		}
}
