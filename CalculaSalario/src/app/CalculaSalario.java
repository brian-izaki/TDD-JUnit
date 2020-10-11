package app;

// Esta seria uma classe COESA (possui apenas uma responsabilidade).
// essa classe passa a n�o ter necessidade caso tenha apenas o m�todo calcula.

// caso mativesse os ifs teria q criar testes para cada cargo e add 
// verifica��es para cada cargo tbm. Desse jeito, apenas � feito verifica��o nos 
// m�todos relacionados com a porcentagem que j� est�o relacionados com os Cargos,
// L� na classe Funcionario.
public class CalculaSalario {
	
	public CalculaSalario() {};
	
	public double calcula(Funcionario func) {
		// chamado de Complexidade Ciclom�tica
		// (Muitos caminhos que o m�todo pode tomar, ou seja, muitos ifs).
		
//		if (func.getCargo().equals(Cargos.DESENVOLVEDOR)) {
//			if (func.getSalario() > 3000)
//				return func.getSalario() * 0.8;			
//		} else if (func.getCargo().equals(Cargos.DBA) ||  
//					func.getCargo().equals(Cargos.TESTADOR)) {
//			if (func.getSalario() > 2500)
//				return func.getSalario() * 0.75;
//			return func.getSalario() * 0.85;
//		}
		
		return func.getCargo().getRegra().calcula(func);
	}
}
