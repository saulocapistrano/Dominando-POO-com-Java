package model;

import java.util.Date;

import utils.DataUtil;

public class Movimentacao {

	private String descricao;
	private Date data;
	private Double valorMovimentado;
	
	
	
	public Movimentacao(String descricao,  Double valorMovimentado) {
		super();
		this.descricao = descricao;
		this.data = new Date();
		this.valorMovimentado = valorMovimentado;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData() {
		return data;
	}

	public Double getValorMovimentado() {
		return valorMovimentado;
	}

	@Override
	public String toString() {
		String dataFormatada = DataUtil.converterDateParaDataEHora(this.getData());
		return this.getDescricao()+ "\n" + dataFormatada + "\nValor: - R$"+ this.valorMovimentado;
	}

	
	
	
}
