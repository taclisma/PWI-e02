package enumeracoes;

public enum Dias {
	SEGUNDA(1, "segunda-feira"), TERcA(2, "terca-feira"), QUARTA(3, "quarta-feira");
	
	private final int valor;
	private String desc;
	
	// construtor
	private Dias(int valor, String desc) {
		this.valor = valor;
		this.desc = desc;
	}
	
	public int getValor() {
		return valor;
	}

	public String getDesc() {
		return desc;
	}
}