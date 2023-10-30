package model;

import interfaces.IRecepcionista;

public class Recepcionista extends Pessoa  implements IRecepcionista {

	public Recepcionista(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
	}

	@Override
	public void saberAtenderTelefone() {

		System.out.println("Atendendo o telefone");
	}

	@Override
	public void falarInglês() {

		System.out.println("Falando em inglês com o cliente");
	}

	@Override
	public void falarEspanhol() {
		System.out.println("Falando em espanhol com o cliente");		
	}

	@Override
	public void falarItaliano() {
		System.out.println("Falando em italiano com o cliente");		
	}

	@Override
	public void falarMandarin() {
		System.out.println("Falando em mandarin com o cliente");		
	}

}
