package DAO;


public class PostoDAOFactory {
	private enum Option{
		SQL
	}
	
	public PostoDAO getInstance()  {
		Option option = Option.SQL;
		switch(option) {
		case SQL:
			return new PostoSQL();
		default:
			throw new IllegalArgumentException("Opção inválida para DAO");
		}
	}
}

