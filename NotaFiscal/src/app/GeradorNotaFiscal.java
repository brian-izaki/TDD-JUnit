package app;

import java.util.Calendar;

// Sessão do livro que fala sobre baixo acoplamento

public class GeradorNotaFiscal {
	public NotaFiscal gera(Pedido pedido) {
		NotaFiscal nf = new NotaFiscal(
				pedido.getCliente(), 
				pedido.getValorTotal() * 0.94, 
				Calendar.getInstance());
		
		new NFDao().persiste(nf);
		
		return nf;
	}
}
