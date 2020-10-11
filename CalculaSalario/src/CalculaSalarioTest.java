import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.CalculaSalario;
import app.Funcionario;
import app.Funcionario.Cargos;

class CalculaSalarioTest {

	private double funcBuilder(String nome, double salario, Cargos cargo) {
		CalculaSalario calculadora = new CalculaSalario();
		Funcionario func = new Funcionario(nome, salario, cargo);
		double salarioComJuros = calculadora.calcula(func);
		
		return salarioComJuros;
	}
	
	@Test
	void VintePorcento() {
		double salario = funcBuilder("Brian", 4000, Cargos.DESENVOLVEDOR);

		// o que espera da execução e a execução
		assertEquals(4000 * 0.8 , salario);
	}
	
	@Test
	void DezPoncento() {
		double salario = funcBuilder("Eva", 1000, Cargos.DESENVOLVEDOR);
		
		assertEquals(1000 * 0.90, salario);
	}
	
	@Test
	void VinteCincoPorcento() {
		double salario = funcBuilder("Elaine", 4000, Cargos.TESTADOR);
		
		assertEquals(4000 * 0.75, salario);
	}
	
	@Test
	void QuinzePorcento() {
		double salario = funcBuilder("Renato", 1000, Cargos.TESTADOR);
		
		assertEquals(1000 * 0.85, salario);
	}

}
