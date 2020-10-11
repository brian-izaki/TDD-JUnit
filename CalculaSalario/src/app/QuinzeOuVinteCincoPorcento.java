package app;

public class QuinzeOuVinteCincoPorcento implements RegraDeCalculo{

	@Override
	public double calcula(Funcionario f) {
		if (f.getSalario() > 2500)
			return f.getSalario() * 0.75;
		return f.getSalario() * 0.85;
	}
	
}
