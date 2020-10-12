package __teste__;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.GeradorNotaFiscal;
import app.NotaFiscal;
import app.Pedido;

class NotaFiscalTeste_unitario {

	@Test
	public void deveGerarNFComValorDescontado() {
		GeradorNotaFiscal genNF = new GeradorNotaFiscal();
		Pedido pedido = new Pedido("Brian", 1000, 10);
		
		NotaFiscal nf = genNF.gera(pedido);
		
		assertEquals(1000 * 0.94, nf.getValor());
		
	}

}
