package Conta;

public enum CodigoTipoConta {
	
	Corrente(1),
	Poupanca(2),
	Investimento(3);
	
	private int codigo;
	
	CodigoTipoConta(int codigo) {
		this.codigo = codigo;
		
	}

	public int getCodigo() {
		return codigo;
	}

}
