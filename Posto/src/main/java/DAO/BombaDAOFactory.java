package DAO;


public class BombaDAOFactory {
	private enum Option{
		SQL
	}
	
	public BombaDAO getInstance()  {
		Option option = Option.SQL;
		switch(option) {
		case SQL:
			return new BombaSQL();
		default:
			throw new IllegalArgumentException("Opção inválida para DAO");
		}
	}
}
