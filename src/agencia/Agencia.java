package agencia;

public class Agencia {
	int numero;
	String endereco;
	
	public Agencia() {};
	public Agencia(int numero, String endereco) {
		super();
		this.numero = numero;
		this.endereco = endereco;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Agencia: \n[numero: " + numero + ", endereco: " + endereco + "]";
	}
	
	 
	
}