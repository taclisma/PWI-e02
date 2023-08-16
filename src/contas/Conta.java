package contas;

import agencia.Agencia;

public class Conta {
	private double saldo;
	private long numero;
	private Agencia agencia;
	
	public Conta() {};
	public Conta(double saldo, long numero, Agencia agencia) {
		super();
		this.saldo = saldo;
		this.numero = numero;
		this.agencia = agencia;
		// quando que vai no construtor o agregado? vai pq tem que ter um
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	
	@Override
	public String toString() {
		return "Conta [agencia: " + agencia + ", numero: " + numero + "]\nSaldo: R$" + saldo;
	}
	
	public double credita(double valor) {
		this.saldo += valor;
		return this.saldo;
		
	}
	public double debita(double valor) {
		this.saldo -= valor;
		return this.saldo;
		
	}
	
	
}
