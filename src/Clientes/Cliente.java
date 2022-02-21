package Clientes;

import Conta.CodigoTipoConta;

public class Cliente {
	private String titular;
	private String documento;
	private CodigoTipoConta codigo;
	
	public Cliente() {
		
	}
	public Cliente(String titular, String documento) {
		this.documento = documento;
		this.titular = titular;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public CodigoTipoConta getCodigo() {
		return codigo;
	}
	public void setCodigo(CodigoTipoConta codigo) {
		this.codigo = codigo; 
	}
	
	
}
