package enums;

public enum EnumTipoQuarto {
	BASICO( "Básico"),
	MASTER( "Master"),
	PRESIDENCIAL("Suíte Presidencial");

	private String valor;

	EnumTipoQuarto(String valor) {
	this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
}
