package model;

import interfaces.ICamareira;
import interfaces.IGerente;
import interfaces.IRecepcionista;

public class Gerente extends Pessoa implements IGerente, ICamareira, IRecepcionista {

	public Gerente(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
	}

	@Override
	public void encerrarContaDoCliente() {
		System.out.println("atendendo a pedido de encerramento de conta do cliente.");
	}

	@Override
	public void gerenciarDepartamentos() {
		System.out.println("gerenciando departamento.");
	}

	@Override
	public void supervisionarFornecedores() {
		System.out.println("supervisionando fornecedores.");
	}

	@Override
	public void prepararHotelParaEvento() {
		System.out.println("preparando o hotel para um evento.");
	}

	@Override
	public void recificar() {
		System.out.println("precificando os produtos e serviços do hotel;");
	}

	@Override
	public void gerenciarFinancas() {
		System.out.println("gerenciando as finanças.");
	}

	@Override
	public void saberAtenderTelefone() {
		System.out.println("atendendo o telefone no lugar da recepcionista.");
	}

	@Override
	public void falarInglês() {
		System.out.println("falando inglês com algum cliente.");
	}

	@Override
	public void falarEspanhol() {
		System.out.println(" falando espanhol com algum cliente.");
	}

	@Override
	public void falarItaliano() {
		System.out.println("falando italiano com algum cliente.");
	}

	@Override
	public void falarMandarin() {
		System.out.println("falando mandarim com algum cliente.");
	}

	@Override
	public void arrumarACama() {
		System.out.println(" arrumando a cama no lugar da camareira.");

	}

	@Override
	public void arrumarQuarto() {
		System.out.println(" arrumando o quarto no lugar da camareira.");
	}

}
