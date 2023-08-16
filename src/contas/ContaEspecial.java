package contas;
import java.util.List;

import agencia.Agencia;
import clientes.Cliente;


public class ContaEspecial extends Conta{
	private double limite;
	private List<Cliente> clientes;

	public ContaEspecial() {};

	public ContaEspecial(double saldo, long numero, Agencia agencia, double limite) {
		super(saldo, numero, agencia);
		this.limite = limite;
	}
	
	public String toString() {
		return super.toString() + "[Limite: " + this.limite+ "]";
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
}
	