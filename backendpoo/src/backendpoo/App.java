package backendpoo;
public class App {

	public static void main(String[] args) {

		System.out.println("Aprendendo poo com Java.");
		// Estou instanciando uma classe, construindo um objeto.
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome(" Saulo José Neco Capistrano");
		pessoa1.setIdade(40);
		
		System.out.println("O nome é: "+pessoa1.getNome()+ " a sua idade é: "+pessoa1.getIdade());
		
		
		Carro carro1 = new Carro();
		carro1.setAno("2023");
		carro1.setModelo("Civic");
		carro1.setCor("Branco");
		
		System.out.println("O carro do "+pessoa1.getNome()+ " é o "+carro1.getModelo()+" ele é "+ carro1.getCor()+ ", ano de fabricação: "+ carro1.getAno());
			
		Carro novoCarro = new Carro(carro1.getModelo(), carro1.getCor(), carro1.getAno(), "105000", "Completo com teto solar", pessoa1.getNome());
		System.out.println(novoCarro);
	}

}
