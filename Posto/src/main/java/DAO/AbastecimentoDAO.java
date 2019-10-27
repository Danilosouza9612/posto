package DAO;

import java.util.Date;
import java.util.Iterator;

import model.Abastecimento;

public interface AbastecimentoDAO {
	public void novoAbastecimento(Abastecimento abastecimento) throws Exception;
	public Iterator<Abastecimento> listarAbastecimentos(Date data, int postoId) throws Exception;
}
