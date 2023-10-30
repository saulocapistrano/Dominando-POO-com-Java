import java.util.ArrayList;

import enums.EnumTipoQuarto;
import model.Camareira;
import model.Cliente;
import model.Gerente;
import model.Quarto;
import model.Recepcionista;

public class App {

	public static void main(String[] args) {

		System.out.println("Hotel Java");
		System.out.println();

	
	
		
		
		
//		System.out.print("O "+cli1.getNome()+" está ");
//		cli1.alugarQuarto();
//		cli1.pedirLanche();
//		
//		Recepcionista rep1 = new Recepcionista("Valéria", "85666442255", "123546987");
//		System.out.print("A "+rep1.getNome()+" está ");
//		rep1.saberAtenderTelefone();
//		System.out.print("A "+rep1.getNome()+" está ");
//		rep1.falarInglês();
//		
//		Camareira cam1 = new Camareira("Francisca", "8577779966", "33366655587");
//		System.out.print("A "+cam1.getNome()+" está ");
//		cam1.arrumarACama();
//		
//		System.out.print("A "+cam1.getNome()+" está ");
//		cam1.arrumarQuarto();
//		
//		Gerente gerenteTurnoA = new Gerente("Marcelo", "552233669977", "22255566933");
//		System.out.print("O "+gerenteTurnoA.getNome()+" está ");
//		gerenteTurnoA.gerenciarDepartamentos();
//		System.out.print("O "+gerenteTurnoA.getNome()+" está ");
//		gerenteTurnoA.gerenciarFinancas();
//		System.out.print("O "+gerenteTurnoA.getNome()+" está ");
//		gerenteTurnoA.prepararHotelParaEvento();
//		
//		Quarto quarto1 = new Quarto("306A", 2000.0, EnumTipoQuarto.PRESIDENCIAL);
//		System.out.println("O quarto reservado é:  "+quarto1.getTipo());		
//		System.out.println("O quarto reservado é:  "+quarto1.getTipo().getValor());		
//		System.out.println("O quarto reservado é o :  "+quarto1.getNumero()+", o preço dele é: R$"+quarto1.getValor());		
//		
//		
//		
		
		Cliente cli1 = new Cliente("Manoel da Silva", "4324323442323", "123456789", 42);
		Cliente cli2 = new Cliente("Francisco da Silva", "4324323440000", "123456111", 40);
		Cliente cli3 = new Cliente("João da California", "4324323441111", "123456000", 44);
		Cliente cli4 = new Cliente("Paola da California", "4324323442222", "1234562222", 24);
	
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		clientes.add(cli4);
		
		clientes.stream().count(); 
		clientes.size();
		
		//clientes.stream().sorted(comparing(Clientes::getIdade));
		
		clientes.stream()
		.limit(3)
		.forEach(c -> System.out.println(c.getNome()));
		System.out.println();
		
		clientes.stream()
		.skip(3)
		.forEach(c -> System.out.println(c.getNome()));
		System.out.println();
		//var resultado3 =clientes.stream().sorted();
		
		clientes.stream().
		filter(c -> c.getIdade() > 25)
		.forEach(c -> System.out.println(c.getNome()));
		System.out.println();
		
		clientes.stream().
		filter(c -> c.getNome().contains("Silva"))
		.forEach(c -> System.out.println(c.getNome()));
		System.out.println();
		
		clientes.stream().map(c -> c.getNome());
		clientes.stream().map(Cliente::getNome);
	
	}

}
