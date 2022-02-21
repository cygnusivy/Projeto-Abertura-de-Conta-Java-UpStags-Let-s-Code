package Conta;

import Clientes.Cliente;
import Clientes.PessoaF;
import Clientes.PessoaJ;

public class Aplicacao {

	public static void main(String[] args) {

		Banco banco = new Banco();
		
		//PF
		Cliente c1 = new PessoaF("Maria", "123");
		Cliente c2 = new PessoaF("Maria", "123");
		Cliente c3 = new PessoaF("Maria", "123");
		
		//PJ
		Cliente c4 = new PessoaJ("Maria", "123");
		Cliente c5 = new PessoaJ("Maria", "123");
		
		Contas conta1 = new ContaP(c1, CodigoTipoConta.Poupanca);
		Contas conta2 = new ContaC(c2, CodigoTipoConta.Corrente);
		Contas conta3 = new ContaI(c3, CodigoTipoConta.Investimento);
		Contas conta4 = new ContaP(c4, CodigoTipoConta.Corrente);
		Contas conta5 = new ContaI(c4, CodigoTipoConta.Investimento);
		
		banco.abrirConta(conta1);
		banco.abrirConta(conta2);
		banco.abrirConta(conta3);
		banco.abrirConta(conta4);
		banco.abrirConta(conta5);
		
		conta1.deposita(1000);
		conta2.deposita(1000);
		conta3.investe(1000);
		conta4.deposita(1000);
		conta5.investe(1000);
		
		conta1.tranfere(100, conta2);
		conta4.tranfere(10, conta2);
		conta1.consultarSaldo();
		conta2.consultarSaldo();
		conta3.consultarSaldo();
		conta4.consultarSaldo();
		conta5.consultarSaldo();

		
	}

}
