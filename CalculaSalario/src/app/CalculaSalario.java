package app;

// Esta seria uma classe COESA (possui apenas uma responsabilidade).
// essa classe passa a não ter necessidade caso tenha apenas o método calcula.

// caso mativesse os ifs teria q criar testes para cada cargo e add 
// verificações para cada cargo tbm. Desse jeito, apenas é feito verificação nos 
// métodos relacionados com a porcentagem que já estão relacionados com os Cargos,
// Là na classe Funcionario.
public class CalculaSalario {
	
	public CalculaSalario() {};
	
	public double calcula(Funcionario func) {
		// chamado de Complexidade Ciclomática
		// (Muitos caminhos que o método pode tomar, ou seja, muitos ifs).
		
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
