package DAO;

import java.sql.SQLException;

public class AbastecimentoDAOFactory {
	
	private enum Option{
		SQL
	}
	
	public AbastecimentoDAO getInstance() throws SQLException  {
		Option option = Option.SQL;
		switch(option) {
		case SQL:
			return new AbastecimentoSQL();
		default:
			throw new IllegalArgumentException("Opção inválida para DAO");
		}
	}
}
