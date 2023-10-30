package model;

import enums.EnumTipoQuarto;

public class Quarto {

	private String numero;
	private Double valor;
	private EnumTipoQuarto tipo;
		
	public Quarto() {
		super();
	}

	public Quarto(String numero, Double valor, EnumTipoQuarto tipo) {
		super();
		this.numero = numero;
		this.valor = valor;
		this.tipo = tipo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public EnumTipoQuarto getTipo() {
		return tipo;
	}
	public void setTipo(EnumTipoQuarto tipo) {
		this.tipo = tipo;
	}
}
