package controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.Iterator;

import DAO.AbastecimentoDAO;
import DAO.AbastecimentoDAOFactory;
import model.Abastecimento;

public class AbastecimentoController {
	private AbastecimentoDAO context;
	
	public AbastecimentoController() throws SQLException {
		this.context = new AbastecimentoDAOFactory().getInstance();
	}
	public void novoAbastecimento(Abastecimento abastecimento) throws Exception {
		this.context.novoAbastecimento(abastecimento);
	}
	public Iterator<Abastecimento> listarAbastecimentos(Date data, int postoId) throws Exception {
		return this.context.listarAbastecimentos(data, postoId);
	}
}
