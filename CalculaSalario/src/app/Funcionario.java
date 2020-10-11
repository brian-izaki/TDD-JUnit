package app;

public class Funcionario {
	private String nome;
	private double salario;
	private Cargos cargo;
	
	// enum é um conjunto fixo de constantes
	public enum Cargos{
		DESENVOLVEDOR(new DezOuVintePorcento()), 
		DBA(new QuinzeOuVinteCincoPorcento()), 
		TESTADOR(new QuinzeOuVinteCincoPorcento());
		
		private final RegraDeCalculo regra;
		
		// vai fazer com que cada valor possa ter uma regra relacionada a ela
		Cargos(RegraDeCalculo regra){
			this.regra = regra;
		}
		
		// permite pegar a regra q ta relacionada com o valor
		public RegraDeCalculo getRegra() {
			return this.regra;
		}
		
	}
	
	public Funcionario(String nome, double salario, Cargos cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public Cargos getCargo() {
		return cargo;
	}

	
}
